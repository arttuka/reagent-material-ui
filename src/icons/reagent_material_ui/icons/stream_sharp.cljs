(ns reagent-material-ui.icons.stream-sharp
  "Imports @material-ui/icons/StreamSharp as a Reagent component."
  (:require-macros [reagent-material-ui.util :refer [create-svg-icon e]])
  (:require [react :as react]
            ["@material-ui/core/SvgIcon" :as SvgIcon]
            [reagent-material-ui.util]))

(def stream-sharp (create-svg-icon [(e "circle" #js {"cx" "20", "cy" "12", "r" "2"}) (e "circle" #js {"cx" "4", "cy" "12", "r" "2"}) (e "circle" #js {"cx" "12", "cy" "20", "r" "2"}) (e "path" #js {"d" "m13.943 8.6191 4.4044-4.392 1.4122 1.4162-4.4043 4.392zM8.32 9.68l.31.32 1.42-1.41-4.02-4.04h-.01l-.31-.32-1.42 1.41 4.02 4.05zm7.09 4.26L14 15.35l3.99 4.01.35.35 1.42-1.41-3.99-4.01zm-6.82.01-4.03 4.01-.32.33 1.41 1.41 4.03-4.02.33-.32z"}) (e "circle" #js {"cx" "12", "cy" "4", "r" "2"})]
                                   "StreamSharp"))
