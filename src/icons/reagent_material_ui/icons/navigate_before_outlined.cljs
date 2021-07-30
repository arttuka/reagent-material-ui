(ns reagent-material-ui.icons.navigate-before-outlined
  "Imports @material-ui/icons/NavigateBeforeOutlined as a Reagent component."
  (:require-macros [reagent-material-ui.util :refer [create-svg-icon e]])
  (:require [react :as react]
            ["@material-ui/core/SvgIcon" :as SvgIcon]
            [reagent-material-ui.util]))

(def navigate-before-outlined (create-svg-icon (e "path" #js {"d" "M15.61 7.41 14.2 6l-6 6 6 6 1.41-1.41L11.03 12l4.58-4.59z"})
                                               "NavigateBeforeOutlined"))
