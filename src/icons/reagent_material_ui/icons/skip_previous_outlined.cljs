(ns reagent-material-ui.icons.skip-previous-outlined
  "Imports @material-ui/icons/SkipPreviousOutlined as a Reagent component."
  (:require-macros [reagent-material-ui.util :refer [create-svg-icon e]])
  (:require [react :as react]
            ["@material-ui/core/SvgIcon" :as SvgIcon]
            [reagent-material-ui.util]))

(def skip-previous-outlined (create-svg-icon (e "path" #js {"d" "M6 6h2v12H6zm3.5 6l8.5 6V6l-8.5 6zm6.5 2.14L12.97 12 16 9.86v4.28z"})
                                             "SkipPreviousOutlined"))
