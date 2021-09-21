(ns reagent-mui.icons.library-books-sharp
  "Imports @mui/icons-material/LibraryBooksSharp as a Reagent component."
  (:require-macros [reagent-mui.util :refer [create-svg-icon e]])
  (:require [react :as react]
            ["@mui/material/SvgIcon" :as SvgIcon]
            [reagent-mui.util]))

(def library-books-sharp (create-svg-icon (e "path" #js {"d" "M4 6H2v16h16v-2H4V6zm18-4H6v16h16V2zm-3 9H9V9h10v2zm-4 4H9v-2h6v2zm4-8H9V5h10v2z"})
                                          "LibraryBooksSharp"))
