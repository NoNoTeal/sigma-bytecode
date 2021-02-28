public class \u6435\ub8be\u718f\u6b0d\u67e9.\u8389\ub18d\u6b5f\u67e9\uc229\ua61f {
    public void \u8389\ub18d\u6b5f\u67e9\uc229\ua61f() {
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
            invokespecial:Object(Object::<init>, this:\u8389\ub18d\u6b5f\u67e9\uc229\ua61f)
            putfield:List<\u527a\u494c\u88c5\u965f\u759a>(\u8389\ub18d\u6b5f\u67e9\uc229\ua61f::\u7d52\ud158\u960f\u64ab\u36d3\u9af2, this:\u8389\ub18d\u6b5f\u67e9\uc229\ua61f, invokestatic:List<\u527a\u494c\u88c5\u965f\u759a>(Collections::synchronizedList, invokestatic:ArrayList[expected:List<\u527a\u494c\u88c5\u965f\u759a>](Lists::newArrayList)))
            return:void()
        }
        
        goto(Label_0006)
    }
    
    public void \u67e9\u8350\u3e2a\u5f50\u3bd6\u6b5f(\u12b2\u7049\u8df4\uc9f6\uae87.\ub8be\u071d\u527a\u3711\ubff1\u759a p0, java.lang.Runnable p1) {
        var_3_64 : int
        var_5_6C : \u8258\ub19c\u0b8e\u98a4\u0800\ud217
        var_3_37D : int
        var_6_8A : \u527a\u494c\u88c5\u965f\u759a
        var_7_377 : Throwable
        
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
            var_3_64 = and:int(and:int(ldc:int(1353452938), ldc:int(-286376004)), ldc:int(1613560966))
            var_5_6C = invokestatic:\u8258\ub19c\u0b8e\u98a4\u0800\ud217(\u8258\ub19c\u0b8e\u98a4\u0800\ud217::\u0b8e\ub1b9\ub6ab\ub70c\uc4d2\u8c8a, getfield:String(\ub8be\u071d\u527a\u3711\ubff1\u759a::\u4975\u600f\u92ee\u071d\u3bc9\u51b2, p0:\ub8be\u071d\u527a\u3711\ubff1\u759a))
            var_3_37D = and:int(var_3_64:int, ldc:int(1563807697))
            var_6_8A = invokestatic:\u527a\u494c\u88c5\u965f\u759a(\u527a\u494c\u88c5\u965f\u759a::\ubcb0\u34df\ub6ab\ua562\ubff1\u71f1, invokestatic:InetAddress(InetAddress::getByName, invokevirtual:String(\u8258\ub19c\u0b8e\u98a4\u0800\ud217::\uc910\u67e9\uc29a\ua3b4\u2dcc\u965f, var_5_6C:\u8258\ub19c\u0b8e\u98a4\u0800\ud217)), invokevirtual:int(\u8258\ub19c\u0b8e\u98a4\u0800\ud217::\ua6bd\ubff1\u8c8a\u3776\uc84e\u9af2, var_5_6C:\u8258\ub19c\u0b8e\u98a4\u0800\ud217), and:int[expected:boolean](ldc:int(21123), ldc:int(-21124)))
            
            loop {
                Label_0140:
                
                if (cmpeq:boolean(and:int(var_3_37D:int, ldc:int(2147483647)), ldc:int(0))) {
                    var_3_37D = and:int(var_3_37D:int, ldc:int(-1878750702))
                    goto(Label_0794)
                }
                
                if (cmpne:boolean(and:int(var_3_37D:int, ldc:int(64)), ldc:int(0))) {
                    var_3_37D = and:int(var_3_37D:int, ldc:int(492474129))
                    goto(Label_0720)
                }
                
                if (cmpne:boolean(and:int(var_3_37D:int, ldc:int(33554432)), ldc:int(0))) {
                    goto(Label_0601)
                }
                
                if (cmpne:boolean(and:int(var_3_37D:int, ldc:int(33554432)), ldc:int(0))) {
                    var_3_37D = and:int(var_3_37D:int, ldc:int(-1382565413))
                    goto(Label_0498)
                }
                
                if (cmpne:boolean(and:int(var_3_37D:int, ldc:int(64)), ldc:int(0))) {
                    goto(Label_0423)
                }
                
                if (cmpeq:boolean(and:int(var_3_37D:int, ldc:int(1024)), ldc:int(0))) {
                    goto(Label_0330)
                }
                
                if (cmpeq:boolean(and:int(var_3_37D:int, ldc:int(32768)), ldc:int(0))) {
                    var_3_37D = and:int(var_3_37D:int, ldc:int(-469798938))
                    invokeinterface:boolean(List<\u527a\u494c\u88c5\u965f\u759a>::add, getfield:List<\u527a\u494c\u88c5\u965f\u759a>(\u8389\ub18d\u6b5f\u67e9\uc229\ua61f::\u7d52\ud158\u960f\u64ab\u36d3\u9af2, this:\u8389\ub18d\u6b5f\u67e9\uc229\ua61f), var_6_8A:\u527a\u494c\u88c5\u965f\u759a)
                }
                
                Label_0230:
                
                if (cmpeq:boolean(and:int(var_3_37D:int, ldc:int(2048)), ldc:int(0))) {
                    goto(Label_0794)
                }
                
                if (cmpne:boolean(and:int(var_3_37D:int, ldc:int(4194304)), ldc:int(0))) {
                    goto(Label_0720)
                }
                
                if (cmpne:boolean(and:int(var_3_37D:int, ldc:int(4194304)), ldc:int(0))) {
                    var_3_37D = and:int(var_3_37D:int, ldc:int(-1435799398))
                    goto(Label_0601)
                }
                
                if (cmpne:boolean(and:int(var_3_37D:int, ldc:int(16777216)), ldc:int(0))) {
                    goto(Label_0498)
                }
                
                if (cmpne:boolean(and:int(var_3_37D:int, ldc:int(33554432)), ldc:int(0))) {
                    var_3_37D = and:int(var_3_37D:int, ldc:int(-1160679264))
                    goto(Label_0423)
                }
                
                if (cmpne:boolean(and:int(var_3_37D:int, ldc:int(32768)), ldc:int(0))) {
                    var_3_37D = and:int(var_3_37D:int, ldc:int(779641404))
                }
                else {
                    if (cmpne:boolean(and:int(var_3_37D:int, ldc:int(8192)), ldc:int(0))) {
                        loopcontinue()
                    }
                    
                    var_3_37D = and:int(var_3_37D:int, ldc:int(-227090793))
                    putfield:ITextComponent(\ub8be\u071d\u527a\u3711\ubff1\u759a::\u839e\u6b5f\u59ec\u47c2\u52d3\uc84e, p0:\ub8be\u071d\u527a\u3711\ubff1\u759a, initobject:TranslationTextComponent[expected:ITextComponent](TranslationTextComponent::<init>, loadelement:String(getstatic:String[](\u8389\ub18d\u6b5f\u67e9\uc229\ua61f::\u8709\u6c56\ua562\ube23\u494c\ud4fe), and:int(ldc:int(7332), ldc:int(-7333)))))
                }
                
                Label_0330:
                
                if (cmpeq:boolean(and:int(var_3_37D:int, ldc:int(1073741824)), ldc:int(0))) {
                    var_3_37D = and:int(var_3_37D:int, ldc:int(1101646431))
                    goto(Label_0794)
                }
                
                if (cmpeq:boolean(and:int(var_3_37D:int, ldc:int(128)), ldc:int(0))) {
                    var_3_37D = and:int(var_3_37D:int, ldc:int(131826759))
                    goto(Label_0720)
                }
                
                if (cmpeq:boolean(and:int(var_3_37D:int, ldc:int(1024)), ldc:int(0))) {
                    goto(Label_0601)
                }
                
                if (cmpne:boolean(and:int(var_3_37D:int, ldc:int(33554432)), ldc:int(0))) {
                    goto(Label_0498)
                }
                
                if (cmpeq:boolean(and:int(var_3_37D:int, ldc:int(1073741824)), ldc:int(0))) {
                    var_3_37D = and:int(var_3_37D:int, ldc:int(979439285))
                }
                else {
                    if (cmpne:boolean(and:int(var_3_37D:int, ldc:int(32768)), ldc:int(0))) {
                        goto(Label_0230)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_37D:int, ldc:int(8192)), ldc:int(0))) {
                        var_3_37D = and:int(var_3_37D:int, ldc:int(-1844786707))
                        loopcontinue()
                    }
                    
                    var_3_37D = and:int(var_3_37D:int, ldc:int(1590468093))
                    putfield:long(\ub8be\u071d\u527a\u3711\ubff1\u759a::\u9a18\u64f2\u8709\u6b0d\u5140\u6d69, p0:\ub8be\u071d\u527a\u3711\ubff1\u759a, ldc:long(-1L))
                }
                
                Label_0423:
                
                if (cmpeq:boolean(and:int(var_3_37D:int, ldc:int(128)), ldc:int(0))) {
                    goto(Label_0794)
                }
                
                if (cmpne:boolean(and:int(var_3_37D:int, ldc:int(8192)), ldc:int(0))) {
                    goto(Label_0720)
                }
                
                if (cmpne:boolean(and:int(var_3_37D:int, ldc:int(32768)), ldc:int(0))) {
                    goto(Label_0601)
                }
                
                if (cmpne:boolean(and:int(var_3_37D:int, ldc:int(2048)), ldc:int(0))) {
                    if (cmpeq:boolean(and:int(var_3_37D:int, ldc:int(1073741824)), ldc:int(0))) {
                        var_3_37D = and:int(var_3_37D:int, ldc:int(-1676658643))
                        goto(Label_0330)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_37D:int, ldc:int(64)), ldc:int(0))) {
                        goto(Label_0230)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_37D:int, ldc:int(128)), ldc:int(0))) {
                        var_3_37D = and:int(var_3_37D:int, ldc:int(788762543))
                        loopcontinue()
                    }
                    
                    var_3_37D = and:int(var_3_37D:int, ldc:int(-289427756))
                    putfield:List<ITextComponent>(\ub8be\u071d\u527a\u3711\ubff1\u759a::\u385b\u7006\u9937\ud4fe\ua3b4\ubefe, p0:\ub8be\u071d\u527a\u3711\ubff1\u759a, aconstnull:List<ITextComponent>())
                }
                
                Label_0498:
                
                if (cmpeq:boolean(and:int(var_3_37D:int, ldc:int(1073741824)), ldc:int(0))) {
                    var_3_37D = and:int(var_3_37D:int, ldc:int(633985397))
                    goto(Label_0794)
                }
                
                if (cmpne:boolean(and:int(var_3_37D:int, ldc:int(32768)), ldc:int(0))) {
                    goto(Label_0720)
                }
                
                if (cmpne:boolean(and:int(var_3_37D:int, ldc:int(65536)), ldc:int(0))) {
                    goto(Label_0601)
                }
                
                if (cmpeq:boolean(and:int(var_3_37D:int, ldc:int(262144)), ldc:int(0))) {
                    var_3_37D = and:int(var_3_37D:int, ldc:int(1558610833))
                    goto(Label_0423)
                }
                
                if (cmpne:boolean(and:int(var_3_37D:int, ldc:int(16777216)), ldc:int(0))) {
                    var_3_37D = and:int(var_3_37D:int, ldc:int(467825699))
                    goto(Label_0330)
                }
                
                if (cmpeq:boolean(and:int(var_3_37D:int, ldc:int(1024)), ldc:int(0))) {
                    goto(Label_0230)
                }
                
                if (cmpne:boolean(and:int(var_3_37D:int, ldc:int(33554432)), ldc:int(0))) {
                    var_3_37D = and:int(var_3_37D:int, ldc:int(1438003405))
                    loopcontinue()
                }
                
                var_3_37D = and:int(var_3_37D:int, ldc:int(-119079288))
                invokevirtual:void(\u527a\u494c\u88c5\u965f\u759a::\u946b\u3e75\u59ec\ua562\u516c\ubb2b, var_6_8A:\u527a\u494c\u88c5\u965f\u759a, initobject:\u527a\u61a4\ud158\ud158\ub6ab\u8bb0(\u527a\u61a4\ud158\ud158\ub6ab\u8bb0::<init>, this:\u8389\ub18d\u6b5f\u67e9\uc229\ua61f, var_6_8A:\u527a\u494c\u88c5\u965f\u759a, p0:\ub8be\u071d\u527a\u3711\ubff1\u759a, p1:Runnable))
                
                try {
                    loop {
                        Label_0601:
                        
                        if (cmpne:boolean(and:int(var_3_37D:int, ldc:int(64)), ldc:int(0))) {
                            goto(Label_0794)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_37D:int, ldc:int(262144)), ldc:int(0))) {
                            var_3_37D = and:int(var_3_37D:int, ldc:int(-1979138792))
                        }
                        else {
                            if (cmpne:boolean(and:int(var_3_37D:int, ldc:int(33554432)), ldc:int(0))) {
                                var_3_37D = and:int(var_3_37D:int, ldc:int(836137426))
                                goto(Label_0498)
                            }
                            
                            if (cmpeq:boolean(and:int(var_3_37D:int, ldc:int(2147483647)), ldc:int(0))) {
                                var_3_37D = and:int(var_3_37D:int, ldc:int(506352005))
                                goto(Label_0423)
                            }
                            
                            if (cmpeq:boolean(and:int(var_3_37D:int, ldc:int(262144)), ldc:int(0))) {
                                var_3_37D = and:int(var_3_37D:int, ldc:int(-542320498))
                                goto(Label_0330)
                            }
                            
                            if (cmpeq:boolean(and:int(var_3_37D:int, ldc:int(1073741824)), ldc:int(0))) {
                                var_3_37D = and:int(var_3_37D:int, ldc:int(833657264))
                                goto(Label_0230)
                            }
                            
                            if (cmpne:boolean(and:int(var_3_37D:int, ldc:int(64)), ldc:int(0))) {
                                loopcontinue(Label_0140)
                            }
                            
                            var_3_37D = and:int(var_3_37D:int, ldc:int(-593133884))
                            invokevirtual:void(\u527a\u494c\u88c5\u965f\u759a::\u6fb0\u5d20\u93a2\u92ff\ud158\uc4d2, var_6_8A:\u527a\u494c\u88c5\u965f\u759a, initobject:\ub8be\u16f6\u47c2\u71ae\u5bc4[expected:\u946b\u6d99\u8df4\u12cb\u5d20<?>](\ub8be\u16f6\u47c2\u71ae\u5bc4::<init>, invokevirtual:String(\u8258\ub19c\u0b8e\u98a4\u0800\ud217::\uc910\u67e9\uc29a\ua3b4\u2dcc\u965f, var_5_6C:\u8258\ub19c\u0b8e\u98a4\u0800\ud217), invokevirtual:int(\u8258\ub19c\u0b8e\u98a4\u0800\ud217::\ua6bd\ubff1\u8c8a\u3776\uc84e\u9af2, var_5_6C:\u8258\ub19c\u0b8e\u98a4\u0800\ud217), getstatic:\u392e\uc31c\u3504\u3dd3\u93a2(\u392e\uc31c\u3504\u3dd3\u93a2::\u92ee\uc2bd\uc7fe\u527a\u760c\ubb2b)))
                        }
                        
                        Label_0720:
                        
                        if (cmpeq:boolean(and:int(var_3_37D:int, ldc:int(64)), ldc:int(0))) {
                            if (cmpeq:boolean(and:int(var_3_37D:int, ldc:int(2147483647)), ldc:int(0))) {
                                loopcontinue()
                            }
                            
                            if (cmpeq:boolean(and:int(var_3_37D:int, ldc:int(262144)), ldc:int(0))) {
                                goto(Label_0498)
                            }
                            
                            if (cmpne:boolean(and:int(var_3_37D:int, ldc:int(64)), ldc:int(0))) {
                                goto(Label_0423)
                            }
                            
                            if (cmpne:boolean(and:int(var_3_37D:int, ldc:int(32768)), ldc:int(0))) {
                                goto(Label_0330)
                            }
                            
                            if (cmpne:boolean(and:int(var_3_37D:int, ldc:int(65536)), ldc:int(0))) {
                                goto(Label_0230)
                            }
                            
                            if (cmpne:boolean(and:int(var_3_37D:int, ldc:int(32768)), ldc:int(0))) {
                                var_3_37D = and:int(var_3_37D:int, ldc:int(-1960373977))
                                loopcontinue(Label_0140)
                            }
                            
                            var_3_37D = and:int(var_3_37D:int, ldc:int(1576885721))
                            invokevirtual:void(\u527a\u494c\u88c5\u965f\u759a::\u6fb0\u5d20\u93a2\u92ff\ud158\uc4d2, var_6_8A:\u527a\u494c\u88c5\u965f\u759a, initobject:\u839e\u5245\u7ce1\ud36e\u12cb[expected:\u946b\u6d99\u8df4\u12cb\u5d20<?>](\u839e\u5245\u7ce1\ud36e\u12cb::<init>))
                        }
                        
                        Label_0794:
                        
                        if (cmpeq:boolean(and:int(var_3_37D:int, ldc:int(262144)), ldc:int(0))) {
                            goto(Label_0720)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_37D:int, ldc:int(32768)), ldc:int(0))) {
                            loopcontinue()
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_37D:int, ldc:int(1024)), ldc:int(0))) {
                            var_3_37D = and:int(var_3_37D:int, ldc:int(-1184307221))
                            goto(Label_0498)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_37D:int, ldc:int(2048)), ldc:int(0))) {
                            var_3_37D = and:int(var_3_37D:int, ldc:int(1930183485))
                            goto(Label_0423)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_37D:int, ldc:int(33554432)), ldc:int(0))) {
                            var_3_37D = and:int(var_3_37D:int, ldc:int(-1104137445))
                            goto(Label_0330)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_37D:int, ldc:int(128)), ldc:int(0))) {
                            goto(Label_0230)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_37D:int, ldc:int(1073741824)), ldc:int(0))) {
                            var_3_37D = and:int(var_3_37D:int, ldc:int(-506540323))
                            loopcontinue(Label_0140)
                        }
                        
                        var_3_37D = and:int(var_3_37D:int, ldc:int(1798217646))
                        looporswitchbreak()
                    }
                }
                catch (java.lang.Throwable var_7_377) {
                    var_3_37D = and:int(var_3_37D:int, ldc:int(-1057018126))
                    invokeinterface:void(Logger::error, getstatic:Logger(\u8389\ub18d\u6b5f\u67e9\uc229\ua61f::\u7873\u51fa\u12b2\u7af6\ub113\uc246), var_7_377:Throwable[expected:Object])
                }
                
                looporswitchbreak()
            }
            
            return:void()
        }
        
        goto(Label_0006)
    }
    
    private void \uc29a\uc84e\u9af2\u51b2\u3711\u7bad(\u12b2\u7049\u8df4\uc9f6\uae87.\ub8be\u071d\u527a\u3711\ubff1\u759a p0) {
        var_4_67 : \u8258\ub19c\u0b8e\u98a4\u0800\ud217
        
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
            var_4_67 = invokestatic:\u8258\ub19c\u0b8e\u98a4\u0800\ud217(\u8258\ub19c\u0b8e\u98a4\u0800\ud217::\u0b8e\ub1b9\ub6ab\ub70c\uc4d2\u8c8a, getfield:String(\ub8be\u071d\u527a\u3711\ubff1\u759a::\u4975\u600f\u92ee\u071d\u3bc9\u51b2, p0:\ub8be\u071d\u527a\u3711\ubff1\u759a))
            invokevirtual:ChannelFuture(Bootstrap::connect, checkcast:Bootstrap(io.netty.bootstrap.Bootstrap.class, invokevirtual:AbstractBootstrap(Bootstrap::channel, checkcast:Bootstrap(io.netty.bootstrap.Bootstrap.class, invokevirtual:AbstractBootstrap(Bootstrap::handler, checkcast:Bootstrap(io.netty.bootstrap.Bootstrap.class, invokevirtual:AbstractBootstrap[expected:Bootstrap](Bootstrap::group, initobject:Bootstrap(Bootstrap::<init>), checkcast:EventLoopGroup(io.netty.channel.EventLoopGroup.class, invokevirtual:NioEventLoopGroup[expected:EventLoopGroup](\u62da\u61a4\ub19c\u8cae\u92ff\ubb2b<NioEventLoopGroup>::\u5fe1\u6fb0\u3bd6\u3504\u8c8a\u3bc9, getstatic:\u62da\u61a4\ub19c\u8cae\u92ff\ubb2b<NioEventLoopGroup>(\u527a\u494c\u88c5\u965f\u759a::\u647c\u527a\u760c\u69d9\u7049\u5bc4))))), initobject:\u760c\uc29a\u3c25\u7ce1\u98a4\u47c2(\u760c\uc29a\u3c25\u7ce1\u98a4\u47c2::<init>, this:\u8389\ub18d\u6b5f\u67e9\uc229\ua61f, var_4_67:\u8258\ub19c\u0b8e\u98a4\u0800\ud217, p0:\ub8be\u071d\u527a\u3711\ubff1\u759a))), ldc:Class<NioSocketChannel>(io.netty.channel.socket.nio.NioSocketChannel.class))), invokevirtual:String(\u8258\ub19c\u0b8e\u98a4\u0800\ud217::\uc910\u67e9\uc29a\ua3b4\u2dcc\u965f, var_4_67:\u8258\ub19c\u0b8e\u98a4\u0800\ud217), invokevirtual:int(\u8258\ub19c\u0b8e\u98a4\u0800\ud217::\ua6bd\ubff1\u8c8a\u3776\uc84e\u9af2, var_4_67:\u8258\ub19c\u0b8e\u98a4\u0800\ud217))
            return:void()
        }
        
        goto(Label_0006)
    }
    
    private static net.minecraft.util.text.ITextComponent \uc2bd\ud523\u392e\u7049\u9a18\u7bad(int p0, int p1) {
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
            return:ITextComponent(invokeinterface:IFormattableTextComponent[expected:ITextComponent](IFormattableTextComponent::mergeStyle, invokeinterface:IFormattableTextComponent(IFormattableTextComponent::appendString, invokevirtual:IFormattableTextComponent(TextComponent::append, initobject:StringTextComponent[expected:TextComponent](StringTextComponent::<init>, invokestatic:String(Integer::toString, p0:int)), invokevirtual:IFormattableTextComponent[expected:ITextComponent](IFormattableTextComponent::mergeStyle, initobject:StringTextComponent[expected:IFormattableTextComponent](StringTextComponent::<init>, loadelement:String(getstatic:String[](\u8389\ub18d\u6b5f\u67e9\uc229\ua61f::\u8709\u6c56\ua562\ube23\u494c\ud4fe), xor:int(ldc:int(-28576), ldc:int(-28575)))), getstatic:TextFormatting(TextFormatting::DARK_GRAY))), invokestatic:String(Integer::toString, p1:int)), getstatic:TextFormatting(TextFormatting::GRAY)))
        }
        
        goto(Label_0006)
    }
    
    public void \u64f2\u8709\u5bc4\u62da\u6435\u120d() {
        var_1_67 : int
        var_3_6D : List<\u527a\u494c\u88c5\u965f\u759a>
        var_4_7E : Iterator<\u527a\u494c\u88c5\u965f\u759a>
        var_5_10D : \u527a\u494c\u88c5\u965f\u759a
        
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
            var_1_67 = and:int(and:int(ldc:int(-953363592), ldc:int(-13253666)), ldc:int(-764599848))
            monitorenter(var_3_6D = getfield:List<\u527a\u494c\u88c5\u965f\u759a>(\u8389\ub18d\u6b5f\u67e9\uc229\ua61f::\u7d52\ud158\u960f\u64ab\u36d3\u9af2, this:\u8389\ub18d\u6b5f\u67e9\uc229\ua61f))
            
            try {
                var_1_67 = and:int(var_1_67:int, ldc:int(-352365124))
                var_4_7E = invokeinterface:Iterator<\u527a\u494c\u88c5\u965f\u759a>(List<\u527a\u494c\u88c5\u965f\u759a>::iterator, getfield:List<\u527a\u494c\u88c5\u965f\u759a>(\u8389\ub18d\u6b5f\u67e9\uc229\ua61f::\u7d52\ud158\u960f\u64ab\u36d3\u9af2, this:\u8389\ub18d\u6b5f\u67e9\uc229\ua61f))
                
                loop {
                    if (cmpeq:boolean(and:int(var_1_67:int, ldc:int(2147483647)), ldc:int(0))) {
                        goto(Label_0591)
                    }
                    
                    if (cmpne:boolean(and:int(var_1_67:int, ldc:int(134217728)), ldc:int(0))) {
                        goto(Label_0212)
                    }
                    
                    if (cmpne:boolean(and:int(var_1_67:int, ldc:int(1048576)), ldc:int(0))) {
                        var_1_67 = and:int(var_1_67:int, ldc:int(-278086813))
                    }
                    else {
                        var_1_67 = and:int(var_1_67:int, ldc:int(-287382725))
                        
                        if (logicalnot:boolean(invokeinterface:boolean(Iterator::hasNext, var_4_7E:Iterator<\u527a\u494c\u88c5\u965f\u759a>))) {
                            monitorexit(var_3_6D:List<\u527a\u494c\u88c5\u965f\u759a>)
                            goto(Label_0591)
                        }
                    }
                    
                    Label_0176:
                    
                    if (cmpeq:boolean(and:int(var_1_67:int, ldc:int(262144)), ldc:int(0))) {
                        goto(Label_0591)
                    }
                    
                    if (cmpne:boolean(and:int(var_1_67:int, ldc:int(262144)), ldc:int(0))) {
                        if (cmpne:boolean(and:int(var_1_67:int, ldc:int(1024)), ldc:int(0))) {
                            var_1_67 = and:int(var_1_67:int, ldc:int(616186940))
                            loopcontinue()
                        }
                        
                        var_1_67 = and:int(var_1_67:int, ldc:int(-882928804))
                    }
                    
                    Label_0212:
                    
                    if (cmpeq:boolean(and:int(var_1_67:int, ldc:int(8)), ldc:int(0))) {
                        var_1_67 = and:int(var_1_67:int, ldc:int(227793823))
                    }
                    else {
                        if (cmpeq:boolean(and:int(var_1_67:int, ldc:int(33554432)), ldc:int(0))) {
                            goto(Label_0176)
                        }
                        
                        if (cmpne:boolean(and:int(var_1_67:int, ldc:int(1)), ldc:int(0))) {
                            var_1_67 = and:int(var_1_67:int, ldc:int(1498656446))
                            loopcontinue()
                        }
                        
                        var_1_67 = and:int(var_1_67:int, ldc:int(-221970533))
                        var_5_10D = checkcast:\u527a\u494c\u88c5\u965f\u759a(\u4492\u8aa5\ud171\uc3e3\u4c2b.\u4c04\ua068\u3d64\ua6bd\u8389.\u960f\ubefe\ud4fe\u7c6b\u5db4.\u527a\u494c\u88c5\u965f\u759a.class, invokeinterface:\u527a\u494c\u88c5\u965f\u759a(Iterator<\u527a\u494c\u88c5\u965f\u759a>::next, var_4_7E:Iterator<\u527a\u494c\u88c5\u965f\u759a>))
                        
                        loop {
                            if (cmpne:boolean(and:int(var_1_67:int, ldc:int(1048576)), ldc:int(0))) {
                                var_1_67 = and:int(var_1_67:int, ldc:int(909606982))
                                goto(Label_0518)
                            }
                            
                            if (cmpne:boolean(and:int(var_1_67:int, ldc:int(8192)), ldc:int(0))) {
                                var_1_67 = and:int(var_1_67:int, ldc:int(743642870))
                                goto(Label_0460)
                            }
                            
                            if (cmpeq:boolean(and:int(var_1_67:int, ldc:int(256)), ldc:int(0))) {
                                goto(Label_0378)
                            }
                            
                            if (cmpeq:boolean(and:int(var_1_67:int, ldc:int(134217728)), ldc:int(0))) {
                                var_1_67 = and:int(var_1_67:int, ldc:int(-548611590))
                                
                                if (logicalnot:boolean(invokevirtual:boolean(\u527a\u494c\u88c5\u965f\u759a::\u98a4\u960f\u6198\u3d4b\ub83f\ud171, var_5_10D:\u527a\u494c\u88c5\u965f\u759a))) {
                                    invokeinterface:void(Iterator<E>::remove, var_4_7E:Iterator<\u527a\u494c\u88c5\u965f\u759a>)
                                    goto(Label_0460)
                                }
                            }
                            
                            Label_0334:
                            
                            if (cmpeq:boolean(and:int(var_1_67:int, ldc:int(256)), ldc:int(0))) {
                                goto(Label_0518)
                            }
                            
                            if (cmpne:boolean(and:int(var_1_67:int, ldc:int(65536)), ldc:int(0))) {
                                goto(Label_0460)
                            }
                            
                            if (cmpeq:boolean(and:int(var_1_67:int, ldc:int(8192)), ldc:int(0))) {
                                if (cmpeq:boolean(and:int(var_1_67:int, ldc:int(1073741824)), ldc:int(0))) {
                                    var_1_67 = and:int(var_1_67:int, ldc:int(-580925319))
                                    loopcontinue()
                                }
                                
                                var_1_67 = and:int(var_1_67:int, ldc:int(-1012619496))
                            }
                            
                            Label_0378:
                            
                            if (cmpeq:boolean(and:int(var_1_67:int, ldc:int(8)), ldc:int(0))) {
                                goto(Label_0518)
                            }
                            
                            if (cmpeq:boolean(and:int(var_1_67:int, ldc:int(16)), ldc:int(0))) {
                                var_1_67 = and:int(var_1_67:int, ldc:int(-484178617))
                            }
                            else {
                                if (cmpne:boolean(and:int(var_1_67:int, ldc:int(1024)), ldc:int(0))) {
                                    var_1_67 = and:int(var_1_67:int, ldc:int(872060886))
                                    goto(Label_0334)
                                }
                                
                                if (cmpne:boolean(and:int(var_1_67:int, ldc:int(8192)), ldc:int(0))) {
                                    var_1_67 = and:int(var_1_67:int, ldc:int(740171188))
                                    loopcontinue()
                                }
                                
                                var_1_67 = and:int(var_1_67:int, ldc:int(-632445124))
                                invokevirtual:void(\u527a\u494c\u88c5\u965f\u759a::\u446c\u93a2\u76bc\uc7fe\uf94d\uc246, var_5_10D:\u527a\u494c\u88c5\u965f\u759a)
                                goto(Label_0518)
                            }
                            
                            Label_0460:
                            
                            if (cmpne:boolean(and:int(var_1_67:int, ldc:int(1024)), ldc:int(0))) {
                                var_1_67 = and:int(var_1_67:int, ldc:int(-1677573658))
                            }
                            else {
                                if (cmpne:boolean(and:int(var_1_67:int, ldc:int(1024)), ldc:int(0))) {
                                    goto(Label_0378)
                                }
                                
                                if (cmpeq:boolean(and:int(var_1_67:int, ldc:int(1073741824)), ldc:int(0))) {
                                    var_1_67 = and:int(var_1_67:int, ldc:int(406436907))
                                    goto(Label_0334)
                                }
                                
                                if (cmpne:boolean(and:int(var_1_67:int, ldc:int(134217728)), ldc:int(0))) {
                                    loopcontinue()
                                }
                                
                                var_1_67 = and:int(var_1_67:int, ldc:int(-142256135))
                                invokevirtual:void(\u527a\u494c\u88c5\u965f\u759a::\ua068\ud51e\u5140\u59ec\u6c52\u92ee, var_5_10D:\u527a\u494c\u88c5\u965f\u759a)
                            }
                            
                            Label_0518:
                            
                            if (cmpeq:boolean(and:int(var_1_67:int, ldc:int(256)), ldc:int(0))) {
                                var_1_67 = and:int(var_1_67:int, ldc:int(-420424006))
                                goto(Label_0460)
                            }
                            
                            if (cmpne:boolean(and:int(var_1_67:int, ldc:int(134217728)), ldc:int(0))) {
                                var_1_67 = and:int(var_1_67:int, ldc:int(-1660255780))
                                goto(Label_0378)
                            }
                            
                            if (cmpne:boolean(and:int(var_1_67:int, ldc:int(1)), ldc:int(0))) {
                                var_1_67 = and:int(var_1_67:int, ldc:int(-892713541))
                                goto(Label_0334)
                            }
                            
                            if (cmpne:boolean(and:int(var_1_67:int, ldc:int(2147483647)), ldc:int(0))) {
                                looporswitchbreak()
                            }
                        }
                        
                        var_1_67 = and:int(var_1_67:int, ldc:int(-632302625))
                        loopcontinue()
                    }
                    
                    Label_0591:
                    
                    if (cmpeq:boolean(and:int(var_1_67:int, ldc:int(1073741824)), ldc:int(0))) {
                        var_1_67 = and:int(var_1_67:int, ldc:int(284912597))
                        goto(Label_0212)
                    }
                    
                    if (cmpeq:boolean(and:int(var_1_67:int, ldc:int(16)), ldc:int(0))) {
                        var_1_67 = and:int(var_1_67:int, ldc:int(1400377836))
                        goto(Label_0176)
                    }
                    
                    if (cmpne:boolean(and:int(var_1_67:int, ldc:int(8)), ldc:int(0))) {
                        looporswitchbreak()
                    }
                    
                    var_1_67 = and:int(var_1_67:int, ldc:int(-1764179887))
                }
                
                var_1_67 = and:int(var_1_67:int, ldc:int(-407104707))
            }
            finally {
                monitorexit(var_3_6D:List<\u527a\u494c\u88c5\u965f\u759a>)
            }
            
            return:void()
        }
        
        goto(Label_0006)
    }
    
    public void \u52d3\u8308\u760c\u61a4\u8753\u59ec() {
        var_1_67 : int
        var_3_6D : List<\u527a\u494c\u88c5\u965f\u759a>
        var_4_7E : Iterator<\u527a\u494c\u88c5\u965f\u759a>
        var_5_103 : \u527a\u494c\u88c5\u965f\u759a
        
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
            var_1_67 = and:int(and:int(ldc:int(736171702), ldc:int(690693754)), ldc:int(-511900586))
            monitorenter(var_3_6D = getfield:List<\u527a\u494c\u88c5\u965f\u759a>(\u8389\ub18d\u6b5f\u67e9\uc229\ua61f::\u7d52\ud158\u960f\u64ab\u36d3\u9af2, this:\u8389\ub18d\u6b5f\u67e9\uc229\ua61f))
            
            try {
                var_1_67 = and:int(var_1_67:int, ldc:int(2137247633))
                var_4_7E = invokeinterface:Iterator<\u527a\u494c\u88c5\u965f\u759a>(List<\u527a\u494c\u88c5\u965f\u759a>::iterator, getfield:List<\u527a\u494c\u88c5\u965f\u759a>(\u8389\ub18d\u6b5f\u67e9\uc229\ua61f::\u7d52\ud158\u960f\u64ab\u36d3\u9af2, this:\u8389\ub18d\u6b5f\u67e9\uc229\ua61f))
                
                loop {
                    if (cmpeq:boolean(and:int(var_1_67:int, ldc:int(1024)), ldc:int(0))) {
                        goto(Label_0550)
                    }
                    
                    if (cmpne:boolean(and:int(var_1_67:int, ldc:int(64)), ldc:int(0))) {
                        var_1_67 = and:int(var_1_67:int, ldc:int(1763943690))
                        goto(Label_0212)
                    }
                    
                    if (cmpeq:boolean(and:int(var_1_67:int, ldc:int(1024)), ldc:int(0))) {
                        var_1_67 = and:int(var_1_67:int, ldc:int(1371502774))
                    }
                    else {
                        var_1_67 = and:int(var_1_67:int, ldc:int(-389460368))
                        
                        if (logicalnot:boolean(invokeinterface:boolean(Iterator::hasNext, var_4_7E:Iterator<\u527a\u494c\u88c5\u965f\u759a>))) {
                            monitorexit(var_3_6D:List<\u527a\u494c\u88c5\u965f\u759a>)
                            goto(Label_0550)
                        }
                    }
                    
                    Label_0183:
                    
                    if (cmpeq:boolean(and:int(var_1_67:int, ldc:int(2147483647)), ldc:int(0))) {
                        goto(Label_0550)
                    }
                    
                    if (cmpeq:boolean(and:int(var_1_67:int, ldc:int(131072)), ldc:int(0))) {
                        if (cmpeq:boolean(and:int(var_1_67:int, ldc:int(536870912)), ldc:int(0))) {
                            loopcontinue()
                        }
                        
                        var_1_67 = and:int(var_1_67:int, ldc:int(-169531984))
                    }
                    
                    Label_0212:
                    
                    if (cmpeq:boolean(and:int(var_1_67:int, ldc:int(65536)), ldc:int(0))) {
                        var_1_67 = and:int(var_1_67:int, ldc:int(-2058189386))
                    }
                    else {
                        if (cmpeq:boolean(and:int(var_1_67:int, ldc:int(16)), ldc:int(0))) {
                            goto(Label_0183)
                        }
                        
                        if (cmpne:boolean(and:int(var_1_67:int, ldc:int(1024)), ldc:int(0))) {
                            var_1_67 = and:int(var_1_67:int, ldc:int(-1597422476))
                            var_5_103 = checkcast:\u527a\u494c\u88c5\u965f\u759a(\u4492\u8aa5\ud171\uc3e3\u4c2b.\u4c04\ua068\u3d64\ua6bd\u8389.\u960f\ubefe\ud4fe\u7c6b\u5db4.\u527a\u494c\u88c5\u965f\u759a.class, invokeinterface:\u527a\u494c\u88c5\u965f\u759a(Iterator<\u527a\u494c\u88c5\u965f\u759a>::next, var_4_7E:Iterator<\u527a\u494c\u88c5\u965f\u759a>))
                            
                            loop {
                                if (cmpne:boolean(and:int(var_1_67:int, ldc:int(64)), ldc:int(0))) {
                                    goto(Label_0487)
                                }
                                
                                if (cmpne:boolean(and:int(var_1_67:int, ldc:int(1048576)), ldc:int(0))) {
                                    goto(Label_0420)
                                }
                                
                                if (cmpeq:boolean(and:int(var_1_67:int, ldc:int(1024)), ldc:int(0))) {
                                    var_1_67 = and:int(var_1_67:int, ldc:int(1802121382))
                                    goto(Label_0368)
                                }
                                
                                if (cmpeq:boolean(and:int(var_1_67:int, ldc:int(536870912)), ldc:int(0))) {
                                    var_1_67 = and:int(var_1_67:int, ldc:int(825181186))
                                }
                                else {
                                    var_1_67 = and:int(var_1_67:int, ldc:int(1030295444))
                                    
                                    if (logicalnot:boolean(invokevirtual:boolean(\u527a\u494c\u88c5\u965f\u759a::\u98a4\u960f\u6198\u3d4b\ub83f\ud171, var_5_103:\u527a\u494c\u88c5\u965f\u759a))) {
                                        goto(Label_0487)
                                    }
                                }
                                
                                Label_0323:
                                
                                if (cmpne:boolean(and:int(var_1_67:int, ldc:int(16384)), ldc:int(0))) {
                                    goto(Label_0487)
                                }
                                
                                if (cmpne:boolean(and:int(var_1_67:int, ldc:int(1)), ldc:int(0))) {
                                    var_1_67 = and:int(var_1_67:int, ldc:int(-57334782))
                                    goto(Label_0420)
                                }
                                
                                if (cmpeq:boolean(and:int(var_1_67:int, ldc:int(64)), ldc:int(0))) {
                                    if (cmpne:boolean(and:int(var_1_67:int, ldc:int(64)), ldc:int(0))) {
                                        loopcontinue()
                                    }
                                    
                                    var_1_67 = and:int(var_1_67:int, ldc:int(855966846))
                                }
                                
                                Label_0368:
                                
                                if (cmpne:boolean(and:int(var_1_67:int, ldc:int(16384)), ldc:int(0))) {
                                    goto(Label_0487)
                                }
                                
                                if (cmpne:boolean(and:int(var_1_67:int, ldc:int(16384)), ldc:int(0))) {
                                    var_1_67 = and:int(var_1_67:int, ldc:int(1973758205))
                                }
                                else {
                                    if (cmpeq:boolean(and:int(var_1_67:int, ldc:int(2147483647)), ldc:int(0))) {
                                        goto(Label_0323)
                                    }
                                    
                                    if (cmpne:boolean(and:int(var_1_67:int, ldc:int(64)), ldc:int(0))) {
                                        loopcontinue()
                                    }
                                    
                                    var_1_67 = and:int(var_1_67:int, ldc:int(-1487589449))
                                    invokeinterface:void(Iterator<E>::remove, var_4_7E:Iterator<\u527a\u494c\u88c5\u965f\u759a>)
                                }
                                
                                Label_0420:
                                
                                if (cmpeq:boolean(and:int(var_1_67:int, ldc:int(2147483647)), ldc:int(0))) {
                                    var_1_67 = and:int(var_1_67:int, ldc:int(1077285033))
                                }
                                else {
                                    if (cmpeq:boolean(and:int(var_1_67:int, ldc:int(1024)), ldc:int(0))) {
                                        goto(Label_0368)
                                    }
                                    
                                    if (cmpne:boolean(and:int(var_1_67:int, ldc:int(32768)), ldc:int(0))) {
                                        goto(Label_0323)
                                    }
                                    
                                    if (cmpeq:boolean(and:int(var_1_67:int, ldc:int(536870912)), ldc:int(0))) {
                                        loopcontinue()
                                    }
                                    
                                    var_1_67 = and:int(var_1_67:int, ldc:int(-42914286))
                                    invokevirtual:void(\u527a\u494c\u88c5\u965f\u759a::\u98a4\uc31c\u6c52\uf995\u62da\u64f2, var_5_103:\u527a\u494c\u88c5\u965f\u759a, initobject:TranslationTextComponent[expected:ITextComponent](TranslationTextComponent::<init>, loadelement:String(getstatic:String[](\u8389\ub18d\u6b5f\u67e9\uc229\ua61f::\u8709\u6c56\ua562\ube23\u494c\ud4fe), xor:int(ldc:int(2272), ldc:int(2274)))))
                                }
                                
                                Label_0487:
                                
                                if (cmpeq:boolean(and:int(var_1_67:int, ldc:int(65536)), ldc:int(0))) {
                                    var_1_67 = and:int(var_1_67:int, ldc:int(-1199849933))
                                    goto(Label_0420)
                                }
                                
                                if (cmpne:boolean(and:int(var_1_67:int, ldc:int(16384)), ldc:int(0))) {
                                    goto(Label_0368)
                                }
                                
                                if (cmpne:boolean(and:int(var_1_67:int, ldc:int(1048576)), ldc:int(0))) {
                                    goto(Label_0323)
                                }
                                
                                if (cmpeq:boolean(and:int(var_1_67:int, ldc:int(64)), ldc:int(0))) {
                                    looporswitchbreak()
                                }
                                
                                var_1_67 = and:int(var_1_67:int, ldc:int(-1862991889))
                            }
                            
                            var_1_67 = and:int(var_1_67:int, ldc:int(1670735800))
                            loopcontinue()
                        }
                        
                        loopcontinue()
                    }
                    
                    Label_0550:
                    
                    if (cmpne:boolean(and:int(var_1_67:int, ldc:int(1048576)), ldc:int(0))) {
                        var_1_67 = and:int(var_1_67:int, ldc:int(-1654043672))
                        goto(Label_0212)
                    }
                    
                    if (cmpeq:boolean(and:int(var_1_67:int, ldc:int(2147483647)), ldc:int(0))) {
                        var_1_67 = and:int(var_1_67:int, ldc:int(165135933))
                        goto(Label_0183)
                    }
                    
                    if (cmpeq:boolean(and:int(var_1_67:int, ldc:int(32768)), ldc:int(0))) {
                        looporswitchbreak()
                    }
                }
                
                var_1_67 = and:int(var_1_67:int, ldc:int(550622960))
            }
            finally {
                monitorexit(var_3_6D:List<\u527a\u494c\u88c5\u965f\u759a>)
            }
            
            return:void()
        }
        
        goto(Label_0006)
    }
    
    public static net.minecraft.util.text.ITextComponent \u624e\u52d3\ud12e\u7c6b\u983f\ua562(int p0, int p1) {
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
            return:ITextComponent(invokestatic:ITextComponent(\u8389\ub18d\u6b5f\u67e9\uc229\ua61f::\uc2bd\ud523\u392e\u7049\u9a18\u7bad, p0:int, p1:int))
        }
        
        goto(Label_0006)
    }
    
    public static org.apache.logging.log4j.Logger \u4c2b\u3bc9\u8753\uceb8\u8308\ucef1() {
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
            return:Logger(getstatic:Logger(\u8389\ub18d\u6b5f\u67e9\uc229\ua61f::\u7873\u51fa\u12b2\u7af6\ub113\uc246))
        }
        
        goto(Label_0006)
    }
    
    public static void \uc87f\u76bc\u64ab\u7006\u6cfe\u98a4(\u6435\ub8be\u718f\u6b0d\u67e9.\u8389\ub18d\u6b5f\u67e9\uc229\ua61f p0, \u12b2\u7049\u8df4\uc9f6\uae87.\ub8be\u071d\u527a\u3711\ubff1\u759a p1) {
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
            invokespecial:void(\u8389\ub18d\u6b5f\u67e9\uc229\ua61f::\uc29a\uc84e\u9af2\u51b2\u3711\u7bad, p0:\u8389\ub18d\u6b5f\u67e9\uc229\ua61f, p1:\ub8be\u071d\u527a\u3711\ubff1\u759a)
            return:void()
        }
        
        goto(Label_0006)
    }
    
    public static com.google.common.base.Splitter \u3d4b\u71f1\u527a\u3d4b\u7c6b\u5245() {
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
            return:Splitter(getstatic:Splitter(\u8389\ub18d\u6b5f\u67e9\uc229\ua61f::\u4492\u8389\u960f\u3711\u7006\uae87))
        }
        
        goto(Label_0006)
    }
    
    static {
        var_0_61 : int
        expr_68 : byte[] [generated]
        var_2_6C : byte[]
        stack_8D_0 : byte[] [generated]
        stack_8F_0 : byte[] [generated]
        stack_AC_0 : byte[] [generated]
        stack_AE_0 : byte[] [generated]
        stack_C9_0 : byte[] [generated]
        stack_1C7_0 : byte[] [generated]
        stack_24D_0 : byte[] [generated]
        expr_70 : int [generated]
        var_3_15F : byte[]
        var_4_160 : int
        expr_8F : int [generated]
        var_5_1B0 : int
        var_3_1B5 : byte[]
        var_4_1B6 : int
        var_0_1E1 : int
        expr_1C7 : byte [generated]
        stack_218_2 : byte [generated]
        stack_1ED_0 : byte [generated]
        expr_AE : int [generated]
        var_3_23B : byte[]
        var_4_23C : int
        expr_253 : byte [generated]
        var_3_D5 : String
        stack_13E_0 : String[] [generated]
        expr_E7 : String[] [generated]
        
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
            var_0_61 = and:int(ldc:int(-1626888619), ldc:int(-1757974829))
            expr_68 = var_2_6C = stack_8D_0 = stack_8F_0 = stack_AC_0 = stack_AE_0 = stack_C9_0 = stack_1C7_0 = stack_24D_0 = invokevirtual(Decoder::decode, invokestatic(Base64::getDecoder), ldc("Dkf/F/Ue9BUH9BTz3TENEvkGAt1OBQ0KDwABBwEH/xf1HvQVB/QU890xDRL5BgLSMR0JCg0JAbA="))
            expr_70 = add:int(arraylength:int(expr_68:byte[]), ldc:int(-1))
            
            if (cmpne:boolean(expr_70:int, ldc:int(0))) {
                var_3_15F = newarray:byte[](byte.class, expr_70:int)
                var_4_160 = expr_70:int
                
                loop {
                    var_0_61 = and:int(var_0_61:int, ldc:int(-1086455941))
                    var_4_160 = add:int(var_4_160:int, ldc:int(-1))
                    storeelement:byte(var_3_15F:byte[], var_4_160:int, add:int(shl:int(loadelement:byte(expr_68:byte[], var_4_160:int), ldc:int(4)), and:int(shr:int(loadelement:byte(var_2_6C:byte[], add:int(var_4_160:int, and:int(ldc:int(18497), ldc:int(9345)))), ldc:int(4)), xor:int(ldc:int(6), ldc:int(9)))))
                    
                    if (cmpne:boolean(var_4_160:int, ldc:int(0))) {
                        loopcontinue()
                    }
                    
                    looporswitchbreak()
                }
                
                stack_8F_0 = stack_8D_0 = stack_AC_0 = stack_AE_0 = stack_C9_0 = stack_1C7_0 = stack_24D_0 = var_3_15F:byte[]
            }
            
            loop {
                if (cmpeq:boolean(and:int(var_0_61:int, ldc:int(1)), ldc:int(0))) {
                    goto(Label_0179)
                }
                
                if (cmpeq:boolean(and:int(var_0_61:int, ldc:int(16384)), ldc:int(0))) {
                    var_0_61 = and:int(var_0_61:int, ldc:int(1465778169))
                    expr_8F = arraylength:int(stack_8F_0:byte[])
                    
                    if (cmpne:boolean(expr_8F:int, ldc:int(0))) {
                        var_5_1B0 = expr_8F:int
                        var_3_1B5 = newarray:byte[](byte.class, expr_8F:int)
                        var_4_1B6 = expr_8F:int
                        
                        loop {
                            var_0_1E1 = and:int(var_0_61:int, ldc:int(-1287690681))
                            var_4_1B6 = add:int(var_4_1B6:int, ldc:int(-1))
                            expr_1C7 = stack_218_2 = loadelement(stack_1C7_0, var_4_1B6)
                            
                            if (cmplt:boolean(add:int(add:int(var_4_1B6:int, ldc:int(1)), neg:int(var_5_1B0:int)), ldc:int(0))) {
                                stack_218_2 = stack_1ED_0 = add:byte(expr_1C7:byte, loadelement:byte(var_3_1B5:byte[], add:int(var_4_1B6:int, ldc:int(1))))
                                goto(Label_0509)
                            }
                            
                            Label_0468:
                            
                            if (cmpne:boolean(and:int(var_0_1E1:int, ldc:int(524288)), ldc:int(0))) {
                                var_0_1E1 = and:int(var_0_1E1:int, ldc:int(1807691274))
                            }
                            else {
                                var_0_1E1 = and:int(var_0_1E1:int, ldc:int(2142236543))
                                stack_218_2 = stack_1ED_0 = add:byte(expr_1C7:byte, ldc:byte(1))
                            }
                            
                            Label_0509:
                            
                            if (cmpeq:boolean(and:int(var_0_1E1:int, ldc:int(16777216)), ldc:int(0))) {
                                var_0_1E1 = and:int(var_0_1E1:int, ldc:int(-1411930801))
                                goto(Label_0468)
                            }
                            
                            var_0_61 = and:int(var_0_1E1:int, ldc:int(-1826148609))
                            storeelement:byte(var_3_1B5:byte[], var_4_1B6:int, stack_218_2:byte)
                            
                            if (cmpne:boolean(var_4_1B6:int, ldc:int(0))) {
                                loopcontinue()
                            }
                            
                            looporswitchbreak()
                        }
                        
                        stack_8F_0 = stack_8D_0 = stack_AC_0 = stack_AE_0 = stack_C9_0 = stack_1C7_0 = stack_24D_0 = var_3_1B5:byte[]
                    }
                }
                
                Label_0148:
                
                if (cmpeq:boolean(and:int(var_0_61:int, ldc:int(1048576)), ldc:int(0))) {
                    if (cmpne:boolean(and:int(var_0_61:int, ldc:int(8388608)), ldc:int(0))) {
                        loopcontinue()
                    }
                    
                    var_0_61 = and:int(var_0_61:int, ldc:int(1934077683))
                    expr_AE = arraylength:int(stack_AE_0:byte[])
                    
                    if (cmpne:boolean(expr_AE:int, ldc:int(0))) {
                        var_3_23B = newarray:byte[](byte.class, expr_AE:int)
                        var_4_23C = expr_AE:int
                        
                        loop {
                            var_0_61 = and:int(var_0_61:int, ldc:int(2131230407))
                            var_4_23C = add:int(var_4_23C:int, ldc:int(-1))
                            expr_253 = add:byte(xor:byte(loadelement:byte(stack_24D_0:byte[], var_4_23C:int), ldc:byte(62)), ldc:byte(84))
                            storeelement:byte(var_3_23B:byte[], var_4_23C:int, or:int(and:int(shl:int(expr_253:byte, xor:int(ldc:int(17410), ldc:int(17414))), ldc:int(-16)), and:int(shr:int(expr_253:byte[expected:int], xor:int(ldc:int(12304), ldc:int(12308))), ldc:int(15))))
                            
                            if (cmpne:boolean(var_4_23C:int, ldc:int(0))) {
                                loopcontinue()
                            }
                            
                            looporswitchbreak()
                        }
                        
                        stack_8F_0 = stack_8D_0 = stack_AC_0 = stack_AE_0 = stack_C9_0 = stack_1C7_0 = stack_24D_0 = var_3_23B:byte[]
                    }
                }
                
                Label_0179:
                
                if (cmpeq:boolean(and:int(var_0_61:int, ldc:int(2147483647)), ldc:int(0))) {
                    goto(Label_0148)
                }
                
                if (cmpeq:boolean(and:int(var_0_61:int, ldc:int(8)), ldc:int(0))) {
                    looporswitchbreak()
                }
            }
            
            var_3_D5 = initobject:String(String::<init>, stack_C9_0:byte[], getstatic:Charset(StandardCharsets::UTF_8))
            stack_13E_0 = newarray:String[](Ljava.lang.String.class, and:int(ldc:int(1083), ldc:int(10247)))
            expr_E7 = newarray:String[](Ljava.lang.String.class, xor:int(ldc:int(21), ldc:int(22)))
            storeelement:String(expr_E7:String[], xor:int(ldc:int(4128), ldc:int(4129)), invokevirtual:String[expected:String](String::substring, var_3_D5:String, and:int(ldc:int(-20500), ldc:int(20499)), xor:int(ldc:int(6658), ldc:int(6659))))
            storeelement:String(expr_E7:String[], xor:int(ldc:int(1067), ldc:int(1065)), invokevirtual:String[expected:String](String::substring, var_3_D5:String, xor:int(ldc:int(1093), ldc:int(1092)), xor:int(ldc:int(5446), ldc:int(5467))))
            storeelement:String(expr_E7:String[], and:int(ldc:int(20432), ldc:int(-20439)), invokevirtual:String[expected:String](String::substring, var_3_D5:String, and:int(ldc:int(61), ldc:int(10781)), and:int(ldc:int(3127), ldc:int(4535))))
            putstatic:String[](\u8389\ub18d\u6b5f\u67e9\uc229\ua61f::\u8709\u6c56\ua562\ube23\u494c\ud4fe, expr_E7:String[])
            putstatic:Splitter(\u8389\ub18d\u6b5f\u67e9\uc229\ua61f::\u4492\u8389\u960f\u3711\u7006\uae87, invokevirtual:Splitter(Splitter::limit, invokestatic:Splitter(Splitter::on, and:int[expected:char](ldc:int(-5775), ldc:int(5770))), ldc:int(6)))
            putstatic:Logger(\u8389\ub18d\u6b5f\u67e9\uc229\ua61f::\u7873\u51fa\u12b2\u7af6\ub113\uc246, invokestatic:Logger(LogManager::getLogger))
            return:void()
        }
        
        goto(Label_0006)
    }
    
    public void \u6ec6\u99f7\u946b\u4ab3\u8709\u4492(\u6ec6\ubb2b\uf94d\u6d99\u4f52.\uae87\u3bc9\u3bc9\u7049\uc246\u3e75 p0, \u7c6b\u7c6b\ubefe\u385b\u3c25.\u4ab3\ub83f\u718f\ucb79\u120d.\u6b5f\u5f50\ubefe\ucfaf\u4f52\ub18d p1) {
        var_3_61B : int
        var_5_80 : int
        var_6_87 : int
        var_7_96 : double
        var_9_BD : double
        var_3_CF : int
        var_11_E0 : int
        var_14_10A : double
        var_16_10E : int
        var_12_106 : double
        var_17_626 : int
        
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
        var_3_61B = and:int(ldc:int(614938485), ldc:int(-22956450))
        
        if (cmpeq:boolean(getstatic:double(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u6c56\u8cae\uc31c\u446c\uc9f6\u873d), ldc:double(0.0))) {
            invokestatic:void(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u0800\u2dcc\uc4d2\u8aa5\u4cd9\u51b2, this:\u8389\ub18d\u6b5f\u67e9\uc229\ua61f[expected:Object], p0:\uae87\u3bc9\u3bc9\u7049\uc246\u3e75[expected:Object])
            goto(Label_0170)
        }
        
        Label_0108:
        
        if (cmpeq:boolean(and:int(var_3_61B:int, ldc:int(1073741824)), ldc:int(0))) {
            var_3_61B = and:int(var_3_61B:int, ldc:int(2062793430))
            var_5_80 = and:int(ldc:int(-17162), ldc:int(17161))
            var_6_87 = invokestatic:int(\uae87\u3bc9\u3bc9\u7049\uc246\u3e75::\u8389\u3bd6\u3bc9\uc2bd\u8640\u52d3)
            var_7_96 = loadelement:double(getstatic:double[](\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), and:int(ldc:int(25157), ldc:int(-25286)))
            invokestatic:int(m::a)
            
            loop {
                var_9_BD = ldc:double(0.0)
                
                if (cmpne:boolean(getstatic:ap(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::a), getstatic:ap(ap::a))) {
                    var_3_CF = and:int(var_3_61B:int, ldc:int(-1902036995))
                    var_9_BD = sub:double(var_7_96:double, mul:double(getstatic:double(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u6c56\u8cae\uc31c\u446c\uc9f6\u873d), ldc:double(0.001)))
                    var_11_E0 = var_5_80:int
                    
                    while (logicaland:boolean(cmplt:boolean(var_11_E0:int, sub:int(var_6_87:int, xor:int(ldc:int(24576), ldc:int(24577)))), cmplt:boolean(loadelement:double(getstatic:double[](\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), add:int(var_11_E0:int, and:int(ldc:int(17041), ldc:int(5455)))), var_7_96:double))) {
                        inc:int(var_11_E0, ldc:int(1))
                    }
                    
                    var_3_61B = and:int(var_3_CF:int, ldc:int(1740469975))
                    var_14_10A = var_7_96:double
                    var_16_10E = var_11_E0:int
                }
                else {
                    var_11_E0 = sub:int(add:int(invokestatic:int(d::a, getstatic:double(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u6c56\u8cae\uc31c\u446c\uc9f6\u873d)), var_5_80:int), xor:int(ldc:int(8392), ldc:int(8393)))
                    var_12_106 = var_14_10A = loadelement(getstatic(\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), var_5_80)
                    
                    if (cmplt:boolean(var_16_10E = var_11_E0:int, var_6_87:int)) {
                        var_9_BD = loadelement:double(getstatic:double[](\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), var_11_E0:int)
                        var_16_10E = var_11_E0:int
                        var_14_10A = var_12_106:double
                    }
                }
                
                loop {
                    if (cmpeq:boolean(and:int(var_3_61B:int, ldc:int(512)), ldc:int(0))) {
                        goto(Label_1436)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_61B:int, ldc:int(8388608)), ldc:int(0))) {
                        goto(Label_1292)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_61B:int, ldc:int(2147483647)), ldc:int(0))) {
                        goto(Label_1153)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_61B:int, ldc:int(8388608)), ldc:int(0))) {
                        var_3_61B = and:int(var_3_61B:int, ldc:int(243125924))
                        goto(Label_1063)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_61B:int, ldc:int(2097152)), ldc:int(0))) {
                        goto(Label_0917)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_61B:int, ldc:int(1073741824)), ldc:int(0))) {
                        var_3_61B = and:int(var_3_61B:int, ldc:int(-2133159907))
                        goto(Label_0796)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_61B:int, ldc:int(512)), ldc:int(0))) {
                        var_3_61B = and:int(var_3_61B:int, ldc:int(-1052684254))
                        goto(Label_0678)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_61B:int, ldc:int(2147483647)), ldc:int(0))) {
                        goto(Label_0548)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_61B:int, ldc:int(134217728)), ldc:int(0))) {
                        var_3_61B = and:int(var_3_61B:int, ldc:int(1755969270))
                        
                        if (cmplt:boolean(var_16_10E:int, var_6_87:int)) {
                            if (cmpne:boolean(getstatic:ao(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::i), getstatic:ao(ao::a))) {
                                goto(Label_0548)
                            }
                            
                            goto(Label_0796)
                        }
                    }
                    
                    Label_0388:
                    
                    if (cmpeq:boolean(and:int(var_3_61B:int, ldc:int(8192)), ldc:int(0))) {
                        goto(Label_1436)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_61B:int, ldc:int(2147483647)), ldc:int(0))) {
                        var_3_61B = and:int(var_3_61B:int, ldc:int(1482217441))
                        goto(Label_1292)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_61B:int, ldc:int(8192)), ldc:int(0))) {
                        var_3_61B = and:int(var_3_61B:int, ldc:int(1921360220))
                        goto(Label_1153)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_61B:int, ldc:int(8388608)), ldc:int(0))) {
                        var_3_61B = and:int(var_3_61B:int, ldc:int(-43325606))
                        goto(Label_1063)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_61B:int, ldc:int(128)), ldc:int(0))) {
                        goto(Label_0917)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_61B:int, ldc:int(65536)), ldc:int(0))) {
                        var_3_61B = and:int(var_3_61B:int, ldc:int(-67123600))
                        goto(Label_0796)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_61B:int, ldc:int(134217728)), ldc:int(0))) {
                        goto(Label_0678)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_61B:int, ldc:int(2097152)), ldc:int(0))) {
                        if (cmpne:boolean(and:int(var_3_61B:int, ldc:int(2147483647)), ldc:int(0))) {
                            var_3_61B = and:int(var_3_61B:int, ldc:int(-1883931650))
                            var_11_E0 = and:int(ldc:int(-11311), ldc:int(9262))
                            goto(Label_1425)
                        }
                        
                        loopcontinue()
                    }
                    
                    Label_0548:
                    
                    if (cmpne:boolean(and:int(var_3_61B:int, ldc:int(134217728)), ldc:int(0))) {
                        var_3_61B = and:int(var_3_61B:int, ldc:int(633772807))
                        goto(Label_1436)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_61B:int, ldc:int(1073741824)), ldc:int(0))) {
                        var_3_61B = and:int(var_3_61B:int, ldc:int(1399230308))
                        goto(Label_1292)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_61B:int, ldc:int(134217728)), ldc:int(0))) {
                        goto(Label_1153)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_61B:int, ldc:int(8192)), ldc:int(0))) {
                        goto(Label_1063)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_61B:int, ldc:int(2147483647)), ldc:int(0))) {
                        goto(Label_0917)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_61B:int, ldc:int(16)), ldc:int(0))) {
                        var_3_61B = and:int(var_3_61B:int, ldc:int(789863590))
                        goto(Label_0796)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_61B:int, ldc:int(4)), ldc:int(0))) {
                        var_3_61B = and:int(var_3_61B:int, ldc:int(-2119161544))
                    }
                    else {
                        if (cmpeq:boolean(and:int(var_3_61B:int, ldc:int(8388608)), ldc:int(0))) {
                            goto(Label_0388)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_61B:int, ldc:int(128)), ldc:int(0))) {
                            var_3_61B = and:int(var_3_61B:int, ldc:int(-1565216217))
                            loopcontinue()
                        }
                        
                        var_3_61B = and:int(var_3_61B:int, ldc:int(-1124244771))
                        
                        if (cmpeq:boolean(getstatic:ao(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::i), getstatic:ao(ao::c))) {
                            var_14_10A = var_9_BD:double
                            goto(Label_0796)
                        }
                    }
                    
                    Label_0678:
                    
                    if (cmpne:boolean(and:int(var_3_61B:int, ldc:int(128)), ldc:int(0))) {
                        goto(Label_1436)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_61B:int, ldc:int(2147483647)), ldc:int(0))) {
                        goto(Label_1292)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_61B:int, ldc:int(16)), ldc:int(0))) {
                        goto(Label_1153)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_61B:int, ldc:int(2097152)), ldc:int(0))) {
                        var_3_61B = and:int(var_3_61B:int, ldc:int(-2145445640))
                        goto(Label_1063)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_61B:int, ldc:int(134217728)), ldc:int(0))) {
                        var_3_61B = and:int(var_3_61B:int, ldc:int(719579109))
                        goto(Label_0917)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_61B:int, ldc:int(1073741824)), ldc:int(0))) {
                        if (cmpne:boolean(and:int(var_3_61B:int, ldc:int(134217728)), ldc:int(0))) {
                            goto(Label_0548)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_61B:int, ldc:int(2147483647)), ldc:int(0))) {
                            var_3_61B = and:int(var_3_61B:int, ldc:int(1548050076))
                            goto(Label_0388)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_61B:int, ldc:int(2147483647)), ldc:int(0))) {
                            loopcontinue()
                        }
                        
                        var_3_61B = and:int(var_3_61B:int, ldc:int(1692478423))
                        var_14_10A = mul:double(ldc:double(0.5), add:double(var_9_BD:double, var_14_10A:double))
                    }
                    
                    Label_0796:
                    
                    if (cmpne:boolean(and:int(var_3_61B:int, ldc:int(134217728)), ldc:int(0))) {
                        var_3_61B = and:int(var_3_61B:int, ldc:int(1344991422))
                        goto(Label_1436)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_61B:int, ldc:int(134217728)), ldc:int(0))) {
                        goto(Label_1292)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_61B:int, ldc:int(134217728)), ldc:int(0))) {
                        goto(Label_1153)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_61B:int, ldc:int(1073741824)), ldc:int(0))) {
                        var_3_61B = and:int(var_3_61B:int, ldc:int(-1282980998))
                        goto(Label_1063)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_61B:int, ldc:int(8388608)), ldc:int(0))) {
                        var_3_61B = and:int(var_3_61B:int, ldc:int(-1944948614))
                    }
                    else {
                        if (cmpeq:boolean(and:int(var_3_61B:int, ldc:int(65536)), ldc:int(0))) {
                            goto(Label_0678)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_61B:int, ldc:int(2097152)), ldc:int(0))) {
                            goto(Label_0548)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_61B:int, ldc:int(65536)), ldc:int(0))) {
                            goto(Label_0388)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_61B:int, ldc:int(1073741824)), ldc:int(0))) {
                            var_3_61B = and:int(var_3_61B:int, ldc:int(-1398292955))
                            loopcontinue()
                        }
                        
                        var_3_61B = and:int(var_3_61B:int, ldc:int(-554354978))
                        
                        if (cmpeq:boolean(getstatic:ap(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::a), getstatic:ap(ap::b))) {
                            if (cmplt:boolean(loadelement:double(getstatic:double[](\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), var_5_80:int), var_7_96:double)) {
                                var_11_E0 = and:int(ldc:int(16385), ldc:int(257))
                                goto(Label_1063)
                            }
                        }
                    }
                    
                    Label_0917:
                    
                    if (cmpeq:boolean(and:int(var_3_61B:int, ldc:int(512)), ldc:int(0))) {
                        goto(Label_1436)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_61B:int, ldc:int(128)), ldc:int(0))) {
                        var_3_61B = and:int(var_3_61B:int, ldc:int(617678181))
                        goto(Label_1292)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_61B:int, ldc:int(1048576)), ldc:int(0))) {
                        goto(Label_1153)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_61B:int, ldc:int(8192)), ldc:int(0))) {
                        if (cmpeq:boolean(and:int(var_3_61B:int, ldc:int(4)), ldc:int(0))) {
                            goto(Label_0796)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_61B:int, ldc:int(512)), ldc:int(0))) {
                            var_3_61B = and:int(var_3_61B:int, ldc:int(378459840))
                            goto(Label_0678)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_61B:int, ldc:int(64)), ldc:int(0))) {
                            goto(Label_0548)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_61B:int, ldc:int(1073741824)), ldc:int(0))) {
                            goto(Label_0388)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_61B:int, ldc:int(65536)), ldc:int(0))) {
                            var_3_61B = and:int(var_3_61B:int, ldc:int(-1996795863))
                            loopcontinue()
                        }
                        
                        var_3_61B = and:int(var_3_61B:int, ldc:int(-1331479948))
                        var_11_E0 = and:int(ldc:int(-24401), ldc:int(24400))
                    }
                    
                    Label_1063:
                    
                    if (cmpne:boolean(and:int(var_3_61B:int, ldc:int(128)), ldc:int(0))) {
                        goto(Label_1436)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_61B:int, ldc:int(2147483647)), ldc:int(0))) {
                        goto(Label_1292)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_61B:int, ldc:int(2147483647)), ldc:int(0))) {
                        if (cmpeq:boolean(and:int(var_3_61B:int, ldc:int(65536)), ldc:int(0))) {
                            goto(Label_0917)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_61B:int, ldc:int(64)), ldc:int(0))) {
                            goto(Label_0796)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_61B:int, ldc:int(128)), ldc:int(0))) {
                            goto(Label_0678)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_61B:int, ldc:int(64)), ldc:int(0))) {
                            var_3_61B = and:int(var_3_61B:int, ldc:int(388264282))
                            goto(Label_0548)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_61B:int, ldc:int(8388608)), ldc:int(0))) {
                            goto(Label_0388)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_61B:int, ldc:int(128)), ldc:int(0))) {
                            loopcontinue()
                        }
                        
                        var_3_61B = and:int(var_3_61B:int, ldc:int(531719807))
                        
                        if (cmpne:boolean(getstatic:ap(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::a), getstatic:ap(ap::a))) {
                            if (cmpeq:boolean(var_11_E0:int, ldc:int(0))) {
                                goto(Label_1292)
                            }
                        }
                    }
                    
                    Label_1153:
                    
                    if (cmpeq:boolean(and:int(var_3_61B:int, ldc:int(2147483647)), ldc:int(0))) {
                        goto(Label_1436)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_61B:int, ldc:int(64)), ldc:int(0))) {
                        if (cmpne:boolean(and:int(var_3_61B:int, ldc:int(134217728)), ldc:int(0))) {
                            var_3_61B = and:int(var_3_61B:int, ldc:int(-1238428835))
                            goto(Label_1063)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_61B:int, ldc:int(1048576)), ldc:int(0))) {
                            goto(Label_0917)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_61B:int, ldc:int(128)), ldc:int(0))) {
                            var_3_61B = and:int(var_3_61B:int, ldc:int(-125606965))
                            goto(Label_0796)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_61B:int, ldc:int(64)), ldc:int(0))) {
                            var_3_61B = and:int(var_3_61B:int, ldc:int(-844767856))
                            goto(Label_0678)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_61B:int, ldc:int(1073741824)), ldc:int(0))) {
                            goto(Label_0548)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_61B:int, ldc:int(16)), ldc:int(0))) {
                            var_3_61B = and:int(var_3_61B:int, ldc:int(1205757176))
                            goto(Label_0388)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_61B:int, ldc:int(65536)), ldc:int(0))) {
                            var_3_61B = and:int(var_3_61B:int, ldc:int(1319652033))
                            loopcontinue()
                        }
                        
                        var_3_61B = and:int(var_3_61B:int, ldc:int(-559808906))
                        invokestatic:void(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u0800\u2dcc\uc4d2\u8aa5\u4cd9\u51b2, p0:\uae87\u3bc9\u3bc9\u7049\uc246\u3e75, var_14_10A:double, var_5_80:int, var_16_10E:int)
                        goto(Label_1425)
                    }
                    
                    Label_1292:
                    
                    if (cmpeq:boolean(and:int(var_3_61B:int, ldc:int(16)), ldc:int(0))) {
                        var_3_61B = and:int(var_3_61B:int, ldc:int(-1217392402))
                        goto(Label_1436)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_61B:int, ldc:int(65536)), ldc:int(0))) {
                        goto(Label_1153)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_61B:int, ldc:int(4)), ldc:int(0))) {
                        goto(Label_1063)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_61B:int, ldc:int(8192)), ldc:int(0))) {
                        goto(Label_0917)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_61B:int, ldc:int(2147483647)), ldc:int(0))) {
                        goto(Label_0796)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_61B:int, ldc:int(134217728)), ldc:int(0))) {
                        goto(Label_0678)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_61B:int, ldc:int(1048576)), ldc:int(0))) {
                        var_3_61B = and:int(var_3_61B:int, ldc:int(1694022518))
                        goto(Label_0548)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_61B:int, ldc:int(2097152)), ldc:int(0))) {
                        var_3_61B = and:int(var_3_61B:int, ldc:int(-338212381))
                        goto(Label_0388)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_61B:int, ldc:int(128)), ldc:int(0))) {
                        var_3_61B = and:int(var_3_61B:int, ldc:int(-1540582799))
                        loopcontinue()
                    }
                    
                    var_3_61B = and:int(var_3_61B:int, ldc:int(1944941405))
                    invokestatic:void(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u0800\u2dcc\uc4d2\u8aa5\u4cd9\u51b2, invokestatic:boolean(\uae87\u3bc9\u3bc9\u7049\uc246\u3e75::\u0a06\u59ec\u93a2\u9937\ub83f\ub171), var_14_10A:double, ldc:double(0.0))
                    Label_1425:
                    
                    if (cmpne:boolean(getstatic:ap(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::a), getstatic:ap(ap::a))) {
                        var_17_626 = var_5_80:int
                        
                        if (cmpeq:boolean(var_11_E0:int, ldc:int(0))) {
                            looporswitchbreak()
                        }
                    }
                    
                    Label_1436:
                    
                    if (cmpeq:boolean(and:int(var_3_61B:int, ldc:int(2147483647)), ldc:int(0))) {
                        var_3_61B = and:int(var_3_61B:int, ldc:int(-132137746))
                        goto(Label_1292)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_61B:int, ldc:int(8388608)), ldc:int(0))) {
                        var_3_61B = and:int(var_3_61B:int, ldc:int(-1138853749))
                        goto(Label_1153)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_61B:int, ldc:int(2147483647)), ldc:int(0))) {
                        goto(Label_1063)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_61B:int, ldc:int(512)), ldc:int(0))) {
                        goto(Label_0917)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_61B:int, ldc:int(1073741824)), ldc:int(0))) {
                        var_3_61B = and:int(var_3_61B:int, ldc:int(-466387585))
                        goto(Label_0796)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_61B:int, ldc:int(512)), ldc:int(0))) {
                        goto(Label_0678)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_61B:int, ldc:int(8192)), ldc:int(0))) {
                        var_3_61B = and:int(var_3_61B:int, ldc:int(2119607562))
                        goto(Label_0548)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_61B:int, ldc:int(2097152)), ldc:int(0))) {
                        var_3_61B = and:int(var_3_61B:int, ldc:int(-1952004350))
                        goto(Label_0388)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_61B:int, ldc:int(4)), ldc:int(0))) {
                        var_3_61B = and:int(var_3_61B:int, ldc:int(-760891553))
                        var_17_626 = add:int(var_16_10E:int, and:int(ldc:int(4137), ldc:int(261)))
                        looporswitchbreak()
                    }
                    
                    var_3_61B = and:int(var_3_61B:int, ldc:int(1044964849))
                }
                
                var_3_61B = and:int(var_3_61B:int, ldc:int(1555559127))
                
                if (cmple:boolean(var_5_80 = var_17_626:int, sub:int(var_6_87:int, xor:int(ldc:int(1158), ldc:int(1159))))) {
                    loopcontinue()
                }
                
                looporswitchbreak()
            }
        }
        
        Label_0170:
        
        if (cmpeq:boolean(and:int(var_3_61B:int, ldc:int(128)), ldc:int(0))) {
            return:void()
        }
        
        goto(Label_0108)
    }
}
