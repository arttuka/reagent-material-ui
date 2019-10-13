(ns reagent-material-ui.icons.laptop-chromebook-sharp
  "Imports @material-ui/icons/LaptopChromebookSharp as a Reagent component."
  (:require-macros [reagent-material-ui.macro :refer [e]])
  (:require [reagent-material-ui.util :refer [create-svg-icon]]))

(def laptop-chromebook-sharp (create-svg-icon (e "path" #js {"d" "M22 18V3H2v15H0v2h24v-2h-2zm-8 0h-4v-1h4v1zm6-3H4V5h16v10z"})
                                              "LaptopChromebookSharp"))
