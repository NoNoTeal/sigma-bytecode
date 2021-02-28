public class \u71f1\uc910\u3bc9\u516c\u93a2.\u6cfe\u64f2\u67e9\u5f50\u67d0 {
    public void \u6cfe\u64f2\u67e9\u5f50\u67d0(\u6cfe\u16f6\u4c04\u61a4\u8bb0.\u416d\u4179\u5db4\u4179\u839e p0) {
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
            putfield:\u416d\u4179\u5db4\u4179\u839e(\u6cfe\u64f2\u67e9\u5f50\u67d0::\uceb8\ud217\u5fe1\uc7fe\ud12e\u8308, this:\u6cfe\u64f2\u67e9\u5f50\u67d0, p0:\u416d\u4179\u5db4\u4179\u839e)
            invokespecial:Object(Object::<init>, this:\u6cfe\u64f2\u67e9\u5f50\u67d0)
            return:void()
        }
        
        goto(Label_0006)
    }
    
    public boolean test(\u71f1\uc910\u3bc9\u516c\u93a2.\ube23\u67d0\u64f2\u839e\u76bc p0) {
        var_2_2DB : int
        stack_364_0 : int [generated]
        stack_41B_0 : int [generated]
        
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
        var_2_2DB = and:int(ldc:int(-585874085), ldc:int(1301404511))
        
        if (logicalnot:boolean(instanceof:boolean(\u6cfe\u16f6\u4c04\u61a4\u8bb0.\u416d\u4179\u5db4\u4179\u839e.class, p0:\ube23\u67d0\u64f2\u839e\u76bc))) {
            loop {
                if (cmpeq:boolean(and:int(var_2_2DB:int, ldc:int(2)), ldc:int(0))) {
                    goto(Label_0880)
                }
                
                if (cmpeq:boolean(and:int(var_2_2DB:int, ldc:int(2)), ldc:int(0))) {
                    goto(Label_0756)
                }
                
                if (cmpeq:boolean(and:int(var_2_2DB:int, ldc:int(2)), ldc:int(0))) {
                    goto(Label_0630)
                }
                
                if (cmpeq:boolean(and:int(var_2_2DB:int, ldc:int(16)), ldc:int(0))) {
                    var_2_2DB = and:int(var_2_2DB:int, ldc:int(1919141843))
                    goto(Label_0537)
                }
                
                if (cmpeq:boolean(and:int(var_2_2DB:int, ldc:int(2147483647)), ldc:int(0))) {
                    var_2_2DB = and:int(var_2_2DB:int, ldc:int(-1398535808))
                    goto(Label_0437)
                }
                
                if (cmpne:boolean(and:int(var_2_2DB:int, ldc:int(512)), ldc:int(0))) {
                    var_2_2DB = and:int(var_2_2DB:int, ldc:int(1851119154))
                    goto(Label_0336)
                }
                
                if (cmpne:boolean(and:int(var_2_2DB:int, ldc:int(2)), ldc:int(0))) {
                    var_2_2DB = and:int(var_2_2DB:int, ldc:int(1572028795))
                    
                    if (logicalnot:boolean(instanceof:boolean(\u56bd\u8413\u647c\u5bc4\ud158.\u97b7\u183a\ud7e8\u183a\ub113.class, p0:\ube23\u67d0\u64f2\u839e\u76bc))) {
                        if (logicalnot:boolean(instanceof:boolean(\u7c6b\u7c6b\ubefe\u385b\u3c25.\ud7e8\u0800\uae87\u8d90\u183a.\u5140\u7e3f\u67d0\u7873\u12cb.class, p0:\ube23\u67d0\u64f2\u839e\u76bc))) {
                            if (logicalnot:boolean(instanceof:boolean(\u51b2\u6fb0\ufcaf\u61a4\u0800.\u3711\u7ce1\u76bc\u7049\u16f6.class, p0:\ube23\u67d0\u64f2\u839e\u76bc))) {
                                if (logicalnot:boolean(instanceof:boolean(\u3bc9\u67e9\uc87f\u47c2\u5f50.\u16f6\u40a9\u5f50\ub113\ud51e.\u36d3\u2dcc\ub113\u5654\uceb8.class, p0:\ube23\u67d0\u64f2\u839e\u76bc))) {
                                    goto(Label_0336)
                                }
                                
                                if (invokevirtual:boolean(\u36d3\u2dcc\ub113\u5654\uceb8::\u3bd6\u88c5\ud158\ubf56\u8cae\u983f, checkcast:\u36d3\u2dcc\ub113\u5654\uceb8(\u3bc9\u67e9\uc87f\u47c2\u5f50.\u16f6\u40a9\u5f50\ub113\ud51e.\u36d3\u2dcc\ub113\u5654\uceb8.class, p0:\ube23\u67d0\u64f2\u839e\u76bc[expected:\u36d3\u2dcc\ub113\u5654\uceb8]))) {
                                    goto(Label_0756)
                                }
                                
                                stack_364_0 = xor:int(ldc:int(130), ldc:int(131))
                                looporswitchbreak()
                            }
                        }
                    }
                }
                
                Label_0188:
                
                if (cmpne:boolean(and:int(var_2_2DB:int, ldc:int(8192)), ldc:int(0))) {
                    goto(Label_0880)
                }
                
                if (cmpeq:boolean(and:int(var_2_2DB:int, ldc:int(67108864)), ldc:int(0))) {
                    goto(Label_0756)
                }
                
                if (cmpeq:boolean(and:int(var_2_2DB:int, ldc:int(64)), ldc:int(0))) {
                    var_2_2DB = and:int(var_2_2DB:int, ldc:int(1792943695))
                    goto(Label_0630)
                }
                
                if (cmpne:boolean(and:int(var_2_2DB:int, ldc:int(4096)), ldc:int(0))) {
                    goto(Label_0537)
                }
                
                if (cmpeq:boolean(and:int(var_2_2DB:int, ldc:int(16)), ldc:int(0))) {
                    var_2_2DB = and:int(var_2_2DB:int, ldc:int(2131021234))
                    goto(Label_0437)
                }
                
                if (cmpeq:boolean(and:int(var_2_2DB:int, ldc:int(16384)), ldc:int(0))) {
                    var_2_2DB = and:int(var_2_2DB:int, ldc:int(-1026078637))
                }
                else {
                    if (cmpne:boolean(and:int(var_2_2DB:int, ldc:int(8192)), ldc:int(0))) {
                        var_2_2DB = and:int(var_2_2DB:int, ldc:int(-1923306913))
                        loopcontinue()
                    }
                    
                    return:boolean(xor:int[expected:boolean](ldc:int(2241), ldc:int(2240)))
                }
                
                Label_0336:
                
                if (cmpne:boolean(and:int(var_2_2DB:int, ldc:int(8192)), ldc:int(0))) {
                    var_2_2DB = and:int(var_2_2DB:int, ldc:int(-1903418133))
                    goto(Label_0880)
                }
                
                if (cmpeq:boolean(and:int(var_2_2DB:int, ldc:int(16384)), ldc:int(0))) {
                    var_2_2DB = and:int(var_2_2DB:int, ldc:int(-1454410353))
                    goto(Label_0756)
                }
                
                if (cmpeq:boolean(and:int(var_2_2DB:int, ldc:int(1073741824)), ldc:int(0))) {
                    var_2_2DB = and:int(var_2_2DB:int, ldc:int(190315354))
                    goto(Label_0630)
                }
                
                if (cmpeq:boolean(and:int(var_2_2DB:int, ldc:int(256)), ldc:int(0))) {
                    goto(Label_0537)
                }
                
                if (cmpne:boolean(and:int(var_2_2DB:int, ldc:int(8)), ldc:int(0))) {
                    if (cmpeq:boolean(and:int(var_2_2DB:int, ldc:int(16)), ldc:int(0))) {
                        var_2_2DB = and:int(var_2_2DB:int, ldc:int(1591213142))
                        goto(Label_0188)
                    }
                    
                    if (cmpeq:boolean(and:int(var_2_2DB:int, ldc:int(1073741824)), ldc:int(0))) {
                        var_2_2DB = and:int(var_2_2DB:int, ldc:int(-783706909))
                        loopcontinue()
                    }
                    
                    var_2_2DB = and:int(var_2_2DB:int, ldc:int(-281061381))
                    
                    if (instanceof:boolean(\u7c6b\u7c6b\ubefe\u385b\u3c25.\ud7e8\u0800\uae87\u8d90\u183a.\u7c6b\ubded\u0b8e\u2dcc\u8c8a.\ud12e\u16f6\u8d98\u4c04\u16f6.\ua3b4\u8aa5\ub113\ubf56\u873d.class, p0:\ube23\u67d0\u64f2\u839e\u76bc)) {
                        if (invokevirtual:boolean(\u7d52\u718f\u3776\u6fb0\ub83f::\u5db4\u3d64\u97e6\u8d98\ucb79\u3711, p0:\ube23\u67d0\u64f2\u839e\u76bc[expected:\u7d52\u718f\u3776\u6fb0\ub83f])) {
                            goto(Label_0880)
                        }
                        
                        if (invokevirtual:boolean(\ua3b4\u8aa5\ub113\ubf56\u873d::\u120d\u946b\uff55\u8389\u3e75\uff55, checkcast:\ua3b4\u8aa5\ub113\ubf56\u873d(\u7c6b\u7c6b\ubefe\u385b\u3c25.\ud7e8\u0800\uae87\u8d90\u183a.\u7c6b\ubded\u0b8e\u2dcc\u8c8a.\ud12e\u16f6\u8d98\u4c04\u16f6.\ua3b4\u8aa5\ub113\ubf56\u873d.class, p0:\ube23\u67d0\u64f2\u839e\u76bc[expected:\ua3b4\u8aa5\ub113\ubf56\u873d]))) {
                            goto(Label_0880)
                        }
                    }
                }
                
                Label_0437:
                
                if (cmpne:boolean(and:int(var_2_2DB:int, ldc:int(2048)), ldc:int(0))) {
                    var_2_2DB = and:int(var_2_2DB:int, ldc:int(1504097742))
                    goto(Label_0880)
                }
                
                if (cmpeq:boolean(and:int(var_2_2DB:int, ldc:int(1073741824)), ldc:int(0))) {
                    var_2_2DB = and:int(var_2_2DB:int, ldc:int(933613173))
                    goto(Label_0756)
                }
                
                if (cmpne:boolean(and:int(var_2_2DB:int, ldc:int(2048)), ldc:int(0))) {
                    var_2_2DB = and:int(var_2_2DB:int, ldc:int(1115841693))
                    goto(Label_0630)
                }
                
                if (cmpeq:boolean(and:int(var_2_2DB:int, ldc:int(8)), ldc:int(0))) {
                    var_2_2DB = and:int(var_2_2DB:int, ldc:int(2135532196))
                }
                else {
                    if (cmpeq:boolean(and:int(var_2_2DB:int, ldc:int(2)), ldc:int(0))) {
                        goto(Label_0336)
                    }
                    
                    if (cmpne:boolean(and:int(var_2_2DB:int, ldc:int(33554432)), ldc:int(0))) {
                        goto(Label_0188)
                    }
                    
                    if (cmpeq:boolean(and:int(var_2_2DB:int, ldc:int(16777216)), ldc:int(0))) {
                        loopcontinue()
                    }
                    
                    var_2_2DB = and:int(var_2_2DB:int, ldc:int(1734243291))
                    
                    if (invokestatic:boolean(\u416d\u4179\u5db4\u4179\u839e::\ucfaf\ud158\u7bad\u3a62\u12cb\uae5d, getfield:\u416d\u4179\u5db4\u4179\u839e(\u6cfe\u64f2\u67e9\u5f50\u67d0::\uceb8\ud217\u5fe1\uc7fe\ud12e\u8308, this:\u6cfe\u64f2\u67e9\u5f50\u67d0), invokevirtual:UUID(\u7d52\u718f\u3776\u6fb0\ub83f::\u40a9\u9255\u7af6\u64f2\u5245\uc7fe, p0:\ube23\u67d0\u64f2\u839e\u76bc[expected:\u7d52\u718f\u3776\u6fb0\ub83f]))) {
                        return:boolean(and:int[expected:boolean](ldc:int(24774), ldc:int(-25319)))
                    }
                }
                
                Label_0537:
                
                if (cmpne:boolean(and:int(var_2_2DB:int, ldc:int(33554432)), ldc:int(0))) {
                    var_2_2DB = and:int(var_2_2DB:int, ldc:int(579018284))
                    goto(Label_0880)
                }
                
                if (cmpne:boolean(and:int(var_2_2DB:int, ldc:int(512)), ldc:int(0))) {
                    var_2_2DB = and:int(var_2_2DB:int, ldc:int(-1753432267))
                    goto(Label_0756)
                }
                
                if (cmpeq:boolean(and:int(var_2_2DB:int, ldc:int(512)), ldc:int(0))) {
                    if (cmpeq:boolean(and:int(var_2_2DB:int, ldc:int(16384)), ldc:int(0))) {
                        var_2_2DB = and:int(var_2_2DB:int, ldc:int(1206271534))
                        goto(Label_0437)
                    }
                    
                    if (cmpeq:boolean(and:int(var_2_2DB:int, ldc:int(2)), ldc:int(0))) {
                        var_2_2DB = and:int(var_2_2DB:int, ldc:int(-508289142))
                        goto(Label_0336)
                    }
                    
                    if (cmpeq:boolean(and:int(var_2_2DB:int, ldc:int(1)), ldc:int(0))) {
                        goto(Label_0188)
                    }
                    
                    if (cmpeq:boolean(and:int(var_2_2DB:int, ldc:int(16384)), ldc:int(0))) {
                        loopcontinue()
                    }
                    
                    var_2_2DB = and:int(var_2_2DB:int, ldc:int(-948047493))
                    
                    if (logicalnot:boolean(invokevirtual:boolean(\ube23\u67d0\u64f2\u839e\u76bc::\u983f\u927d\u7006\ub19c\u4bc8\u4daf, p0:\ube23\u67d0\u64f2\u839e\u76bc))) {
                        if (logicalnot:boolean(invokevirtual:boolean(\u7d52\u718f\u3776\u6fb0\ub83f::\u3dd3\uf995\u9255\u0b8e\u7006\u6435, p0:\ube23\u67d0\u64f2\u839e\u76bc[expected:\u7d52\u718f\u3776\u6fb0\ub83f]))) {
                            stack_41B_0 = and:int[expected:boolean](ldc:int(4133), ldc:int(131))
                            return:boolean(stack_41B_0:boolean)
                        }
                    }
                }
                
                Label_0630:
                
                if (cmpne:boolean(and:int(var_2_2DB:int, ldc:int(512)), ldc:int(0))) {
                    var_2_2DB = and:int(var_2_2DB:int, ldc:int(-1267535273))
                    goto(Label_0880)
                }
                
                if (cmpne:boolean(and:int(var_2_2DB:int, ldc:int(33554432)), ldc:int(0))) {
                    var_2_2DB = and:int(var_2_2DB:int, ldc:int(1701027646))
                }
                else {
                    if (cmpeq:boolean(and:int(var_2_2DB:int, ldc:int(16384)), ldc:int(0))) {
                        var_2_2DB = and:int(var_2_2DB:int, ldc:int(1161739814))
                        goto(Label_0537)
                    }
                    
                    if (cmpne:boolean(and:int(var_2_2DB:int, ldc:int(4096)), ldc:int(0))) {
                        var_2_2DB = and:int(var_2_2DB:int, ldc:int(436004056))
                        goto(Label_0437)
                    }
                    
                    if (cmpeq:boolean(and:int(var_2_2DB:int, ldc:int(64)), ldc:int(0))) {
                        var_2_2DB = and:int(var_2_2DB:int, ldc:int(-1485925407))
                        goto(Label_0336)
                    }
                    
                    if (cmpne:boolean(and:int(var_2_2DB:int, ldc:int(8192)), ldc:int(0))) {
                        goto(Label_0188)
                    }
                    
                    if (cmpeq:boolean(and:int(var_2_2DB:int, ldc:int(256)), ldc:int(0))) {
                        var_2_2DB = and:int(var_2_2DB:int, ldc:int(-497519065))
                        loopcontinue()
                    }
                    
                    var_2_2DB = and:int(var_2_2DB:int, ldc:int(2147148795))
                    stack_41B_0 = and:int[expected:boolean](ldc:int(-24055), ldc:int(7508))
                    return:boolean(stack_41B_0:boolean[expected:int])
                }
                
                Label_0756:
                
                if (cmpeq:boolean(and:int(var_2_2DB:int, ldc:int(2147483647)), ldc:int(0))) {
                    var_2_2DB = and:int(var_2_2DB:int, ldc:int(-115297703))
                }
                else {
                    if (cmpeq:boolean(and:int(var_2_2DB:int, ldc:int(16384)), ldc:int(0))) {
                        goto(Label_0630)
                    }
                    
                    if (cmpeq:boolean(and:int(var_2_2DB:int, ldc:int(2147483647)), ldc:int(0))) {
                        var_2_2DB = and:int(var_2_2DB:int, ldc:int(195245187))
                        goto(Label_0537)
                    }
                    
                    if (cmpeq:boolean(and:int(var_2_2DB:int, ldc:int(16777216)), ldc:int(0))) {
                        goto(Label_0437)
                    }
                    
                    if (cmpeq:boolean(and:int(var_2_2DB:int, ldc:int(16777216)), ldc:int(0))) {
                        var_2_2DB = and:int(var_2_2DB:int, ldc:int(-1098562795))
                        goto(Label_0336)
                    }
                    
                    if (cmpeq:boolean(and:int(var_2_2DB:int, ldc:int(8)), ldc:int(0))) {
                        goto(Label_0188)
                    }
                    
                    if (cmpeq:boolean(and:int(var_2_2DB:int, ldc:int(67108864)), ldc:int(0))) {
                        var_2_2DB = and:int(var_2_2DB:int, ldc:int(-997065991))
                        loopcontinue()
                    }
                    
                    var_2_2DB = and:int(var_2_2DB:int, ldc:int(1196540255))
                    stack_364_0 = and:int(ldc:int(8622), ldc:int(-8687))
                    looporswitchbreak()
                }
                
                Label_0880:
                
                if (cmpeq:boolean(and:int(var_2_2DB:int, ldc:int(256)), ldc:int(0))) {
                    var_2_2DB = and:int(var_2_2DB:int, ldc:int(966366163))
                    goto(Label_0756)
                }
                
                if (cmpeq:boolean(and:int(var_2_2DB:int, ldc:int(64)), ldc:int(0))) {
                    goto(Label_0630)
                }
                
                if (cmpeq:boolean(and:int(var_2_2DB:int, ldc:int(8)), ldc:int(0))) {
                    var_2_2DB = and:int(var_2_2DB:int, ldc:int(-307548308))
                    goto(Label_0537)
                }
                
                if (cmpne:boolean(and:int(var_2_2DB:int, ldc:int(8192)), ldc:int(0))) {
                    var_2_2DB = and:int(var_2_2DB:int, ldc:int(-1331917573))
                    goto(Label_0437)
                }
                
                if (cmpeq:boolean(and:int(var_2_2DB:int, ldc:int(2)), ldc:int(0))) {
                    goto(Label_0336)
                }
                
                if (cmpeq:boolean(and:int(var_2_2DB:int, ldc:int(1)), ldc:int(0))) {
                    var_2_2DB = and:int(var_2_2DB:int, ldc:int(-2048982637))
                    goto(Label_0188)
                }
                
                if (cmpeq:boolean(and:int(var_2_2DB:int, ldc:int(512)), ldc:int(0))) {
                    return:boolean(and:int[expected:boolean](ldc:int(13425), ldc:int(-13426)))
                }
                
                var_2_2DB = and:int(var_2_2DB:int, ldc:int(2085621242))
            }
            
            return:boolean(stack_364_0:int)
        }
        
        return:boolean(and:int[expected:boolean](ldc:int(-14348), ldc:int(14347)))
    }
    
    public boolean test(java.lang.Object p0) {
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
            return:boolean(invokevirtual:boolean(\u6cfe\u64f2\u67e9\u5f50\u67d0::test, this:\u6cfe\u64f2\u67e9\u5f50\u67d0, checkcast:\ube23\u67d0\u64f2\u839e\u76bc(\u71f1\uc910\u3bc9\u516c\u93a2.\ube23\u67d0\u64f2\u839e\u76bc.class, p0:Object[expected:\ube23\u67d0\u64f2\u839e\u76bc])))
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
    
    public void \u71ae\u6435\ubb2b\u8389\ubefe\ud4fe(\u6ec6\ubb2b\uf94d\u6d99\u4f52.\uae87\u3bc9\u3bc9\u7049\uc246\u3e75 p0, \u7c6b\u7c6b\ubefe\u385b\u3c25.\u4ab3\ub83f\u718f\ucb79\u120d.\u6b5f\u5f50\ubefe\ucfaf\u4f52\ub18d p1) {
        var_3_5FC : int
        var_5_85 : int
        var_6_8C : int
        var_7_9B : double
        var_9_C1 : double
        var_3_D2 : int
        var_11_E3 : int
        var_14_10D : double
        var_16_111 : int
        var_12_109 : double
        var_17_607 : int
        
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
        var_3_5FC = and:int(ldc:int(1923414598), ldc:int(1525871223))
        
        if (cmpeq:boolean(getstatic:double(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u6c56\u8cae\uc31c\u446c\uc9f6\u873d), ldc:double(0.0))) {
            invokestatic:void(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u0800\u2dcc\uc4d2\u8aa5\u4cd9\u51b2, this:\u6cfe\u64f2\u67e9\u5f50\u67d0[expected:Object], p0:\uae87\u3bc9\u3bc9\u7049\uc246\u3e75[expected:Object])
            goto(Label_0175)
        }
        
        Label_0106:
        
        if (cmpne:boolean(and:int(var_3_5FC:int, ldc:int(1048576)), ldc:int(0))) {
            var_3_5FC = and:int(var_3_5FC:int, ldc:int(1049304285))
        }
        else {
            var_3_5FC = and:int(var_3_5FC:int, ldc:int(-37522706))
            var_5_85 = and:int(ldc:int(838), ldc:int(-839))
            var_6_8C = invokestatic:int(\uae87\u3bc9\u3bc9\u7049\uc246\u3e75::\u8389\u3bd6\u3bc9\uc2bd\u8640\u52d3)
            var_7_9B = loadelement:double(getstatic:double[](\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), and:int(ldc:int(9535), ldc:int(-10048)))
            invokestatic:int(m::a)
            
            loop {
                var_9_C1 = ldc:double(0.0)
                
                if (cmpne:boolean(getstatic:ap(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::a), getstatic:ap(ap::a))) {
                    var_3_D2 = and:int(var_3_5FC:int, ldc:int(-89131033))
                    var_9_C1 = sub:double(var_7_9B:double, mul:double(getstatic:double(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u6c56\u8cae\uc31c\u446c\uc9f6\u873d), ldc:double(0.001)))
                    var_11_E3 = var_5_85:int
                    
                    while (logicaland:boolean(cmplt:boolean(var_11_E3:int, sub:int(var_6_8C:int, xor:int(ldc:int(-14328), ldc:int(-14327)))), cmplt:boolean(loadelement:double(getstatic:double[](\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), add:int(var_11_E3:int, and:int(ldc:int(16929), ldc:int(135)))), var_7_9B:double))) {
                        inc:int(var_11_E3, ldc:int(1))
                    }
                    
                    var_3_5FC = and:int(var_3_D2:int, ldc:int(2008119878))
                    var_14_10D = var_7_9B:double
                    var_16_111 = var_11_E3:int
                }
                else {
                    var_11_E3 = sub:int(add:int(invokestatic:int(d::a, getstatic:double(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u6c56\u8cae\uc31c\u446c\uc9f6\u873d)), var_5_85:int), xor:int(ldc:int(1062), ldc:int(1063)))
                    var_12_109 = var_14_10D = loadelement(getstatic(\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), var_5_85)
                    
                    if (cmplt:boolean(var_16_111 = var_11_E3:int, var_6_8C:int)) {
                        var_9_C1 = loadelement:double(getstatic:double[](\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), var_11_E3:int)
                        var_16_111 = var_11_E3:int
                        var_14_10D = var_12_109:double
                    }
                }
                
                loop {
                    if (cmpne:boolean(and:int(var_3_5FC:int, ldc:int(1048576)), ldc:int(0))) {
                        var_3_5FC = and:int(var_3_5FC:int, ldc:int(-2012498040))
                        goto(Label_1409)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_5FC:int, ldc:int(4)), ldc:int(0))) {
                        goto(Label_1269)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_5FC:int, ldc:int(4194304)), ldc:int(0))) {
                        var_3_5FC = and:int(var_3_5FC:int, ldc:int(1874133891))
                        goto(Label_1141)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_5FC:int, ldc:int(4194304)), ldc:int(0))) {
                        var_3_5FC = and:int(var_3_5FC:int, ldc:int(1830974951))
                        goto(Label_1025)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_5FC:int, ldc:int(524288)), ldc:int(0))) {
                        goto(Label_0882)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_5FC:int, ldc:int(65536)), ldc:int(0))) {
                        var_3_5FC = and:int(var_3_5FC:int, ldc:int(625197929))
                        goto(Label_0778)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_5FC:int, ldc:int(64)), ldc:int(0))) {
                        goto(Label_0644)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_5FC:int, ldc:int(67108864)), ldc:int(0))) {
                        goto(Label_0541)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_5FC:int, ldc:int(8388608)), ldc:int(0))) {
                        var_3_5FC = and:int(var_3_5FC:int, ldc:int(1355349991))
                        
                        if (cmplt:boolean(var_16_111:int, var_6_8C:int)) {
                            if (cmpne:boolean(getstatic:ao(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::i), getstatic:ao(ao::a))) {
                                goto(Label_0541)
                            }
                            
                            goto(Label_0778)
                        }
                    }
                    
                    Label_0389:
                    
                    if (cmpne:boolean(and:int(var_3_5FC:int, ldc:int(256)), ldc:int(0))) {
                        var_3_5FC = and:int(var_3_5FC:int, ldc:int(1569562655))
                        goto(Label_1409)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_5FC:int, ldc:int(67108864)), ldc:int(0))) {
                        var_3_5FC = and:int(var_3_5FC:int, ldc:int(821155875))
                        goto(Label_1269)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_5FC:int, ldc:int(4)), ldc:int(0))) {
                        goto(Label_1141)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_5FC:int, ldc:int(4)), ldc:int(0))) {
                        var_3_5FC = and:int(var_3_5FC:int, ldc:int(-1437238734))
                        goto(Label_1025)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_5FC:int, ldc:int(16384)), ldc:int(0))) {
                        goto(Label_0882)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_5FC:int, ldc:int(16384)), ldc:int(0))) {
                        goto(Label_0778)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_5FC:int, ldc:int(2147483647)), ldc:int(0))) {
                        var_3_5FC = and:int(var_3_5FC:int, ldc:int(1160156333))
                        goto(Label_0644)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_5FC:int, ldc:int(65536)), ldc:int(0))) {
                        if (cmpne:boolean(and:int(var_3_5FC:int, ldc:int(8192)), ldc:int(0))) {
                            var_3_5FC = and:int(var_3_5FC:int, ldc:int(-555715979))
                            var_11_E3 = and:int(ldc:int(7000), ldc:int(-7004))
                            goto(Label_1398)
                        }
                        
                        loopcontinue()
                    }
                    
                    Label_0541:
                    
                    if (cmpeq:boolean(and:int(var_3_5FC:int, ldc:int(512)), ldc:int(0))) {
                        goto(Label_1409)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_5FC:int, ldc:int(512)), ldc:int(0))) {
                        var_3_5FC = and:int(var_3_5FC:int, ldc:int(-867639715))
                        goto(Label_1269)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_5FC:int, ldc:int(1073741824)), ldc:int(0))) {
                        goto(Label_1141)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_5FC:int, ldc:int(4194304)), ldc:int(0))) {
                        goto(Label_1025)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_5FC:int, ldc:int(64)), ldc:int(0))) {
                        goto(Label_0882)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_5FC:int, ldc:int(67108864)), ldc:int(0))) {
                        goto(Label_0778)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_5FC:int, ldc:int(512)), ldc:int(0))) {
                        if (cmpeq:boolean(and:int(var_3_5FC:int, ldc:int(16384)), ldc:int(0))) {
                            var_3_5FC = and:int(var_3_5FC:int, ldc:int(1590068668))
                            goto(Label_0389)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_5FC:int, ldc:int(524288)), ldc:int(0))) {
                            var_3_5FC = and:int(var_3_5FC:int, ldc:int(1114745325))
                            loopcontinue()
                        }
                        
                        var_3_5FC = and:int(var_3_5FC:int, ldc:int(1505752780))
                        
                        if (cmpeq:boolean(getstatic:ao(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::i), getstatic:ao(ao::c))) {
                            var_14_10D = var_9_C1:double
                            goto(Label_0778)
                        }
                    }
                    
                    Label_0644:
                    
                    if (cmpeq:boolean(and:int(var_3_5FC:int, ldc:int(4096)), ldc:int(0))) {
                        var_3_5FC = and:int(var_3_5FC:int, ldc:int(642218318))
                        goto(Label_1409)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_5FC:int, ldc:int(524288)), ldc:int(0))) {
                        var_3_5FC = and:int(var_3_5FC:int, ldc:int(-1184542459))
                        goto(Label_1269)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_5FC:int, ldc:int(64)), ldc:int(0))) {
                        goto(Label_1141)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_5FC:int, ldc:int(1048576)), ldc:int(0))) {
                        var_3_5FC = and:int(var_3_5FC:int, ldc:int(-2009627925))
                        goto(Label_1025)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_5FC:int, ldc:int(1)), ldc:int(0))) {
                        var_3_5FC = and:int(var_3_5FC:int, ldc:int(1536479906))
                        goto(Label_0882)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_5FC:int, ldc:int(1073741824)), ldc:int(0))) {
                        if (cmpne:boolean(and:int(var_3_5FC:int, ldc:int(1)), ldc:int(0))) {
                            goto(Label_0541)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_5FC:int, ldc:int(8388608)), ldc:int(0))) {
                            var_3_5FC = and:int(var_3_5FC:int, ldc:int(-1785871143))
                            goto(Label_0389)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_5FC:int, ldc:int(8192)), ldc:int(0))) {
                            var_3_5FC = and:int(var_3_5FC:int, ldc:int(-1510659898))
                            loopcontinue()
                        }
                        
                        var_3_5FC = and:int(var_3_5FC:int, ldc:int(-122488961))
                        var_14_10D = mul:double(ldc:double(0.5), add:double(var_9_C1:double, var_14_10D:double))
                    }
                    
                    Label_0778:
                    
                    if (cmpeq:boolean(and:int(var_3_5FC:int, ldc:int(4096)), ldc:int(0))) {
                        var_3_5FC = and:int(var_3_5FC:int, ldc:int(523679294))
                        goto(Label_1409)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_5FC:int, ldc:int(65536)), ldc:int(0))) {
                        goto(Label_1269)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_5FC:int, ldc:int(512)), ldc:int(0))) {
                        goto(Label_1141)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_5FC:int, ldc:int(1)), ldc:int(0))) {
                        var_3_5FC = and:int(var_3_5FC:int, ldc:int(-1285254970))
                        goto(Label_1025)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_5FC:int, ldc:int(4194304)), ldc:int(0))) {
                        if (cmpeq:boolean(and:int(var_3_5FC:int, ldc:int(8192)), ldc:int(0))) {
                            var_3_5FC = and:int(var_3_5FC:int, ldc:int(-1716962284))
                            goto(Label_0644)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_5FC:int, ldc:int(4)), ldc:int(0))) {
                            goto(Label_0541)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_5FC:int, ldc:int(268435456)), ldc:int(0))) {
                            goto(Label_0389)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_5FC:int, ldc:int(1048576)), ldc:int(0))) {
                            loopcontinue()
                        }
                        
                        var_3_5FC = and:int(var_3_5FC:int, ldc:int(1420884709))
                        
                        if (cmpeq:boolean(getstatic:ap(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::a), getstatic:ap(ap::b))) {
                            if (cmplt:boolean(loadelement:double(getstatic:double[](\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), var_5_85:int), var_7_9B:double)) {
                                var_11_E3 = xor:int(ldc:int(673), ldc:int(672))
                                goto(Label_1025)
                            }
                        }
                    }
                    
                    Label_0882:
                    
                    if (cmpeq:boolean(and:int(var_3_5FC:int, ldc:int(4096)), ldc:int(0))) {
                        goto(Label_1409)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_5FC:int, ldc:int(134217728)), ldc:int(0))) {
                        goto(Label_1269)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_5FC:int, ldc:int(2147483647)), ldc:int(0))) {
                        var_3_5FC = and:int(var_3_5FC:int, ldc:int(-23218959))
                        goto(Label_1141)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_5FC:int, ldc:int(2147483647)), ldc:int(0))) {
                        if (cmpne:boolean(and:int(var_3_5FC:int, ldc:int(1048576)), ldc:int(0))) {
                            goto(Label_0778)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_5FC:int, ldc:int(524288)), ldc:int(0))) {
                            goto(Label_0644)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_5FC:int, ldc:int(16384)), ldc:int(0))) {
                            goto(Label_0541)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_5FC:int, ldc:int(64)), ldc:int(0))) {
                            var_3_5FC = and:int(var_3_5FC:int, ldc:int(1323247275))
                            goto(Label_0389)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_5FC:int, ldc:int(1)), ldc:int(0))) {
                            var_3_5FC = and:int(var_3_5FC:int, ldc:int(-1115764162))
                            loopcontinue()
                        }
                        
                        var_3_5FC = and:int(var_3_5FC:int, ldc:int(1977973718))
                        var_11_E3 = and:int(ldc:int(26923), ldc:int(-27452))
                    }
                    
                    Label_1025:
                    
                    if (cmpne:boolean(and:int(var_3_5FC:int, ldc:int(67108864)), ldc:int(0))) {
                        goto(Label_1409)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_5FC:int, ldc:int(8388608)), ldc:int(0))) {
                        var_3_5FC = and:int(var_3_5FC:int, ldc:int(-179258072))
                        goto(Label_1269)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_5FC:int, ldc:int(2147483647)), ldc:int(0))) {
                        if (cmpeq:boolean(and:int(var_3_5FC:int, ldc:int(16384)), ldc:int(0))) {
                            goto(Label_0882)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_5FC:int, ldc:int(16384)), ldc:int(0))) {
                            var_3_5FC = and:int(var_3_5FC:int, ldc:int(1519498512))
                            goto(Label_0778)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_5FC:int, ldc:int(268435456)), ldc:int(0))) {
                            goto(Label_0644)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_5FC:int, ldc:int(256)), ldc:int(0))) {
                            goto(Label_0541)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_5FC:int, ldc:int(4194304)), ldc:int(0))) {
                            var_3_5FC = and:int(var_3_5FC:int, ldc:int(-1789525618))
                            goto(Label_0389)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_5FC:int, ldc:int(2147483647)), ldc:int(0))) {
                            var_3_5FC = and:int(var_3_5FC:int, ldc:int(1851197578))
                            loopcontinue()
                        }
                        
                        var_3_5FC = and:int(var_3_5FC:int, ldc:int(-240780322))
                        
                        if (cmpne:boolean(getstatic:ap(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::a), getstatic:ap(ap::a))) {
                            if (cmpeq:boolean(var_11_E3:int, ldc:int(0))) {
                                goto(Label_1269)
                            }
                        }
                    }
                    
                    Label_1141:
                    
                    if (cmpne:boolean(and:int(var_3_5FC:int, ldc:int(1)), ldc:int(0))) {
                        goto(Label_1409)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_5FC:int, ldc:int(64)), ldc:int(0))) {
                        if (cmpeq:boolean(and:int(var_3_5FC:int, ldc:int(64)), ldc:int(0))) {
                            goto(Label_1025)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_5FC:int, ldc:int(16384)), ldc:int(0))) {
                            var_3_5FC = and:int(var_3_5FC:int, ldc:int(-1688533380))
                            goto(Label_0882)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_5FC:int, ldc:int(1024)), ldc:int(0))) {
                            var_3_5FC = and:int(var_3_5FC:int, ldc:int(395172910))
                            goto(Label_0778)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_5FC:int, ldc:int(8192)), ldc:int(0))) {
                            var_3_5FC = and:int(var_3_5FC:int, ldc:int(-820338754))
                            goto(Label_0644)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_5FC:int, ldc:int(268435456)), ldc:int(0))) {
                            var_3_5FC = and:int(var_3_5FC:int, ldc:int(-436913397))
                            goto(Label_0541)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_5FC:int, ldc:int(67108864)), ldc:int(0))) {
                            goto(Label_0389)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_5FC:int, ldc:int(1073741824)), ldc:int(0))) {
                            var_3_5FC = and:int(var_3_5FC:int, ldc:int(1978922949))
                            invokestatic:void(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u0800\u2dcc\uc4d2\u8aa5\u4cd9\u51b2, p0:\uae87\u3bc9\u3bc9\u7049\uc246\u3e75, var_14_10D:double, var_5_85:int, var_16_111:int)
                            goto(Label_1398)
                        }
                        
                        loopcontinue()
                    }
                    
                    Label_1269:
                    
                    if (cmpeq:boolean(and:int(var_3_5FC:int, ldc:int(64)), ldc:int(0))) {
                        goto(Label_1409)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_5FC:int, ldc:int(1073741824)), ldc:int(0))) {
                        var_3_5FC = and:int(var_3_5FC:int, ldc:int(1701714409))
                        goto(Label_1141)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_5FC:int, ldc:int(8388608)), ldc:int(0))) {
                        goto(Label_1025)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_5FC:int, ldc:int(67108864)), ldc:int(0))) {
                        var_3_5FC = and:int(var_3_5FC:int, ldc:int(78602599))
                        goto(Label_0882)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_5FC:int, ldc:int(1073741824)), ldc:int(0))) {
                        goto(Label_0778)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_5FC:int, ldc:int(134217728)), ldc:int(0))) {
                        var_3_5FC = and:int(var_3_5FC:int, ldc:int(1886996630))
                        goto(Label_0644)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_5FC:int, ldc:int(64)), ldc:int(0))) {
                        goto(Label_0541)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_5FC:int, ldc:int(256)), ldc:int(0))) {
                        goto(Label_0389)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_5FC:int, ldc:int(4194304)), ldc:int(0))) {
                        var_3_5FC = and:int(var_3_5FC:int, ldc:int(222393038))
                        loopcontinue()
                    }
                    
                    var_3_5FC = and:int(var_3_5FC:int, ldc:int(1609430607))
                    invokestatic:void(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u0800\u2dcc\uc4d2\u8aa5\u4cd9\u51b2, invokestatic:boolean(\uae87\u3bc9\u3bc9\u7049\uc246\u3e75::\u0a06\u59ec\u93a2\u9937\ub83f\ub171), var_14_10D:double, ldc:double(0.0))
                    Label_1398:
                    
                    if (cmpne:boolean(getstatic:ap(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::a), getstatic:ap(ap::a))) {
                        var_17_607 = var_5_85:int
                        
                        if (cmpeq:boolean(var_11_E3:int, ldc:int(0))) {
                            looporswitchbreak()
                        }
                    }
                    
                    Label_1409:
                    
                    if (cmpne:boolean(and:int(var_3_5FC:int, ldc:int(4194304)), ldc:int(0))) {
                        var_3_5FC = and:int(var_3_5FC:int, ldc:int(547970147))
                        goto(Label_1269)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_5FC:int, ldc:int(1)), ldc:int(0))) {
                        goto(Label_1141)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_5FC:int, ldc:int(134217728)), ldc:int(0))) {
                        var_3_5FC = and:int(var_3_5FC:int, ldc:int(581327823))
                        goto(Label_1025)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_5FC:int, ldc:int(4096)), ldc:int(0))) {
                        var_3_5FC = and:int(var_3_5FC:int, ldc:int(764638756))
                        goto(Label_0882)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_5FC:int, ldc:int(1048576)), ldc:int(0))) {
                        var_3_5FC = and:int(var_3_5FC:int, ldc:int(1911425831))
                        goto(Label_0778)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_5FC:int, ldc:int(4096)), ldc:int(0))) {
                        goto(Label_0644)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_5FC:int, ldc:int(1048576)), ldc:int(0))) {
                        var_3_5FC = and:int(var_3_5FC:int, ldc:int(-802230447))
                        goto(Label_0541)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_5FC:int, ldc:int(64)), ldc:int(0))) {
                        goto(Label_0389)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_5FC:int, ldc:int(268435456)), ldc:int(0))) {
                        var_3_5FC = and:int(var_3_5FC:int, ldc:int(-24904882))
                        var_17_607 = add:int(var_16_111:int, xor:int(ldc:int(5696), ldc:int(5697)))
                        looporswitchbreak()
                    }
                    
                    var_3_5FC = and:int(var_3_5FC:int, ldc:int(-912038824))
                }
                
                var_3_5FC = and:int(var_3_5FC:int, ldc:int(1385102158))
                
                if (cmple:boolean(var_5_85 = var_17_607:int, sub:int(var_6_8C:int, xor:int(ldc:int(1604), ldc:int(1605))))) {
                    loopcontinue()
                }
                
                looporswitchbreak()
            }
        }
        
        Label_0175:
        
        if (cmpne:boolean(and:int(var_3_5FC:int, ldc:int(64)), ldc:int(0))) {
            return:void()
        }
        
        goto(Label_0106)
    }
}
