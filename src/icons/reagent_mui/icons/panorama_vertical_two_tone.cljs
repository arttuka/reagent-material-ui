(ns reagent-mui.icons.panorama-vertical-two-tone
  "Imports @mui/icons-material/PanoramaVerticalTwoTone as a Reagent component."
  (:require-macros [reagent-mui.util :refer [create-svg-icon e]])
  (:require [react :as react]
            ["@mui/material/SvgIcon" :as SvgIcon]
            [reagent-mui.util]))

(def panorama-vertical-two-tone (create-svg-icon [(e "path" #js {"d" "M6.54 4c.77 2.6 1.16 5.28 1.16 8 0 2.72-.39 5.4-1.16 8h10.91c-.77-2.6-1.16-5.28-1.16-8 0-2.72.39-5.4 1.16-8H6.54z", "opacity" ".3"}) (e "path" #js {"d" "M19.94 21.12c-1.1-2.94-1.64-6.03-1.64-9.12 0-3.09.55-6.18 1.64-9.12.04-.11.06-.22.06-.31 0-.34-.23-.57-.63-.57H4.63c-.4 0-.63.23-.63.57 0 .1.02.2.06.31C5.16 5.82 5.71 8.91 5.71 12c0 3.09-.55 6.18-1.64 9.12-.05.11-.07.22-.07.31 0 .33.23.57.63.57h14.75c.39 0 .63-.24.63-.57-.01-.1-.03-.2-.07-.31zM17.45 20H6.54c.77-2.6 1.16-5.28 1.16-8 0-2.72-.39-5.4-1.16-8h10.91c-.77 2.6-1.16 5.28-1.16 8 0 2.72.39 5.4 1.16 8z"})]
                                                 "PanoramaVerticalTwoTone"))
