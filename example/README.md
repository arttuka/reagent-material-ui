# reagent-material-ui example

Example project demonstrating `arttuka/reagent-material-ui`. Server will run at http://localhost:9500/

### Run with Figwheel Main

#### Using CLJSJS

    lein run:dev

#### Using npm-deps

Uncomment the dependency exclusions in `project.clj` for `arttuka/reagent-material-ui`, then

    npm install
    lein run:npm
    
### Run with shadow-cljs

    npm install
    npx shadow-cljs watch dev
