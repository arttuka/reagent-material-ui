(ns reagent-mui.icons.person-search-rounded
  "Imports @mui/icons-material/PersonSearchRounded as a Reagent component."
  (:require-macros [reagent-mui.util :refer [create-svg-icon e]])
  (:require [react :as react]
            ["@mui/material/SvgIcon" :as SvgIcon]
            [reagent-mui.util]))

(def person-search-rounded (create-svg-icon [(e "circle" #js {"cx" "10", "cy" "8", "r" "4"}) (e "path" #js {"d" "M10.35 14.01C7.62 13.91 2 15.27 2 18v1c0 .55.45 1 1 1h8.54c-2.47-2.76-1.23-5.89-1.19-5.99zm9.08 4.01c.47-.8.7-1.77.48-2.82-.34-1.64-1.72-2.95-3.38-3.16-2.63-.34-4.85 1.87-4.5 4.5.22 1.66 1.52 3.04 3.16 3.38 1.05.22 2.02-.01 2.82-.48l1.86 1.86c.39.39 1.02.39 1.41 0 .39-.39.39-1.02 0-1.41l-1.85-1.87zM16 18c-1.1 0-2-.9-2-2s.9-2 2-2 2 .9 2 2-.9 2-2 2z"})]
                                            "PersonSearchRounded"))
