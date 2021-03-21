(ns reagent-material-ui.icons.grading-rounded
  "Imports @material-ui/icons/GradingRounded as a Reagent component."
  (:require-macros [reagent-material-ui.util :refer [create-svg-icon e]])
  (:require [react :as react]
            ["@material-ui/core/SvgIcon" :as SvgIcon]
            [reagent-material-ui.util]))

(def grading-rounded (create-svg-icon (e "path" #js {"d" "M4 7h16c.55 0 1 .45 1 1s-.45 1-1 1H4c-.55 0-1-.45-1-1s.45-1 1-1zm0 6h16c.55 0 1-.45 1-1s-.45-1-1-1H4c-.55 0-1 .45-1 1s.45 1 1 1zm0 4h7c.55 0 1-.45 1-1s-.45-1-1-1H4c-.55 0-1 .45-1 1s.45 1 1 1zm0 4h7c.55 0 1-.45 1-1s-.45-1-1-1H4c-.55 0-1 .45-1 1s.45 1 1 1zm12.41-2.83l-.71-.71a.9959.9959 0 0 0-1.41 0c-.39.39-.39 1.02 0 1.41l1.42 1.43c.39.39 1.02.39 1.41 0l3.18-3.17c.39-.39.39-1.02 0-1.41l-.01-.01a.9959.9959 0 0 0-1.41 0l-2.47 2.46zM3 4c0 .56.45 1 1 1h16c.55 0 1-.45 1-1s-.45-1-1-1H4c-.55 0-1 .45-1 1z"})
                                      "GradingRounded"))
