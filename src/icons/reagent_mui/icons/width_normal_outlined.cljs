(ns reagent-mui.icons.width-normal-outlined
  "Imports @mui/icons-material/WidthNormalOutlined as a Reagent component."
  (:require-macros [reagent-mui.util :refer [create-svg-icon e]])
  (:require [react :as react]
            ["@mui/material/SvgIcon" :as SvgIcon]
            [reagent-mui.util]))

(def width-normal-outlined (create-svg-icon (e "path" #js {"d" "M20 4H4c-1.1 0-2 .9-2 2v12c0 1.1.9 2 2 2h16c1.1 0 2-.9 2-2V6c0-1.1-.9-2-2-2zM4 18V6h4v12H4zm6 0V6h4v12h-4zm10 0h-4V6h4v12z"})
                                            "WidthNormalOutlined"))
