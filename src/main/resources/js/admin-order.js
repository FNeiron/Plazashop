$(function(){

  //menu toogle
  const menuItem = $('#navbar .nav-item');
  const mainContent = $('.js_mainContent');

  menuItem.on('click', function(e){
    e.preventDefault();
    menuItem.removeClass('active');
    $(this).addClass('active');
    const target = $(this).find('a').attr('href');
    mainContent.not(target).hide().addClass('d-none');
    $(target).show().removeClass('d-none');
  });

});