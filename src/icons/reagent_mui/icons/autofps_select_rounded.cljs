(ns reagent-mui.icons.autofps-select-rounded
  "Imports @mui/icons-material/AutofpsSelectRounded as a Reagent component."
  (:require-macros [reagent-mui.util :refer [create-svg-icon e]])
  (:require [react :as react]
            ["@mui/material/SvgIcon" :as SvgIcon]
            [reagent-mui.util]))

(def autofps-select-rounded (create-svg-icon [(e "path" #js {"d" "M12.03 6.3h-.06l-1.02 2.89h2.1z"}) (e "path" #js {"d" "M4 22c.55 0 1-.45 1-1v-3c0-.55-.45-1-1-1s-1 .45-1 1v3c0 .55.45 1 1 1zm8-7c3.31 0 6-2.69 6-6s-2.69-6-6-6-6 2.69-6 6 2.69 6 6 6zm0-10c.38 0 .71.23.85.59l2.12 5.65c.14.37-.13.76-.53.76-.24 0-.45-.15-.53-.38l-.49-1.41h-2.83l-.5 1.41c-.08.23-.29.38-.53.38-.39 0-.67-.39-.53-.76l2.12-5.65c.14-.36.47-.59.85-.59zM8 22c.55 0 1-.45 1-1v-3c0-.55-.45-1-1-1s-1 .45-1 1v3c0 .55.45 1 1 1zm4 0c.55 0 1-.45 1-1v-3c0-.55-.45-1-1-1s-1 .45-1 1v3c0 .55.45 1 1 1zm3-4v3c0 .55.45 1 1 1h4c.55 0 1-.45 1-1v-3c0-.55-.45-1-1-1h-4c-.55 0-1 .45-1 1z"})]
                                             "AutofpsSelectRounded"))
