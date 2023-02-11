(ns reagent-mui.icons.window-two-tone
  "Imports @mui/icons-material/WindowTwoTone as a Reagent component."
  (:require-macros [reagent-mui.util :refer [create-svg-icon e]])
  (:require [react :as react]
            ["@mui/material/SvgIcon" :as SvgIcon]
            [reagent-mui.util]))

(def window-two-tone (create-svg-icon [(e "path" #js {"d" "M13 13h6v6h-6zm-8 0h6v6H5zm0-8h6v6H5zm8 0h6v6h-6z", "opacity" ".3"}) (e "path" #js {"d" "M19 3H5c-1.1 0-2 .9-2 2v14c0 1.1.9 2 2 2h14c1.1 0 2-.9 2-2V5c0-1.1-.9-2-2-2zm-8 16H5v-6h6v6zm0-8H5V5h6v6zm8 8h-6v-6h6v6zm0-8h-6V5h6v6z"})]
                                      "WindowTwoTone"))
