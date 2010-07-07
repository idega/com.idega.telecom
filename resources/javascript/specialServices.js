var $j = jQuery.noConflict();

$j(document).ready(function() {
	$j('input.enableService').click(function() {
		var item = $j(this);
		var name = item.getAttr('name');
		var value = item.val();
		
		TelecomSession.getPhone({
			callback: function(phone) {
				if (name == 'prm_foreign_number_lock') {
					phone.foreignNumberLockEnabled = value;
				}
				else if (name == 'prm_service_number_lock') {
					phone.serviceNumberLockEnabled = value;
				}
				
				TelecomBusiness.updatePhone(phone, {
					callback: function() {
						alert('Saved changes...');
					}
				});
			}
		});
	});
});