(ns reagent-material-ui.icons.stream-sharp
  "Imports @material-ui/icons/StreamSharp as a Reagent component."
  (:require-macros [reagent-material-ui.util :refer [create-svg-icon e]])
  (:require [react :as react]
            ["@material-ui/core/SvgIcon" :as SvgIcon]
            [reagent-material-ui.util]))

(def stream-sharp (create-svg-icon (e react/Fragment nil (e "circle" #js {"cy" "12", "r" "2", "cx" "20"}) (e "circle" #js {"cy" "12", "r" "2", "cx" "4"}) (e "circle" #js {"cy" "20", "r" "2", "cx" "12"}) (e "path" #js {"d" "M13.943 8.6191l4.4044-4.392 1.4122 1.4162-4.4043 4.392zM8.32 9.68l.31.32 1.42-1.41-4.02-4.04h-.01l-.31-.32-1.42 1.41 4.02 4.05zm7.09 4.26L14 15.35l3.99 4.01.35.35 1.42-1.41-3.99-4.01zm-6.82.01l-4.03 4.01-.32.33 1.41 1.41 4.03-4.02.33-.32z"}) (e "circle" #js {"cy" "4", "r" "2", "cx" "12"}))
                                   "StreamSharp"))
