(ns reagent-mui.icons.transcribe-two-tone
  "Imports @mui/icons-material/TranscribeTwoTone as a Reagent component."
  (:require-macros [reagent-mui.util :refer [create-svg-icon e]])
  (:require [react :as react]
            ["@mui/material/SvgIcon" :as SvgIcon]
            [reagent-mui.util]))

(def transcribe-two-tone (create-svg-icon [(e "circle" #js {"cx" "9", "cy" "9", "r" "2", "opacity" ".3"}) (e "path" #js {"d" "M14.48 17.34C13.29 16.73 11.37 16 9 16c-2.37 0-4.29.73-5.48 1.34-.32.16-.52.5-.52.88V19h12v-.78c0-.38-.2-.72-.52-.88z", "opacity" ".3"}) (e "path" #js {"d" "M17.93 2c-3.9 3.89-3.91 9.95 0 14l1.63-1.63c-2.77-3.02-2.77-7.56 0-10.74L17.93 2zM9 13c2.21 0 4-1.79 4-4s-1.79-4-4-4-4 1.79-4 4 1.79 4 4 4zm0-6c1.1 0 2 .9 2 2s-.9 2-2 2-2-.9-2-2 .9-2 2-2zm6.39 8.56C13.71 14.7 11.53 14 9 14s-4.71.7-6.39 1.56C1.61 16.07 1 17.1 1 18.22V21h16v-2.78c0-1.12-.61-2.15-1.61-2.66zM15 19H3v-.78c0-.38.2-.72.52-.88C4.71 16.73 6.63 16 9 16c2.37 0 4.29.73 5.48 1.34.32.16.52.5.52.88V19z"}) (e "path" #js {"d" "m22.92 7.06-1.68-1.69c-2.02 2.02-2.02 5.07 0 7.27l1.68-1.69c-.84-1.18-.84-2.71 0-3.89z"})]
                                          "TranscribeTwoTone"))
