(ns reagent-material-ui.icons.pause-outlined
  "Imports @material-ui/icons/PauseOutlined as a Reagent component."
  (:require-macros [reagent-material-ui.macro :refer [e]])
  (:require [reagent-material-ui.util :refer [create-svg-icon]]))

(def pause-outlined (create-svg-icon (e "path" #js {"d" "M6 19h4V5H6v14zm8-14v14h4V5h-4z"})
                                     "PauseOutlined"))
