(ns reagent-mui.icons.commit
  "Imports @mui/icons-material/Commit as a Reagent component."
  (:require-macros [reagent-mui.util :refer [create-svg-icon e]])
  (:require [react :as react]
            ["@mui/material/SvgIcon" :as SvgIcon]
            [reagent-mui.util]))

(def commit (create-svg-icon (e "path" #js {"d" "M16.9 11c-.46-2.28-2.48-4-4.9-4s-4.44 1.72-4.9 4H2v2h5.1c.46 2.28 2.48 4 4.9 4s4.44-1.72 4.9-4H22v-2h-5.1zM12 15c-1.66 0-3-1.34-3-3s1.34-3 3-3 3 1.34 3 3-1.34 3-3 3z"})
                             "Commit"))
