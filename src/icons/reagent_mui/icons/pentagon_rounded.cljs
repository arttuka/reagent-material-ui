(ns reagent-mui.icons.pentagon-rounded
  "Imports @mui/icons-material/PentagonRounded as a Reagent component."
  (:require-macros [reagent-mui.util :refer [create-svg-icon e]])
  (:require [react :as react]
            ["@mui/material/SvgIcon" :as SvgIcon]
            [reagent-mui.util]))

(def pentagon-rounded (create-svg-icon (e "path" #js {"d" "m2.47 10.42 3.07 9.22c.28.81 1.04 1.36 1.9 1.36h9.12c.86 0 1.63-.55 1.9-1.37l3.07-9.22c.28-.84-.03-1.76-.75-2.27L13.15 2.8c-.69-.48-1.61-.48-2.29 0L3.22 8.14c-.72.51-1.03 1.44-.75 2.28z"})
                                       "PentagonRounded"))
