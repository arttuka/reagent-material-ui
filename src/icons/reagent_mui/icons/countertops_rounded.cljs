(ns reagent-mui.icons.countertops-rounded
  "Imports @mui/icons-material/CountertopsRounded as a Reagent component."
  (:require-macros [reagent-mui.util :refer [create-svg-icon e]])
  (:require [react :as react]
            ["@mui/material/SvgIcon" :as SvgIcon]
            [reagent-mui.util]))

(def countertops-rounded (create-svg-icon (e "path" #js {"d" "M18 10V7.17c0-1.62-1.22-3.08-2.84-3.17-1.21-.06-2.27.59-2.8 1.57-.35.65.17 1.43.91 1.43h.01c.34 0 .68-.16.84-.46.16-.32.5-.54.88-.54.55 0 1 .45 1 1v3H8c1.1 0 2-.9 2-2V5c0-.55-.45-1-1-1H5c-.55 0-1 .45-1 1v3c0 1.1.9 2 2 2H3c-.55 0-1 .45-1 1s.45 1 1 1h1v7c0 .55.45 1 1 1h14c.55 0 1-.45 1-1v-7h1c.55 0 1-.45 1-1s-.45-1-1-1h-3zm-5 8h-2v-6h2v6z"})
                                          "CountertopsRounded"))
