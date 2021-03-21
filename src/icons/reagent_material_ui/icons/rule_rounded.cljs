(ns reagent-material-ui.icons.rule-rounded
  "Imports @material-ui/icons/RuleRounded as a Reagent component."
  (:require-macros [reagent-material-ui.util :refer [create-svg-icon e]])
  (:require [react :as react]
            ["@material-ui/core/SvgIcon" :as SvgIcon]
            [reagent-material-ui.util]))

(def rule-rounded (create-svg-icon (e "path" #js {"d" "M15.83 10.29l-2.12-2.12a.9959.9959 0 0 1 0-1.41c.39-.39 1.02-.39 1.41 0l1.41 1.41 3.54-3.54c.39-.39 1.02-.39 1.41 0 .39.39.39 1.02 0 1.41l-4.24 4.24c-.39.4-1.02.4-1.41.01zM10 7H3c-.55 0-1 .45-1 1s.45 1 1 1h7c.55 0 1-.45 1-1s-.45-1-1-1zm10.29 5.71a.9959.9959 0 0 0-1.41 0L17 14.59l-1.88-1.88a.9959.9959 0 0 0-1.41 0c-.39.39-.39 1.02 0 1.41L15.59 16l-1.88 1.88c-.39.39-.39 1.02 0 1.41.39.39 1.02.39 1.41 0L17 17.41l1.88 1.88c.39.39 1.02.39 1.41 0 .39-.39.39-1.02 0-1.41L18.41 16l1.88-1.88c.39-.39.39-1.02 0-1.41zM10 15H3c-.55 0-1 .45-1 1s.45 1 1 1h7c.55 0 1-.45 1-1s-.45-1-1-1z"})
                                   "RuleRounded"))
