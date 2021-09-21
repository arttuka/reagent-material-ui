(ns reagent-mui.icons.subject-two-tone
  "Imports @mui/icons-material/SubjectTwoTone as a Reagent component."
  (:require-macros [reagent-mui.util :refer [create-svg-icon e]])
  (:require [react :as react]
            ["@mui/material/SvgIcon" :as SvgIcon]
            [reagent-mui.util]))

(def subject-two-tone (create-svg-icon (e "path" #js {"d" "M14 17H4v2h10v-2zm6-8H4v2h16V9zM4 15h16v-2H4v2zM4 5v2h16V5H4z"})
                                       "SubjectTwoTone"))
