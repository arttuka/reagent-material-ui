(ns reagent-mui.icons.monitor-rounded
  "Imports @mui/icons-material/MonitorRounded as a Reagent component."
  (:require-macros [reagent-mui.util :refer [create-svg-icon e]])
  (:require [react :as react]
            ["@mui/material/SvgIcon" :as SvgIcon]
            [reagent-mui.util]))

(def monitor-rounded (create-svg-icon (e "path" #js {"d" "M20 3H4c-1.1 0-2 .9-2 2v11c0 1.1.9 2 2 2h3c-.55.55-1 .87-1 1.59 0 .78.63 1.41 1.41 1.41h9.17c.78 0 1.41-.63 1.41-1.41 0-.72-.44-1.03-1-1.59h3c1.1 0 2-.9 2-2V5C22 3.9 21.1 3 20 3zm0 13H4V5h16v11z"})
                                      "MonitorRounded"))
