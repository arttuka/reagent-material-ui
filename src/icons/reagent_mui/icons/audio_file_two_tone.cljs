(ns reagent-mui.icons.audio-file-two-tone
  "Imports @mui/icons-material/AudioFileTwoTone as a Reagent component."
  (:require-macros [reagent-mui.util :refer [create-svg-icon e]])
  (:require [react :as react]
            ["@mui/material/SvgIcon" :as SvgIcon]
            [reagent-mui.util]))

(def audio-file-two-tone (create-svg-icon [(e "path" #js {"d" "M13 4H6v16h12V9h-5V4zm3 7v2h-3v3.75c0 1.24-1.01 2.25-2.25 2.25S8.5 17.99 8.5 16.75s1.01-2.25 2.25-2.25c.46 0 .89.14 1.25.38V11h4z", "opacity" ".3"}) (e "path" #js {"d" "M14 2H6c-1.1 0-2 .9-2 2v16c0 1.1.9 2 2 2h12c1.1 0 2-.9 2-2V8l-6-6zm4 18H6V4h7v5h5v11z"}) (e "path" #js {"d" "M12 14.88c-.36-.24-.79-.38-1.25-.38-1.24 0-2.25 1.01-2.25 2.25S9.51 19 10.75 19 13 17.99 13 16.75V13h3v-2h-4v3.88z"})]
                                          "AudioFileTwoTone"))
