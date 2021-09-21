(ns reagent-mui.icons.web-asset-two-tone
  "Imports @mui/icons-material/WebAssetTwoTone as a Reagent component."
  (:require-macros [reagent-mui.util :refer [create-svg-icon e]])
  (:require [react :as react]
            ["@mui/material/SvgIcon" :as SvgIcon]
            [reagent-mui.util]))

(def web-asset-two-tone (create-svg-icon [(e "path" #js {"d" "M5 8h14v10H5z", "opacity" ".3"}) (e "path" #js {"d" "M19 4H5c-1.11 0-2 .9-2 2v12c0 1.1.89 2 2 2h14c1.1 0 2-.9 2-2V6c0-1.1-.89-2-2-2zm0 14H5V8h14v10z"})]
                                         "WebAssetTwoTone"))
