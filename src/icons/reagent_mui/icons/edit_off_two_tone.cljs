(ns reagent-mui.icons.edit-off-two-tone
  "Imports @mui/icons-material/EditOffTwoTone as a Reagent component."
  (:require-macros [reagent-mui.util :refer [create-svg-icon e]])
  (:require [react :as react]
            ["@mui/material/SvgIcon" :as SvgIcon]
            [reagent-mui.util]))

(def edit-off-two-tone (create-svg-icon [(e "path" #js {"d" "M5 18.08V19h.92l5.12-5.12-.92-.92L5 18.08zm9.06-9.06-1.11 1.11.92.92 1.11-1.11-.92-.92z", "opacity" ".3"}) (e "path" #js {"d" "m14.06 9.02.92.92-1.11 1.11 1.41 1.41 2.52-2.52-3.75-3.75-2.52 2.52 1.41 1.41 1.12-1.1zm6.65-1.98c.39-.39.39-1.02 0-1.41l-2.34-2.34c-.2-.2-.45-.29-.71-.29s-.51.1-.7.29l-1.83 1.83 3.75 3.75 1.83-1.83zM2.81 2.81 1.39 4.22l7.32 7.32L3 17.25V21h3.75l5.71-5.71 7.32 7.32 1.41-1.41L2.81 2.81zM5.92 19H5v-.92l5.13-5.13.92.92L5.92 19z"})]
                                        "EditOffTwoTone"))
