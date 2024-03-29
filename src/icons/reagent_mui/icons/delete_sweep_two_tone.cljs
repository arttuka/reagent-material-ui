(ns reagent-mui.icons.delete-sweep-two-tone
  "Imports @mui/icons-material/DeleteSweepTwoTone as a Reagent component."
  (:require-macros [reagent-mui.util :refer [create-svg-icon e]])
  (:require [react :as react]
            ["@mui/material/SvgIcon" :as SvgIcon]
            [reagent-mui.util]))

(def delete-sweep-two-tone (create-svg-icon [(e "path" #js {"d" "M5 10h6v8H5z", "opacity" ".3"}) (e "path" #js {"d" "M15 16h4v2h-4zm0-8h7v2h-7zm0 4h6v2h-6zM3 18c0 1.1.9 2 2 2h6c1.1 0 2-.9 2-2V8H3v10zm2-8h6v8H5v-8zm5-6H6L5 5H2v2h12V5h-3z"})]
                                            "DeleteSweepTwoTone"))
