(ns reagent-material-ui.icons.blur-circular-two-tone
  "Imports @material-ui/icons/BlurCircularTwoTone as a Reagent component."
  (:require-macros [reagent-material-ui.macro :refer [e]])
  (:require [react :as react]
            [reagent-material-ui.util :refer [create-svg-icon]]))

(def blur-circular-two-tone (create-svg-icon (e react/Fragment nil (e "path" #js {"d" "M14 7.5c.28 0 .5-.22.5-.5s-.22-.5-.5-.5-.5.22-.5.5.22.5.5.5z"}) (e "circle" #js {"cy" "10", "r" "1", "cx" "14"}) (e "circle" #js {"cy" "14", "r" "1", "cx" "14"}) (e "path" #js {"d" "M10 16.5c-.28 0-.5.22-.5.5s.22.5.5.5.5-.22.5-.5-.22-.5-.5-.5z"}) (e "circle" #js {"cy" "10", "r" "1", "cx" "10"}) (e "path" #js {"d" "M7 13.5c-.28 0-.5.22-.5.5s.22.5.5.5.5-.22.5-.5-.22-.5-.5-.5zM12 2C6.48 2 2 6.48 2 12s4.48 10 10 10 10-4.48 10-10S17.52 2 12 2zm0 18c-4.42 0-8-3.58-8-8s3.58-8 8-8 8 3.58 8 8-3.58 8-8 8zM7 9.5c-.28 0-.5.22-.5.5s.22.5.5.5.5-.22.5-.5-.22-.5-.5-.5z"}) (e "circle" #js {"cy" "14", "r" "1", "cx" "10"}) (e "path" #js {"d" "M10 7.5c.28 0 .5-.22.5-.5s-.22-.5-.5-.5-.5.22-.5.5.22.5.5.5zm4 9c-.28 0-.5.22-.5.5s.22.5.5.5.5-.22.5-.5-.22-.5-.5-.5zm3-7c-.28 0-.5.22-.5.5s.22.5.5.5.5-.22.5-.5-.22-.5-.5-.5zm0 4c-.28 0-.5.22-.5.5s.22.5.5.5.5-.22.5-.5-.22-.5-.5-.5z"}))
                                             "BlurCircularTwoTone"))
