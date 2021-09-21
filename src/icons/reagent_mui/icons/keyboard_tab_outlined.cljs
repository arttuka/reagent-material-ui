(ns reagent-mui.icons.keyboard-tab-outlined
  "Imports @mui/icons-material/KeyboardTabOutlined as a Reagent component."
  (:require-macros [reagent-mui.util :refer [create-svg-icon e]])
  (:require [react :as react]
            ["@mui/material/SvgIcon" :as SvgIcon]
            [reagent-mui.util]))

(def keyboard-tab-outlined (create-svg-icon (e "path" #js {"d" "M11.59 7.41 15.17 11H1v2h14.17l-3.59 3.59L13 18l6-6-6-6-1.41 1.41zM20 6v12h2V6h-2z"})
                                            "KeyboardTabOutlined"))
