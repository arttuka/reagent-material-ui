(ns reagent-mui.icons.start-rounded
  "Imports @mui/icons-material/StartRounded as a Reagent component."
  (:require-macros [reagent-mui.util :refer [create-svg-icon e]])
  (:require [react :as react]
            ["@mui/material/SvgIcon" :as SvgIcon]
            [reagent-mui.util]))

(def start-rounded (create-svg-icon (e "path" #js {"d" "M15.29 17.29c.39.39 1.02.39 1.41 0l4.59-4.59c.39-.39.39-1.02 0-1.41L16.7 6.7a.9959.9959 0 0 0-1.41 0c-.38.39-.39 1.03 0 1.42L18.17 11H7c-.55 0-1 .45-1 1s.45 1 1 1h11.17l-2.88 2.88c-.39.39-.39 1.02 0 1.41zM3 18c.55 0 1-.45 1-1V7c0-.55-.45-1-1-1s-1 .45-1 1v10c0 .55.45 1 1 1z"})
                                    "StartRounded"))
