(ns reagent-material-ui.icons.view-compact-outlined
  "Imports @material-ui/icons/ViewCompactOutlined as a Reagent component."
  (:require-macros [reagent-material-ui.util :refer [create-svg-icon e]])
  (:require [react :as react]
            ["@material-ui/core/SvgIcon" :as SvgIcon]
            [reagent-material-ui.util]))

(def view-compact-outlined (create-svg-icon (e "path" #js {"d" "M3 5v14h19V5H3zm2 2h15v4H5V7zm0 10v-4h4v4H5zm6 0v-4h9v4h-9z"})
                                            "ViewCompactOutlined"))
