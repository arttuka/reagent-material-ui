(ns reagent-material-ui.icons.ondemand-video-outlined
  "Imports @material-ui/icons/OndemandVideoOutlined as a Reagent component."
  (:require-macros [reagent-material-ui.macro :refer [e]])
  (:require [reagent-material-ui.util :refer [create-svg-icon]]))

(def ondemand-video-outlined (create-svg-icon (e "path" #js {"d" "M9 7v8l7-4zm12-4H3c-1.1 0-2 .9-2 2v12c0 1.1.9 2 2 2h5v2h8v-2h5c1.1 0 2-.9 2-2V5c0-1.1-.9-2-2-2zm0 14H3V5h18v12z"})
                                              "OndemandVideoOutlined"))
