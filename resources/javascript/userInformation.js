var $j = jQuery.noConflict();

$j(document).ready(function() {
	$j('div.buttonLayer a').click(function(event) {
		$j(this).parents('form.userInformation').submit();
		event.preventDefault();
	});
});