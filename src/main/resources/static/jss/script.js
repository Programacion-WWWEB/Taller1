const paginaPrincipalButton = document.getElementById('paginaPrincipalButton');
const proyectoButton = document.getElementById('proyectoButton');
const integrantesButton = document.getElementById('integrantesButton');
const desarrolloButton = document.getElementById('desarrolloButton');
const contentContainer = document.getElementById('contentContainer'); // This is where the content will be displayed
const contactoButton = document.getElementById('contactoButton');

contactoButton.addEventListener('click', () => {
     loadContent('/contacto');

} )
paginaPrincipalButton.addEventListener('click', () => {
    loadContent('/paginaPrincipal');
});

proyectoButton.addEventListener('click', () => {
    loadContent('/proyecto');
});

integrantesButton.addEventListener('click', () => {
    loadContent('/integrantes');
});

desarrolloButton.addEventListener('click', () => {
    loadContent('/desarrollo');
});

// Function to load content dynamically
function loadContent(url) {
    fetch(url)
        .then(response => response.text())
        .then(data => {
            contentContainer.innerHTML = data;
        })
        .catch(error => {
            console.error('Error loading content:', error);
        });
}
