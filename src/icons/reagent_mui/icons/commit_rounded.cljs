(ns reagent-mui.icons.commit-rounded
  "Imports @mui/icons-material/CommitRounded as a Reagent component."
  (:require-macros [reagent-mui.util :refer [create-svg-icon e]])
  (:require [react :as react]
            ["@mui/material/SvgIcon" :as SvgIcon]
            [reagent-mui.util]))

(def commit-rounded (create-svg-icon (e "path" #js {"d" "M21 13c.55 0 1-.45 1-1s-.45-1-1-1h-4.1c-.46-2.28-2.48-4-4.9-4s-4.44 1.72-4.9 4H3c-.55 0-1 .45-1 1s.45 1 1 1h4.1c.46 2.28 2.48 4 4.9 4s4.44-1.72 4.9-4H21zm-9 2c-1.66 0-3-1.34-3-3s1.34-3 3-3 3 1.34 3 3-1.34 3-3 3z"})
                                     "CommitRounded"))
