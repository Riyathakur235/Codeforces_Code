const container = document.getElementById("recipeContainer");
const searchInput = document.getElementById("searchInput");
const modal = document.getElementById("modal");
const modalData = document.getElementById("modalData");
const closeBtn = document.getElementById("closeBtn");

let recipesData = [];

// Fetch API
async function fetchRecipes() {
    const response = await fetch("https://dummyjson.com/recipes");
    const data = await response.json();
    recipesData = data.recipes;
    displayRecipes(recipesData);
}

function displayRecipes(recipes) {
    container.innerHTML = "";
    recipes.forEach(recipe => {
        const card = document.createElement("div");
        card.classList.add("card");

        card.innerHTML = `
            <img src="${recipe.image}" />
            <h3>${recipe.name}</h3>
            <p>Cuisine: ${recipe.cuisine}</p>
            <p>⭐ ${recipe.rating}</p>
        `;

        card.addEventListener("click", () => showDetails(recipe));
        container.appendChild(card);
    });
}

function showDetails(recipe) {
    modal.style.display = "block";
    modalData.innerHTML = `
        <h2>${recipe.name}</h2>
        <img src="${recipe.image}" width="300"/>
        <p><b>Ingredients:</b> ${recipe.ingredients.join(", ")}</p>
        <p><b>Instructions:</b> ${recipe.instructions.join(" ")}</p>
    `;
}

closeBtn.onclick = () => modal.style.display = "none";

// Search Function
searchInput.addEventListener("input", () => {
    const value = searchInput.value.toLowerCase();
    const filtered = recipesData.filter(recipe =>
        recipe.name.toLowerCase().includes(value)
    );
    displayRecipes(filtered);
});

fetchRecipes();
