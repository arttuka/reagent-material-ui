(ns reagent-mui.icons.window-outlined
  "Imports @mui/icons-material/WindowOutlined as a Reagent component."
  (:require-macros [reagent-mui.util :refer [create-svg-icon e]])
  (:require [react :as react]
            ["@mui/material/SvgIcon" :as SvgIcon]
            [reagent-mui.util]))

(def window-outlined (create-svg-icon (e "path" #js {"d" "M19 3H5c-1.1 0-2 .9-2 2v14c0 1.1.9 2 2 2h14c1.1 0 2-.9 2-2V5c0-1.1-.9-2-2-2zm0 8h-6V5h6v6zm-8-6v6H5V5h6zm-6 8h6v6H5v-6zm8 6v-6h6v6h-6z"})
                                      "WindowOutlined"))
