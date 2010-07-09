var $j = jQuery.noConflict();

$j(document).ready(function() {
	$j('div.submit a').click(function(event) {
		$j(this).parents('form.telecomBalanceViewer').submit();
		event.preventDefault();
	});
	
	$j('span.expander').toggle(
		function() {
			$j(this).addClass('open').siblings('.subEntries:first').show();
		},
		function() {
			$j(this).removeClass('open').siblings('.subEntries:first').hide();
		}
	);	
});