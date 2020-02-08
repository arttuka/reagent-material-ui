(ns reagent-material-ui.icons.subdirectory-arrow-right-outlined
  "Imports @material-ui/icons/SubdirectoryArrowRightOutlined as a Reagent component."
  (:require-macros [reagent-material-ui.macro :refer [e]])
  (:require [reagent-material-ui.util :refer [create-svg-icon]]))

(def subdirectory-arrow-right-outlined (create-svg-icon (e (.-Fragment js/React) nil (e "path" #js {"d" "M24 24H0V0h24v24z", "fill" "none", "opacity" ".87"}) (e "path" #js {"d" "M19 15l-6 6-1.42-1.42L15.17 16H4V4h2v10h9.17l-3.59-3.58L13 9l6 6z"}))
                                                        "SubdirectoryArrowRightOutlined"))