(ns reagent-material-ui.icons.flash-on-outlined
  "Imports @material-ui/icons/FlashOnOutlined as a Reagent component."
  (:require-macros [reagent-material-ui.util :refer [create-svg-icon e]])
  (:require [react :as react]
            ["@material-ui/core/SvgIcon" :as SvgIcon]
            [reagent-material-ui.util]))

(def flash-on-outlined (create-svg-icon (e "path" #js {"d" "M7 2v11h3v9l7-12h-4l3-8z"})
                                        "FlashOnOutlined"))
