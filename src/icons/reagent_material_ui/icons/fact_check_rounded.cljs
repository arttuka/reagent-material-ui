(ns reagent-material-ui.icons.fact-check-rounded
  "Imports @material-ui/icons/FactCheckRounded as a Reagent component."
  (:require-macros [reagent-material-ui.util :refer [create-svg-icon e]])
  (:require [react :as react]
            ["@material-ui/core/SvgIcon" :as SvgIcon]
            [reagent-material-ui.util]))

(def fact-check-rounded (create-svg-icon (e "path" #js {"fillRule" "evenodd", "d" "M20 3H4c-1.1 0-2 .9-2 2v14c0 1.1.9 2 2 2h16c1.1 0 2-.9 2-2V5c0-1.1-.9-2-2-2zM9 17H6c-.55 0-1-.45-1-1s.45-1 1-1h3c.55 0 1 .45 1 1s-.45 1-1 1zm0-4H6c-.55 0-1-.45-1-1s.45-1 1-1h3c.55 0 1 .45 1 1s-.45 1-1 1zm0-4H6c-.55 0-1-.45-1-1s.45-1 1-1h3c.55 0 1 .45 1 1s-.45 1-1 1zm9.7 2.12-3.17 3.17c-.39.39-1.03.39-1.42 0l-1.41-1.42a.9959.9959 0 0 1 0-1.41c.39-.39 1.02-.39 1.41 0l.71.71 2.47-2.47c.39-.39 1.02-.39 1.41 0l.01.01c.38.39.38 1.03-.01 1.41z"})
                                         "FactCheckRounded"))
