(ns reagent-material-ui.icons.text-rotation-down-outlined
  "Imports @material-ui/icons/TextRotationDownOutlined as a Reagent component."
  (:require-macros [reagent-material-ui.macro :refer [e]])
  (:require [reagent-material-ui.util :refer [create-svg-icon]]))

(def text-rotation-down-outlined (create-svg-icon (e (.-Fragment js/React) nil (e "path" #js {"d" "m0 0h24v24H0V0z", "fill" "none"}) (e "path" #js {"d" "M6 20l3-3H7V4H5v13H3l3 3zm6.2-11.5v5l-2.2.9v2.1l11-4.75v-1.5L10 5.5v2.1l2.2.9zm6.82 2.5L14 12.87V9.13L19.02 11z"}))
                                                  "TextRotationDownOutlined"))
