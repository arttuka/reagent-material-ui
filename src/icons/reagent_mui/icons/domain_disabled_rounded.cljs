(ns reagent-mui.icons.domain-disabled-rounded
  "Imports @mui/icons-material/DomainDisabledRounded as a Reagent component."
  (:require-macros [reagent-mui.util :refer [create-svg-icon e]])
  (:require [react :as react]
            ["@mui/material/SvgIcon" :as SvgIcon]
            [reagent-mui.util]))

(def domain-disabled-rounded (create-svg-icon (e "path" #js {"d" "M.71 2.39c-.39.39-.39 1.02 0 1.41L2 5.1V19c0 1.1.9 2 2 2h13.9l2.29 2.29c.39.39 1.02.39 1.41 0 .39-.39.39-1.02 0-1.41L2.12 2.39a.9959.9959 0 0 0-1.41 0zM6 19H4v-2h2v2zm0-4H4v-2h2v2zm-2-4V9h2v2H4zm6 8H8v-2h2v2zm-2-4v-2h2v2H8zm4 4v-2h1.9l2 2H12zM8 5h2v2h-.45L12 9.45V9h7c.55 0 1 .45 1 1v7.45l2 2V9c0-1.1-.9-2-2-2h-8V5c0-1.1-.9-2-2-2H5.55L8 5.45V5zm8 6h2v2h-2z"})
                                              "DomainDisabledRounded"))
