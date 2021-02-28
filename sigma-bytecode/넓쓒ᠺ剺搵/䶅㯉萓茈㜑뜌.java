public class \ub113\uc4d2\u183a\u527a\u6435.\u4d85\u3bc9\u8413\u8308\u3711\ub70c {
    public void \u4d85\u3bc9\u8413\u8308\u3711\ub70c(\ubcb0\ud12e\u51fa\u8aa5\u0c95.\u67e9\u4daf\u760c\ud217\ua6bd\ubff1 p0) {
        if (cmpne:boolean(ldc:int(15), ldc:int(0))) {
        }
        
        Label_0006:
        
        if (cmpne:boolean(ldc:int(14), ldc:int(0))) {
            if (cmpeq:boolean(ldc:int(2), ldc:int(0))) {
                loop {
                    invokevirtual:void(PrintStream::println, getstatic:PrintStream(System::out), ldc:String("#0"))
                    
                    if (cmpne:boolean(ldc:int(2), ldc:int(0))) {
                        loop {
                            Label_0028:
                            invokevirtual:void(PrintStream::println, getstatic:PrintStream(System::out), ldc:String("#1"))
                            
                            if (cmpne:boolean(ldc:int(2), ldc:int(0))) {
                                do {
                                    invokevirtual:void(PrintStream::println, getstatic:PrintStream(System::out), ldc:String("#2"))
                                } while (cmpeq:boolean(ldc:int(2), ldc:int(0)))
                                
                                do {
                                    invokevirtual:void(PrintStream::println, getstatic:PrintStream(System::out), ldc:String("#3"))
                                    
                                    if (cmpeq:boolean(ldc:int(2), ldc:int(0))) {
                                        loopcontinue(Label_0028)
                                    }
                                    
                                    do {
                                        invokevirtual:void(PrintStream::println, getstatic:PrintStream(System::out), ldc:String("#4"))
                                    } while (cmpeq:boolean(ldc:int(2), ldc:int(0)))
                                    
                                    invokevirtual:void(PrintStream::println, getstatic:PrintStream(System::out), ldc:String("#5"))
                                } while (cmpeq:boolean(ldc:int(2), ldc:int(0)))
                                
                                looporswitchbreak(Label_0088)
                            }
                            
                            looporswitchbreak()
                        }
                    }
                }
            }
            
            Label_0088:
            invokespecial:Object(Object::<init>, this:\u4d85\u3bc9\u8413\u8308\u3711\ub70c)
            putfield:Map<\u3d4b\u9937\u7af6\u7af6\u6198\uae87, Map<String, \ud7e8\u7e3f\u4cd9\u5f50\u6bb9\u6ec6>>(\u4d85\u3bc9\u8413\u8308\u3711\ub70c::\u7873\ud158\ua6bd\ub32d\u8d90\u7c6b, this:\u4d85\u3bc9\u8413\u8308\u3711\ub70c, invokestatic:IdentityHashMap[expected:Map<\u3d4b\u9937\u7af6\u7af6\u6198\uae87, Map<String, \ud7e8\u7e3f\u4cd9\u5f50\u6bb9\u6ec6>>](Maps::newIdentityHashMap))
            putfield:Map<\u3d4b\u9937\u7af6\u7af6\u6198\uae87, Map<String, \ud7e8\u7e3f\u4cd9\u5f50\u6bb9\u6ec6>>(\u4d85\u3bc9\u8413\u8308\u3711\ub70c::\u8308\u3d64\u59ec\ub171\ud217\u760c, this:\u4d85\u3bc9\u8413\u8308\u3711\ub70c, invokestatic:IdentityHashMap[expected:Map<\u3d4b\u9937\u7af6\u7af6\u6198\uae87, Map<String, \ud7e8\u7e3f\u4cd9\u5f50\u6bb9\u6ec6>>](Maps::newIdentityHashMap))
            putfield:Map<\u3d4b\u9937\u7af6\u7af6\u6198\uae87, Map<String, Boolean>>(\u4d85\u3bc9\u8413\u8308\u3711\ub70c::\u12cb\ud523\u873d\u92ee\ubff1\u4c2b, this:\u4d85\u3bc9\u8413\u8308\u3711\ub70c, invokestatic:IdentityHashMap[expected:Map<\u3d4b\u9937\u7af6\u7af6\u6198\uae87, Map<String, Boolean>>](Maps::newIdentityHashMap))
            putfield:\u67e9\u4daf\u760c\ud217\ua6bd\ubff1(\u4d85\u3bc9\u8413\u8308\u3711\ub70c::\u40a9\u98a4\u8d90\ud36e\u8413\u0800, this:\u4d85\u3bc9\u8413\u8308\u3711\ub70c, p0:\u67e9\u4daf\u760c\ud217\ua6bd\ubff1)
            return:void()
        }
        
        goto(Label_0006)
    }
    
    public void \u4daf\u7af6\u8350\u8709\ubb2b\u4e72(\u51fa\u12cb\u7330\u74b1\u6c52.\u76bc\u4975\ua6bd\u4daf\u8d98.\uafe7\uc7fe\u4c04\u6b5f\u5bc4 p0, \u927d\u92ff\u71ae\uafe7\u6bb9.\u12cb\u12b2\ua3b4\u183a\ud158\u51fa p1, double p2, double p3, double p4) {
        var_9_260 : int
        var_11_6D : \u836c\u8cae\ub18d\u836c\u8753\u59ec
        var_13_7F : \u3d4b\u9937\u7af6\u7af6\u6198\uae87
        var_14_99 : \u6b0d\ud171\uc7fe\u52d3\uafe7\u6c56
        var_15_A4 : \u6b0d\uf9c5\ucfaf\ud36e\ub102
        var_16_107 : Object
        var_17_133 : \ud7e8\u7e3f\u4cd9\u5f50\u6bb9\u6ec6
        var_17_201 : Entry
        var_18_20D : String
        var_19_219 : \ud7e8\u7e3f\u4cd9\u5f50\u6bb9\u6ec6
        var_20_233 : Boolean
        
        if (cmpne:boolean(ldc:int(15), ldc:int(0))) {
        }
        
        Label_0006:
        
        if (cmpeq:boolean(ldc:int(14), ldc:int(0))) {
            goto(Label_0006)
        }
        
        if (cmpeq:boolean(ldc:int(2), ldc:int(0))) {
            loop {
                invokevirtual:void(PrintStream::println, getstatic:PrintStream(System::out), ldc:String("#0"))
                
                if (cmpne:boolean(ldc:int(2), ldc:int(0))) {
                    loop {
                        Label_0028:
                        invokevirtual:void(PrintStream::println, getstatic:PrintStream(System::out), ldc:String("#1"))
                        
                        if (cmpne:boolean(ldc:int(2), ldc:int(0))) {
                            do {
                                invokevirtual:void(PrintStream::println, getstatic:PrintStream(System::out), ldc:String("#2"))
                            } while (cmpeq:boolean(ldc:int(2), ldc:int(0)))
                            
                            do {
                                invokevirtual:void(PrintStream::println, getstatic:PrintStream(System::out), ldc:String("#3"))
                                
                                if (cmpeq:boolean(ldc:int(2), ldc:int(0))) {
                                    loopcontinue(Label_0028)
                                }
                                
                                do {
                                    invokevirtual:void(PrintStream::println, getstatic:PrintStream(System::out), ldc:String("#4"))
                                } while (cmpeq:boolean(ldc:int(2), ldc:int(0)))
                                
                                invokevirtual:void(PrintStream::println, getstatic:PrintStream(System::out), ldc:String("#5"))
                            } while (cmpeq:boolean(ldc:int(2), ldc:int(0)))
                            
                            looporswitchbreak(Label_0088)
                        }
                        
                        looporswitchbreak()
                    }
                }
            }
        }
        
        Label_0088:
        var_9_260 = and:int(ldc:int(-1378900909), ldc:int(-1355311785))
        var_11_6D = invokevirtual:\u836c\u8cae\ub18d\u836c\u8753\u59ec(\u67e9\u8413\ub113\u4bc8\u6c52\uceb8::\u6fb0\ud217\u34df\u6b5f\uc31c\ubf56, getfield:\u67e9\u8413\ub113\u4bc8\u6c52\uceb8(\u67e9\u4daf\u760c\ud217\ua6bd\ubff1::\u7af6\u6b0d\ub70c\u76bc\ucfaf\u4cd9, getfield:\u67e9\u4daf\u760c\ud217\ua6bd\ubff1(\u4d85\u3bc9\u8413\u8308\u3711\ub70c::\u40a9\u98a4\u8d90\ud36e\u8413\u0800, this:\u4d85\u3bc9\u8413\u8308\u3711\ub70c)))
        var_13_7F = invokeinterface:\u3d4b\u9937\u7af6\u7af6\u6198\uae87(\u97e6\uf995\ucef1\ubff1\u7049\u4f4a::\uc910\u74b1\u4cd9\u3711\uc29a\u071d, getfield:\u16f6\u61a4\u5db4\u4c04\u64ab\u9255[expected:\u97e6\uf995\ucef1\ubff1\u7049\u4f4a](\u67e9\u4daf\u760c\ud217\ua6bd\ubff1::\u946b\u98a4\u8709\u7043\ubf56\u5f50, getfield:\u67e9\u4daf\u760c\ud217\ua6bd\ubff1(\u4d85\u3bc9\u8413\u8308\u3711\ub70c::\u40a9\u98a4\u8d90\ud36e\u8413\u0800, this:\u4d85\u3bc9\u8413\u8308\u3711\ub70c)))
        var_14_99 = initobject:\u6b0d\ud171\uc7fe\u52d3\uafe7\u6c56(\u6b0d\ud171\uc7fe\u52d3\uafe7\u6c56::<init>, getfield:double(\u3a62\u5d20\u4f52\uc229\u8308\ud7e8::\ubf56\u4c04\u4492\u36d3\u71f1\u12cb, invokevirtual:\u3a62\u5d20\u4f52\uc229\u8308\ud7e8(\u836c\u8cae\ub18d\u836c\u8753\u59ec::\u8308\ub171\u6b5f\u16f6\u4cd9\ua562, var_11_6D:\u836c\u8cae\ub18d\u836c\u8753\u59ec)), ldc:double(0.0), getfield:double(\u3a62\u5d20\u4f52\uc229\u8308\ud7e8::\ub7dc\ubff1\ub19c\u6198\uc2e8\ufe34, invokevirtual:\u3a62\u5d20\u4f52\uc229\u8308\ud7e8(\u836c\u8cae\ub18d\u836c\u8753\u59ec::\u8308\ub171\u6b5f\u16f6\u4cd9\ua562, var_11_6D:\u836c\u8cae\ub18d\u836c\u8753\u59ec)))
        var_15_A4 = invokeinterface:\u6b0d\uf9c5\ucfaf\ud36e\ub102(\u12cb\u12b2\ua3b4\u183a\ud158\u51fa::\ub18d\u8d90\u8308\u9a18\u071d\u16f6, p1:\u12cb\u12b2\ua3b4\u183a\ud158\u51fa, invokestatic:\uf995\u4975\u1187\ubff1\u839e\u8389(\uf995\u4975\u1187\ubff1\u839e\u8389::\u7d52\u071d\u120d\u183a\ucb79\u8258))
        
        if (logicalnot:boolean(invokeinterface:boolean(Map<K, V>::containsKey, getfield:Map<\u3d4b\u9937\u7af6\u7af6\u6198\uae87, Map<String, \ud7e8\u7e3f\u4cd9\u5f50\u6bb9\u6ec6>>(\u4d85\u3bc9\u8413\u8308\u3711\ub70c::\u7873\ud158\ua6bd\ub32d\u8d90\u7c6b, this:\u4d85\u3bc9\u8413\u8308\u3711\ub70c), var_13_7F:\u3d4b\u9937\u7af6\u7af6\u6198\uae87[expected:Object]))) {
            goto(Label_0180)
        }
        
        var_16_107 = invokeinterface:Iterator<\ud7e8\u7e3f\u4cd9\u5f50\u6bb9\u6ec6>(Collection<\ud7e8\u7e3f\u4cd9\u5f50\u6bb9\u6ec6>::iterator, invokeinterface:Collection<\ud7e8\u7e3f\u4cd9\u5f50\u6bb9\u6ec6>(Map<String, \ud7e8\u7e3f\u4cd9\u5f50\u6bb9\u6ec6>::values, checkcast:Map<String, \ud7e8\u7e3f\u4cd9\u5f50\u6bb9\u6ec6>(java.util.Map<java.lang.String, \u47c2\u2dcc\u12cb\ud171\u8c8a.\ud7e8\u7e3f\u4cd9\u5f50\u6bb9\u6ec6>.class, invokeinterface:Map<String, \ud7e8\u7e3f\u4cd9\u5f50\u6bb9\u6ec6>(Map<\u3d4b\u9937\u7af6\u7af6\u6198\uae87, Map<String, \ud7e8\u7e3f\u4cd9\u5f50\u6bb9\u6ec6>>::get, getfield:Map<\u3d4b\u9937\u7af6\u7af6\u6198\uae87, Map<String, \ud7e8\u7e3f\u4cd9\u5f50\u6bb9\u6ec6>>(\u4d85\u3bc9\u8413\u8308\u3711\ub70c::\u7873\ud158\ua6bd\ub32d\u8d90\u7c6b, this:\u4d85\u3bc9\u8413\u8308\u3711\ub70c), var_13_7F:\u3d4b\u9937\u7af6\u7af6\u6198\uae87[expected:Object]))))
        Label_0265:
        
        while (cmpne:boolean(and:int(var_9_260:int, ldc:int(67108864)), ldc:int(0))) {
            var_9_260 = and:int(var_9_260:int, ldc:int(-315239241))
            
            if (logicalnot:boolean(invokeinterface:boolean(Iterator::hasNext, var_16_107:Iterator<\ud7e8\u7e3f\u4cd9\u5f50\u6bb9\u6ec6>[expected:Object]))) {
                goto(Label_0180)
            }
            
            var_17_133 = checkcast:\ud7e8\u7e3f\u4cd9\u5f50\u6bb9\u6ec6(\u47c2\u2dcc\u12cb\ud171\u8c8a.\ud7e8\u7e3f\u4cd9\u5f50\u6bb9\u6ec6.class, invokeinterface:\ud7e8\u7e3f\u4cd9\u5f50\u6bb9\u6ec6(Iterator<\ud7e8\u7e3f\u4cd9\u5f50\u6bb9\u6ec6>::next, var_16_107:Iterator<\ud7e8\u7e3f\u4cd9\u5f50\u6bb9\u6ec6>))
            
            if (invokevirtual:boolean(\u3a62\uc9f6\u3776\u4f52\ua068\u34df::\u92ee\ua3b4\u3c25\u7330\u3711\uc2e8, var_14_99:\u6b0d\ud171\uc7fe\u52d3\uafe7\u6c56[expected:\u3a62\uc9f6\u3776\u4f52\ua068\u34df], invokevirtual:\u3a62\uc9f6\u3776\u4f52\ua068\u34df(\ud7e8\u7e3f\u4cd9\u5f50\u6bb9\u6ec6::\u927d\ub19c\ub171\u2dcc\u8df4\u9937, var_17_133:\ud7e8\u7e3f\u4cd9\u5f50\u6bb9\u6ec6), ldc:double(500.0))) {
                invokestatic:void(\u9937\u7d52\u3e75\u98a4\u8aa5\u7006::\u9937\u9255\u4daf\u760c\u4cd9\ub102, p0:\uafe7\uc7fe\u4c04\u6b5f\u5bc4, var_15_A4:\u6b0d\uf9c5\ucfaf\ud36e\ub102, sub:double(i2d:double(getfield:int(\ud7e8\u7e3f\u4cd9\u5f50\u6bb9\u6ec6::\u0800\ub18d\u64ab\u36d3\u8bb0\u2dcc, var_17_133:\ud7e8\u7e3f\u4cd9\u5f50\u6bb9\u6ec6)), p2:double), sub:double(i2d:double(getfield:int(\ud7e8\u7e3f\u4cd9\u5f50\u6bb9\u6ec6::\u8bb0\u12b2\u8753\u7e3f\uceb8\ua6bd, var_17_133:\ud7e8\u7e3f\u4cd9\u5f50\u6bb9\u6ec6)), p3:double), sub:double(i2d:double(getfield:int(\ud7e8\u7e3f\u4cd9\u5f50\u6bb9\u6ec6::\u1833\u5f50\u93a2\uc246\u9255\u759a, var_17_133:\ud7e8\u7e3f\u4cd9\u5f50\u6bb9\u6ec6)), p4:double), sub:double(i2d:double(add:int(getfield:int(\ud7e8\u7e3f\u4cd9\u5f50\u6bb9\u6ec6::\ube23\uc7fe\u927d\u873d\ud36e\u8cae, var_17_133:\ud7e8\u7e3f\u4cd9\u5f50\u6bb9\u6ec6), xor:int(ldc:int(9221), ldc:int(9220)))), p2:double), sub:double(i2d:double(add:int(getfield:int(\ud7e8\u7e3f\u4cd9\u5f50\u6bb9\u6ec6::\u4e72\uc238\u5245\ud217\u3d64\ub8be, var_17_133:\ud7e8\u7e3f\u4cd9\u5f50\u6bb9\u6ec6), xor:int(ldc:int(8193), ldc:int(8192)))), p3:double), sub:double(i2d:double(add:int(getfield:int(\ud7e8\u7e3f\u4cd9\u5f50\u6bb9\u6ec6::\u4daf\u3bc9\u98a4\u6ec6\u16f6\u3d64, var_17_133:\ud7e8\u7e3f\u4cd9\u5f50\u6bb9\u6ec6), and:int(ldc:int(2595), ldc:int(28929)))), p4:double), ldc:float(1.0f), ldc:float(1.0f), ldc:float(1.0f), ldc:float(1.0f), ldc:float(1.0f), ldc:float(1.0f), ldc:float(1.0f))
            }
            
            var_9_260 = and:int(var_9_260:int, ldc:int(-1638427205))
        }
        
        Label_0461:
        
        while (cmpne:boolean(and:int(var_9_260:int, ldc:int(16)), ldc:int(0))) {
            var_9_260 = and:int(var_9_260:int, ldc:int(-1392658857))
            
            if (logicalnot:boolean(invokeinterface:boolean(Iterator<E>::hasNext, var_16_107:Iterator<\ud7e8\u7e3f\u4cd9\u5f50\u6bb9\u6ec6>[expected:Object]))) {
                goto(Label_0209)
            }
            
            var_17_201 = checkcast:Entry(java.util.Map.Entry.class, invokeinterface:\ud7e8\u7e3f\u4cd9\u5f50\u6bb9\u6ec6[expected:Entry](Iterator<\ud7e8\u7e3f\u4cd9\u5f50\u6bb9\u6ec6>::next, var_16_107:Iterator<\ud7e8\u7e3f\u4cd9\u5f50\u6bb9\u6ec6>))
            var_18_20D = checkcast:String(java.lang.String.class, invokeinterface:String(Entry<String, \ud7e8\u7e3f\u4cd9\u5f50\u6bb9\u6ec6>::getKey, var_17_201:Entry<String, \ud7e8\u7e3f\u4cd9\u5f50\u6bb9\u6ec6>))
            var_19_219 = checkcast:\ud7e8\u7e3f\u4cd9\u5f50\u6bb9\u6ec6(\u47c2\u2dcc\u12cb\ud171\u8c8a.\ud7e8\u7e3f\u4cd9\u5f50\u6bb9\u6ec6.class, invokeinterface:\ud7e8\u7e3f\u4cd9\u5f50\u6bb9\u6ec6(Entry<String, \ud7e8\u7e3f\u4cd9\u5f50\u6bb9\u6ec6>::getValue, var_17_201:Entry<String, \ud7e8\u7e3f\u4cd9\u5f50\u6bb9\u6ec6>))
            var_20_233 = checkcast:Boolean(java.lang.Boolean.class, invokeinterface:Boolean(Map<String, Boolean>::get, checkcast:Map<String, Boolean>(java.util.Map<java.lang.String, java.lang.Boolean>.class, invokeinterface:Map<String, Boolean>(Map<\u3d4b\u9937\u7af6\u7af6\u6198\uae87, Map<String, Boolean>>::get, getfield:Map<\u3d4b\u9937\u7af6\u7af6\u6198\uae87, Map<String, Boolean>>(\u4d85\u3bc9\u8413\u8308\u3711\ub70c::\u12cb\ud523\u873d\u92ee\ubff1\u4c2b, this:\u4d85\u3bc9\u8413\u8308\u3711\ub70c), var_13_7F:\u3d4b\u9937\u7af6\u7af6\u6198\uae87[expected:Object])), var_18_20D:String[expected:Object]))
            
            if (invokevirtual:boolean(\u3a62\uc9f6\u3776\u4f52\ua068\u34df::\u92ee\ua3b4\u3c25\u7330\u3711\uc2e8, var_14_99:\u6b0d\ud171\uc7fe\u52d3\uafe7\u6c56[expected:\u3a62\uc9f6\u3776\u4f52\ua068\u34df], invokevirtual:\u3a62\uc9f6\u3776\u4f52\ua068\u34df(\ud7e8\u7e3f\u4cd9\u5f50\u6bb9\u6ec6::\u927d\ub19c\ub171\u2dcc\u8df4\u9937, var_19_219:\ud7e8\u7e3f\u4cd9\u5f50\u6bb9\u6ec6), ldc:double(500.0))) {
                if (logicalnot:boolean(invokevirtual:boolean(Boolean::booleanValue, var_20_233:Boolean))) {
                    var_9_260 = and:int(var_9_260:int, ldc:int(2091238547))
                    invokestatic:void(\u9937\u7d52\u3e75\u98a4\u8aa5\u7006::\u9937\u9255\u4daf\u760c\u4cd9\ub102, p0:\uafe7\uc7fe\u4c04\u6b5f\u5bc4, var_15_A4:\u6b0d\uf9c5\ucfaf\ud36e\ub102, sub:double(i2d:double(getfield:int(\ud7e8\u7e3f\u4cd9\u5f50\u6bb9\u6ec6::\u0800\ub18d\u64ab\u36d3\u8bb0\u2dcc, var_19_219:\ud7e8\u7e3f\u4cd9\u5f50\u6bb9\u6ec6)), p2:double), sub:double(i2d:double(getfield:int(\ud7e8\u7e3f\u4cd9\u5f50\u6bb9\u6ec6::\u8bb0\u12b2\u8753\u7e3f\uceb8\ua6bd, var_19_219:\ud7e8\u7e3f\u4cd9\u5f50\u6bb9\u6ec6)), p3:double), sub:double(i2d:double(getfield:int(\ud7e8\u7e3f\u4cd9\u5f50\u6bb9\u6ec6::\u1833\u5f50\u93a2\uc246\u9255\u759a, var_19_219:\ud7e8\u7e3f\u4cd9\u5f50\u6bb9\u6ec6)), p4:double), sub:double(i2d:double(add:int(getfield:int(\ud7e8\u7e3f\u4cd9\u5f50\u6bb9\u6ec6::\ube23\uc7fe\u927d\u873d\ud36e\u8cae, var_19_219:\ud7e8\u7e3f\u4cd9\u5f50\u6bb9\u6ec6), and:int(ldc:int(17541), ldc:int(113)))), p2:double), sub:double(i2d:double(add:int(getfield:int(\ud7e8\u7e3f\u4cd9\u5f50\u6bb9\u6ec6::\u4e72\uc238\u5245\ud217\u3d64\ub8be, var_19_219:\ud7e8\u7e3f\u4cd9\u5f50\u6bb9\u6ec6), xor:int(ldc:int(20610), ldc:int(20611)))), p3:double), sub:double(i2d:double(add:int(getfield:int(\ud7e8\u7e3f\u4cd9\u5f50\u6bb9\u6ec6::\u4daf\u3bc9\u98a4\u6ec6\u16f6\u3d64, var_19_219:\ud7e8\u7e3f\u4cd9\u5f50\u6bb9\u6ec6), and:int(ldc:int(17425), ldc:int(4611)))), p4:double), ldc:float(0.0f), ldc:float(0.0f), ldc:float(1.0f), ldc:float(1.0f), ldc:float(0.0f), ldc:float(0.0f), ldc:float(1.0f))
                }
                else {
                    invokestatic:void(\u9937\u7d52\u3e75\u98a4\u8aa5\u7006::\u9937\u9255\u4daf\u760c\u4cd9\ub102, p0:\uafe7\uc7fe\u4c04\u6b5f\u5bc4, var_15_A4:\u6b0d\uf9c5\ucfaf\ud36e\ub102, sub:double(i2d:double(getfield:int(\ud7e8\u7e3f\u4cd9\u5f50\u6bb9\u6ec6::\u0800\ub18d\u64ab\u36d3\u8bb0\u2dcc, var_19_219:\ud7e8\u7e3f\u4cd9\u5f50\u6bb9\u6ec6)), p2:double), sub:double(i2d:double(getfield:int(\ud7e8\u7e3f\u4cd9\u5f50\u6bb9\u6ec6::\u8bb0\u12b2\u8753\u7e3f\uceb8\ua6bd, var_19_219:\ud7e8\u7e3f\u4cd9\u5f50\u6bb9\u6ec6)), p3:double), sub:double(i2d:double(getfield:int(\ud7e8\u7e3f\u4cd9\u5f50\u6bb9\u6ec6::\u1833\u5f50\u93a2\uc246\u9255\u759a, var_19_219:\ud7e8\u7e3f\u4cd9\u5f50\u6bb9\u6ec6)), p4:double), sub:double(i2d:double(add:int(getfield:int(\ud7e8\u7e3f\u4cd9\u5f50\u6bb9\u6ec6::\ube23\uc7fe\u927d\u873d\ud36e\u8cae, var_19_219:\ud7e8\u7e3f\u4cd9\u5f50\u6bb9\u6ec6), xor:int(ldc:int(18432), ldc:int(18433)))), p2:double), sub:double(i2d:double(add:int(getfield:int(\ud7e8\u7e3f\u4cd9\u5f50\u6bb9\u6ec6::\u4e72\uc238\u5245\ud217\u3d64\ub8be, var_19_219:\ud7e8\u7e3f\u4cd9\u5f50\u6bb9\u6ec6), xor:int(ldc:int(4364), ldc:int(4365)))), p3:double), sub:double(i2d:double(add:int(getfield:int(\ud7e8\u7e3f\u4cd9\u5f50\u6bb9\u6ec6::\u4daf\u3bc9\u98a4\u6ec6\u16f6\u3d64, var_19_219:\ud7e8\u7e3f\u4cd9\u5f50\u6bb9\u6ec6), and:int(ldc:int(13763), ldc:int(33)))), p4:double), ldc:float(0.0f), ldc:float(1.0f), ldc:float(0.0f), ldc:float(1.0f), ldc:float(0.0f), ldc:float(1.0f), ldc:float(0.0f))
                }
            }
            
            var_9_260 = and:int(var_9_260:int, ldc:int(-46676783))
        }
        
        var_9_260 = and:int(var_9_260:int, ldc:int(1972511652))
        goto(Label_0265)
        Label_0180:
        
        if (cmpeq:boolean(and:int(var_9_260:int, ldc:int(2097152)), ldc:int(0))) {
            var_9_260 = and:int(var_9_260:int, ldc:int(1820327349))
            
            if (invokeinterface:boolean(Map<K, V>::containsKey, getfield:Map<\u3d4b\u9937\u7af6\u7af6\u6198\uae87, Map<String, \ud7e8\u7e3f\u4cd9\u5f50\u6bb9\u6ec6>>(\u4d85\u3bc9\u8413\u8308\u3711\ub70c::\u8308\u3d64\u59ec\ub171\ud217\u760c, this:\u4d85\u3bc9\u8413\u8308\u3711\ub70c), var_13_7F:\u3d4b\u9937\u7af6\u7af6\u6198\uae87[expected:Object])) {
                var_16_107 = invokeinterface:Iterator<Entry<String, \ud7e8\u7e3f\u4cd9\u5f50\u6bb9\u6ec6>>(Set<Entry<String, \ud7e8\u7e3f\u4cd9\u5f50\u6bb9\u6ec6>>::iterator, invokeinterface:Set<Entry<String, \ud7e8\u7e3f\u4cd9\u5f50\u6bb9\u6ec6>>(Map<String, \ud7e8\u7e3f\u4cd9\u5f50\u6bb9\u6ec6>::entrySet, checkcast:Map<String, \ud7e8\u7e3f\u4cd9\u5f50\u6bb9\u6ec6>(java.util.Map<java.lang.String, \u47c2\u2dcc\u12cb\ud171\u8c8a.\ud7e8\u7e3f\u4cd9\u5f50\u6bb9\u6ec6>.class, invokeinterface:Map<String, \ud7e8\u7e3f\u4cd9\u5f50\u6bb9\u6ec6>(Map<\u3d4b\u9937\u7af6\u7af6\u6198\uae87, Map<String, \ud7e8\u7e3f\u4cd9\u5f50\u6bb9\u6ec6>>::get, getfield:Map<\u3d4b\u9937\u7af6\u7af6\u6198\uae87, Map<String, \ud7e8\u7e3f\u4cd9\u5f50\u6bb9\u6ec6>>(\u4d85\u3bc9\u8413\u8308\u3711\ub70c::\u8308\u3d64\u59ec\ub171\ud217\u760c, this:\u4d85\u3bc9\u8413\u8308\u3711\ub70c), var_13_7F:\u3d4b\u9937\u7af6\u7af6\u6198\uae87[expected:Object]))))
                goto(Label_0461)
            }
        }
        
        Label_0209:
        
        if (cmpeq:boolean(and:int(var_9_260:int, ldc:int(2147483647)), ldc:int(0))) {
            var_9_260 = and:int(var_9_260:int, ldc:int(-1534704918))
            goto(Label_0180)
        }
    }
    
    public void \u6435\u965f\u64f2\u92ee\u9937\ub171(\u47c2\u2dcc\u12cb\ud171\u8c8a.\ud7e8\u7e3f\u4cd9\u5f50\u6bb9\u6ec6 p0, java.util.List<\u47c2\u2dcc\u12cb\ud171\u8c8a.\ud7e8\u7e3f\u4cd9\u5f50\u6bb9\u6ec6> p1, java.util.List<java.lang.Boolean> p2, \u4492\u8aa5\ud171\uc3e3\u4c2b.\u4c04\ua068\u3d64\ua6bd\u8389.\u3d4b\u9937\u7af6\u7af6\u6198\uae87 p3) {
        var_5_61 : int
        var_5_7E : int
        var_7_D1 : int
        var_8_138 : \ud7e8\u7e3f\u4cd9\u5f50\u6bb9\u6ec6
        var_9_145 : Boolean
        
        if (cmpne:boolean(ldc:int(15), ldc:int(0))) {
        }
        
        Label_0006:
        
        if (cmpne:boolean(ldc:int(14), ldc:int(0))) {
            if (cmpeq:boolean(ldc:int(2), ldc:int(0))) {
                loop {
                    invokevirtual:void(PrintStream::println, getstatic:PrintStream(System::out), ldc:String("#0"))
                    
                    if (cmpne:boolean(ldc:int(2), ldc:int(0))) {
                        loop {
                            Label_0028:
                            invokevirtual:void(PrintStream::println, getstatic:PrintStream(System::out), ldc:String("#1"))
                            
                            if (cmpne:boolean(ldc:int(2), ldc:int(0))) {
                                do {
                                    invokevirtual:void(PrintStream::println, getstatic:PrintStream(System::out), ldc:String("#2"))
                                } while (cmpeq:boolean(ldc:int(2), ldc:int(0)))
                                
                                do {
                                    invokevirtual:void(PrintStream::println, getstatic:PrintStream(System::out), ldc:String("#3"))
                                    
                                    if (cmpeq:boolean(ldc:int(2), ldc:int(0))) {
                                        loopcontinue(Label_0028)
                                    }
                                    
                                    do {
                                        invokevirtual:void(PrintStream::println, getstatic:PrintStream(System::out), ldc:String("#4"))
                                    } while (cmpeq:boolean(ldc:int(2), ldc:int(0)))
                                    
                                    invokevirtual:void(PrintStream::println, getstatic:PrintStream(System::out), ldc:String("#5"))
                                } while (cmpeq:boolean(ldc:int(2), ldc:int(0)))
                                
                                looporswitchbreak(Label_0088)
                            }
                            
                            looporswitchbreak()
                        }
                    }
                }
            }
            
            Label_0088:
            var_5_61 = and:int(ldc:int(-1850628254), ldc:int(1068418896))
            
            if (logicalnot:boolean(invokeinterface:boolean(Map<K, V>::containsKey, getfield:Map<\u3d4b\u9937\u7af6\u7af6\u6198\uae87, Map<String, \ud7e8\u7e3f\u4cd9\u5f50\u6bb9\u6ec6>>(\u4d85\u3bc9\u8413\u8308\u3711\ub70c::\u7873\ud158\ua6bd\ub32d\u8d90\u7c6b, this:\u4d85\u3bc9\u8413\u8308\u3711\ub70c), p3:\u3d4b\u9937\u7af6\u7af6\u6198\uae87[expected:Object]))) {
                invokeinterface:Map<String, \ud7e8\u7e3f\u4cd9\u5f50\u6bb9\u6ec6>(Map<\u3d4b\u9937\u7af6\u7af6\u6198\uae87, Map<String, \ud7e8\u7e3f\u4cd9\u5f50\u6bb9\u6ec6>>::put, getfield:Map<\u3d4b\u9937\u7af6\u7af6\u6198\uae87, Map<String, \ud7e8\u7e3f\u4cd9\u5f50\u6bb9\u6ec6>>(\u4d85\u3bc9\u8413\u8308\u3711\ub70c::\u7873\ud158\ua6bd\ub32d\u8d90\u7c6b, this:\u4d85\u3bc9\u8413\u8308\u3711\ub70c), p3:\u3d4b\u9937\u7af6\u7af6\u6198\uae87, invokestatic:HashMap[expected:Map<String, \ud7e8\u7e3f\u4cd9\u5f50\u6bb9\u6ec6>](Maps::newHashMap))
            }
            
            loop {
                if (cmpeq:boolean(and:int(var_5_61:int, ldc:int(16777216)), ldc:int(0))) {
                    var_5_7E = and:int(var_5_61:int, ldc:int(-433455078))
                }
                else {
                    var_5_7E = and:int(var_5_61:int, ldc:int(1369554806))
                    
                    if (logicalnot:boolean(invokeinterface:boolean(Map<K, V>::containsKey, getfield:Map<\u3d4b\u9937\u7af6\u7af6\u6198\uae87, Map<String, \ud7e8\u7e3f\u4cd9\u5f50\u6bb9\u6ec6>>(\u4d85\u3bc9\u8413\u8308\u3711\ub70c::\u8308\u3d64\u59ec\ub171\ud217\u760c, this:\u4d85\u3bc9\u8413\u8308\u3711\ub70c), p3:\u3d4b\u9937\u7af6\u7af6\u6198\uae87[expected:Object]))) {
                        invokeinterface:Map<String, \ud7e8\u7e3f\u4cd9\u5f50\u6bb9\u6ec6>(Map<\u3d4b\u9937\u7af6\u7af6\u6198\uae87, Map<String, \ud7e8\u7e3f\u4cd9\u5f50\u6bb9\u6ec6>>::put, getfield:Map<\u3d4b\u9937\u7af6\u7af6\u6198\uae87, Map<String, \ud7e8\u7e3f\u4cd9\u5f50\u6bb9\u6ec6>>(\u4d85\u3bc9\u8413\u8308\u3711\ub70c::\u8308\u3d64\u59ec\ub171\ud217\u760c, this:\u4d85\u3bc9\u8413\u8308\u3711\ub70c), p3:\u3d4b\u9937\u7af6\u7af6\u6198\uae87, invokestatic:HashMap[expected:Map<String, \ud7e8\u7e3f\u4cd9\u5f50\u6bb9\u6ec6>](Maps::newHashMap))
                        invokeinterface:Map<String, Boolean>(Map<\u3d4b\u9937\u7af6\u7af6\u6198\uae87, Map<String, Boolean>>::put, getfield:Map<\u3d4b\u9937\u7af6\u7af6\u6198\uae87, Map<String, Boolean>>(\u4d85\u3bc9\u8413\u8308\u3711\ub70c::\u12cb\ud523\u873d\u92ee\ubff1\u4c2b, this:\u4d85\u3bc9\u8413\u8308\u3711\ub70c), p3:\u3d4b\u9937\u7af6\u7af6\u6198\uae87, invokestatic:HashMap[expected:Map<String, Boolean>](Maps::newHashMap))
                    }
                }
                
                if (cmpeq:boolean(and:int(var_5_7E:int, ldc:int(134217728)), ldc:int(0))) {
                    looporswitchbreak()
                }
                
                var_5_61 = and:int(var_5_7E:int, ldc:int(216065554))
            }
            
            invokeinterface:\ud7e8\u7e3f\u4cd9\u5f50\u6bb9\u6ec6(Map<String, \ud7e8\u7e3f\u4cd9\u5f50\u6bb9\u6ec6>::put, checkcast:Map<String, \ud7e8\u7e3f\u4cd9\u5f50\u6bb9\u6ec6>(java.util.Map<java.lang.String, \u47c2\u2dcc\u12cb\ud171\u8c8a.\ud7e8\u7e3f\u4cd9\u5f50\u6bb9\u6ec6>.class, invokeinterface:Map<String, \ud7e8\u7e3f\u4cd9\u5f50\u6bb9\u6ec6>(Map<\u3d4b\u9937\u7af6\u7af6\u6198\uae87, Map<String, \ud7e8\u7e3f\u4cd9\u5f50\u6bb9\u6ec6>>::get, getfield:Map<\u3d4b\u9937\u7af6\u7af6\u6198\uae87, Map<String, \ud7e8\u7e3f\u4cd9\u5f50\u6bb9\u6ec6>>(\u4d85\u3bc9\u8413\u8308\u3711\ub70c::\u7873\ud158\ua6bd\ub32d\u8d90\u7c6b, this:\u4d85\u3bc9\u8413\u8308\u3711\ub70c), p3:\u3d4b\u9937\u7af6\u7af6\u6198\uae87[expected:Object])), invokevirtual:String(\ud7e8\u7e3f\u4cd9\u5f50\u6bb9\u6ec6::toString, p0:\ud7e8\u7e3f\u4cd9\u5f50\u6bb9\u6ec6), p0:\ud7e8\u7e3f\u4cd9\u5f50\u6bb9\u6ec6)
            var_7_D1 = and:int(ldc:int(-19648), ldc:int(19606))
            
            while (cmplt:boolean(var_7_D1:int, invokeinterface:int(List<E>::size, p1:List<\ud7e8\u7e3f\u4cd9\u5f50\u6bb9\u6ec6>))) {
                var_8_138 = checkcast:\ud7e8\u7e3f\u4cd9\u5f50\u6bb9\u6ec6(\u47c2\u2dcc\u12cb\ud171\u8c8a.\ud7e8\u7e3f\u4cd9\u5f50\u6bb9\u6ec6.class, invokeinterface:\ud7e8\u7e3f\u4cd9\u5f50\u6bb9\u6ec6(List<\ud7e8\u7e3f\u4cd9\u5f50\u6bb9\u6ec6>::get, p1:List<\ud7e8\u7e3f\u4cd9\u5f50\u6bb9\u6ec6>, var_7_D1:int))
                var_9_145 = checkcast:Boolean(java.lang.Boolean.class, invokeinterface:Boolean(List<Boolean>::get, p2:List<Boolean>, var_7_D1:int))
                invokeinterface:\ud7e8\u7e3f\u4cd9\u5f50\u6bb9\u6ec6(Map<String, \ud7e8\u7e3f\u4cd9\u5f50\u6bb9\u6ec6>::put, checkcast:Map<String, \ud7e8\u7e3f\u4cd9\u5f50\u6bb9\u6ec6>(java.util.Map<java.lang.String, \u47c2\u2dcc\u12cb\ud171\u8c8a.\ud7e8\u7e3f\u4cd9\u5f50\u6bb9\u6ec6>.class, invokeinterface:Map<String, \ud7e8\u7e3f\u4cd9\u5f50\u6bb9\u6ec6>(Map<\u3d4b\u9937\u7af6\u7af6\u6198\uae87, Map<String, \ud7e8\u7e3f\u4cd9\u5f50\u6bb9\u6ec6>>::get, getfield:Map<\u3d4b\u9937\u7af6\u7af6\u6198\uae87, Map<String, \ud7e8\u7e3f\u4cd9\u5f50\u6bb9\u6ec6>>(\u4d85\u3bc9\u8413\u8308\u3711\ub70c::\u8308\u3d64\u59ec\ub171\ud217\u760c, this:\u4d85\u3bc9\u8413\u8308\u3711\ub70c), p3:\u3d4b\u9937\u7af6\u7af6\u6198\uae87[expected:Object])), invokevirtual:String(\ud7e8\u7e3f\u4cd9\u5f50\u6bb9\u6ec6::toString, var_8_138:\ud7e8\u7e3f\u4cd9\u5f50\u6bb9\u6ec6), var_8_138:\ud7e8\u7e3f\u4cd9\u5f50\u6bb9\u6ec6)
                invokeinterface:Boolean(Map<String, Boolean>::put, checkcast:Map<String, Boolean>(java.util.Map<java.lang.String, java.lang.Boolean>.class, invokeinterface:Map<String, Boolean>(Map<\u3d4b\u9937\u7af6\u7af6\u6198\uae87, Map<String, Boolean>>::get, getfield:Map<\u3d4b\u9937\u7af6\u7af6\u6198\uae87, Map<String, Boolean>>(\u4d85\u3bc9\u8413\u8308\u3711\ub70c::\u12cb\ud523\u873d\u92ee\ubff1\u4c2b, this:\u4d85\u3bc9\u8413\u8308\u3711\ub70c), p3:\u3d4b\u9937\u7af6\u7af6\u6198\uae87[expected:Object])), invokevirtual:String(\ud7e8\u7e3f\u4cd9\u5f50\u6bb9\u6ec6::toString, var_8_138:\ud7e8\u7e3f\u4cd9\u5f50\u6bb9\u6ec6), var_9_145:Boolean)
                inc:int(var_7_D1, ldc:int(1))
            }
            
            return:void()
        }
        
        goto(Label_0006)
    }
    
    public void \u7873\u8389\u3bd6\ua562\uc2e8\uc2bd() {
        if (cmpne:boolean(ldc:int(15), ldc:int(0))) {
        }
        
        Label_0006:
        
        if (cmpne:boolean(ldc:int(14), ldc:int(0))) {
            if (cmpeq:boolean(ldc:int(2), ldc:int(0))) {
                loop {
                    invokevirtual:void(PrintStream::println, getstatic:PrintStream(System::out), ldc:String("#0"))
                    
                    if (cmpne:boolean(ldc:int(2), ldc:int(0))) {
                        loop {
                            Label_0028:
                            invokevirtual:void(PrintStream::println, getstatic:PrintStream(System::out), ldc:String("#1"))
                            
                            if (cmpne:boolean(ldc:int(2), ldc:int(0))) {
                                do {
                                    invokevirtual:void(PrintStream::println, getstatic:PrintStream(System::out), ldc:String("#2"))
                                } while (cmpeq:boolean(ldc:int(2), ldc:int(0)))
                                
                                do {
                                    invokevirtual:void(PrintStream::println, getstatic:PrintStream(System::out), ldc:String("#3"))
                                    
                                    if (cmpeq:boolean(ldc:int(2), ldc:int(0))) {
                                        loopcontinue(Label_0028)
                                    }
                                    
                                    do {
                                        invokevirtual:void(PrintStream::println, getstatic:PrintStream(System::out), ldc:String("#4"))
                                    } while (cmpeq:boolean(ldc:int(2), ldc:int(0)))
                                    
                                    invokevirtual:void(PrintStream::println, getstatic:PrintStream(System::out), ldc:String("#5"))
                                } while (cmpeq:boolean(ldc:int(2), ldc:int(0)))
                                
                                looporswitchbreak(Label_0088)
                            }
                            
                            looporswitchbreak()
                        }
                    }
                }
            }
            
            Label_0088:
            invokeinterface:void(Map<K, V>::clear, getfield:Map<\u3d4b\u9937\u7af6\u7af6\u6198\uae87, Map<String, \ud7e8\u7e3f\u4cd9\u5f50\u6bb9\u6ec6>>(\u4d85\u3bc9\u8413\u8308\u3711\ub70c::\u7873\ud158\ua6bd\ub32d\u8d90\u7c6b, this:\u4d85\u3bc9\u8413\u8308\u3711\ub70c))
            invokeinterface:void(Map<K, V>::clear, getfield:Map<\u3d4b\u9937\u7af6\u7af6\u6198\uae87, Map<String, \ud7e8\u7e3f\u4cd9\u5f50\u6bb9\u6ec6>>(\u4d85\u3bc9\u8413\u8308\u3711\ub70c::\u8308\u3d64\u59ec\ub171\ud217\u760c, this:\u4d85\u3bc9\u8413\u8308\u3711\ub70c))
            invokeinterface:void(Map<K, V>::clear, getfield:Map<\u3d4b\u9937\u7af6\u7af6\u6198\uae87, Map<String, Boolean>>(\u4d85\u3bc9\u8413\u8308\u3711\ub70c::\u12cb\ud523\u873d\u92ee\ubff1\u4c2b, this:\u4d85\u3bc9\u8413\u8308\u3711\ub70c))
            return:void()
        }
        
        goto(Label_0006)
    }
    
    static {
        if (cmpne:boolean(ldc:int(15), ldc:int(0))) {
        }
        
        Label_0006:
        
        if (cmpne:boolean(ldc:int(14), ldc:int(0))) {
            if (cmpeq:boolean(ldc:int(2), ldc:int(0))) {
                loop {
                    invokevirtual:void(PrintStream::println, getstatic:PrintStream(System::out), ldc:String("#0"))
                    
                    if (cmpne:boolean(ldc:int(2), ldc:int(0))) {
                        loop {
                            Label_0028:
                            invokevirtual:void(PrintStream::println, getstatic:PrintStream(System::out), ldc:String("#1"))
                            
                            if (cmpne:boolean(ldc:int(2), ldc:int(0))) {
                                do {
                                    invokevirtual:void(PrintStream::println, getstatic:PrintStream(System::out), ldc:String("#2"))
                                } while (cmpeq:boolean(ldc:int(2), ldc:int(0)))
                                
                                do {
                                    invokevirtual:void(PrintStream::println, getstatic:PrintStream(System::out), ldc:String("#3"))
                                    
                                    if (cmpeq:boolean(ldc:int(2), ldc:int(0))) {
                                        loopcontinue(Label_0028)
                                    }
                                    
                                    do {
                                        invokevirtual:void(PrintStream::println, getstatic:PrintStream(System::out), ldc:String("#4"))
                                    } while (cmpeq:boolean(ldc:int(2), ldc:int(0)))
                                    
                                    invokevirtual:void(PrintStream::println, getstatic:PrintStream(System::out), ldc:String("#5"))
                                } while (cmpeq:boolean(ldc:int(2), ldc:int(0)))
                                
                                looporswitchbreak(Label_0088)
                            }
                            
                            looporswitchbreak()
                        }
                    }
                }
            }
            
            Label_0088:
            return:void()
        }
        
        goto(Label_0006)
    }
    
    public void \u40a9\u67e9\ud4fe\ubb2b\u12cb\u64f2(\u6ec6\ubb2b\uf94d\u6d99\u4f52.\uae87\u3bc9\u3bc9\u7049\uc246\u3e75 p0, \u7c6b\u7c6b\ubefe\u385b\u3c25.\u4ab3\ub83f\u718f\ucb79\u120d.\u6b5f\u5f50\ubefe\ucfaf\u4f52\ub18d p1) {
        var_3_660 : int
        var_5_8A : int
        var_6_91 : int
        var_7_A0 : double
        var_9_C8 : double
        var_3_DA : int
        var_11_EB : int
        var_14_115 : double
        var_16_119 : int
        var_12_111 : double
        var_17_66B : int
        
        if (cmpne:boolean(ldc:int(15), ldc:int(0))) {
        }
        
        Label_0006:
        
        if (cmpeq:boolean(ldc:int(14), ldc:int(0))) {
            goto(Label_0006)
        }
        
        if (cmpeq:boolean(ldc:int(2), ldc:int(0))) {
            loop {
                invokevirtual:void(PrintStream::println, getstatic:PrintStream(System::out), ldc:String("#0"))
                
                if (cmpne:boolean(ldc:int(2), ldc:int(0))) {
                    loop {
                        Label_0028:
                        invokevirtual:void(PrintStream::println, getstatic:PrintStream(System::out), ldc:String("#1"))
                        
                        if (cmpne:boolean(ldc:int(2), ldc:int(0))) {
                            do {
                                invokevirtual:void(PrintStream::println, getstatic:PrintStream(System::out), ldc:String("#2"))
                            } while (cmpeq:boolean(ldc:int(2), ldc:int(0)))
                            
                            do {
                                invokevirtual:void(PrintStream::println, getstatic:PrintStream(System::out), ldc:String("#3"))
                                
                                if (cmpeq:boolean(ldc:int(2), ldc:int(0))) {
                                    loopcontinue(Label_0028)
                                }
                                
                                do {
                                    invokevirtual:void(PrintStream::println, getstatic:PrintStream(System::out), ldc:String("#4"))
                                } while (cmpeq:boolean(ldc:int(2), ldc:int(0)))
                                
                                invokevirtual:void(PrintStream::println, getstatic:PrintStream(System::out), ldc:String("#5"))
                            } while (cmpeq:boolean(ldc:int(2), ldc:int(0)))
                            
                            looporswitchbreak(Label_0088)
                        }
                        
                        looporswitchbreak()
                    }
                }
            }
        }
        
        Label_0088:
        var_3_660 = and:int(ldc:int(-2016593278), ldc:int(-941890839))
        
        if (cmpeq:boolean(getstatic:double(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u6c56\u8cae\uc31c\u446c\uc9f6\u873d), ldc:double(0.0))) {
            invokestatic:void(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u0800\u2dcc\uc4d2\u8aa5\u4cd9\u51b2, this:\u4d85\u3bc9\u8413\u8308\u3711\ub70c[expected:Object], p0:\uae87\u3bc9\u3bc9\u7049\uc246\u3e75[expected:Object])
            goto(Label_0180)
        }
        
        Label_0108:
        
        if (cmpne:boolean(and:int(var_3_660:int, ldc:int(16384)), ldc:int(0))) {
            var_3_660 = and:int(var_3_660:int, ldc:int(-1428396942))
        }
        else {
            var_3_660 = and:int(var_3_660:int, ldc:int(-825525311))
            var_5_8A = and:int(ldc:int(20503), ldc:int(-20504))
            var_6_91 = invokestatic:int(\uae87\u3bc9\u3bc9\u7049\uc246\u3e75::\u8389\u3bd6\u3bc9\uc2bd\u8640\u52d3)
            var_7_A0 = loadelement:double(getstatic:double[](\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), and:int(ldc:int(-29357), ldc:int(4780)))
            invokestatic:int(m::a)
            
            loop {
                var_9_C8 = ldc:double(0.0)
                
                if (cmpne:boolean(getstatic:ap(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::a), getstatic:ap(ap::a))) {
                    var_3_DA = and:int(var_3_660:int, ldc:int(-2014720807))
                    var_9_C8 = sub:double(var_7_A0:double, mul:double(getstatic:double(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u6c56\u8cae\uc31c\u446c\uc9f6\u873d), ldc:double(0.001)))
                    var_11_EB = var_5_8A:int
                    
                    while (logicaland:boolean(cmplt:boolean(var_11_EB:int, sub:int(var_6_91:int, and:int(ldc:int(10321), ldc:int(9)))), cmplt:boolean(loadelement:double(getstatic:double[](\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), add:int(var_11_EB:int, xor:int(ldc:int(2194), ldc:int(2195)))), var_7_A0:double))) {
                        inc:int(var_11_EB, ldc:int(1))
                    }
                    
                    var_3_660 = and:int(var_3_DA:int, ldc:int(-153530491))
                    var_14_115 = var_7_A0:double
                    var_16_119 = var_11_EB:int
                }
                else {
                    var_11_EB = sub:int(add:int(invokestatic:int(d::a, getstatic:double(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u6c56\u8cae\uc31c\u446c\uc9f6\u873d)), var_5_8A:int), and:int(ldc:int(531), ldc:int(12557)))
                    var_12_111 = var_14_115 = loadelement(getstatic(\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), var_5_8A)
                    
                    if (cmplt:boolean(var_16_119 = var_11_EB:int, var_6_91:int)) {
                        var_9_C8 = loadelement:double(getstatic:double[](\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), var_11_EB:int)
                        var_16_119 = var_11_EB:int
                        var_14_115 = var_12_111:double
                    }
                }
                
                loop {
                    if (cmpne:boolean(and:int(var_3_660:int, ldc:int(134217728)), ldc:int(0))) {
                        goto(Label_1528)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_660:int, ldc:int(16)), ldc:int(0))) {
                        goto(Label_1364)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_660:int, ldc:int(1048576)), ldc:int(0))) {
                        goto(Label_1256)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_660:int, ldc:int(256)), ldc:int(0))) {
                        goto(Label_1141)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_660:int, ldc:int(16384)), ldc:int(0))) {
                        goto(Label_0972)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_660:int, ldc:int(536870912)), ldc:int(0))) {
                        var_3_660 = and:int(var_3_660:int, ldc:int(-296061373))
                        goto(Label_0831)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_660:int, ldc:int(4194304)), ldc:int(0))) {
                        goto(Label_0681)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_660:int, ldc:int(65536)), ldc:int(0))) {
                        goto(Label_0557)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_660:int, ldc:int(8)), ldc:int(0))) {
                        var_3_660 = and:int(var_3_660:int, ldc:int(1224596261))
                    }
                    else {
                        var_3_660 = and:int(var_3_660:int, ldc:int(-1208154949))
                        
                        if (cmplt:boolean(var_16_119:int, var_6_91:int)) {
                            if (cmpne:boolean(getstatic:ao(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::i), getstatic:ao(ao::a))) {
                                goto(Label_0557)
                            }
                            
                            goto(Label_0831)
                        }
                    }
                    
                    Label_0391:
                    
                    if (cmpeq:boolean(and:int(var_3_660:int, ldc:int(33554432)), ldc:int(0))) {
                        goto(Label_1528)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_660:int, ldc:int(131072)), ldc:int(0))) {
                        var_3_660 = and:int(var_3_660:int, ldc:int(1694354919))
                        goto(Label_1364)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_660:int, ldc:int(33554432)), ldc:int(0))) {
                        var_3_660 = and:int(var_3_660:int, ldc:int(-1517205459))
                        goto(Label_1256)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_660:int, ldc:int(536870912)), ldc:int(0))) {
                        goto(Label_1141)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_660:int, ldc:int(32)), ldc:int(0))) {
                        goto(Label_0972)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_660:int, ldc:int(65536)), ldc:int(0))) {
                        var_3_660 = and:int(var_3_660:int, ldc:int(-712332421))
                        goto(Label_0831)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_660:int, ldc:int(4194304)), ldc:int(0))) {
                        var_3_660 = and:int(var_3_660:int, ldc:int(744027890))
                        goto(Label_0681)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_660:int, ldc:int(1073741824)), ldc:int(0))) {
                        if (cmpeq:boolean(and:int(var_3_660:int, ldc:int(1073741824)), ldc:int(0))) {
                            var_3_660 = and:int(var_3_660:int, ldc:int(-890386005))
                            var_11_EB = and:int(ldc:int(-3282), ldc:int(3281))
                            goto(Label_1517)
                        }
                        
                        loopcontinue()
                    }
                    
                    Label_0557:
                    
                    if (cmpne:boolean(and:int(var_3_660:int, ldc:int(256)), ldc:int(0))) {
                        goto(Label_1528)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_660:int, ldc:int(536870912)), ldc:int(0))) {
                        goto(Label_1364)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_660:int, ldc:int(33554432)), ldc:int(0))) {
                        goto(Label_1256)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_660:int, ldc:int(536870912)), ldc:int(0))) {
                        var_3_660 = and:int(var_3_660:int, ldc:int(1363711950))
                        goto(Label_1141)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_660:int, ldc:int(128)), ldc:int(0))) {
                        goto(Label_0972)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_660:int, ldc:int(1073741824)), ldc:int(0))) {
                        goto(Label_0831)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_660:int, ldc:int(2147483647)), ldc:int(0))) {
                        var_3_660 = and:int(var_3_660:int, ldc:int(-223982287))
                    }
                    else {
                        if (cmpeq:boolean(and:int(var_3_660:int, ldc:int(128)), ldc:int(0))) {
                            var_3_660 = and:int(var_3_660:int, ldc:int(-1106124069))
                            goto(Label_0391)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_660:int, ldc:int(524288)), ldc:int(0))) {
                            var_3_660 = and:int(var_3_660:int, ldc:int(522716089))
                            loopcontinue()
                        }
                        
                        var_3_660 = and:int(var_3_660:int, ldc:int(-202663741))
                        
                        if (cmpeq:boolean(getstatic:ao(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::i), getstatic:ao(ao::c))) {
                            var_14_115 = var_9_C8:double
                            goto(Label_0831)
                        }
                    }
                    
                    Label_0681:
                    
                    if (cmpne:boolean(and:int(var_3_660:int, ldc:int(8)), ldc:int(0))) {
                        var_3_660 = and:int(var_3_660:int, ldc:int(475684601))
                        goto(Label_1528)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_660:int, ldc:int(8)), ldc:int(0))) {
                        goto(Label_1364)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_660:int, ldc:int(4194304)), ldc:int(0))) {
                        var_3_660 = and:int(var_3_660:int, ldc:int(-473966778))
                        goto(Label_1256)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_660:int, ldc:int(536870912)), ldc:int(0))) {
                        goto(Label_1141)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_660:int, ldc:int(8388608)), ldc:int(0))) {
                        var_3_660 = and:int(var_3_660:int, ldc:int(358776480))
                        goto(Label_0972)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_660:int, ldc:int(16384)), ldc:int(0))) {
                        var_3_660 = and:int(var_3_660:int, ldc:int(1475742061))
                    }
                    else {
                        if (cmpeq:boolean(and:int(var_3_660:int, ldc:int(33554432)), ldc:int(0))) {
                            var_3_660 = and:int(var_3_660:int, ldc:int(941445507))
                            goto(Label_0557)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_660:int, ldc:int(131072)), ldc:int(0))) {
                            var_3_660 = and:int(var_3_660:int, ldc:int(-628434621))
                            goto(Label_0391)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_660:int, ldc:int(4)), ldc:int(0))) {
                            loopcontinue()
                        }
                        
                        var_3_660 = and:int(var_3_660:int, ldc:int(-1812373621))
                        var_14_115 = mul:double(ldc:double(0.5), add:double(var_9_C8:double, var_14_115:double))
                    }
                    
                    Label_0831:
                    
                    if (cmpeq:boolean(and:int(var_3_660:int, ldc:int(128)), ldc:int(0))) {
                        goto(Label_1528)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_660:int, ldc:int(65536)), ldc:int(0))) {
                        var_3_660 = and:int(var_3_660:int, ldc:int(-1896662932))
                        goto(Label_1364)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_660:int, ldc:int(16)), ldc:int(0))) {
                        var_3_660 = and:int(var_3_660:int, ldc:int(-829746108))
                        goto(Label_1256)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_660:int, ldc:int(16384)), ldc:int(0))) {
                        var_3_660 = and:int(var_3_660:int, ldc:int(-1569808866))
                        goto(Label_1141)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_660:int, ldc:int(2147483647)), ldc:int(0))) {
                        if (cmpne:boolean(and:int(var_3_660:int, ldc:int(32768)), ldc:int(0))) {
                            var_3_660 = and:int(var_3_660:int, ldc:int(-1916436635))
                            goto(Label_0681)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_660:int, ldc:int(4)), ldc:int(0))) {
                            goto(Label_0557)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_660:int, ldc:int(33554432)), ldc:int(0))) {
                            var_3_660 = and:int(var_3_660:int, ldc:int(-2061383042))
                            goto(Label_0391)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_660:int, ldc:int(131072)), ldc:int(0))) {
                            var_3_660 = and:int(var_3_660:int, ldc:int(-209572247))
                            loopcontinue()
                        }
                        
                        var_3_660 = and:int(var_3_660:int, ldc:int(-201749332))
                        
                        if (cmpeq:boolean(getstatic:ap(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::a), getstatic:ap(ap::b))) {
                            if (cmplt:boolean(loadelement:double(getstatic:double[](\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), var_5_8A:int), var_7_A0:double)) {
                                var_11_EB = and:int(ldc:int(7945), ldc:int(16385))
                                goto(Label_1141)
                            }
                        }
                    }
                    
                    Label_0972:
                    
                    if (cmpne:boolean(and:int(var_3_660:int, ldc:int(8)), ldc:int(0))) {
                        goto(Label_1528)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_660:int, ldc:int(524288)), ldc:int(0))) {
                        var_3_660 = and:int(var_3_660:int, ldc:int(1987903268))
                        goto(Label_1364)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_660:int, ldc:int(16384)), ldc:int(0))) {
                        goto(Label_1256)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_660:int, ldc:int(4194304)), ldc:int(0))) {
                        var_3_660 = and:int(var_3_660:int, ldc:int(1115762176))
                    }
                    else {
                        if (cmpeq:boolean(and:int(var_3_660:int, ldc:int(524288)), ldc:int(0))) {
                            var_3_660 = and:int(var_3_660:int, ldc:int(-1096238389))
                            goto(Label_0831)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_660:int, ldc:int(1073741824)), ldc:int(0))) {
                            goto(Label_0681)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_660:int, ldc:int(32768)), ldc:int(0))) {
                            goto(Label_0557)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_660:int, ldc:int(1073741824)), ldc:int(0))) {
                            var_3_660 = and:int(var_3_660:int, ldc:int(529728892))
                            goto(Label_0391)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_660:int, ldc:int(1073741824)), ldc:int(0))) {
                            var_3_660 = and:int(var_3_660:int, ldc:int(1610792041))
                            loopcontinue()
                        }
                        
                        var_3_660 = and:int(var_3_660:int, ldc:int(-1076285303))
                        var_11_EB = and:int(ldc:int(9334), ldc:int(-9335))
                    }
                    
                    Label_1141:
                    
                    if (cmpeq:boolean(and:int(var_3_660:int, ldc:int(524288)), ldc:int(0))) {
                        var_3_660 = and:int(var_3_660:int, ldc:int(-2135258574))
                        goto(Label_1528)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_660:int, ldc:int(134217728)), ldc:int(0))) {
                        var_3_660 = and:int(var_3_660:int, ldc:int(-352132890))
                        goto(Label_1364)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_660:int, ldc:int(131072)), ldc:int(0))) {
                        var_3_660 = and:int(var_3_660:int, ldc:int(1762528658))
                    }
                    else {
                        if (cmpne:boolean(and:int(var_3_660:int, ldc:int(131072)), ldc:int(0))) {
                            goto(Label_0972)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_660:int, ldc:int(4)), ldc:int(0))) {
                            goto(Label_0831)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_660:int, ldc:int(33554432)), ldc:int(0))) {
                            goto(Label_0681)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_660:int, ldc:int(1048576)), ldc:int(0))) {
                            goto(Label_0557)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_660:int, ldc:int(65536)), ldc:int(0))) {
                            goto(Label_0391)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_660:int, ldc:int(65536)), ldc:int(0))) {
                            loopcontinue()
                        }
                        
                        var_3_660 = and:int(var_3_660:int, ldc:int(-1765027607))
                        
                        if (cmpne:boolean(getstatic:ap(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::a), getstatic:ap(ap::a))) {
                            if (cmpeq:boolean(var_11_EB:int, ldc:int(0))) {
                                goto(Label_1364)
                            }
                        }
                    }
                    
                    Label_1256:
                    
                    if (cmpne:boolean(and:int(var_3_660:int, ldc:int(131072)), ldc:int(0))) {
                        goto(Label_1528)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_660:int, ldc:int(16384)), ldc:int(0))) {
                        if (cmpne:boolean(and:int(var_3_660:int, ldc:int(32768)), ldc:int(0))) {
                            goto(Label_1141)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_660:int, ldc:int(524288)), ldc:int(0))) {
                            goto(Label_0972)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_660:int, ldc:int(4194304)), ldc:int(0))) {
                            goto(Label_0831)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_660:int, ldc:int(1073741824)), ldc:int(0))) {
                            goto(Label_0681)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_660:int, ldc:int(1048576)), ldc:int(0))) {
                            goto(Label_0557)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_660:int, ldc:int(16)), ldc:int(0))) {
                            goto(Label_0391)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_660:int, ldc:int(4194304)), ldc:int(0))) {
                            var_3_660 = and:int(var_3_660:int, ldc:int(-1090166555))
                            loopcontinue()
                        }
                        
                        var_3_660 = and:int(var_3_660:int, ldc:int(-757203219))
                        invokestatic:void(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u0800\u2dcc\uc4d2\u8aa5\u4cd9\u51b2, p0:\uae87\u3bc9\u3bc9\u7049\uc246\u3e75, var_14_115:double, var_5_8A:int, var_16_119:int)
                        goto(Label_1517)
                    }
                    
                    Label_1364:
                    
                    if (cmpne:boolean(and:int(var_3_660:int, ldc:int(16384)), ldc:int(0))) {
                        var_3_660 = and:int(var_3_660:int, ldc:int(544669827))
                        goto(Label_1528)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_660:int, ldc:int(33554432)), ldc:int(0))) {
                        var_3_660 = and:int(var_3_660:int, ldc:int(1070449774))
                        goto(Label_1256)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_660:int, ldc:int(131072)), ldc:int(0))) {
                        goto(Label_1141)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_660:int, ldc:int(8)), ldc:int(0))) {
                        var_3_660 = and:int(var_3_660:int, ldc:int(-1466199171))
                        goto(Label_0972)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_660:int, ldc:int(16)), ldc:int(0))) {
                        var_3_660 = and:int(var_3_660:int, ldc:int(-1343604028))
                        goto(Label_0831)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_660:int, ldc:int(524288)), ldc:int(0))) {
                        goto(Label_0681)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_660:int, ldc:int(1073741824)), ldc:int(0))) {
                        var_3_660 = and:int(var_3_660:int, ldc:int(-451068955))
                        goto(Label_0557)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_660:int, ldc:int(16384)), ldc:int(0))) {
                        goto(Label_0391)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_660:int, ldc:int(134217728)), ldc:int(0))) {
                        var_3_660 = and:int(var_3_660:int, ldc:int(187176683))
                        loopcontinue()
                    }
                    
                    var_3_660 = and:int(var_3_660:int, ldc:int(-1143099197))
                    invokestatic:void(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u0800\u2dcc\uc4d2\u8aa5\u4cd9\u51b2, invokestatic:boolean(\uae87\u3bc9\u3bc9\u7049\uc246\u3e75::\u0a06\u59ec\u93a2\u9937\ub83f\ub171), var_14_115:double, ldc:double(0.0))
                    Label_1517:
                    
                    if (cmpne:boolean(getstatic:ap(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::a), getstatic:ap(ap::a))) {
                        var_17_66B = var_5_8A:int
                        
                        if (cmpeq:boolean(var_11_EB:int, ldc:int(0))) {
                            looporswitchbreak()
                        }
                    }
                    
                    Label_1528:
                    
                    if (cmpne:boolean(and:int(var_3_660:int, ldc:int(8)), ldc:int(0))) {
                        var_3_660 = and:int(var_3_660:int, ldc:int(22625327))
                        goto(Label_1364)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_660:int, ldc:int(33554432)), ldc:int(0))) {
                        var_3_660 = and:int(var_3_660:int, ldc:int(780457991))
                        goto(Label_1256)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_660:int, ldc:int(33554432)), ldc:int(0))) {
                        goto(Label_1141)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_660:int, ldc:int(32)), ldc:int(0))) {
                        goto(Label_0972)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_660:int, ldc:int(1073741824)), ldc:int(0))) {
                        goto(Label_0831)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_660:int, ldc:int(16384)), ldc:int(0))) {
                        goto(Label_0681)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_660:int, ldc:int(1073741824)), ldc:int(0))) {
                        var_3_660 = and:int(var_3_660:int, ldc:int(279123320))
                        goto(Label_0557)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_660:int, ldc:int(8)), ldc:int(0))) {
                        goto(Label_0391)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_660:int, ldc:int(4)), ldc:int(0))) {
                        var_3_660 = and:int(var_3_660:int, ldc:int(-1831921017))
                        var_17_66B = add:int(var_16_119:int, xor:int(ldc:int(12480), ldc:int(12481)))
                        looporswitchbreak()
                    }
                }
                
                var_3_660 = and:int(var_3_660:int, ldc:int(-755391096))
                
                if (cmple:boolean(var_5_8A = var_17_66B:int, sub:int(var_6_91:int, and:int(ldc:int(17025), ldc:int(4159))))) {
                    loopcontinue()
                }
                
                looporswitchbreak()
            }
        }
        
        Label_0180:
        
        if (cmpeq:boolean(and:int(var_3_660:int, ldc:int(32)), ldc:int(0))) {
            return:void()
        }
        
        goto(Label_0108)
    }
}
