const scalaVersion = require("./scala-version");
const { addDynamicIconSelectors } = require("@iconify/tailwind");

module.exports = (api) => {
  const scalajsMode = api.env === "production" ? "opt" : "fastopt";
  return {
    content: [
      `./modules/frontend/target/scala-${scalaVersion}/frontend-${scalajsMode}/*.js`,
      "./index.html",
    ],
    plugins: [
      require("@tailwindcss/typography"),
      addDynamicIconSelectors(),
      require("daisyui"),
    ],
    theme: {
      extend: {
        fontFamily: {
          Roboto: ["Roboto"],
        },
      },
    },
  };
};

// /** @type {import('tailwindcss').Config} */
// module.exports = {
//   theme: {
//     // ...
//   },
//   content: ["./index.html"],
//   plugins: [
//     require("@tailwindcss/typography"),
//     // ...
//   ],
// };
