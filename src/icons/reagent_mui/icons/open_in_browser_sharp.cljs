(ns reagent-mui.icons.open-in-browser-sharp
  "Imports @mui/icons-material/OpenInBrowserSharp as a Reagent component."
  (:require-macros [reagent-mui.util :refer [create-svg-icon e]])
  (:require [react :as react]
            ["@mui/material/SvgIcon" :as SvgIcon]
            [reagent-mui.util]))

(def open-in-browser-sharp (create-svg-icon (e "path" #js {"d" "M3 4v16h6v-2H5V8h14v10h-4v2h6V4H3zm9 6-4 4h3v6h2v-6h3l-4-4z"})
                                            "OpenInBrowserSharp"))
