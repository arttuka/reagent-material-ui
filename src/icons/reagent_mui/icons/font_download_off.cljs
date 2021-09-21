(ns reagent-mui.icons.font-download-off
  "Imports @mui/icons-material/FontDownloadOff as a Reagent component."
  (:require-macros [reagent-mui.util :refer [create-svg-icon e]])
  (:require [react :as react]
            ["@mui/material/SvgIcon" :as SvgIcon]
            [reagent-mui.util]))

(def font-download-off (create-svg-icon (e "path" #js {"d" "m12.58 9.75-.87-.87.23-.66h.1l.54 1.53zm-2.23-2.23L10.92 6h2.14l2.55 6.79L22 19.17V4c0-1.1-.9-2-2-2H4.83l5.52 5.52zm10.14 15.79L19.17 22H4c-1.1 0-2-.9-2-2V4.83L.69 3.51 2.1 2.1l19.8 19.8-1.41 1.41zm-8.39-8.38-3.3-3.3L6.41 18h2.08l1.09-3.07h2.52z"})
                                        "FontDownloadOff"))
