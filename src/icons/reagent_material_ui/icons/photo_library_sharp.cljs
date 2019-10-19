(ns reagent-material-ui.icons.photo-library-sharp
  "Imports @material-ui/icons/PhotoLibrarySharp as a Reagent component."
  (:require-macros [reagent-material-ui.macro :refer [e]])
  (:require [reagent-material-ui.util :refer [create-svg-icon]]))

(def photo-library-sharp (create-svg-icon (e "path" #js {"d" "M22 18V2H6v16h16zm-11-6l2.03 2.71L16 11l4 5H8l3-4zM2 6v16h16v-2H4V6H2z"})
                                          "PhotoLibrarySharp"))
