(ns reagent-mui.icons.shield-moon-two-tone
  "Imports @mui/icons-material/ShieldMoonTwoTone as a Reagent component."
  (:require-macros [reagent-mui.util :refer [create-svg-icon e]])
  (:require [react :as react]
            ["@mui/material/SvgIcon" :as SvgIcon]
            [reagent-mui.util]))

(def shield-moon-two-tone (create-svg-icon [(e "path" #js {"d" "M6 6.39v4.7c0 4 2.55 7.7 6 8.83 3.45-1.13 6-4.82 6-8.83v-4.7l-6-2.25-6 2.25zm6.21 1.22c-.46 1.23-.39 2.64.32 3.86.71 1.22 1.89 1.99 3.18 2.2.34.06.49.47.26.74-1.84 2.17-5.21 2.1-6.96-.07-2.19-2.72-.65-6.72 2.69-7.33.34-.06.63.27.51.6z", "opacity" ".3"}) (e "path" #js {"d" "M12 2 4 5v6.09c0 5.05 3.41 9.76 8 10.91 4.59-1.15 8-5.86 8-10.91V5l-8-3zm6 9.09c0 4-2.55 7.7-6 8.83-3.45-1.13-6-4.82-6-8.83v-4.7l6-2.25 6 2.25v4.7z"}) (e "path" #js {"d" "M9.01 14.33c1.75 2.17 5.12 2.24 6.96.07.23-.27.08-.68-.26-.74-1.29-.21-2.48-.98-3.18-2.2-.71-1.22-.78-2.63-.32-3.86.12-.33-.16-.66-.51-.6-3.34.62-4.89 4.61-2.69 7.33z"})]
                                           "ShieldMoonTwoTone"))
