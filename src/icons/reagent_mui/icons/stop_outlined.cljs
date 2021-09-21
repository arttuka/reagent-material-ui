(ns reagent-mui.icons.stop-outlined
  "Imports @mui/icons-material/StopOutlined as a Reagent component."
  (:require-macros [reagent-mui.util :refer [create-svg-icon e]])
  (:require [react :as react]
            ["@mui/material/SvgIcon" :as SvgIcon]
            [reagent-mui.util]))

(def stop-outlined (create-svg-icon (e "path" #js {"d" "M16 8v8H8V8h8m2-2H6v12h12V6z"})
                                    "StopOutlined"))
