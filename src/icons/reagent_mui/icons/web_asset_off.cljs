(ns reagent-mui.icons.web-asset-off
  "Imports @mui/icons-material/WebAssetOff as a Reagent component."
  (:require-macros [reagent-mui.util :refer [create-svg-icon e]])
  (:require [react :as react]
            ["@mui/material/SvgIcon" :as SvgIcon]
            [reagent-mui.util]))

(def web-asset-off (create-svg-icon (e "path" #js {"d" "M6.83 4H20c1.11 0 2 .9 2 2v12c0 .34-.09.66-.23.94L20 17.17V8h-9.17l-4-4zm13.66 19.31L17.17 20H4c-1.11 0-2-.9-2-2V6c0-.34.08-.66.23-.94L.69 3.51 2.1 2.1l19.8 19.8-1.41 1.41zM15.17 18l-10-10H4v10h11.17z"})
                                    "WebAssetOff"))
