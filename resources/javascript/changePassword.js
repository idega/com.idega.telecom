var $j = jQuery.noConflict();

$j(document).ready(function() {
	$j('div.submit a').click(function(event) {
		$j(this).parents('form.changePassword').submit();
		event.preventDefault();
	});
});