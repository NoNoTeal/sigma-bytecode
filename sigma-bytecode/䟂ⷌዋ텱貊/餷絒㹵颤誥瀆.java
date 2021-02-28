public class \u47c2\u2dcc\u12cb\ud171\u8c8a.\u9937\u7d52\u3e75\u98a4\u8aa5\u7006 {
    private \ub113\uc4d2\u183a\u527a\u6435.\u4ab3\ub1b9\u2dcc\ub8be\ube23\uc910 \u8640\u5654\ubb2b\u5d20\u446c\u97b7(\u71f1\uc910\u3bc9\u516c\u93a2.\u6b0d\ud171\uc7fe\u52d3\uafe7\u6c56 p0, \ub113\uc4d2\u183a\u527a\u6435.\u4ab3\ub1b9\u2dcc\ub8be\ube23\uc910 p1, \u927d\u92ff\u71ae\uafe7\u6bb9.\u760c\u4975\u4179\uc246\u8640\u64f2 p2) {
        var_4_5D : \u6b0d\ud171\uc7fe\u52d3\uafe7\u6c56
        
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
        var_4_5D = invokevirtual:\u6b0d\ud171\uc7fe\u52d3\uafe7\u6c56(\u4ab3\ub1b9\u2dcc\ub8be\ube23\uc910::\u3776\u3c25\u647c\u946b\u16f6\u6ec6, p1:\u4ab3\ub1b9\u2dcc\ub8be\ube23\uc910, p2:\u760c\u4975\u4179\uc246\u8640\u64f2)
        
        if (cmpgt:boolean(invokestatic:int(\u927d\uc7fe\u92ff\u98a4\uc84e\uf9c5::\u4c2b\u494c\uc29a\u8640\uf995\u71ae, sub:int(invokevirtual:int(\u3a62\uc9f6\u3776\u4f52\ua068\u34df::\u8aa5\u97b7\u4daf\u72f1\u600f\u8cae, p0:\u6b0d\ud171\uc7fe\u52d3\uafe7\u6c56[expected:\u3a62\uc9f6\u3776\u4f52\ua068\u34df]), invokevirtual:int(\u3a62\uc9f6\u3776\u4f52\ua068\u34df::\u8aa5\u97b7\u4daf\u72f1\u600f\u8cae, var_4_5D:\u6b0d\ud171\uc7fe\u52d3\uafe7\u6c56[expected:\u3a62\uc9f6\u3776\u4f52\ua068\u34df]))), mul:int(getfield:int(\u9937\u7d52\u3e75\u98a4\u8aa5\u7006::\u98a4\u600f\u4f4a\ub70c\ud523\u4e72, this:\u9937\u7d52\u3e75\u98a4\u8aa5\u7006), ldc:int(16)))) {
            return:\u4ab3\ub1b9\u2dcc\ub8be\ube23\uc910(aconstnull:\u4ab3\ub1b9\u2dcc\ub8be\ube23\uc910())
        }
        
        if (logicaland:boolean(cmpge:boolean(invokevirtual:int(\u3a62\uc9f6\u3776\u4f52\ua068\u34df::\u9af2\u8350\u8350\u93a2\u494c\u624e, var_4_5D:\u6b0d\ud171\uc7fe\u52d3\uafe7\u6c56[expected:\u3a62\uc9f6\u3776\u4f52\ua068\u34df]), ldc:int(0)), cmplt:boolean(invokevirtual:int(\u3a62\uc9f6\u3776\u4f52\ua068\u34df::\u9af2\u8350\u8350\u93a2\u494c\u624e, var_4_5D:\u6b0d\ud171\uc7fe\u52d3\uafe7\u6c56[expected:\u3a62\uc9f6\u3776\u4f52\ua068\u34df]), ldc:int(256)))) {
            return:\u4ab3\ub1b9\u2dcc\ub8be\ube23\uc910(ternaryop:\u4ab3\ub1b9\u2dcc\ub8be\ube23\uc910(cmpgt:boolean(invokestatic:int(\u927d\uc7fe\u92ff\u98a4\uc84e\uf9c5::\u4c2b\u494c\uc29a\u8640\uf995\u71ae, sub:int(invokevirtual:int(\u3a62\uc9f6\u3776\u4f52\ua068\u34df::\u3e75\uc29a\u071d\u4d85\ubded\ub70c, p0:\u6b0d\ud171\uc7fe\u52d3\uafe7\u6c56[expected:\u3a62\uc9f6\u3776\u4f52\ua068\u34df]), invokevirtual:int(\u3a62\uc9f6\u3776\u4f52\ua068\u34df::\u3e75\uc29a\u071d\u4d85\ubded\ub70c, var_4_5D:\u6b0d\ud171\uc7fe\u52d3\uafe7\u6c56[expected:\u3a62\uc9f6\u3776\u4f52\ua068\u34df]))), mul:int(getfield:int(\u9937\u7d52\u3e75\u98a4\u8aa5\u7006::\u98a4\u600f\u4f4a\ub70c\ud523\u4e72, this:\u9937\u7d52\u3e75\u98a4\u8aa5\u7006), ldc:int(16))), aconstnull:\u4ab3\ub1b9\u2dcc\ub8be\ube23\uc910(), invokevirtual:\u4ab3\ub1b9\u2dcc\ub8be\ube23\uc910(\u61a4\u946b\u4daf\uc2e8\uc4d2\u5140::\ucb79\u99f7\u4975\ud7e8\u64ab\u12b2, getfield:\u61a4\u946b\u4daf\uc2e8\uc4d2\u5140(\u9937\u7d52\u3e75\u98a4\u8aa5\u7006::\u6b5f\u071d\u8640\uc84e\u7bad\u071d, this:\u9937\u7d52\u3e75\u98a4\u8aa5\u7006), var_4_5D:\u6b0d\ud171\uc7fe\u52d3\uafe7\u6c56)))
        }
        
        return:\u4ab3\ub1b9\u2dcc\ub8be\ube23\uc910(aconstnull:\u4ab3\ub1b9\u2dcc\ub8be\ube23\uc910())
    }
    
    public void \u9937\u7d52\u3e75\u98a4\u8aa5\u7006(\ubcb0\ud12e\u51fa\u8aa5\u0c95.\u67e9\u4daf\u760c\ud217\ua6bd\ubff1 p0, \ubcb0\ud12e\u51fa\u8aa5\u0c95.\uafe7\uc2e8\u8389\ufcaf\ub19c\u51b2 p1) {
        var_3_25F : int
        var_4_267 : int
        var_5_276 : float
        var_6_27D : float
        var_7_28D : float
        
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
            invokespecial:Object(Object::<init>, this:\u9937\u7d52\u3e75\u98a4\u8aa5\u7006)
            putfield:Set<\u4ab3\ub1b9\u2dcc\ub8be\ube23\uc910>(\u9937\u7d52\u3e75\u98a4\u8aa5\u7006::\ub70c\ud4fe\u7e3f\ud36e\u59ec\u946b, this:\u9937\u7d52\u3e75\u98a4\u8aa5\u7006, initobject:ObjectLinkedOpenHashSet[expected:Set<\u4ab3\ub1b9\u2dcc\ub8be\ube23\uc910>](ObjectLinkedOpenHashSet::<init>))
            putfield:ObjectList<\u61a4\u7873\u12b2\u760c\u67e9\u4492>(\u9937\u7d52\u3e75\u98a4\u8aa5\u7006::\u92ee\u3dd3\ud7e8\u9a18\u8350\uafe7, this:\u9937\u7d52\u3e75\u98a4\u8aa5\u7006, initobject:ObjectArrayList[expected:ObjectList<\u61a4\u7873\u12b2\u760c\u67e9\u4492>](ObjectArrayList::<init>, ldc:int(69696)))
            putfield:Set<\ub83f\uc9f6\u47c2\u67d0\u7ce1>(\u9937\u7d52\u3e75\u98a4\u8aa5\u7006::\uc4d2\u8df4\ub83f\u946b\u34df\u6198, this:\u9937\u7d52\u3e75\u98a4\u8aa5\u7006, invokestatic:HashSet[expected:Set<\ub83f\uc9f6\u47c2\u67d0\u7ce1>](Sets::newHashSet))
            putfield:\u74b1\u6d69\ud4fe\u4179\u8c8a\u965f(\u9937\u7d52\u3e75\u98a4\u8aa5\u7006::\u3c25\u8cae\ub70c\ufe34\u946b\uf94d, this:\u9937\u7d52\u3e75\u98a4\u8aa5\u7006, getstatic:\u74b1\u6d69\ud4fe\u4179\u8c8a\u965f(\u6d69\u4c04\ub113\u92ff\u3e75\u12b2::\u983f\u3e2a\u7e3f\u4ab3\u99f7\u7bad))
            putfield:boolean(\u9937\u7d52\u3e75\u98a4\u8aa5\u7006::\u392e\u4cd9\u8df4\u624e\u51b2\u69d9, this:\u9937\u7d52\u3e75\u98a4\u8aa5\u7006, ldc:boolean(1))
            putfield:\ub83f\u2dcc\u3d64\u8bb0\u67e9\u3711(\u9937\u7d52\u3e75\u98a4\u8aa5\u7006::\u47c2\uc2bd\u718f\ud4fe\u600f\ube23, this:\u9937\u7d52\u3e75\u98a4\u8aa5\u7006, initobject:\ub83f\u2dcc\u3d64\u8bb0\u67e9\u3711(\ub83f\u2dcc\u3d64\u8bb0\u67e9\u3711::<init>, ldc:int(100)))
            putfield:Int2ObjectMap<\ub32d\u6b5f\u7049\u8753\u34df\u64ab>(\u9937\u7d52\u3e75\u98a4\u8aa5\u7006::\uc238\u983f\uc3e3\u3bd6\u8308\u6c52, this:\u9937\u7d52\u3e75\u98a4\u8aa5\u7006, initobject:Int2ObjectOpenHashMap[expected:Int2ObjectMap<\ub32d\u6b5f\u7049\u8753\u34df\u64ab>](Int2ObjectOpenHashMap::<init>))
            putfield:Long2ObjectMap<SortedSet<\ub32d\u6b5f\u7049\u8753\u34df\u64ab>>(\u9937\u7d52\u3e75\u98a4\u8aa5\u7006::\u0c95\u4ab3\u74b1\ub6ab\u624e\ufe34, this:\u9937\u7d52\u3e75\u98a4\u8aa5\u7006, initobject:Long2ObjectOpenHashMap[expected:Long2ObjectMap<SortedSet<\ub32d\u6b5f\u7049\u8753\u34df\u64ab>>](Long2ObjectOpenHashMap::<init>))
            putfield:Map<\u6b0d\ud171\uc7fe\u52d3\uafe7\u6c56, \u9033\u6b0d\u3d64\uae87\u4c04\u965f>(\u9937\u7d52\u3e75\u98a4\u8aa5\u7006::\ub83f\u64ab\uae5d\u88c5\ud523\u16f6, this:\u9937\u7d52\u3e75\u98a4\u8aa5\u7006, invokestatic:HashMap[expected:Map<\u6b0d\ud171\uc7fe\u52d3\uafe7\u6c56, \u9033\u6b0d\u3d64\uae87\u4c04\u965f>](Maps::newHashMap))
            putfield:double(\u9937\u7d52\u3e75\u98a4\u8aa5\u7006::\u3c25\u1187\u97b7\ud12e\ucfaf\u5db4, this:\u9937\u7d52\u3e75\u98a4\u8aa5\u7006, ldc:double(4.9E-324))
            putfield:double(\u9937\u7d52\u3e75\u98a4\u8aa5\u7006::\u8d90\u5bc4\uc246\u8389\u5f50\uc31c, this:\u9937\u7d52\u3e75\u98a4\u8aa5\u7006, ldc:double(4.9E-324))
            putfield:double(\u9937\u7d52\u3e75\u98a4\u8aa5\u7006::\ud158\u4ab3\u93a2\u34df\ub18d\u69d9, this:\u9937\u7d52\u3e75\u98a4\u8aa5\u7006, ldc:double(4.9E-324))
            putfield:int(\u9937\u7d52\u3e75\u98a4\u8aa5\u7006::\u3bc9\ubefe\u3776\u3e2a\u98a4\u3711, this:\u9937\u7d52\u3e75\u98a4\u8aa5\u7006, ldc:int(-2147483648))
            putfield:int(\u9937\u7d52\u3e75\u98a4\u8aa5\u7006::\u99f7\u3a62\u3d4b\u98a4\ua61f\ub113, this:\u9937\u7d52\u3e75\u98a4\u8aa5\u7006, ldc:int(-2147483648))
            putfield:int(\u9937\u7d52\u3e75\u98a4\u8aa5\u7006::\u156b\u8308\u4bc8\u3504\uc3e3\u156b, this:\u9937\u7d52\u3e75\u98a4\u8aa5\u7006, ldc:int(-2147483648))
            putfield:double(\u9937\u7d52\u3e75\u98a4\u8aa5\u7006::\u6d99\u3711\u4f52\u6ec6\u99f7\u8c8a, this:\u9937\u7d52\u3e75\u98a4\u8aa5\u7006, ldc:double(4.9E-324))
            putfield:double(\u9937\u7d52\u3e75\u98a4\u8aa5\u7006::\u5245\u62da\u51fa\ubefe\u4c04\u6b0d, this:\u9937\u7d52\u3e75\u98a4\u8aa5\u7006, ldc:double(4.9E-324))
            putfield:double(\u9937\u7d52\u3e75\u98a4\u8aa5\u7006::\u12cb\u965f\u5fe1\ub113\uc31c\u7873, this:\u9937\u7d52\u3e75\u98a4\u8aa5\u7006, ldc:double(4.9E-324))
            putfield:double(\u9937\u7d52\u3e75\u98a4\u8aa5\u7006::\uc3e3\ua61f\u8413\u6ec6\u183a\u16f6, this:\u9937\u7d52\u3e75\u98a4\u8aa5\u7006, ldc:double(4.9E-324))
            putfield:double(\u9937\u7d52\u3e75\u98a4\u8aa5\u7006::\u5f50\u7c6b\u3d64\u62da\uc238\u4d85, this:\u9937\u7d52\u3e75\u98a4\u8aa5\u7006, ldc:double(4.9E-324))
            putfield:int(\u9937\u7d52\u3e75\u98a4\u8aa5\u7006::\ud158\u4f52\u647c\u4975\u927d\u3e75, this:\u9937\u7d52\u3e75\u98a4\u8aa5\u7006, ldc:int(-2147483648))
            putfield:int(\u9937\u7d52\u3e75\u98a4\u8aa5\u7006::\u7330\u5140\u3711\uc7fe\u36d3\uc910, this:\u9937\u7d52\u3e75\u98a4\u8aa5\u7006, ldc:int(-2147483648))
            putfield:int(\u9937\u7d52\u3e75\u98a4\u8aa5\u7006::\u5db4\u0a06\u5654\u76bc\u98a4\u8709, this:\u9937\u7d52\u3e75\u98a4\u8aa5\u7006, ldc:int(-2147483648))
            putfield:\u3a62\u5d20\u4f52\uc229\u8308\ud7e8(\u9937\u7d52\u3e75\u98a4\u8aa5\u7006::\uc3e3\u5fe1\u3504\ubefe\u3e75\ucfaf, this:\u9937\u7d52\u3e75\u98a4\u8aa5\u7006, getstatic:\u3a62\u5d20\u4f52\uc229\u8308\ud7e8(\u3a62\u5d20\u4f52\uc229\u8308\ud7e8::\u52d3\ua6bd\ubefe\u836c\u6d99\uc2bd))
            putfield:\u74b1\u6d69\ud4fe\u4179\u8c8a\u965f(\u9937\u7d52\u3e75\u98a4\u8aa5\u7006::\u51fa\u4ab3\u5d20\uc31c\u7330\u52d3, this:\u9937\u7d52\u3e75\u98a4\u8aa5\u7006, getstatic:\u74b1\u6d69\ud4fe\u4179\u8c8a\u965f(\u6d69\u4c04\ub113\u92ff\u3e75\u12b2::\u5654\u6d69\u7006\u92ee\u5bc4\u071d))
            putfield:int(\u9937\u7d52\u3e75\u98a4\u8aa5\u7006::\u98a4\u600f\u4f4a\ub70c\ud523\u4e72, this:\u9937\u7d52\u3e75\u98a4\u8aa5\u7006, ldc:int(-1))
            putfield:\ub113\uc87f\ubb2b\u4e72\u3e75\ub70c[](\u9937\u7d52\u3e75\u98a4\u8aa5\u7006::\ud158\uf995\uceb8\u600f\u5245\u4cd9, this:\u9937\u7d52\u3e75\u98a4\u8aa5\u7006, newarray:\ub113\uc87f\ubb2b\u4e72\u3e75\ub70c[](\u4492\u8aa5\ud171\uc3e3\u4c2b.\u4c04\ua068\u3d64\ua6bd\u8389.\u960f\ubefe\ud4fe\u7c6b\u5db4.\u6fb0\u12cb\u5db4\uc7fe\u0800.\ub19c\u416d\uc84e\u8389\u12cb.\ub113\uc87f\ubb2b\u4e72\u3e75\ub70c.class, ldc:int(8)))
            putfield:\u7049\u4ab3\u4c04\u8bb0\uc3e3\u3d4b(\u9937\u7d52\u3e75\u98a4\u8aa5\u7006::\uae87\u88c5\u69d9\u3c25\uf995\u6b0d, this:\u9937\u7d52\u3e75\u98a4\u8aa5\u7006, initobject:\u7049\u4ab3\u4c04\u8bb0\uc3e3\u3d4b(\u7049\u4ab3\u4c04\u8bb0\uc3e3\u3d4b::<init>, ldc:double(0.0), ldc:double(0.0), ldc:double(0.0)))
            putfield:boolean(\u9937\u7d52\u3e75\u98a4\u8aa5\u7006::\uceb8\u88c5\u51b2\u6fb0\uf995\u7c6b, this:\u9937\u7d52\u3e75\u98a4\u8aa5\u7006, ldc:boolean(1))
            putfield:float[](\u9937\u7d52\u3e75\u98a4\u8aa5\u7006::\uc9f6\u59ec\ud523\u67d0\ud523\uae87, this:\u9937\u7d52\u3e75\u98a4\u8aa5\u7006, newarray:float[](float.class, ldc:int(1024)))
            putfield:float[](\u9937\u7d52\u3e75\u98a4\u8aa5\u7006::\ub83f\ub102\uc2e8\u624e\ud7e8\u839e, this:\u9937\u7d52\u3e75\u98a4\u8aa5\u7006, newarray:float[](float.class, ldc:int(1024)))
            putfield:Set(\u9937\u7d52\u3e75\u98a4\u8aa5\u7006::\u7e3f\u59ec\u927d\uc229\u4f4a\u8d98, this:\u9937\u7d52\u3e75\u98a4\u8aa5\u7006, initobject:LinkedHashSet[expected:Set](LinkedHashSet::<init>))
            putfield:Set(\u9937\u7d52\u3e75\u98a4\u8aa5\u7006::\u946b\u647c\u4f52\u839e\u40a9\u59ec, this:\u9937\u7d52\u3e75\u98a4\u8aa5\u7006, initobject:LinkedHashSet[expected:Set](LinkedHashSet::<init>))
            putfield:Set<\u4ab3\ub1b9\u2dcc\ub8be\ube23\uc910>(\u9937\u7d52\u3e75\u98a4\u8aa5\u7006::\u6cfe\u6c52\uafe7\u3c25\uc910\u4e72, this:\u9937\u7d52\u3e75\u98a4\u8aa5\u7006, initobject:ObjectLinkedOpenHashSet[expected:Set<\u4ab3\ub1b9\u2dcc\ub8be\ube23\uc910>](ObjectLinkedOpenHashSet::<init>))
            putfield:Deque(\u9937\u7d52\u3e75\u98a4\u8aa5\u7006::\u3a62\u7e3f\u16f6\u4975\u4ab3\u6fb0, this:\u9937\u7d52\u3e75\u98a4\u8aa5\u7006, initobject:ArrayDeque[expected:Deque](ArrayDeque::<init>))
            putfield:List<\u61a4\u7873\u12b2\u760c\u67e9\u4492>(\u9937\u7d52\u3e75\u98a4\u8aa5\u7006::\u34df\uc84e\uc229\u47c2\u6c52\u97e6, this:\u9937\u7d52\u3e75\u98a4\u8aa5\u7006, initobject:ArrayList<\u61a4\u7873\u12b2\u760c\u67e9\u4492>[expected:List<\u61a4\u7873\u12b2\u760c\u67e9\u4492>](ArrayList<E>::<init>, ldc:int(1024)))
            putfield:List<\u61a4\u7873\u12b2\u760c\u67e9\u4492>(\u9937\u7d52\u3e75\u98a4\u8aa5\u7006::\uc29a\u4ab3\u0c95\u6d69\u3d4b\u3504, this:\u9937\u7d52\u3e75\u98a4\u8aa5\u7006, initobject:ArrayList<\u61a4\u7873\u12b2\u760c\u67e9\u4492>[expected:List<\u61a4\u7873\u12b2\u760c\u67e9\u4492>](ArrayList<E>::<init>, ldc:int(1024)))
            putfield:ObjectList(\u9937\u7d52\u3e75\u98a4\u8aa5\u7006::\uc31c\u600f\u2dcc\u64ab\u7e3f\uc229, this:\u9937\u7d52\u3e75\u98a4\u8aa5\u7006, initobject:ObjectArrayList[expected:ObjectList](ObjectArrayList::<init>, ldc:int(1024)))
            putfield:List(\u9937\u7d52\u3e75\u98a4\u8aa5\u7006::\u0b8e\u836c\u12b2\u624e\ub70c\u8258, this:\u9937\u7d52\u3e75\u98a4\u8aa5\u7006, initobject:ArrayList[expected:List](ArrayList::<init>, ldc:int(1024)))
            putfield:List(\u9937\u7d52\u3e75\u98a4\u8aa5\u7006::\u47c2\u3711\u1187\u34df\uf94d\u9937, this:\u9937\u7d52\u3e75\u98a4\u8aa5\u7006, initobject:ArrayList[expected:List](ArrayList::<init>, ldc:int(1024)))
            putfield:ObjectList(\u9937\u7d52\u3e75\u98a4\u8aa5\u7006::\ub19c\u99f7\ud4fe\u120d\u8aa5\uc229, this:\u9937\u7d52\u3e75\u98a4\u8aa5\u7006, initobject:ObjectArrayList[expected:ObjectList](ObjectArrayList::<init>, ldc:int(1024)))
            putfield:List(\u9937\u7d52\u3e75\u98a4\u8aa5\u7006::\u51b2\u64ab\u9af2\u3a62\u64f2\ucb79, this:\u9937\u7d52\u3e75\u98a4\u8aa5\u7006, initobject:ArrayList[expected:List](ArrayList::<init>, ldc:int(1024)))
            putfield:List(\u9937\u7d52\u3e75\u98a4\u8aa5\u7006::\u0c95\ub102\u8cae\u6c56\u836c\ub102, this:\u9937\u7d52\u3e75\u98a4\u8aa5\u7006, initobject:ArrayList[expected:List](ArrayList::<init>, ldc:int(1024)))
            putfield:int(\u9937\u7d52\u3e75\u98a4\u8aa5\u7006::\u8bb0\ub19c\u8350\uc2bd\u69d9\u7043, this:\u9937\u7d52\u3e75\u98a4\u8aa5\u7006, ldc:int(0))
            putfield:int(\u9937\u7d52\u3e75\u98a4\u8aa5\u7006::\u4daf\u3d4b\u3bc9\u7d52\ufe34\ucef1, this:\u9937\u7d52\u3e75\u98a4\u8aa5\u7006, ldc:int(0))
            putfield:int(\u9937\u7d52\u3e75\u98a4\u8aa5\u7006::\u4d85\u72f1\u64f2\u7e3f\u7330\u8c8a, this:\u9937\u7d52\u3e75\u98a4\u8aa5\u7006, ldc:int(0))
            putfield:\u47c2\u74b1\u647c\u446c\u4d85\ub32d(\u9937\u7d52\u3e75\u98a4\u8aa5\u7006::\u839e\u9a18\u4492\ubff1\uf94d\u69d9, this:\u9937\u7d52\u3e75\u98a4\u8aa5\u7006, initobject:\u47c2\u74b1\u647c\u446c\u4d85\ub32d(\u47c2\u74b1\u647c\u446c\u4d85\ub32d::<init>, invokevirtual:\u8413\u7e3f\uc910\uf94d\u5654\u6b0d(\ub1b9\u8cae\u7d52\u759a\u3e2a\u527a::\u8350\u8bb0\u839e\ub113\u7bad\u56bd, getstatic:\ub1b9\u8cae\u7d52\u759a\u3e2a\u527a(\u960f\u7043\uf9c5\u4f52\u4cd9\ubefe::\u8d98\u392e\u7006\ud171\u7bad\ua6bd)), initobject:\u6b0d\ud171\uc7fe\u52d3\uafe7\u6c56(\u6b0d\ud171\uc7fe\u52d3\uafe7\u6c56::<init>, ldc:int(0), ldc:int(0), ldc:int(0))))
            putfield:boolean(\u9937\u7d52\u3e75\u98a4\u8aa5\u7006::\u647c\u624e\uc229\uf9c5\ufcaf\u3dd3, this:\u9937\u7d52\u3e75\u98a4\u8aa5\u7006, ldc:boolean(0))
            putfield:boolean(\u9937\u7d52\u3e75\u98a4\u8aa5\u7006::\u6435\u392e\u6bb9\u9937\u0b8e\u416d, this:\u9937\u7d52\u3e75\u98a4\u8aa5\u7006, ldc:boolean(0))
            putfield:boolean(\u9937\u7d52\u3e75\u98a4\u8aa5\u7006::\ub171\u385b\u8258\u16f6\u836c\u7ce1, this:\u9937\u7d52\u3e75\u98a4\u8aa5\u7006, ldc:boolean(0))
            putfield:int(\u9937\u7d52\u3e75\u98a4\u8aa5\u7006::\ub83f\u40a9\u5245\u67e9\u071d\u92ff, this:\u9937\u7d52\u3e75\u98a4\u8aa5\u7006, ldc:int(-1))
            putfield:Map<String, List<\u7d52\u718f\u3776\u6fb0\ub83f>>(\u9937\u7d52\u3e75\u98a4\u8aa5\u7006::\u8308\ub19c\u983f\u8c8a\u8aa5\uc2bd, this:\u9937\u7d52\u3e75\u98a4\u8aa5\u7006, initobject:HashMap<String, List<\u7d52\u718f\u3776\u6fb0\ub83f>>[expected:Map<String, List<\u7d52\u718f\u3776\u6fb0\ub83f>>](HashMap<K, V>::<init>))
            putfield:Map<\uf995\u4975\u1187\ubff1\u839e\u8389, Map>(\u9937\u7d52\u3e75\u98a4\u8aa5\u7006::\u8df4\u494c\ud7e8\ud217\ud158\u3e75, this:\u9937\u7d52\u3e75\u98a4\u8aa5\u7006, initobject:LinkedHashMap<\uf995\u4975\u1187\ubff1\u839e\u8389, Map>[expected:Map<\uf995\u4975\u1187\ubff1\u839e\u8389, Map>](LinkedHashMap<K, V>::<init>))
            putfield:\u67e9\u4daf\u760c\ud217\ua6bd\ubff1(\u9937\u7d52\u3e75\u98a4\u8aa5\u7006::\u8df4\u3776\ud171\u7006\u51b2\uf995, this:\u9937\u7d52\u3e75\u98a4\u8aa5\u7006, p0:\u67e9\u4daf\u760c\ud217\ua6bd\ubff1)
            putfield:\u965f\u718f\u7c6b\u4cd9\u4daf\uc246(\u9937\u7d52\u3e75\u98a4\u8aa5\u7006::\u7ce1\ufe34\ua61f\u6198\u718f\u4cd9, this:\u9937\u7d52\u3e75\u98a4\u8aa5\u7006, invokevirtual:\u965f\u718f\u7c6b\u4cd9\u4daf\uc246(\u67e9\u4daf\u760c\ud217\ua6bd\ubff1::\ub18d\u67d0\u6d69\u6c56\u3dd3\u98a4, p0:\u67e9\u4daf\u760c\ud217\ua6bd\ubff1))
            putfield:\uafe7\uc2e8\u8389\ufcaf\ub19c\u51b2(\u9937\u7d52\u3e75\u98a4\u8aa5\u7006::\u3776\u8308\u12b2\uf9c5\ucfaf\ua3b4, this:\u9937\u7d52\u3e75\u98a4\u8aa5\u7006, p1:\uafe7\uc2e8\u8389\ufcaf\ub19c\u51b2)
            putfield:\u4f52\ub7dc\u7bad\ud217\u76bc\u6d99(\u9937\u7d52\u3e75\u98a4\u8aa5\u7006::\u12b2\u7d52\u6435\uc2e8\u69d9\u5654, this:\u9937\u7d52\u3e75\u98a4\u8aa5\u7006, invokevirtual:\u4f52\ub7dc\u7bad\ud217\u76bc\u6d99(\u67e9\u4daf\u760c\ud217\ua6bd\ubff1::\uf94d\u6d69\u4492\u6c56\u98a4\u3d64, p0:\u67e9\u4daf\u760c\ud217\ua6bd\ubff1))
            var_3_25F = ldc:int(0)
            
            while (cmplt:boolean(var_3_25F:int, ldc:int(32))) {
                var_4_267 = ldc:int(0)
                
                while (cmplt:boolean(var_4_267:int, ldc:int(32))) {
                    var_5_276 = i2f:float(sub:int(var_4_267:int, ldc:int(16)))
                    var_6_27D = i2f:float(sub:int(var_3_25F:int, ldc:int(16)))
                    var_7_28D = invokestatic:float(\u927d\uc7fe\u92ff\u98a4\uc84e\uf9c5::\u7d52\u8258\u61a4\u7049\uc3e3\u4c2b, add:float(mul:float(var_5_276:float, var_5_276:float), mul:float(var_6_27D:float, var_6_27D:float)))
                    storeelement:float(getfield:float[](\u9937\u7d52\u3e75\u98a4\u8aa5\u7006::\uc9f6\u59ec\ud523\u67d0\ud523\uae87, this:\u9937\u7d52\u3e75\u98a4\u8aa5\u7006), or:int(shl:int(var_3_25F:int, ldc:int(5)), var_4_267:int), div:float(neg:float(var_6_27D:float), var_7_28D:float))
                    storeelement:float(getfield:float[](\u9937\u7d52\u3e75\u98a4\u8aa5\u7006::\ub83f\ub102\uc2e8\u624e\ud7e8\u839e, this:\u9937\u7d52\u3e75\u98a4\u8aa5\u7006), or:int(shl:int(var_3_25F:int, ldc:int(5)), var_4_267:int), div:float(var_5_276:float, var_7_28D:float))
                    inc:int(var_4_267, ldc:int(1))
                }
                
                inc:int(var_3_25F, ldc:int(1))
            }
            
            invokespecial:void(\u9937\u7d52\u3e75\u98a4\u8aa5\u7006::\ud523\ubff1\ubff1\ub8be\u120d\u927d, this:\u9937\u7d52\u3e75\u98a4\u8aa5\u7006)
            invokespecial:void(\u9937\u7d52\u3e75\u98a4\u8aa5\u7006::\u8d98\ucb79\ubf56\u92ff\ub7dc\u8389, this:\u9937\u7d52\u3e75\u98a4\u8aa5\u7006)
            invokespecial:void(\u9937\u7d52\u3e75\u98a4\u8aa5\u7006::\ube23\u5db4\uafe7\uc910\u4d85\u7049, this:\u9937\u7d52\u3e75\u98a4\u8aa5\u7006)
            return:void()
        }
        
        goto(Label_0006)
    }
    
    private void \u9255\ud12e\u3e75\u5140\u385b\u4daf(\u4492\u8aa5\ud171\uc3e3\u4c2b.\u4c04\ua068\u3d64\ua6bd\u8389.\u960f\ubefe\ud4fe\u7c6b\u5db4.\u6fb0\u12cb\u5db4\uc7fe\u0800.\u98a4\u6198\u16f6\u6ec6\u6c52\u3bd6 p0, float p1, double p2, double p3, double p4) {
        var_9_75 : \u56bd\u0a06\u8cae\u446c\u6fb0\ubb2b
        var_9_A2 : float
        var_10_BD : \u16f6\u61a4\u5db4\u4c04\u64ab\u9255
        var_11_C3 : int
        var_12_CA : int
        var_13_D1 : int
        var_14_D6 : \ub6ab\u8cae\u64ab\u5245\ubff1\u3711
        var_15_DD : \u760c\u7ce1\u9a18\ub32d\u6d99\ub6ab
        var_16_F8 : int
        var_17_10B : int
        var_18_114 : float
        var_19_124 : \u4492\u3e2a\u8df4\u7e3f\ud36e\u3e2a
        var_20_12B : int
        var_21_13C : int
        var_22_15C : int
        var_23_16A : double
        var_25_178 : double
        var_27_18C : \uc2e8\u9255\u647c\ud171\ubf56
        var_28_1A6 : int
        var_29_1AD : int
        var_30_1B4 : int
        var_31_1CE : int
        var_32_20B : Random
        var_35_293 : float
        var_36_29F : double
        var_38_2AC : double
        var_40_2C0 : float
        var_41_2D4 : float
        var_42_2E9 : int
        var_34_450 : float
        var_35_468 : float
        var_36_47F : float
        var_37_48B : double
        var_39_498 : double
        var_41_4AC : float
        var_42_4C0 : float
        var_43_4D5 : int
        var_44_4E0 : int
        var_45_4EA : int
        var_46_4F6 : int
        var_47_502 : int
        
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
            
            if (invokevirtual:boolean(\u71ae\u5fe1\u0b8e\u5140\uf995\u927d::\uc87f\u7af6\u7043\ub19c\uc84e\u4c04, getstatic:\u71ae\u5fe1\u0b8e\u5140\uf995\u927d(\u6c52\u873d\uc84e\u7ce1\u4daf\u8308::\u873d\u6c52\ubff1\u836c\u8350\u120d))) {
                var_9_75 = checkcast:\u56bd\u0a06\u8cae\u446c\u6fb0\ubb2b(\u5245\u8aa5\u61a4\u7049\u4cd9.\u56bd\u0a06\u8cae\u446c\u6fb0\ubb2b.class, invokestatic:Object[expected:\u56bd\u0a06\u8cae\u446c\u6fb0\ubb2b](\u6c52\u873d\uc84e\u7ce1\u4daf\u8308::\u7af6\u97e6\u51fa\u8df4\ub6ab\ud523, invokevirtual:\ua61f\u183a\u6c52\uf9c5\u4cd9\u4d85[expected:Object](\u16f6\u61a4\u5db4\u4c04\u64ab\u9255::\u7873\u67e9\u3e75\ub6ab\u7873\u7873, getfield:\u16f6\u61a4\u5db4\u4c04\u64ab\u9255(\u9937\u7d52\u3e75\u98a4\u8aa5\u7006::\ud51e\u9033\u8df4\u7043\u5f50\u8aa5, this:\u9937\u7d52\u3e75\u98a4\u8aa5\u7006)), getstatic:\u71ae\u5fe1\u0b8e\u5140\uf995\u927d(\u6c52\u873d\uc84e\u7ce1\u4daf\u8308::\u873d\u6c52\ubff1\u836c\u8350\u120d), newarray:Object[](java.lang.Object.class, ldc:int(0))))
                
                if (cmpne:boolean(var_9_75:\u56bd\u0a06\u8cae\u446c\u6fb0\ubb2b, aconstnull:\u56bd\u0a06\u8cae\u446c\u6fb0\ubb2b())) {
                    invokeinterface:void(\u56bd\u0a06\u8cae\u446c\u6fb0\ubb2b::\u624e\u3e2a\ua068\ub32d\ud12e\uc238, var_9_75:\u56bd\u0a06\u8cae\u446c\u6fb0\ubb2b, getfield:int(\u9937\u7d52\u3e75\u98a4\u8aa5\u7006::\u3a62\ubcb0\u873d\u7873\u47c2\u8aa5, this:\u9937\u7d52\u3e75\u98a4\u8aa5\u7006), p1:float, getfield:\u16f6\u61a4\u5db4\u4c04\u64ab\u9255(\u9937\u7d52\u3e75\u98a4\u8aa5\u7006::\ud51e\u9033\u8df4\u7043\u5f50\u8aa5, this:\u9937\u7d52\u3e75\u98a4\u8aa5\u7006), getfield:\u67e9\u4daf\u760c\ud217\ua6bd\ubff1(\u9937\u7d52\u3e75\u98a4\u8aa5\u7006::\u8df4\u3776\ud171\u7006\u51b2\uf995, this:\u9937\u7d52\u3e75\u98a4\u8aa5\u7006), p0:\u98a4\u6198\u16f6\u6ec6\u6c52\u3bd6, p2:double, p3:double, p4:double)
                    return:void()
                }
            }
            
            var_9_A2 = invokevirtual:float(\uf9c5\ud158\u4975\uf94d\ud523\uc31c::\ub32d\u8413\u600f\ucfaf\u61a4\ua3b4, getfield:\u16f6\u61a4\u5db4\u4c04\u64ab\u9255[expected:\uf9c5\ud158\u4975\uf94d\ud523\uc31c](\u67e9\u4daf\u760c\ud217\ua6bd\ubff1::\u946b\u98a4\u8709\u7043\ubf56\u5f50, getfield:\u67e9\u4daf\u760c\ud217\ua6bd\ubff1(\u9937\u7d52\u3e75\u98a4\u8aa5\u7006::\u8df4\u3776\ud171\u7006\u51b2\uf995, this:\u9937\u7d52\u3e75\u98a4\u8aa5\u7006)), p1:float)
            
            if (cmpgt:boolean(var_9_A2:float, ldc:float(0.0f))) {
                if (invokestatic:boolean(\u8308\u51fa\u6c56\u5db4\ub18d\u34df::\u8d90\u92ff\u36d3\ub83f\ub8be\u3711)) {
                    return:void()
                }
                
                invokevirtual:void(\u98a4\u6198\u16f6\u6ec6\u6c52\u3bd6::\u5245\u071d\u8640\u3dd3\u8cae\u6b5f, p0:\u98a4\u6198\u16f6\u6ec6\u6c52\u3bd6)
                var_10_BD = getfield:\u16f6\u61a4\u5db4\u4c04\u64ab\u9255(\u67e9\u4daf\u760c\ud217\ua6bd\ubff1::\u946b\u98a4\u8709\u7043\ubf56\u5f50, getfield:\u67e9\u4daf\u760c\ud217\ua6bd\ubff1(\u9937\u7d52\u3e75\u98a4\u8aa5\u7006::\u8df4\u3776\ud171\u7006\u51b2\uf995, this:\u9937\u7d52\u3e75\u98a4\u8aa5\u7006))
                var_11_C3 = invokestatic:int(\u927d\uc7fe\u92ff\u98a4\uc84e\uf9c5::\ub19c\u0a06\ub32d\u3d64\u67d0\u839e, p2:double)
                var_12_CA = invokestatic:int(\u927d\uc7fe\u92ff\u98a4\uc84e\uf9c5::\ub19c\u0a06\ub32d\u3d64\u67d0\u839e, p3:double)
                var_13_D1 = invokestatic:int(\u927d\uc7fe\u92ff\u98a4\uc84e\uf9c5::\ub19c\u0a06\ub32d\u3d64\u67d0\u839e, p4:double)
                var_14_D6 = invokestatic:\ub6ab\u8cae\u64ab\u5245\ubff1\u3711(\ub6ab\u8cae\u64ab\u5245\ubff1\u3711::\u3504\ud523\u99f7\u5140\u5d20\u983f)
                var_15_DD = invokevirtual:\u760c\u7ce1\u9a18\ub32d\u6d99\ub6ab(\ub6ab\u8cae\u64ab\u5245\ubff1\u3711::\u74b1\u7bad\u6435\uc87f\u6d69\uc238, var_14_D6:\ub6ab\u8cae\u64ab\u5245\ubff1\u3711)
                invokestatic:void(\u9af2\u6ec6\u983f\ua068\u8c8a::\u8413\u9033\u3bc9\uceb8\u1833\u97b7)
                invokestatic:void(\u9af2\u6ec6\u983f\ua068\u8c8a::\u836c\uc29a\uceb8\u3e75\ub32d\u4ab3)
                invokestatic:void(\u9af2\u6ec6\u983f\ua068\u8c8a::\u6fb0\u8709\u759a\u47c2\ud12e\ub8be, ldc:float(0.0f), ldc:float(1.0f), ldc:float(0.0f))
                invokestatic:void(\u9af2\u6ec6\u983f\ua068\u8c8a::\uc9f6\u7049\u92ee\ube23\u3c25\u6d99)
                invokestatic:void(\u9af2\u6ec6\u983f\ua068\u8c8a::\u3d4b\u74b1\u3711\u5bc4\uf9c5\ub32d)
                invokestatic:void(\u9af2\u6ec6\u983f\ua068\u8c8a::\u97e6\u946b\uc7fe\u0b8e\u5fe1\ub113)
                invokestatic:void(\u9af2\u6ec6\u983f\ua068\u8c8a::\u59ec\u4bc8\u9033\u494c\u8308\ud51e)
                var_16_F8 = ldc:int(5)
                
                if (invokestatic:boolean(\u8308\u51fa\u6c56\u5db4\ub18d\u34df::\uc9f6\u34df\ubb2b\u3e2a\u8c8a\u983f)) {
                    var_16_F8 = ldc:int(10)
                }
                
                invokestatic:void(\u9af2\u6ec6\u983f\ua068\u8c8a::\u6435\uff55\u8640\ub6ab\u527a\u4179, invokestatic:boolean(\u67e9\u4daf\u760c\ud217\ua6bd\ubff1::\u92ff\u183a\u93a2\uc3e3\u873d\u67e9))
                var_17_10B = ldc:int(-1)
                var_18_114 = add:float(i2f:float(getfield:int(\u9937\u7d52\u3e75\u98a4\u8aa5\u7006::\u3a62\ubcb0\u873d\u7873\u47c2\u8aa5, this:\u9937\u7d52\u3e75\u98a4\u8aa5\u7006)), p1:float)
                invokestatic:void(\u9af2\u6ec6\u983f\ua068\u8c8a::\u8d90\u92ff\uc84e\u3dd3\uf9c5\u8308, ldc:float(1.0f), ldc:float(1.0f), ldc:float(1.0f), ldc:float(1.0f))
                var_19_124 = initobject:\u4492\u3e2a\u8df4\u7e3f\ud36e\u3e2a(\u4492\u3e2a\u8df4\u7e3f\ud36e\u3e2a::<init>)
                var_20_12B = sub:int(var_13_D1:int, var_16_F8:int)
                
                while (cmple:boolean(var_20_12B:int, add:int(var_13_D1:int, var_16_F8:int))) {
                    var_21_13C = sub:int(var_11_C3:int, var_16_F8:int)
                    
                    while (cmple:boolean(var_21_13C:int, add:int(var_11_C3:int, var_16_F8:int))) {
                        var_22_15C = add:int(sub:int(add:int(mul:int(add:int(sub:int(var_20_12B:int, var_13_D1:int), ldc:int(16)), ldc:int(32)), var_21_13C:int), var_11_C3:int), ldc:int(16))
                        var_23_16A = mul:double(f2d:double(loadelement:float(getfield:float[](\u9937\u7d52\u3e75\u98a4\u8aa5\u7006::\uc9f6\u59ec\ud523\u67d0\ud523\uae87, this:\u9937\u7d52\u3e75\u98a4\u8aa5\u7006), var_22_15C:int)), ldc:double(0.5))
                        var_25_178 = mul:double(f2d:double(loadelement:float(getfield:float[](\u9937\u7d52\u3e75\u98a4\u8aa5\u7006::\ub83f\ub102\uc2e8\u624e\ud7e8\u839e, this:\u9937\u7d52\u3e75\u98a4\u8aa5\u7006), var_22_15C:int)), ldc:double(0.5))
                        invokevirtual:\u4492\u3e2a\u8df4\u7e3f\ud36e\u3e2a(\u4492\u3e2a\u8df4\u7e3f\ud36e\u3e2a::\ucb79\u3bc9\u494c\u6d99\uc2e8\uae87, var_19_124:\u4492\u3e2a\u8df4\u7e3f\ud36e\u3e2a, var_21_13C:int, ldc:int(0), var_20_12B:int)
                        var_27_18C = invokevirtual:\uc2e8\u9255\u647c\ud171\ubf56(\u97e6\uf995\ucef1\ubff1\u7049\u4f4a::\ub83f\uc9f6\u61a4\u8df4\uc2bd\u8709, var_10_BD:\u16f6\u61a4\u5db4\u4c04\u64ab\u9255[expected:\u97e6\uf995\ucef1\ubff1\u7049\u4f4a], var_19_124:\u4492\u3e2a\u8df4\u7e3f\ud36e\u3e2a[expected:\u6b0d\ud171\uc7fe\u52d3\uafe7\u6c56])
                        
                        if (cmpne:boolean(invokevirtual:\ud51e\u927d\u69d9\u8df4\u6cfe(\uc2e8\u9255\u647c\ud171\ubf56::\u99f7\ub113\ua562\u5db4\u760c\u3d4b, var_27_18C:\uc2e8\u9255\u647c\ud171\ubf56), getstatic:\ud51e\u927d\u69d9\u8df4\u6cfe(\ud51e\u927d\u69d9\u8df4\u6cfe::\uc9f6\u3d64\u72f1\ub8be\ub7dc\ubefe))) {
                            var_28_1A6 = invokevirtual:int(\u3a62\uc9f6\u3776\u4f52\ua068\u34df::\u9af2\u8350\u8350\u93a2\u494c\u624e, invokevirtual:\u6b0d\ud171\uc7fe\u52d3\uafe7\u6c56[expected:\u3a62\uc9f6\u3776\u4f52\ua068\u34df](\u7ce1\uc9f6\u61a4\u0a06\uff55::\uf995\uc7fe\u4daf\u71f1\u62da\ub102, var_10_BD:\u16f6\u61a4\u5db4\u4c04\u64ab\u9255[expected:\u7ce1\uc9f6\u61a4\u0a06\uff55], getstatic:\ub19c\u74b1\u7af6\u7e3f\ucfaf\u3bc9(\ub19c\u74b1\u7af6\u7e3f\ucfaf\u3bc9::\uceb8\ua3b4\u4975\u4179\uf94d\u6198), var_19_124:\u4492\u3e2a\u8df4\u7e3f\ud36e\u3e2a[expected:\u6b0d\ud171\uc7fe\u52d3\uafe7\u6c56]))
                            var_29_1AD = sub:int(var_12_CA:int, var_16_F8:int)
                            var_30_1B4 = add:int(var_12_CA:int, var_16_F8:int)
                            
                            if (cmplt:boolean(var_29_1AD:int, var_28_1A6:int)) {
                                var_29_1AD = var_28_1A6:int
                            }
                            
                            if (cmplt:boolean(var_30_1B4:int, var_28_1A6:int)) {
                                var_30_1B4 = var_28_1A6:int
                            }
                            
                            if (cmplt:boolean(var_31_1CE = var_28_1A6:int, var_12_CA:int)) {
                                var_31_1CE = var_12_CA:int
                            }
                            
                            if (cmpne:boolean(var_29_1AD:int, var_30_1B4:int)) {
                                var_32_20B = initobject:Random(Random::<init>, i2l:long(xor:int(add:int(mul:int(mul:int(var_21_13C:int, var_21_13C:int), ldc:int(3121)), mul:int(var_21_13C:int, ldc:int(45238971))), add:int(mul:int(mul:int(var_20_12B:int, var_20_12B:int), ldc:int(418711)), mul:int(var_20_12B:int, ldc:int(13761))))))
                                invokevirtual:\u4492\u3e2a\u8df4\u7e3f\ud36e\u3e2a(\u4492\u3e2a\u8df4\u7e3f\ud36e\u3e2a::\ucb79\u3bc9\u494c\u6d99\uc2e8\uae87, var_19_124:\u4492\u3e2a\u8df4\u7e3f\ud36e\u3e2a, var_21_13C:int, var_29_1AD:int, var_20_12B:int)
                                
                                if (cmpge:boolean(invokevirtual:float(\uc2e8\u9255\u647c\ud171\ubf56::\u183a\u64ab\u983f\ud171\u97b7\u99f7, var_27_18C:\uc2e8\u9255\u647c\ud171\ubf56, var_19_124:\u4492\u3e2a\u8df4\u7e3f\ud36e\u3e2a[expected:\u6b0d\ud171\uc7fe\u52d3\uafe7\u6c56]), ldc:float(0.15f))) {
                                    if (cmpne:boolean(var_17_10B:int, ldc:int(0))) {
                                        if (cmpge:boolean(var_17_10B:int, ldc:int(0))) {
                                            invokevirtual:void(\ub6ab\u8cae\u64ab\u5245\ubff1\u3711::\uc229\u12b2\u6cfe\u4492\u36d3\u5f50, var_14_D6:\ub6ab\u8cae\u64ab\u5245\ubff1\u3711)
                                        }
                                        
                                        var_17_10B = ldc:int(0)
                                        invokevirtual:void(\u4f52\ub7dc\u7bad\ud217\u76bc\u6d99::\u6ec6\u9a18\u92ff\u2dcc\ud12e\u7ce1, invokevirtual:\u4f52\ub7dc\u7bad\ud217\u76bc\u6d99(\u67e9\u4daf\u760c\ud217\ua6bd\ubff1::\uf94d\u6d69\u4492\u6c56\u98a4\u3d64, getfield:\u67e9\u4daf\u760c\ud217\ua6bd\ubff1(\u9937\u7d52\u3e75\u98a4\u8aa5\u7006::\u8df4\u3776\ud171\u7006\u51b2\uf995, this:\u9937\u7d52\u3e75\u98a4\u8aa5\u7006)), getstatic:\u4179\ubb2b\uc7fe\u51fa\uc910\u8753(\u9937\u7d52\u3e75\u98a4\u8aa5\u7006::\u16f6\ubefe\ub113\ub18d\u836c\u4e72))
                                        invokevirtual:void(\u760c\u7ce1\u9a18\ub32d\u6d99\ub6ab::\u12cb\u9937\uc246\u5fe1\ubefe\u494c, var_15_DD:\u760c\u7ce1\u9a18\ub32d\u6d99\ub6ab, ldc:int(7), getstatic:\u74b1\u6d69\ud4fe\u4179\u8c8a\u965f(\u6d69\u4c04\ub113\u92ff\u3e75\u12b2::\u8cae\u385b\ub70c\u647c\u0a06\u97e6))
                                    }
                                    
                                    var_35_293 = mul:float(div:float(neg:float(add:float(i2f:float(and:int(add:int(add:int(add:int(add:int(getfield:int(\u9937\u7d52\u3e75\u98a4\u8aa5\u7006::\u3a62\ubcb0\u873d\u7873\u47c2\u8aa5, this:\u9937\u7d52\u3e75\u98a4\u8aa5\u7006), mul:int(mul:int(var_21_13C:int, var_21_13C:int), ldc:int(3121))), mul:int(var_21_13C:int, ldc:int(45238971))), mul:int(mul:int(var_20_12B:int, var_20_12B:int), ldc:int(418711))), mul:int(var_20_12B:int, ldc:int(13761))), ldc:int(31))), p1:float)), ldc:float(32.0f)), add:float(ldc:float(3.0f), invokevirtual:float(Random::nextFloat, var_32_20B:Random)))
                                    var_36_29F = sub:double(f2d:double(add:float(i2f:float(var_21_13C:int), ldc:float(0.5f))), p2:double)
                                    var_38_2AC = sub:double(f2d:double(add:float(i2f:float(var_20_12B:int), ldc:float(0.5f))), p4:double)
                                    var_40_2C0 = div:float(invokestatic:float(\u927d\uc7fe\u92ff\u98a4\uc84e\uf9c5::\u7d52\u8258\u61a4\u7049\uc3e3\u4c2b, add:double(mul:double(var_36_29F:double, var_36_29F:double), mul:double(var_38_2AC:double, var_38_2AC:double))), i2f:float(var_16_F8:int))
                                    var_41_2D4 = mul:float(add:float(mul:float(sub:float(ldc:float(1.0f), mul:float(var_40_2C0:float, var_40_2C0:float)), ldc:float(0.5f)), ldc:float(0.5f)), var_9_A2:float)
                                    invokevirtual:\u4492\u3e2a\u8df4\u7e3f\ud36e\u3e2a(\u4492\u3e2a\u8df4\u7e3f\ud36e\u3e2a::\ucb79\u3bc9\u494c\u6d99\uc2e8\uae87, var_19_124:\u4492\u3e2a\u8df4\u7e3f\ud36e\u3e2a, var_21_13C:int, var_31_1CE:int, var_20_12B:int)
                                    var_42_2E9 = invokestatic:int(\u9937\u7d52\u3e75\u98a4\u8aa5\u7006::\ud158\u6fb0\u2dcc\u52d3\ubcb0\u7af6, var_10_BD:\u16f6\u61a4\u5db4\u4c04\u64ab\u9255[expected:\u8bb0\u759a\u3bc9\u527a\ube23\u5140], var_19_124:\u4492\u3e2a\u8df4\u7e3f\ud36e\u3e2a[expected:\u6b0d\ud171\uc7fe\u52d3\uafe7\u6c56])
                                    invokeinterface:void(\u6b0d\uf9c5\ucfaf\ud36e\ub102::\ua61f\u0a06\u3bc9\ufe34\uc9f6\u8258, invokeinterface:\u6b0d\uf9c5\ucfaf\ud36e\ub102(\u6b0d\uf9c5\ucfaf\ud36e\ub102::\u56bd\ube23\u99f7\ubf56\u64ab\ud12e, invokeinterface:\u6b0d\uf9c5\ucfaf\ud36e\ub102(\u6b0d\uf9c5\ucfaf\ud36e\ub102::\ub70c\u600f\u93a2\uc910\u9937\u946b, invokeinterface:\u6b0d\uf9c5\ucfaf\ud36e\ub102(\u6b0d\uf9c5\ucfaf\ud36e\ub102::\u946b\uf995\ufe34\u1833\ua61f\uc246, invokevirtual:\u6b0d\uf9c5\ucfaf\ud36e\ub102(\u6b0d\uf9c5\ucfaf\ud36e\ub102::\u8d90\u9255\u3bd6\u5d20\ub83f\u1187, var_15_DD:\u760c\u7ce1\u9a18\ub32d\u6d99\ub6ab[expected:\u6b0d\uf9c5\ucfaf\ud36e\ub102], add:double(sub:double(sub:double(i2d:double(var_21_13C:int), p2:double), var_23_16A:double), ldc:double(0.5)), sub:double(i2d:double(var_30_1B4:int), p3:double), add:double(sub:double(sub:double(i2d:double(var_20_12B:int), p4:double), var_25_178:double), ldc:double(0.5))), ldc:float(0.0f), add:float(mul:float(i2f:float(var_29_1AD:int), ldc:float(0.25f)), var_35_293:float)), ldc:float(1.0f), ldc:float(1.0f), ldc:float(1.0f), var_41_2D4:float), var_42_2E9:int))
                                    invokeinterface:void(\u6b0d\uf9c5\ucfaf\ud36e\ub102::\ua61f\u0a06\u3bc9\ufe34\uc9f6\u8258, invokeinterface:\u6b0d\uf9c5\ucfaf\ud36e\ub102(\u6b0d\uf9c5\ucfaf\ud36e\ub102::\u56bd\ube23\u99f7\ubf56\u64ab\ud12e, invokeinterface:\u6b0d\uf9c5\ucfaf\ud36e\ub102(\u6b0d\uf9c5\ucfaf\ud36e\ub102::\ub70c\u600f\u93a2\uc910\u9937\u946b, invokeinterface:\u6b0d\uf9c5\ucfaf\ud36e\ub102(\u6b0d\uf9c5\ucfaf\ud36e\ub102::\u946b\uf995\ufe34\u1833\ua61f\uc246, invokevirtual:\u6b0d\uf9c5\ucfaf\ud36e\ub102(\u6b0d\uf9c5\ucfaf\ud36e\ub102::\u8d90\u9255\u3bd6\u5d20\ub83f\u1187, var_15_DD:\u760c\u7ce1\u9a18\ub32d\u6d99\ub6ab[expected:\u6b0d\uf9c5\ucfaf\ud36e\ub102], add:double(add:double(sub:double(i2d:double(var_21_13C:int), p2:double), var_23_16A:double), ldc:double(0.5)), sub:double(i2d:double(var_30_1B4:int), p3:double), add:double(add:double(sub:double(i2d:double(var_20_12B:int), p4:double), var_25_178:double), ldc:double(0.5))), ldc:float(1.0f), add:float(mul:float(i2f:float(var_29_1AD:int), ldc:float(0.25f)), var_35_293:float)), ldc:float(1.0f), ldc:float(1.0f), ldc:float(1.0f), var_41_2D4:float), var_42_2E9:int))
                                    invokeinterface:void(\u6b0d\uf9c5\ucfaf\ud36e\ub102::\ua61f\u0a06\u3bc9\ufe34\uc9f6\u8258, invokeinterface:\u6b0d\uf9c5\ucfaf\ud36e\ub102(\u6b0d\uf9c5\ucfaf\ud36e\ub102::\u56bd\ube23\u99f7\ubf56\u64ab\ud12e, invokeinterface:\u6b0d\uf9c5\ucfaf\ud36e\ub102(\u6b0d\uf9c5\ucfaf\ud36e\ub102::\ub70c\u600f\u93a2\uc910\u9937\u946b, invokeinterface:\u6b0d\uf9c5\ucfaf\ud36e\ub102(\u6b0d\uf9c5\ucfaf\ud36e\ub102::\u946b\uf995\ufe34\u1833\ua61f\uc246, invokevirtual:\u6b0d\uf9c5\ucfaf\ud36e\ub102(\u6b0d\uf9c5\ucfaf\ud36e\ub102::\u8d90\u9255\u3bd6\u5d20\ub83f\u1187, var_15_DD:\u760c\u7ce1\u9a18\ub32d\u6d99\ub6ab[expected:\u6b0d\uf9c5\ucfaf\ud36e\ub102], add:double(add:double(sub:double(i2d:double(var_21_13C:int), p2:double), var_23_16A:double), ldc:double(0.5)), sub:double(i2d:double(var_29_1AD:int), p3:double), add:double(add:double(sub:double(i2d:double(var_20_12B:int), p4:double), var_25_178:double), ldc:double(0.5))), ldc:float(1.0f), add:float(mul:float(i2f:float(var_30_1B4:int), ldc:float(0.25f)), var_35_293:float)), ldc:float(1.0f), ldc:float(1.0f), ldc:float(1.0f), var_41_2D4:float), var_42_2E9:int))
                                    invokeinterface:void(\u6b0d\uf9c5\ucfaf\ud36e\ub102::\ua61f\u0a06\u3bc9\ufe34\uc9f6\u8258, invokeinterface:\u6b0d\uf9c5\ucfaf\ud36e\ub102(\u6b0d\uf9c5\ucfaf\ud36e\ub102::\u56bd\ube23\u99f7\ubf56\u64ab\ud12e, invokeinterface:\u6b0d\uf9c5\ucfaf\ud36e\ub102(\u6b0d\uf9c5\ucfaf\ud36e\ub102::\ub70c\u600f\u93a2\uc910\u9937\u946b, invokeinterface:\u6b0d\uf9c5\ucfaf\ud36e\ub102(\u6b0d\uf9c5\ucfaf\ud36e\ub102::\u946b\uf995\ufe34\u1833\ua61f\uc246, invokevirtual:\u6b0d\uf9c5\ucfaf\ud36e\ub102(\u6b0d\uf9c5\ucfaf\ud36e\ub102::\u8d90\u9255\u3bd6\u5d20\ub83f\u1187, var_15_DD:\u760c\u7ce1\u9a18\ub32d\u6d99\ub6ab[expected:\u6b0d\uf9c5\ucfaf\ud36e\ub102], add:double(sub:double(sub:double(i2d:double(var_21_13C:int), p2:double), var_23_16A:double), ldc:double(0.5)), sub:double(i2d:double(var_29_1AD:int), p3:double), add:double(sub:double(sub:double(i2d:double(var_20_12B:int), p4:double), var_25_178:double), ldc:double(0.5))), ldc:float(0.0f), add:float(mul:float(i2f:float(var_30_1B4:int), ldc:float(0.25f)), var_35_293:float)), ldc:float(1.0f), ldc:float(1.0f), ldc:float(1.0f), var_41_2D4:float), var_42_2E9:int))
                                }
                                else {
                                    if (cmpne:boolean(var_17_10B:int, ldc:int(1))) {
                                        if (cmpge:boolean(var_17_10B:int, ldc:int(0))) {
                                            invokevirtual:void(\ub6ab\u8cae\u64ab\u5245\ubff1\u3711::\uc229\u12b2\u6cfe\u4492\u36d3\u5f50, var_14_D6:\ub6ab\u8cae\u64ab\u5245\ubff1\u3711)
                                        }
                                        
                                        var_17_10B = ldc:int(1)
                                        invokevirtual:void(\u4f52\ub7dc\u7bad\ud217\u76bc\u6d99::\u6ec6\u9a18\u92ff\u2dcc\ud12e\u7ce1, invokevirtual:\u4f52\ub7dc\u7bad\ud217\u76bc\u6d99(\u67e9\u4daf\u760c\ud217\ua6bd\ubff1::\uf94d\u6d69\u4492\u6c56\u98a4\u3d64, getfield:\u67e9\u4daf\u760c\ud217\ua6bd\ubff1(\u9937\u7d52\u3e75\u98a4\u8aa5\u7006::\u8df4\u3776\ud171\u7006\u51b2\uf995, this:\u9937\u7d52\u3e75\u98a4\u8aa5\u7006)), getstatic:\u4179\ubb2b\uc7fe\u51fa\uc910\u8753(\u9937\u7d52\u3e75\u98a4\u8aa5\u7006::\ub70c\uff55\u156b\u7006\u8d98\uf94d))
                                        invokevirtual:void(\u760c\u7ce1\u9a18\ub32d\u6d99\ub6ab::\u12cb\u9937\uc246\u5fe1\ubefe\u494c, var_15_DD:\u760c\u7ce1\u9a18\ub32d\u6d99\ub6ab, ldc:int(7), getstatic:\u74b1\u6d69\ud4fe\u4179\u8c8a\u965f(\u6d69\u4c04\ub113\u92ff\u3e75\u12b2::\u8cae\u385b\ub70c\u647c\u0a06\u97e6))
                                    }
                                    
                                    var_34_450 = div:float(neg:float(add:float(i2f:float(and:int(getfield:int(\u9937\u7d52\u3e75\u98a4\u8aa5\u7006::\u3a62\ubcb0\u873d\u7873\u47c2\u8aa5, this:\u9937\u7d52\u3e75\u98a4\u8aa5\u7006), ldc:int(511))), p1:float)), ldc:float(512.0f))
                                    var_35_468 = d2f:float(add:double(invokevirtual:double(Random::nextDouble, var_32_20B:Random), mul:double(mul:double(f2d:double(var_18_114:float), ldc:double(0.01)), f2d:double(d2f:float(invokevirtual:double(Random::nextGaussian, var_32_20B:Random))))))
                                    var_36_47F = d2f:float(add:double(invokevirtual:double(Random::nextDouble, var_32_20B:Random), mul:double(f2d:double(mul:float(var_18_114:float, d2f:float(invokevirtual:double(Random::nextGaussian, var_32_20B:Random)))), ldc:double(0.001))))
                                    var_37_48B = sub:double(f2d:double(add:float(i2f:float(var_21_13C:int), ldc:float(0.5f))), p2:double)
                                    var_39_498 = sub:double(f2d:double(add:float(i2f:float(var_20_12B:int), ldc:float(0.5f))), p4:double)
                                    var_41_4AC = div:float(invokestatic:float(\u927d\uc7fe\u92ff\u98a4\uc84e\uf9c5::\u7d52\u8258\u61a4\u7049\uc3e3\u4c2b, add:double(mul:double(var_37_48B:double, var_37_48B:double), mul:double(var_39_498:double, var_39_498:double))), i2f:float(var_16_F8:int))
                                    var_42_4C0 = mul:float(add:float(mul:float(sub:float(ldc:float(1.0f), mul:float(var_41_4AC:float, var_41_4AC:float)), ldc:float(0.3f)), ldc:float(0.5f)), var_9_A2:float)
                                    invokevirtual:\u4492\u3e2a\u8df4\u7e3f\ud36e\u3e2a(\u4492\u3e2a\u8df4\u7e3f\ud36e\u3e2a::\ucb79\u3bc9\u494c\u6d99\uc2e8\uae87, var_19_124:\u4492\u3e2a\u8df4\u7e3f\ud36e\u3e2a, var_21_13C:int, var_31_1CE:int, var_20_12B:int)
                                    var_43_4D5 = invokestatic:int(\u9937\u7d52\u3e75\u98a4\u8aa5\u7006::\ud158\u6fb0\u2dcc\u52d3\ubcb0\u7af6, var_10_BD:\u16f6\u61a4\u5db4\u4c04\u64ab\u9255[expected:\u8bb0\u759a\u3bc9\u527a\ube23\u5140], var_19_124:\u4492\u3e2a\u8df4\u7e3f\ud36e\u3e2a[expected:\u6b0d\ud171\uc7fe\u52d3\uafe7\u6c56])
                                    var_44_4E0 = and:int(shr:int(var_43_4D5:int, ldc:int(16)), ldc:int(65535))
                                    var_45_4EA = mul:int(and:int(var_43_4D5:int, ldc:int(65535)), ldc:int(3))
                                    var_46_4F6 = div:int(add:int(mul:int(var_44_4E0:int, ldc:int(3)), ldc:int(240)), ldc:int(4))
                                    var_47_502 = div:int(add:int(mul:int(var_45_4EA:int, ldc:int(3)), ldc:int(240)), ldc:int(4))
                                    invokeinterface:void(\u6b0d\uf9c5\ucfaf\ud36e\ub102::\ua61f\u0a06\u3bc9\ufe34\uc9f6\u8258, invokeinterface:\u6b0d\uf9c5\ucfaf\ud36e\ub102(\u6b0d\uf9c5\ucfaf\ud36e\ub102::\u56bd\ube23\u99f7\ubf56\u64ab\ud12e, invokeinterface:\u6b0d\uf9c5\ucfaf\ud36e\ub102(\u6b0d\uf9c5\ucfaf\ud36e\ub102::\ub70c\u600f\u93a2\uc910\u9937\u946b, invokeinterface:\u6b0d\uf9c5\ucfaf\ud36e\ub102(\u6b0d\uf9c5\ucfaf\ud36e\ub102::\u946b\uf995\ufe34\u1833\ua61f\uc246, invokevirtual:\u6b0d\uf9c5\ucfaf\ud36e\ub102(\u6b0d\uf9c5\ucfaf\ud36e\ub102::\u8d90\u9255\u3bd6\u5d20\ub83f\u1187, var_15_DD:\u760c\u7ce1\u9a18\ub32d\u6d99\ub6ab[expected:\u6b0d\uf9c5\ucfaf\ud36e\ub102], add:double(sub:double(sub:double(i2d:double(var_21_13C:int), p2:double), var_23_16A:double), ldc:double(0.5)), sub:double(i2d:double(var_30_1B4:int), p3:double), add:double(sub:double(sub:double(i2d:double(var_20_12B:int), p4:double), var_25_178:double), ldc:double(0.5))), add:float(ldc:float(0.0f), var_35_468:float), add:float(add:float(mul:float(i2f:float(var_29_1AD:int), ldc:float(0.25f)), var_34_450:float), var_36_47F:float)), ldc:float(1.0f), ldc:float(1.0f), ldc:float(1.0f), var_42_4C0:float), var_47_502:int, var_46_4F6:int))
                                    invokeinterface:void(\u6b0d\uf9c5\ucfaf\ud36e\ub102::\ua61f\u0a06\u3bc9\ufe34\uc9f6\u8258, invokeinterface:\u6b0d\uf9c5\ucfaf\ud36e\ub102(\u6b0d\uf9c5\ucfaf\ud36e\ub102::\u56bd\ube23\u99f7\ubf56\u64ab\ud12e, invokeinterface:\u6b0d\uf9c5\ucfaf\ud36e\ub102(\u6b0d\uf9c5\ucfaf\ud36e\ub102::\ub70c\u600f\u93a2\uc910\u9937\u946b, invokeinterface:\u6b0d\uf9c5\ucfaf\ud36e\ub102(\u6b0d\uf9c5\ucfaf\ud36e\ub102::\u946b\uf995\ufe34\u1833\ua61f\uc246, invokevirtual:\u6b0d\uf9c5\ucfaf\ud36e\ub102(\u6b0d\uf9c5\ucfaf\ud36e\ub102::\u8d90\u9255\u3bd6\u5d20\ub83f\u1187, var_15_DD:\u760c\u7ce1\u9a18\ub32d\u6d99\ub6ab[expected:\u6b0d\uf9c5\ucfaf\ud36e\ub102], add:double(add:double(sub:double(i2d:double(var_21_13C:int), p2:double), var_23_16A:double), ldc:double(0.5)), sub:double(i2d:double(var_30_1B4:int), p3:double), add:double(add:double(sub:double(i2d:double(var_20_12B:int), p4:double), var_25_178:double), ldc:double(0.5))), add:float(ldc:float(1.0f), var_35_468:float), add:float(add:float(mul:float(i2f:float(var_29_1AD:int), ldc:float(0.25f)), var_34_450:float), var_36_47F:float)), ldc:float(1.0f), ldc:float(1.0f), ldc:float(1.0f), var_42_4C0:float), var_47_502:int, var_46_4F6:int))
                                    invokeinterface:void(\u6b0d\uf9c5\ucfaf\ud36e\ub102::\ua61f\u0a06\u3bc9\ufe34\uc9f6\u8258, invokeinterface:\u6b0d\uf9c5\ucfaf\ud36e\ub102(\u6b0d\uf9c5\ucfaf\ud36e\ub102::\u56bd\ube23\u99f7\ubf56\u64ab\ud12e, invokeinterface:\u6b0d\uf9c5\ucfaf\ud36e\ub102(\u6b0d\uf9c5\ucfaf\ud36e\ub102::\ub70c\u600f\u93a2\uc910\u9937\u946b, invokeinterface:\u6b0d\uf9c5\ucfaf\ud36e\ub102(\u6b0d\uf9c5\ucfaf\ud36e\ub102::\u946b\uf995\ufe34\u1833\ua61f\uc246, invokevirtual:\u6b0d\uf9c5\ucfaf\ud36e\ub102(\u6b0d\uf9c5\ucfaf\ud36e\ub102::\u8d90\u9255\u3bd6\u5d20\ub83f\u1187, var_15_DD:\u760c\u7ce1\u9a18\ub32d\u6d99\ub6ab[expected:\u6b0d\uf9c5\ucfaf\ud36e\ub102], add:double(add:double(sub:double(i2d:double(var_21_13C:int), p2:double), var_23_16A:double), ldc:double(0.5)), sub:double(i2d:double(var_29_1AD:int), p3:double), add:double(add:double(sub:double(i2d:double(var_20_12B:int), p4:double), var_25_178:double), ldc:double(0.5))), add:float(ldc:float(1.0f), var_35_468:float), add:float(add:float(mul:float(i2f:float(var_30_1B4:int), ldc:float(0.25f)), var_34_450:float), var_36_47F:float)), ldc:float(1.0f), ldc:float(1.0f), ldc:float(1.0f), var_42_4C0:float), var_47_502:int, var_46_4F6:int))
                                    invokeinterface:void(\u6b0d\uf9c5\ucfaf\ud36e\ub102::\ua61f\u0a06\u3bc9\ufe34\uc9f6\u8258, invokeinterface:\u6b0d\uf9c5\ucfaf\ud36e\ub102(\u6b0d\uf9c5\ucfaf\ud36e\ub102::\u56bd\ube23\u99f7\ubf56\u64ab\ud12e, invokeinterface:\u6b0d\uf9c5\ucfaf\ud36e\ub102(\u6b0d\uf9c5\ucfaf\ud36e\ub102::\ub70c\u600f\u93a2\uc910\u9937\u946b, invokeinterface:\u6b0d\uf9c5\ucfaf\ud36e\ub102(\u6b0d\uf9c5\ucfaf\ud36e\ub102::\u946b\uf995\ufe34\u1833\ua61f\uc246, invokevirtual:\u6b0d\uf9c5\ucfaf\ud36e\ub102(\u6b0d\uf9c5\ucfaf\ud36e\ub102::\u8d90\u9255\u3bd6\u5d20\ub83f\u1187, var_15_DD:\u760c\u7ce1\u9a18\ub32d\u6d99\ub6ab[expected:\u6b0d\uf9c5\ucfaf\ud36e\ub102], add:double(sub:double(sub:double(i2d:double(var_21_13C:int), p2:double), var_23_16A:double), ldc:double(0.5)), sub:double(i2d:double(var_29_1AD:int), p3:double), add:double(sub:double(sub:double(i2d:double(var_20_12B:int), p4:double), var_25_178:double), ldc:double(0.5))), add:float(ldc:float(0.0f), var_35_468:float), add:float(add:float(mul:float(i2f:float(var_30_1B4:int), ldc:float(0.25f)), var_34_450:float), var_36_47F:float)), ldc:float(1.0f), ldc:float(1.0f), ldc:float(1.0f), var_42_4C0:float), var_47_502:int, var_46_4F6:int))
                                }
                            }
                        }
                        
                        inc:int(var_21_13C, ldc:int(1))
                    }
                    
                    inc:int(var_20_12B, ldc:int(1))
                }
                
                if (cmpge:boolean(var_17_10B:int, ldc:int(0))) {
                    invokevirtual:void(\ub6ab\u8cae\u64ab\u5245\ubff1\u3711::\uc229\u12b2\u6cfe\u4492\u36d3\u5f50, var_14_D6:\ub6ab\u8cae\u64ab\u5245\ubff1\u3711)
                }
                
                invokestatic:void(\u9af2\u6ec6\u983f\ua068\u8c8a::\u5f50\uc29a\u3a62\uceb8\ud171\uc2e8)
                invokestatic:void(\u9af2\u6ec6\u983f\ua068\u8c8a::\u6b5f\ua3b4\ua61f\ub70c\u5140\u6bb9)
                invokestatic:void(\u9af2\u6ec6\u983f\ua068\u8c8a::\u97e6\u946b\uc7fe\u0b8e\u5fe1\ub113)
                invokestatic:void(\u9af2\u6ec6\u983f\ua068\u8c8a::\u624e\u156b\u6c56\uc910\ub70c\u40a9)
                invokevirtual:void(\u98a4\u6198\u16f6\u6ec6\u6c52\u3bd6::\uc29a\u8aa5\u7c6b\ucb79\u8350\ucfaf, p0:\u98a4\u6198\u16f6\u6ec6\u6c52\u3bd6)
            }
            
            return:void()
        }
        
        goto(Label_0006)
    }
    
    public void \uc9f6\u97b7\u839e\ub8be\u3bd6\u47c2(\u3504\ufe34\u600f\u6b0d\u69d9.\u836c\u8cae\ub18d\u836c\u8753\u59ec p0) {
        var_2_6F : float
        var_3_96 : Random
        var_4_9E : \u16f6\u61a4\u5db4\u4c04\u64ab\u9255
        var_5_AB : \u6b0d\ud171\uc7fe\u52d3\uafe7\u6c56
        var_6_AE : \u6b0d\ud171\uc7fe\u52d3\uafe7\u6c56
        var_7_CE : int
        var_8_D1 : int
        var_11_107 : \u6b0d\ud171\uc7fe\u52d3\uafe7\u6c56
        var_12_112 : \uc2e8\u9255\u647c\ud171\ubf56
        var_13_170 : double
        var_15_176 : double
        var_17_181 : \u8413\u7e3f\uc910\uf94d\u5654\u6b0d
        var_18_18C : \uf995\u8709\ua61f\ub32d\ubff1\u99f7
        
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
            var_2_6F = div:float(invokevirtual:float(\uf9c5\ud158\u4975\uf94d\ud523\uc31c::\ub32d\u8413\u600f\ucfaf\u61a4\ua3b4, getfield:\u16f6\u61a4\u5db4\u4c04\u64ab\u9255[expected:\uf9c5\ud158\u4975\uf94d\ud523\uc31c](\u67e9\u4daf\u760c\ud217\ua6bd\ubff1::\u946b\u98a4\u8709\u7043\ubf56\u5f50, getfield:\u67e9\u4daf\u760c\ud217\ua6bd\ubff1(\u9937\u7d52\u3e75\u98a4\u8aa5\u7006::\u8df4\u3776\ud171\u7006\u51b2\uf995, this:\u9937\u7d52\u3e75\u98a4\u8aa5\u7006)), ldc:float(1.0f)), ternaryop:float(invokestatic:boolean(\u67e9\u4daf\u760c\ud217\ua6bd\ubff1::\u3776\u494c\u4975\u0c95\u4d85\u960f), ldc:float(1.0f), ldc:float(2.0f)))
            
            if (logicalnot:boolean(invokestatic:boolean(\u8308\u51fa\u6c56\u5db4\ub18d\u34df::\uc9f6\u34df\ubb2b\u3e2a\u8c8a\u983f))) {
                var_2_6F = div:float(var_2_6F:float, ldc:float(2.0f))
            }
            
            if (logicaland:boolean(cmpgt:boolean(var_2_6F:float, ldc:float(0.0f)), invokestatic:boolean(\u8308\u51fa\u6c56\u5db4\ub18d\u34df::\u8753\ub1b9\u3711\u8258\u6ec6\u74b1))) {
                var_3_96 = initobject:Random(Random::<init>, mul:long(i2l:long(getfield:int(\u9937\u7d52\u3e75\u98a4\u8aa5\u7006::\u3a62\ubcb0\u873d\u7873\u47c2\u8aa5, this:\u9937\u7d52\u3e75\u98a4\u8aa5\u7006)), ldc:long(312987231L)))
                var_4_9E = getfield:\u16f6\u61a4\u5db4\u4c04\u64ab\u9255(\u67e9\u4daf\u760c\ud217\ua6bd\ubff1::\u946b\u98a4\u8709\u7043\ubf56\u5f50, getfield:\u67e9\u4daf\u760c\ud217\ua6bd\ubff1(\u9937\u7d52\u3e75\u98a4\u8aa5\u7006::\u8df4\u3776\ud171\u7006\u51b2\uf995, this:\u9937\u7d52\u3e75\u98a4\u8aa5\u7006))
                var_5_AB = initobject:\u6b0d\ud171\uc7fe\u52d3\uafe7\u6c56(\u6b0d\ud171\uc7fe\u52d3\uafe7\u6c56::<init>, invokevirtual:\u3a62\u5d20\u4f52\uc229\u8308\ud7e8(\u836c\u8cae\ub18d\u836c\u8753\u59ec::\u8308\ub171\u6b5f\u16f6\u4cd9\ua562, p0:\u836c\u8cae\ub18d\u836c\u8753\u59ec))
                var_6_AE = aconstnull:\u6b0d\ud171\uc7fe\u52d3\uafe7\u6c56()
                var_7_CE = div:int(f2i:int(mul:float(mul:float(ldc:float(100.0f), var_2_6F:float), var_2_6F:float)), ternaryop:int(cmpeq:boolean(getfield:\u4e72\uafe7\ua068\u71ae\ub19c\u8bb0(\u4daf\u8df4\ubb2b\u759a\u7330\u4ab3::\u4f52\u64f2\ud12e\ud158\ua6bd\ucb79, getfield:\u4daf\u8df4\ubb2b\u759a\u7330\u4ab3(\u67e9\u4daf\u760c\ud217\ua6bd\ubff1::\uc84e\u4c04\ubcb0\u0c95\ub8be\u5fe1, getfield:\u67e9\u4daf\u760c\ud217\ua6bd\ubff1(\u9937\u7d52\u3e75\u98a4\u8aa5\u7006::\u8df4\u3776\ud171\u7006\u51b2\uf995, this:\u9937\u7d52\u3e75\u98a4\u8aa5\u7006))), getstatic:\u4e72\uafe7\ua068\u71ae\ub19c\u8bb0(\u4e72\uafe7\ua068\u71ae\ub19c\u8bb0::\uc229\u4c04\u9255\u385b\u624e\u4975)), ldc:int(2), ldc:int(1)))
                var_8_D1 = ldc:int(0)
                
                while (cmplt:boolean(var_8_D1:int, var_7_CE:int)) {
                    var_11_107 = invokevirtual:\u6b0d\ud171\uc7fe\u52d3\uafe7\u6c56(\u6b0d\ud171\uc7fe\u52d3\uafe7\u6c56::\u5db4\u64f2\ub7dc\ud217\u56bd\u8c8a, invokeinterface:\u6b0d\ud171\uc7fe\u52d3\uafe7\u6c56(\u97e6\uf995\ucef1\ubff1\u7049\u4f4a::\uf995\uc7fe\u4daf\u71f1\u62da\ub102, var_4_9E:\u16f6\u61a4\u5db4\u4c04\u64ab\u9255[expected:\u97e6\uf995\ucef1\ubff1\u7049\u4f4a], getstatic:\ub19c\u74b1\u7af6\u7e3f\ucfaf\u3bc9(\ub19c\u74b1\u7af6\u7e3f\ucfaf\u3bc9::\uceb8\ua3b4\u4975\u4179\uf94d\u6198), invokevirtual:\u6b0d\ud171\uc7fe\u52d3\uafe7\u6c56(\u6b0d\ud171\uc7fe\u52d3\uafe7\u6c56::\uc84e\u5f50\u92ff\u92ff\u2dcc\u7330, var_5_AB:\u6b0d\ud171\uc7fe\u52d3\uafe7\u6c56, sub:int(invokevirtual:int(Random::nextInt, var_3_96:Random, ldc:int(21)), ldc:int(10)), ldc:int(0), sub:int(invokevirtual:int(Random::nextInt, var_3_96:Random, ldc:int(21)), ldc:int(10)))))
                    var_12_112 = invokeinterface:\uc2e8\u9255\u647c\ud171\ubf56(\u97e6\uf995\ucef1\ubff1\u7049\u4f4a::\ub83f\uc9f6\u61a4\u8df4\uc2bd\u8709, var_4_9E:\u16f6\u61a4\u5db4\u4c04\u64ab\u9255[expected:\u97e6\uf995\ucef1\ubff1\u7049\u4f4a], var_11_107:\u6b0d\ud171\uc7fe\u52d3\uafe7\u6c56)
                    
                    if (logicaland:boolean(logicaland:boolean(logicaland:boolean(logicaland:boolean(cmpgt:boolean(invokevirtual:int(\u3a62\uc9f6\u3776\u4f52\ua068\u34df::\u9af2\u8350\u8350\u93a2\u494c\u624e, var_11_107:\u6b0d\ud171\uc7fe\u52d3\uafe7\u6c56[expected:\u3a62\uc9f6\u3776\u4f52\ua068\u34df]), ldc:int(0)), cmple:boolean(invokevirtual:int(\u3a62\uc9f6\u3776\u4f52\ua068\u34df::\u9af2\u8350\u8350\u93a2\u494c\u624e, var_11_107:\u6b0d\ud171\uc7fe\u52d3\uafe7\u6c56[expected:\u3a62\uc9f6\u3776\u4f52\ua068\u34df]), add:int(invokevirtual:int(\u3a62\uc9f6\u3776\u4f52\ua068\u34df::\u9af2\u8350\u8350\u93a2\u494c\u624e, var_5_AB:\u6b0d\ud171\uc7fe\u52d3\uafe7\u6c56[expected:\u3a62\uc9f6\u3776\u4f52\ua068\u34df]), ldc:int(10)))), cmpge:boolean(invokevirtual:int(\u3a62\uc9f6\u3776\u4f52\ua068\u34df::\u9af2\u8350\u8350\u93a2\u494c\u624e, var_11_107:\u6b0d\ud171\uc7fe\u52d3\uafe7\u6c56[expected:\u3a62\uc9f6\u3776\u4f52\ua068\u34df]), sub:int(invokevirtual:int(\u3a62\uc9f6\u3776\u4f52\ua068\u34df::\u9af2\u8350\u8350\u93a2\u494c\u624e, var_5_AB:\u6b0d\ud171\uc7fe\u52d3\uafe7\u6c56[expected:\u3a62\uc9f6\u3776\u4f52\ua068\u34df]), ldc:int(10)))), cmpeq:boolean(invokevirtual:\ud51e\u927d\u69d9\u8df4\u6cfe(\uc2e8\u9255\u647c\ud171\ubf56::\u99f7\ub113\ua562\u5db4\u760c\u3d4b, var_12_112:\uc2e8\u9255\u647c\ud171\ubf56), getstatic:\ud51e\u927d\u69d9\u8df4\u6cfe(\ud51e\u927d\u69d9\u8df4\u6cfe::\uae5d\uc246\uc31c\ufe34\ubded\u4daf))), cmpge:boolean(invokevirtual:float(\uc2e8\u9255\u647c\ud171\ubf56::\u183a\u64ab\u983f\ud171\u97b7\u99f7, var_12_112:\uc2e8\u9255\u647c\ud171\ubf56, var_11_107:\u6b0d\ud171\uc7fe\u52d3\uafe7\u6c56), ldc:float(0.15f)))) {
                        var_6_AE = var_11_107:\u6b0d\ud171\uc7fe\u52d3\uafe7\u6c56
                        
                        if (cmpeq:boolean(getfield:\u4e72\uafe7\ua068\u71ae\ub19c\u8bb0(\u4daf\u8df4\ubb2b\u759a\u7330\u4ab3::\u4f52\u64f2\ud12e\ud158\ua6bd\ucb79, getfield:\u4daf\u8df4\ubb2b\u759a\u7330\u4ab3(\u67e9\u4daf\u760c\ud217\ua6bd\ubff1::\uc84e\u4c04\ubcb0\u0c95\ub8be\u5fe1, getfield:\u67e9\u4daf\u760c\ud217\ua6bd\ubff1(\u9937\u7d52\u3e75\u98a4\u8aa5\u7006::\u8df4\u3776\ud171\u7006\u51b2\uf995, this:\u9937\u7d52\u3e75\u98a4\u8aa5\u7006))), getstatic:\u4e72\uafe7\ua068\u71ae\ub19c\u8bb0(\u4e72\uafe7\ua068\u71ae\ub19c\u8bb0::\u6bb9\u4daf\u88c5\ub1b9\u92ff\u6bb9))) {
                            looporswitchbreak()
                        }
                        
                        var_13_170 = invokevirtual:double(Random::nextDouble, var_3_96:Random)
                        var_15_176 = invokevirtual:double(Random::nextDouble, var_3_96:Random)
                        var_17_181 = invokeinterface:\u8413\u7e3f\uc910\uf94d\u5654\u6b0d(\u718f\u6435\uc31c\u4ab3\u98a4::\uc238\uc31c\ua61f\u92ee\u51b2\u527a, var_4_9E:\u16f6\u61a4\u5db4\u4c04\u64ab\u9255[expected:\u718f\u6435\uc31c\u4ab3\u98a4], var_11_107:\u6b0d\ud171\uc7fe\u52d3\uafe7\u6c56)
                        var_18_18C = invokeinterface:\uf995\u8709\ua61f\ub32d\ubff1\u99f7(\u718f\u6435\uc31c\u4ab3\u98a4::\u9033\u3711\u494c\u88c5\u69d9\u97b7, var_4_9E:\u16f6\u61a4\u5db4\u4c04\u64ab\u9255[expected:\u718f\u6435\uc31c\u4ab3\u98a4], var_11_107:\u6b0d\ud171\uc7fe\u52d3\uafe7\u6c56)
                        invokevirtual:void(\u16f6\u61a4\u5db4\u4c04\u64ab\u9255::\u385b\u8c8a\uf9c5\u6ec6\ufcaf\u5fe1, getfield:\u16f6\u61a4\u5db4\u4c04\u64ab\u9255(\u67e9\u4daf\u760c\ud217\ua6bd\ubff1::\u946b\u98a4\u8709\u7043\ubf56\u5f50, getfield:\u67e9\u4daf\u760c\ud217\ua6bd\ubff1(\u9937\u7d52\u3e75\u98a4\u8aa5\u7006::\u8df4\u3776\ud171\u7006\u51b2\uf995, this:\u9937\u7d52\u3e75\u98a4\u8aa5\u7006)), ternaryop:\uc910\u8d98\u8aa5\u3d4b\u6435\u5140(logicaland:boolean(logicaland:boolean(logicalnot:boolean(invokevirtual:boolean(\uf995\u8709\ua61f\ub32d\ubff1\u99f7::\ud36e\u8aa5\u5654\ub1b9\u7049\ub7dc, var_18_18C:\uf995\u8709\ua61f\ub32d\ubff1\u99f7, getstatic:\uc29a\u8350\u8bb0\u4cd9\u51fa\u839e<\u8cae\ucb79\ud7e8\ub8be\u156b\u960f>[expected:\u99f7\u8d90\u97b7\uf94d\u392e\u3dd3<\u8cae\ucb79\ud7e8\ub8be\u156b\u960f>](\u76bc\u5fe1\u5fe1\u36d3\u93a2\u3d64::\u5245\u92ee\uc3e3\u92ff\u3d64\uae5d))), logicalnot:boolean(invokevirtual:boolean(\u7043\u8c8a\u8c8a\u4f4a\ufcaf\u839e::\u8d90\u3e2a\ua61f\ua61f\ud51e\u0b8e, var_17_181:\u8413\u7e3f\uc910\uf94d\u5654\u6b0d[expected:\u7043\u8c8a\u8c8a\u4f4a\ufcaf\u839e], getstatic:\ub1b9\u8cae\u7d52\u759a\u3e2a\u527a(\u960f\u7043\uf9c5\u4f52\u4cd9\ubefe::\u6435\uc84e\ud4fe\ubb2b\u183a\u8aa5)))), logicalnot:boolean(invokestatic:boolean(\uc910\u8350\u8753\u6c56\u4e72\u8753::\u4bc8\u927d\u4bc8\u4c04\uafe7\ud51e, var_17_181:\u8413\u7e3f\uc910\uf94d\u5654\u6b0d))), getstatic:\uc910\u8d98\u8aa5\u3d4b\u6435\u5140(\u34df\u8d98\ua3b4\u873d\ud217\u4c2b::\u7e3f\u927d\uc7fe\u3bd6\ub32d\u51b2), getstatic:\uc910\u8d98\u8aa5\u3d4b\u6435\u5140(\u34df\u8d98\ua3b4\u873d\ud217\u4c2b::\u8640\u61a4\u5d20\u6c52\ubcb0\u6b5f)), add:double(i2d:double(invokevirtual:int(\u3a62\uc9f6\u3776\u4f52\ua068\u34df::\u8aa5\u97b7\u4daf\u72f1\u600f\u8cae, var_11_107:\u6b0d\ud171\uc7fe\u52d3\uafe7\u6c56[expected:\u3a62\uc9f6\u3776\u4f52\ua068\u34df])), var_13_170:double), add:double(i2d:double(invokevirtual:int(\u3a62\uc9f6\u3776\u4f52\ua068\u34df::\u9af2\u8350\u8350\u93a2\u494c\u624e, var_11_107:\u6b0d\ud171\uc7fe\u52d3\uafe7\u6c56[expected:\u3a62\uc9f6\u3776\u4f52\ua068\u34df])), invokestatic:double(Math::max, invokevirtual:double(\u6c52\ubded\u4975\u71ae\u47c2\u7d52::\u61a4\uc29a\u6ec6\u6d99\ub102\u52d3, invokevirtual:\u6c52\ubded\u4975\u71ae\u47c2\u7d52(\u7043\u8c8a\u8c8a\u4f4a\ufcaf\u839e::\uc87f\uf94d\ucb79\u120d\u836c\ubb2b, var_17_181:\u8413\u7e3f\uc910\uf94d\u5654\u6b0d[expected:\u7043\u8c8a\u8c8a\u4f4a\ufcaf\u839e], var_4_9E:\u16f6\u61a4\u5db4\u4c04\u64ab\u9255[expected:\u718f\u6435\uc31c\u4ab3\u98a4], var_11_107:\u6b0d\ud171\uc7fe\u52d3\uafe7\u6c56), getstatic:\u6c52\u156b\u4179\u5654\uceb8\u9af2(\u6c52\u156b\u4179\u5654\uceb8\u9af2::\u385b\ub83f\u47c2\u5245\u7c6b\uc31c), var_13_170:double, var_15_176:double), f2d:double(invokevirtual:float(\uf995\u8709\ua61f\ub32d\ubff1\u99f7::\u392e\u62da\u4daf\u98a4\uf94d\u4975, var_18_18C:\uf995\u8709\ua61f\ub32d\ubff1\u99f7, var_4_9E:\u16f6\u61a4\u5db4\u4c04\u64ab\u9255[expected:\u718f\u6435\uc31c\u4ab3\u98a4], var_11_107:\u6b0d\ud171\uc7fe\u52d3\uafe7\u6c56)))), add:double(i2d:double(invokevirtual:int(\u3a62\uc9f6\u3776\u4f52\ua068\u34df::\u3e75\uc29a\u071d\u4d85\ubded\ub70c, var_11_107:\u6b0d\ud171\uc7fe\u52d3\uafe7\u6c56[expected:\u3a62\uc9f6\u3776\u4f52\ua068\u34df])), var_15_176:double), ldc:double(0.0), ldc:double(0.0), ldc:double(0.0))
                    }
                    
                    inc:int(var_8_D1, ldc:int(1))
                }
                
                if (logicaland:boolean(cmpne:boolean(var_6_AE:\u6b0d\ud171\uc7fe\u52d3\uafe7\u6c56, aconstnull:\u6b0d\ud171\uc7fe\u52d3\uafe7\u6c56()), cmplt:boolean(invokevirtual:int(Random::nextInt, var_3_96:Random, ldc:int(3)), postincrement:int(1, getfield:int(\u9937\u7d52\u3e75\u98a4\u8aa5\u7006::\uae5d\uf9c5\u74b1\uc246\uc910\uc229, this:\u9937\u7d52\u3e75\u98a4\u8aa5\u7006))))) {
                    putfield:int(\u9937\u7d52\u3e75\u98a4\u8aa5\u7006::\uae5d\uf9c5\u74b1\uc246\uc910\uc229, this:\u9937\u7d52\u3e75\u98a4\u8aa5\u7006, ldc:int(0))
                    
                    if (logicaland:boolean(cmpgt:boolean(invokevirtual:int(\u3a62\uc9f6\u3776\u4f52\ua068\u34df::\u9af2\u8350\u8350\u93a2\u494c\u624e, var_6_AE:\u6b0d\ud171\uc7fe\u52d3\uafe7\u6c56[expected:\u3a62\uc9f6\u3776\u4f52\ua068\u34df]), add:int(invokevirtual:int(\u3a62\uc9f6\u3776\u4f52\ua068\u34df::\u9af2\u8350\u8350\u93a2\u494c\u624e, var_5_AB:\u6b0d\ud171\uc7fe\u52d3\uafe7\u6c56[expected:\u3a62\uc9f6\u3776\u4f52\ua068\u34df]), ldc:int(1))), cmpgt:boolean(invokevirtual:int(\u3a62\uc9f6\u3776\u4f52\ua068\u34df::\u9af2\u8350\u8350\u93a2\u494c\u624e, invokeinterface:\u6b0d\ud171\uc7fe\u52d3\uafe7\u6c56[expected:\u3a62\uc9f6\u3776\u4f52\ua068\u34df](\u97e6\uf995\ucef1\ubff1\u7049\u4f4a::\uf995\uc7fe\u4daf\u71f1\u62da\ub102, var_4_9E:\u16f6\u61a4\u5db4\u4c04\u64ab\u9255[expected:\u97e6\uf995\ucef1\ubff1\u7049\u4f4a], getstatic:\ub19c\u74b1\u7af6\u7e3f\ucfaf\u3bc9(\ub19c\u74b1\u7af6\u7e3f\ucfaf\u3bc9::\uceb8\ua3b4\u4975\u4179\uf94d\u6198), var_5_AB:\u6b0d\ud171\uc7fe\u52d3\uafe7\u6c56)), invokestatic:int(\u927d\uc7fe\u92ff\u98a4\uc84e\uf9c5::\ub19c\u0a06\ub32d\u3d64\u67d0\u839e, i2f:float(invokevirtual:int(\u3a62\uc9f6\u3776\u4f52\ua068\u34df::\u9af2\u8350\u8350\u93a2\u494c\u624e, var_5_AB:\u6b0d\ud171\uc7fe\u52d3\uafe7\u6c56[expected:\u3a62\uc9f6\u3776\u4f52\ua068\u34df])))))) {
                        invokevirtual:void(\u16f6\u61a4\u5db4\u4c04\u64ab\u9255::\u34df\u0c95\u8c8a\u3d64\ufcaf\ud36e, getfield:\u16f6\u61a4\u5db4\u4c04\u64ab\u9255(\u67e9\u4daf\u760c\ud217\ua6bd\ubff1::\u946b\u98a4\u8709\u7043\ubf56\u5f50, getfield:\u67e9\u4daf\u760c\ud217\ua6bd\ubff1(\u9937\u7d52\u3e75\u98a4\u8aa5\u7006::\u8df4\u3776\ud171\u7006\u51b2\uf995, this:\u9937\u7d52\u3e75\u98a4\u8aa5\u7006)), var_6_AE:\u6b0d\ud171\uc7fe\u52d3\uafe7\u6c56, getstatic:\u6b0d\u3d64\u446c\u6cfe\u5f50\u9937(\ua068\uf995\u3711\u4bc8\u8c8a\u0c95::\u5245\u3e2a\ub1b9\u7ce1\u69d9\u8258), getstatic:\u88c5\ub83f\uc246\u8c8a\u960f\ud7e8(\u88c5\ub83f\uc246\u8c8a\u960f\ud7e8::\u7d52\ub19c\u9033\u97e6\u1187\u12cb), ldc:float(0.1f), ldc:float(0.5f), ldc:boolean(0))
                    }
                    else {
                        invokevirtual:void(\u16f6\u61a4\u5db4\u4c04\u64ab\u9255::\u34df\u0c95\u8c8a\u3d64\ufcaf\ud36e, getfield:\u16f6\u61a4\u5db4\u4c04\u64ab\u9255(\u67e9\u4daf\u760c\ud217\ua6bd\ubff1::\u946b\u98a4\u8709\u7043\ubf56\u5f50, getfield:\u67e9\u4daf\u760c\ud217\ua6bd\ubff1(\u9937\u7d52\u3e75\u98a4\u8aa5\u7006::\u8df4\u3776\ud171\u7006\u51b2\uf995, this:\u9937\u7d52\u3e75\u98a4\u8aa5\u7006)), var_6_AE:\u6b0d\ud171\uc7fe\u52d3\uafe7\u6c56, getstatic:\u6b0d\u3d64\u446c\u6cfe\u5f50\u9937(\ua068\uf995\u3711\u4bc8\u8c8a\u0c95::\u120d\u4e72\u494c\u8d90\u9033\ud36e), getstatic:\u88c5\ub83f\uc246\u8c8a\u960f\ud7e8(\u88c5\ub83f\uc246\u8c8a\u960f\ud7e8::\u7d52\ub19c\u9033\u97e6\u1187\u12cb), ldc:float(0.2f), ldc:float(1.0f), ldc:boolean(0))
                    }
                }
            }
            
            return:void()
        }
        
        goto(Label_0006)
    }
    
    public void close() {
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
            
            if (cmpne:boolean(getfield:\u4ab3\uf995\u3e75\u8bb0\uc31c\u5654(\u9937\u7d52\u3e75\u98a4\u8aa5\u7006::\u927d\ub83f\u718f\ud51e\u1833\ub113, this:\u9937\u7d52\u3e75\u98a4\u8aa5\u7006), aconstnull:\u4ab3\uf995\u3e75\u8bb0\uc31c\u5654())) {
                invokevirtual:void(\u4ab3\uf995\u3e75\u8bb0\uc31c\u5654::close, getfield:\u4ab3\uf995\u3e75\u8bb0\uc31c\u5654(\u9937\u7d52\u3e75\u98a4\u8aa5\u7006::\u927d\ub83f\u718f\ud51e\u1833\ub113, this:\u9937\u7d52\u3e75\u98a4\u8aa5\u7006))
            }
            
            if (cmpne:boolean(getfield:\u4ab3\uf995\u3e75\u8bb0\uc31c\u5654(\u9937\u7d52\u3e75\u98a4\u8aa5\u7006::\u8350\u12b2\ua61f\u8389\u6c52\u5fe1, this:\u9937\u7d52\u3e75\u98a4\u8aa5\u7006), aconstnull:\u4ab3\uf995\u3e75\u8bb0\uc31c\u5654())) {
                invokevirtual:void(\u4ab3\uf995\u3e75\u8bb0\uc31c\u5654::close, getfield:\u4ab3\uf995\u3e75\u8bb0\uc31c\u5654(\u9937\u7d52\u3e75\u98a4\u8aa5\u7006::\u8350\u12b2\ua61f\u8389\u6c52\u5fe1, this:\u9937\u7d52\u3e75\u98a4\u8aa5\u7006))
            }
            
            return:void()
        }
        
        goto(Label_0006)
    }
    
    public void \u61a4\uc84e\u120d\u7e3f\u647c\ubff1(\u7c6b\u7c6b\ubefe\u385b\u3c25.\ud7e8\u0800\uae87\u8d90\u183a.\u34df\u12b2\u16f6\u873d\u7af6.\u6c52\u52d3\u516c\uae87\uae5d p0) {
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
            invokevirtual:void(\u4f52\ub7dc\u7bad\ud217\u76bc\u6d99::\u6ec6\u9a18\u92ff\u2dcc\ud12e\u7ce1, getfield:\u4f52\ub7dc\u7bad\ud217\u76bc\u6d99(\u9937\u7d52\u3e75\u98a4\u8aa5\u7006::\u12b2\u7d52\u6435\uc2e8\u69d9\u5654, this:\u9937\u7d52\u3e75\u98a4\u8aa5\u7006), getstatic:\u4179\ubb2b\uc7fe\u51fa\uc910\u8753(\u9937\u7d52\u3e75\u98a4\u8aa5\u7006::\u74b1\uc238\u718f\u7330\u4cd9\ud36e))
            invokestatic:void(\u9af2\u6ec6\u983f\ua068\u8c8a::\u416d\u3e2a\u4975\u3a62\u8df4\u7049, ldc:int(3553), ldc:int(10242), ldc:int(10497))
            invokestatic:void(\u9af2\u6ec6\u983f\ua068\u8c8a::\u416d\u3e2a\u4975\u3a62\u8df4\u7049, ldc:int(3553), ldc:int(10243), ldc:int(10497))
            invokestatic:void(\u9af2\u6ec6\u983f\ua068\u8c8a::\u6cfe\u67e9\u6b0d\u3e75\u8709\u98a4, ldc:int(0))
            invokevirtual:void(\u9937\u7d52\u3e75\u98a4\u8aa5\u7006::\u946b\u7873\u965f\u759a\u071d\u64ab, this:\u9937\u7d52\u3e75\u98a4\u8aa5\u7006)
            
            if (invokestatic:boolean(\u67e9\u4daf\u760c\ud217\ua6bd\ubff1::\u92ff\u183a\u93a2\uc3e3\u873d\u67e9)) {
                invokespecial:void(\u9937\u7d52\u3e75\u98a4\u8aa5\u7006::\u56bd\u873d\u6b0d\ua6bd\ub171\u7d52, this:\u9937\u7d52\u3e75\u98a4\u8aa5\u7006)
            }
            
            return:void()
        }
        
        goto(Label_0006)
    }
    
    public void \u946b\u7873\u965f\u759a\u071d\u64ab() {
        var_1_74 : \u4179\ubb2b\uc7fe\u51fa\uc910\u8753
        var_2_C6 : IOException
        var_2_E5 : JsonSyntaxException
        
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
            
            if (cmpne:boolean(getfield:\u4ab3\uf995\u3e75\u8bb0\uc31c\u5654(\u9937\u7d52\u3e75\u98a4\u8aa5\u7006::\u927d\ub83f\u718f\ud51e\u1833\ub113, this:\u9937\u7d52\u3e75\u98a4\u8aa5\u7006), aconstnull:\u4ab3\uf995\u3e75\u8bb0\uc31c\u5654())) {
                invokevirtual:void(\u4ab3\uf995\u3e75\u8bb0\uc31c\u5654::close, getfield:\u4ab3\uf995\u3e75\u8bb0\uc31c\u5654(\u9937\u7d52\u3e75\u98a4\u8aa5\u7006::\u927d\ub83f\u718f\ud51e\u1833\ub113, this:\u9937\u7d52\u3e75\u98a4\u8aa5\u7006))
            }
            
            var_1_74 = initobject:\u4179\ubb2b\uc7fe\u51fa\uc910\u8753(\u4179\ubb2b\uc7fe\u51fa\uc910\u8753::<init>, loadelement:String(getstatic:String[](\u9937\u7d52\u3e75\u98a4\u8aa5\u7006::\ub8be\ud171\u8c8a\ub1b9\u76bc\u5bc4), ldc:int(0)))
            
            try {
                invokevirtual:void(\u4ab3\uf995\u3e75\u8bb0\uc31c\u5654::\uc910\u385b\ub70c\uafe7\u0800\u5fe1, putfield:\u4ab3\uf995\u3e75\u8bb0\uc31c\u5654(\u9937\u7d52\u3e75\u98a4\u8aa5\u7006::\u927d\ub83f\u718f\ud51e\u1833\ub113, this:\u9937\u7d52\u3e75\u98a4\u8aa5\u7006, initobject:\u4ab3\uf995\u3e75\u8bb0\uc31c\u5654(\u4ab3\uf995\u3e75\u8bb0\uc31c\u5654::<init>, invokevirtual:\u4f52\ub7dc\u7bad\ud217\u76bc\u6d99(\u67e9\u4daf\u760c\ud217\ua6bd\ubff1::\uf94d\u6d69\u4492\u6c56\u98a4\u3d64, getfield:\u67e9\u4daf\u760c\ud217\ua6bd\ubff1(\u9937\u7d52\u3e75\u98a4\u8aa5\u7006::\u8df4\u3776\ud171\u7006\u51b2\uf995, this:\u9937\u7d52\u3e75\u98a4\u8aa5\u7006)), invokevirtual:\u6c52\u52d3\u516c\uae87\uae5d(\u67e9\u4daf\u760c\ud217\ua6bd\ubff1::\uc31c\u624e\u61a4\uc31c\u4d85\ub102, getfield:\u67e9\u4daf\u760c\ud217\ua6bd\ubff1(\u9937\u7d52\u3e75\u98a4\u8aa5\u7006::\u8df4\u3776\ud171\u7006\u51b2\uf995, this:\u9937\u7d52\u3e75\u98a4\u8aa5\u7006)), invokevirtual:\uc84e\uc2bd\u74b1\u88c5\u4cd9\u56bd(\u67e9\u4daf\u760c\ud217\ua6bd\ubff1::\u16f6\ucfaf\u3776\u9a18\u927d\uc238, getfield:\u67e9\u4daf\u760c\ud217\ua6bd\ubff1(\u9937\u7d52\u3e75\u98a4\u8aa5\u7006::\u8df4\u3776\ud171\u7006\u51b2\uf995, this:\u9937\u7d52\u3e75\u98a4\u8aa5\u7006)), var_1_74:\u4179\ubb2b\uc7fe\u51fa\uc910\u8753)), invokevirtual:int(\u4c04\u839e\u7049\ua3b4\ub18d\uc2bd::\u8c8a\ud51e\u071d\u59ec\u392e\u62da, invokevirtual:\u4c04\u839e\u7049\ua3b4\ub18d\uc2bd(\u67e9\u4daf\u760c\ud217\ua6bd\ubff1::\u52d3\u8709\ubf56\uc238\ufcaf\ua562, getfield:\u67e9\u4daf\u760c\ud217\ua6bd\ubff1(\u9937\u7d52\u3e75\u98a4\u8aa5\u7006::\u8df4\u3776\ud171\u7006\u51b2\uf995, this:\u9937\u7d52\u3e75\u98a4\u8aa5\u7006))), invokevirtual:int(\u4c04\u839e\u7049\ua3b4\ub18d\uc2bd::\ucef1\u7c6b\u6d99\ud36e\u8bb0\u927d, invokevirtual:\u4c04\u839e\u7049\ua3b4\ub18d\uc2bd(\u67e9\u4daf\u760c\ud217\ua6bd\ubff1::\u52d3\u8709\ubf56\uc238\ufcaf\ua562, getfield:\u67e9\u4daf\u760c\ud217\ua6bd\ubff1(\u9937\u7d52\u3e75\u98a4\u8aa5\u7006::\u8df4\u3776\ud171\u7006\u51b2\uf995, this:\u9937\u7d52\u3e75\u98a4\u8aa5\u7006))))
                putfield:\uc84e\uc2bd\u74b1\u88c5\u4cd9\u56bd(\u9937\u7d52\u3e75\u98a4\u8aa5\u7006::\u67e9\u8258\u385b\u5140\ub113\uc229, this:\u9937\u7d52\u3e75\u98a4\u8aa5\u7006, invokevirtual:\uc84e\uc2bd\u74b1\u88c5\u4cd9\u56bd(\u4ab3\uf995\u3e75\u8bb0\uc31c\u5654::\u7e3f\ub8be\u93a2\u3e2a\u7c6b\uc229, getfield:\u4ab3\uf995\u3e75\u8bb0\uc31c\u5654(\u9937\u7d52\u3e75\u98a4\u8aa5\u7006::\u927d\ub83f\u718f\ud51e\u1833\ub113, this:\u9937\u7d52\u3e75\u98a4\u8aa5\u7006), loadelement:String(getstatic:String[](\u9937\u7d52\u3e75\u98a4\u8aa5\u7006::\ub8be\ud171\u8c8a\ub1b9\u76bc\u5bc4), ldc:int(1))))
            }
            catch (java.io.IOException var_2_C6) {
                invokeinterface:void(Logger::warn, getstatic:Logger(\u9937\u7d52\u3e75\u98a4\u8aa5\u7006::\ubff1\u624e\u5f50\u76bc\u76bc\u2dcc), loadelement:String(getstatic:String[](\u9937\u7d52\u3e75\u98a4\u8aa5\u7006::\ub8be\ud171\u8c8a\ub1b9\u76bc\u5bc4), ldc:int(2)), var_1_74:\u4179\ubb2b\uc7fe\u51fa\uc910\u8753[expected:Object], var_2_C6:IOException[expected:Object])
                putfield:\u4ab3\uf995\u3e75\u8bb0\uc31c\u5654(\u9937\u7d52\u3e75\u98a4\u8aa5\u7006::\u927d\ub83f\u718f\ud51e\u1833\ub113, this:\u9937\u7d52\u3e75\u98a4\u8aa5\u7006, aconstnull:\u4ab3\uf995\u3e75\u8bb0\uc31c\u5654())
                putfield:\uc84e\uc2bd\u74b1\u88c5\u4cd9\u56bd(\u9937\u7d52\u3e75\u98a4\u8aa5\u7006::\u67e9\u8258\u385b\u5140\ub113\uc229, this:\u9937\u7d52\u3e75\u98a4\u8aa5\u7006, aconstnull:\uc84e\uc2bd\u74b1\u88c5\u4cd9\u56bd())
            }
            catch (com.google.gson.JsonSyntaxException var_2_E5) {
                invokeinterface:void(Logger::warn, getstatic:Logger(\u9937\u7d52\u3e75\u98a4\u8aa5\u7006::\ubff1\u624e\u5f50\u76bc\u76bc\u2dcc), loadelement:String(getstatic:String[](\u9937\u7d52\u3e75\u98a4\u8aa5\u7006::\ub8be\ud171\u8c8a\ub1b9\u76bc\u5bc4), ldc:int(3)), var_1_74:\u4179\ubb2b\uc7fe\u51fa\uc910\u8753[expected:Object], var_2_E5:JsonSyntaxException[expected:Object])
                putfield:\u4ab3\uf995\u3e75\u8bb0\uc31c\u5654(\u9937\u7d52\u3e75\u98a4\u8aa5\u7006::\u927d\ub83f\u718f\ud51e\u1833\ub113, this:\u9937\u7d52\u3e75\u98a4\u8aa5\u7006, aconstnull:\u4ab3\uf995\u3e75\u8bb0\uc31c\u5654())
                putfield:\uc84e\uc2bd\u74b1\u88c5\u4cd9\u56bd(\u9937\u7d52\u3e75\u98a4\u8aa5\u7006::\u67e9\u8258\u385b\u5140\ub113\uc229, this:\u9937\u7d52\u3e75\u98a4\u8aa5\u7006, aconstnull:\uc84e\uc2bd\u74b1\u88c5\u4cd9\u56bd())
            }
            
            return:void()
        }
        
        goto(Label_0006)
    }
    
    private void \u56bd\u873d\u6b0d\ua6bd\ub171\u7d52() {
        var_1_6A : \u4179\ubb2b\uc7fe\u51fa\uc910\u8753
        var_2_88 : \u4ab3\uf995\u3e75\u8bb0\uc31c\u5654
        var_3_AC : \uc84e\uc2bd\u74b1\u88c5\u4cd9\u56bd
        var_4_B8 : \uc84e\uc2bd\u74b1\u88c5\u4cd9\u56bd
        var_5_C5 : \uc84e\uc2bd\u74b1\u88c5\u4cd9\u56bd
        var_6_D2 : \uc84e\uc2bd\u74b1\u88c5\u4cd9\u56bd
        var_7_DF : \uc84e\uc2bd\u74b1\u88c5\u4cd9\u56bd
        var_4_146 : String
        var_2_106 : Exception
        var_5_152 : \u92ee\u97e6\u873d\u4f4a\u873d\uc246
        var_6_180 : StringTextComponent
        var_6_1B7 : \u1833\u88c5\u0b8e\uc9f6\u960f\u839e
        
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
            invokespecial:void(\u9937\u7d52\u3e75\u98a4\u8aa5\u7006::\u3776\u7d52\u3504\u8640\u1833\ud12e, this:\u9937\u7d52\u3e75\u98a4\u8aa5\u7006)
            var_1_6A = initobject:\u4179\ubb2b\uc7fe\u51fa\uc910\u8753(\u4179\ubb2b\uc7fe\u51fa\uc910\u8753::<init>, loadelement:String(getstatic:String[](\u9937\u7d52\u3e75\u98a4\u8aa5\u7006::\ub8be\ud171\u8c8a\ub1b9\u76bc\u5bc4), ldc:int(4)))
            
            try {
                var_2_88 = initobject:\u4ab3\uf995\u3e75\u8bb0\uc31c\u5654(\u4ab3\uf995\u3e75\u8bb0\uc31c\u5654::<init>, invokevirtual:\u4f52\ub7dc\u7bad\ud217\u76bc\u6d99(\u67e9\u4daf\u760c\ud217\ua6bd\ubff1::\uf94d\u6d69\u4492\u6c56\u98a4\u3d64, getfield:\u67e9\u4daf\u760c\ud217\ua6bd\ubff1(\u9937\u7d52\u3e75\u98a4\u8aa5\u7006::\u8df4\u3776\ud171\u7006\u51b2\uf995, this:\u9937\u7d52\u3e75\u98a4\u8aa5\u7006)), invokevirtual:\u6c52\u52d3\u516c\uae87\uae5d(\u67e9\u4daf\u760c\ud217\ua6bd\ubff1::\uc31c\u624e\u61a4\uc31c\u4d85\ub102, getfield:\u67e9\u4daf\u760c\ud217\ua6bd\ubff1(\u9937\u7d52\u3e75\u98a4\u8aa5\u7006::\u8df4\u3776\ud171\u7006\u51b2\uf995, this:\u9937\u7d52\u3e75\u98a4\u8aa5\u7006)), invokevirtual:\uc84e\uc2bd\u74b1\u88c5\u4cd9\u56bd(\u67e9\u4daf\u760c\ud217\ua6bd\ubff1::\u16f6\ucfaf\u3776\u9a18\u927d\uc238, getfield:\u67e9\u4daf\u760c\ud217\ua6bd\ubff1(\u9937\u7d52\u3e75\u98a4\u8aa5\u7006::\u8df4\u3776\ud171\u7006\u51b2\uf995, this:\u9937\u7d52\u3e75\u98a4\u8aa5\u7006)), var_1_6A:\u4179\ubb2b\uc7fe\u51fa\uc910\u8753)
                invokevirtual:void(\u4ab3\uf995\u3e75\u8bb0\uc31c\u5654::\uc910\u385b\ub70c\uafe7\u0800\u5fe1, var_2_88:\u4ab3\uf995\u3e75\u8bb0\uc31c\u5654, invokevirtual:int(\u4c04\u839e\u7049\ua3b4\ub18d\uc2bd::\u8c8a\ud51e\u071d\u59ec\u392e\u62da, invokevirtual:\u4c04\u839e\u7049\ua3b4\ub18d\uc2bd(\u67e9\u4daf\u760c\ud217\ua6bd\ubff1::\u52d3\u8709\ubf56\uc238\ufcaf\ua562, getfield:\u67e9\u4daf\u760c\ud217\ua6bd\ubff1(\u9937\u7d52\u3e75\u98a4\u8aa5\u7006::\u8df4\u3776\ud171\u7006\u51b2\uf995, this:\u9937\u7d52\u3e75\u98a4\u8aa5\u7006))), invokevirtual:int(\u4c04\u839e\u7049\ua3b4\ub18d\uc2bd::\ucef1\u7c6b\u6d99\ud36e\u8bb0\u927d, invokevirtual:\u4c04\u839e\u7049\ua3b4\ub18d\uc2bd(\u67e9\u4daf\u760c\ud217\ua6bd\ubff1::\u52d3\u8709\ubf56\uc238\ufcaf\ua562, getfield:\u67e9\u4daf\u760c\ud217\ua6bd\ubff1(\u9937\u7d52\u3e75\u98a4\u8aa5\u7006::\u8df4\u3776\ud171\u7006\u51b2\uf995, this:\u9937\u7d52\u3e75\u98a4\u8aa5\u7006))))
                var_3_AC = invokevirtual:\uc84e\uc2bd\u74b1\u88c5\u4cd9\u56bd(\u4ab3\uf995\u3e75\u8bb0\uc31c\u5654::\u7e3f\ub8be\u93a2\u3e2a\u7c6b\uc229, var_2_88:\u4ab3\uf995\u3e75\u8bb0\uc31c\u5654, loadelement:String(getstatic:String[](\u9937\u7d52\u3e75\u98a4\u8aa5\u7006::\ub8be\ud171\u8c8a\ub1b9\u76bc\u5bc4), ldc:int(5)))
                var_4_B8 = invokevirtual:\uc84e\uc2bd\u74b1\u88c5\u4cd9\u56bd(\u4ab3\uf995\u3e75\u8bb0\uc31c\u5654::\u7e3f\ub8be\u93a2\u3e2a\u7c6b\uc229, var_2_88:\u4ab3\uf995\u3e75\u8bb0\uc31c\u5654, loadelement:String(getstatic:String[](\u9937\u7d52\u3e75\u98a4\u8aa5\u7006::\ub8be\ud171\u8c8a\ub1b9\u76bc\u5bc4), ldc:int(6)))
                var_5_C5 = invokevirtual:\uc84e\uc2bd\u74b1\u88c5\u4cd9\u56bd(\u4ab3\uf995\u3e75\u8bb0\uc31c\u5654::\u7e3f\ub8be\u93a2\u3e2a\u7c6b\uc229, var_2_88:\u4ab3\uf995\u3e75\u8bb0\uc31c\u5654, loadelement:String(getstatic:String[](\u9937\u7d52\u3e75\u98a4\u8aa5\u7006::\ub8be\ud171\u8c8a\ub1b9\u76bc\u5bc4), ldc:int(7)))
                var_6_D2 = invokevirtual:\uc84e\uc2bd\u74b1\u88c5\u4cd9\u56bd(\u4ab3\uf995\u3e75\u8bb0\uc31c\u5654::\u7e3f\ub8be\u93a2\u3e2a\u7c6b\uc229, var_2_88:\u4ab3\uf995\u3e75\u8bb0\uc31c\u5654, loadelement:String(getstatic:String[](\u9937\u7d52\u3e75\u98a4\u8aa5\u7006::\ub8be\ud171\u8c8a\ub1b9\u76bc\u5bc4), ldc:int(8)))
                var_7_DF = invokevirtual:\uc84e\uc2bd\u74b1\u88c5\u4cd9\u56bd(\u4ab3\uf995\u3e75\u8bb0\uc31c\u5654::\u7e3f\ub8be\u93a2\u3e2a\u7c6b\uc229, var_2_88:\u4ab3\uf995\u3e75\u8bb0\uc31c\u5654, loadelement:String(getstatic:String[](\u9937\u7d52\u3e75\u98a4\u8aa5\u7006::\ub8be\ud171\u8c8a\ub1b9\u76bc\u5bc4), ldc:int(9)))
                putfield:\u4ab3\uf995\u3e75\u8bb0\uc31c\u5654(\u9937\u7d52\u3e75\u98a4\u8aa5\u7006::\u8350\u12b2\ua61f\u8389\u6c52\u5fe1, this:\u9937\u7d52\u3e75\u98a4\u8aa5\u7006, var_2_88:\u4ab3\uf995\u3e75\u8bb0\uc31c\u5654)
                putfield:\uc84e\uc2bd\u74b1\u88c5\u4cd9\u56bd(\u9937\u7d52\u3e75\u98a4\u8aa5\u7006::\u5d20\u51b2\u4bc8\u183a\u516c\u76bc, this:\u9937\u7d52\u3e75\u98a4\u8aa5\u7006, var_3_AC:\uc84e\uc2bd\u74b1\u88c5\u4cd9\u56bd)
                putfield:\uc84e\uc2bd\u74b1\u88c5\u4cd9\u56bd(\u9937\u7d52\u3e75\u98a4\u8aa5\u7006::\ufe34\u7006\ubcb0\u527a\uc84e\u8413, this:\u9937\u7d52\u3e75\u98a4\u8aa5\u7006, var_4_B8:\uc84e\uc2bd\u74b1\u88c5\u4cd9\u56bd)
                putfield:\uc84e\uc2bd\u74b1\u88c5\u4cd9\u56bd(\u9937\u7d52\u3e75\u98a4\u8aa5\u7006::\u718f\u92ff\u7330\u385b\u7e3f\u4f52, this:\u9937\u7d52\u3e75\u98a4\u8aa5\u7006, var_5_C5:\uc84e\uc2bd\u74b1\u88c5\u4cd9\u56bd)
                putfield:\uc84e\uc2bd\u74b1\u88c5\u4cd9\u56bd(\u9937\u7d52\u3e75\u98a4\u8aa5\u7006::\u97e6\ud158\u9033\ub7dc\u8389\ua562, this:\u9937\u7d52\u3e75\u98a4\u8aa5\u7006, var_6_D2:\uc84e\uc2bd\u74b1\u88c5\u4cd9\u56bd)
                putfield:\uc84e\uc2bd\u74b1\u88c5\u4cd9\u56bd(\u9937\u7d52\u3e75\u98a4\u8aa5\u7006::\u7006\u6d99\u8aa5\u92ff\u494c\u3d4b, this:\u9937\u7d52\u3e75\u98a4\u8aa5\u7006, var_7_DF:\uc84e\uc2bd\u74b1\u88c5\u4cd9\u56bd)
            }
            catch (java.lang.Exception var_2_106) {
                var_4_146 = invokevirtual:String(StringBuilder::toString, invokevirtual:StringBuilder(StringBuilder::append, invokevirtual:StringBuilder(StringBuilder::append, invokevirtual:StringBuilder(StringBuilder::append, invokevirtual:StringBuilder(StringBuilder::append, initobject:StringBuilder(StringBuilder::<init>), loadelement:String(getstatic:String[](\u9937\u7d52\u3e75\u98a4\u8aa5\u7006::\ub8be\ud171\u8c8a\ub1b9\u76bc\u5bc4), ldc:int(12))), ternaryop:String(instanceof:boolean(com.google.gson.JsonSyntaxException.class, var_2_106:Exception), loadelement:String(getstatic:String[](\u9937\u7d52\u3e75\u98a4\u8aa5\u7006::\ub8be\ud171\u8c8a\ub1b9\u76bc\u5bc4), ldc:int(10)), loadelement:String(getstatic:String[](\u9937\u7d52\u3e75\u98a4\u8aa5\u7006::\ub8be\ud171\u8c8a\ub1b9\u76bc\u5bc4), ldc:int(11)))), loadelement:String(getstatic:String[](\u9937\u7d52\u3e75\u98a4\u8aa5\u7006::\ub8be\ud171\u8c8a\ub1b9\u76bc\u5bc4), ldc:int(13))), var_1_6A:\u4179\ubb2b\uc7fe\u51fa\uc910\u8753[expected:Object]))
                var_5_152 = initobject:\u92ee\u97e6\u873d\u4f4a\u873d\uc246(\u92ee\u97e6\u873d\u4f4a\u873d\uc246::<init>, var_4_146:String, var_2_106:Exception[expected:Throwable])
                
                if (cmpgt:boolean(invokeinterface:int(Collection<E>::size, invokevirtual:Collection<String>(\u4f52\ua068\u4f52\u47c2\u4492::\u4c04\ua3b4\u4daf\uc31c\ud217\u51b2, invokevirtual:\u4f52\ua068\u4f52\u47c2\u4492(\u67e9\u4daf\u760c\ud217\ua6bd\ubff1::\ubded\u6c56\u5654\u3bc9\u9937\u4492, getfield:\u67e9\u4daf\u760c\ud217\ua6bd\ubff1(\u9937\u7d52\u3e75\u98a4\u8aa5\u7006::\u8df4\u3776\ud171\u7006\u51b2\uf995, this:\u9937\u7d52\u3e75\u98a4\u8aa5\u7006)))), ldc:int(1))) {
                    try {
                        var_6_180 = initobject:StringTextComponent(StringTextComponent::<init>, invokeinterface:String(\ufe34\u960f\ua6bd\u71f1\u516c::\ufcaf\ua61f\uf995\u183a\ud523\uc3e3, invokeinterface:\ufe34\u960f\ua6bd\u71f1\u516c(\u6c52\u52d3\u516c\uae87\uae5d::\u5d20\uc2e8\ubff1\u120d\u965f\u36d3, invokevirtual:\u6c52\u52d3\u516c\uae87\uae5d(\u67e9\u4daf\u760c\ud217\ua6bd\ubff1::\uc31c\u624e\u61a4\uc31c\u4d85\ub102, getfield:\u67e9\u4daf\u760c\ud217\ua6bd\ubff1(\u9937\u7d52\u3e75\u98a4\u8aa5\u7006::\u8df4\u3776\ud171\u7006\u51b2\uf995, this:\u9937\u7d52\u3e75\u98a4\u8aa5\u7006)), var_1_6A:\u4179\ubb2b\uc7fe\u51fa\uc910\u8753)))
                    }
                    catch (java.io.IOException var_7_185) {
                        var_6_180 = aconstnull:StringTextComponent()
                    }
                    
                    putfield:\ucef1\ub6ab\u3dd3\u718f\u4492\u0b8e(\u4daf\u8df4\ubb2b\u759a\u7330\u4ab3::\u62da\u8d90\u0c95\uc2bd\u93a2\u71ae, getfield:\u4daf\u8df4\ubb2b\u759a\u7330\u4ab3(\u67e9\u4daf\u760c\ud217\ua6bd\ubff1::\uc84e\u4c04\ubcb0\u0c95\ub8be\u5fe1, getfield:\u67e9\u4daf\u760c\ud217\ua6bd\ubff1(\u9937\u7d52\u3e75\u98a4\u8aa5\u7006::\u8df4\u3776\ud171\u7006\u51b2\uf995, this:\u9937\u7d52\u3e75\u98a4\u8aa5\u7006)), getstatic:\ucef1\ub6ab\u3dd3\u718f\u4492\u0b8e(\ucef1\ub6ab\u3dd3\u718f\u4492\u0b8e::\u4f52\u71ae\u1187\u718f\u527a\ufe34))
                    invokevirtual:void(\u67e9\u4daf\u760c\ud217\ua6bd\ubff1::\u59ec\u392e\u647c\u67e9\u72f1\u4c04, getfield:\u67e9\u4daf\u760c\ud217\ua6bd\ubff1(\u9937\u7d52\u3e75\u98a4\u8aa5\u7006::\u8df4\u3776\ud171\u7006\u51b2\uf995, this:\u9937\u7d52\u3e75\u98a4\u8aa5\u7006), var_5_152:\u92ee\u97e6\u873d\u4f4a\u873d\uc246[expected:Throwable], var_6_180:StringTextComponent[expected:ITextComponent])
                }
                else {
                    var_6_1B7 = invokevirtual:\u1833\u88c5\u0b8e\uc9f6\u960f\u839e(\u67e9\u4daf\u760c\ud217\ua6bd\ubff1::\u5db4\uc2bd\u4ab3\ud4fe\uc31c\ub18d, getfield:\u67e9\u4daf\u760c\ud217\ua6bd\ubff1(\u9937\u7d52\u3e75\u98a4\u8aa5\u7006::\u8df4\u3776\ud171\u7006\u51b2\uf995, this:\u9937\u7d52\u3e75\u98a4\u8aa5\u7006), initobject:\u1833\u88c5\u0b8e\uc9f6\u960f\u839e(\u1833\u88c5\u0b8e\uc9f6\u960f\u839e::<init>, var_4_146:String, var_5_152:\u92ee\u97e6\u873d\u4f4a\u873d\uc246[expected:Throwable]))
                    putfield:\ucef1\ub6ab\u3dd3\u718f\u4492\u0b8e(\u4daf\u8df4\ubb2b\u759a\u7330\u4ab3::\u62da\u8d90\u0c95\uc2bd\u93a2\u71ae, getfield:\u4daf\u8df4\ubb2b\u759a\u7330\u4ab3(\u67e9\u4daf\u760c\ud217\ua6bd\ubff1::\uc84e\u4c04\ubcb0\u0c95\ub8be\u5fe1, getfield:\u67e9\u4daf\u760c\ud217\ua6bd\ubff1(\u9937\u7d52\u3e75\u98a4\u8aa5\u7006::\u8df4\u3776\ud171\u7006\u51b2\uf995, this:\u9937\u7d52\u3e75\u98a4\u8aa5\u7006)), getstatic:\ucef1\ub6ab\u3dd3\u718f\u4492\u0b8e(\ucef1\ub6ab\u3dd3\u718f\u4492\u0b8e::\u4f52\u71ae\u1187\u718f\u527a\ufe34))
                    invokevirtual:void(\u4daf\u8df4\ubb2b\u759a\u7330\u4ab3::\ua562\u7043\u3711\u183a\u2dcc\uc7fe, getfield:\u4daf\u8df4\ubb2b\u759a\u7330\u4ab3(\u67e9\u4daf\u760c\ud217\ua6bd\ubff1::\uc84e\u4c04\ubcb0\u0c95\ub8be\u5fe1, getfield:\u67e9\u4daf\u760c\ud217\ua6bd\ubff1(\u9937\u7d52\u3e75\u98a4\u8aa5\u7006::\u8df4\u3776\ud171\u7006\u51b2\uf995, this:\u9937\u7d52\u3e75\u98a4\u8aa5\u7006)))
                    invokeinterface:void(Logger::fatal, getstatic:Logger(\u9937\u7d52\u3e75\u98a4\u8aa5\u7006::\ubff1\u624e\u5f50\u76bc\u76bc\u2dcc), var_4_146:String, var_5_152:\u92ee\u97e6\u873d\u4f4a\u873d\uc246[expected:Throwable])
                    invokevirtual:void(\u67e9\u4daf\u760c\ud217\ua6bd\ubff1::\u7bad\u4bc8\u7006\u4c2b\u5d20\u62da, getfield:\u67e9\u4daf\u760c\ud217\ua6bd\ubff1(\u9937\u7d52\u3e75\u98a4\u8aa5\u7006::\u8df4\u3776\ud171\u7006\u51b2\uf995, this:\u9937\u7d52\u3e75\u98a4\u8aa5\u7006))
                    invokestatic:void(\u67e9\u4daf\u760c\ud217\ua6bd\ubff1::\u9937\u8753\ub171\ua3b4\u8709\ucef1, var_6_1B7:\u1833\u88c5\u0b8e\uc9f6\u960f\u839e)
                }
            }
            
            return:void()
        }
        
        goto(Label_0006)
    }
    
    private void \u3776\u7d52\u3504\u8640\u1833\ud12e() {
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
            
            if (cmpne:boolean(getfield:\u4ab3\uf995\u3e75\u8bb0\uc31c\u5654(\u9937\u7d52\u3e75\u98a4\u8aa5\u7006::\u8350\u12b2\ua61f\u8389\u6c52\u5fe1, this:\u9937\u7d52\u3e75\u98a4\u8aa5\u7006), aconstnull:\u4ab3\uf995\u3e75\u8bb0\uc31c\u5654())) {
                invokevirtual:void(\u4ab3\uf995\u3e75\u8bb0\uc31c\u5654::close, getfield:\u4ab3\uf995\u3e75\u8bb0\uc31c\u5654(\u9937\u7d52\u3e75\u98a4\u8aa5\u7006::\u8350\u12b2\ua61f\u8389\u6c52\u5fe1, this:\u9937\u7d52\u3e75\u98a4\u8aa5\u7006))
                invokevirtual:void(\uc84e\uc2bd\u74b1\u88c5\u4cd9\u56bd::\u6d69\u1187\ubb2b\ube23\u718f\u3776, getfield:\uc84e\uc2bd\u74b1\u88c5\u4cd9\u56bd(\u9937\u7d52\u3e75\u98a4\u8aa5\u7006::\u5d20\u51b2\u4bc8\u183a\u516c\u76bc, this:\u9937\u7d52\u3e75\u98a4\u8aa5\u7006))
                invokevirtual:void(\uc84e\uc2bd\u74b1\u88c5\u4cd9\u56bd::\u6d69\u1187\ubb2b\ube23\u718f\u3776, getfield:\uc84e\uc2bd\u74b1\u88c5\u4cd9\u56bd(\u9937\u7d52\u3e75\u98a4\u8aa5\u7006::\ufe34\u7006\ubcb0\u527a\uc84e\u8413, this:\u9937\u7d52\u3e75\u98a4\u8aa5\u7006))
                invokevirtual:void(\uc84e\uc2bd\u74b1\u88c5\u4cd9\u56bd::\u6d69\u1187\ubb2b\ube23\u718f\u3776, getfield:\uc84e\uc2bd\u74b1\u88c5\u4cd9\u56bd(\u9937\u7d52\u3e75\u98a4\u8aa5\u7006::\u718f\u92ff\u7330\u385b\u7e3f\u4f52, this:\u9937\u7d52\u3e75\u98a4\u8aa5\u7006))
                invokevirtual:void(\uc84e\uc2bd\u74b1\u88c5\u4cd9\u56bd::\u6d69\u1187\ubb2b\ube23\u718f\u3776, getfield:\uc84e\uc2bd\u74b1\u88c5\u4cd9\u56bd(\u9937\u7d52\u3e75\u98a4\u8aa5\u7006::\u97e6\ud158\u9033\ub7dc\u8389\ua562, this:\u9937\u7d52\u3e75\u98a4\u8aa5\u7006))
                invokevirtual:void(\uc84e\uc2bd\u74b1\u88c5\u4cd9\u56bd::\u6d69\u1187\ubb2b\ube23\u718f\u3776, getfield:\uc84e\uc2bd\u74b1\u88c5\u4cd9\u56bd(\u9937\u7d52\u3e75\u98a4\u8aa5\u7006::\u7006\u6d99\u8aa5\u92ff\u494c\u3d4b, this:\u9937\u7d52\u3e75\u98a4\u8aa5\u7006))
                putfield:\u4ab3\uf995\u3e75\u8bb0\uc31c\u5654(\u9937\u7d52\u3e75\u98a4\u8aa5\u7006::\u8350\u12b2\ua61f\u8389\u6c52\u5fe1, this:\u9937\u7d52\u3e75\u98a4\u8aa5\u7006, aconstnull:\u4ab3\uf995\u3e75\u8bb0\uc31c\u5654())
                putfield:\uc84e\uc2bd\u74b1\u88c5\u4cd9\u56bd(\u9937\u7d52\u3e75\u98a4\u8aa5\u7006::\u5d20\u51b2\u4bc8\u183a\u516c\u76bc, this:\u9937\u7d52\u3e75\u98a4\u8aa5\u7006, aconstnull:\uc84e\uc2bd\u74b1\u88c5\u4cd9\u56bd())
                putfield:\uc84e\uc2bd\u74b1\u88c5\u4cd9\u56bd(\u9937\u7d52\u3e75\u98a4\u8aa5\u7006::\ufe34\u7006\ubcb0\u527a\uc84e\u8413, this:\u9937\u7d52\u3e75\u98a4\u8aa5\u7006, aconstnull:\uc84e\uc2bd\u74b1\u88c5\u4cd9\u56bd())
                putfield:\uc84e\uc2bd\u74b1\u88c5\u4cd9\u56bd(\u9937\u7d52\u3e75\u98a4\u8aa5\u7006::\u718f\u92ff\u7330\u385b\u7e3f\u4f52, this:\u9937\u7d52\u3e75\u98a4\u8aa5\u7006, aconstnull:\uc84e\uc2bd\u74b1\u88c5\u4cd9\u56bd())
                putfield:\uc84e\uc2bd\u74b1\u88c5\u4cd9\u56bd(\u9937\u7d52\u3e75\u98a4\u8aa5\u7006::\u97e6\ud158\u9033\ub7dc\u8389\ua562, this:\u9937\u7d52\u3e75\u98a4\u8aa5\u7006, aconstnull:\uc84e\uc2bd\u74b1\u88c5\u4cd9\u56bd())
                putfield:\uc84e\uc2bd\u74b1\u88c5\u4cd9\u56bd(\u9937\u7d52\u3e75\u98a4\u8aa5\u7006::\u7006\u6d99\u8aa5\u92ff\u494c\u3d4b, this:\u9937\u7d52\u3e75\u98a4\u8aa5\u7006, aconstnull:\uc84e\uc2bd\u74b1\u88c5\u4cd9\u56bd())
            }
            
            return:void()
        }
        
        goto(Label_0006)
    }
    
    public void \u718f\ua3b4\ua068\u6c56\uc3e3\u8640() {
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
            
            if (invokevirtual:boolean(\u9937\u7d52\u3e75\u98a4\u8aa5\u7006::\u16f6\u88c5\u3d4b\u927d\u5d20\u6cfe, this:\u9937\u7d52\u3e75\u98a4\u8aa5\u7006)) {
                invokestatic:void(\u9af2\u6ec6\u983f\ua068\u8c8a::\uc9f6\u7049\u92ee\ube23\u3c25\u6d99)
                invokestatic:void(\u9af2\u6ec6\u983f\ua068\u8c8a::\ube23\u624e\u2dcc\u3a62\uf9c5\u8389, getstatic:\ud12e\ub70c\u16f6\uc29a\u8bb0(\ud12e\ub70c\u16f6\uc29a\u8bb0::\ua6bd\ubcb0\ub113\u3bd6\u72f1\u9af2), getstatic:\u624e\uc4d2\u98a4\ud12e\u7873(\u624e\uc4d2\u98a4\ud12e\u7873::\u3e2a\u0a06\u3d4b\u8640\ub19c\u67e9), getstatic:\ud12e\ub70c\u16f6\uc29a\u8bb0(\ud12e\ub70c\u16f6\uc29a\u8bb0::\u51b2\ud36e\u6ec6\u983f\uf94d\u5140), getstatic:\u624e\uc4d2\u98a4\ud12e\u7873(\u624e\uc4d2\u98a4\ud12e\u7873::\uff55\u416d\u4c2b\u527a\ua3b4\u9937))
                invokevirtual:void(\uc84e\uc2bd\u74b1\u88c5\u4cd9\u56bd::\uc910\u8640\ud158\u8308\u61a4\u6435, getfield:\uc84e\uc2bd\u74b1\u88c5\u4cd9\u56bd(\u9937\u7d52\u3e75\u98a4\u8aa5\u7006::\u67e9\u8258\u385b\u5140\ub113\uc229, this:\u9937\u7d52\u3e75\u98a4\u8aa5\u7006), invokevirtual:int(\u4c04\u839e\u7049\ua3b4\ub18d\uc2bd::\u8c8a\ud51e\u071d\u59ec\u392e\u62da, invokevirtual:\u4c04\u839e\u7049\ua3b4\ub18d\uc2bd(\u67e9\u4daf\u760c\ud217\ua6bd\ubff1::\u52d3\u8709\ubf56\uc238\ufcaf\ua562, getfield:\u67e9\u4daf\u760c\ud217\ua6bd\ubff1(\u9937\u7d52\u3e75\u98a4\u8aa5\u7006::\u8df4\u3776\ud171\u7006\u51b2\uf995, this:\u9937\u7d52\u3e75\u98a4\u8aa5\u7006))), invokevirtual:int(\u4c04\u839e\u7049\ua3b4\ub18d\uc2bd::\ucef1\u7c6b\u6d99\ud36e\u8bb0\u927d, invokevirtual:\u4c04\u839e\u7049\ua3b4\ub18d\uc2bd(\u67e9\u4daf\u760c\ud217\ua6bd\ubff1::\u52d3\u8709\ubf56\uc238\ufcaf\ua562, getfield:\u67e9\u4daf\u760c\ud217\ua6bd\ubff1(\u9937\u7d52\u3e75\u98a4\u8aa5\u7006::\u8df4\u3776\ud171\u7006\u51b2\uf995, this:\u9937\u7d52\u3e75\u98a4\u8aa5\u7006))), ldc:boolean(0))
                invokestatic:void(\u9af2\u6ec6\u983f\ua068\u8c8a::\u6b5f\ua3b4\ua61f\ub70c\u5140\u6bb9)
            }
            
            return:void()
        }
        
        goto(Label_0006)
    }
    
    public boolean \u16f6\u88c5\u3d4b\u927d\u5d20\u6cfe() {
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
            return:boolean(logicaland:boolean(logicaland:boolean(logicaland:boolean(logicalnot:boolean(logicalor:boolean(invokestatic:boolean(\u8308\u51fa\u6c56\u5db4\ub18d\u34df::\u61a4\u3e75\u8aa5\ub102\ub7dc\u647c), invokestatic:boolean(\u8308\u51fa\u6c56\u5db4\ub18d\u34df::\ub83f\u7d52\u12cb\u7e3f\u76bc\u6d69))), cmpne:boolean(getfield:\uc84e\uc2bd\u74b1\u88c5\u4cd9\u56bd(\u9937\u7d52\u3e75\u98a4\u8aa5\u7006::\u67e9\u8258\u385b\u5140\ub113\uc229, this:\u9937\u7d52\u3e75\u98a4\u8aa5\u7006), aconstnull:\uc84e\uc2bd\u74b1\u88c5\u4cd9\u56bd())), cmpne:boolean(getfield:\u4ab3\uf995\u3e75\u8bb0\uc31c\u5654(\u9937\u7d52\u3e75\u98a4\u8aa5\u7006::\u927d\ub83f\u718f\ud51e\u1833\ub113, this:\u9937\u7d52\u3e75\u98a4\u8aa5\u7006), aconstnull:\u4ab3\uf995\u3e75\u8bb0\uc31c\u5654())), cmpne:boolean(getfield:\uf995\u72f1\u8389\ucb79\ub6ab\u8d98(\u67e9\u4daf\u760c\ud217\ua6bd\ubff1::\ud12e\u5245\ud51e\u3d64\u8bb0\u647c, getfield:\u67e9\u4daf\u760c\ud217\ua6bd\ubff1(\u9937\u7d52\u3e75\u98a4\u8aa5\u7006::\u8df4\u3776\ud171\u7006\u51b2\uf995, this:\u9937\u7d52\u3e75\u98a4\u8aa5\u7006)), aconstnull:\uf995\u72f1\u8389\ucb79\ub6ab\u8d98())))
        }
        
        goto(Label_0006)
    }
    
    private void \ube23\u5db4\uafe7\uc910\u4d85\u7049() {
        var_2_60 : \u760c\u7ce1\u9a18\ub32d\u6d99\ub6ab
        
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
            var_2_60 = invokevirtual:\u760c\u7ce1\u9a18\ub32d\u6d99\ub6ab(\ub6ab\u8cae\u64ab\u5245\ubff1\u3711::\u74b1\u7bad\u6435\uc87f\u6d69\uc238, invokestatic:\ub6ab\u8cae\u64ab\u5245\ubff1\u3711(\ub6ab\u8cae\u64ab\u5245\ubff1\u3711::\u3504\ud523\u99f7\u5140\u5d20\u983f))
            
            if (cmpne:boolean(getfield:\u5654\u0800\ub1b9\ua562\u3e75\u8cae(\u9937\u7d52\u3e75\u98a4\u8aa5\u7006::\u9937\u3776\ubb2b\u494c\u392e\ud36e, this:\u9937\u7d52\u3e75\u98a4\u8aa5\u7006), aconstnull:\u5654\u0800\ub1b9\ua562\u3e75\u8cae())) {
                invokevirtual:void(\u5654\u0800\ub1b9\ua562\u3e75\u8cae::close, getfield:\u5654\u0800\ub1b9\ua562\u3e75\u8cae(\u9937\u7d52\u3e75\u98a4\u8aa5\u7006::\u9937\u3776\ubb2b\u494c\u392e\ud36e, this:\u9937\u7d52\u3e75\u98a4\u8aa5\u7006))
            }
            
            putfield:\u5654\u0800\ub1b9\ua562\u3e75\u8cae(\u9937\u7d52\u3e75\u98a4\u8aa5\u7006::\u9937\u3776\ubb2b\u494c\u392e\ud36e, this:\u9937\u7d52\u3e75\u98a4\u8aa5\u7006, initobject:\u5654\u0800\ub1b9\ua562\u3e75\u8cae(\u5654\u0800\ub1b9\ua562\u3e75\u8cae::<init>, getfield:\u74b1\u6d69\ud4fe\u4179\u8c8a\u965f(\u9937\u7d52\u3e75\u98a4\u8aa5\u7006::\u3c25\u8cae\ub70c\ufe34\u946b\uf94d, this:\u9937\u7d52\u3e75\u98a4\u8aa5\u7006)))
            invokespecial:void(\u9937\u7d52\u3e75\u98a4\u8aa5\u7006::\u3bd6\ub19c\u527a\uc4d2\u5fe1\u5245, this:\u9937\u7d52\u3e75\u98a4\u8aa5\u7006, var_2_60:\u760c\u7ce1\u9a18\ub32d\u6d99\ub6ab, ldc:float(-16.0f), ldc:boolean(1))
            invokevirtual:void(\u760c\u7ce1\u9a18\ub32d\u6d99\ub6ab::\ua068\uc31c\u6bb9\u34df\uc3e3\u6d99, var_2_60:\u760c\u7ce1\u9a18\ub32d\u6d99\ub6ab)
            invokevirtual:void(\u5654\u0800\ub1b9\ua562\u3e75\u8cae::\ud217\uf995\uc2e8\u6198\u8d90\u494c, getfield:\u5654\u0800\ub1b9\ua562\u3e75\u8cae(\u9937\u7d52\u3e75\u98a4\u8aa5\u7006::\u9937\u3776\ubb2b\u494c\u392e\ud36e, this:\u9937\u7d52\u3e75\u98a4\u8aa5\u7006), var_2_60:\u760c\u7ce1\u9a18\ub32d\u6d99\ub6ab)
            return:void()
        }
        
        goto(Label_0006)
    }
    
    private void \u8d98\ucb79\ubf56\u92ff\ub7dc\u8389() {
        var_2_60 : \u760c\u7ce1\u9a18\ub32d\u6d99\ub6ab
        
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
            var_2_60 = invokevirtual:\u760c\u7ce1\u9a18\ub32d\u6d99\ub6ab(\ub6ab\u8cae\u64ab\u5245\ubff1\u3711::\u74b1\u7bad\u6435\uc87f\u6d69\uc238, invokestatic:\ub6ab\u8cae\u64ab\u5245\ubff1\u3711(\ub6ab\u8cae\u64ab\u5245\ubff1\u3711::\u3504\ud523\u99f7\u5140\u5d20\u983f))
            
            if (cmpne:boolean(getfield:\u5654\u0800\ub1b9\ua562\u3e75\u8cae(\u9937\u7d52\u3e75\u98a4\u8aa5\u7006::\ud217\u7c6b\u6c52\u4cd9\u4179\u4f52, this:\u9937\u7d52\u3e75\u98a4\u8aa5\u7006), aconstnull:\u5654\u0800\ub1b9\ua562\u3e75\u8cae())) {
                invokevirtual:void(\u5654\u0800\ub1b9\ua562\u3e75\u8cae::close, getfield:\u5654\u0800\ub1b9\ua562\u3e75\u8cae(\u9937\u7d52\u3e75\u98a4\u8aa5\u7006::\ud217\u7c6b\u6c52\u4cd9\u4179\u4f52, this:\u9937\u7d52\u3e75\u98a4\u8aa5\u7006))
            }
            
            putfield:\u5654\u0800\ub1b9\ua562\u3e75\u8cae(\u9937\u7d52\u3e75\u98a4\u8aa5\u7006::\ud217\u7c6b\u6c52\u4cd9\u4179\u4f52, this:\u9937\u7d52\u3e75\u98a4\u8aa5\u7006, initobject:\u5654\u0800\ub1b9\ua562\u3e75\u8cae(\u5654\u0800\ub1b9\ua562\u3e75\u8cae::<init>, getfield:\u74b1\u6d69\ud4fe\u4179\u8c8a\u965f(\u9937\u7d52\u3e75\u98a4\u8aa5\u7006::\u3c25\u8cae\ub70c\ufe34\u946b\uf94d, this:\u9937\u7d52\u3e75\u98a4\u8aa5\u7006)))
            invokespecial:void(\u9937\u7d52\u3e75\u98a4\u8aa5\u7006::\u3bd6\ub19c\u527a\uc4d2\u5fe1\u5245, this:\u9937\u7d52\u3e75\u98a4\u8aa5\u7006, var_2_60:\u760c\u7ce1\u9a18\ub32d\u6d99\ub6ab, ldc:float(16.0f), ldc:boolean(0))
            invokevirtual:void(\u760c\u7ce1\u9a18\ub32d\u6d99\ub6ab::\ua068\uc31c\u6bb9\u34df\uc3e3\u6d99, var_2_60:\u760c\u7ce1\u9a18\ub32d\u6d99\ub6ab)
            invokevirtual:void(\u5654\u0800\ub1b9\ua562\u3e75\u8cae::\ud217\uf995\uc2e8\u6198\u8d90\u494c, getfield:\u5654\u0800\ub1b9\ua562\u3e75\u8cae(\u9937\u7d52\u3e75\u98a4\u8aa5\u7006::\ud217\u7c6b\u6c52\u4cd9\u4179\u4f52, this:\u9937\u7d52\u3e75\u98a4\u8aa5\u7006), var_2_60:\u760c\u7ce1\u9a18\ub32d\u6d99\ub6ab)
            return:void()
        }
        
        goto(Label_0006)
    }
    
    private void \u3bd6\ub19c\u527a\uc4d2\u5fe1\u5245(\u5d20\u7043\u88c5\u5db4\uf94d.\u760c\u7ce1\u9a18\ub32d\u6d99\ub6ab p0, float p1, boolean p2) {
        var_6_78 : int
        var_7_7D : int
        var_8_89 : int
        var_9_95 : float
        var_10_9D : float
        
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
            invokevirtual:void(\u760c\u7ce1\u9a18\ub32d\u6d99\ub6ab::\u12cb\u9937\uc246\u5fe1\ubefe\u494c, p0:\u760c\u7ce1\u9a18\ub32d\u6d99\ub6ab, ldc:int(7), getstatic:\u74b1\u6d69\ud4fe\u4179\u8c8a\u965f(\u6d69\u4c04\ub113\u92ff\u3e75\u12b2::\u983f\u3e2a\u7e3f\u4ab3\u99f7\u7bad))
            var_6_78 = add:int(mul:int(add:int(div:int(getfield:int(\u9937\u7d52\u3e75\u98a4\u8aa5\u7006::\u8bb0\ub19c\u8350\uc2bd\u69d9\u7043, this:\u9937\u7d52\u3e75\u98a4\u8aa5\u7006), ldc:int(64)), ldc:int(1)), ldc:int(64)), ldc:int(64))
            var_7_7D = neg:int(var_6_78:int)
            
            while (cmple:boolean(var_7_7D:int, var_6_78:int)) {
                var_8_89 = neg:int(var_6_78:int)
                
                while (cmple:boolean(var_8_89:int, var_6_78:int)) {
                    var_9_95 = i2f:float(var_7_7D:int)
                    var_10_9D = i2f:float(add:int(var_7_7D:int, ldc:int(64)))
                    
                    if (p2:boolean) {
                        var_10_9D = i2f:float(var_7_7D:int)
                        var_9_95 = i2f:float(add:int(var_7_7D:int, ldc:int(64)))
                    }
                    
                    invokeinterface:void(\u6b0d\uf9c5\ucfaf\ud36e\ub102::\ua61f\u0a06\u3bc9\ufe34\uc9f6\u8258, invokevirtual:\u6b0d\uf9c5\ucfaf\ud36e\ub102(\u6b0d\uf9c5\ucfaf\ud36e\ub102::\u8d90\u9255\u3bd6\u5d20\ub83f\u1187, p0:\u760c\u7ce1\u9a18\ub32d\u6d99\ub6ab[expected:\u6b0d\uf9c5\ucfaf\ud36e\ub102], f2d:double(var_9_95:float), f2d:double(p1:float), i2d:double(var_8_89:int)))
                    invokeinterface:void(\u6b0d\uf9c5\ucfaf\ud36e\ub102::\ua61f\u0a06\u3bc9\ufe34\uc9f6\u8258, invokevirtual:\u6b0d\uf9c5\ucfaf\ud36e\ub102(\u6b0d\uf9c5\ucfaf\ud36e\ub102::\u8d90\u9255\u3bd6\u5d20\ub83f\u1187, p0:\u760c\u7ce1\u9a18\ub32d\u6d99\ub6ab[expected:\u6b0d\uf9c5\ucfaf\ud36e\ub102], f2d:double(var_10_9D:float), f2d:double(p1:float), i2d:double(var_8_89:int)))
                    invokeinterface:void(\u6b0d\uf9c5\ucfaf\ud36e\ub102::\ua61f\u0a06\u3bc9\ufe34\uc9f6\u8258, invokevirtual:\u6b0d\uf9c5\ucfaf\ud36e\ub102(\u6b0d\uf9c5\ucfaf\ud36e\ub102::\u8d90\u9255\u3bd6\u5d20\ub83f\u1187, p0:\u760c\u7ce1\u9a18\ub32d\u6d99\ub6ab[expected:\u6b0d\uf9c5\ucfaf\ud36e\ub102], f2d:double(var_10_9D:float), f2d:double(p1:float), i2d:double(add:int(var_8_89:int, ldc:int(64)))))
                    invokeinterface:void(\u6b0d\uf9c5\ucfaf\ud36e\ub102::\ua61f\u0a06\u3bc9\ufe34\uc9f6\u8258, invokevirtual:\u6b0d\uf9c5\ucfaf\ud36e\ub102(\u6b0d\uf9c5\ucfaf\ud36e\ub102::\u8d90\u9255\u3bd6\u5d20\ub83f\u1187, p0:\u760c\u7ce1\u9a18\ub32d\u6d99\ub6ab[expected:\u6b0d\uf9c5\ucfaf\ud36e\ub102], f2d:double(var_9_95:float), f2d:double(p1:float), i2d:double(add:int(var_8_89:int, ldc:int(64)))))
                    inc:int(var_8_89, ldc:int(64))
                }
                
                inc:int(var_7_7D, ldc:int(64))
            }
            
            return:void()
        }
        
        goto(Label_0006)
    }
    
    private void \ud523\ubff1\ubff1\ub8be\u120d\u927d() {
        var_2_60 : \u760c\u7ce1\u9a18\ub32d\u6d99\ub6ab
        
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
            var_2_60 = invokevirtual:\u760c\u7ce1\u9a18\ub32d\u6d99\ub6ab(\ub6ab\u8cae\u64ab\u5245\ubff1\u3711::\u74b1\u7bad\u6435\uc87f\u6d69\uc238, invokestatic:\ub6ab\u8cae\u64ab\u5245\ubff1\u3711(\ub6ab\u8cae\u64ab\u5245\ubff1\u3711::\u3504\ud523\u99f7\u5140\u5d20\u983f))
            
            if (cmpne:boolean(getfield:\u5654\u0800\ub1b9\ua562\u3e75\u8cae(\u9937\u7d52\u3e75\u98a4\u8aa5\u7006::\ubcb0\u93a2\ud7e8\ua068\u71ae\ud4fe, this:\u9937\u7d52\u3e75\u98a4\u8aa5\u7006), aconstnull:\u5654\u0800\ub1b9\ua562\u3e75\u8cae())) {
                invokevirtual:void(\u5654\u0800\ub1b9\ua562\u3e75\u8cae::close, getfield:\u5654\u0800\ub1b9\ua562\u3e75\u8cae(\u9937\u7d52\u3e75\u98a4\u8aa5\u7006::\ubcb0\u93a2\ud7e8\ua068\u71ae\ud4fe, this:\u9937\u7d52\u3e75\u98a4\u8aa5\u7006))
            }
            
            putfield:\u5654\u0800\ub1b9\ua562\u3e75\u8cae(\u9937\u7d52\u3e75\u98a4\u8aa5\u7006::\ubcb0\u93a2\ud7e8\ua068\u71ae\ud4fe, this:\u9937\u7d52\u3e75\u98a4\u8aa5\u7006, initobject:\u5654\u0800\ub1b9\ua562\u3e75\u8cae(\u5654\u0800\ub1b9\ua562\u3e75\u8cae::<init>, getfield:\u74b1\u6d69\ud4fe\u4179\u8c8a\u965f(\u9937\u7d52\u3e75\u98a4\u8aa5\u7006::\u3c25\u8cae\ub70c\ufe34\u946b\uf94d, this:\u9937\u7d52\u3e75\u98a4\u8aa5\u7006)))
            invokespecial:void(\u9937\u7d52\u3e75\u98a4\u8aa5\u7006::\u6198\u759a\ub7dc\u8c8a\ud158\u839e, this:\u9937\u7d52\u3e75\u98a4\u8aa5\u7006, var_2_60:\u760c\u7ce1\u9a18\ub32d\u6d99\ub6ab)
            invokevirtual:void(\u760c\u7ce1\u9a18\ub32d\u6d99\ub6ab::\ua068\uc31c\u6bb9\u34df\uc3e3\u6d99, var_2_60:\u760c\u7ce1\u9a18\ub32d\u6d99\ub6ab)
            invokevirtual:void(\u5654\u0800\ub1b9\ua562\u3e75\u8cae::\ud217\uf995\uc2e8\u6198\u8d90\u494c, getfield:\u5654\u0800\ub1b9\ua562\u3e75\u8cae(\u9937\u7d52\u3e75\u98a4\u8aa5\u7006::\ubcb0\u93a2\ud7e8\ua068\u71ae\ud4fe, this:\u9937\u7d52\u3e75\u98a4\u8aa5\u7006), var_2_60:\u760c\u7ce1\u9a18\ub32d\u6d99\ub6ab)
            return:void()
        }
        
        goto(Label_0006)
    }
    
    private void \u6198\u759a\ub7dc\u8c8a\ud158\u839e(\u5d20\u7043\u88c5\u5db4\uf94d.\u760c\u7ce1\u9a18\ub32d\u6d99\ub6ab p0) {
        var_2_62 : Random
        var_3_6D : int
        var_4_7E : double
        var_6_89 : double
        var_8_94 : double
        var_10_A3 : double
        var_12_B6 : double
        var_12_CF : double
        var_4_D6 : double
        var_6_DD : double
        var_8_E4 : double
        var_14_EC : double
        var_16_F4 : double
        var_18_FC : double
        var_20_105 : double
        var_22_10C : double
        var_24_113 : double
        var_26_128 : double
        var_28_12F : double
        var_30_136 : double
        var_32_144 : double
        var_34_14B : double
        var_36_152 : double
        var_38_155 : int
        var_41_16A : double
        var_43_178 : double
        var_47_188 : double
        var_49_195 : double
        var_51_1A1 : double
        var_53_1AD : double
        
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
            var_2_62 = initobject:Random(Random::<init>, ldc:long(10842L))
            invokevirtual:void(\u760c\u7ce1\u9a18\ub32d\u6d99\ub6ab::\u12cb\u9937\uc246\u5fe1\ubefe\u494c, p0:\u760c\u7ce1\u9a18\ub32d\u6d99\ub6ab, ldc:int(7), getstatic:\u74b1\u6d69\ud4fe\u4179\u8c8a\u965f(\u6d69\u4c04\ub113\u92ff\u3e75\u12b2::\u983f\u3e2a\u7e3f\u4ab3\u99f7\u7bad))
            var_3_6D = ldc:int(0)
            
            while (cmplt:boolean(var_3_6D:int, ldc:int(1500))) {
                var_4_7E = f2d:double(sub:float(mul:float(invokevirtual:float(Random::nextFloat, var_2_62:Random), ldc:float(2.0f)), ldc:float(1.0f)))
                var_6_89 = f2d:double(sub:float(mul:float(invokevirtual:float(Random::nextFloat, var_2_62:Random), ldc:float(2.0f)), ldc:float(1.0f)))
                var_8_94 = f2d:double(sub:float(mul:float(invokevirtual:float(Random::nextFloat, var_2_62:Random), ldc:float(2.0f)), ldc:float(1.0f)))
                var_10_A3 = f2d:double(add:float(ldc:float(0.15f), mul:float(invokevirtual:float(Random::nextFloat, var_2_62:Random), ldc:float(0.1f))))
                var_12_B6 = add:double(add:double(mul:double(var_4_7E:double, var_4_7E:double), mul:double(var_6_89:double, var_6_89:double)), mul:double(var_8_94:double, var_8_94:double))
                
                if (logicaland:boolean(cmplt:boolean(var_12_B6:double, ldc:double(1.0)), cmpgt:boolean(var_12_B6:double, ldc:double(0.01)))) {
                    var_12_CF = div:double(ldc:double(1.0), invokestatic:double(Math::sqrt, var_12_B6:double))
                    var_4_D6 = mul:double(var_4_7E:double, var_12_CF:double)
                    var_6_DD = mul:double(var_6_89:double, var_12_CF:double)
                    var_8_E4 = mul:double(var_8_94:double, var_12_CF:double)
                    var_14_EC = mul:double(var_4_D6:double, ldc:double(100.0))
                    var_16_F4 = mul:double(var_6_DD:double, ldc:double(100.0))
                    var_18_FC = mul:double(var_8_E4:double, ldc:double(100.0))
                    var_20_105 = invokestatic:double(Math::atan2, var_4_D6:double, var_8_E4:double)
                    var_22_10C = invokestatic:double(Math::sin, var_20_105:double)
                    var_24_113 = invokestatic:double(Math::cos, var_20_105:double)
                    var_26_128 = invokestatic:double(Math::atan2, invokestatic:double(Math::sqrt, add:double(mul:double(var_4_D6:double, var_4_D6:double), mul:double(var_8_E4:double, var_8_E4:double))), var_6_DD:double)
                    var_28_12F = invokestatic:double(Math::sin, var_26_128:double)
                    var_30_136 = invokestatic:double(Math::cos, var_26_128:double)
                    var_32_144 = mul:double(mul:double(invokevirtual:double(Random::nextDouble, var_2_62:Random), ldc:double(3.141592653589793)), ldc:double(2.0))
                    var_34_14B = invokestatic:double(Math::sin, var_32_144:double)
                    var_36_152 = invokestatic:double(Math::cos, var_32_144:double)
                    var_38_155 = ldc:int(0)
                    
                    while (cmplt:boolean(var_38_155:int, ldc:int(4))) {
                        var_41_16A = mul:double(i2d:double(sub:int(and:int(var_38_155:int, ldc:int(2)), ldc:int(1))), var_10_A3:double)
                        var_43_178 = mul:double(i2d:double(sub:int(and:int(add:int(var_38_155:int, ldc:int(1)), ldc:int(2)), ldc:int(1))), var_10_A3:double)
                        var_47_188 = sub:double(mul:double(var_41_16A:double, var_36_152:double), mul:double(var_43_178:double, var_34_14B:double))
                        var_49_195 = add:double(mul:double(var_43_178:double, var_36_152:double), mul:double(var_41_16A:double, var_34_14B:double))
                        var_51_1A1 = add:double(mul:double(var_47_188:double, var_28_12F:double), mul:double(ldc:double(0.0), var_30_136:double))
                        var_53_1AD = sub:double(mul:double(ldc:double(0.0), var_28_12F:double), mul:double(var_47_188:double, var_30_136:double))
                        invokeinterface:void(\u6b0d\uf9c5\ucfaf\ud36e\ub102::\ua61f\u0a06\u3bc9\ufe34\uc9f6\u8258, invokevirtual:\u6b0d\uf9c5\ucfaf\ud36e\ub102(\u6b0d\uf9c5\ucfaf\ud36e\ub102::\u8d90\u9255\u3bd6\u5d20\ub83f\u1187, p0:\u760c\u7ce1\u9a18\ub32d\u6d99\ub6ab[expected:\u6b0d\uf9c5\ucfaf\ud36e\ub102], add:double(var_14_EC:double, sub:double(mul:double(var_53_1AD:double, var_22_10C:double), mul:double(var_49_195:double, var_24_113:double))), add:double(var_16_F4:double, var_51_1A1:double), add:double(var_18_FC:double, add:double(mul:double(var_49_195:double, var_22_10C:double), mul:double(var_53_1AD:double, var_24_113:double)))))
                        inc:int(var_38_155, ldc:int(1))
                    }
                }
                
                inc:int(var_3_6D, ldc:int(1))
            }
            
            return:void()
        }
        
        goto(Label_0006)
    }
    
    public void \u64ab\u0a06\ucb79\u7049\u624e\ucb79(\u927d\u92ff\u71ae\uafe7\u6bb9.\u16f6\u61a4\u5db4\u4c04\u64ab\u9255 p0) {
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
            putfield:double(\u9937\u7d52\u3e75\u98a4\u8aa5\u7006::\u3c25\u1187\u97b7\ud12e\ucfaf\u5db4, this:\u9937\u7d52\u3e75\u98a4\u8aa5\u7006, ldc:double(4.9E-324))
            putfield:double(\u9937\u7d52\u3e75\u98a4\u8aa5\u7006::\u8d90\u5bc4\uc246\u8389\u5f50\uc31c, this:\u9937\u7d52\u3e75\u98a4\u8aa5\u7006, ldc:double(4.9E-324))
            putfield:double(\u9937\u7d52\u3e75\u98a4\u8aa5\u7006::\ud158\u4ab3\u93a2\u34df\ub18d\u69d9, this:\u9937\u7d52\u3e75\u98a4\u8aa5\u7006, ldc:double(4.9E-324))
            putfield:int(\u9937\u7d52\u3e75\u98a4\u8aa5\u7006::\u3bc9\ubefe\u3776\u3e2a\u98a4\u3711, this:\u9937\u7d52\u3e75\u98a4\u8aa5\u7006, ldc:int(-2147483648))
            putfield:int(\u9937\u7d52\u3e75\u98a4\u8aa5\u7006::\u99f7\u3a62\u3d4b\u98a4\ua61f\ub113, this:\u9937\u7d52\u3e75\u98a4\u8aa5\u7006, ldc:int(-2147483648))
            putfield:int(\u9937\u7d52\u3e75\u98a4\u8aa5\u7006::\u156b\u8308\u4bc8\u3504\uc3e3\u156b, this:\u9937\u7d52\u3e75\u98a4\u8aa5\u7006, ldc:int(-2147483648))
            invokevirtual:void(\u965f\u718f\u7c6b\u4cd9\u4daf\uc246::\ud217\ub83f\ube23\uc2e8\u92ff\u8d98, getfield:\u965f\u718f\u7c6b\u4cd9\u4daf\uc246(\u9937\u7d52\u3e75\u98a4\u8aa5\u7006::\u7ce1\ufe34\ua61f\u6198\u718f\u4cd9, this:\u9937\u7d52\u3e75\u98a4\u8aa5\u7006), p0:\u16f6\u61a4\u5db4\u4c04\u64ab\u9255[expected:\uf9c5\ud158\u4975\uf94d\ud523\uc31c])
            putfield:\u16f6\u61a4\u5db4\u4c04\u64ab\u9255(\u9937\u7d52\u3e75\u98a4\u8aa5\u7006::\ud51e\u9033\u8df4\u7043\u5f50\u8aa5, this:\u9937\u7d52\u3e75\u98a4\u8aa5\u7006, p0:\u16f6\u61a4\u5db4\u4c04\u64ab\u9255)
            
            if (invokestatic:boolean(\u8308\u51fa\u6c56\u5db4\ub18d\u34df::\u446c\u4975\u88c5\u3711\u9033\u3e2a)) {
                invokestatic:void(\u3711\uff55\u385b\u8aa5\u51fa\u99f7::\uf9c5\u34df\uff55\u6bb9\u4bc8\u3a62)
            }
            
            invokestatic:void(\ub70c\u0a06\ua3b4\u7c6b\u759a\u8709::\ud523\u93a2\u8d90\u71ae\u3bd6\u873d)
            invokevirtual:void(\u47c2\u74b1\u647c\u446c\u4d85\ub32d::\ud7e8\u8709\ua6bd\uafe7\u3504\u6b5f, getfield:\u47c2\u74b1\u647c\u446c\u4d85\ub32d(\u9937\u7d52\u3e75\u98a4\u8aa5\u7006::\u839e\u9a18\u4492\ubff1\uf94d\u69d9, this:\u9937\u7d52\u3e75\u98a4\u8aa5\u7006), checkcast:\u8413\u7e3f\uc910\uf94d\u5654\u6b0d(\u5245\u8aa5\u61a4\u7049\u4cd9.\u8413\u7e3f\uc910\uf94d\u5654\u6b0d.class, aconstnull:\u8413\u7e3f\uc910\uf94d\u5654\u6b0d()), checkcast:\u6b0d\ud171\uc7fe\u52d3\uafe7\u6c56(\u71f1\uc910\u3bc9\u516c\u93a2.\u6b0d\ud171\uc7fe\u52d3\uafe7\u6c56.class, aconstnull:\u6b0d\ud171\uc7fe\u52d3\uafe7\u6c56()))
            invokestatic:void(\u516c\u9a18\u600f\ud171\u946b\ubf56::\u64ab\ub102\u839e\u3dd3\u93a2\u7049, getfield:\u16f6\u61a4\u5db4\u4c04\u64ab\u9255[expected:\uf9c5\ud158\u4975\uf94d\ud523\uc31c](\u9937\u7d52\u3e75\u98a4\u8aa5\u7006::\ud51e\u9033\u8df4\u7043\u5f50\u8aa5, this:\u9937\u7d52\u3e75\u98a4\u8aa5\u7006))
            invokestatic:void(\uc238\u69d9\u92ff\ub83f\u5245\uc229::\u946b\u6c52\uc4d2\ua068\u836c\u183a, getfield:\u16f6\u61a4\u5db4\u4c04\u64ab\u9255(\u9937\u7d52\u3e75\u98a4\u8aa5\u7006::\ud51e\u9033\u8df4\u7043\u5f50\u8aa5, this:\u9937\u7d52\u3e75\u98a4\u8aa5\u7006))
            
            if (cmpne:boolean(p0:\u16f6\u61a4\u5db4\u4c04\u64ab\u9255, aconstnull:\u16f6\u61a4\u5db4\u4c04\u64ab\u9255())) {
                invokevirtual:void(\u9937\u7d52\u3e75\u98a4\u8aa5\u7006::\u76bc\ub83f\u8bb0\u69d9\u7049\u97e6, this:\u9937\u7d52\u3e75\u98a4\u8aa5\u7006)
            }
            else {
                invokeinterface:void(Set<E>::clear, getfield:Set<\u4ab3\ub1b9\u2dcc\ub8be\ube23\uc910>(\u9937\u7d52\u3e75\u98a4\u8aa5\u7006::\ub70c\ud4fe\u7e3f\ud36e\u59ec\u946b, this:\u9937\u7d52\u3e75\u98a4\u8aa5\u7006))
                invokeinterface:void(Set<E>::clear, getfield:Set<\u4ab3\ub1b9\u2dcc\ub8be\ube23\uc910>(\u9937\u7d52\u3e75\u98a4\u8aa5\u7006::\u6cfe\u6c52\uafe7\u3c25\uc910\u4e72, this:\u9937\u7d52\u3e75\u98a4\u8aa5\u7006))
                invokespecial:void(\u9937\u7d52\u3e75\u98a4\u8aa5\u7006::\u7ce1\u4975\u385b\uc84e\u8640\u416d, this:\u9937\u7d52\u3e75\u98a4\u8aa5\u7006)
                
                if (cmpne:boolean(getfield:\u61a4\u946b\u4daf\uc2e8\uc4d2\u5140(\u9937\u7d52\u3e75\u98a4\u8aa5\u7006::\u6b5f\u071d\u8640\uc84e\u7bad\u071d, this:\u9937\u7d52\u3e75\u98a4\u8aa5\u7006), aconstnull:\u61a4\u946b\u4daf\uc2e8\uc4d2\u5140())) {
                    invokevirtual:void(\u61a4\u946b\u4daf\uc2e8\uc4d2\u5140::\u9af2\u8df4\u99f7\u3504\uae87\u9a18, getfield:\u61a4\u946b\u4daf\uc2e8\uc4d2\u5140(\u9937\u7d52\u3e75\u98a4\u8aa5\u7006::\u6b5f\u071d\u8640\uc84e\u7bad\u071d, this:\u9937\u7d52\u3e75\u98a4\u8aa5\u7006))
                    putfield:\u61a4\u946b\u4daf\uc2e8\uc4d2\u5140(\u9937\u7d52\u3e75\u98a4\u8aa5\u7006::\u6b5f\u071d\u8640\uc84e\u7bad\u071d, this:\u9937\u7d52\u3e75\u98a4\u8aa5\u7006, aconstnull:\u61a4\u946b\u4daf\uc2e8\uc4d2\u5140())
                }
                
                if (cmpne:boolean(getfield:\u56bd\u392e\u7873\u7043\ud158\u9255(\u9937\u7d52\u3e75\u98a4\u8aa5\u7006::\ud4fe\u34df\u8cae\u97e6\u51b2\u67d0, this:\u9937\u7d52\u3e75\u98a4\u8aa5\u7006), aconstnull:\u56bd\u392e\u7873\u7043\ud158\u9255())) {
                    invokevirtual:void(\u56bd\u392e\u7873\u7043\ud158\u9255::\u40a9\u7006\uf995\u7043\u7330\u873d, getfield:\u56bd\u392e\u7873\u7043\ud158\u9255(\u9937\u7d52\u3e75\u98a4\u8aa5\u7006::\ud4fe\u34df\u8cae\u97e6\u51b2\u67d0, this:\u9937\u7d52\u3e75\u98a4\u8aa5\u7006))
                }
                
                putfield:\u56bd\u392e\u7873\u7043\ud158\u9255(\u9937\u7d52\u3e75\u98a4\u8aa5\u7006::\ud4fe\u34df\u8cae\u97e6\u51b2\u67d0, this:\u9937\u7d52\u3e75\u98a4\u8aa5\u7006, aconstnull:\u56bd\u392e\u7873\u7043\ud158\u9255())
                invokeinterface:void(Set<E>::clear, getfield:Set<\ub83f\uc9f6\u47c2\u67d0\u7ce1>(\u9937\u7d52\u3e75\u98a4\u8aa5\u7006::\uc4d2\u8df4\ub83f\u946b\u34df\u6198, this:\u9937\u7d52\u3e75\u98a4\u8aa5\u7006))
            }
            
            return:void()
        }
        
        goto(Label_0006)
    }
    
    public void \u76bc\ub83f\u8bb0\u69d9\u7049\u97e6() {
        var_1_15C : \u7d52\u718f\u3776\u6fb0\ub83f
        
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
            
            if (cmpne:boolean(getfield:\u16f6\u61a4\u5db4\u4c04\u64ab\u9255(\u9937\u7d52\u3e75\u98a4\u8aa5\u7006::\ud51e\u9033\u8df4\u7043\u5f50\u8aa5, this:\u9937\u7d52\u3e75\u98a4\u8aa5\u7006), aconstnull:\u16f6\u61a4\u5db4\u4c04\u64ab\u9255())) {
                if (invokestatic:boolean(\u67e9\u4daf\u760c\ud217\ua6bd\ubff1::\u92ff\u183a\u93a2\uc3e3\u873d\u67e9)) {
                    invokespecial:void(\u9937\u7d52\u3e75\u98a4\u8aa5\u7006::\u56bd\u873d\u6b0d\ua6bd\ub171\u7d52, this:\u9937\u7d52\u3e75\u98a4\u8aa5\u7006)
                }
                else {
                    invokespecial:void(\u9937\u7d52\u3e75\u98a4\u8aa5\u7006::\u3776\u7d52\u3504\u8640\u1833\ud12e, this:\u9937\u7d52\u3e75\u98a4\u8aa5\u7006)
                }
                
                invokevirtual:void(\u16f6\u61a4\u5db4\u4c04\u64ab\u9255::\u3dd3\u16f6\u7ce1\u3dd3\u3d4b\u47c2, getfield:\u16f6\u61a4\u5db4\u4c04\u64ab\u9255(\u9937\u7d52\u3e75\u98a4\u8aa5\u7006::\ud51e\u9033\u8df4\u7043\u5f50\u8aa5, this:\u9937\u7d52\u3e75\u98a4\u8aa5\u7006))
                
                if (cmpeq:boolean(getfield:\u56bd\u392e\u7873\u7043\ud158\u9255(\u9937\u7d52\u3e75\u98a4\u8aa5\u7006::\ud4fe\u34df\u8cae\u97e6\u51b2\u67d0, this:\u9937\u7d52\u3e75\u98a4\u8aa5\u7006), aconstnull:\u56bd\u392e\u7873\u7043\ud158\u9255())) {
                    putfield:\u56bd\u392e\u7873\u7043\ud158\u9255(\u9937\u7d52\u3e75\u98a4\u8aa5\u7006::\ud4fe\u34df\u8cae\u97e6\u51b2\u67d0, this:\u9937\u7d52\u3e75\u98a4\u8aa5\u7006, initobject:\u56bd\u392e\u7873\u7043\ud158\u9255(\u56bd\u392e\u7873\u7043\ud158\u9255::<init>, getfield:\u16f6\u61a4\u5db4\u4c04\u64ab\u9255[expected:\uf9c5\ud158\u4975\uf94d\ud523\uc31c](\u9937\u7d52\u3e75\u98a4\u8aa5\u7006::\ud51e\u9033\u8df4\u7043\u5f50\u8aa5, this:\u9937\u7d52\u3e75\u98a4\u8aa5\u7006), this:\u9937\u7d52\u3e75\u98a4\u8aa5\u7006, invokestatic:Executor(\ud217\u3504\u760c\uc29a\u97e6\ube23::\u760c\uceb8\ub32d\ub113\u120d\u4ab3), invokevirtual:boolean(\u67e9\u4daf\u760c\ud217\ua6bd\ubff1::\u52d3\u3bd6\ub7dc\u5bc4\u92ee\u7049, getfield:\u67e9\u4daf\u760c\ud217\ua6bd\ubff1(\u9937\u7d52\u3e75\u98a4\u8aa5\u7006::\u8df4\u3776\ud171\u7006\u51b2\uf995, this:\u9937\u7d52\u3e75\u98a4\u8aa5\u7006)), invokevirtual:\u4bc8\u6198\uc9f6\u5245\u6435\ub32d(\uafe7\uc2e8\u8389\ufcaf\ub19c\u51b2::\u759a\u1833\ubcb0\uc229\u6435\ud158, getfield:\uafe7\uc2e8\u8389\ufcaf\ub19c\u51b2(\u9937\u7d52\u3e75\u98a4\u8aa5\u7006::\u3776\u8308\u12b2\uf9c5\ucfaf\ua3b4, this:\u9937\u7d52\u3e75\u98a4\u8aa5\u7006))))
                }
                else {
                    invokevirtual:void(\u56bd\u392e\u7873\u7043\ud158\u9255::\u51fa\u4975\uc9f6\u92ee\u8258\u9a18, getfield:\u56bd\u392e\u7873\u7043\ud158\u9255(\u9937\u7d52\u3e75\u98a4\u8aa5\u7006::\ud4fe\u34df\u8cae\u97e6\u51b2\u67d0, this:\u9937\u7d52\u3e75\u98a4\u8aa5\u7006), getfield:\u16f6\u61a4\u5db4\u4c04\u64ab\u9255[expected:\uf9c5\ud158\u4975\uf94d\ud523\uc31c](\u9937\u7d52\u3e75\u98a4\u8aa5\u7006::\ud51e\u9033\u8df4\u7043\u5f50\u8aa5, this:\u9937\u7d52\u3e75\u98a4\u8aa5\u7006))
                }
                
                putfield:boolean(\u9937\u7d52\u3e75\u98a4\u8aa5\u7006::\uceb8\u88c5\u51b2\u6fb0\uf995\u7c6b, this:\u9937\u7d52\u3e75\u98a4\u8aa5\u7006, ldc:boolean(1))
                putfield:boolean(\u9937\u7d52\u3e75\u98a4\u8aa5\u7006::\u392e\u4cd9\u8df4\u624e\u51b2\u69d9, this:\u9937\u7d52\u3e75\u98a4\u8aa5\u7006, ldc:boolean(1))
                invokestatic:void(\u3bc9\ucfaf\u718f\u0800\u960f\u3a62::\u6d69\ucb79\u6b5f\ub102\ucef1\u760c, invokestatic:boolean(\u8308\u51fa\u6c56\u5db4\ub18d\u34df::\u64f2\u7ce1\ub19c\u1833\u5f50\u6bb9))
                invokestatic:void(\u99f7\u718f\u4179\ubff1\ua562\u6d99::\u47c2\u8c8a\u6b0d\u3711\u98a4\u67d0)
                
                if (invokestatic:boolean(\u8308\u51fa\u6c56\u5db4\ub18d\u34df::\u446c\u4975\u88c5\u3711\u9033\u3e2a)) {
                    invokestatic:void(\u3711\uff55\u385b\u8aa5\u51fa\u99f7::\uf9c5\u34df\uff55\u6bb9\u4bc8\u3a62)
                }
                
                invokestatic:void(\u5fe1\u946b\u97b7\u67d0\u446c\ufcaf::\u9937\u836c\uf94d\uc87f\uafe7\uf995)
                putstatic:boolean(\u9937\u7d52\u3e75\u98a4\u8aa5\u7006::\u16f6\u446c\u4bc8\u6cfe\u4bc8\u9af2, invokestatic:boolean(\u67e9\u4daf\u760c\ud217\ua6bd\ubff1::\u6198\u0c95\ubb2b\u8cae\u5f50\u4daf))
                putfield:int(\u9937\u7d52\u3e75\u98a4\u8aa5\u7006::\u98a4\u600f\u4f4a\ub70c\ud523\u4e72, this:\u9937\u7d52\u3e75\u98a4\u8aa5\u7006, getfield:int(\u4daf\u8df4\ubb2b\u759a\u7330\u4ab3::\uf995\u59ec\ucef1\u5bc4\ub19c\ud36e, getfield:\u4daf\u8df4\ubb2b\u759a\u7330\u4ab3(\u67e9\u4daf\u760c\ud217\ua6bd\ubff1::\uc84e\u4c04\ubcb0\u0c95\ub8be\u5fe1, getfield:\u67e9\u4daf\u760c\ud217\ua6bd\ubff1(\u9937\u7d52\u3e75\u98a4\u8aa5\u7006::\u8df4\u3776\ud171\u7006\u51b2\uf995, this:\u9937\u7d52\u3e75\u98a4\u8aa5\u7006))))
                putfield:int(\u9937\u7d52\u3e75\u98a4\u8aa5\u7006::\u8bb0\ub19c\u8350\uc2bd\u69d9\u7043, this:\u9937\u7d52\u3e75\u98a4\u8aa5\u7006, mul:int(getfield:int(\u9937\u7d52\u3e75\u98a4\u8aa5\u7006::\u98a4\u600f\u4f4a\ub70c\ud523\u4e72, this:\u9937\u7d52\u3e75\u98a4\u8aa5\u7006), ldc:int(16)))
                putfield:int(\u9937\u7d52\u3e75\u98a4\u8aa5\u7006::\u4daf\u3d4b\u3bc9\u7d52\ufe34\ucef1, this:\u9937\u7d52\u3e75\u98a4\u8aa5\u7006, mul:int(getfield:int(\u9937\u7d52\u3e75\u98a4\u8aa5\u7006::\u8bb0\ub19c\u8350\uc2bd\u69d9\u7043, this:\u9937\u7d52\u3e75\u98a4\u8aa5\u7006), getfield:int(\u9937\u7d52\u3e75\u98a4\u8aa5\u7006::\u8bb0\ub19c\u8350\uc2bd\u69d9\u7043, this:\u9937\u7d52\u3e75\u98a4\u8aa5\u7006)))
                invokespecial:void(\u9937\u7d52\u3e75\u98a4\u8aa5\u7006::\ud523\ubff1\ubff1\ub8be\u120d\u927d, this:\u9937\u7d52\u3e75\u98a4\u8aa5\u7006)
                invokespecial:void(\u9937\u7d52\u3e75\u98a4\u8aa5\u7006::\u8d98\ucb79\ubf56\u92ff\ub7dc\u8389, this:\u9937\u7d52\u3e75\u98a4\u8aa5\u7006)
                invokespecial:void(\u9937\u7d52\u3e75\u98a4\u8aa5\u7006::\ube23\u5db4\uafe7\uc910\u4d85\u7049, this:\u9937\u7d52\u3e75\u98a4\u8aa5\u7006)
                
                if (cmpne:boolean(getfield:\u61a4\u946b\u4daf\uc2e8\uc4d2\u5140(\u9937\u7d52\u3e75\u98a4\u8aa5\u7006::\u6b5f\u071d\u8640\uc84e\u7bad\u071d, this:\u9937\u7d52\u3e75\u98a4\u8aa5\u7006), aconstnull:\u61a4\u946b\u4daf\uc2e8\uc4d2\u5140())) {
                    invokevirtual:void(\u61a4\u946b\u4daf\uc2e8\uc4d2\u5140::\u9af2\u8df4\u99f7\u3504\uae87\u9a18, getfield:\u61a4\u946b\u4daf\uc2e8\uc4d2\u5140(\u9937\u7d52\u3e75\u98a4\u8aa5\u7006::\u6b5f\u071d\u8640\uc84e\u7bad\u071d, this:\u9937\u7d52\u3e75\u98a4\u8aa5\u7006))
                }
                
                invokevirtual:void(\u9937\u7d52\u3e75\u98a4\u8aa5\u7006::\ud217\u64f2\ub1b9\u1187\u4179\ub102, this:\u9937\u7d52\u3e75\u98a4\u8aa5\u7006)
                monitorenter(getfield:Set<\ub83f\uc9f6\u47c2\u67d0\u7ce1>(\u9937\u7d52\u3e75\u98a4\u8aa5\u7006::\uc4d2\u8df4\ub83f\u946b\u34df\u6198, this:\u9937\u7d52\u3e75\u98a4\u8aa5\u7006))
                
                try {
                    invokeinterface:void(Set<E>::clear, getfield:Set<\ub83f\uc9f6\u47c2\u67d0\u7ce1>(\u9937\u7d52\u3e75\u98a4\u8aa5\u7006::\uc4d2\u8df4\ub83f\u946b\u34df\u6198, this:\u9937\u7d52\u3e75\u98a4\u8aa5\u7006))
                }
                finally {
                    monitorexit(getfield:Set<\ub83f\uc9f6\u47c2\u67d0\u7ce1>(\u9937\u7d52\u3e75\u98a4\u8aa5\u7006::\uc4d2\u8df4\ub83f\u946b\u34df\u6198, this:\u9937\u7d52\u3e75\u98a4\u8aa5\u7006))
                }
                
                putfield:\u61a4\u946b\u4daf\uc2e8\uc4d2\u5140(\u9937\u7d52\u3e75\u98a4\u8aa5\u7006::\u6b5f\u071d\u8640\uc84e\u7bad\u071d, this:\u9937\u7d52\u3e75\u98a4\u8aa5\u7006, initobject:\u61a4\u946b\u4daf\uc2e8\uc4d2\u5140(\u61a4\u946b\u4daf\uc2e8\uc4d2\u5140::<init>, getfield:\u56bd\u392e\u7873\u7043\ud158\u9255(\u9937\u7d52\u3e75\u98a4\u8aa5\u7006::\ud4fe\u34df\u8cae\u97e6\u51b2\u67d0, this:\u9937\u7d52\u3e75\u98a4\u8aa5\u7006), getfield:\u16f6\u61a4\u5db4\u4c04\u64ab\u9255[expected:\uf9c5\ud158\u4975\uf94d\ud523\uc31c](\u9937\u7d52\u3e75\u98a4\u8aa5\u7006::\ud51e\u9033\u8df4\u7043\u5f50\u8aa5, this:\u9937\u7d52\u3e75\u98a4\u8aa5\u7006), getfield:int(\u4daf\u8df4\ubb2b\u759a\u7330\u4ab3::\uf995\u59ec\ucef1\u5bc4\ub19c\ud36e, getfield:\u4daf\u8df4\ubb2b\u759a\u7330\u4ab3(\u67e9\u4daf\u760c\ud217\ua6bd\ubff1::\uc84e\u4c04\ubcb0\u0c95\ub8be\u5fe1, getfield:\u67e9\u4daf\u760c\ud217\ua6bd\ubff1(\u9937\u7d52\u3e75\u98a4\u8aa5\u7006::\u8df4\u3776\ud171\u7006\u51b2\uf995, this:\u9937\u7d52\u3e75\u98a4\u8aa5\u7006))), this:\u9937\u7d52\u3e75\u98a4\u8aa5\u7006))
                
                if (cmpne:boolean(getfield:\u16f6\u61a4\u5db4\u4c04\u64ab\u9255(\u9937\u7d52\u3e75\u98a4\u8aa5\u7006::\ud51e\u9033\u8df4\u7043\u5f50\u8aa5, this:\u9937\u7d52\u3e75\u98a4\u8aa5\u7006), aconstnull:\u16f6\u61a4\u5db4\u4c04\u64ab\u9255())) {
                    var_1_15C = invokevirtual:\u7d52\u718f\u3776\u6fb0\ub83f(\u67e9\u4daf\u760c\ud217\ua6bd\ubff1::\u983f\uc229\u8aa5\u873d\u0b8e\u4975, getfield:\u67e9\u4daf\u760c\ud217\ua6bd\ubff1(\u9937\u7d52\u3e75\u98a4\u8aa5\u7006::\u8df4\u3776\ud171\u7006\u51b2\uf995, this:\u9937\u7d52\u3e75\u98a4\u8aa5\u7006))
                    
                    if (cmpne:boolean(var_1_15C:\u7d52\u718f\u3776\u6fb0\ub83f, aconstnull:\u7d52\u718f\u3776\u6fb0\ub83f())) {
                        invokevirtual:void(\u61a4\u946b\u4daf\uc2e8\uc4d2\u5140::\u8640\u120d\u6ec6\uc2bd\u36d3\u3d64, getfield:\u61a4\u946b\u4daf\uc2e8\uc4d2\u5140(\u9937\u7d52\u3e75\u98a4\u8aa5\u7006::\u6b5f\u071d\u8640\uc84e\u7bad\u071d, this:\u9937\u7d52\u3e75\u98a4\u8aa5\u7006), invokevirtual:double(\u7d52\u718f\u3776\u6fb0\ub83f::\ub8be\u8d98\u34df\u12b2\u071d\u12b2, var_1_15C:\u7d52\u718f\u3776\u6fb0\ub83f), invokevirtual:double(\u7d52\u718f\u3776\u6fb0\ub83f::\ubcb0\ub83f\u92ff\u946b\u7ce1\u8df4, var_1_15C:\u7d52\u718f\u3776\u6fb0\ub83f))
                    }
                }
            }
            
            if (cmpeq:boolean(getfield:\uf995\u72f1\u8389\ucb79\ub6ab\u8d98(\u67e9\u4daf\u760c\ud217\ua6bd\ubff1::\ud12e\u5245\ud51e\u3d64\u8bb0\u647c, getfield:\u67e9\u4daf\u760c\ud217\ua6bd\ubff1(\u9937\u7d52\u3e75\u98a4\u8aa5\u7006::\u8df4\u3776\ud171\u7006\u51b2\uf995, this:\u9937\u7d52\u3e75\u98a4\u8aa5\u7006)), aconstnull:\uf995\u72f1\u8389\ucb79\ub6ab\u8d98())) {
                putfield:boolean(\u9937\u7d52\u3e75\u98a4\u8aa5\u7006::\ub171\u385b\u8258\u16f6\u836c\u7ce1, this:\u9937\u7d52\u3e75\u98a4\u8aa5\u7006, ldc:boolean(1))
            }
            
            return:void()
        }
        
        goto(Label_0006)
    }
    
    public void \ud217\u64f2\ub1b9\u1187\u4179\ub102() {
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
            invokeinterface:void(Set<E>::clear, getfield:Set<\u4ab3\ub1b9\u2dcc\ub8be\ube23\uc910>(\u9937\u7d52\u3e75\u98a4\u8aa5\u7006::\ub70c\ud4fe\u7e3f\ud36e\u59ec\u946b, this:\u9937\u7d52\u3e75\u98a4\u8aa5\u7006))
            invokevirtual:void(\u56bd\u392e\u7873\u7043\ud158\u9255::\u494c\u6c56\u5f50\u4d85\u6cfe\u12cb, getfield:\u56bd\u392e\u7873\u7043\ud158\u9255(\u9937\u7d52\u3e75\u98a4\u8aa5\u7006::\ud4fe\u34df\u8cae\u97e6\u51b2\u67d0, this:\u9937\u7d52\u3e75\u98a4\u8aa5\u7006))
            return:void()
        }
        
        goto(Label_0006)
    }
    
    public void \u9255\u93a2\uc31c\ucef1\u516c\u6cfe(int p0, int p1) {
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
            invokevirtual:void(\u9937\u7d52\u3e75\u98a4\u8aa5\u7006::\ud36e\u385b\ub8be\u718f\u6c52\ub8be, this:\u9937\u7d52\u3e75\u98a4\u8aa5\u7006)
            
            if (cmpne:boolean(getfield:\u4ab3\uf995\u3e75\u8bb0\uc31c\u5654(\u9937\u7d52\u3e75\u98a4\u8aa5\u7006::\u927d\ub83f\u718f\ud51e\u1833\ub113, this:\u9937\u7d52\u3e75\u98a4\u8aa5\u7006), aconstnull:\u4ab3\uf995\u3e75\u8bb0\uc31c\u5654())) {
                invokevirtual:void(\u4ab3\uf995\u3e75\u8bb0\uc31c\u5654::\uc910\u385b\ub70c\uafe7\u0800\u5fe1, getfield:\u4ab3\uf995\u3e75\u8bb0\uc31c\u5654(\u9937\u7d52\u3e75\u98a4\u8aa5\u7006::\u927d\ub83f\u718f\ud51e\u1833\ub113, this:\u9937\u7d52\u3e75\u98a4\u8aa5\u7006), p0:int, p1:int)
            }
            
            if (cmpne:boolean(getfield:\u4ab3\uf995\u3e75\u8bb0\uc31c\u5654(\u9937\u7d52\u3e75\u98a4\u8aa5\u7006::\u8350\u12b2\ua61f\u8389\u6c52\u5fe1, this:\u9937\u7d52\u3e75\u98a4\u8aa5\u7006), aconstnull:\u4ab3\uf995\u3e75\u8bb0\uc31c\u5654())) {
                invokevirtual:void(\u4ab3\uf995\u3e75\u8bb0\uc31c\u5654::\uc910\u385b\ub70c\uafe7\u0800\u5fe1, getfield:\u4ab3\uf995\u3e75\u8bb0\uc31c\u5654(\u9937\u7d52\u3e75\u98a4\u8aa5\u7006::\u8350\u12b2\ua61f\u8389\u6c52\u5fe1, this:\u9937\u7d52\u3e75\u98a4\u8aa5\u7006), p0:int, p1:int)
            }
            
            return:void()
        }
        
        goto(Label_0006)
    }
    
    public java.lang.String \ufe34\u600f\ub19c\u98a4\uc910\u494c() {
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
            return:String(invokestatic:String(String::format, loadelement:String(getstatic:String[](\u9937\u7d52\u3e75\u98a4\u8aa5\u7006::\ub8be\ud171\u8c8a\ub1b9\u76bc\u5bc4), ldc:int(14)), initarray:Object[](java.lang.Object[].class, invokestatic:Integer[expected:Object](Integer::valueOf, invokevirtual:int(\u9937\u7d52\u3e75\u98a4\u8aa5\u7006::\u0800\u1833\u624e\uc238\u67d0\u9af2, this:\u9937\u7d52\u3e75\u98a4\u8aa5\u7006)), invokestatic:Integer[expected:Object](Integer::valueOf, arraylength:int(getfield:\u4ab3\ub1b9\u2dcc\ub8be\ube23\uc910[](\u61a4\u946b\u4daf\uc2e8\uc4d2\u5140::\uf9c5\u62da\ub19c\u8753\u92ee\u8c8a, getfield:\u61a4\u946b\u4daf\uc2e8\uc4d2\u5140(\u9937\u7d52\u3e75\u98a4\u8aa5\u7006::\u6b5f\u071d\u8640\uc84e\u7bad\u071d, this:\u9937\u7d52\u3e75\u98a4\u8aa5\u7006)))), ternaryop:String[expected:Object](getfield:boolean(\u67e9\u4daf\u760c\ud217\ua6bd\ubff1::\u7af6\u67d0\ub113\u4daf\u12b2\ufcaf, getfield:\u67e9\u4daf\u760c\ud217\ua6bd\ubff1(\u9937\u7d52\u3e75\u98a4\u8aa5\u7006::\u8df4\u3776\ud171\u7006\u51b2\uf995, this:\u9937\u7d52\u3e75\u98a4\u8aa5\u7006)), loadelement:String(getstatic:String[](\u9937\u7d52\u3e75\u98a4\u8aa5\u7006::\ub8be\ud171\u8c8a\ub1b9\u76bc\u5bc4), ldc:int(15)), loadelement:String(getstatic:String[](\u9937\u7d52\u3e75\u98a4\u8aa5\u7006::\ub8be\ud171\u8c8a\ub1b9\u76bc\u5bc4), ldc:int(16))), invokestatic:Integer[expected:Object](Integer::valueOf, getfield:int(\u9937\u7d52\u3e75\u98a4\u8aa5\u7006::\u98a4\u600f\u4f4a\ub70c\ud523\u4e72, this:\u9937\u7d52\u3e75\u98a4\u8aa5\u7006)), ternaryop:String[expected:Object](cmpeq:boolean(getfield:\u56bd\u392e\u7873\u7043\ud158\u9255(\u9937\u7d52\u3e75\u98a4\u8aa5\u7006::\ud4fe\u34df\u8cae\u97e6\u51b2\u67d0, this:\u9937\u7d52\u3e75\u98a4\u8aa5\u7006), aconstnull:\u56bd\u392e\u7873\u7043\ud158\u9255()), loadelement:String(getstatic:String[](\u9937\u7d52\u3e75\u98a4\u8aa5\u7006::\ub8be\ud171\u8c8a\ub1b9\u76bc\u5bc4), ldc:int(17)), invokevirtual:String(\u56bd\u392e\u7873\u7043\ud158\u9255::\uc3e3\ua61f\uf94d\u3e2a\u3bd6\u6b5f, getfield:\u56bd\u392e\u7873\u7043\ud158\u9255(\u9937\u7d52\u3e75\u98a4\u8aa5\u7006::\ud4fe\u34df\u8cae\u97e6\u51b2\u67d0, this:\u9937\u7d52\u3e75\u98a4\u8aa5\u7006))))))
        }
        
        goto(Label_0006)
    }
    
    public int \u0800\u1833\u624e\uc238\u67d0\u9af2() {
        var_1_59 : int
        var_2_63 : ObjectListIterator
        
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
            var_1_59 = ldc:int(0)
            var_2_63 = invokeinterface:ObjectListIterator(ObjectList::iterator, getfield:ObjectList<\u61a4\u7873\u12b2\u760c\u67e9\u4492>(\u9937\u7d52\u3e75\u98a4\u8aa5\u7006::\u92ee\u3dd3\ud7e8\u9a18\u8350\uafe7, this:\u9937\u7d52\u3e75\u98a4\u8aa5\u7006))
            
            while (invokeinterface:boolean(Iterator::hasNext, var_2_63:ObjectListIterator)) {
                if (logicalnot:boolean(invokevirtual:boolean(\u6fb0\u494c\u3bd6\u0c95\u4cd9\ufcaf::\u4f4a\ua068\u71f1\ucfaf\u8aa5\u52d3, invokevirtual:\u6fb0\u494c\u3bd6\u0c95\u4cd9\ufcaf(\u4ab3\ub1b9\u2dcc\ub8be\ube23\uc910::\u4d85\u8c8a\uc2e8\u34df\u62da\u6ec6, getfield:\u4ab3\ub1b9\u2dcc\ub8be\ube23\uc910(\u61a4\u7873\u12b2\u760c\u67e9\u4492::\u40a9\u9255\ua6bd\u0800\u6b5f\u7043, checkcast:\u61a4\u7873\u12b2\u760c\u67e9\u4492(\u59ec\u8413\u97e6\uc229\u3776.\u61a4\u7873\u12b2\u760c\u67e9\u4492.class, invokeinterface:\u61a4\u7873\u12b2\u760c\u67e9\u4492(Iterator<\u61a4\u7873\u12b2\u760c\u67e9\u4492>::next, var_2_63:Iterator<\u61a4\u7873\u12b2\u760c\u67e9\u4492>))))))) {
                    inc:int(var_1_59, ldc:int(1))
                }
            }
            
            return:int(var_1_59:int)
        }
        
        goto(Label_0006)
    }
    
    public java.lang.String \u8640\u8d90\ub32d\u6fb0\ud12e\u5db4() {
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
            return:String(invokevirtual:String(StringBuilder::toString, invokevirtual:StringBuilder(StringBuilder::append, invokevirtual:StringBuilder(StringBuilder::append, invokevirtual:StringBuilder(StringBuilder::append, invokevirtual:StringBuilder(StringBuilder::append, invokevirtual:StringBuilder(StringBuilder::append, invokevirtual:StringBuilder(StringBuilder::append, invokevirtual:StringBuilder(StringBuilder::append, invokevirtual:StringBuilder(StringBuilder::append, initobject:StringBuilder(StringBuilder::<init>), loadelement:String(getstatic:String[](\u9937\u7d52\u3e75\u98a4\u8aa5\u7006::\ub8be\ud171\u8c8a\ub1b9\u76bc\u5bc4), ldc:int(18))), getfield:int(\u9937\u7d52\u3e75\u98a4\u8aa5\u7006::\u3e75\u516c\u3bc9\u36d3\uc29a\u8258, this:\u9937\u7d52\u3e75\u98a4\u8aa5\u7006)), loadelement:String(getstatic:String[](\u9937\u7d52\u3e75\u98a4\u8aa5\u7006::\ub8be\ud171\u8c8a\ub1b9\u76bc\u5bc4), ldc:int(19))), invokevirtual:int(\u16f6\u61a4\u5db4\u4c04\u64ab\u9255::\ubded\u836c\u59ec\u4c04\u4cd9\uc4d2, getfield:\u16f6\u61a4\u5db4\u4c04\u64ab\u9255(\u9937\u7d52\u3e75\u98a4\u8aa5\u7006::\ud51e\u9033\u8df4\u7043\u5f50\u8aa5, this:\u9937\u7d52\u3e75\u98a4\u8aa5\u7006))), loadelement:String(getstatic:String[](\u9937\u7d52\u3e75\u98a4\u8aa5\u7006::\ub8be\ud171\u8c8a\ub1b9\u76bc\u5bc4), ldc:int(20))), getfield:int(\u9937\u7d52\u3e75\u98a4\u8aa5\u7006::\u62da\ubf56\ud171\ubefe\u071d\uceb8, this:\u9937\u7d52\u3e75\u98a4\u8aa5\u7006)), loadelement:String(getstatic:String[](\u9937\u7d52\u3e75\u98a4\u8aa5\u7006::\ub8be\ud171\u8c8a\ub1b9\u76bc\u5bc4), ldc:int(21))), invokestatic:String(\u8308\u51fa\u6c56\u5db4\ub18d\u34df::\u9937\u71f1\u5d20\u0a06\ud217\u8709))))
        }
        
        goto(Label_0006)
    }
    
    public void \u873d\uc31c\u8bb0\u446c\uc87f\u759a(\u3504\ufe34\u600f\u6b0d\u69d9.\u836c\u8cae\ub18d\u836c\u8753\u59ec p0, \u59ec\u8413\u97e6\uc229\u3776.\ub102\u5654\u8413\u3e75\u416d\u8640 p1, boolean p2, int p3, boolean p4) {
        // java.lang.IllegalStateException: Unsupported node type: com.strobel.decompiler.ast.Lambda
        //     at com.strobel.decompiler.ast.Error.unsupportedNode(Error.java:32)
        //     at com.strobel.decompiler.ast.GotoRemoval.exit(GotoRemoval.java:612)
        //     at com.strobel.decompiler.ast.GotoRemoval.exit(GotoRemoval.java:586)
        //     at com.strobel.decompiler.ast.GotoRemoval.exit(GotoRemoval.java:590)
        //     at com.strobel.decompiler.ast.GotoRemoval.exit(GotoRemoval.java:586)
        //     at com.strobel.decompiler.ast.GotoRemoval.transformLeaveStatements(GotoRemoval.java:625)
        //     at com.strobel.decompiler.ast.GotoRemoval.removeGotosCore(GotoRemoval.java:57)
        //     at com.strobel.decompiler.ast.GotoRemoval.removeGotos(GotoRemoval.java:53)
        //     at com.strobel.decompiler.ast.AstOptimizer.optimize(AstOptimizer.java:276)
        //     at com.strobel.decompiler.languages.BytecodeAstLanguage.decompileMethod(BytecodeAstLanguage.java:139)
        //     at com.strobel.decompiler.languages.BytecodeAstLanguage.decompileType(BytecodeAstLanguage.java:90)
        //     at com.strobel.decompiler.DecompilerDriver.decompileType(DecompilerDriver.java:336)
        //     at com.strobel.decompiler.DecompilerDriver.decompileJar(DecompilerDriver.java:257)
        //     at com.strobel.decompiler.DecompilerDriver.main(DecompilerDriver.java:141)
    }
    
    private \ub113\uc4d2\u183a\u527a\u6435.\u4ab3\ub1b9\u2dcc\ub8be\ube23\uc910 \u8640\u5654\ubb2b\u5d20\u446c\u97b7(\u71f1\uc910\u3bc9\u516c\u93a2.\u6b0d\ud171\uc7fe\u52d3\uafe7\u6c56 p0, \ub113\uc4d2\u183a\u527a\u6435.\u4ab3\ub1b9\u2dcc\ub8be\ube23\uc910 p1, \u927d\u92ff\u71ae\uafe7\u6bb9.\u760c\u4975\u4179\uc246\u8640\u64f2 p2, boolean p3, int p4) {
        var_6_5D : \u4ab3\ub1b9\u2dcc\ub8be\ube23\uc910
        var_7_7F : \u6b0d\ud171\uc7fe\u52d3\uafe7\u6c56
        var_8_8B : int
        var_9_97 : int
        
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
        var_6_5D = invokevirtual:\u4ab3\ub1b9\u2dcc\ub8be\ube23\uc910(\u4ab3\ub1b9\u2dcc\ub8be\ube23\uc910::\u62da\ucef1\u3a62\u071d\u9937\u7af6, p1:\u4ab3\ub1b9\u2dcc\ub8be\ube23\uc910, p2:\u760c\u4975\u4179\uc246\u8640\u64f2)
        
        if (cmpeq:boolean(var_6_5D:\u4ab3\ub1b9\u2dcc\ub8be\ube23\uc910, aconstnull:\u4ab3\ub1b9\u2dcc\ub8be\ube23\uc910())) {
            return:\u4ab3\ub1b9\u2dcc\ub8be\ube23\uc910(aconstnull:\u4ab3\ub1b9\u2dcc\ub8be\ube23\uc910())
        }
        
        if (cmpgt:boolean(invokevirtual:int(\u3a62\uc9f6\u3776\u4f52\ua068\u34df::\u9af2\u8350\u8350\u93a2\u494c\u624e, invokevirtual:\u6b0d\ud171\uc7fe\u52d3\uafe7\u6c56(\u4ab3\ub1b9\u2dcc\ub8be\ube23\uc910::\u7d52\ub32d\u7e3f\ubefe\u40a9\u67d0, var_6_5D:\u4ab3\ub1b9\u2dcc\ub8be\ube23\uc910)), p4:int)) {
            return:\u4ab3\ub1b9\u2dcc\ub8be\ube23\uc910(aconstnull:\u4ab3\ub1b9\u2dcc\ub8be\ube23\uc910())
        }
        
        if (p3:boolean) {
            var_7_7F = invokevirtual:\u6b0d\ud171\uc7fe\u52d3\uafe7\u6c56(\u4ab3\ub1b9\u2dcc\ub8be\ube23\uc910::\u7d52\ub32d\u7e3f\ubefe\u40a9\u67d0, var_6_5D:\u4ab3\ub1b9\u2dcc\ub8be\ube23\uc910)
            var_8_8B = sub:int(invokevirtual:int(\u3a62\uc9f6\u3776\u4f52\ua068\u34df::\u8aa5\u97b7\u4daf\u72f1\u600f\u8cae, p0:\u6b0d\ud171\uc7fe\u52d3\uafe7\u6c56[expected:\u3a62\uc9f6\u3776\u4f52\ua068\u34df]), invokevirtual:int(\u3a62\uc9f6\u3776\u4f52\ua068\u34df::\u8aa5\u97b7\u4daf\u72f1\u600f\u8cae, var_7_7F:\u6b0d\ud171\uc7fe\u52d3\uafe7\u6c56[expected:\u3a62\uc9f6\u3776\u4f52\ua068\u34df]))
            var_9_97 = sub:int(invokevirtual:int(\u3a62\uc9f6\u3776\u4f52\ua068\u34df::\u3e75\uc29a\u071d\u4d85\ubded\ub70c, p0:\u6b0d\ud171\uc7fe\u52d3\uafe7\u6c56[expected:\u3a62\uc9f6\u3776\u4f52\ua068\u34df]), invokevirtual:int(\u3a62\uc9f6\u3776\u4f52\ua068\u34df::\u3e75\uc29a\u071d\u4d85\ubded\ub70c, var_7_7F:\u6b0d\ud171\uc7fe\u52d3\uafe7\u6c56[expected:\u3a62\uc9f6\u3776\u4f52\ua068\u34df]))
            
            if (cmpgt:boolean(add:int(mul:int(var_8_8B:int, var_8_8B:int), mul:int(var_9_97:int, var_9_97:int)), getfield:int(\u9937\u7d52\u3e75\u98a4\u8aa5\u7006::\u4daf\u3d4b\u3bc9\u7d52\ufe34\ucef1, this:\u9937\u7d52\u3e75\u98a4\u8aa5\u7006))) {
                return:\u4ab3\ub1b9\u2dcc\ub8be\ube23\uc910(aconstnull:\u4ab3\ub1b9\u2dcc\ub8be\ube23\uc910())
            }
        }
        
        return:\u4ab3\ub1b9\u2dcc\ub8be\ube23\uc910(var_6_5D:\u4ab3\ub1b9\u2dcc\ub8be\ube23\uc910)
    }
    
    private void \u8258\ucef1\u600f\u7e3f\ubf56\ub32d(\u51fa\u12cb\u7330\u74b1\u6c52.\u76bc\u4975\ua6bd\u4daf\u8d98.\uc87f\u5f50\u16f6\ub113\u52d3\u12b2 p0, \u51fa\u12cb\u7330\u74b1\u6c52.\u76bc\u4975\ua6bd\u4daf\u8d98.\uc87f\u5f50\u16f6\ub113\u52d3\u12b2 p1, double p2, double p3, double p4, \u59ec\u8413\u97e6\uc229\u3776.\ub102\u5654\u8413\u3e75\u416d\u8640 p5) {
        var_10_62 : \uc87f\u5f50\u16f6\ub113\u52d3\u12b2
        var_11_12D : int
        
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
            putfield:\ub102\u5654\u8413\u3e75\u416d\u8640(\u9937\u7d52\u3e75\u98a4\u8aa5\u7006::\u7af6\u836c\u6b0d\u5140\u927d\u61a4, this:\u9937\u7d52\u3e75\u98a4\u8aa5\u7006, p5:\ub102\u5654\u8413\u3e75\u416d\u8640)
            var_10_62 = invokevirtual:\uc87f\u5f50\u16f6\ub113\u52d3\u12b2(\uc87f\u5f50\u16f6\ub113\u52d3\u12b2::\u64f2\u527a\u97b7\u8640\u7006\u071d, p1:\uc87f\u5f50\u16f6\ub113\u52d3\u12b2)
            invokevirtual:void(\uc87f\u5f50\u16f6\ub113\u52d3\u12b2::\u99f7\u3776\uc238\u6435\u5db4\u392e, var_10_62:\uc87f\u5f50\u16f6\ub113\u52d3\u12b2, p0:\uc87f\u5f50\u16f6\ub113\u52d3\u12b2)
            invokevirtual:boolean(\uc87f\u5f50\u16f6\ub113\u52d3\u12b2::\u4492\u6198\ua6bd\ud7e8\uff55\u6b5f, var_10_62:\uc87f\u5f50\u16f6\ub113\u52d3\u12b2)
            putfield:double(\u7049\u4ab3\u4c04\u8bb0\uc3e3\u3d4b::\u759a\u6c56\u8640\u88c5\u647c\u8709, getfield:\u7049\u4ab3\u4c04\u8bb0\uc3e3\u3d4b(\u9937\u7d52\u3e75\u98a4\u8aa5\u7006::\uae87\u88c5\u69d9\u3c25\uf995\u6b0d, this:\u9937\u7d52\u3e75\u98a4\u8aa5\u7006), p2:double)
            putfield:double(\u7049\u4ab3\u4c04\u8bb0\uc3e3\u3d4b::\u61a4\u67e9\u8389\u4cd9\u3dd3\ua6bd, getfield:\u7049\u4ab3\u4c04\u8bb0\uc3e3\u3d4b(\u9937\u7d52\u3e75\u98a4\u8aa5\u7006::\uae87\u88c5\u69d9\u3c25\uf995\u6b0d, this:\u9937\u7d52\u3e75\u98a4\u8aa5\u7006), p3:double)
            putfield:double(\u7049\u4ab3\u4c04\u8bb0\uc3e3\u3d4b::\u7006\u1833\u4e72\u7c6b\u527a\uc3e3, getfield:\u7049\u4ab3\u4c04\u8bb0\uc3e3\u3d4b(\u9937\u7d52\u3e75\u98a4\u8aa5\u7006::\uae87\u88c5\u69d9\u3c25\uf995\u6b0d, this:\u9937\u7d52\u3e75\u98a4\u8aa5\u7006), p4:double)
            storeelement:\ub113\uc87f\ubb2b\u4e72\u3e75\ub70c(getfield:\ub113\uc87f\ubb2b\u4e72\u3e75\ub70c[](\u9937\u7d52\u3e75\u98a4\u8aa5\u7006::\ud158\uf995\uceb8\u600f\u5245\u4cd9, this:\u9937\u7d52\u3e75\u98a4\u8aa5\u7006), ldc:int(0), initobject:\ub113\uc87f\ubb2b\u4e72\u3e75\ub70c(\ub113\uc87f\ubb2b\u4e72\u3e75\ub70c::<init>, ldc:float(-1.0f), ldc:float(-1.0f), ldc:float(-1.0f), ldc:float(1.0f)))
            storeelement:\ub113\uc87f\ubb2b\u4e72\u3e75\ub70c(getfield:\ub113\uc87f\ubb2b\u4e72\u3e75\ub70c[](\u9937\u7d52\u3e75\u98a4\u8aa5\u7006::\ud158\uf995\uceb8\u600f\u5245\u4cd9, this:\u9937\u7d52\u3e75\u98a4\u8aa5\u7006), ldc:int(1), initobject:\ub113\uc87f\ubb2b\u4e72\u3e75\ub70c(\ub113\uc87f\ubb2b\u4e72\u3e75\ub70c::<init>, ldc:float(1.0f), ldc:float(-1.0f), ldc:float(-1.0f), ldc:float(1.0f)))
            storeelement:\ub113\uc87f\ubb2b\u4e72\u3e75\ub70c(getfield:\ub113\uc87f\ubb2b\u4e72\u3e75\ub70c[](\u9937\u7d52\u3e75\u98a4\u8aa5\u7006::\ud158\uf995\uceb8\u600f\u5245\u4cd9, this:\u9937\u7d52\u3e75\u98a4\u8aa5\u7006), ldc:int(2), initobject:\ub113\uc87f\ubb2b\u4e72\u3e75\ub70c(\ub113\uc87f\ubb2b\u4e72\u3e75\ub70c::<init>, ldc:float(1.0f), ldc:float(1.0f), ldc:float(-1.0f), ldc:float(1.0f)))
            storeelement:\ub113\uc87f\ubb2b\u4e72\u3e75\ub70c(getfield:\ub113\uc87f\ubb2b\u4e72\u3e75\ub70c[](\u9937\u7d52\u3e75\u98a4\u8aa5\u7006::\ud158\uf995\uceb8\u600f\u5245\u4cd9, this:\u9937\u7d52\u3e75\u98a4\u8aa5\u7006), ldc:int(3), initobject:\ub113\uc87f\ubb2b\u4e72\u3e75\ub70c(\ub113\uc87f\ubb2b\u4e72\u3e75\ub70c::<init>, ldc:float(-1.0f), ldc:float(1.0f), ldc:float(-1.0f), ldc:float(1.0f)))
            storeelement:\ub113\uc87f\ubb2b\u4e72\u3e75\ub70c(getfield:\ub113\uc87f\ubb2b\u4e72\u3e75\ub70c[](\u9937\u7d52\u3e75\u98a4\u8aa5\u7006::\ud158\uf995\uceb8\u600f\u5245\u4cd9, this:\u9937\u7d52\u3e75\u98a4\u8aa5\u7006), ldc:int(4), initobject:\ub113\uc87f\ubb2b\u4e72\u3e75\ub70c(\ub113\uc87f\ubb2b\u4e72\u3e75\ub70c::<init>, ldc:float(-1.0f), ldc:float(-1.0f), ldc:float(1.0f), ldc:float(1.0f)))
            storeelement:\ub113\uc87f\ubb2b\u4e72\u3e75\ub70c(getfield:\ub113\uc87f\ubb2b\u4e72\u3e75\ub70c[](\u9937\u7d52\u3e75\u98a4\u8aa5\u7006::\ud158\uf995\uceb8\u600f\u5245\u4cd9, this:\u9937\u7d52\u3e75\u98a4\u8aa5\u7006), ldc:int(5), initobject:\ub113\uc87f\ubb2b\u4e72\u3e75\ub70c(\ub113\uc87f\ubb2b\u4e72\u3e75\ub70c::<init>, ldc:float(1.0f), ldc:float(-1.0f), ldc:float(1.0f), ldc:float(1.0f)))
            storeelement:\ub113\uc87f\ubb2b\u4e72\u3e75\ub70c(getfield:\ub113\uc87f\ubb2b\u4e72\u3e75\ub70c[](\u9937\u7d52\u3e75\u98a4\u8aa5\u7006::\ud158\uf995\uceb8\u600f\u5245\u4cd9, this:\u9937\u7d52\u3e75\u98a4\u8aa5\u7006), ldc:int(6), initobject:\ub113\uc87f\ubb2b\u4e72\u3e75\ub70c(\ub113\uc87f\ubb2b\u4e72\u3e75\ub70c::<init>, ldc:float(1.0f), ldc:float(1.0f), ldc:float(1.0f), ldc:float(1.0f)))
            storeelement:\ub113\uc87f\ubb2b\u4e72\u3e75\ub70c(getfield:\ub113\uc87f\ubb2b\u4e72\u3e75\ub70c[](\u9937\u7d52\u3e75\u98a4\u8aa5\u7006::\ud158\uf995\uceb8\u600f\u5245\u4cd9, this:\u9937\u7d52\u3e75\u98a4\u8aa5\u7006), ldc:int(7), initobject:\ub113\uc87f\ubb2b\u4e72\u3e75\ub70c(\ub113\uc87f\ubb2b\u4e72\u3e75\ub70c::<init>, ldc:float(-1.0f), ldc:float(1.0f), ldc:float(1.0f), ldc:float(1.0f)))
            var_11_12D = ldc:int(0)
            
            while (cmplt:boolean(var_11_12D:int, ldc:int(8))) {
                invokevirtual:void(\ub113\uc87f\ubb2b\u4e72\u3e75\ub70c::\ub83f\u7873\u5f50\uc229\u3d4b\u51b2, loadelement:\ub113\uc87f\ubb2b\u4e72\u3e75\ub70c(getfield:\ub113\uc87f\ubb2b\u4e72\u3e75\ub70c[](\u9937\u7d52\u3e75\u98a4\u8aa5\u7006::\ud158\uf995\uceb8\u600f\u5245\u4cd9, this:\u9937\u7d52\u3e75\u98a4\u8aa5\u7006), var_11_12D:int), var_10_62:\uc87f\u5f50\u16f6\ub113\u52d3\u12b2)
                invokevirtual:void(\ub113\uc87f\ubb2b\u4e72\u3e75\ub70c::\u9a18\ubcb0\ud158\u392e\ud158\u6198, loadelement:\ub113\uc87f\ubb2b\u4e72\u3e75\ub70c(getfield:\ub113\uc87f\ubb2b\u4e72\u3e75\ub70c[](\u9937\u7d52\u3e75\u98a4\u8aa5\u7006::\ud158\uf995\uceb8\u600f\u5245\u4cd9, this:\u9937\u7d52\u3e75\u98a4\u8aa5\u7006), var_11_12D:int))
                inc:int(var_11_12D, ldc:int(1))
            }
            
            return:void()
        }
        
        goto(Label_0006)
    }
    
    public void \ub18d\u40a9\u5fe1\ud51e\u8308\u9937(\u51fa\u12cb\u7330\u74b1\u6c52.\u76bc\u4975\ua6bd\u4daf\u8d98.\uafe7\uc7fe\u4c04\u6b5f\u5bc4 p0, float p1, long p2, boolean p3, \u3504\ufe34\u600f\u6b0d\u69d9.\u836c\u8cae\ub18d\u836c\u8753\u59ec p4, \u3504\ufe34\u600f\u6b0d\u69d9.\u67e9\u8413\ub113\u4bc8\u6c52\uceb8 p5, \u4492\u8aa5\ud171\uc3e3\u4c2b.\u4c04\ua068\u3d64\ua6bd\u8389.\u960f\ubefe\ud4fe\u7c6b\u5db4.\u6fb0\u12cb\u5db4\uc7fe\u0800.\u98a4\u6198\u16f6\u6ec6\u6c52\u3bd6 p6, \u51fa\u12cb\u7330\u74b1\u6c52.\u76bc\u4975\ua6bd\u4daf\u8d98.\uc87f\u5f50\u16f6\ub113\u52d3\u12b2 p7) {
        // java.lang.IllegalStateException: Unsupported node type: com.strobel.decompiler.ast.Lambda
        //     at com.strobel.decompiler.ast.Error.unsupportedNode(Error.java:32)
        //     at com.strobel.decompiler.ast.GotoRemoval.exit(GotoRemoval.java:612)
        //     at com.strobel.decompiler.ast.GotoRemoval.exit(GotoRemoval.java:586)
        //     at com.strobel.decompiler.ast.GotoRemoval.exit(GotoRemoval.java:590)
        //     at com.strobel.decompiler.ast.GotoRemoval.exit(GotoRemoval.java:586)
        //     at com.strobel.decompiler.ast.GotoRemoval.transformLeaveStatements(GotoRemoval.java:625)
        //     at com.strobel.decompiler.ast.GotoRemoval.removeGotosCore(GotoRemoval.java:57)
        //     at com.strobel.decompiler.ast.GotoRemoval.removeGotos(GotoRemoval.java:53)
        //     at com.strobel.decompiler.ast.AstOptimizer.optimize(AstOptimizer.java:276)
        //     at com.strobel.decompiler.languages.BytecodeAstLanguage.decompileMethod(BytecodeAstLanguage.java:139)
        //     at com.strobel.decompiler.languages.BytecodeAstLanguage.decompileType(BytecodeAstLanguage.java:90)
        //     at com.strobel.decompiler.DecompilerDriver.decompileType(DecompilerDriver.java:336)
        //     at com.strobel.decompiler.DecompilerDriver.decompileJar(DecompilerDriver.java:257)
        //     at com.strobel.decompiler.DecompilerDriver.main(DecompilerDriver.java:141)
    }
    
    public void \u3c25\u8bb0\u4d85\u3bc9\uc4d2\u69d9(\u51fa\u12cb\u7330\u74b1\u6c52.\u76bc\u4975\ua6bd\u4daf\u8d98.\uafe7\uc7fe\u4c04\u6b5f\u5bc4 p0) {
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
        
        if (logicalnot:boolean(invokevirtual:boolean(\uafe7\uc7fe\u4c04\u6b5f\u5bc4::\uf995\u3e75\u946b\uf995\u4c2b\ucfaf, p0:\uafe7\uc7fe\u4c04\u6b5f\u5bc4))) {
            athrow(initobject:IllegalStateException(IllegalStateException::<init>, loadelement:String(getstatic:String[](\u9937\u7d52\u3e75\u98a4\u8aa5\u7006::\ub8be\ud171\u8c8a\ub1b9\u76bc\u5bc4), ldc:int(43))))
        }
    }
    
    public void \u6cfe\u61a4\u527a\u624e\uc31c\u12b2(\u6ec6\ubb2b\uf94d\u6d99\u4f52.\u4daf\u3504\u4975\u59ec\u183a.\u7d52\u718f\u3776\u6fb0\ub83f p0, double p1, double p2, double p3, float p4, \u51fa\u12cb\u7330\u74b1\u6c52.\u76bc\u4975\ua6bd\u4daf\u8d98.\uafe7\uc7fe\u4c04\u6b5f\u5bc4 p5, \u927d\u92ff\u71ae\uafe7\u6bb9.\u12cb\u12b2\ua3b4\u183a\ud158\u51fa p6) {
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
            invokevirtual:void(\u965f\u718f\u7c6b\u4cd9\u4daf\uc246::\uc4d2\u62da\u0a06\u8cae\u6bb9\u67e9, getfield:\u965f\u718f\u7c6b\u4cd9\u4daf\uc246(\u9937\u7d52\u3e75\u98a4\u8aa5\u7006::\u7ce1\ufe34\ua61f\u6198\u718f\u4cd9, this:\u9937\u7d52\u3e75\u98a4\u8aa5\u7006), p0:\u7d52\u718f\u3776\u6fb0\ub83f, sub:double(invokestatic:double(\u927d\uc7fe\u92ff\u98a4\uc84e\uf9c5::\u494c\ub6ab\u8bb0\u8bb0\uc31c\uc31c, f2d:double(p4:float), getfield:double(\u7d52\u718f\u3776\u6fb0\ub83f::\u0b8e\u51b2\u4e72\u3711\u0b8e\uae5d, p0:\u7d52\u718f\u3776\u6fb0\ub83f), invokevirtual:double(\u7d52\u718f\u3776\u6fb0\ub83f::\ub8be\u8d98\u34df\u12b2\u071d\u12b2, p0:\u7d52\u718f\u3776\u6fb0\ub83f)), p1:double), sub:double(invokestatic:double(\u927d\uc7fe\u92ff\u98a4\uc84e\uf9c5::\u494c\ub6ab\u8bb0\u8bb0\uc31c\uc31c, f2d:double(p4:float), getfield:double(\u7d52\u718f\u3776\u6fb0\ub83f::\uf995\u56bd\ud171\u760c\ucfaf\u8d90, p0:\u7d52\u718f\u3776\u6fb0\ub83f), invokevirtual:double(\u7d52\u718f\u3776\u6fb0\ub83f::\ud51e\u12cb\u3dd3\uc84e\u8308\ube23, p0:\u7d52\u718f\u3776\u6fb0\ub83f)), p2:double), sub:double(invokestatic:double(\u927d\uc7fe\u92ff\u98a4\uc84e\uf9c5::\u494c\ub6ab\u8bb0\u8bb0\uc31c\uc31c, f2d:double(p4:float), getfield:double(\u7d52\u718f\u3776\u6fb0\ub83f::\u6c56\ua068\ud158\u88c5\u8d90\u67d0, p0:\u7d52\u718f\u3776\u6fb0\ub83f), invokevirtual:double(\u7d52\u718f\u3776\u6fb0\ub83f::\ubcb0\ub83f\u92ff\u946b\u7ce1\u8df4, p0:\u7d52\u718f\u3776\u6fb0\ub83f)), p3:double), invokestatic:float(\u927d\uc7fe\u92ff\u98a4\uc84e\uf9c5::\u494c\ub6ab\u8bb0\u8bb0\uc31c\uc31c, p4:float, getfield:float(\u7d52\u718f\u3776\u6fb0\ub83f::\u5245\uae87\ua068\u6cfe\u6198\u0a06, p0:\u7d52\u718f\u3776\u6fb0\ub83f), getfield:float(\u7d52\u718f\u3776\u6fb0\ub83f::\u7d52\u8709\ubefe\u7af6\u0b8e\ua61f, p0:\u7d52\u718f\u3776\u6fb0\ub83f)), p4:float, p5:\uafe7\uc7fe\u4c04\u6b5f\u5bc4, p6:\u12cb\u12b2\ua3b4\u183a\ud158\u51fa, invokevirtual:int(\u965f\u718f\u7c6b\u4cd9\u4daf\uc246::\uc238\u8413\u36d3\u47c2\u59ec\u6cfe, getfield:\u965f\u718f\u7c6b\u4cd9\u4daf\uc246(\u9937\u7d52\u3e75\u98a4\u8aa5\u7006::\u7ce1\ufe34\ua61f\u6198\u718f\u4cd9, this:\u9937\u7d52\u3e75\u98a4\u8aa5\u7006), p0:\u7d52\u718f\u3776\u6fb0\ub83f, p4:float))
            return:void()
        }
        
        goto(Label_0006)
    }
    
    public void \ubb2b\ubb2b\u3e2a\ub1b9\u494c\u5654(\u4492\u8aa5\ud171\uc3e3\u4c2b.\u4c04\ua068\u3d64\ua6bd\u8389.\u960f\ubefe\ud4fe\u7c6b\u5db4.\u6fb0\u12cb\u5db4\uc7fe\u0800.\ub19c\u416d\uc84e\u8389\u12cb.\uf995\u4975\u1187\ubff1\u839e\u8389 p0, \u51fa\u12cb\u7330\u74b1\u6c52.\u76bc\u4975\ua6bd\u4daf\u8d98.\uafe7\uc7fe\u4c04\u6b5f\u5bc4 p1, double p2, double p3, double p4) {
        // java.lang.IllegalStateException: Unsupported node type: com.strobel.decompiler.ast.Lambda
        //     at com.strobel.decompiler.ast.Error.unsupportedNode(Error.java:32)
        //     at com.strobel.decompiler.ast.GotoRemoval.exit(GotoRemoval.java:612)
        //     at com.strobel.decompiler.ast.GotoRemoval.exit(GotoRemoval.java:586)
        //     at com.strobel.decompiler.ast.GotoRemoval.exit(GotoRemoval.java:590)
        //     at com.strobel.decompiler.ast.GotoRemoval.exit(GotoRemoval.java:586)
        //     at com.strobel.decompiler.ast.GotoRemoval.transformLeaveStatements(GotoRemoval.java:625)
        //     at com.strobel.decompiler.ast.GotoRemoval.removeGotosCore(GotoRemoval.java:57)
        //     at com.strobel.decompiler.ast.GotoRemoval.removeGotos(GotoRemoval.java:53)
        //     at com.strobel.decompiler.ast.AstOptimizer.optimize(AstOptimizer.java:276)
        //     at com.strobel.decompiler.languages.BytecodeAstLanguage.decompileMethod(BytecodeAstLanguage.java:139)
        //     at com.strobel.decompiler.languages.BytecodeAstLanguage.decompileType(BytecodeAstLanguage.java:90)
        //     at com.strobel.decompiler.DecompilerDriver.decompileType(DecompilerDriver.java:336)
        //     at com.strobel.decompiler.DecompilerDriver.decompileJar(DecompilerDriver.java:257)
        //     at com.strobel.decompiler.DecompilerDriver.main(DecompilerDriver.java:141)
    }
    
    private void \ub8be\u9033\u5140\u34df\u59ec\u34df(int p0, int p1, int p2, double p3, double p4, double p5, \u4492\u8aa5\ud171\uc3e3\u4c2b.\u3e75\u59ec\u5245\uc4d2\u8cae\u4f4a p6) {
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
            invokestatic:void(\u3a62\u92ff\u12cb\u8753\u7bad::\u6cfe\u983f\u3504\u3bc9\u67e9\u5f50)
            invokestatic:void(\u3a62\u92ff\u12cb\u8753\u7bad::\u12cb\ub6ab\u36d3\ua61f\u59ec\ud171, sub:double(i2d:double(p0:int), p3:double), sub:double(i2d:double(p1:int), p4:double), sub:double(i2d:double(p2:int), p5:double))
            invokevirtual:void(\u3e75\u59ec\u5245\uc4d2\u8cae\u4f4a::\u0c95\u8c8a\uf94d\u2dcc\u8258\u56bd, p6:\u3e75\u59ec\u5245\uc4d2\u8cae\u4f4a)
            invokestatic:void(\u3a62\u92ff\u12cb\u8753\u7bad::\u718f\u61a4\u76bc\u624e\u0c95\u760c)
            invokestatic:void(\u3a62\u92ff\u12cb\u8753\u7bad::\u7006\ud36e\u3e2a\u8308\u61a4\u8258)
            return:void()
        }
        
        goto(Label_0006)
    }
    
    private void \u3d64\u1187\u7af6\u2dcc\u4d85\uc7fe(\u3504\ufe34\u600f\u6b0d\u69d9.\u836c\u8cae\ub18d\u836c\u8753\u59ec p0) {
        var_2_5B : \ub6ab\u8cae\u64ab\u5245\ubff1\u3711
        var_3_60 : \u760c\u7ce1\u9a18\ub32d\u6d99\ub6ab
        var_4_7C : double
        var_6_85 : double
        var_8_8E : double
        var_10_A9 : ObjectListIterator
        var_11_BF : \u61a4\u7873\u12b2\u760c\u67e9\u4492
        var_12_C6 : \u4ab3\ub1b9\u2dcc\ub8be\ube23\uc910
        var_13_D0 : \u6b0d\ud171\uc7fe\u52d3\uafe7\u6c56
        var_14_127 : int
        var_15_132 : int
        var_16_13D : int
        var_17_145 : int
        var_18_14C : \u760c\u4975\u4179\uc246\u8640\u64f2
        var_14_1DA : int
        var_15_1DF : \u760c\u4975\u4179\uc246\u8640\u64f2[]
        var_16_1E4 : int
        var_17_1E7 : int
        var_18_1F5 : \u760c\u4975\u4179\uc246\u8640\u64f2
        var_19_1FA : \u760c\u4975\u4179\uc246\u8640\u64f2[]
        var_20_1FF : int
        var_21_202 : int
        var_22_210 : \u760c\u4975\u4179\uc246\u8640\u64f2
        
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
            var_2_5B = invokestatic:\ub6ab\u8cae\u64ab\u5245\ubff1\u3711(\ub6ab\u8cae\u64ab\u5245\ubff1\u3711::\u3504\ud523\u99f7\u5140\u5d20\u983f)
            var_3_60 = invokevirtual:\u760c\u7ce1\u9a18\ub32d\u6d99\ub6ab(\ub6ab\u8cae\u64ab\u5245\ubff1\u3711::\u74b1\u7bad\u6435\uc87f\u6d69\uc238, var_2_5B:\ub6ab\u8cae\u64ab\u5245\ubff1\u3711)
            
            if (logicalor:boolean(getfield:boolean(\u67e9\u4daf\u760c\ud217\ua6bd\ubff1::\uff55\uc246\u527a\uc4d2\ua068\ub19c, getfield:\u67e9\u4daf\u760c\ud217\ua6bd\ubff1(\u9937\u7d52\u3e75\u98a4\u8aa5\u7006::\u8df4\u3776\ud171\u7006\u51b2\uf995, this:\u9937\u7d52\u3e75\u98a4\u8aa5\u7006)), getfield:boolean(\u67e9\u4daf\u760c\ud217\ua6bd\ubff1::\u927d\u16f6\u3bd6\u8aa5\u6b0d\u7e3f, getfield:\u67e9\u4daf\u760c\ud217\ua6bd\ubff1(\u9937\u7d52\u3e75\u98a4\u8aa5\u7006::\u8df4\u3776\ud171\u7006\u51b2\uf995, this:\u9937\u7d52\u3e75\u98a4\u8aa5\u7006)))) {
                var_4_7C = invokevirtual:double(\u3a62\u5d20\u4f52\uc229\u8308\ud7e8::\u16f6\u392e\u4c2b\ubf56\u3e75\u960f, invokevirtual:\u3a62\u5d20\u4f52\uc229\u8308\ud7e8(\u836c\u8cae\ub18d\u836c\u8753\u59ec::\u8308\ub171\u6b5f\u16f6\u4cd9\ua562, p0:\u836c\u8cae\ub18d\u836c\u8753\u59ec))
                var_6_85 = invokevirtual:double(\u3a62\u5d20\u4f52\uc229\u8308\ud7e8::\uc4d2\ud51e\u4f52\u67e9\ud12e\u71f1, invokevirtual:\u3a62\u5d20\u4f52\uc229\u8308\ud7e8(\u836c\u8cae\ub18d\u836c\u8753\u59ec::\u8308\ub171\u6b5f\u16f6\u4cd9\ua562, p0:\u836c\u8cae\ub18d\u836c\u8753\u59ec))
                var_8_8E = invokevirtual:double(\u3a62\u5d20\u4f52\uc229\u8308\ud7e8::\u93a2\u120d\u5fe1\u6198\u93a2\u6d99, invokevirtual:\u3a62\u5d20\u4f52\uc229\u8308\ud7e8(\u836c\u8cae\ub18d\u836c\u8753\u59ec::\u8308\ub171\u6b5f\u16f6\u4cd9\ua562, p0:\u836c\u8cae\ub18d\u836c\u8753\u59ec))
                invokestatic:void(\u9af2\u6ec6\u983f\ua068\u8c8a::\u6435\uff55\u8640\ub6ab\u527a\u4179, ldc:boolean(1))
                invokestatic:void(\u9af2\u6ec6\u983f\ua068\u8c8a::\u836c\uc29a\uceb8\u3e75\ub32d\u4ab3)
                invokestatic:void(\u9af2\u6ec6\u983f\ua068\u8c8a::\uc9f6\u7049\u92ee\ube23\u3c25\u6d99)
                invokestatic:void(\u9af2\u6ec6\u983f\ua068\u8c8a::\u3d4b\u74b1\u3711\u5bc4\uf9c5\ub32d)
                invokestatic:void(\u9af2\u6ec6\u983f\ua068\u8c8a::\u8389\ua3b4\u3d4b\ud36e\u67e9\ubefe)
                var_10_A9 = invokeinterface:ObjectListIterator(ObjectList::iterator, getfield:ObjectList<\u61a4\u7873\u12b2\u760c\u67e9\u4492>(\u9937\u7d52\u3e75\u98a4\u8aa5\u7006::\u92ee\u3dd3\ud7e8\u9a18\u8350\uafe7, this:\u9937\u7d52\u3e75\u98a4\u8aa5\u7006))
                
                while (invokeinterface:boolean(Iterator::hasNext, var_10_A9:ObjectListIterator)) {
                    var_11_BF = checkcast:\u61a4\u7873\u12b2\u760c\u67e9\u4492(\u59ec\u8413\u97e6\uc229\u3776.\u61a4\u7873\u12b2\u760c\u67e9\u4492.class, invokeinterface:\u61a4\u7873\u12b2\u760c\u67e9\u4492(Iterator<\u61a4\u7873\u12b2\u760c\u67e9\u4492>::next, var_10_A9:Iterator<\u61a4\u7873\u12b2\u760c\u67e9\u4492>))
                    var_12_C6 = getfield:\u4ab3\ub1b9\u2dcc\ub8be\ube23\uc910(\u61a4\u7873\u12b2\u760c\u67e9\u4492::\u40a9\u9255\ua6bd\u0800\u6b5f\u7043, var_11_BF:\u61a4\u7873\u12b2\u760c\u67e9\u4492)
                    invokestatic:void(\u9af2\u6ec6\u983f\ua068\u8c8a::\u6c52\u416d\u385b\ud7e8\ufcaf\u9937)
                    var_13_D0 = invokevirtual:\u6b0d\ud171\uc7fe\u52d3\uafe7\u6c56(\u4ab3\ub1b9\u2dcc\ub8be\ube23\uc910::\u7d52\ub32d\u7e3f\ubefe\u40a9\u67d0, var_12_C6:\u4ab3\ub1b9\u2dcc\ub8be\ube23\uc910)
                    invokestatic:void(\u9af2\u6ec6\u983f\ua068\u8c8a::\u983f\u4c2b\uf94d\ubefe\u3c25\u7049, sub:double(i2d:double(invokevirtual:int(\u3a62\uc9f6\u3776\u4f52\ua068\u34df::\u8aa5\u97b7\u4daf\u72f1\u600f\u8cae, var_13_D0:\u6b0d\ud171\uc7fe\u52d3\uafe7\u6c56[expected:\u3a62\uc9f6\u3776\u4f52\ua068\u34df])), var_4_7C:double), sub:double(i2d:double(invokevirtual:int(\u3a62\uc9f6\u3776\u4f52\ua068\u34df::\u9af2\u8350\u8350\u93a2\u494c\u624e, var_13_D0:\u6b0d\ud171\uc7fe\u52d3\uafe7\u6c56[expected:\u3a62\uc9f6\u3776\u4f52\ua068\u34df])), var_6_85:double), sub:double(i2d:double(invokevirtual:int(\u3a62\uc9f6\u3776\u4f52\ua068\u34df::\u3e75\uc29a\u071d\u4d85\ubded\ub70c, var_13_D0:\u6b0d\ud171\uc7fe\u52d3\uafe7\u6c56[expected:\u3a62\uc9f6\u3776\u4f52\ua068\u34df])), var_8_8E:double))
                    
                    if (getfield:boolean(\u67e9\u4daf\u760c\ud217\ua6bd\ubff1::\uff55\uc246\u527a\uc4d2\ua068\ub19c, getfield:\u67e9\u4daf\u760c\ud217\ua6bd\ubff1(\u9937\u7d52\u3e75\u98a4\u8aa5\u7006::\u8df4\u3776\ud171\u7006\u51b2\uf995, this:\u9937\u7d52\u3e75\u98a4\u8aa5\u7006))) {
                        invokevirtual:void(\u760c\u7ce1\u9a18\ub32d\u6d99\ub6ab::\u12cb\u9937\uc246\u5fe1\ubefe\u494c, var_3_60:\u760c\u7ce1\u9a18\ub32d\u6d99\ub6ab, ldc:int(1), getstatic:\u74b1\u6d69\ud4fe\u4179\u8c8a\u965f(\u6d69\u4c04\ub113\u92ff\u3e75\u12b2::\u40a9\u8709\ud523\ub171\u446c\u7e3f))
                        invokestatic:void(\u9af2\u6ec6\u983f\ua068\u8c8a::\ubcb0\u494c\ua562\u69d9\ucfaf\u927d, ldc:float(10.0f))
                        var_14_127 = ternaryop:int(cmpeq:boolean(invokestatic:int(\u61a4\u7873\u12b2\u760c\u67e9\u4492::\u34df\ua61f\u759a\ufe34\uc9f6\u34df, var_11_BF:\u61a4\u7873\u12b2\u760c\u67e9\u4492), ldc:int(0)), ldc:int(0), invokestatic:int(\u927d\uc7fe\u92ff\u98a4\uc84e\uf9c5::\u7330\u9033\u7d52\u71ae\u4f52\u760c, div:float(i2f:float(invokestatic:int(\u61a4\u7873\u12b2\u760c\u67e9\u4492::\u34df\ua61f\u759a\ufe34\uc9f6\u34df, var_11_BF:\u61a4\u7873\u12b2\u760c\u67e9\u4492)), ldc:float(50.0f)), ldc:float(0.9f), ldc:float(0.9f)))
                        var_15_132 = and:int(shr:int(var_14_127:int, ldc:int(16)), ldc:int(255))
                        var_16_13D = and:int(shr:int(var_14_127:int, ldc:int(8)), ldc:int(255))
                        var_17_145 = and:int(var_14_127:int, ldc:int(255))
                        var_18_14C = invokestatic:\u760c\u4975\u4179\uc246\u8640\u64f2(\u61a4\u7873\u12b2\u760c\u67e9\u4492::\ucef1\uc2e8\u9255\u12b2\u0c95\u760c, var_11_BF:\u61a4\u7873\u12b2\u760c\u67e9\u4492)
                        
                        if (cmpne:boolean(var_18_14C:\u760c\u4975\u4179\uc246\u8640\u64f2, aconstnull:\u760c\u4975\u4179\uc246\u8640\u64f2())) {
                            invokeinterface:void(\u6b0d\uf9c5\ucfaf\ud36e\ub102::\ua61f\u0a06\u3bc9\ufe34\uc9f6\u8258, invokeinterface:\u6b0d\uf9c5\ucfaf\ud36e\ub102(\u6b0d\uf9c5\ucfaf\ud36e\ub102::\ub70c\u600f\u93a2\uc910\u9937\u946b, invokevirtual:\u6b0d\uf9c5\ucfaf\ud36e\ub102(\u6b0d\uf9c5\ucfaf\ud36e\ub102::\u8d90\u9255\u3bd6\u5d20\ub83f\u1187, var_3_60:\u760c\u7ce1\u9a18\ub32d\u6d99\ub6ab[expected:\u6b0d\uf9c5\ucfaf\ud36e\ub102], ldc:double(8.0), ldc:double(8.0), ldc:double(8.0)), var_15_132:int, var_16_13D:int, var_17_145:int, ldc:int(255)))
                            invokeinterface:void(\u6b0d\uf9c5\ucfaf\ud36e\ub102::\ua61f\u0a06\u3bc9\ufe34\uc9f6\u8258, invokeinterface:\u6b0d\uf9c5\ucfaf\ud36e\ub102(\u6b0d\uf9c5\ucfaf\ud36e\ub102::\ub70c\u600f\u93a2\uc910\u9937\u946b, invokevirtual:\u6b0d\uf9c5\ucfaf\ud36e\ub102(\u6b0d\uf9c5\ucfaf\ud36e\ub102::\u8d90\u9255\u3bd6\u5d20\ub83f\u1187, var_3_60:\u760c\u7ce1\u9a18\ub32d\u6d99\ub6ab[expected:\u6b0d\uf9c5\ucfaf\ud36e\ub102], i2d:double(sub:int(ldc:int(8), mul:int(ldc:int(16), invokevirtual:int(\u760c\u4975\u4179\uc246\u8640\u64f2::\u4bc8\u9255\ub19c\u5f50\u12cb\u392e, var_18_14C:\u760c\u4975\u4179\uc246\u8640\u64f2)))), i2d:double(sub:int(ldc:int(8), mul:int(ldc:int(16), invokevirtual:int(\u760c\u4975\u4179\uc246\u8640\u64f2::\u64f2\u0c95\u3d64\u2dcc\uc84e\uc4d2, var_18_14C:\u760c\u4975\u4179\uc246\u8640\u64f2)))), i2d:double(sub:int(ldc:int(8), mul:int(ldc:int(16), invokevirtual:int(\u760c\u4975\u4179\uc246\u8640\u64f2::\u88c5\u3e2a\u600f\u99f7\u8308\ufe34, var_18_14C:\u760c\u4975\u4179\uc246\u8640\u64f2))))), var_15_132:int, var_16_13D:int, var_17_145:int, ldc:int(255)))
                        }
                        
                        invokevirtual:void(\ub6ab\u8cae\u64ab\u5245\ubff1\u3711::\uc229\u12b2\u6cfe\u4492\u36d3\u5f50, var_2_5B:\ub6ab\u8cae\u64ab\u5245\ubff1\u3711)
                        invokestatic:void(\u9af2\u6ec6\u983f\ua068\u8c8a::\ubcb0\u494c\ua562\u69d9\ucfaf\u927d, ldc:float(1.0f))
                    }
                    
                    if (logicaland:boolean(getfield:boolean(\u67e9\u4daf\u760c\ud217\ua6bd\ubff1::\u927d\u16f6\u3bd6\u8aa5\u6b0d\u7e3f, getfield:\u67e9\u4daf\u760c\ud217\ua6bd\ubff1(\u9937\u7d52\u3e75\u98a4\u8aa5\u7006::\u8df4\u3776\ud171\u7006\u51b2\uf995, this:\u9937\u7d52\u3e75\u98a4\u8aa5\u7006)), logicalnot:boolean(invokevirtual:boolean(\u6fb0\u494c\u3bd6\u0c95\u4cd9\ufcaf::\u4f4a\ua068\u71f1\ucfaf\u8aa5\u52d3, invokevirtual:\u6fb0\u494c\u3bd6\u0c95\u4cd9\ufcaf(\u4ab3\ub1b9\u2dcc\ub8be\ube23\uc910::\u4d85\u8c8a\uc2e8\u34df\u62da\u6ec6, var_12_C6:\u4ab3\ub1b9\u2dcc\ub8be\ube23\uc910))))) {
                        invokevirtual:void(\u760c\u7ce1\u9a18\ub32d\u6d99\ub6ab::\u12cb\u9937\uc246\u5fe1\ubefe\u494c, var_3_60:\u760c\u7ce1\u9a18\ub32d\u6d99\ub6ab, ldc:int(1), getstatic:\u74b1\u6d69\ud4fe\u4179\u8c8a\u965f(\u6d69\u4c04\ub113\u92ff\u3e75\u12b2::\u40a9\u8709\ud523\ub171\u446c\u7e3f))
                        invokestatic:void(\u9af2\u6ec6\u983f\ua068\u8c8a::\ubcb0\u494c\ua562\u69d9\ucfaf\u927d, ldc:float(10.0f))
                        var_14_1DA = ldc:int(0)
                        var_15_1DF = getstatic:\u760c\u4975\u4179\uc246\u8640\u64f2[](\u9937\u7d52\u3e75\u98a4\u8aa5\u7006::\ub113\u92ff\ubb2b\u4d85\u5140\u4f4a)
                        var_16_1E4 = arraylength:int(var_15_1DF:\u760c\u4975\u4179\uc246\u8640\u64f2[])
                        var_17_1E7 = ldc:int(0)
                        
                        while (cmplt:boolean(var_17_1E7:int, var_16_1E4:int)) {
                            var_18_1F5 = loadelement:\u760c\u4975\u4179\uc246\u8640\u64f2(var_15_1DF:\u760c\u4975\u4179\uc246\u8640\u64f2[], var_17_1E7:int)
                            var_19_1FA = getstatic:\u760c\u4975\u4179\uc246\u8640\u64f2[](\u9937\u7d52\u3e75\u98a4\u8aa5\u7006::\ub113\u92ff\ubb2b\u4d85\u5140\u4f4a)
                            var_20_1FF = arraylength:int(var_19_1FA:\u760c\u4975\u4179\uc246\u8640\u64f2[])
                            var_21_202 = ldc:int(0)
                            
                            while (cmplt:boolean(var_21_202:int, var_20_1FF:int)) {
                                var_22_210 = loadelement:\u760c\u4975\u4179\uc246\u8640\u64f2(var_19_1FA:\u760c\u4975\u4179\uc246\u8640\u64f2[], var_21_202:int)
                                
                                if (logicalnot:boolean(invokevirtual:boolean(\u6fb0\u494c\u3bd6\u0c95\u4cd9\ufcaf::\u9033\ua3b4\u760c\u4975\ub102\u74b1, invokevirtual:\u6fb0\u494c\u3bd6\u0c95\u4cd9\ufcaf(\u4ab3\ub1b9\u2dcc\ub8be\ube23\uc910::\u4d85\u8c8a\uc2e8\u34df\u62da\u6ec6, var_12_C6:\u4ab3\ub1b9\u2dcc\ub8be\ube23\uc910), var_18_1F5:\u760c\u4975\u4179\uc246\u8640\u64f2, var_22_210:\u760c\u4975\u4179\uc246\u8640\u64f2))) {
                                    inc:int(var_14_1DA, ldc:int(1))
                                    invokeinterface:void(\u6b0d\uf9c5\ucfaf\ud36e\ub102::\ua61f\u0a06\u3bc9\ufe34\uc9f6\u8258, invokeinterface:\u6b0d\uf9c5\ucfaf\ud36e\ub102(\u6b0d\uf9c5\ucfaf\ud36e\ub102::\ub70c\u600f\u93a2\uc910\u9937\u946b, invokevirtual:\u6b0d\uf9c5\ucfaf\ud36e\ub102(\u6b0d\uf9c5\ucfaf\ud36e\ub102::\u8d90\u9255\u3bd6\u5d20\ub83f\u1187, var_3_60:\u760c\u7ce1\u9a18\ub32d\u6d99\ub6ab[expected:\u6b0d\uf9c5\ucfaf\ud36e\ub102], i2d:double(add:int(ldc:int(8), mul:int(ldc:int(8), invokevirtual:int(\u760c\u4975\u4179\uc246\u8640\u64f2::\u4bc8\u9255\ub19c\u5f50\u12cb\u392e, var_18_1F5:\u760c\u4975\u4179\uc246\u8640\u64f2)))), i2d:double(add:int(ldc:int(8), mul:int(ldc:int(8), invokevirtual:int(\u760c\u4975\u4179\uc246\u8640\u64f2::\u64f2\u0c95\u3d64\u2dcc\uc84e\uc4d2, var_18_1F5:\u760c\u4975\u4179\uc246\u8640\u64f2)))), i2d:double(add:int(ldc:int(8), mul:int(ldc:int(8), invokevirtual:int(\u760c\u4975\u4179\uc246\u8640\u64f2::\u88c5\u3e2a\u600f\u99f7\u8308\ufe34, var_18_1F5:\u760c\u4975\u4179\uc246\u8640\u64f2))))), ldc:int(1), ldc:int(0), ldc:int(0), ldc:int(1)))
                                    invokeinterface:void(\u6b0d\uf9c5\ucfaf\ud36e\ub102::\ua61f\u0a06\u3bc9\ufe34\uc9f6\u8258, invokeinterface:\u6b0d\uf9c5\ucfaf\ud36e\ub102(\u6b0d\uf9c5\ucfaf\ud36e\ub102::\ub70c\u600f\u93a2\uc910\u9937\u946b, invokevirtual:\u6b0d\uf9c5\ucfaf\ud36e\ub102(\u6b0d\uf9c5\ucfaf\ud36e\ub102::\u8d90\u9255\u3bd6\u5d20\ub83f\u1187, var_3_60:\u760c\u7ce1\u9a18\ub32d\u6d99\ub6ab[expected:\u6b0d\uf9c5\ucfaf\ud36e\ub102], i2d:double(add:int(ldc:int(8), mul:int(ldc:int(8), invokevirtual:int(\u760c\u4975\u4179\uc246\u8640\u64f2::\u4bc8\u9255\ub19c\u5f50\u12cb\u392e, var_22_210:\u760c\u4975\u4179\uc246\u8640\u64f2)))), i2d:double(add:int(ldc:int(8), mul:int(ldc:int(8), invokevirtual:int(\u760c\u4975\u4179\uc246\u8640\u64f2::\u64f2\u0c95\u3d64\u2dcc\uc84e\uc4d2, var_22_210:\u760c\u4975\u4179\uc246\u8640\u64f2)))), i2d:double(add:int(ldc:int(8), mul:int(ldc:int(8), invokevirtual:int(\u760c\u4975\u4179\uc246\u8640\u64f2::\u88c5\u3e2a\u600f\u99f7\u8308\ufe34, var_22_210:\u760c\u4975\u4179\uc246\u8640\u64f2))))), ldc:int(1), ldc:int(0), ldc:int(0), ldc:int(1)))
                                }
                                
                                inc:int(var_21_202, ldc:int(1))
                            }
                            
                            inc:int(var_17_1E7, ldc:int(1))
                        }
                        
                        invokevirtual:void(\ub6ab\u8cae\u64ab\u5245\ubff1\u3711::\uc229\u12b2\u6cfe\u4492\u36d3\u5f50, var_2_5B:\ub6ab\u8cae\u64ab\u5245\ubff1\u3711)
                        invokestatic:void(\u9af2\u6ec6\u983f\ua068\u8c8a::\ubcb0\u494c\ua562\u69d9\ucfaf\u927d, ldc:float(1.0f))
                        
                        if (cmpgt:boolean(var_14_1DA:int, ldc:int(0))) {
                            invokevirtual:void(\u760c\u7ce1\u9a18\ub32d\u6d99\ub6ab::\u12cb\u9937\uc246\u5fe1\ubefe\u494c, var_3_60:\u760c\u7ce1\u9a18\ub32d\u6d99\ub6ab, ldc:int(7), getstatic:\u74b1\u6d69\ud4fe\u4179\u8c8a\u965f(\u6d69\u4c04\ub113\u92ff\u3e75\u12b2::\u40a9\u8709\ud523\ub171\u446c\u7e3f))
                            invokeinterface:void(\u6b0d\uf9c5\ucfaf\ud36e\ub102::\ua61f\u0a06\u3bc9\ufe34\uc9f6\u8258, invokeinterface:\u6b0d\uf9c5\ucfaf\ud36e\ub102(\u6b0d\uf9c5\ucfaf\ud36e\ub102::\ub70c\u600f\u93a2\uc910\u9937\u946b, invokevirtual:\u6b0d\uf9c5\ucfaf\ud36e\ub102(\u6b0d\uf9c5\ucfaf\ud36e\ub102::\u8d90\u9255\u3bd6\u5d20\ub83f\u1187, var_3_60:\u760c\u7ce1\u9a18\ub32d\u6d99\ub6ab[expected:\u6b0d\uf9c5\ucfaf\ud36e\ub102], ldc:double(0.5), ldc:double(15.5), ldc:double(0.5)), ldc:float(0.9f), ldc:float(0.9f), ldc:float(0.0f), ldc:float(0.2f)))
                            invokeinterface:void(\u6b0d\uf9c5\ucfaf\ud36e\ub102::\ua61f\u0a06\u3bc9\ufe34\uc9f6\u8258, invokeinterface:\u6b0d\uf9c5\ucfaf\ud36e\ub102(\u6b0d\uf9c5\ucfaf\ud36e\ub102::\ub70c\u600f\u93a2\uc910\u9937\u946b, invokevirtual:\u6b0d\uf9c5\ucfaf\ud36e\ub102(\u6b0d\uf9c5\ucfaf\ud36e\ub102::\u8d90\u9255\u3bd6\u5d20\ub83f\u1187, var_3_60:\u760c\u7ce1\u9a18\ub32d\u6d99\ub6ab[expected:\u6b0d\uf9c5\ucfaf\ud36e\ub102], ldc:double(15.5), ldc:double(15.5), ldc:double(0.5)), ldc:float(0.9f), ldc:float(0.9f), ldc:float(0.0f), ldc:float(0.2f)))
                            invokeinterface:void(\u6b0d\uf9c5\ucfaf\ud36e\ub102::\ua61f\u0a06\u3bc9\ufe34\uc9f6\u8258, invokeinterface:\u6b0d\uf9c5\ucfaf\ud36e\ub102(\u6b0d\uf9c5\ucfaf\ud36e\ub102::\ub70c\u600f\u93a2\uc910\u9937\u946b, invokevirtual:\u6b0d\uf9c5\ucfaf\ud36e\ub102(\u6b0d\uf9c5\ucfaf\ud36e\ub102::\u8d90\u9255\u3bd6\u5d20\ub83f\u1187, var_3_60:\u760c\u7ce1\u9a18\ub32d\u6d99\ub6ab[expected:\u6b0d\uf9c5\ucfaf\ud36e\ub102], ldc:double(15.5), ldc:double(15.5), ldc:double(15.5)), ldc:float(0.9f), ldc:float(0.9f), ldc:float(0.0f), ldc:float(0.2f)))
                            invokeinterface:void(\u6b0d\uf9c5\ucfaf\ud36e\ub102::\ua61f\u0a06\u3bc9\ufe34\uc9f6\u8258, invokeinterface:\u6b0d\uf9c5\ucfaf\ud36e\ub102(\u6b0d\uf9c5\ucfaf\ud36e\ub102::\ub70c\u600f\u93a2\uc910\u9937\u946b, invokevirtual:\u6b0d\uf9c5\ucfaf\ud36e\ub102(\u6b0d\uf9c5\ucfaf\ud36e\ub102::\u8d90\u9255\u3bd6\u5d20\ub83f\u1187, var_3_60:\u760c\u7ce1\u9a18\ub32d\u6d99\ub6ab[expected:\u6b0d\uf9c5\ucfaf\ud36e\ub102], ldc:double(0.5), ldc:double(15.5), ldc:double(15.5)), ldc:float(0.9f), ldc:float(0.9f), ldc:float(0.0f), ldc:float(0.2f)))
                            invokeinterface:void(\u6b0d\uf9c5\ucfaf\ud36e\ub102::\ua61f\u0a06\u3bc9\ufe34\uc9f6\u8258, invokeinterface:\u6b0d\uf9c5\ucfaf\ud36e\ub102(\u6b0d\uf9c5\ucfaf\ud36e\ub102::\ub70c\u600f\u93a2\uc910\u9937\u946b, invokevirtual:\u6b0d\uf9c5\ucfaf\ud36e\ub102(\u6b0d\uf9c5\ucfaf\ud36e\ub102::\u8d90\u9255\u3bd6\u5d20\ub83f\u1187, var_3_60:\u760c\u7ce1\u9a18\ub32d\u6d99\ub6ab[expected:\u6b0d\uf9c5\ucfaf\ud36e\ub102], ldc:double(0.5), ldc:double(0.5), ldc:double(15.5)), ldc:float(0.9f), ldc:float(0.9f), ldc:float(0.0f), ldc:float(0.2f)))
                            invokeinterface:void(\u6b0d\uf9c5\ucfaf\ud36e\ub102::\ua61f\u0a06\u3bc9\ufe34\uc9f6\u8258, invokeinterface:\u6b0d\uf9c5\ucfaf\ud36e\ub102(\u6b0d\uf9c5\ucfaf\ud36e\ub102::\ub70c\u600f\u93a2\uc910\u9937\u946b, invokevirtual:\u6b0d\uf9c5\ucfaf\ud36e\ub102(\u6b0d\uf9c5\ucfaf\ud36e\ub102::\u8d90\u9255\u3bd6\u5d20\ub83f\u1187, var_3_60:\u760c\u7ce1\u9a18\ub32d\u6d99\ub6ab[expected:\u6b0d\uf9c5\ucfaf\ud36e\ub102], ldc:double(15.5), ldc:double(0.5), ldc:double(15.5)), ldc:float(0.9f), ldc:float(0.9f), ldc:float(0.0f), ldc:float(0.2f)))
                            invokeinterface:void(\u6b0d\uf9c5\ucfaf\ud36e\ub102::\ua61f\u0a06\u3bc9\ufe34\uc9f6\u8258, invokeinterface:\u6b0d\uf9c5\ucfaf\ud36e\ub102(\u6b0d\uf9c5\ucfaf\ud36e\ub102::\ub70c\u600f\u93a2\uc910\u9937\u946b, invokevirtual:\u6b0d\uf9c5\ucfaf\ud36e\ub102(\u6b0d\uf9c5\ucfaf\ud36e\ub102::\u8d90\u9255\u3bd6\u5d20\ub83f\u1187, var_3_60:\u760c\u7ce1\u9a18\ub32d\u6d99\ub6ab[expected:\u6b0d\uf9c5\ucfaf\ud36e\ub102], ldc:double(15.5), ldc:double(0.5), ldc:double(0.5)), ldc:float(0.9f), ldc:float(0.9f), ldc:float(0.0f), ldc:float(0.2f)))
                            invokeinterface:void(\u6b0d\uf9c5\ucfaf\ud36e\ub102::\ua61f\u0a06\u3bc9\ufe34\uc9f6\u8258, invokeinterface:\u6b0d\uf9c5\ucfaf\ud36e\ub102(\u6b0d\uf9c5\ucfaf\ud36e\ub102::\ub70c\u600f\u93a2\uc910\u9937\u946b, invokevirtual:\u6b0d\uf9c5\ucfaf\ud36e\ub102(\u6b0d\uf9c5\ucfaf\ud36e\ub102::\u8d90\u9255\u3bd6\u5d20\ub83f\u1187, var_3_60:\u760c\u7ce1\u9a18\ub32d\u6d99\ub6ab[expected:\u6b0d\uf9c5\ucfaf\ud36e\ub102], ldc:double(0.5), ldc:double(0.5), ldc:double(0.5)), ldc:float(0.9f), ldc:float(0.9f), ldc:float(0.0f), ldc:float(0.2f)))
                            invokeinterface:void(\u6b0d\uf9c5\ucfaf\ud36e\ub102::\ua61f\u0a06\u3bc9\ufe34\uc9f6\u8258, invokeinterface:\u6b0d\uf9c5\ucfaf\ud36e\ub102(\u6b0d\uf9c5\ucfaf\ud36e\ub102::\ub70c\u600f\u93a2\uc910\u9937\u946b, invokevirtual:\u6b0d\uf9c5\ucfaf\ud36e\ub102(\u6b0d\uf9c5\ucfaf\ud36e\ub102::\u8d90\u9255\u3bd6\u5d20\ub83f\u1187, var_3_60:\u760c\u7ce1\u9a18\ub32d\u6d99\ub6ab[expected:\u6b0d\uf9c5\ucfaf\ud36e\ub102], ldc:double(0.5), ldc:double(15.5), ldc:double(0.5)), ldc:float(0.9f), ldc:float(0.9f), ldc:float(0.0f), ldc:float(0.2f)))
                            invokeinterface:void(\u6b0d\uf9c5\ucfaf\ud36e\ub102::\ua61f\u0a06\u3bc9\ufe34\uc9f6\u8258, invokeinterface:\u6b0d\uf9c5\ucfaf\ud36e\ub102(\u6b0d\uf9c5\ucfaf\ud36e\ub102::\ub70c\u600f\u93a2\uc910\u9937\u946b, invokevirtual:\u6b0d\uf9c5\ucfaf\ud36e\ub102(\u6b0d\uf9c5\ucfaf\ud36e\ub102::\u8d90\u9255\u3bd6\u5d20\ub83f\u1187, var_3_60:\u760c\u7ce1\u9a18\ub32d\u6d99\ub6ab[expected:\u6b0d\uf9c5\ucfaf\ud36e\ub102], ldc:double(0.5), ldc:double(15.5), ldc:double(15.5)), ldc:float(0.9f), ldc:float(0.9f), ldc:float(0.0f), ldc:float(0.2f)))
                            invokeinterface:void(\u6b0d\uf9c5\ucfaf\ud36e\ub102::\ua61f\u0a06\u3bc9\ufe34\uc9f6\u8258, invokeinterface:\u6b0d\uf9c5\ucfaf\ud36e\ub102(\u6b0d\uf9c5\ucfaf\ud36e\ub102::\ub70c\u600f\u93a2\uc910\u9937\u946b, invokevirtual:\u6b0d\uf9c5\ucfaf\ud36e\ub102(\u6b0d\uf9c5\ucfaf\ud36e\ub102::\u8d90\u9255\u3bd6\u5d20\ub83f\u1187, var_3_60:\u760c\u7ce1\u9a18\ub32d\u6d99\ub6ab[expected:\u6b0d\uf9c5\ucfaf\ud36e\ub102], ldc:double(0.5), ldc:double(0.5), ldc:double(15.5)), ldc:float(0.9f), ldc:float(0.9f), ldc:float(0.0f), ldc:float(0.2f)))
                            invokeinterface:void(\u6b0d\uf9c5\ucfaf\ud36e\ub102::\ua61f\u0a06\u3bc9\ufe34\uc9f6\u8258, invokeinterface:\u6b0d\uf9c5\ucfaf\ud36e\ub102(\u6b0d\uf9c5\ucfaf\ud36e\ub102::\ub70c\u600f\u93a2\uc910\u9937\u946b, invokevirtual:\u6b0d\uf9c5\ucfaf\ud36e\ub102(\u6b0d\uf9c5\ucfaf\ud36e\ub102::\u8d90\u9255\u3bd6\u5d20\ub83f\u1187, var_3_60:\u760c\u7ce1\u9a18\ub32d\u6d99\ub6ab[expected:\u6b0d\uf9c5\ucfaf\ud36e\ub102], ldc:double(0.5), ldc:double(0.5), ldc:double(0.5)), ldc:float(0.9f), ldc:float(0.9f), ldc:float(0.0f), ldc:float(0.2f)))
                            invokeinterface:void(\u6b0d\uf9c5\ucfaf\ud36e\ub102::\ua61f\u0a06\u3bc9\ufe34\uc9f6\u8258, invokeinterface:\u6b0d\uf9c5\ucfaf\ud36e\ub102(\u6b0d\uf9c5\ucfaf\ud36e\ub102::\ub70c\u600f\u93a2\uc910\u9937\u946b, invokevirtual:\u6b0d\uf9c5\ucfaf\ud36e\ub102(\u6b0d\uf9c5\ucfaf\ud36e\ub102::\u8d90\u9255\u3bd6\u5d20\ub83f\u1187, var_3_60:\u760c\u7ce1\u9a18\ub32d\u6d99\ub6ab[expected:\u6b0d\uf9c5\ucfaf\ud36e\ub102], ldc:double(15.5), ldc:double(0.5), ldc:double(0.5)), ldc:float(0.9f), ldc:float(0.9f), ldc:float(0.0f), ldc:float(0.2f)))
                            invokeinterface:void(\u6b0d\uf9c5\ucfaf\ud36e\ub102::\ua61f\u0a06\u3bc9\ufe34\uc9f6\u8258, invokeinterface:\u6b0d\uf9c5\ucfaf\ud36e\ub102(\u6b0d\uf9c5\ucfaf\ud36e\ub102::\ub70c\u600f\u93a2\uc910\u9937\u946b, invokevirtual:\u6b0d\uf9c5\ucfaf\ud36e\ub102(\u6b0d\uf9c5\ucfaf\ud36e\ub102::\u8d90\u9255\u3bd6\u5d20\ub83f\u1187, var_3_60:\u760c\u7ce1\u9a18\ub32d\u6d99\ub6ab[expected:\u6b0d\uf9c5\ucfaf\ud36e\ub102], ldc:double(15.5), ldc:double(0.5), ldc:double(15.5)), ldc:float(0.9f), ldc:float(0.9f), ldc:float(0.0f), ldc:float(0.2f)))
                            invokeinterface:void(\u6b0d\uf9c5\ucfaf\ud36e\ub102::\ua61f\u0a06\u3bc9\ufe34\uc9f6\u8258, invokeinterface:\u6b0d\uf9c5\ucfaf\ud36e\ub102(\u6b0d\uf9c5\ucfaf\ud36e\ub102::\ub70c\u600f\u93a2\uc910\u9937\u946b, invokevirtual:\u6b0d\uf9c5\ucfaf\ud36e\ub102(\u6b0d\uf9c5\ucfaf\ud36e\ub102::\u8d90\u9255\u3bd6\u5d20\ub83f\u1187, var_3_60:\u760c\u7ce1\u9a18\ub32d\u6d99\ub6ab[expected:\u6b0d\uf9c5\ucfaf\ud36e\ub102], ldc:double(15.5), ldc:double(15.5), ldc:double(15.5)), ldc:float(0.9f), ldc:float(0.9f), ldc:float(0.0f), ldc:float(0.2f)))
                            invokeinterface:void(\u6b0d\uf9c5\ucfaf\ud36e\ub102::\ua61f\u0a06\u3bc9\ufe34\uc9f6\u8258, invokeinterface:\u6b0d\uf9c5\ucfaf\ud36e\ub102(\u6b0d\uf9c5\ucfaf\ud36e\ub102::\ub70c\u600f\u93a2\uc910\u9937\u946b, invokevirtual:\u6b0d\uf9c5\ucfaf\ud36e\ub102(\u6b0d\uf9c5\ucfaf\ud36e\ub102::\u8d90\u9255\u3bd6\u5d20\ub83f\u1187, var_3_60:\u760c\u7ce1\u9a18\ub32d\u6d99\ub6ab[expected:\u6b0d\uf9c5\ucfaf\ud36e\ub102], ldc:double(15.5), ldc:double(15.5), ldc:double(0.5)), ldc:float(0.9f), ldc:float(0.9f), ldc:float(0.0f), ldc:float(0.2f)))
                            invokeinterface:void(\u6b0d\uf9c5\ucfaf\ud36e\ub102::\ua61f\u0a06\u3bc9\ufe34\uc9f6\u8258, invokeinterface:\u6b0d\uf9c5\ucfaf\ud36e\ub102(\u6b0d\uf9c5\ucfaf\ud36e\ub102::\ub70c\u600f\u93a2\uc910\u9937\u946b, invokevirtual:\u6b0d\uf9c5\ucfaf\ud36e\ub102(\u6b0d\uf9c5\ucfaf\ud36e\ub102::\u8d90\u9255\u3bd6\u5d20\ub83f\u1187, var_3_60:\u760c\u7ce1\u9a18\ub32d\u6d99\ub6ab[expected:\u6b0d\uf9c5\ucfaf\ud36e\ub102], ldc:double(0.5), ldc:double(0.5), ldc:double(0.5)), ldc:float(0.9f), ldc:float(0.9f), ldc:float(0.0f), ldc:float(0.2f)))
                            invokeinterface:void(\u6b0d\uf9c5\ucfaf\ud36e\ub102::\ua61f\u0a06\u3bc9\ufe34\uc9f6\u8258, invokeinterface:\u6b0d\uf9c5\ucfaf\ud36e\ub102(\u6b0d\uf9c5\ucfaf\ud36e\ub102::\ub70c\u600f\u93a2\uc910\u9937\u946b, invokevirtual:\u6b0d\uf9c5\ucfaf\ud36e\ub102(\u6b0d\uf9c5\ucfaf\ud36e\ub102::\u8d90\u9255\u3bd6\u5d20\ub83f\u1187, var_3_60:\u760c\u7ce1\u9a18\ub32d\u6d99\ub6ab[expected:\u6b0d\uf9c5\ucfaf\ud36e\ub102], ldc:double(15.5), ldc:double(0.5), ldc:double(0.5)), ldc:float(0.9f), ldc:float(0.9f), ldc:float(0.0f), ldc:float(0.2f)))
                            invokeinterface:void(\u6b0d\uf9c5\ucfaf\ud36e\ub102::\ua61f\u0a06\u3bc9\ufe34\uc9f6\u8258, invokeinterface:\u6b0d\uf9c5\ucfaf\ud36e\ub102(\u6b0d\uf9c5\ucfaf\ud36e\ub102::\ub70c\u600f\u93a2\uc910\u9937\u946b, invokevirtual:\u6b0d\uf9c5\ucfaf\ud36e\ub102(\u6b0d\uf9c5\ucfaf\ud36e\ub102::\u8d90\u9255\u3bd6\u5d20\ub83f\u1187, var_3_60:\u760c\u7ce1\u9a18\ub32d\u6d99\ub6ab[expected:\u6b0d\uf9c5\ucfaf\ud36e\ub102], ldc:double(15.5), ldc:double(15.5), ldc:double(0.5)), ldc:float(0.9f), ldc:float(0.9f), ldc:float(0.0f), ldc:float(0.2f)))
                            invokeinterface:void(\u6b0d\uf9c5\ucfaf\ud36e\ub102::\ua61f\u0a06\u3bc9\ufe34\uc9f6\u8258, invokeinterface:\u6b0d\uf9c5\ucfaf\ud36e\ub102(\u6b0d\uf9c5\ucfaf\ud36e\ub102::\ub70c\u600f\u93a2\uc910\u9937\u946b, invokevirtual:\u6b0d\uf9c5\ucfaf\ud36e\ub102(\u6b0d\uf9c5\ucfaf\ud36e\ub102::\u8d90\u9255\u3bd6\u5d20\ub83f\u1187, var_3_60:\u760c\u7ce1\u9a18\ub32d\u6d99\ub6ab[expected:\u6b0d\uf9c5\ucfaf\ud36e\ub102], ldc:double(0.5), ldc:double(15.5), ldc:double(0.5)), ldc:float(0.9f), ldc:float(0.9f), ldc:float(0.0f), ldc:float(0.2f)))
                            invokeinterface:void(\u6b0d\uf9c5\ucfaf\ud36e\ub102::\ua61f\u0a06\u3bc9\ufe34\uc9f6\u8258, invokeinterface:\u6b0d\uf9c5\ucfaf\ud36e\ub102(\u6b0d\uf9c5\ucfaf\ud36e\ub102::\ub70c\u600f\u93a2\uc910\u9937\u946b, invokevirtual:\u6b0d\uf9c5\ucfaf\ud36e\ub102(\u6b0d\uf9c5\ucfaf\ud36e\ub102::\u8d90\u9255\u3bd6\u5d20\ub83f\u1187, var_3_60:\u760c\u7ce1\u9a18\ub32d\u6d99\ub6ab[expected:\u6b0d\uf9c5\ucfaf\ud36e\ub102], ldc:double(0.5), ldc:double(15.5), ldc:double(15.5)), ldc:float(0.9f), ldc:float(0.9f), ldc:float(0.0f), ldc:float(0.2f)))
                            invokeinterface:void(\u6b0d\uf9c5\ucfaf\ud36e\ub102::\ua61f\u0a06\u3bc9\ufe34\uc9f6\u8258, invokeinterface:\u6b0d\uf9c5\ucfaf\ud36e\ub102(\u6b0d\uf9c5\ucfaf\ud36e\ub102::\ub70c\u600f\u93a2\uc910\u9937\u946b, invokevirtual:\u6b0d\uf9c5\ucfaf\ud36e\ub102(\u6b0d\uf9c5\ucfaf\ud36e\ub102::\u8d90\u9255\u3bd6\u5d20\ub83f\u1187, var_3_60:\u760c\u7ce1\u9a18\ub32d\u6d99\ub6ab[expected:\u6b0d\uf9c5\ucfaf\ud36e\ub102], ldc:double(15.5), ldc:double(15.5), ldc:double(15.5)), ldc:float(0.9f), ldc:float(0.9f), ldc:float(0.0f), ldc:float(0.2f)))
                            invokeinterface:void(\u6b0d\uf9c5\ucfaf\ud36e\ub102::\ua61f\u0a06\u3bc9\ufe34\uc9f6\u8258, invokeinterface:\u6b0d\uf9c5\ucfaf\ud36e\ub102(\u6b0d\uf9c5\ucfaf\ud36e\ub102::\ub70c\u600f\u93a2\uc910\u9937\u946b, invokevirtual:\u6b0d\uf9c5\ucfaf\ud36e\ub102(\u6b0d\uf9c5\ucfaf\ud36e\ub102::\u8d90\u9255\u3bd6\u5d20\ub83f\u1187, var_3_60:\u760c\u7ce1\u9a18\ub32d\u6d99\ub6ab[expected:\u6b0d\uf9c5\ucfaf\ud36e\ub102], ldc:double(15.5), ldc:double(0.5), ldc:double(15.5)), ldc:float(0.9f), ldc:float(0.9f), ldc:float(0.0f), ldc:float(0.2f)))
                            invokeinterface:void(\u6b0d\uf9c5\ucfaf\ud36e\ub102::\ua61f\u0a06\u3bc9\ufe34\uc9f6\u8258, invokeinterface:\u6b0d\uf9c5\ucfaf\ud36e\ub102(\u6b0d\uf9c5\ucfaf\ud36e\ub102::\ub70c\u600f\u93a2\uc910\u9937\u946b, invokevirtual:\u6b0d\uf9c5\ucfaf\ud36e\ub102(\u6b0d\uf9c5\ucfaf\ud36e\ub102::\u8d90\u9255\u3bd6\u5d20\ub83f\u1187, var_3_60:\u760c\u7ce1\u9a18\ub32d\u6d99\ub6ab[expected:\u6b0d\uf9c5\ucfaf\ud36e\ub102], ldc:double(0.5), ldc:double(0.5), ldc:double(15.5)), ldc:float(0.9f), ldc:float(0.9f), ldc:float(0.0f), ldc:float(0.2f)))
                            invokevirtual:void(\ub6ab\u8cae\u64ab\u5245\ubff1\u3711::\uc229\u12b2\u6cfe\u4492\u36d3\u5f50, var_2_5B:\ub6ab\u8cae\u64ab\u5245\ubff1\u3711)
                        }
                    }
                    
                    invokestatic:void(\u9af2\u6ec6\u983f\ua068\u8c8a::\uae87\ua3b4\u88c5\u8413\u7d52\u647c)
                }
                
                invokestatic:void(\u9af2\u6ec6\u983f\ua068\u8c8a::\u6435\uff55\u8640\ub6ab\u527a\u4179, ldc:boolean(1))
                invokestatic:void(\u9af2\u6ec6\u983f\ua068\u8c8a::\u6b5f\ua3b4\ua61f\ub70c\u5140\u6bb9)
                invokestatic:void(\u9af2\u6ec6\u983f\ua068\u8c8a::\u5f50\uc29a\u3a62\uceb8\ud171\uc2e8)
                invokestatic:void(\u9af2\u6ec6\u983f\ua068\u8c8a::\u97e6\u9255\u59ec\ube23\u64f2\ub32d)
            }
            
            if (cmpne:boolean(getfield:\ub102\u5654\u8413\u3e75\u416d\u8640(\u9937\u7d52\u3e75\u98a4\u8aa5\u7006::\u7af6\u836c\u6b0d\u5140\u927d\u61a4, this:\u9937\u7d52\u3e75\u98a4\u8aa5\u7006), aconstnull:\ub102\u5654\u8413\u3e75\u416d\u8640())) {
                invokestatic:void(\u9af2\u6ec6\u983f\ua068\u8c8a::\u836c\uc29a\uceb8\u3e75\ub32d\u4ab3)
                invokestatic:void(\u9af2\u6ec6\u983f\ua068\u8c8a::\u8389\ua3b4\u3d4b\ud36e\u67e9\ubefe)
                invokestatic:void(\u9af2\u6ec6\u983f\ua068\u8c8a::\uc9f6\u7049\u92ee\ube23\u3c25\u6d99)
                invokestatic:void(\u9af2\u6ec6\u983f\ua068\u8c8a::\u3d4b\u74b1\u3711\u5bc4\uf9c5\ub32d)
                invokestatic:void(\u9af2\u6ec6\u983f\ua068\u8c8a::\ubcb0\u494c\ua562\u69d9\ucfaf\u927d, ldc:float(10.0f))
                invokestatic:void(\u9af2\u6ec6\u983f\ua068\u8c8a::\u6c52\u416d\u385b\ud7e8\ufcaf\u9937)
                invokestatic:void(\u9af2\u6ec6\u983f\ua068\u8c8a::\u93a2\ube23\u624e\u6fb0\u4daf\u92ee, d2f:float(sub:double(getfield:double(\u7049\u4ab3\u4c04\u8bb0\uc3e3\u3d4b::\u759a\u6c56\u8640\u88c5\u647c\u8709, getfield:\u7049\u4ab3\u4c04\u8bb0\uc3e3\u3d4b(\u9937\u7d52\u3e75\u98a4\u8aa5\u7006::\uae87\u88c5\u69d9\u3c25\uf995\u6b0d, this:\u9937\u7d52\u3e75\u98a4\u8aa5\u7006)), getfield:double(\u3a62\u5d20\u4f52\uc229\u8308\ud7e8::\ubf56\u4c04\u4492\u36d3\u71f1\u12cb, invokevirtual:\u3a62\u5d20\u4f52\uc229\u8308\ud7e8(\u836c\u8cae\ub18d\u836c\u8753\u59ec::\u8308\ub171\u6b5f\u16f6\u4cd9\ua562, p0:\u836c\u8cae\ub18d\u836c\u8753\u59ec)))), d2f:float(sub:double(getfield:double(\u7049\u4ab3\u4c04\u8bb0\uc3e3\u3d4b::\u61a4\u67e9\u8389\u4cd9\u3dd3\ua6bd, getfield:\u7049\u4ab3\u4c04\u8bb0\uc3e3\u3d4b(\u9937\u7d52\u3e75\u98a4\u8aa5\u7006::\uae87\u88c5\u69d9\u3c25\uf995\u6b0d, this:\u9937\u7d52\u3e75\u98a4\u8aa5\u7006)), getfield:double(\u3a62\u5d20\u4f52\uc229\u8308\ud7e8::\u6bb9\uc29a\u99f7\u7e3f\u6b5f\u156b, invokevirtual:\u3a62\u5d20\u4f52\uc229\u8308\ud7e8(\u836c\u8cae\ub18d\u836c\u8753\u59ec::\u8308\ub171\u6b5f\u16f6\u4cd9\ua562, p0:\u836c\u8cae\ub18d\u836c\u8753\u59ec)))), d2f:float(sub:double(getfield:double(\u7049\u4ab3\u4c04\u8bb0\uc3e3\u3d4b::\u7006\u1833\u4e72\u7c6b\u527a\uc3e3, getfield:\u7049\u4ab3\u4c04\u8bb0\uc3e3\u3d4b(\u9937\u7d52\u3e75\u98a4\u8aa5\u7006::\uae87\u88c5\u69d9\u3c25\uf995\u6b0d, this:\u9937\u7d52\u3e75\u98a4\u8aa5\u7006)), getfield:double(\u3a62\u5d20\u4f52\uc229\u8308\ud7e8::\ub7dc\ubff1\ub19c\u6198\uc2e8\ufe34, invokevirtual:\u3a62\u5d20\u4f52\uc229\u8308\ud7e8(\u836c\u8cae\ub18d\u836c\u8753\u59ec::\u8308\ub171\u6b5f\u16f6\u4cd9\ua562, p0:\u836c\u8cae\ub18d\u836c\u8753\u59ec)))))
                invokestatic:void(\u9af2\u6ec6\u983f\ua068\u8c8a::\u6435\uff55\u8640\ub6ab\u527a\u4179, ldc:boolean(1))
                invokevirtual:void(\u760c\u7ce1\u9a18\ub32d\u6d99\ub6ab::\u12cb\u9937\uc246\u5fe1\ubefe\u494c, var_3_60:\u760c\u7ce1\u9a18\ub32d\u6d99\ub6ab, ldc:int(7), getstatic:\u74b1\u6d69\ud4fe\u4179\u8c8a\u965f(\u6d69\u4c04\ub113\u92ff\u3e75\u12b2::\u40a9\u8709\ud523\ub171\u446c\u7e3f))
                invokespecial:void(\u9937\u7d52\u3e75\u98a4\u8aa5\u7006::\u446c\ucfaf\u8413\u3711\u5f50\ubb2b, this:\u9937\u7d52\u3e75\u98a4\u8aa5\u7006, var_3_60:\u760c\u7ce1\u9a18\ub32d\u6d99\ub6ab[expected:\u6b0d\uf9c5\ucfaf\ud36e\ub102], ldc:int(0), ldc:int(1), ldc:int(2), ldc:int(3), ldc:int(0), ldc:int(1), ldc:int(1))
                invokespecial:void(\u9937\u7d52\u3e75\u98a4\u8aa5\u7006::\u446c\ucfaf\u8413\u3711\u5f50\ubb2b, this:\u9937\u7d52\u3e75\u98a4\u8aa5\u7006, var_3_60:\u760c\u7ce1\u9a18\ub32d\u6d99\ub6ab[expected:\u6b0d\uf9c5\ucfaf\ud36e\ub102], ldc:int(4), ldc:int(5), ldc:int(6), ldc:int(7), ldc:int(1), ldc:int(0), ldc:int(0))
                invokespecial:void(\u9937\u7d52\u3e75\u98a4\u8aa5\u7006::\u446c\ucfaf\u8413\u3711\u5f50\ubb2b, this:\u9937\u7d52\u3e75\u98a4\u8aa5\u7006, var_3_60:\u760c\u7ce1\u9a18\ub32d\u6d99\ub6ab[expected:\u6b0d\uf9c5\ucfaf\ud36e\ub102], ldc:int(0), ldc:int(1), ldc:int(5), ldc:int(4), ldc:int(1), ldc:int(1), ldc:int(0))
                invokespecial:void(\u9937\u7d52\u3e75\u98a4\u8aa5\u7006::\u446c\ucfaf\u8413\u3711\u5f50\ubb2b, this:\u9937\u7d52\u3e75\u98a4\u8aa5\u7006, var_3_60:\u760c\u7ce1\u9a18\ub32d\u6d99\ub6ab[expected:\u6b0d\uf9c5\ucfaf\ud36e\ub102], ldc:int(2), ldc:int(3), ldc:int(7), ldc:int(6), ldc:int(0), ldc:int(0), ldc:int(1))
                invokespecial:void(\u9937\u7d52\u3e75\u98a4\u8aa5\u7006::\u446c\ucfaf\u8413\u3711\u5f50\ubb2b, this:\u9937\u7d52\u3e75\u98a4\u8aa5\u7006, var_3_60:\u760c\u7ce1\u9a18\ub32d\u6d99\ub6ab[expected:\u6b0d\uf9c5\ucfaf\ud36e\ub102], ldc:int(0), ldc:int(4), ldc:int(7), ldc:int(3), ldc:int(0), ldc:int(1), ldc:int(0))
                invokespecial:void(\u9937\u7d52\u3e75\u98a4\u8aa5\u7006::\u446c\ucfaf\u8413\u3711\u5f50\ubb2b, this:\u9937\u7d52\u3e75\u98a4\u8aa5\u7006, var_3_60:\u760c\u7ce1\u9a18\ub32d\u6d99\ub6ab[expected:\u6b0d\uf9c5\ucfaf\ud36e\ub102], ldc:int(1), ldc:int(5), ldc:int(6), ldc:int(2), ldc:int(1), ldc:int(0), ldc:int(1))
                invokevirtual:void(\ub6ab\u8cae\u64ab\u5245\ubff1\u3711::\uc229\u12b2\u6cfe\u4492\u36d3\u5f50, var_2_5B:\ub6ab\u8cae\u64ab\u5245\ubff1\u3711)
                invokestatic:void(\u9af2\u6ec6\u983f\ua068\u8c8a::\u6435\uff55\u8640\ub6ab\u527a\u4179, ldc:boolean(0))
                invokevirtual:void(\u760c\u7ce1\u9a18\ub32d\u6d99\ub6ab::\u12cb\u9937\uc246\u5fe1\ubefe\u494c, var_3_60:\u760c\u7ce1\u9a18\ub32d\u6d99\ub6ab, ldc:int(1), getstatic:\u74b1\u6d69\ud4fe\u4179\u8c8a\u965f(\u6d69\u4c04\ub113\u92ff\u3e75\u12b2::\u983f\u3e2a\u7e3f\u4ab3\u99f7\u7bad))
                invokestatic:void(\u9af2\u6ec6\u983f\ua068\u8c8a::\u8d90\u92ff\uc84e\u3dd3\uf9c5\u8308, ldc:float(1.0f), ldc:float(1.0f), ldc:float(1.0f), ldc:float(1.0f))
                invokespecial:void(\u9937\u7d52\u3e75\u98a4\u8aa5\u7006::\u6b0d\u67d0\ud171\u69d9\u93a2\uc9f6, this:\u9937\u7d52\u3e75\u98a4\u8aa5\u7006, var_3_60:\u760c\u7ce1\u9a18\ub32d\u6d99\ub6ab[expected:\u6b0d\uf9c5\ucfaf\ud36e\ub102], ldc:int(0))
                invokespecial:void(\u9937\u7d52\u3e75\u98a4\u8aa5\u7006::\u6b0d\u67d0\ud171\u69d9\u93a2\uc9f6, this:\u9937\u7d52\u3e75\u98a4\u8aa5\u7006, var_3_60:\u760c\u7ce1\u9a18\ub32d\u6d99\ub6ab[expected:\u6b0d\uf9c5\ucfaf\ud36e\ub102], ldc:int(1))
                invokespecial:void(\u9937\u7d52\u3e75\u98a4\u8aa5\u7006::\u6b0d\u67d0\ud171\u69d9\u93a2\uc9f6, this:\u9937\u7d52\u3e75\u98a4\u8aa5\u7006, var_3_60:\u760c\u7ce1\u9a18\ub32d\u6d99\ub6ab[expected:\u6b0d\uf9c5\ucfaf\ud36e\ub102], ldc:int(1))
                invokespecial:void(\u9937\u7d52\u3e75\u98a4\u8aa5\u7006::\u6b0d\u67d0\ud171\u69d9\u93a2\uc9f6, this:\u9937\u7d52\u3e75\u98a4\u8aa5\u7006, var_3_60:\u760c\u7ce1\u9a18\ub32d\u6d99\ub6ab[expected:\u6b0d\uf9c5\ucfaf\ud36e\ub102], ldc:int(2))
                invokespecial:void(\u9937\u7d52\u3e75\u98a4\u8aa5\u7006::\u6b0d\u67d0\ud171\u69d9\u93a2\uc9f6, this:\u9937\u7d52\u3e75\u98a4\u8aa5\u7006, var_3_60:\u760c\u7ce1\u9a18\ub32d\u6d99\ub6ab[expected:\u6b0d\uf9c5\ucfaf\ud36e\ub102], ldc:int(2))
                invokespecial:void(\u9937\u7d52\u3e75\u98a4\u8aa5\u7006::\u6b0d\u67d0\ud171\u69d9\u93a2\uc9f6, this:\u9937\u7d52\u3e75\u98a4\u8aa5\u7006, var_3_60:\u760c\u7ce1\u9a18\ub32d\u6d99\ub6ab[expected:\u6b0d\uf9c5\ucfaf\ud36e\ub102], ldc:int(3))
                invokespecial:void(\u9937\u7d52\u3e75\u98a4\u8aa5\u7006::\u6b0d\u67d0\ud171\u69d9\u93a2\uc9f6, this:\u9937\u7d52\u3e75\u98a4\u8aa5\u7006, var_3_60:\u760c\u7ce1\u9a18\ub32d\u6d99\ub6ab[expected:\u6b0d\uf9c5\ucfaf\ud36e\ub102], ldc:int(3))
                invokespecial:void(\u9937\u7d52\u3e75\u98a4\u8aa5\u7006::\u6b0d\u67d0\ud171\u69d9\u93a2\uc9f6, this:\u9937\u7d52\u3e75\u98a4\u8aa5\u7006, var_3_60:\u760c\u7ce1\u9a18\ub32d\u6d99\ub6ab[expected:\u6b0d\uf9c5\ucfaf\ud36e\ub102], ldc:int(0))
                invokespecial:void(\u9937\u7d52\u3e75\u98a4\u8aa5\u7006::\u6b0d\u67d0\ud171\u69d9\u93a2\uc9f6, this:\u9937\u7d52\u3e75\u98a4\u8aa5\u7006, var_3_60:\u760c\u7ce1\u9a18\ub32d\u6d99\ub6ab[expected:\u6b0d\uf9c5\ucfaf\ud36e\ub102], ldc:int(4))
                invokespecial:void(\u9937\u7d52\u3e75\u98a4\u8aa5\u7006::\u6b0d\u67d0\ud171\u69d9\u93a2\uc9f6, this:\u9937\u7d52\u3e75\u98a4\u8aa5\u7006, var_3_60:\u760c\u7ce1\u9a18\ub32d\u6d99\ub6ab[expected:\u6b0d\uf9c5\ucfaf\ud36e\ub102], ldc:int(5))
                invokespecial:void(\u9937\u7d52\u3e75\u98a4\u8aa5\u7006::\u6b0d\u67d0\ud171\u69d9\u93a2\uc9f6, this:\u9937\u7d52\u3e75\u98a4\u8aa5\u7006, var_3_60:\u760c\u7ce1\u9a18\ub32d\u6d99\ub6ab[expected:\u6b0d\uf9c5\ucfaf\ud36e\ub102], ldc:int(5))
                invokespecial:void(\u9937\u7d52\u3e75\u98a4\u8aa5\u7006::\u6b0d\u67d0\ud171\u69d9\u93a2\uc9f6, this:\u9937\u7d52\u3e75\u98a4\u8aa5\u7006, var_3_60:\u760c\u7ce1\u9a18\ub32d\u6d99\ub6ab[expected:\u6b0d\uf9c5\ucfaf\ud36e\ub102], ldc:int(6))
                invokespecial:void(\u9937\u7d52\u3e75\u98a4\u8aa5\u7006::\u6b0d\u67d0\ud171\u69d9\u93a2\uc9f6, this:\u9937\u7d52\u3e75\u98a4\u8aa5\u7006, var_3_60:\u760c\u7ce1\u9a18\ub32d\u6d99\ub6ab[expected:\u6b0d\uf9c5\ucfaf\ud36e\ub102], ldc:int(6))
                invokespecial:void(\u9937\u7d52\u3e75\u98a4\u8aa5\u7006::\u6b0d\u67d0\ud171\u69d9\u93a2\uc9f6, this:\u9937\u7d52\u3e75\u98a4\u8aa5\u7006, var_3_60:\u760c\u7ce1\u9a18\ub32d\u6d99\ub6ab[expected:\u6b0d\uf9c5\ucfaf\ud36e\ub102], ldc:int(7))
                invokespecial:void(\u9937\u7d52\u3e75\u98a4\u8aa5\u7006::\u6b0d\u67d0\ud171\u69d9\u93a2\uc9f6, this:\u9937\u7d52\u3e75\u98a4\u8aa5\u7006, var_3_60:\u760c\u7ce1\u9a18\ub32d\u6d99\ub6ab[expected:\u6b0d\uf9c5\ucfaf\ud36e\ub102], ldc:int(7))
                invokespecial:void(\u9937\u7d52\u3e75\u98a4\u8aa5\u7006::\u6b0d\u67d0\ud171\u69d9\u93a2\uc9f6, this:\u9937\u7d52\u3e75\u98a4\u8aa5\u7006, var_3_60:\u760c\u7ce1\u9a18\ub32d\u6d99\ub6ab[expected:\u6b0d\uf9c5\ucfaf\ud36e\ub102], ldc:int(4))
                invokespecial:void(\u9937\u7d52\u3e75\u98a4\u8aa5\u7006::\u6b0d\u67d0\ud171\u69d9\u93a2\uc9f6, this:\u9937\u7d52\u3e75\u98a4\u8aa5\u7006, var_3_60:\u760c\u7ce1\u9a18\ub32d\u6d99\ub6ab[expected:\u6b0d\uf9c5\ucfaf\ud36e\ub102], ldc:int(0))
                invokespecial:void(\u9937\u7d52\u3e75\u98a4\u8aa5\u7006::\u6b0d\u67d0\ud171\u69d9\u93a2\uc9f6, this:\u9937\u7d52\u3e75\u98a4\u8aa5\u7006, var_3_60:\u760c\u7ce1\u9a18\ub32d\u6d99\ub6ab[expected:\u6b0d\uf9c5\ucfaf\ud36e\ub102], ldc:int(4))
                invokespecial:void(\u9937\u7d52\u3e75\u98a4\u8aa5\u7006::\u6b0d\u67d0\ud171\u69d9\u93a2\uc9f6, this:\u9937\u7d52\u3e75\u98a4\u8aa5\u7006, var_3_60:\u760c\u7ce1\u9a18\ub32d\u6d99\ub6ab[expected:\u6b0d\uf9c5\ucfaf\ud36e\ub102], ldc:int(1))
                invokespecial:void(\u9937\u7d52\u3e75\u98a4\u8aa5\u7006::\u6b0d\u67d0\ud171\u69d9\u93a2\uc9f6, this:\u9937\u7d52\u3e75\u98a4\u8aa5\u7006, var_3_60:\u760c\u7ce1\u9a18\ub32d\u6d99\ub6ab[expected:\u6b0d\uf9c5\ucfaf\ud36e\ub102], ldc:int(5))
                invokespecial:void(\u9937\u7d52\u3e75\u98a4\u8aa5\u7006::\u6b0d\u67d0\ud171\u69d9\u93a2\uc9f6, this:\u9937\u7d52\u3e75\u98a4\u8aa5\u7006, var_3_60:\u760c\u7ce1\u9a18\ub32d\u6d99\ub6ab[expected:\u6b0d\uf9c5\ucfaf\ud36e\ub102], ldc:int(2))
                invokespecial:void(\u9937\u7d52\u3e75\u98a4\u8aa5\u7006::\u6b0d\u67d0\ud171\u69d9\u93a2\uc9f6, this:\u9937\u7d52\u3e75\u98a4\u8aa5\u7006, var_3_60:\u760c\u7ce1\u9a18\ub32d\u6d99\ub6ab[expected:\u6b0d\uf9c5\ucfaf\ud36e\ub102], ldc:int(6))
                invokespecial:void(\u9937\u7d52\u3e75\u98a4\u8aa5\u7006::\u6b0d\u67d0\ud171\u69d9\u93a2\uc9f6, this:\u9937\u7d52\u3e75\u98a4\u8aa5\u7006, var_3_60:\u760c\u7ce1\u9a18\ub32d\u6d99\ub6ab[expected:\u6b0d\uf9c5\ucfaf\ud36e\ub102], ldc:int(3))
                invokespecial:void(\u9937\u7d52\u3e75\u98a4\u8aa5\u7006::\u6b0d\u67d0\ud171\u69d9\u93a2\uc9f6, this:\u9937\u7d52\u3e75\u98a4\u8aa5\u7006, var_3_60:\u760c\u7ce1\u9a18\ub32d\u6d99\ub6ab[expected:\u6b0d\uf9c5\ucfaf\ud36e\ub102], ldc:int(7))
                invokevirtual:void(\ub6ab\u8cae\u64ab\u5245\ubff1\u3711::\uc229\u12b2\u6cfe\u4492\u36d3\u5f50, var_2_5B:\ub6ab\u8cae\u64ab\u5245\ubff1\u3711)
                invokestatic:void(\u9af2\u6ec6\u983f\ua068\u8c8a::\uae87\ua3b4\u88c5\u8413\u7d52\u647c)
                invokestatic:void(\u9af2\u6ec6\u983f\ua068\u8c8a::\u6435\uff55\u8640\ub6ab\u527a\u4179, ldc:boolean(1))
                invokestatic:void(\u9af2\u6ec6\u983f\ua068\u8c8a::\u6b5f\ua3b4\ua61f\ub70c\u5140\u6bb9)
                invokestatic:void(\u9af2\u6ec6\u983f\ua068\u8c8a::\u5f50\uc29a\u3a62\uceb8\ud171\uc2e8)
                invokestatic:void(\u9af2\u6ec6\u983f\ua068\u8c8a::\u97e6\u9255\u59ec\ube23\u64f2\ub32d)
                invokestatic:void(\u9af2\u6ec6\u983f\ua068\u8c8a::\ubcb0\u494c\ua562\u69d9\ucfaf\u927d, ldc:float(1.0f))
            }
            
            return:void()
        }
        
        goto(Label_0006)
    }
    
    private void \u6b0d\u67d0\ud171\u69d9\u93a2\uc9f6(\u59ec\u8413\u97e6\uc229\u3776.\u6b0d\uf9c5\ucfaf\ud36e\ub102 p0, int p1) {
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
            invokeinterface:void(\u6b0d\uf9c5\ucfaf\ud36e\ub102::\ua61f\u0a06\u3bc9\ufe34\uc9f6\u8258, invokeinterface:\u6b0d\uf9c5\ucfaf\ud36e\ub102(\u6b0d\uf9c5\ucfaf\ud36e\ub102::\u8d90\u9255\u3bd6\u5d20\ub83f\u1187, p0:\u6b0d\uf9c5\ucfaf\ud36e\ub102, f2d:double(invokevirtual:float(\ub113\uc87f\ubb2b\u4e72\u3e75\ub70c::\u946b\ucfaf\u4bc8\u76bc\ucfaf\u960f, loadelement:\ub113\uc87f\ubb2b\u4e72\u3e75\ub70c(getfield:\ub113\uc87f\ubb2b\u4e72\u3e75\ub70c[](\u9937\u7d52\u3e75\u98a4\u8aa5\u7006::\ud158\uf995\uceb8\u600f\u5245\u4cd9, this:\u9937\u7d52\u3e75\u98a4\u8aa5\u7006), p1:int))), f2d:double(invokevirtual:float(\ub113\uc87f\ubb2b\u4e72\u3e75\ub70c::\u4492\u5654\ub32d\u3e75\u8d98\u600f, loadelement:\ub113\uc87f\ubb2b\u4e72\u3e75\ub70c(getfield:\ub113\uc87f\ubb2b\u4e72\u3e75\ub70c[](\u9937\u7d52\u3e75\u98a4\u8aa5\u7006::\ud158\uf995\uceb8\u600f\u5245\u4cd9, this:\u9937\u7d52\u3e75\u98a4\u8aa5\u7006), p1:int))), f2d:double(invokevirtual:float(\ub113\uc87f\ubb2b\u4e72\u3e75\ub70c::\u4daf\u16f6\uc238\uc84e\u960f\u51fa, loadelement:\ub113\uc87f\ubb2b\u4e72\u3e75\ub70c(getfield:\ub113\uc87f\ubb2b\u4e72\u3e75\ub70c[](\u9937\u7d52\u3e75\u98a4\u8aa5\u7006::\ud158\uf995\uceb8\u600f\u5245\u4cd9, this:\u9937\u7d52\u3e75\u98a4\u8aa5\u7006), p1:int)))))
            return:void()
        }
        
        goto(Label_0006)
    }
    
    private void \u446c\ucfaf\u8413\u3711\u5f50\ubb2b(\u59ec\u8413\u97e6\uc229\u3776.\u6b0d\uf9c5\ucfaf\ud36e\ub102 p0, int p1, int p2, int p3, int p4, int p5, int p6, int p7) {
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
            invokeinterface:void(\u6b0d\uf9c5\ucfaf\ud36e\ub102::\ua61f\u0a06\u3bc9\ufe34\uc9f6\u8258, invokeinterface:\u6b0d\uf9c5\ucfaf\ud36e\ub102(\u6b0d\uf9c5\ucfaf\ud36e\ub102::\ub70c\u600f\u93a2\uc910\u9937\u946b, invokeinterface:\u6b0d\uf9c5\ucfaf\ud36e\ub102(\u6b0d\uf9c5\ucfaf\ud36e\ub102::\u8d90\u9255\u3bd6\u5d20\ub83f\u1187, p0:\u6b0d\uf9c5\ucfaf\ud36e\ub102, f2d:double(invokevirtual:float(\ub113\uc87f\ubb2b\u4e72\u3e75\ub70c::\u946b\ucfaf\u4bc8\u76bc\ucfaf\u960f, loadelement:\ub113\uc87f\ubb2b\u4e72\u3e75\ub70c(getfield:\ub113\uc87f\ubb2b\u4e72\u3e75\ub70c[](\u9937\u7d52\u3e75\u98a4\u8aa5\u7006::\ud158\uf995\uceb8\u600f\u5245\u4cd9, this:\u9937\u7d52\u3e75\u98a4\u8aa5\u7006), p1:int))), f2d:double(invokevirtual:float(\ub113\uc87f\ubb2b\u4e72\u3e75\ub70c::\u4492\u5654\ub32d\u3e75\u8d98\u600f, loadelement:\ub113\uc87f\ubb2b\u4e72\u3e75\ub70c(getfield:\ub113\uc87f\ubb2b\u4e72\u3e75\ub70c[](\u9937\u7d52\u3e75\u98a4\u8aa5\u7006::\ud158\uf995\uceb8\u600f\u5245\u4cd9, this:\u9937\u7d52\u3e75\u98a4\u8aa5\u7006), p1:int))), f2d:double(invokevirtual:float(\ub113\uc87f\ubb2b\u4e72\u3e75\ub70c::\u4daf\u16f6\uc238\uc84e\u960f\u51fa, loadelement:\ub113\uc87f\ubb2b\u4e72\u3e75\ub70c(getfield:\ub113\uc87f\ubb2b\u4e72\u3e75\ub70c[](\u9937\u7d52\u3e75\u98a4\u8aa5\u7006::\ud158\uf995\uceb8\u600f\u5245\u4cd9, this:\u9937\u7d52\u3e75\u98a4\u8aa5\u7006), p1:int)))), i2f:float(p5:int), i2f:float(p6:int), i2f:float(p7:int), ldc:float(0.25f)))
            invokeinterface:void(\u6b0d\uf9c5\ucfaf\ud36e\ub102::\ua61f\u0a06\u3bc9\ufe34\uc9f6\u8258, invokeinterface:\u6b0d\uf9c5\ucfaf\ud36e\ub102(\u6b0d\uf9c5\ucfaf\ud36e\ub102::\ub70c\u600f\u93a2\uc910\u9937\u946b, invokeinterface:\u6b0d\uf9c5\ucfaf\ud36e\ub102(\u6b0d\uf9c5\ucfaf\ud36e\ub102::\u8d90\u9255\u3bd6\u5d20\ub83f\u1187, p0:\u6b0d\uf9c5\ucfaf\ud36e\ub102, f2d:double(invokevirtual:float(\ub113\uc87f\ubb2b\u4e72\u3e75\ub70c::\u946b\ucfaf\u4bc8\u76bc\ucfaf\u960f, loadelement:\ub113\uc87f\ubb2b\u4e72\u3e75\ub70c(getfield:\ub113\uc87f\ubb2b\u4e72\u3e75\ub70c[](\u9937\u7d52\u3e75\u98a4\u8aa5\u7006::\ud158\uf995\uceb8\u600f\u5245\u4cd9, this:\u9937\u7d52\u3e75\u98a4\u8aa5\u7006), p2:int))), f2d:double(invokevirtual:float(\ub113\uc87f\ubb2b\u4e72\u3e75\ub70c::\u4492\u5654\ub32d\u3e75\u8d98\u600f, loadelement:\ub113\uc87f\ubb2b\u4e72\u3e75\ub70c(getfield:\ub113\uc87f\ubb2b\u4e72\u3e75\ub70c[](\u9937\u7d52\u3e75\u98a4\u8aa5\u7006::\ud158\uf995\uceb8\u600f\u5245\u4cd9, this:\u9937\u7d52\u3e75\u98a4\u8aa5\u7006), p2:int))), f2d:double(invokevirtual:float(\ub113\uc87f\ubb2b\u4e72\u3e75\ub70c::\u4daf\u16f6\uc238\uc84e\u960f\u51fa, loadelement:\ub113\uc87f\ubb2b\u4e72\u3e75\ub70c(getfield:\ub113\uc87f\ubb2b\u4e72\u3e75\ub70c[](\u9937\u7d52\u3e75\u98a4\u8aa5\u7006::\ud158\uf995\uceb8\u600f\u5245\u4cd9, this:\u9937\u7d52\u3e75\u98a4\u8aa5\u7006), p2:int)))), i2f:float(p5:int), i2f:float(p6:int), i2f:float(p7:int), ldc:float(0.25f)))
            invokeinterface:void(\u6b0d\uf9c5\ucfaf\ud36e\ub102::\ua61f\u0a06\u3bc9\ufe34\uc9f6\u8258, invokeinterface:\u6b0d\uf9c5\ucfaf\ud36e\ub102(\u6b0d\uf9c5\ucfaf\ud36e\ub102::\ub70c\u600f\u93a2\uc910\u9937\u946b, invokeinterface:\u6b0d\uf9c5\ucfaf\ud36e\ub102(\u6b0d\uf9c5\ucfaf\ud36e\ub102::\u8d90\u9255\u3bd6\u5d20\ub83f\u1187, p0:\u6b0d\uf9c5\ucfaf\ud36e\ub102, f2d:double(invokevirtual:float(\ub113\uc87f\ubb2b\u4e72\u3e75\ub70c::\u946b\ucfaf\u4bc8\u76bc\ucfaf\u960f, loadelement:\ub113\uc87f\ubb2b\u4e72\u3e75\ub70c(getfield:\ub113\uc87f\ubb2b\u4e72\u3e75\ub70c[](\u9937\u7d52\u3e75\u98a4\u8aa5\u7006::\ud158\uf995\uceb8\u600f\u5245\u4cd9, this:\u9937\u7d52\u3e75\u98a4\u8aa5\u7006), p3:int))), f2d:double(invokevirtual:float(\ub113\uc87f\ubb2b\u4e72\u3e75\ub70c::\u4492\u5654\ub32d\u3e75\u8d98\u600f, loadelement:\ub113\uc87f\ubb2b\u4e72\u3e75\ub70c(getfield:\ub113\uc87f\ubb2b\u4e72\u3e75\ub70c[](\u9937\u7d52\u3e75\u98a4\u8aa5\u7006::\ud158\uf995\uceb8\u600f\u5245\u4cd9, this:\u9937\u7d52\u3e75\u98a4\u8aa5\u7006), p3:int))), f2d:double(invokevirtual:float(\ub113\uc87f\ubb2b\u4e72\u3e75\ub70c::\u4daf\u16f6\uc238\uc84e\u960f\u51fa, loadelement:\ub113\uc87f\ubb2b\u4e72\u3e75\ub70c(getfield:\ub113\uc87f\ubb2b\u4e72\u3e75\ub70c[](\u9937\u7d52\u3e75\u98a4\u8aa5\u7006::\ud158\uf995\uceb8\u600f\u5245\u4cd9, this:\u9937\u7d52\u3e75\u98a4\u8aa5\u7006), p3:int)))), i2f:float(p5:int), i2f:float(p6:int), i2f:float(p7:int), ldc:float(0.25f)))
            invokeinterface:void(\u6b0d\uf9c5\ucfaf\ud36e\ub102::\ua61f\u0a06\u3bc9\ufe34\uc9f6\u8258, invokeinterface:\u6b0d\uf9c5\ucfaf\ud36e\ub102(\u6b0d\uf9c5\ucfaf\ud36e\ub102::\ub70c\u600f\u93a2\uc910\u9937\u946b, invokeinterface:\u6b0d\uf9c5\ucfaf\ud36e\ub102(\u6b0d\uf9c5\ucfaf\ud36e\ub102::\u8d90\u9255\u3bd6\u5d20\ub83f\u1187, p0:\u6b0d\uf9c5\ucfaf\ud36e\ub102, f2d:double(invokevirtual:float(\ub113\uc87f\ubb2b\u4e72\u3e75\ub70c::\u946b\ucfaf\u4bc8\u76bc\ucfaf\u960f, loadelement:\ub113\uc87f\ubb2b\u4e72\u3e75\ub70c(getfield:\ub113\uc87f\ubb2b\u4e72\u3e75\ub70c[](\u9937\u7d52\u3e75\u98a4\u8aa5\u7006::\ud158\uf995\uceb8\u600f\u5245\u4cd9, this:\u9937\u7d52\u3e75\u98a4\u8aa5\u7006), p4:int))), f2d:double(invokevirtual:float(\ub113\uc87f\ubb2b\u4e72\u3e75\ub70c::\u4492\u5654\ub32d\u3e75\u8d98\u600f, loadelement:\ub113\uc87f\ubb2b\u4e72\u3e75\ub70c(getfield:\ub113\uc87f\ubb2b\u4e72\u3e75\ub70c[](\u9937\u7d52\u3e75\u98a4\u8aa5\u7006::\ud158\uf995\uceb8\u600f\u5245\u4cd9, this:\u9937\u7d52\u3e75\u98a4\u8aa5\u7006), p4:int))), f2d:double(invokevirtual:float(\ub113\uc87f\ubb2b\u4e72\u3e75\ub70c::\u4daf\u16f6\uc238\uc84e\u960f\u51fa, loadelement:\ub113\uc87f\ubb2b\u4e72\u3e75\ub70c(getfield:\ub113\uc87f\ubb2b\u4e72\u3e75\ub70c[](\u9937\u7d52\u3e75\u98a4\u8aa5\u7006::\ud158\uf995\uceb8\u600f\u5245\u4cd9, this:\u9937\u7d52\u3e75\u98a4\u8aa5\u7006), p4:int)))), i2f:float(p5:int), i2f:float(p6:int), i2f:float(p7:int), ldc:float(0.25f)))
            return:void()
        }
        
        goto(Label_0006)
    }
    
    public void \uc4d2\u51fa\u965f\u6ec6\u8753\u88c5() {
        var_1_7A : ObjectIterator
        var_2_8D : \ub32d\u6b5f\u7049\u8753\u34df\u64ab
        
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
            putfield:int(\u9937\u7d52\u3e75\u98a4\u8aa5\u7006::\u3a62\ubcb0\u873d\u7873\u47c2\u8aa5, this:\u9937\u7d52\u3e75\u98a4\u8aa5\u7006, add:int(getfield:int(\u9937\u7d52\u3e75\u98a4\u8aa5\u7006::\u3a62\ubcb0\u873d\u7873\u47c2\u8aa5, this:\u9937\u7d52\u3e75\u98a4\u8aa5\u7006), ldc:int(1)))
            
            if (cmpeq:boolean(rem:int(getfield:int(\u9937\u7d52\u3e75\u98a4\u8aa5\u7006::\u3a62\ubcb0\u873d\u7873\u47c2\u8aa5, this:\u9937\u7d52\u3e75\u98a4\u8aa5\u7006), ldc:int(20)), ldc:int(0))) {
                var_1_7A = invokeinterface:ObjectIterator(ObjectCollection::iterator, invokeinterface:ObjectCollection(Int2ObjectMap::values, getfield:Int2ObjectMap<\ub32d\u6b5f\u7049\u8753\u34df\u64ab>(\u9937\u7d52\u3e75\u98a4\u8aa5\u7006::\uc238\u983f\uc3e3\u3bd6\u8308\u6c52, this:\u9937\u7d52\u3e75\u98a4\u8aa5\u7006)))
                
                while (invokeinterface:boolean(Iterator::hasNext, var_1_7A:Iterator)) {
                    var_2_8D = checkcast:\ub32d\u6b5f\u7049\u8753\u34df\u64ab(\u494c\u4975\ua068\u0c95\uc84e.\u7043\ubcb0\ub1b9\u759a\u4975.\ub32d\u6b5f\u7049\u8753\u34df\u64ab.class, invokeinterface:\ub32d\u6b5f\u7049\u8753\u34df\u64ab(Iterator<\ub32d\u6b5f\u7049\u8753\u34df\u64ab>::next, var_1_7A:Iterator<\ub32d\u6b5f\u7049\u8753\u34df\u64ab>))
                    
                    if (cmpgt:boolean(sub:int(getfield:int(\u9937\u7d52\u3e75\u98a4\u8aa5\u7006::\u3a62\ubcb0\u873d\u7873\u47c2\u8aa5, this:\u9937\u7d52\u3e75\u98a4\u8aa5\u7006), invokevirtual:int(\ub32d\u6b5f\u7049\u8753\u34df\u64ab::\u7e3f\u9033\u4179\ufe34\ua068\ub102, var_2_8D:\ub32d\u6b5f\u7049\u8753\u34df\u64ab)), ldc:int(400))) {
                        invokeinterface:void(Iterator<E>::remove, var_1_7A:Iterator<\ub32d\u6b5f\u7049\u8753\u34df\u64ab>)
                        invokespecial:void(\u9937\u7d52\u3e75\u98a4\u8aa5\u7006::\u6fb0\ub6ab\u385b\u1187\u6198\u61a4, this:\u9937\u7d52\u3e75\u98a4\u8aa5\u7006, var_2_8D:\ub32d\u6b5f\u7049\u8753\u34df\u64ab)
                    }
                }
            }
            
            if (logicaland:boolean(invokestatic:boolean(\u8308\u51fa\u6c56\u5db4\ub18d\u34df::\uceb8\u3e75\ube23\ua562\u8aa5\u3776), cmpeq:boolean(rem:int(getfield:int(\u9937\u7d52\u3e75\u98a4\u8aa5\u7006::\u3a62\ubcb0\u873d\u7873\u47c2\u8aa5, this:\u9937\u7d52\u3e75\u98a4\u8aa5\u7006), ldc:int(20)), ldc:int(0)))) {
                invokeinterface:void(Map<K, V>::clear, getfield:Map<\uf995\u4975\u1187\ubff1\u839e\u8389, Map>(\u9937\u7d52\u3e75\u98a4\u8aa5\u7006::\u8df4\u494c\ud7e8\ud217\ud158\u3e75, this:\u9937\u7d52\u3e75\u98a4\u8aa5\u7006))
            }
            
            return:void()
        }
        
        goto(Label_0006)
    }
    
    private void \u6fb0\ub6ab\u385b\u1187\u6198\u61a4(\u494c\u4975\ua068\u0c95\uc84e.\u7043\ubcb0\ub1b9\u759a\u4975.\ub32d\u6b5f\u7049\u8753\u34df\u64ab p0) {
        var_2_5F : long
        var_4_6D : Set
        
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
            var_2_5F = invokevirtual:long(\u6b0d\ud171\uc7fe\u52d3\uafe7\u6c56::\ubff1\u59ec\u183a\ub32d\u4e72\u0800, invokevirtual:\u6b0d\ud171\uc7fe\u52d3\uafe7\u6c56(\ub32d\u6b5f\u7049\u8753\u34df\u64ab::\u7af6\u76bc\uc7fe\u3a62\u74b1\uc29a, p0:\ub32d\u6b5f\u7049\u8753\u34df\u64ab))
            var_4_6D = checkcast:Set(java.util.Set.class, invokeinterface:Object[expected:Set](Long2ObjectMap::get, getfield:Long2ObjectMap<SortedSet<\ub32d\u6b5f\u7049\u8753\u34df\u64ab>>(\u9937\u7d52\u3e75\u98a4\u8aa5\u7006::\u0c95\u4ab3\u74b1\ub6ab\u624e\ufe34, this:\u9937\u7d52\u3e75\u98a4\u8aa5\u7006), var_2_5F:long))
            invokeinterface:boolean(Set::remove, var_4_6D:Set, p0:\ub32d\u6b5f\u7049\u8753\u34df\u64ab[expected:Object])
            
            if (invokeinterface:boolean(Set::isEmpty, var_4_6D:Set)) {
                invokeinterface:Object(Long2ObjectMap::remove, getfield:Long2ObjectMap<SortedSet<\ub32d\u6b5f\u7049\u8753\u34df\u64ab>>(\u9937\u7d52\u3e75\u98a4\u8aa5\u7006::\u0c95\u4ab3\u74b1\ub6ab\u624e\ufe34, this:\u9937\u7d52\u3e75\u98a4\u8aa5\u7006), var_2_5F:long)
            }
            
            return:void()
        }
        
        goto(Label_0006)
    }
    
    private void \ub8be\u5140\u6bb9\u4f52\u8640\uceb8(\u51fa\u12cb\u7330\u74b1\u6c52.\u76bc\u4975\ua6bd\u4daf\u8d98.\uafe7\uc7fe\u4c04\u6b5f\u5bc4 p0) {
        var_2_78 : \ub6ab\u8cae\u64ab\u5245\ubff1\u3711
        var_3_7D : \u760c\u7ce1\u9a18\ub32d\u6d99\ub6ab
        var_4_7F : int
        var_5_F2 : \uc87f\u5f50\u16f6\ub113\u52d3\u12b2
        var_6_FF : int
        var_7_103 : int
        var_8_107 : int
        var_9_13E : \u3a62\u5d20\u4f52\uc229\u8308\ud7e8
        
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
            
            if (invokestatic:boolean(\u8308\u51fa\u6c56\u5db4\ub18d\u34df::\u760c\uc2e8\ud12e\u6fb0\u624e\u4cd9)) {
                invokestatic:void(\u9af2\u6ec6\u983f\ua068\u8c8a::\u624e\u156b\u6c56\uc910\ub70c\u40a9)
                invokestatic:void(\u9af2\u6ec6\u983f\ua068\u8c8a::\uc9f6\u7049\u92ee\ube23\u3c25\u6d99)
                invokestatic:void(\u9af2\u6ec6\u983f\ua068\u8c8a::\u3d4b\u74b1\u3711\u5bc4\uf9c5\ub32d)
                invokestatic:void(\u9af2\u6ec6\u983f\ua068\u8c8a::\u6435\uff55\u8640\ub6ab\u527a\u4179, ldc:boolean(0))
                invokevirtual:void(\u4f52\ub7dc\u7bad\ud217\u76bc\u6d99::\u6ec6\u9a18\u92ff\u2dcc\ud12e\u7ce1, getfield:\u4f52\ub7dc\u7bad\ud217\u76bc\u6d99(\u9937\u7d52\u3e75\u98a4\u8aa5\u7006::\u12b2\u7d52\u6435\uc2e8\u69d9\u5654, this:\u9937\u7d52\u3e75\u98a4\u8aa5\u7006), getstatic:\u4179\ubb2b\uc7fe\u51fa\uc910\u8753(\u9937\u7d52\u3e75\u98a4\u8aa5\u7006::\u52d3\ub32d\u47c2\u92ff\u3a62\uc4d2))
                var_2_78 = invokestatic:\ub6ab\u8cae\u64ab\u5245\ubff1\u3711(\ub6ab\u8cae\u64ab\u5245\ubff1\u3711::\u3504\ud523\u99f7\u5140\u5d20\u983f)
                var_3_7D = invokevirtual:\u760c\u7ce1\u9a18\ub32d\u6d99\ub6ab(\ub6ab\u8cae\u64ab\u5245\ubff1\u3711::\u74b1\u7bad\u6435\uc87f\u6d69\uc238, var_2_78:\ub6ab\u8cae\u64ab\u5245\ubff1\u3711)
                var_4_7F = ldc:int(0)
                
                while (cmplt:boolean(var_4_7F:int, ldc:int(6))) {
                    invokevirtual:void(\uafe7\uc7fe\u4c04\u6b5f\u5bc4::\u9937\u7d52\u3e75\u98a4\u8aa5\u7006, p0:\uafe7\uc7fe\u4c04\u6b5f\u5bc4)
                    
                    if (cmpeq:boolean(var_4_7F:int, ldc:int(1))) {
                        invokevirtual:void(\uafe7\uc7fe\u4c04\u6b5f\u5bc4::\ucfaf\u1187\u4c2b\u8350\u5f50\uc910, p0:\uafe7\uc7fe\u4c04\u6b5f\u5bc4, invokevirtual:\ucef1\u6c52\u5654\u4cd9\u61a4\ua6bd(\uae5d\ua068\u9a18\u8413\u51fa\ub83f::\uc7fe\ub18d\ucfaf\ub7dc\ubcb0\u5140, getstatic:\uae5d\ua068\u9a18\u8413\u51fa\ub83f(\uae5d\ua068\u9a18\u8413\u51fa\ub83f::\u9af2\u4f52\ubf56\uc246\u839e\u1833), ldc:float(90.0f)))
                    }
                    
                    if (cmpeq:boolean(var_4_7F:int, ldc:int(2))) {
                        invokevirtual:void(\uafe7\uc7fe\u4c04\u6b5f\u5bc4::\ucfaf\u1187\u4c2b\u8350\u5f50\uc910, p0:\uafe7\uc7fe\u4c04\u6b5f\u5bc4, invokevirtual:\ucef1\u6c52\u5654\u4cd9\u61a4\ua6bd(\uae5d\ua068\u9a18\u8413\u51fa\ub83f::\uc7fe\ub18d\ucfaf\ub7dc\ubcb0\u5140, getstatic:\uae5d\ua068\u9a18\u8413\u51fa\ub83f(\uae5d\ua068\u9a18\u8413\u51fa\ub83f::\u9af2\u4f52\ubf56\uc246\u839e\u1833), ldc:float(-90.0f)))
                    }
                    
                    if (cmpeq:boolean(var_4_7F:int, ldc:int(3))) {
                        invokevirtual:void(\uafe7\uc7fe\u4c04\u6b5f\u5bc4::\ucfaf\u1187\u4c2b\u8350\u5f50\uc910, p0:\uafe7\uc7fe\u4c04\u6b5f\u5bc4, invokevirtual:\ucef1\u6c52\u5654\u4cd9\u61a4\ua6bd(\uae5d\ua068\u9a18\u8413\u51fa\ub83f::\uc7fe\ub18d\ucfaf\ub7dc\ubcb0\u5140, getstatic:\uae5d\ua068\u9a18\u8413\u51fa\ub83f(\uae5d\ua068\u9a18\u8413\u51fa\ub83f::\u9af2\u4f52\ubf56\uc246\u839e\u1833), ldc:float(180.0f)))
                    }
                    
                    if (cmpeq:boolean(var_4_7F:int, ldc:int(4))) {
                        invokevirtual:void(\uafe7\uc7fe\u4c04\u6b5f\u5bc4::\ucfaf\u1187\u4c2b\u8350\u5f50\uc910, p0:\uafe7\uc7fe\u4c04\u6b5f\u5bc4, invokevirtual:\ucef1\u6c52\u5654\u4cd9\u61a4\ua6bd(\uae5d\ua068\u9a18\u8413\u51fa\ub83f::\uc7fe\ub18d\ucfaf\ub7dc\ubcb0\u5140, getstatic:\uae5d\ua068\u9a18\u8413\u51fa\ub83f(\uae5d\ua068\u9a18\u8413\u51fa\ub83f::\u156b\u527a\u4cd9\u12cb\u0b8e\u51b2), ldc:float(90.0f)))
                    }
                    
                    if (cmpeq:boolean(var_4_7F:int, ldc:int(5))) {
                        invokevirtual:void(\uafe7\uc7fe\u4c04\u6b5f\u5bc4::\ucfaf\u1187\u4c2b\u8350\u5f50\uc910, p0:\uafe7\uc7fe\u4c04\u6b5f\u5bc4, invokevirtual:\ucef1\u6c52\u5654\u4cd9\u61a4\ua6bd(\uae5d\ua068\u9a18\u8413\u51fa\ub83f::\uc7fe\ub18d\ucfaf\ub7dc\ubcb0\u5140, getstatic:\uae5d\ua068\u9a18\u8413\u51fa\ub83f(\uae5d\ua068\u9a18\u8413\u51fa\ub83f::\u156b\u527a\u4cd9\u12cb\u0b8e\u51b2), ldc:float(-90.0f)))
                    }
                    
                    var_5_F2 = invokevirtual:\uc87f\u5f50\u16f6\ub113\u52d3\u12b2(\u3711\u6c52\ufcaf\u4bc8\ud158::\u6d99\uae87\u8aa5\u6c52\u4c2b\u88c5, invokevirtual:\u3711\u6c52\ufcaf\u4bc8\ud158(\uafe7\uc7fe\u4c04\u6b5f\u5bc4::\u9033\u12b2\u516c\u97e6\u6d99\ua3b4, p0:\uafe7\uc7fe\u4c04\u6b5f\u5bc4))
                    invokevirtual:void(\u760c\u7ce1\u9a18\ub32d\u6d99\ub6ab::\u12cb\u9937\uc246\u5fe1\ubefe\u494c, var_3_7D:\u760c\u7ce1\u9a18\ub32d\u6d99\ub6ab, ldc:int(7), getstatic:\u74b1\u6d69\ud4fe\u4179\u8c8a\u965f(\u6d69\u4c04\ub113\u92ff\u3e75\u12b2::\ubb2b\u98a4\u4e72\ubded\u64f2\uae5d))
                    var_6_FF = ldc:int(40)
                    var_7_103 = ldc:int(40)
                    var_8_107 = ldc:int(40)
                    
                    if (invokestatic:boolean(\u8308\u51fa\u6c56\u5db4\ub18d\u34df::\u1187\ubf56\u600f\ub1b9\ubf56\uc31c)) {
                        var_9_13E = invokestatic:\u3a62\u5d20\u4f52\uc229\u8308\ud7e8(\u6d69\u92ff\u983f\u873d\u8258\u40a9::\uc2e8\ub7dc\u385b\u0800\u51fa\ub18d, initobject:\u3a62\u5d20\u4f52\uc229\u8308\ud7e8(\u3a62\u5d20\u4f52\uc229\u8308\ud7e8::<init>, div:double(i2d:double(var_6_FF:int), ldc:double(255.0)), div:double(i2d:double(var_7_103:int), ldc:double(255.0)), div:double(i2d:double(var_8_107:int), ldc:double(255.0))), getfield:\u16f6\u61a4\u5db4\u4c04\u64ab\u9255[expected:\uf9c5\ud158\u4975\uf94d\ud523\uc31c](\u9937\u7d52\u3e75\u98a4\u8aa5\u7006::\ud51e\u9033\u8df4\u7043\u5f50\u8aa5, this:\u9937\u7d52\u3e75\u98a4\u8aa5\u7006), invokevirtual:\u7d52\u718f\u3776\u6fb0\ub83f(\u67e9\u4daf\u760c\ud217\ua6bd\ubff1::\u983f\uc229\u8aa5\u873d\u0b8e\u4975, getfield:\u67e9\u4daf\u760c\ud217\ua6bd\ubff1(\u9937\u7d52\u3e75\u98a4\u8aa5\u7006::\u8df4\u3776\ud171\u7006\u51b2\uf995, this:\u9937\u7d52\u3e75\u98a4\u8aa5\u7006)), ldc:float(0.0f))
                        var_6_FF = d2i:int(mul:double(getfield:double(\u3a62\u5d20\u4f52\uc229\u8308\ud7e8::\ubf56\u4c04\u4492\u36d3\u71f1\u12cb, var_9_13E:\u3a62\u5d20\u4f52\uc229\u8308\ud7e8), ldc:double(255.0)))
                        var_7_103 = d2i:int(mul:double(getfield:double(\u3a62\u5d20\u4f52\uc229\u8308\ud7e8::\u6bb9\uc29a\u99f7\u7e3f\u6b5f\u156b, var_9_13E:\u3a62\u5d20\u4f52\uc229\u8308\ud7e8), ldc:double(255.0)))
                        var_8_107 = d2i:int(mul:double(getfield:double(\u3a62\u5d20\u4f52\uc229\u8308\ud7e8::\ub7dc\ubff1\ub19c\u6198\uc2e8\ufe34, var_9_13E:\u3a62\u5d20\u4f52\uc229\u8308\ud7e8), ldc:double(255.0)))
                    }
                    
                    invokeinterface:void(\u6b0d\uf9c5\ucfaf\ud36e\ub102::\ua61f\u0a06\u3bc9\ufe34\uc9f6\u8258, invokeinterface:\u6b0d\uf9c5\ucfaf\ud36e\ub102(\u6b0d\uf9c5\ucfaf\ud36e\ub102::\ub70c\u600f\u93a2\uc910\u9937\u946b, invokeinterface:\u6b0d\uf9c5\ucfaf\ud36e\ub102(\u6b0d\uf9c5\ucfaf\ud36e\ub102::\u946b\uf995\ufe34\u1833\ua61f\uc246, invokevirtual:\u6b0d\uf9c5\ucfaf\ud36e\ub102(\u6b0d\uf9c5\ucfaf\ud36e\ub102::\u8d90\u9255\u3bd6\u5d20\ub83f\u1187, var_3_7D:\u760c\u7ce1\u9a18\ub32d\u6d99\ub6ab[expected:\u6b0d\uf9c5\ucfaf\ud36e\ub102], var_5_F2:\uc87f\u5f50\u16f6\ub113\u52d3\u12b2, ldc:float(-100.0f), ldc:float(-100.0f), ldc:float(-100.0f)), ldc:float(0.0f), ldc:float(0.0f)), var_6_FF:int, var_7_103:int, var_8_107:int, ldc:int(255)))
                    invokeinterface:void(\u6b0d\uf9c5\ucfaf\ud36e\ub102::\ua61f\u0a06\u3bc9\ufe34\uc9f6\u8258, invokeinterface:\u6b0d\uf9c5\ucfaf\ud36e\ub102(\u6b0d\uf9c5\ucfaf\ud36e\ub102::\ub70c\u600f\u93a2\uc910\u9937\u946b, invokeinterface:\u6b0d\uf9c5\ucfaf\ud36e\ub102(\u6b0d\uf9c5\ucfaf\ud36e\ub102::\u946b\uf995\ufe34\u1833\ua61f\uc246, invokevirtual:\u6b0d\uf9c5\ucfaf\ud36e\ub102(\u6b0d\uf9c5\ucfaf\ud36e\ub102::\u8d90\u9255\u3bd6\u5d20\ub83f\u1187, var_3_7D:\u760c\u7ce1\u9a18\ub32d\u6d99\ub6ab[expected:\u6b0d\uf9c5\ucfaf\ud36e\ub102], var_5_F2:\uc87f\u5f50\u16f6\ub113\u52d3\u12b2, ldc:float(-100.0f), ldc:float(-100.0f), ldc:float(100.0f)), ldc:float(0.0f), ldc:float(16.0f)), var_6_FF:int, var_7_103:int, var_8_107:int, ldc:int(255)))
                    invokeinterface:void(\u6b0d\uf9c5\ucfaf\ud36e\ub102::\ua61f\u0a06\u3bc9\ufe34\uc9f6\u8258, invokeinterface:\u6b0d\uf9c5\ucfaf\ud36e\ub102(\u6b0d\uf9c5\ucfaf\ud36e\ub102::\ub70c\u600f\u93a2\uc910\u9937\u946b, invokeinterface:\u6b0d\uf9c5\ucfaf\ud36e\ub102(\u6b0d\uf9c5\ucfaf\ud36e\ub102::\u946b\uf995\ufe34\u1833\ua61f\uc246, invokevirtual:\u6b0d\uf9c5\ucfaf\ud36e\ub102(\u6b0d\uf9c5\ucfaf\ud36e\ub102::\u8d90\u9255\u3bd6\u5d20\ub83f\u1187, var_3_7D:\u760c\u7ce1\u9a18\ub32d\u6d99\ub6ab[expected:\u6b0d\uf9c5\ucfaf\ud36e\ub102], var_5_F2:\uc87f\u5f50\u16f6\ub113\u52d3\u12b2, ldc:float(100.0f), ldc:float(-100.0f), ldc:float(100.0f)), ldc:float(16.0f), ldc:float(16.0f)), var_6_FF:int, var_7_103:int, var_8_107:int, ldc:int(255)))
                    invokeinterface:void(\u6b0d\uf9c5\ucfaf\ud36e\ub102::\ua61f\u0a06\u3bc9\ufe34\uc9f6\u8258, invokeinterface:\u6b0d\uf9c5\ucfaf\ud36e\ub102(\u6b0d\uf9c5\ucfaf\ud36e\ub102::\ub70c\u600f\u93a2\uc910\u9937\u946b, invokeinterface:\u6b0d\uf9c5\ucfaf\ud36e\ub102(\u6b0d\uf9c5\ucfaf\ud36e\ub102::\u946b\uf995\ufe34\u1833\ua61f\uc246, invokevirtual:\u6b0d\uf9c5\ucfaf\ud36e\ub102(\u6b0d\uf9c5\ucfaf\ud36e\ub102::\u8d90\u9255\u3bd6\u5d20\ub83f\u1187, var_3_7D:\u760c\u7ce1\u9a18\ub32d\u6d99\ub6ab[expected:\u6b0d\uf9c5\ucfaf\ud36e\ub102], var_5_F2:\uc87f\u5f50\u16f6\ub113\u52d3\u12b2, ldc:float(100.0f), ldc:float(-100.0f), ldc:float(-100.0f)), ldc:float(16.0f), ldc:float(0.0f)), var_6_FF:int, var_7_103:int, var_8_107:int, ldc:int(255)))
                    invokevirtual:void(\ub6ab\u8cae\u64ab\u5245\ubff1\u3711::\uc229\u12b2\u6cfe\u4492\u36d3\u5f50, var_2_78:\ub6ab\u8cae\u64ab\u5245\ubff1\u3711)
                    invokevirtual:void(\uafe7\uc7fe\u4c04\u6b5f\u5bc4::\u4ab3\u839e\ub1b9\u1833\u4cd9\u2dcc, p0:\uafe7\uc7fe\u4c04\u6b5f\u5bc4)
                    inc:int(var_4_7F, ldc:int(1))
                }
                
                invokestatic:void(\u9af2\u6ec6\u983f\ua068\u8c8a::\u6435\uff55\u8640\ub6ab\u527a\u4179, ldc:boolean(1))
                invokestatic:void(\u9af2\u6ec6\u983f\ua068\u8c8a::\u97e6\u9255\u59ec\ube23\u64f2\ub32d)
                invokestatic:void(\u9af2\u6ec6\u983f\ua068\u8c8a::\u6b5f\ua3b4\ua61f\ub70c\u5140\u6bb9)
                invokestatic:void(\u9af2\u6ec6\u983f\ua068\u8c8a::\u8413\u9033\u3bc9\uceb8\u1833\u97b7)
            }
            
            return:void()
        }
        
        goto(Label_0006)
    }
    
    public void \u3bd6\ub19c\u527a\uc4d2\u5fe1\u5245(\u51fa\u12cb\u7330\u74b1\u6c52.\u76bc\u4975\ua6bd\u4daf\u8d98.\uafe7\uc7fe\u4c04\u6b5f\u5bc4 p0, float p1) {
        var_3_75 : \u98a4\u51b2\ub8be\u7ce1\u8aa5\u7049
        var_3_C3 : boolean
        var_4_10E : \u3a62\u5d20\u4f52\uc229\u8308\ud7e8
        var_5_11F : float
        var_6_127 : float
        var_7_12F : float
        var_8_13A : \u760c\u7ce1\u9a18\ub32d\u6d99\ub6ab
        var_9_1B0 : float[]
        var_11_214 : float
        var_12_21A : float
        var_13_220 : float
        var_14_229 : \uc87f\u5f50\u16f6\ub113\u52d3\u12b2
        var_16_25A : int
        var_17_26E : float
        var_18_275 : float
        var_19_27C : float
        var_10_2F5 : float
        var_11_346 : \uc87f\u5f50\u16f6\ub113\u52d3\u12b2
        var_12_34B : float
        var_12_3E0 : float
        var_13_3F9 : int
        var_14_3FF : int
        var_15_407 : int
        var_16_412 : float
        var_17_41B : float
        var_18_426 : float
        var_19_42F : float
        var_13_4CE : float
        
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
            
            if (invokevirtual:boolean(\u71ae\u5fe1\u0b8e\u5140\uf995\u927d::\uc87f\u7af6\u7043\ub19c\uc84e\u4c04, getstatic:\u71ae\u5fe1\u0b8e\u5140\uf995\u927d(\u6c52\u873d\uc84e\u7ce1\u4daf\u8308::\u12cb\ub83f\u4d85\u0a06\u8413\u3d64))) {
                var_3_75 = checkcast:\u98a4\u51b2\ub8be\u7ce1\u8aa5\u7049(\u3bc9\u67e9\uc87f\u47c2\u5f50.\u16f6\u40a9\u5f50\ub113\ud51e.\u98a4\u51b2\ub8be\u7ce1\u8aa5\u7049.class, invokestatic:Object[expected:\u98a4\u51b2\ub8be\u7ce1\u8aa5\u7049](\u6c52\u873d\uc84e\u7ce1\u4daf\u8308::\u7af6\u97e6\u51fa\u8df4\ub6ab\ud523, invokevirtual:\ua61f\u183a\u6c52\uf9c5\u4cd9\u4d85[expected:Object](\u16f6\u61a4\u5db4\u4c04\u64ab\u9255::\u7873\u67e9\u3e75\ub6ab\u7873\u7873, getfield:\u16f6\u61a4\u5db4\u4c04\u64ab\u9255(\u9937\u7d52\u3e75\u98a4\u8aa5\u7006::\ud51e\u9033\u8df4\u7043\u5f50\u8aa5, this:\u9937\u7d52\u3e75\u98a4\u8aa5\u7006)), getstatic:\u71ae\u5fe1\u0b8e\u5140\uf995\u927d(\u6c52\u873d\uc84e\u7ce1\u4daf\u8308::\u12cb\ub83f\u4d85\u0a06\u8413\u3d64), newarray:Object[](java.lang.Object.class, ldc:int(0))))
                
                if (cmpne:boolean(var_3_75:\u98a4\u51b2\ub8be\u7ce1\u8aa5\u7049, aconstnull:\u98a4\u51b2\ub8be\u7ce1\u8aa5\u7049())) {
                    invokeinterface:void(\u98a4\u51b2\ub8be\u7ce1\u8aa5\u7049::\u8cae\u99f7\ub8be\u64f2\u16f6\u8d98, var_3_75:\u98a4\u51b2\ub8be\u7ce1\u8aa5\u7049, getfield:int(\u9937\u7d52\u3e75\u98a4\u8aa5\u7006::\u3a62\ubcb0\u873d\u7873\u47c2\u8aa5, this:\u9937\u7d52\u3e75\u98a4\u8aa5\u7006), p1:float, p0:\uafe7\uc7fe\u4c04\u6b5f\u5bc4, getfield:\u16f6\u61a4\u5db4\u4c04\u64ab\u9255(\u9937\u7d52\u3e75\u98a4\u8aa5\u7006::\ud51e\u9033\u8df4\u7043\u5f50\u8aa5, this:\u9937\u7d52\u3e75\u98a4\u8aa5\u7006), getfield:\u67e9\u4daf\u760c\ud217\ua6bd\ubff1(\u9937\u7d52\u3e75\u98a4\u8aa5\u7006::\u8df4\u3776\ud171\u7006\u51b2\uf995, this:\u9937\u7d52\u3e75\u98a4\u8aa5\u7006))
                    return:void()
                }
            }
            
            if (cmpeq:boolean(invokevirtual:\u183a\u7043\u51fa\u8cae\u0a06\u156b(\ua61f\u183a\u6c52\uf9c5\u4cd9\u4d85::\u9255\uc7fe\u6fb0\u3711\u5245\u718f, invokevirtual:\ua61f\u183a\u6c52\uf9c5\u4cd9\u4d85(\u16f6\u61a4\u5db4\u4c04\u64ab\u9255::\u7873\u67e9\u3e75\ub6ab\u7873\u7873, getfield:\u16f6\u61a4\u5db4\u4c04\u64ab\u9255(\u67e9\u4daf\u760c\ud217\ua6bd\ubff1::\u946b\u98a4\u8709\u7043\ubf56\u5f50, getfield:\u67e9\u4daf\u760c\ud217\ua6bd\ubff1(\u9937\u7d52\u3e75\u98a4\u8aa5\u7006::\u8df4\u3776\ud171\u7006\u51b2\uf995, this:\u9937\u7d52\u3e75\u98a4\u8aa5\u7006)))), getstatic:\u183a\u7043\u51fa\u8cae\u0a06\u156b(\u183a\u7043\u51fa\u8cae\u0a06\u156b::\u99f7\uc31c\u5bc4\ub6ab\u183a\u64ab))) {
                invokespecial:void(\u9937\u7d52\u3e75\u98a4\u8aa5\u7006::\ub8be\u5140\u6bb9\u4f52\u8640\uceb8, this:\u9937\u7d52\u3e75\u98a4\u8aa5\u7006, p0:\uafe7\uc7fe\u4c04\u6b5f\u5bc4)
            }
            else {
                if (cmpeq:boolean(invokevirtual:\u183a\u7043\u51fa\u8cae\u0a06\u156b(\ua61f\u183a\u6c52\uf9c5\u4cd9\u4d85::\u9255\uc7fe\u6fb0\u3711\u5245\u718f, invokevirtual:\ua61f\u183a\u6c52\uf9c5\u4cd9\u4d85(\u16f6\u61a4\u5db4\u4c04\u64ab\u9255::\u7873\u67e9\u3e75\ub6ab\u7873\u7873, getfield:\u16f6\u61a4\u5db4\u4c04\u64ab\u9255(\u67e9\u4daf\u760c\ud217\ua6bd\ubff1::\u946b\u98a4\u8709\u7043\ubf56\u5f50, getfield:\u67e9\u4daf\u760c\ud217\ua6bd\ubff1(\u9937\u7d52\u3e75\u98a4\u8aa5\u7006::\u8df4\u3776\ud171\u7006\u51b2\uf995, this:\u9937\u7d52\u3e75\u98a4\u8aa5\u7006)))), getstatic:\u183a\u7043\u51fa\u8cae\u0a06\u156b(\u183a\u7043\u51fa\u8cae\u0a06\u156b::\u12b2\u8d90\u3a62\uc4d2\uc246\u56bd))) {
                    invokestatic:void(\u9af2\u6ec6\u983f\ua068\u8c8a::\u8389\ua3b4\u3d4b\ud36e\u67e9\ubefe)
                    var_3_C3 = invokestatic:boolean(\u8308\u51fa\u6c56\u5db4\ub18d\u34df::\u61a4\u3e75\u8aa5\ub102\ub7dc\u647c)
                    
                    if (var_3_C3:boolean) {
                        invokestatic:void(\uc238\u69d9\u92ff\ub83f\u5245\uc229::\ubcb0\u494c\u3504\u67d0\ucef1\u4daf)
                    }
                    
                    var_4_10E = invokestatic:\u3a62\u5d20\u4f52\uc229\u8308\ud7e8(\u6d69\u92ff\u983f\u873d\u8258\u40a9::\u3bc9\ub18d\ua61f\uc3e3\uc2e8\ud36e, invokevirtual:\u3a62\u5d20\u4f52\uc229\u8308\ud7e8(\u16f6\u61a4\u5db4\u4c04\u64ab\u9255::\u4bc8\ufcaf\u8bb0\uc3e3\u120d\u3c25, getfield:\u16f6\u61a4\u5db4\u4c04\u64ab\u9255(\u9937\u7d52\u3e75\u98a4\u8aa5\u7006::\ud51e\u9033\u8df4\u7043\u5f50\u8aa5, this:\u9937\u7d52\u3e75\u98a4\u8aa5\u7006), invokevirtual:\u6b0d\ud171\uc7fe\u52d3\uafe7\u6c56(\u836c\u8cae\ub18d\u836c\u8753\u59ec::\ube23\u8709\ua3b4\u5245\uc2bd\u3e75, invokevirtual:\u836c\u8cae\ub18d\u836c\u8753\u59ec(\u67e9\u8413\ub113\u4bc8\u6c52\uceb8::\u6fb0\ud217\u34df\u6b5f\uc31c\ubf56, getfield:\u67e9\u8413\ub113\u4bc8\u6c52\uceb8(\u67e9\u4daf\u760c\ud217\ua6bd\ubff1::\u7af6\u6b0d\ub70c\u76bc\ucfaf\u4cd9, getfield:\u67e9\u4daf\u760c\ud217\ua6bd\ubff1(\u9937\u7d52\u3e75\u98a4\u8aa5\u7006::\u8df4\u3776\ud171\u7006\u51b2\uf995, this:\u9937\u7d52\u3e75\u98a4\u8aa5\u7006)))), p1:float), getfield:\u16f6\u61a4\u5db4\u4c04\u64ab\u9255[expected:\u8bb0\u759a\u3bc9\u527a\ube23\u5140](\u67e9\u4daf\u760c\ud217\ua6bd\ubff1::\u946b\u98a4\u8709\u7043\ubf56\u5f50, getfield:\u67e9\u4daf\u760c\ud217\ua6bd\ubff1(\u9937\u7d52\u3e75\u98a4\u8aa5\u7006::\u8df4\u3776\ud171\u7006\u51b2\uf995, this:\u9937\u7d52\u3e75\u98a4\u8aa5\u7006)), invokevirtual:double(\u7d52\u718f\u3776\u6fb0\ub83f::\ub8be\u8d98\u34df\u12b2\u071d\u12b2, invokevirtual:\u7d52\u718f\u3776\u6fb0\ub83f(\u67e9\u4daf\u760c\ud217\ua6bd\ubff1::\u983f\uc229\u8aa5\u873d\u0b8e\u4975, getfield:\u67e9\u4daf\u760c\ud217\ua6bd\ubff1(\u9937\u7d52\u3e75\u98a4\u8aa5\u7006::\u8df4\u3776\ud171\u7006\u51b2\uf995, this:\u9937\u7d52\u3e75\u98a4\u8aa5\u7006))), add:double(invokevirtual:double(\u7d52\u718f\u3776\u6fb0\ub83f::\ud51e\u12cb\u3dd3\uc84e\u8308\ube23, invokevirtual:\u7d52\u718f\u3776\u6fb0\ub83f(\u67e9\u4daf\u760c\ud217\ua6bd\ubff1::\u983f\uc229\u8aa5\u873d\u0b8e\u4975, getfield:\u67e9\u4daf\u760c\ud217\ua6bd\ubff1(\u9937\u7d52\u3e75\u98a4\u8aa5\u7006::\u8df4\u3776\ud171\u7006\u51b2\uf995, this:\u9937\u7d52\u3e75\u98a4\u8aa5\u7006))), ldc:double(1.0)), invokevirtual:double(\u7d52\u718f\u3776\u6fb0\ub83f::\ubcb0\ub83f\u92ff\u946b\u7ce1\u8df4, invokevirtual:\u7d52\u718f\u3776\u6fb0\ub83f(\u67e9\u4daf\u760c\ud217\ua6bd\ubff1::\u983f\uc229\u8aa5\u873d\u0b8e\u4975, getfield:\u67e9\u4daf\u760c\ud217\ua6bd\ubff1(\u9937\u7d52\u3e75\u98a4\u8aa5\u7006::\u8df4\u3776\ud171\u7006\u51b2\uf995, this:\u9937\u7d52\u3e75\u98a4\u8aa5\u7006))))
                    
                    if (var_3_C3:boolean) {
                        invokestatic:void(\uc238\u69d9\u92ff\ub83f\u5245\uc229::\u1187\u9a18\ua562\u7006\uf995\ud36e, var_4_10E:\u3a62\u5d20\u4f52\uc229\u8308\ud7e8)
                    }
                    
                    var_5_11F = d2f:float(getfield:double(\u3a62\u5d20\u4f52\uc229\u8308\ud7e8::\ubf56\u4c04\u4492\u36d3\u71f1\u12cb, var_4_10E:\u3a62\u5d20\u4f52\uc229\u8308\ud7e8))
                    var_6_127 = d2f:float(getfield:double(\u3a62\u5d20\u4f52\uc229\u8308\ud7e8::\u6bb9\uc29a\u99f7\u7e3f\u6b5f\u156b, var_4_10E:\u3a62\u5d20\u4f52\uc229\u8308\ud7e8))
                    var_7_12F = d2f:float(getfield:double(\u3a62\u5d20\u4f52\uc229\u8308\ud7e8::\ub7dc\ubff1\ub19c\u6198\uc2e8\ufe34, var_4_10E:\u3a62\u5d20\u4f52\uc229\u8308\ud7e8))
                    invokestatic:void(\u72f1\u99f7\u52d3\u56bd\u51b2\ud4fe::\u4f52\ua3b4\ubded\u12cb\u4179\u4492)
                    var_8_13A = invokevirtual:\u760c\u7ce1\u9a18\ub32d\u6d99\ub6ab(\ub6ab\u8cae\u64ab\u5245\ubff1\u3711::\u74b1\u7bad\u6435\uc87f\u6d69\uc238, invokestatic:\ub6ab\u8cae\u64ab\u5245\ubff1\u3711(\ub6ab\u8cae\u64ab\u5245\ubff1\u3711::\u3504\ud523\u99f7\u5140\u5d20\u983f))
                    invokestatic:void(\u9af2\u6ec6\u983f\ua068\u8c8a::\u6435\uff55\u8640\ub6ab\u527a\u4179, ldc:boolean(0))
                    invokestatic:void(\u9af2\u6ec6\u983f\ua068\u8c8a::\ubded\u8753\uc7fe\u2dcc\u64f2\u8350)
                    
                    if (var_3_C3:boolean) {
                        invokestatic:void(\uc238\u69d9\u92ff\ub83f\u5245\uc229::\u446c\u494c\u6b5f\u4492\ud36e\uff55)
                    }
                    
                    invokestatic:void(\u9af2\u6ec6\u983f\ua068\u8c8a::\u34df\uc31c\ua3b4\u47c2\u64f2\ubefe, var_5_11F:float, var_6_127:float, var_7_12F:float)
                    
                    if (var_3_C3:boolean) {
                        invokestatic:void(\uc238\u69d9\u92ff\ub83f\u5245\uc229::\uc7fe\uc29a\u839e\u6435\u59ec\uc229, p0:\uafe7\uc7fe\u4c04\u6b5f\u5bc4)
                    }
                    
                    if (invokestatic:boolean(\u8308\u51fa\u6c56\u5db4\ub18d\u34df::\u760c\uc2e8\ud12e\u6fb0\u624e\u4cd9)) {
                        invokevirtual:void(\u5654\u0800\ub1b9\ua562\u3e75\u8cae::\u8aa5\u3776\u8308\u446c\u3e75\uc87f, getfield:\u5654\u0800\ub1b9\ua562\u3e75\u8cae(\u9937\u7d52\u3e75\u98a4\u8aa5\u7006::\ud217\u7c6b\u6c52\u4cd9\u4179\u4f52, this:\u9937\u7d52\u3e75\u98a4\u8aa5\u7006))
                        invokevirtual:void(\u74b1\u6d69\ud4fe\u4179\u8c8a\u965f::\u5bc4\u527a\u839e\u600f\u946b\ub6ab, getfield:\u74b1\u6d69\ud4fe\u4179\u8c8a\u965f(\u9937\u7d52\u3e75\u98a4\u8aa5\u7006::\u3c25\u8cae\ub70c\ufe34\u946b\uf94d, this:\u9937\u7d52\u3e75\u98a4\u8aa5\u7006), ldc:long(0L))
                        invokevirtual:void(\u5654\u0800\ub1b9\ua562\u3e75\u8cae::\u946b\u7043\u56bd\uc87f\uf94d\u9255, getfield:\u5654\u0800\ub1b9\ua562\u3e75\u8cae(\u9937\u7d52\u3e75\u98a4\u8aa5\u7006::\ud217\u7c6b\u6c52\u4cd9\u4179\u4f52, this:\u9937\u7d52\u3e75\u98a4\u8aa5\u7006), invokevirtual:\uc87f\u5f50\u16f6\ub113\u52d3\u12b2(\u3711\u6c52\ufcaf\u4bc8\ud158::\u6d99\uae87\u8aa5\u6c52\u4c2b\u88c5, invokevirtual:\u3711\u6c52\ufcaf\u4bc8\ud158(\uafe7\uc7fe\u4c04\u6b5f\u5bc4::\u9033\u12b2\u516c\u97e6\u6d99\ua3b4, p0:\uafe7\uc7fe\u4c04\u6b5f\u5bc4)), ldc:int(7))
                        invokestatic:void(\u5654\u0800\ub1b9\ua562\u3e75\u8cae::\u7ce1\u7c6b\ubb2b\ub6ab\ub19c\u36d3)
                        invokevirtual:void(\u74b1\u6d69\ud4fe\u4179\u8c8a\u965f::\u7873\u8bb0\u0b8e\ucfaf\uc87f\u0a06, getfield:\u74b1\u6d69\ud4fe\u4179\u8c8a\u965f(\u9937\u7d52\u3e75\u98a4\u8aa5\u7006::\u3c25\u8cae\ub70c\ufe34\u946b\uf94d, this:\u9937\u7d52\u3e75\u98a4\u8aa5\u7006))
                    }
                    
                    invokestatic:void(\u9af2\u6ec6\u983f\ua068\u8c8a::\u88c5\u59ec\u93a2\u8258\ub6ab\u72f1)
                    
                    if (var_3_C3:boolean) {
                        invokestatic:void(\uc238\u69d9\u92ff\ub83f\u5245\uc229::\u983f\ub6ab\u8350\u8bb0\u92ee\u64ab)
                    }
                    
                    invokestatic:void(\u9af2\u6ec6\u983f\ua068\u8c8a::\u624e\u156b\u6c56\uc910\ub70c\u40a9)
                    invokestatic:void(\u9af2\u6ec6\u983f\ua068\u8c8a::\uc9f6\u7049\u92ee\ube23\u3c25\u6d99)
                    invokestatic:void(\u9af2\u6ec6\u983f\ua068\u8c8a::\u3d4b\u74b1\u3711\u5bc4\uf9c5\ub32d)
                    var_9_1B0 = invokevirtual:float[](\ua61f\u183a\u6c52\uf9c5\u4cd9\u4d85::\u8258\u76bc\u3d64\ubcb0\ucef1\uc4d2, invokevirtual:\ua61f\u183a\u6c52\uf9c5\u4cd9\u4d85(\u16f6\u61a4\u5db4\u4c04\u64ab\u9255::\u7873\u67e9\u3e75\ub6ab\u7873\u7873, getfield:\u16f6\u61a4\u5db4\u4c04\u64ab\u9255(\u9937\u7d52\u3e75\u98a4\u8aa5\u7006::\ud51e\u9033\u8df4\u7043\u5f50\u8aa5, this:\u9937\u7d52\u3e75\u98a4\u8aa5\u7006)), invokevirtual:float(\u8753\u8709\ubff1\ub32d\u4d85::\u8bb0\u8413\u4cd9\u3d4b\u52d3\u4c2b, getfield:\u16f6\u61a4\u5db4\u4c04\u64ab\u9255[expected:\u8753\u8709\ubff1\ub32d\u4d85](\u9937\u7d52\u3e75\u98a4\u8aa5\u7006::\ud51e\u9033\u8df4\u7043\u5f50\u8aa5, this:\u9937\u7d52\u3e75\u98a4\u8aa5\u7006), p1:float), p1:float)
                    
                    if (logicaland:boolean(cmpne:boolean(var_9_1B0:float[], aconstnull:float[]()), invokestatic:boolean(\u8308\u51fa\u6c56\u5db4\ub18d\u34df::\ud171\u0a06\ub18d\u0a06\uc229\u156b))) {
                        invokestatic:void(\u9af2\u6ec6\u983f\ua068\u8c8a::\u8389\ua3b4\u3d4b\ud36e\u67e9\ubefe)
                        
                        if (var_3_C3:boolean) {
                            invokestatic:void(\uc238\u69d9\u92ff\ub83f\u5245\uc229::\ubcb0\u494c\u3504\u67d0\ucef1\u4daf)
                        }
                        
                        invokestatic:void(\u9af2\u6ec6\u983f\ua068\u8c8a::\u7873\u4975\u4c2b\uc87f\ubded\u16f6, ldc:int(7425))
                        invokevirtual:void(\uafe7\uc7fe\u4c04\u6b5f\u5bc4::\u9937\u7d52\u3e75\u98a4\u8aa5\u7006, p0:\uafe7\uc7fe\u4c04\u6b5f\u5bc4)
                        invokevirtual:void(\uafe7\uc7fe\u4c04\u6b5f\u5bc4::\ucfaf\u1187\u4c2b\u8350\u5f50\uc910, p0:\uafe7\uc7fe\u4c04\u6b5f\u5bc4, invokevirtual:\ucef1\u6c52\u5654\u4cd9\u61a4\ua6bd(\uae5d\ua068\u9a18\u8413\u51fa\ub83f::\uc7fe\ub18d\ucfaf\ub7dc\ubcb0\u5140, getstatic:\uae5d\ua068\u9a18\u8413\u51fa\ub83f(\uae5d\ua068\u9a18\u8413\u51fa\ub83f::\u9af2\u4f52\ubf56\uc246\u839e\u1833), ldc:float(90.0f)))
                        invokevirtual:void(\uafe7\uc7fe\u4c04\u6b5f\u5bc4::\ucfaf\u1187\u4c2b\u8350\u5f50\uc910, p0:\uafe7\uc7fe\u4c04\u6b5f\u5bc4, invokevirtual:\ucef1\u6c52\u5654\u4cd9\u61a4\ua6bd(\uae5d\ua068\u9a18\u8413\u51fa\ub83f::\uc7fe\ub18d\ucfaf\ub7dc\ubcb0\u5140, getstatic:\uae5d\ua068\u9a18\u8413\u51fa\ub83f(\uae5d\ua068\u9a18\u8413\u51fa\ub83f::\u156b\u527a\u4cd9\u12cb\u0b8e\u51b2), ternaryop:float(cmplt:boolean(invokestatic:float(\u927d\uc7fe\u92ff\u98a4\uc84e\uf9c5::\u67d0\u5654\ud158\u72f1\u7bad\ua562, invokevirtual:float(\uf9c5\ud158\u4975\uf94d\ud523\uc31c::\u51fa\u8c8a\u4daf\u760c\uc229\u600f, getfield:\u16f6\u61a4\u5db4\u4c04\u64ab\u9255[expected:\uf9c5\ud158\u4975\uf94d\ud523\uc31c](\u9937\u7d52\u3e75\u98a4\u8aa5\u7006::\ud51e\u9033\u8df4\u7043\u5f50\u8aa5, this:\u9937\u7d52\u3e75\u98a4\u8aa5\u7006), p1:float)), ldc:float(0.0f)), ldc:float(180.0f), ldc:float(0.0f))))
                        invokevirtual:void(\uafe7\uc7fe\u4c04\u6b5f\u5bc4::\ucfaf\u1187\u4c2b\u8350\u5f50\uc910, p0:\uafe7\uc7fe\u4c04\u6b5f\u5bc4, invokevirtual:\ucef1\u6c52\u5654\u4cd9\u61a4\ua6bd(\uae5d\ua068\u9a18\u8413\u51fa\ub83f::\uc7fe\ub18d\ucfaf\ub7dc\ubcb0\u5140, getstatic:\uae5d\ua068\u9a18\u8413\u51fa\ub83f(\uae5d\ua068\u9a18\u8413\u51fa\ub83f::\u156b\u527a\u4cd9\u12cb\u0b8e\u51b2), ldc:float(90.0f)))
                        var_11_214 = loadelement:float(var_9_1B0:float[], ldc:int(0))
                        var_12_21A = loadelement:float(var_9_1B0:float[], ldc:int(1))
                        var_13_220 = loadelement:float(var_9_1B0:float[], ldc:int(2))
                        var_14_229 = invokevirtual:\uc87f\u5f50\u16f6\ub113\u52d3\u12b2(\u3711\u6c52\ufcaf\u4bc8\ud158::\u6d99\uae87\u8aa5\u6c52\u4c2b\u88c5, invokevirtual:\u3711\u6c52\ufcaf\u4bc8\ud158(\uafe7\uc7fe\u4c04\u6b5f\u5bc4::\u9033\u12b2\u516c\u97e6\u6d99\ua3b4, p0:\uafe7\uc7fe\u4c04\u6b5f\u5bc4))
                        invokevirtual:void(\u760c\u7ce1\u9a18\ub32d\u6d99\ub6ab::\u12cb\u9937\uc246\u5fe1\ubefe\u494c, var_8_13A:\u760c\u7ce1\u9a18\ub32d\u6d99\ub6ab, ldc:int(6), getstatic:\u74b1\u6d69\ud4fe\u4179\u8c8a\u965f(\u6d69\u4c04\ub113\u92ff\u3e75\u12b2::\u40a9\u8709\ud523\ub171\u446c\u7e3f))
                        invokeinterface:void(\u6b0d\uf9c5\ucfaf\ud36e\ub102::\ua61f\u0a06\u3bc9\ufe34\uc9f6\u8258, invokeinterface:\u6b0d\uf9c5\ucfaf\ud36e\ub102(\u6b0d\uf9c5\ucfaf\ud36e\ub102::\ub70c\u600f\u93a2\uc910\u9937\u946b, invokevirtual:\u6b0d\uf9c5\ucfaf\ud36e\ub102(\u6b0d\uf9c5\ucfaf\ud36e\ub102::\u8d90\u9255\u3bd6\u5d20\ub83f\u1187, var_8_13A:\u760c\u7ce1\u9a18\ub32d\u6d99\ub6ab[expected:\u6b0d\uf9c5\ucfaf\ud36e\ub102], var_14_229:\uc87f\u5f50\u16f6\ub113\u52d3\u12b2, ldc:float(0.0f), ldc:float(100.0f), ldc:float(0.0f)), var_11_214:float, var_12_21A:float, var_13_220:float, loadelement:float(var_9_1B0:float[], ldc:int(3))))
                        var_16_25A = ldc:int(0)
                        
                        while (cmple:boolean(var_16_25A:int, ldc:int(16))) {
                            var_17_26E = div:float(mul:float(i2f:float(var_16_25A:int), ldc:float(6.2831855f)), ldc:float(16.0f))
                            var_18_275 = invokestatic:float(\u927d\uc7fe\u92ff\u98a4\uc84e\uf9c5::\u67d0\u5654\ud158\u72f1\u7bad\ua562, var_17_26E:float)
                            var_19_27C = invokestatic:float(\u927d\uc7fe\u92ff\u98a4\uc84e\uf9c5::\u88c5\u7ce1\u4ab3\u8350\uae87\u62da, var_17_26E:float)
                            invokeinterface:void(\u6b0d\uf9c5\ucfaf\ud36e\ub102::\ua61f\u0a06\u3bc9\ufe34\uc9f6\u8258, invokeinterface:\u6b0d\uf9c5\ucfaf\ud36e\ub102(\u6b0d\uf9c5\ucfaf\ud36e\ub102::\ub70c\u600f\u93a2\uc910\u9937\u946b, invokevirtual:\u6b0d\uf9c5\ucfaf\ud36e\ub102(\u6b0d\uf9c5\ucfaf\ud36e\ub102::\u8d90\u9255\u3bd6\u5d20\ub83f\u1187, var_8_13A:\u760c\u7ce1\u9a18\ub32d\u6d99\ub6ab[expected:\u6b0d\uf9c5\ucfaf\ud36e\ub102], var_14_229:\uc87f\u5f50\u16f6\ub113\u52d3\u12b2, mul:float(var_18_275:float, ldc:float(120.0f)), mul:float(var_19_27C:float, ldc:float(120.0f)), mul:float(mul:float(neg:float(var_19_27C:float), ldc:float(40.0f)), loadelement:float(var_9_1B0:float[], ldc:int(3)))), loadelement:float(var_9_1B0:float[], ldc:int(0)), loadelement:float(var_9_1B0:float[], ldc:int(1)), loadelement:float(var_9_1B0:float[], ldc:int(2)), ldc:float(0.0f)))
                            inc:int(var_16_25A, ldc:int(1))
                        }
                        
                        invokevirtual:void(\u760c\u7ce1\u9a18\ub32d\u6d99\ub6ab::\ua068\uc31c\u6bb9\u34df\uc3e3\u6d99, var_8_13A:\u760c\u7ce1\u9a18\ub32d\u6d99\ub6ab)
                        invokestatic:void(\u446c\u7af6\u5bc4\ub83f\u8413\u600f::\u7c6b\ua562\u5db4\u7006\u1833\u516c, var_8_13A:\u760c\u7ce1\u9a18\ub32d\u6d99\ub6ab)
                        invokevirtual:void(\uafe7\uc7fe\u4c04\u6b5f\u5bc4::\u4ab3\u839e\ub1b9\u1833\u4cd9\u2dcc, p0:\uafe7\uc7fe\u4c04\u6b5f\u5bc4)
                        invokestatic:void(\u9af2\u6ec6\u983f\ua068\u8c8a::\u7873\u4975\u4c2b\uc87f\ubded\u16f6, ldc:int(7424))
                    }
                    
                    invokestatic:void(\u9af2\u6ec6\u983f\ua068\u8c8a::\u97e6\u9255\u59ec\ube23\u64f2\ub32d)
                    
                    if (var_3_C3:boolean) {
                        invokestatic:void(\uc238\u69d9\u92ff\ub83f\u5245\uc229::\ud217\u6d99\u446c\u7e3f\u071d\ud4fe)
                    }
                    
                    invokestatic:void(\u9af2\u6ec6\u983f\ua068\u8c8a::\ube23\u624e\u2dcc\u3a62\uf9c5\u8389, getstatic:\ud12e\ub70c\u16f6\uc29a\u8bb0(\ud12e\ub70c\u16f6\uc29a\u8bb0::\ua6bd\ubcb0\ub113\u3bd6\u72f1\u9af2), getstatic:\u624e\uc4d2\u98a4\ud12e\u7873(\u624e\uc4d2\u98a4\ud12e\u7873::\uff55\u416d\u4c2b\u527a\ua3b4\u9937), getstatic:\ud12e\ub70c\u16f6\uc29a\u8bb0(\ud12e\ub70c\u16f6\uc29a\u8bb0::\u5f50\u8cae\u0c95\u6cfe\u92ee\u3e2a), getstatic:\u624e\uc4d2\u98a4\ud12e\u7873(\u624e\uc4d2\u98a4\ud12e\u7873::\uc246\ub6ab\u12b2\u7ce1\u71ae\u8258))
                    invokevirtual:void(\uafe7\uc7fe\u4c04\u6b5f\u5bc4::\u9937\u7d52\u3e75\u98a4\u8aa5\u7006, p0:\uafe7\uc7fe\u4c04\u6b5f\u5bc4)
                    var_10_2F5 = sub:float(ldc:float(1.0f), invokevirtual:float(\uf9c5\ud158\u4975\uf94d\ud523\uc31c::\ub32d\u8413\u600f\ucfaf\u61a4\ua3b4, getfield:\u16f6\u61a4\u5db4\u4c04\u64ab\u9255[expected:\uf9c5\ud158\u4975\uf94d\ud523\uc31c](\u9937\u7d52\u3e75\u98a4\u8aa5\u7006::\ud51e\u9033\u8df4\u7043\u5f50\u8aa5, this:\u9937\u7d52\u3e75\u98a4\u8aa5\u7006), p1:float))
                    invokestatic:void(\u9af2\u6ec6\u983f\ua068\u8c8a::\u8d90\u92ff\uc84e\u3dd3\uf9c5\u8308, ldc:float(1.0f), ldc:float(1.0f), ldc:float(1.0f), var_10_2F5:float)
                    invokevirtual:void(\uafe7\uc7fe\u4c04\u6b5f\u5bc4::\ucfaf\u1187\u4c2b\u8350\u5f50\uc910, p0:\uafe7\uc7fe\u4c04\u6b5f\u5bc4, invokevirtual:\ucef1\u6c52\u5654\u4cd9\u61a4\ua6bd(\uae5d\ua068\u9a18\u8413\u51fa\ub83f::\uc7fe\ub18d\ucfaf\ub7dc\ubcb0\u5140, getstatic:\uae5d\ua068\u9a18\u8413\u51fa\ub83f(\uae5d\ua068\u9a18\u8413\u51fa\ub83f::\u3dd3\u6ec6\u071d\u4cd9\u7e3f\ud217), ldc:float(-90.0f)))
                    invokestatic:void(\uf9c5\u4c04\uafe7\uc3e3\u88c5\u7049::\u120d\uf995\u67e9\u156b\u2dcc\ufcaf, getfield:\u16f6\u61a4\u5db4\u4c04\u64ab\u9255[expected:\uf9c5\ud158\u4975\uf94d\ud523\uc31c](\u9937\u7d52\u3e75\u98a4\u8aa5\u7006::\ud51e\u9033\u8df4\u7043\u5f50\u8aa5, this:\u9937\u7d52\u3e75\u98a4\u8aa5\u7006), getfield:\u4f52\ub7dc\u7bad\ud217\u76bc\u6d99(\u9937\u7d52\u3e75\u98a4\u8aa5\u7006::\u12b2\u7d52\u6435\uc2e8\u69d9\u5654, this:\u9937\u7d52\u3e75\u98a4\u8aa5\u7006), p0:\uafe7\uc7fe\u4c04\u6b5f\u5bc4, p1:float)
                    
                    if (var_3_C3:boolean) {
                        invokestatic:void(\uc238\u69d9\u92ff\ub83f\u5245\uc229::\ub1b9\u718f\u120d\ub8be\ub1b9\u494c, p0:\uafe7\uc7fe\u4c04\u6b5f\u5bc4)
                    }
                    
                    invokevirtual:void(\uafe7\uc7fe\u4c04\u6b5f\u5bc4::\ucfaf\u1187\u4c2b\u8350\u5f50\uc910, p0:\uafe7\uc7fe\u4c04\u6b5f\u5bc4, invokevirtual:\ucef1\u6c52\u5654\u4cd9\u61a4\ua6bd(\uae5d\ua068\u9a18\u8413\u51fa\ub83f::\uc7fe\ub18d\ucfaf\ub7dc\ubcb0\u5140, getstatic:\uae5d\ua068\u9a18\u8413\u51fa\ub83f(\uae5d\ua068\u9a18\u8413\u51fa\ub83f::\u9af2\u4f52\ubf56\uc246\u839e\u1833), mul:float(invokevirtual:float(\u8753\u8709\ubff1\ub32d\u4d85::\u8bb0\u8413\u4cd9\u3d4b\u52d3\u4c2b, getfield:\u16f6\u61a4\u5db4\u4c04\u64ab\u9255[expected:\u8753\u8709\ubff1\ub32d\u4d85](\u9937\u7d52\u3e75\u98a4\u8aa5\u7006::\ud51e\u9033\u8df4\u7043\u5f50\u8aa5, this:\u9937\u7d52\u3e75\u98a4\u8aa5\u7006), p1:float), ldc:float(360.0f))))
                    
                    if (var_3_C3:boolean) {
                        invokestatic:void(\uc238\u69d9\u92ff\ub83f\u5245\uc229::\u3e75\u8d90\uf94d\u12cb\u8aa5\u600f, p0:\uafe7\uc7fe\u4c04\u6b5f\u5bc4)
                    }
                    
                    var_11_346 = invokevirtual:\uc87f\u5f50\u16f6\ub113\u52d3\u12b2(\u3711\u6c52\ufcaf\u4bc8\ud158::\u6d99\uae87\u8aa5\u6c52\u4c2b\u88c5, invokevirtual:\u3711\u6c52\ufcaf\u4bc8\ud158(\uafe7\uc7fe\u4c04\u6b5f\u5bc4::\u9033\u12b2\u516c\u97e6\u6d99\ua3b4, p0:\uafe7\uc7fe\u4c04\u6b5f\u5bc4))
                    var_12_34B = ldc:float(30.0f)
                    
                    if (invokestatic:boolean(\u8308\u51fa\u6c56\u5db4\ub18d\u34df::\u92ee\u6ec6\u836c\u9a18\ub70c\uc3e3)) {
                        invokevirtual:void(\u4f52\ub7dc\u7bad\ud217\u76bc\u6d99::\u6ec6\u9a18\u92ff\u2dcc\ud12e\u7ce1, getfield:\u4f52\ub7dc\u7bad\ud217\u76bc\u6d99(\u9937\u7d52\u3e75\u98a4\u8aa5\u7006::\u12b2\u7d52\u6435\uc2e8\u69d9\u5654, this:\u9937\u7d52\u3e75\u98a4\u8aa5\u7006), getstatic:\u4179\ubb2b\uc7fe\u51fa\uc910\u8753(\u9937\u7d52\u3e75\u98a4\u8aa5\u7006::\ubff1\u64f2\uff55\uc229\u36d3\uc2bd))
                        invokevirtual:void(\u760c\u7ce1\u9a18\ub32d\u6d99\ub6ab::\u12cb\u9937\uc246\u5fe1\ubefe\u494c, var_8_13A:\u760c\u7ce1\u9a18\ub32d\u6d99\ub6ab, ldc:int(7), getstatic:\u74b1\u6d69\ud4fe\u4179\u8c8a\u965f(\u6d69\u4c04\ub113\u92ff\u3e75\u12b2::\u6d69\u527a\ubcb0\u5db4\u120d\u5d20))
                        invokeinterface:void(\u6b0d\uf9c5\ucfaf\ud36e\ub102::\ua61f\u0a06\u3bc9\ufe34\uc9f6\u8258, invokeinterface:\u6b0d\uf9c5\ucfaf\ud36e\ub102(\u6b0d\uf9c5\ucfaf\ud36e\ub102::\u946b\uf995\ufe34\u1833\ua61f\uc246, invokevirtual:\u6b0d\uf9c5\ucfaf\ud36e\ub102(\u6b0d\uf9c5\ucfaf\ud36e\ub102::\u8d90\u9255\u3bd6\u5d20\ub83f\u1187, var_8_13A:\u760c\u7ce1\u9a18\ub32d\u6d99\ub6ab[expected:\u6b0d\uf9c5\ucfaf\ud36e\ub102], var_11_346:\uc87f\u5f50\u16f6\ub113\u52d3\u12b2, neg:float(var_12_34B:float), ldc:float(100.0f), neg:float(var_12_34B:float)), ldc:float(0.0f), ldc:float(0.0f)))
                        invokeinterface:void(\u6b0d\uf9c5\ucfaf\ud36e\ub102::\ua61f\u0a06\u3bc9\ufe34\uc9f6\u8258, invokeinterface:\u6b0d\uf9c5\ucfaf\ud36e\ub102(\u6b0d\uf9c5\ucfaf\ud36e\ub102::\u946b\uf995\ufe34\u1833\ua61f\uc246, invokevirtual:\u6b0d\uf9c5\ucfaf\ud36e\ub102(\u6b0d\uf9c5\ucfaf\ud36e\ub102::\u8d90\u9255\u3bd6\u5d20\ub83f\u1187, var_8_13A:\u760c\u7ce1\u9a18\ub32d\u6d99\ub6ab[expected:\u6b0d\uf9c5\ucfaf\ud36e\ub102], var_11_346:\uc87f\u5f50\u16f6\ub113\u52d3\u12b2, var_12_34B:float, ldc:float(100.0f), neg:float(var_12_34B:float)), ldc:float(1.0f), ldc:float(0.0f)))
                        invokeinterface:void(\u6b0d\uf9c5\ucfaf\ud36e\ub102::\ua61f\u0a06\u3bc9\ufe34\uc9f6\u8258, invokeinterface:\u6b0d\uf9c5\ucfaf\ud36e\ub102(\u6b0d\uf9c5\ucfaf\ud36e\ub102::\u946b\uf995\ufe34\u1833\ua61f\uc246, invokevirtual:\u6b0d\uf9c5\ucfaf\ud36e\ub102(\u6b0d\uf9c5\ucfaf\ud36e\ub102::\u8d90\u9255\u3bd6\u5d20\ub83f\u1187, var_8_13A:\u760c\u7ce1\u9a18\ub32d\u6d99\ub6ab[expected:\u6b0d\uf9c5\ucfaf\ud36e\ub102], var_11_346:\uc87f\u5f50\u16f6\ub113\u52d3\u12b2, var_12_34B:float, ldc:float(100.0f), var_12_34B:float), ldc:float(1.0f), ldc:float(1.0f)))
                        invokeinterface:void(\u6b0d\uf9c5\ucfaf\ud36e\ub102::\ua61f\u0a06\u3bc9\ufe34\uc9f6\u8258, invokeinterface:\u6b0d\uf9c5\ucfaf\ud36e\ub102(\u6b0d\uf9c5\ucfaf\ud36e\ub102::\u946b\uf995\ufe34\u1833\ua61f\uc246, invokevirtual:\u6b0d\uf9c5\ucfaf\ud36e\ub102(\u6b0d\uf9c5\ucfaf\ud36e\ub102::\u8d90\u9255\u3bd6\u5d20\ub83f\u1187, var_8_13A:\u760c\u7ce1\u9a18\ub32d\u6d99\ub6ab[expected:\u6b0d\uf9c5\ucfaf\ud36e\ub102], var_11_346:\uc87f\u5f50\u16f6\ub113\u52d3\u12b2, neg:float(var_12_34B:float), ldc:float(100.0f), var_12_34B:float), ldc:float(0.0f), ldc:float(1.0f)))
                        invokevirtual:void(\u760c\u7ce1\u9a18\ub32d\u6d99\ub6ab::\ua068\uc31c\u6bb9\u34df\uc3e3\u6d99, var_8_13A:\u760c\u7ce1\u9a18\ub32d\u6d99\ub6ab)
                        invokestatic:void(\u446c\u7af6\u5bc4\ub83f\u8413\u600f::\u7c6b\ua562\u5db4\u7006\u1833\u516c, var_8_13A:\u760c\u7ce1\u9a18\ub32d\u6d99\ub6ab)
                    }
                    
                    var_12_3E0 = ldc:float(20.0f)
                    
                    if (invokestatic:boolean(\u8308\u51fa\u6c56\u5db4\ub18d\u34df::\u8640\u0800\u7043\u8753\u8d90\u9255)) {
                        invokevirtual:void(\u4f52\ub7dc\u7bad\ud217\u76bc\u6d99::\u6ec6\u9a18\u92ff\u2dcc\ud12e\u7ce1, getfield:\u4f52\ub7dc\u7bad\ud217\u76bc\u6d99(\u9937\u7d52\u3e75\u98a4\u8aa5\u7006::\u12b2\u7d52\u6435\uc2e8\u69d9\u5654, this:\u9937\u7d52\u3e75\u98a4\u8aa5\u7006), getstatic:\u4179\ubb2b\uc7fe\u51fa\uc910\u8753(\u9937\u7d52\u3e75\u98a4\u8aa5\u7006::\uc3e3\u9af2\uae87\u8753\uae5d\u34df))
                        var_13_3F9 = invokevirtual:int(\u8753\u8709\ubff1\ub32d\u4d85::\u67e9\ud36e\u5fe1\ua6bd\u3711\u494c, getfield:\u16f6\u61a4\u5db4\u4c04\u64ab\u9255[expected:\u8753\u8709\ubff1\ub32d\u4d85](\u9937\u7d52\u3e75\u98a4\u8aa5\u7006::\ud51e\u9033\u8df4\u7043\u5f50\u8aa5, this:\u9937\u7d52\u3e75\u98a4\u8aa5\u7006))
                        var_14_3FF = rem:int(var_13_3F9:int, ldc:int(4))
                        var_15_407 = rem:int(div:int(var_13_3F9:int, ldc:int(4)), ldc:int(2))
                        var_16_412 = div:float(i2f:float(add:int(var_14_3FF:int, ldc:int(0))), ldc:float(4.0f))
                        var_17_41B = div:float(i2f:float(add:int(var_15_407:int, ldc:int(0))), ldc:float(2.0f))
                        var_18_426 = div:float(i2f:float(add:int(var_14_3FF:int, ldc:int(1))), ldc:float(4.0f))
                        var_19_42F = div:float(i2f:float(add:int(var_15_407:int, ldc:int(1))), ldc:float(2.0f))
                        invokevirtual:void(\u760c\u7ce1\u9a18\ub32d\u6d99\ub6ab::\u12cb\u9937\uc246\u5fe1\ubefe\u494c, var_8_13A:\u760c\u7ce1\u9a18\ub32d\u6d99\ub6ab, ldc:int(7), getstatic:\u74b1\u6d69\ud4fe\u4179\u8c8a\u965f(\u6d69\u4c04\ub113\u92ff\u3e75\u12b2::\u6d69\u527a\ubcb0\u5db4\u120d\u5d20))
                        invokeinterface:void(\u6b0d\uf9c5\ucfaf\ud36e\ub102::\ua61f\u0a06\u3bc9\ufe34\uc9f6\u8258, invokeinterface:\u6b0d\uf9c5\ucfaf\ud36e\ub102(\u6b0d\uf9c5\ucfaf\ud36e\ub102::\u946b\uf995\ufe34\u1833\ua61f\uc246, invokevirtual:\u6b0d\uf9c5\ucfaf\ud36e\ub102(\u6b0d\uf9c5\ucfaf\ud36e\ub102::\u8d90\u9255\u3bd6\u5d20\ub83f\u1187, var_8_13A:\u760c\u7ce1\u9a18\ub32d\u6d99\ub6ab[expected:\u6b0d\uf9c5\ucfaf\ud36e\ub102], var_11_346:\uc87f\u5f50\u16f6\ub113\u52d3\u12b2, neg:float(var_12_3E0:float), ldc:float(-100.0f), var_12_3E0:float), var_18_426:float, var_19_42F:float))
                        invokeinterface:void(\u6b0d\uf9c5\ucfaf\ud36e\ub102::\ua61f\u0a06\u3bc9\ufe34\uc9f6\u8258, invokeinterface:\u6b0d\uf9c5\ucfaf\ud36e\ub102(\u6b0d\uf9c5\ucfaf\ud36e\ub102::\u946b\uf995\ufe34\u1833\ua61f\uc246, invokevirtual:\u6b0d\uf9c5\ucfaf\ud36e\ub102(\u6b0d\uf9c5\ucfaf\ud36e\ub102::\u8d90\u9255\u3bd6\u5d20\ub83f\u1187, var_8_13A:\u760c\u7ce1\u9a18\ub32d\u6d99\ub6ab[expected:\u6b0d\uf9c5\ucfaf\ud36e\ub102], var_11_346:\uc87f\u5f50\u16f6\ub113\u52d3\u12b2, var_12_3E0:float, ldc:float(-100.0f), var_12_3E0:float), var_16_412:float, var_19_42F:float))
                        invokeinterface:void(\u6b0d\uf9c5\ucfaf\ud36e\ub102::\ua61f\u0a06\u3bc9\ufe34\uc9f6\u8258, invokeinterface:\u6b0d\uf9c5\ucfaf\ud36e\ub102(\u6b0d\uf9c5\ucfaf\ud36e\ub102::\u946b\uf995\ufe34\u1833\ua61f\uc246, invokevirtual:\u6b0d\uf9c5\ucfaf\ud36e\ub102(\u6b0d\uf9c5\ucfaf\ud36e\ub102::\u8d90\u9255\u3bd6\u5d20\ub83f\u1187, var_8_13A:\u760c\u7ce1\u9a18\ub32d\u6d99\ub6ab[expected:\u6b0d\uf9c5\ucfaf\ud36e\ub102], var_11_346:\uc87f\u5f50\u16f6\ub113\u52d3\u12b2, var_12_3E0:float, ldc:float(-100.0f), neg:float(var_12_3E0:float)), var_16_412:float, var_17_41B:float))
                        invokeinterface:void(\u6b0d\uf9c5\ucfaf\ud36e\ub102::\ua61f\u0a06\u3bc9\ufe34\uc9f6\u8258, invokeinterface:\u6b0d\uf9c5\ucfaf\ud36e\ub102(\u6b0d\uf9c5\ucfaf\ud36e\ub102::\u946b\uf995\ufe34\u1833\ua61f\uc246, invokevirtual:\u6b0d\uf9c5\ucfaf\ud36e\ub102(\u6b0d\uf9c5\ucfaf\ud36e\ub102::\u8d90\u9255\u3bd6\u5d20\ub83f\u1187, var_8_13A:\u760c\u7ce1\u9a18\ub32d\u6d99\ub6ab[expected:\u6b0d\uf9c5\ucfaf\ud36e\ub102], var_11_346:\uc87f\u5f50\u16f6\ub113\u52d3\u12b2, neg:float(var_12_3E0:float), ldc:float(-100.0f), neg:float(var_12_3E0:float)), var_18_426:float, var_17_41B:float))
                        invokevirtual:void(\u760c\u7ce1\u9a18\ub32d\u6d99\ub6ab::\ua068\uc31c\u6bb9\u34df\uc3e3\u6d99, var_8_13A:\u760c\u7ce1\u9a18\ub32d\u6d99\ub6ab)
                        invokestatic:void(\u446c\u7af6\u5bc4\ub83f\u8413\u600f::\u7c6b\ua562\u5db4\u7006\u1833\u516c, var_8_13A:\u760c\u7ce1\u9a18\ub32d\u6d99\ub6ab)
                    }
                    
                    invokestatic:void(\u9af2\u6ec6\u983f\ua068\u8c8a::\u8389\ua3b4\u3d4b\ud36e\u67e9\ubefe)
                    
                    if (var_3_C3:boolean) {
                        invokestatic:void(\uc238\u69d9\u92ff\ub83f\u5245\uc229::\ubcb0\u494c\u3504\u67d0\ucef1\u4daf)
                    }
                    
                    var_13_4CE = mul:float(invokevirtual:float(\u16f6\u61a4\u5db4\u4c04\u64ab\u9255::\ua6bd\u4c2b\uc87f\u4daf\uc7fe\u97b7, getfield:\u16f6\u61a4\u5db4\u4c04\u64ab\u9255(\u9937\u7d52\u3e75\u98a4\u8aa5\u7006::\ud51e\u9033\u8df4\u7043\u5f50\u8aa5, this:\u9937\u7d52\u3e75\u98a4\u8aa5\u7006), p1:float), var_10_2F5:float)
                    
                    if (logicaland:boolean(logicaland:boolean(cmpgt:boolean(var_13_4CE:float, ldc:float(0.0f)), invokestatic:boolean(\u8308\u51fa\u6c56\u5db4\ub18d\u34df::\ub1b9\u6d99\u4bc8\u2dcc\uc238\ud158)), logicalnot:boolean(invokestatic:boolean(\uf9c5\u4c04\uafe7\uc3e3\u88c5\u7049::\u0c95\u8cae\u69d9\ua61f\u946b\u16f6, getfield:\u16f6\u61a4\u5db4\u4c04\u64ab\u9255[expected:\uf9c5\ud158\u4975\uf94d\ud523\uc31c](\u9937\u7d52\u3e75\u98a4\u8aa5\u7006::\ud51e\u9033\u8df4\u7043\u5f50\u8aa5, this:\u9937\u7d52\u3e75\u98a4\u8aa5\u7006))))) {
                        invokestatic:void(\u9af2\u6ec6\u983f\ua068\u8c8a::\u8d90\u92ff\uc84e\u3dd3\uf9c5\u8308, var_13_4CE:float, var_13_4CE:float, var_13_4CE:float, var_13_4CE:float)
                        invokevirtual:void(\u5654\u0800\ub1b9\ua562\u3e75\u8cae::\u8aa5\u3776\u8308\u446c\u3e75\uc87f, getfield:\u5654\u0800\ub1b9\ua562\u3e75\u8cae(\u9937\u7d52\u3e75\u98a4\u8aa5\u7006::\ubcb0\u93a2\ud7e8\ua068\u71ae\ud4fe, this:\u9937\u7d52\u3e75\u98a4\u8aa5\u7006))
                        invokevirtual:void(\u74b1\u6d69\ud4fe\u4179\u8c8a\u965f::\u5bc4\u527a\u839e\u600f\u946b\ub6ab, getfield:\u74b1\u6d69\ud4fe\u4179\u8c8a\u965f(\u9937\u7d52\u3e75\u98a4\u8aa5\u7006::\u3c25\u8cae\ub70c\ufe34\u946b\uf94d, this:\u9937\u7d52\u3e75\u98a4\u8aa5\u7006), ldc:long(0L))
                        invokevirtual:void(\u5654\u0800\ub1b9\ua562\u3e75\u8cae::\u946b\u7043\u56bd\uc87f\uf94d\u9255, getfield:\u5654\u0800\ub1b9\ua562\u3e75\u8cae(\u9937\u7d52\u3e75\u98a4\u8aa5\u7006::\ubcb0\u93a2\ud7e8\ua068\u71ae\ud4fe, this:\u9937\u7d52\u3e75\u98a4\u8aa5\u7006), invokevirtual:\uc87f\u5f50\u16f6\ub113\u52d3\u12b2(\u3711\u6c52\ufcaf\u4bc8\ud158::\u6d99\uae87\u8aa5\u6c52\u4c2b\u88c5, invokevirtual:\u3711\u6c52\ufcaf\u4bc8\ud158(\uafe7\uc7fe\u4c04\u6b5f\u5bc4::\u9033\u12b2\u516c\u97e6\u6d99\ua3b4, p0:\uafe7\uc7fe\u4c04\u6b5f\u5bc4)), ldc:int(7))
                        invokestatic:void(\u5654\u0800\ub1b9\ua562\u3e75\u8cae::\u7ce1\u7c6b\ubb2b\ub6ab\ub19c\u36d3)
                        invokevirtual:void(\u74b1\u6d69\ud4fe\u4179\u8c8a\u965f::\u7873\u8bb0\u0b8e\ucfaf\uc87f\u0a06, getfield:\u74b1\u6d69\ud4fe\u4179\u8c8a\u965f(\u9937\u7d52\u3e75\u98a4\u8aa5\u7006::\u3c25\u8cae\ub70c\ufe34\u946b\uf94d, this:\u9937\u7d52\u3e75\u98a4\u8aa5\u7006))
                    }
                    
                    invokestatic:void(\u9af2\u6ec6\u983f\ua068\u8c8a::\u8d90\u92ff\uc84e\u3dd3\uf9c5\u8308, ldc:float(1.0f), ldc:float(1.0f), ldc:float(1.0f), ldc:float(1.0f))
                    invokestatic:void(\u9af2\u6ec6\u983f\ua068\u8c8a::\u6b5f\ua3b4\ua61f\ub70c\u5140\u6bb9)
                    invokestatic:void(\u9af2\u6ec6\u983f\ua068\u8c8a::\u8413\u9033\u3bc9\uceb8\u1833\u97b7)
                    invokestatic:void(\u9af2\u6ec6\u983f\ua068\u8c8a::\ubded\u8753\uc7fe\u2dcc\u64f2\u8350)
                    
                    if (var_3_C3:boolean) {
                        invokestatic:void(\uc238\u69d9\u92ff\ub83f\u5245\uc229::\u446c\u494c\u6b5f\u4492\ud36e\uff55)
                    }
                    
                    invokevirtual:void(\uafe7\uc7fe\u4c04\u6b5f\u5bc4::\u4ab3\u839e\ub1b9\u1833\u4cd9\u2dcc, p0:\uafe7\uc7fe\u4c04\u6b5f\u5bc4)
                    invokestatic:void(\u9af2\u6ec6\u983f\ua068\u8c8a::\u8389\ua3b4\u3d4b\ud36e\u67e9\ubefe)
                    
                    if (var_3_C3:boolean) {
                        invokestatic:void(\uc238\u69d9\u92ff\ub83f\u5245\uc229::\ubcb0\u494c\u3504\u67d0\ucef1\u4daf)
                    }
                    
                    invokestatic:void(\u9af2\u6ec6\u983f\ua068\u8c8a::\u34df\uc31c\ua3b4\u47c2\u64f2\ubefe, ldc:float(0.0f), ldc:float(0.0f), ldc:float(0.0f))
                    
                    if (cmplt:boolean(sub:double(getfield:double(\u3a62\u5d20\u4f52\uc229\u8308\ud7e8::\u6bb9\uc29a\u99f7\u7e3f\u6b5f\u156b, invokevirtual:\u3a62\u5d20\u4f52\uc229\u8308\ud7e8(\u7d52\u718f\u3776\u6fb0\ub83f::\u0800\u92ee\u4179\u51fa\ub171\u69d9, getfield:\uf995\u72f1\u8389\ucb79\ub6ab\u8d98[expected:\u7d52\u718f\u3776\u6fb0\ub83f](\u67e9\u4daf\u760c\ud217\ua6bd\ubff1::\ud12e\u5245\ud51e\u3d64\u8bb0\u647c, getfield:\u67e9\u4daf\u760c\ud217\ua6bd\ubff1(\u9937\u7d52\u3e75\u98a4\u8aa5\u7006::\u8df4\u3776\ud171\u7006\u51b2\uf995, this:\u9937\u7d52\u3e75\u98a4\u8aa5\u7006)), p1:float)), invokevirtual:double(\uc84e\uc229\u7006\u7049\ufe34\ubb2b::\uc87f\u47c2\u4179\uc87f\u72f1\u385b, invokevirtual:\uc84e\uc229\u7006\u7049\ufe34\ubb2b(\u16f6\u61a4\u5db4\u4c04\u64ab\u9255::\u3d4b\ud523\uff55\u647c\u4ab3\u7af6, getfield:\u16f6\u61a4\u5db4\u4c04\u64ab\u9255(\u9937\u7d52\u3e75\u98a4\u8aa5\u7006::\ud51e\u9033\u8df4\u7043\u5f50\u8aa5, this:\u9937\u7d52\u3e75\u98a4\u8aa5\u7006)))), ldc:double(0.0))) {
                        invokevirtual:void(\uafe7\uc7fe\u4c04\u6b5f\u5bc4::\u9937\u7d52\u3e75\u98a4\u8aa5\u7006, p0:\uafe7\uc7fe\u4c04\u6b5f\u5bc4)
                        invokevirtual:void(\uafe7\uc7fe\u4c04\u6b5f\u5bc4::\u99f7\u4d85\u5bc4\u12cb\ub32d\u839e, p0:\uafe7\uc7fe\u4c04\u6b5f\u5bc4, ldc:double(0.0), ldc:double(12.0), ldc:double(0.0))
                        invokevirtual:void(\u5654\u0800\ub1b9\ua562\u3e75\u8cae::\u8aa5\u3776\u8308\u446c\u3e75\uc87f, getfield:\u5654\u0800\ub1b9\ua562\u3e75\u8cae(\u9937\u7d52\u3e75\u98a4\u8aa5\u7006::\u9937\u3776\ubb2b\u494c\u392e\ud36e, this:\u9937\u7d52\u3e75\u98a4\u8aa5\u7006))
                        invokevirtual:void(\u74b1\u6d69\ud4fe\u4179\u8c8a\u965f::\u5bc4\u527a\u839e\u600f\u946b\ub6ab, getfield:\u74b1\u6d69\ud4fe\u4179\u8c8a\u965f(\u9937\u7d52\u3e75\u98a4\u8aa5\u7006::\u3c25\u8cae\ub70c\ufe34\u946b\uf94d, this:\u9937\u7d52\u3e75\u98a4\u8aa5\u7006), ldc:long(0L))
                        invokevirtual:void(\u5654\u0800\ub1b9\ua562\u3e75\u8cae::\u946b\u7043\u56bd\uc87f\uf94d\u9255, getfield:\u5654\u0800\ub1b9\ua562\u3e75\u8cae(\u9937\u7d52\u3e75\u98a4\u8aa5\u7006::\u9937\u3776\ubb2b\u494c\u392e\ud36e, this:\u9937\u7d52\u3e75\u98a4\u8aa5\u7006), invokevirtual:\uc87f\u5f50\u16f6\ub113\u52d3\u12b2(\u3711\u6c52\ufcaf\u4bc8\ud158::\u6d99\uae87\u8aa5\u6c52\u4c2b\u88c5, invokevirtual:\u3711\u6c52\ufcaf\u4bc8\ud158(\uafe7\uc7fe\u4c04\u6b5f\u5bc4::\u9033\u12b2\u516c\u97e6\u6d99\ua3b4, p0:\uafe7\uc7fe\u4c04\u6b5f\u5bc4)), ldc:int(7))
                        invokestatic:void(\u5654\u0800\ub1b9\ua562\u3e75\u8cae::\u7ce1\u7c6b\ubb2b\ub6ab\ub19c\u36d3)
                        invokevirtual:void(\u74b1\u6d69\ud4fe\u4179\u8c8a\u965f::\u7873\u8bb0\u0b8e\ucfaf\uc87f\u0a06, getfield:\u74b1\u6d69\ud4fe\u4179\u8c8a\u965f(\u9937\u7d52\u3e75\u98a4\u8aa5\u7006::\u3c25\u8cae\ub70c\ufe34\u946b\uf94d, this:\u9937\u7d52\u3e75\u98a4\u8aa5\u7006))
                        invokevirtual:void(\uafe7\uc7fe\u4c04\u6b5f\u5bc4::\u4ab3\u839e\ub1b9\u1833\u4cd9\u2dcc, p0:\uafe7\uc7fe\u4c04\u6b5f\u5bc4)
                    }
                    
                    if (invokevirtual:boolean(\ua61f\u183a\u6c52\uf9c5\u4cd9\u4d85::\u64ab\u40a9\ud4fe\u983f\u8c8a\ufe34, invokevirtual:\ua61f\u183a\u6c52\uf9c5\u4cd9\u4d85(\u16f6\u61a4\u5db4\u4c04\u64ab\u9255::\u7873\u67e9\u3e75\ub6ab\u7873\u7873, getfield:\u16f6\u61a4\u5db4\u4c04\u64ab\u9255(\u9937\u7d52\u3e75\u98a4\u8aa5\u7006::\ud51e\u9033\u8df4\u7043\u5f50\u8aa5, this:\u9937\u7d52\u3e75\u98a4\u8aa5\u7006)))) {
                        invokestatic:void(\u9af2\u6ec6\u983f\ua068\u8c8a::\u34df\uc31c\ua3b4\u47c2\u64f2\ubefe, add:float(mul:float(var_5_11F:float, ldc:float(0.2f)), ldc:float(0.04f)), add:float(mul:float(var_6_127:float, ldc:float(0.2f)), ldc:float(0.04f)), add:float(mul:float(var_7_12F:float, ldc:float(0.6f)), ldc:float(0.1f)))
                    }
                    else {
                        invokestatic:void(\u9af2\u6ec6\u983f\ua068\u8c8a::\u34df\uc31c\ua3b4\u47c2\u64f2\ubefe, var_5_11F:float, var_6_127:float, var_7_12F:float)
                    }
                    
                    invokestatic:void(\u9af2\u6ec6\u983f\ua068\u8c8a::\u97e6\u9255\u59ec\ube23\u64f2\ub32d)
                    invokestatic:void(\u9af2\u6ec6\u983f\ua068\u8c8a::\u6435\uff55\u8640\ub6ab\u527a\u4179, ldc:boolean(1))
                    invokestatic:void(\u9af2\u6ec6\u983f\ua068\u8c8a::\u88c5\u59ec\u93a2\u8258\ub6ab\u72f1)
                }
            }
            
            return:void()
        }
        
        goto(Label_0006)
    }
    
    public void \uc29a\u0800\uae5d\u5fe1\u4bc8\u7049(\u51fa\u12cb\u7330\u74b1\u6c52.\u76bc\u4975\ua6bd\u4daf\u8d98.\uafe7\uc7fe\u4c04\u6b5f\u5bc4 p0, float p1, double p2, double p3, double p4) {
        var_9_7B : \u5654\ubefe\uf9c5\u8258\u88c5\u3d4b
        var_9_A7 : float
        var_16_104 : double
        var_18_124 : double
        var_20_130 : double
        var_16_143 : double
        var_20_156 : double
        var_22_162 : float
        var_23_17A : float
        var_24_186 : float
        var_25_190 : \u3a62\u5d20\u4f52\uc229\u8308\ud7e8
        var_26_198 : int
        var_27_1A4 : int
        var_28_1AC : int
        var_29_227 : \u760c\u7ce1\u9a18\ub32d\u6d99\ub6ab
        var_30_2B1 : int
        
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
            
            if (logicalnot:boolean(invokestatic:boolean(\u8308\u51fa\u6c56\u5db4\ub18d\u34df::\u5140\u0800\ud7e8\u7c6b\u4f4a\u8bb0))) {
                if (invokevirtual:boolean(\u71ae\u5fe1\u0b8e\u5140\uf995\u927d::\uc87f\u7af6\u7043\ub19c\uc84e\u4c04, getstatic:\u71ae\u5fe1\u0b8e\u5140\uf995\u927d(\u6c52\u873d\uc84e\u7ce1\u4daf\u8308::\u8df4\u2dcc\u0c95\u7d52\u7af6\u1833))) {
                    var_9_7B = checkcast:\u5654\ubefe\uf9c5\u8258\u88c5\u3d4b(\u4492\u8aa5\ud171\uc3e3\u4c2b.\u4c04\ua068\u3d64\ua6bd\u8389.\u960f\ubefe\ud4fe\u7c6b\u5db4.\u5654\ubefe\uf9c5\u8258\u88c5\u3d4b.class, invokestatic:Object[expected:\u5654\ubefe\uf9c5\u8258\u88c5\u3d4b](\u6c52\u873d\uc84e\u7ce1\u4daf\u8308::\u7af6\u97e6\u51fa\u8df4\ub6ab\ud523, invokevirtual:\ua61f\u183a\u6c52\uf9c5\u4cd9\u4d85[expected:Object](\u16f6\u61a4\u5db4\u4c04\u64ab\u9255::\u7873\u67e9\u3e75\ub6ab\u7873\u7873, getfield:\u16f6\u61a4\u5db4\u4c04\u64ab\u9255(\u9937\u7d52\u3e75\u98a4\u8aa5\u7006::\ud51e\u9033\u8df4\u7043\u5f50\u8aa5, this:\u9937\u7d52\u3e75\u98a4\u8aa5\u7006)), getstatic:\u71ae\u5fe1\u0b8e\u5140\uf995\u927d(\u6c52\u873d\uc84e\u7ce1\u4daf\u8308::\u8df4\u2dcc\u0c95\u7d52\u7af6\u1833), newarray:Object[](java.lang.Object.class, ldc:int(0))))
                    
                    if (cmpne:boolean(var_9_7B:\u5654\ubefe\uf9c5\u8258\u88c5\u3d4b, aconstnull:\u5654\ubefe\uf9c5\u8258\u88c5\u3d4b())) {
                        invokeinterface:void(\u5654\ubefe\uf9c5\u8258\u88c5\u3d4b::\u76bc\u5f50\ua3b4\u4c04\ua3b4\ub113, var_9_7B:\u5654\ubefe\uf9c5\u8258\u88c5\u3d4b, getfield:int(\u9937\u7d52\u3e75\u98a4\u8aa5\u7006::\u3a62\ubcb0\u873d\u7873\u47c2\u8aa5, this:\u9937\u7d52\u3e75\u98a4\u8aa5\u7006), p1:float, p0:\uafe7\uc7fe\u4c04\u6b5f\u5bc4, getfield:\u16f6\u61a4\u5db4\u4c04\u64ab\u9255(\u9937\u7d52\u3e75\u98a4\u8aa5\u7006::\ud51e\u9033\u8df4\u7043\u5f50\u8aa5, this:\u9937\u7d52\u3e75\u98a4\u8aa5\u7006), getfield:\u67e9\u4daf\u760c\ud217\ua6bd\ubff1(\u9937\u7d52\u3e75\u98a4\u8aa5\u7006::\u8df4\u3776\ud171\u7006\u51b2\uf995, this:\u9937\u7d52\u3e75\u98a4\u8aa5\u7006), p2:double, p3:double, p4:double)
                        return:void()
                    }
                }
                
                var_9_A7 = invokevirtual:float(\ua61f\u183a\u6c52\uf9c5\u4cd9\u4d85::\ub19c\u3711\u6c52\u4179\u392e\ufcaf, invokevirtual:\ua61f\u183a\u6c52\uf9c5\u4cd9\u4d85(\u16f6\u61a4\u5db4\u4c04\u64ab\u9255::\u7873\u67e9\u3e75\ub6ab\u7873\u7873, getfield:\u16f6\u61a4\u5db4\u4c04\u64ab\u9255(\u9937\u7d52\u3e75\u98a4\u8aa5\u7006::\ud51e\u9033\u8df4\u7043\u5f50\u8aa5, this:\u9937\u7d52\u3e75\u98a4\u8aa5\u7006)))
                
                if (logicalnot:boolean(invokestatic:boolean(Float::isNaN, var_9_A7:float))) {
                    if (invokestatic:boolean(\u8308\u51fa\u6c56\u5db4\ub18d\u34df::\u61a4\u3e75\u8aa5\ub102\ub7dc\u647c)) {
                        invokestatic:void(\uc238\u69d9\u92ff\ub83f\u5245\uc229::\u5140\u99f7\u120d\u8d90\u93a2\ucef1)
                    }
                    
                    invokestatic:void(\u9af2\u6ec6\u983f\ua068\u8c8a::\u836c\uc29a\uceb8\u3e75\ub32d\u4ab3)
                    invokestatic:void(\u9af2\u6ec6\u983f\ua068\u8c8a::\uc9f6\u7049\u92ee\ube23\u3c25\u6d99)
                    invokestatic:void(\u9af2\u6ec6\u983f\ua068\u8c8a::\u8413\u9033\u3bc9\uceb8\u1833\u97b7)
                    invokestatic:void(\u9af2\u6ec6\u983f\ua068\u8c8a::\u59ec\u4bc8\u9033\u494c\u8308\ud51e)
                    invokestatic:void(\u9af2\u6ec6\u983f\ua068\u8c8a::\u97e6\u946b\uc7fe\u0b8e\u5fe1\ub113)
                    invokestatic:void(\u9af2\u6ec6\u983f\ua068\u8c8a::\ube23\u624e\u2dcc\u3a62\uf9c5\u8389, getstatic:\ud12e\ub70c\u16f6\uc29a\u8bb0(\ud12e\ub70c\u16f6\uc29a\u8bb0::\ua6bd\ubcb0\ub113\u3bd6\u72f1\u9af2), getstatic:\u624e\uc4d2\u98a4\ud12e\u7873(\u624e\uc4d2\u98a4\ud12e\u7873::\u3e2a\u0a06\u3d4b\u8640\ub19c\u67e9), getstatic:\ud12e\ub70c\u16f6\uc29a\u8bb0(\ud12e\ub70c\u16f6\uc29a\u8bb0::\u5f50\u8cae\u0c95\u6cfe\u92ee\u3e2a), getstatic:\u624e\uc4d2\u98a4\ud12e\u7873(\u624e\uc4d2\u98a4\ud12e\u7873::\u3e2a\u0a06\u3d4b\u8640\ub19c\u67e9))
                    invokestatic:void(\u9af2\u6ec6\u983f\ua068\u8c8a::\ubded\u8753\uc7fe\u2dcc\u64f2\u8350)
                    invokestatic:void(\u9af2\u6ec6\u983f\ua068\u8c8a::\u6435\uff55\u8640\ub6ab\u527a\u4179, ldc:boolean(1))
                    var_16_104 = div:double(add:double(p2:double, f2d:double(mul:float(add:float(i2f:float(getfield:int(\u9937\u7d52\u3e75\u98a4\u8aa5\u7006::\u3a62\ubcb0\u873d\u7873\u47c2\u8aa5, this:\u9937\u7d52\u3e75\u98a4\u8aa5\u7006)), p1:float), ldc:float(0.03f)))), ldc:double(12.0))
                    var_18_124 = add:double(f2d:double(add:float(sub:float(var_9_A7:float, d2f:float(p3:double)), ldc:float(0.33f))), mul:double(getfield:double(\u4daf\u8df4\ubb2b\u759a\u7330\u4ab3::\uc29a\u52d3\ub171\u0c95\u7c6b\u836c, getfield:\u4daf\u8df4\ubb2b\u759a\u7330\u4ab3(\u67e9\u4daf\u760c\ud217\ua6bd\ubff1::\uc84e\u4c04\ubcb0\u0c95\ub8be\u5fe1, getfield:\u67e9\u4daf\u760c\ud217\ua6bd\ubff1(\u9937\u7d52\u3e75\u98a4\u8aa5\u7006::\u8df4\u3776\ud171\u7006\u51b2\uf995, this:\u9937\u7d52\u3e75\u98a4\u8aa5\u7006))), ldc:double(128.0)))
                    var_20_130 = add:double(div:double(p4:double, ldc:double(12.0)), ldc:double(0.33000001311302185))
                    var_16_143 = sub:double(var_16_104:double, i2d:double(mul:int(invokestatic:int(\u927d\uc7fe\u92ff\u98a4\uc84e\uf9c5::\ub19c\u0a06\ub32d\u3d64\u67d0\u839e, div:double(var_16_104:double, ldc:double(2048.0))), ldc:int(2048))))
                    var_20_156 = sub:double(var_20_130:double, i2d:double(mul:int(invokestatic:int(\u927d\uc7fe\u92ff\u98a4\uc84e\uf9c5::\ub19c\u0a06\ub32d\u3d64\u67d0\u839e, div:double(var_20_130:double, ldc:double(2048.0))), ldc:int(2048))))
                    var_22_162 = d2f:float(sub:double(var_16_143:double, i2d:double(invokestatic:int(\u927d\uc7fe\u92ff\u98a4\uc84e\uf9c5::\ub19c\u0a06\ub32d\u3d64\u67d0\u839e, var_16_143:double))))
                    var_23_17A = mul:float(d2f:float(sub:double(div:double(var_18_124:double, ldc:double(4.0)), i2d:double(invokestatic:int(\u927d\uc7fe\u92ff\u98a4\uc84e\uf9c5::\ub19c\u0a06\ub32d\u3d64\u67d0\u839e, div:double(var_18_124:double, ldc:double(4.0)))))), ldc:float(4.0f))
                    var_24_186 = d2f:float(sub:double(var_20_156:double, i2d:double(invokestatic:int(\u927d\uc7fe\u92ff\u98a4\uc84e\uf9c5::\ub19c\u0a06\ub32d\u3d64\u67d0\u839e, var_20_156:double))))
                    var_25_190 = invokevirtual:\u3a62\u5d20\u4f52\uc229\u8308\ud7e8(\u16f6\u61a4\u5db4\u4c04\u64ab\u9255::\u71ae\u8cae\u0a06\ud7e8\u4ab3\ub18d, getfield:\u16f6\u61a4\u5db4\u4c04\u64ab\u9255(\u9937\u7d52\u3e75\u98a4\u8aa5\u7006::\ud51e\u9033\u8df4\u7043\u5f50\u8aa5, this:\u9937\u7d52\u3e75\u98a4\u8aa5\u7006), p1:float)
                    var_26_198 = d2i:int(invokestatic:double(Math::floor, var_16_143:double))
                    var_27_1A4 = d2i:int(invokestatic:double(Math::floor, div:double(var_18_124:double, ldc:double(4.0))))
                    var_28_1AC = d2i:int(invokestatic:double(Math::floor, var_20_156:double))
                    
                    if (logicalor:boolean(logicalor:boolean(logicalor:boolean(logicalor:boolean(cmpne:boolean(var_26_198:int, getfield:int(\u9937\u7d52\u3e75\u98a4\u8aa5\u7006::\ud158\u4f52\u647c\u4975\u927d\u3e75, this:\u9937\u7d52\u3e75\u98a4\u8aa5\u7006)), cmpne:boolean(var_27_1A4:int, getfield:int(\u9937\u7d52\u3e75\u98a4\u8aa5\u7006::\u7330\u5140\u3711\uc7fe\u36d3\uc910, this:\u9937\u7d52\u3e75\u98a4\u8aa5\u7006))), cmpne:boolean(var_28_1AC:int, getfield:int(\u9937\u7d52\u3e75\u98a4\u8aa5\u7006::\u5db4\u0a06\u5654\u76bc\u98a4\u8709, this:\u9937\u7d52\u3e75\u98a4\u8aa5\u7006))), cmpne:boolean(invokevirtual:\u8d90\u4c2b\ub1b9\u40a9\u12cb\ucfaf(\u4daf\u8df4\ubb2b\u759a\u7330\u4ab3::\u6d69\u3dd3\u9937\ud12e\u9937\u2dcc, getfield:\u4daf\u8df4\ubb2b\u759a\u7330\u4ab3(\u67e9\u4daf\u760c\ud217\ua6bd\ubff1::\uc84e\u4c04\ubcb0\u0c95\ub8be\u5fe1, getfield:\u67e9\u4daf\u760c\ud217\ua6bd\ubff1(\u9937\u7d52\u3e75\u98a4\u8aa5\u7006::\u8df4\u3776\ud171\u7006\u51b2\uf995, this:\u9937\u7d52\u3e75\u98a4\u8aa5\u7006))), getfield:\u8d90\u4c2b\ub1b9\u40a9\u12cb\ucfaf(\u9937\u7d52\u3e75\u98a4\u8aa5\u7006::\u8753\u34df\u4e72\u5bc4\u4f4a\u6b0d, this:\u9937\u7d52\u3e75\u98a4\u8aa5\u7006))), cmpgt:boolean(invokevirtual:double(\u3a62\u5d20\u4f52\uc229\u8308\ud7e8::\uc87f\uc2e8\u7af6\u64ab\u718f\u6435, getfield:\u3a62\u5d20\u4f52\uc229\u8308\ud7e8(\u9937\u7d52\u3e75\u98a4\u8aa5\u7006::\uc3e3\u5fe1\u3504\ubefe\u3e75\ucfaf, this:\u9937\u7d52\u3e75\u98a4\u8aa5\u7006), var_25_190:\u3a62\u5d20\u4f52\uc229\u8308\ud7e8), ldc:double(2.0E-4)))) {
                        putfield:int(\u9937\u7d52\u3e75\u98a4\u8aa5\u7006::\ud158\u4f52\u647c\u4975\u927d\u3e75, this:\u9937\u7d52\u3e75\u98a4\u8aa5\u7006, var_26_198:int)
                        putfield:int(\u9937\u7d52\u3e75\u98a4\u8aa5\u7006::\u7330\u5140\u3711\uc7fe\u36d3\uc910, this:\u9937\u7d52\u3e75\u98a4\u8aa5\u7006, var_27_1A4:int)
                        putfield:int(\u9937\u7d52\u3e75\u98a4\u8aa5\u7006::\u5db4\u0a06\u5654\u76bc\u98a4\u8709, this:\u9937\u7d52\u3e75\u98a4\u8aa5\u7006, var_28_1AC:int)
                        putfield:\u3a62\u5d20\u4f52\uc229\u8308\ud7e8(\u9937\u7d52\u3e75\u98a4\u8aa5\u7006::\uc3e3\u5fe1\u3504\ubefe\u3e75\ucfaf, this:\u9937\u7d52\u3e75\u98a4\u8aa5\u7006, var_25_190:\u3a62\u5d20\u4f52\uc229\u8308\ud7e8)
                        putfield:\u8d90\u4c2b\ub1b9\u40a9\u12cb\ucfaf(\u9937\u7d52\u3e75\u98a4\u8aa5\u7006::\u8753\u34df\u4e72\u5bc4\u4f4a\u6b0d, this:\u9937\u7d52\u3e75\u98a4\u8aa5\u7006, invokevirtual:\u8d90\u4c2b\ub1b9\u40a9\u12cb\ucfaf(\u4daf\u8df4\ubb2b\u759a\u7330\u4ab3::\u6d69\u3dd3\u9937\ud12e\u9937\u2dcc, getfield:\u4daf\u8df4\ubb2b\u759a\u7330\u4ab3(\u67e9\u4daf\u760c\ud217\ua6bd\ubff1::\uc84e\u4c04\ubcb0\u0c95\ub8be\u5fe1, getfield:\u67e9\u4daf\u760c\ud217\ua6bd\ubff1(\u9937\u7d52\u3e75\u98a4\u8aa5\u7006::\u8df4\u3776\ud171\u7006\u51b2\uf995, this:\u9937\u7d52\u3e75\u98a4\u8aa5\u7006))))
                        putfield:boolean(\u9937\u7d52\u3e75\u98a4\u8aa5\u7006::\u392e\u4cd9\u8df4\u624e\u51b2\u69d9, this:\u9937\u7d52\u3e75\u98a4\u8aa5\u7006, ldc:boolean(1))
                    }
                    
                    if (getfield:boolean(\u9937\u7d52\u3e75\u98a4\u8aa5\u7006::\u392e\u4cd9\u8df4\u624e\u51b2\u69d9, this:\u9937\u7d52\u3e75\u98a4\u8aa5\u7006)) {
                        putfield:boolean(\u9937\u7d52\u3e75\u98a4\u8aa5\u7006::\u392e\u4cd9\u8df4\u624e\u51b2\u69d9, this:\u9937\u7d52\u3e75\u98a4\u8aa5\u7006, ldc:boolean(0))
                        var_29_227 = invokevirtual:\u760c\u7ce1\u9a18\ub32d\u6d99\ub6ab(\ub6ab\u8cae\u64ab\u5245\ubff1\u3711::\u74b1\u7bad\u6435\uc87f\u6d69\uc238, invokestatic:\ub6ab\u8cae\u64ab\u5245\ubff1\u3711(\ub6ab\u8cae\u64ab\u5245\ubff1\u3711::\u3504\ud523\u99f7\u5140\u5d20\u983f))
                        
                        if (cmpne:boolean(getfield:\u5654\u0800\ub1b9\ua562\u3e75\u8cae(\u9937\u7d52\u3e75\u98a4\u8aa5\u7006::\u34df\u5db4\u4f4a\ubefe\u7330\u8d98, this:\u9937\u7d52\u3e75\u98a4\u8aa5\u7006), aconstnull:\u5654\u0800\ub1b9\ua562\u3e75\u8cae())) {
                            invokevirtual:void(\u5654\u0800\ub1b9\ua562\u3e75\u8cae::close, getfield:\u5654\u0800\ub1b9\ua562\u3e75\u8cae(\u9937\u7d52\u3e75\u98a4\u8aa5\u7006::\u34df\u5db4\u4f4a\ubefe\u7330\u8d98, this:\u9937\u7d52\u3e75\u98a4\u8aa5\u7006))
                        }
                        
                        putfield:\u5654\u0800\ub1b9\ua562\u3e75\u8cae(\u9937\u7d52\u3e75\u98a4\u8aa5\u7006::\u34df\u5db4\u4f4a\ubefe\u7330\u8d98, this:\u9937\u7d52\u3e75\u98a4\u8aa5\u7006, initobject:\u5654\u0800\ub1b9\ua562\u3e75\u8cae(\u5654\u0800\ub1b9\ua562\u3e75\u8cae::<init>, getstatic:\u74b1\u6d69\ud4fe\u4179\u8c8a\u965f(\u6d69\u4c04\ub113\u92ff\u3e75\u12b2::\u6b0d\uc7fe\u1833\u516c\u385b\ubefe)))
                        invokespecial:void(\u9937\u7d52\u3e75\u98a4\u8aa5\u7006::\u7bad\u40a9\uc9f6\u67d0\u92ee\u3e2a, this:\u9937\u7d52\u3e75\u98a4\u8aa5\u7006, var_29_227:\u760c\u7ce1\u9a18\ub32d\u6d99\ub6ab, var_16_143:double, var_18_124:double, var_20_156:double, var_25_190:\u3a62\u5d20\u4f52\uc229\u8308\ud7e8)
                        invokevirtual:void(\u760c\u7ce1\u9a18\ub32d\u6d99\ub6ab::\ua068\uc31c\u6bb9\u34df\uc3e3\u6d99, var_29_227:\u760c\u7ce1\u9a18\ub32d\u6d99\ub6ab)
                        invokevirtual:void(\u5654\u0800\ub1b9\ua562\u3e75\u8cae::\ud217\uf995\uc2e8\u6198\u8d90\u494c, getfield:\u5654\u0800\ub1b9\ua562\u3e75\u8cae(\u9937\u7d52\u3e75\u98a4\u8aa5\u7006::\u34df\u5db4\u4f4a\ubefe\u7330\u8d98, this:\u9937\u7d52\u3e75\u98a4\u8aa5\u7006), var_29_227:\u760c\u7ce1\u9a18\ub32d\u6d99\ub6ab)
                    }
                    
                    invokevirtual:void(\u4f52\ub7dc\u7bad\ud217\u76bc\u6d99::\u6ec6\u9a18\u92ff\u2dcc\ud12e\u7ce1, getfield:\u4f52\ub7dc\u7bad\ud217\u76bc\u6d99(\u9937\u7d52\u3e75\u98a4\u8aa5\u7006::\u12b2\u7d52\u6435\uc2e8\u69d9\u5654, this:\u9937\u7d52\u3e75\u98a4\u8aa5\u7006), getstatic:\u4179\ubb2b\uc7fe\u51fa\uc910\u8753(\u9937\u7d52\u3e75\u98a4\u8aa5\u7006::\u4ab3\u4975\ua61f\u446c\ub18d\u4ab3))
                    invokevirtual:void(\uafe7\uc7fe\u4c04\u6b5f\u5bc4::\u9937\u7d52\u3e75\u98a4\u8aa5\u7006, p0:\uafe7\uc7fe\u4c04\u6b5f\u5bc4)
                    invokevirtual:void(\uafe7\uc7fe\u4c04\u6b5f\u5bc4::\uf94d\ub18d\u5654\ubff1\u624e\ua6bd, p0:\uafe7\uc7fe\u4c04\u6b5f\u5bc4, ldc:float(12.0f), ldc:float(1.0f), ldc:float(12.0f))
                    invokevirtual:void(\uafe7\uc7fe\u4c04\u6b5f\u5bc4::\u99f7\u4d85\u5bc4\u12cb\ub32d\u839e, p0:\uafe7\uc7fe\u4c04\u6b5f\u5bc4, f2d:double(neg:float(var_22_162:float)), f2d:double(var_23_17A:float), f2d:double(neg:float(var_24_186:float)))
                    
                    if (cmpne:boolean(getfield:\u5654\u0800\ub1b9\ua562\u3e75\u8cae(\u9937\u7d52\u3e75\u98a4\u8aa5\u7006::\u34df\u5db4\u4f4a\ubefe\u7330\u8d98, this:\u9937\u7d52\u3e75\u98a4\u8aa5\u7006), aconstnull:\u5654\u0800\ub1b9\ua562\u3e75\u8cae())) {
                        invokevirtual:void(\u5654\u0800\ub1b9\ua562\u3e75\u8cae::\u8aa5\u3776\u8308\u446c\u3e75\uc87f, getfield:\u5654\u0800\ub1b9\ua562\u3e75\u8cae(\u9937\u7d52\u3e75\u98a4\u8aa5\u7006::\u34df\u5db4\u4f4a\ubefe\u7330\u8d98, this:\u9937\u7d52\u3e75\u98a4\u8aa5\u7006))
                        invokevirtual:void(\u74b1\u6d69\ud4fe\u4179\u8c8a\u965f::\u5bc4\u527a\u839e\u600f\u946b\ub6ab, getstatic:\u74b1\u6d69\ud4fe\u4179\u8c8a\u965f(\u6d69\u4c04\ub113\u92ff\u3e75\u12b2::\u6b0d\uc7fe\u1833\u516c\u385b\ubefe), ldc:long(0L))
                        var_30_2B1 = cmpne:boolean[expected:int](getfield:\u8d90\u4c2b\ub1b9\u40a9\u12cb\ucfaf(\u9937\u7d52\u3e75\u98a4\u8aa5\u7006::\u8753\u34df\u4e72\u5bc4\u4f4a\u6b0d, this:\u9937\u7d52\u3e75\u98a4\u8aa5\u7006), getstatic:\u8d90\u4c2b\ub1b9\u40a9\u12cb\ucfaf(\u8d90\u4c2b\ub1b9\u40a9\u12cb\ucfaf::\u93a2\u8aa5\u9255\u12cb\uc4d2\u4e72))
                        
                        while (cmplt:boolean(var_30_2B1:int, ldc:int(2))) {
                            if (cmpeq:boolean(var_30_2B1:int, ldc:int(0))) {
                                invokestatic:void(\u9af2\u6ec6\u983f\ua068\u8c8a::\u72f1\uc229\u98a4\uc87f\u0b8e\u52d3, ldc:boolean(0), ldc:boolean(0), ldc:boolean(0), ldc:boolean(0))
                            }
                            else {
                                invokestatic:void(\u9af2\u6ec6\u983f\ua068\u8c8a::\u72f1\uc229\u98a4\uc87f\u0b8e\u52d3, ldc:boolean(1), ldc:boolean(1), ldc:boolean(1), ldc:boolean(1))
                            }
                            
                            invokevirtual:void(\u5654\u0800\ub1b9\ua562\u3e75\u8cae::\u946b\u7043\u56bd\uc87f\uf94d\u9255, getfield:\u5654\u0800\ub1b9\ua562\u3e75\u8cae(\u9937\u7d52\u3e75\u98a4\u8aa5\u7006::\u34df\u5db4\u4f4a\ubefe\u7330\u8d98, this:\u9937\u7d52\u3e75\u98a4\u8aa5\u7006), invokevirtual:\uc87f\u5f50\u16f6\ub113\u52d3\u12b2(\u3711\u6c52\ufcaf\u4bc8\ud158::\u6d99\uae87\u8aa5\u6c52\u4c2b\u88c5, invokevirtual:\u3711\u6c52\ufcaf\u4bc8\ud158(\uafe7\uc7fe\u4c04\u6b5f\u5bc4::\u9033\u12b2\u516c\u97e6\u6d99\ua3b4, p0:\uafe7\uc7fe\u4c04\u6b5f\u5bc4)), ldc:int(7))
                            inc:int(var_30_2B1, ldc:int(1))
                        }
                        
                        invokestatic:void(\u5654\u0800\ub1b9\ua562\u3e75\u8cae::\u7ce1\u7c6b\ubb2b\ub6ab\ub19c\u36d3)
                        invokevirtual:void(\u74b1\u6d69\ud4fe\u4179\u8c8a\u965f::\u7873\u8bb0\u0b8e\ucfaf\uc87f\u0a06, getstatic:\u74b1\u6d69\ud4fe\u4179\u8c8a\u965f(\u6d69\u4c04\ub113\u92ff\u3e75\u12b2::\u6b0d\uc7fe\u1833\u516c\u385b\ubefe))
                    }
                    
                    invokevirtual:void(\uafe7\uc7fe\u4c04\u6b5f\u5bc4::\u4ab3\u839e\ub1b9\u1833\u4cd9\u2dcc, p0:\uafe7\uc7fe\u4c04\u6b5f\u5bc4)
                    invokestatic:void(\u9af2\u6ec6\u983f\ua068\u8c8a::\u8d90\u92ff\uc84e\u3dd3\uf9c5\u8308, ldc:float(1.0f), ldc:float(1.0f), ldc:float(1.0f), ldc:float(1.0f))
                    invokestatic:void(\u9af2\u6ec6\u983f\ua068\u8c8a::\u624e\u156b\u6c56\uc910\ub70c\u40a9)
                    invokestatic:void(\u9af2\u6ec6\u983f\ua068\u8c8a::\u5f50\uc29a\u3a62\uceb8\ud171\uc2e8)
                    invokestatic:void(\u9af2\u6ec6\u983f\ua068\u8c8a::\u6b5f\ua3b4\ua61f\ub70c\u5140\u6bb9)
                    invokestatic:void(\u9af2\u6ec6\u983f\ua068\u8c8a::\u88c5\u59ec\u93a2\u8258\ub6ab\u72f1)
                    
                    if (invokestatic:boolean(\u8308\u51fa\u6c56\u5db4\ub18d\u34df::\u61a4\u3e75\u8aa5\ub102\ub7dc\u647c)) {
                        invokestatic:void(\uc238\u69d9\u92ff\ub83f\u5245\uc229::\u494c\ub8be\ub113\ud217\ua562\ubff1)
                    }
                }
            }
            
            return:void()
        }
        
        goto(Label_0006)
    }
    
    private void \u7bad\u40a9\uc9f6\u67d0\u92ee\u3e2a(\u5d20\u7043\u88c5\u5db4\uf94d.\u760c\u7ce1\u9a18\ub32d\u6d99\ub6ab p0, double p1, double p2, double p3, \u7c6b\u7c6b\ubefe\u385b\u3c25.\ud7e8\u0800\uae87\u8d90\u183a.\u34df\u12b2\u16f6\u873d\u7af6.\u3a62\u5d20\u4f52\uc229\u8308\ud7e8 p4) {
        var_14_77 : float
        var_15_83 : float
        var_16_8B : float
        var_17_93 : float
        var_18_9B : float
        var_19_A3 : float
        var_20_AB : float
        var_21_B3 : float
        var_22_BB : float
        var_23_C3 : float
        var_24_CB : float
        var_25_D3 : float
        var_26_DB : float
        var_27_E3 : float
        var_28_FC : float
        var_29_106 : int
        var_30_110 : int
        var_31_11E : float
        var_32_126 : float
        var_33_3C9 : int
        var_33_53F : int
        var_33_6BD : int
        var_33_833 : int
        var_31_9C2 : int
        var_32_9CD : int
        
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
            var_14_77 = mul:float(i2f:float(invokestatic:int(\u927d\uc7fe\u92ff\u98a4\uc84e\uf9c5::\ub19c\u0a06\ub32d\u3d64\u67d0\u839e, p1:double)), ldc:float(0.00390625f))
            var_15_83 = mul:float(i2f:float(invokestatic:int(\u927d\uc7fe\u92ff\u98a4\uc84e\uf9c5::\ub19c\u0a06\ub32d\u3d64\u67d0\u839e, p3:double)), ldc:float(0.00390625f))
            var_16_8B = d2f:float(getfield:double(\u3a62\u5d20\u4f52\uc229\u8308\ud7e8::\ubf56\u4c04\u4492\u36d3\u71f1\u12cb, p4:\u3a62\u5d20\u4f52\uc229\u8308\ud7e8))
            var_17_93 = d2f:float(getfield:double(\u3a62\u5d20\u4f52\uc229\u8308\ud7e8::\u6bb9\uc29a\u99f7\u7e3f\u6b5f\u156b, p4:\u3a62\u5d20\u4f52\uc229\u8308\ud7e8))
            var_18_9B = d2f:float(getfield:double(\u3a62\u5d20\u4f52\uc229\u8308\ud7e8::\ub7dc\ubff1\ub19c\u6198\uc2e8\ufe34, p4:\u3a62\u5d20\u4f52\uc229\u8308\ud7e8))
            var_19_A3 = mul:float(var_16_8B:float, ldc:float(0.9f))
            var_20_AB = mul:float(var_17_93:float, ldc:float(0.9f))
            var_21_B3 = mul:float(var_18_9B:float, ldc:float(0.9f))
            var_22_BB = mul:float(var_16_8B:float, ldc:float(0.7f))
            var_23_C3 = mul:float(var_17_93:float, ldc:float(0.7f))
            var_24_CB = mul:float(var_18_9B:float, ldc:float(0.7f))
            var_25_D3 = mul:float(var_16_8B:float, ldc:float(0.8f))
            var_26_DB = mul:float(var_17_93:float, ldc:float(0.8f))
            var_27_E3 = mul:float(var_18_9B:float, ldc:float(0.8f))
            invokevirtual:void(\u760c\u7ce1\u9a18\ub32d\u6d99\ub6ab::\u12cb\u9937\uc246\u5fe1\ubefe\u494c, p0:\u760c\u7ce1\u9a18\ub32d\u6d99\ub6ab, ldc:int(7), getstatic:\u74b1\u6d69\ud4fe\u4179\u8c8a\u965f(\u6d69\u4c04\ub113\u92ff\u3e75\u12b2::\u6b0d\uc7fe\u1833\u516c\u385b\ubefe))
            var_28_FC = mul:float(d2f:float(invokestatic:double(Math::floor, div:double(p2:double, ldc:double(4.0)))), ldc:float(4.0f))
            
            if (invokestatic:boolean(\u8308\u51fa\u6c56\u5db4\ub18d\u34df::\u5245\u836c\uc7fe\u7ce1\u3bd6\u7330)) {
                var_29_106 = ldc:int(-3)
                
                while (cmple:boolean(var_29_106:int, ldc:int(4))) {
                    var_30_110 = ldc:int(-3)
                    
                    while (cmple:boolean(var_30_110:int, ldc:int(4))) {
                        var_31_11E = i2f:float(mul:int(var_29_106:int, ldc:int(8)))
                        var_32_126 = i2f:float(mul:int(var_30_110:int, ldc:int(8)))
                        
                        if (cmpgt:boolean(var_28_FC:float, ldc:float(-5.0f))) {
                            invokeinterface:void(\u6b0d\uf9c5\ucfaf\ud36e\ub102::\ua61f\u0a06\u3bc9\ufe34\uc9f6\u8258, invokeinterface:\u6b0d\uf9c5\ucfaf\ud36e\ub102(\u6b0d\uf9c5\ucfaf\ud36e\ub102::\u4179\uc7fe\ub8be\u64f2\ua068\u8389, invokeinterface:\u6b0d\uf9c5\ucfaf\ud36e\ub102(\u6b0d\uf9c5\ucfaf\ud36e\ub102::\ub70c\u600f\u93a2\uc910\u9937\u946b, invokeinterface:\u6b0d\uf9c5\ucfaf\ud36e\ub102(\u6b0d\uf9c5\ucfaf\ud36e\ub102::\u946b\uf995\ufe34\u1833\ua61f\uc246, invokevirtual:\u6b0d\uf9c5\ucfaf\ud36e\ub102(\u6b0d\uf9c5\ucfaf\ud36e\ub102::\u8d90\u9255\u3bd6\u5d20\ub83f\u1187, p0:\u760c\u7ce1\u9a18\ub32d\u6d99\ub6ab[expected:\u6b0d\uf9c5\ucfaf\ud36e\ub102], f2d:double(add:float(var_31_11E:float, ldc:float(0.0f))), f2d:double(add:float(var_28_FC:float, ldc:float(0.0f))), f2d:double(add:float(var_32_126:float, ldc:float(8.0f)))), add:float(mul:float(add:float(var_31_11E:float, ldc:float(0.0f)), ldc:float(0.00390625f)), var_14_77:float), add:float(mul:float(add:float(var_32_126:float, ldc:float(8.0f)), ldc:float(0.00390625f)), var_15_83:float)), var_22_BB:float, var_23_C3:float, var_24_CB:float, ldc:float(0.8f)), ldc:float(0.0f), ldc:float(-1.0f), ldc:float(0.0f)))
                            invokeinterface:void(\u6b0d\uf9c5\ucfaf\ud36e\ub102::\ua61f\u0a06\u3bc9\ufe34\uc9f6\u8258, invokeinterface:\u6b0d\uf9c5\ucfaf\ud36e\ub102(\u6b0d\uf9c5\ucfaf\ud36e\ub102::\u4179\uc7fe\ub8be\u64f2\ua068\u8389, invokeinterface:\u6b0d\uf9c5\ucfaf\ud36e\ub102(\u6b0d\uf9c5\ucfaf\ud36e\ub102::\ub70c\u600f\u93a2\uc910\u9937\u946b, invokeinterface:\u6b0d\uf9c5\ucfaf\ud36e\ub102(\u6b0d\uf9c5\ucfaf\ud36e\ub102::\u946b\uf995\ufe34\u1833\ua61f\uc246, invokevirtual:\u6b0d\uf9c5\ucfaf\ud36e\ub102(\u6b0d\uf9c5\ucfaf\ud36e\ub102::\u8d90\u9255\u3bd6\u5d20\ub83f\u1187, p0:\u760c\u7ce1\u9a18\ub32d\u6d99\ub6ab[expected:\u6b0d\uf9c5\ucfaf\ud36e\ub102], f2d:double(add:float(var_31_11E:float, ldc:float(8.0f))), f2d:double(add:float(var_28_FC:float, ldc:float(0.0f))), f2d:double(add:float(var_32_126:float, ldc:float(8.0f)))), add:float(mul:float(add:float(var_31_11E:float, ldc:float(8.0f)), ldc:float(0.00390625f)), var_14_77:float), add:float(mul:float(add:float(var_32_126:float, ldc:float(8.0f)), ldc:float(0.00390625f)), var_15_83:float)), var_22_BB:float, var_23_C3:float, var_24_CB:float, ldc:float(0.8f)), ldc:float(0.0f), ldc:float(-1.0f), ldc:float(0.0f)))
                            invokeinterface:void(\u6b0d\uf9c5\ucfaf\ud36e\ub102::\ua61f\u0a06\u3bc9\ufe34\uc9f6\u8258, invokeinterface:\u6b0d\uf9c5\ucfaf\ud36e\ub102(\u6b0d\uf9c5\ucfaf\ud36e\ub102::\u4179\uc7fe\ub8be\u64f2\ua068\u8389, invokeinterface:\u6b0d\uf9c5\ucfaf\ud36e\ub102(\u6b0d\uf9c5\ucfaf\ud36e\ub102::\ub70c\u600f\u93a2\uc910\u9937\u946b, invokeinterface:\u6b0d\uf9c5\ucfaf\ud36e\ub102(\u6b0d\uf9c5\ucfaf\ud36e\ub102::\u946b\uf995\ufe34\u1833\ua61f\uc246, invokevirtual:\u6b0d\uf9c5\ucfaf\ud36e\ub102(\u6b0d\uf9c5\ucfaf\ud36e\ub102::\u8d90\u9255\u3bd6\u5d20\ub83f\u1187, p0:\u760c\u7ce1\u9a18\ub32d\u6d99\ub6ab[expected:\u6b0d\uf9c5\ucfaf\ud36e\ub102], f2d:double(add:float(var_31_11E:float, ldc:float(8.0f))), f2d:double(add:float(var_28_FC:float, ldc:float(0.0f))), f2d:double(add:float(var_32_126:float, ldc:float(0.0f)))), add:float(mul:float(add:float(var_31_11E:float, ldc:float(8.0f)), ldc:float(0.00390625f)), var_14_77:float), add:float(mul:float(add:float(var_32_126:float, ldc:float(0.0f)), ldc:float(0.00390625f)), var_15_83:float)), var_22_BB:float, var_23_C3:float, var_24_CB:float, ldc:float(0.8f)), ldc:float(0.0f), ldc:float(-1.0f), ldc:float(0.0f)))
                            invokeinterface:void(\u6b0d\uf9c5\ucfaf\ud36e\ub102::\ua61f\u0a06\u3bc9\ufe34\uc9f6\u8258, invokeinterface:\u6b0d\uf9c5\ucfaf\ud36e\ub102(\u6b0d\uf9c5\ucfaf\ud36e\ub102::\u4179\uc7fe\ub8be\u64f2\ua068\u8389, invokeinterface:\u6b0d\uf9c5\ucfaf\ud36e\ub102(\u6b0d\uf9c5\ucfaf\ud36e\ub102::\ub70c\u600f\u93a2\uc910\u9937\u946b, invokeinterface:\u6b0d\uf9c5\ucfaf\ud36e\ub102(\u6b0d\uf9c5\ucfaf\ud36e\ub102::\u946b\uf995\ufe34\u1833\ua61f\uc246, invokevirtual:\u6b0d\uf9c5\ucfaf\ud36e\ub102(\u6b0d\uf9c5\ucfaf\ud36e\ub102::\u8d90\u9255\u3bd6\u5d20\ub83f\u1187, p0:\u760c\u7ce1\u9a18\ub32d\u6d99\ub6ab[expected:\u6b0d\uf9c5\ucfaf\ud36e\ub102], f2d:double(add:float(var_31_11E:float, ldc:float(0.0f))), f2d:double(add:float(var_28_FC:float, ldc:float(0.0f))), f2d:double(add:float(var_32_126:float, ldc:float(0.0f)))), add:float(mul:float(add:float(var_31_11E:float, ldc:float(0.0f)), ldc:float(0.00390625f)), var_14_77:float), add:float(mul:float(add:float(var_32_126:float, ldc:float(0.0f)), ldc:float(0.00390625f)), var_15_83:float)), var_22_BB:float, var_23_C3:float, var_24_CB:float, ldc:float(0.8f)), ldc:float(0.0f), ldc:float(-1.0f), ldc:float(0.0f)))
                        }
                        
                        if (cmple:boolean(var_28_FC:float, ldc:float(5.0f))) {
                            invokeinterface:void(\u6b0d\uf9c5\ucfaf\ud36e\ub102::\ua61f\u0a06\u3bc9\ufe34\uc9f6\u8258, invokeinterface:\u6b0d\uf9c5\ucfaf\ud36e\ub102(\u6b0d\uf9c5\ucfaf\ud36e\ub102::\u4179\uc7fe\ub8be\u64f2\ua068\u8389, invokeinterface:\u6b0d\uf9c5\ucfaf\ud36e\ub102(\u6b0d\uf9c5\ucfaf\ud36e\ub102::\ub70c\u600f\u93a2\uc910\u9937\u946b, invokeinterface:\u6b0d\uf9c5\ucfaf\ud36e\ub102(\u6b0d\uf9c5\ucfaf\ud36e\ub102::\u946b\uf995\ufe34\u1833\ua61f\uc246, invokevirtual:\u6b0d\uf9c5\ucfaf\ud36e\ub102(\u6b0d\uf9c5\ucfaf\ud36e\ub102::\u8d90\u9255\u3bd6\u5d20\ub83f\u1187, p0:\u760c\u7ce1\u9a18\ub32d\u6d99\ub6ab[expected:\u6b0d\uf9c5\ucfaf\ud36e\ub102], f2d:double(add:float(var_31_11E:float, ldc:float(0.0f))), f2d:double(sub:float(add:float(var_28_FC:float, ldc:float(4.0f)), ldc:float(9.765625E-4f))), f2d:double(add:float(var_32_126:float, ldc:float(8.0f)))), add:float(mul:float(add:float(var_31_11E:float, ldc:float(0.0f)), ldc:float(0.00390625f)), var_14_77:float), add:float(mul:float(add:float(var_32_126:float, ldc:float(8.0f)), ldc:float(0.00390625f)), var_15_83:float)), var_16_8B:float, var_17_93:float, var_18_9B:float, ldc:float(0.8f)), ldc:float(0.0f), ldc:float(1.0f), ldc:float(0.0f)))
                            invokeinterface:void(\u6b0d\uf9c5\ucfaf\ud36e\ub102::\ua61f\u0a06\u3bc9\ufe34\uc9f6\u8258, invokeinterface:\u6b0d\uf9c5\ucfaf\ud36e\ub102(\u6b0d\uf9c5\ucfaf\ud36e\ub102::\u4179\uc7fe\ub8be\u64f2\ua068\u8389, invokeinterface:\u6b0d\uf9c5\ucfaf\ud36e\ub102(\u6b0d\uf9c5\ucfaf\ud36e\ub102::\ub70c\u600f\u93a2\uc910\u9937\u946b, invokeinterface:\u6b0d\uf9c5\ucfaf\ud36e\ub102(\u6b0d\uf9c5\ucfaf\ud36e\ub102::\u946b\uf995\ufe34\u1833\ua61f\uc246, invokevirtual:\u6b0d\uf9c5\ucfaf\ud36e\ub102(\u6b0d\uf9c5\ucfaf\ud36e\ub102::\u8d90\u9255\u3bd6\u5d20\ub83f\u1187, p0:\u760c\u7ce1\u9a18\ub32d\u6d99\ub6ab[expected:\u6b0d\uf9c5\ucfaf\ud36e\ub102], f2d:double(add:float(var_31_11E:float, ldc:float(8.0f))), f2d:double(sub:float(add:float(var_28_FC:float, ldc:float(4.0f)), ldc:float(9.765625E-4f))), f2d:double(add:float(var_32_126:float, ldc:float(8.0f)))), add:float(mul:float(add:float(var_31_11E:float, ldc:float(8.0f)), ldc:float(0.00390625f)), var_14_77:float), add:float(mul:float(add:float(var_32_126:float, ldc:float(8.0f)), ldc:float(0.00390625f)), var_15_83:float)), var_16_8B:float, var_17_93:float, var_18_9B:float, ldc:float(0.8f)), ldc:float(0.0f), ldc:float(1.0f), ldc:float(0.0f)))
                            invokeinterface:void(\u6b0d\uf9c5\ucfaf\ud36e\ub102::\ua61f\u0a06\u3bc9\ufe34\uc9f6\u8258, invokeinterface:\u6b0d\uf9c5\ucfaf\ud36e\ub102(\u6b0d\uf9c5\ucfaf\ud36e\ub102::\u4179\uc7fe\ub8be\u64f2\ua068\u8389, invokeinterface:\u6b0d\uf9c5\ucfaf\ud36e\ub102(\u6b0d\uf9c5\ucfaf\ud36e\ub102::\ub70c\u600f\u93a2\uc910\u9937\u946b, invokeinterface:\u6b0d\uf9c5\ucfaf\ud36e\ub102(\u6b0d\uf9c5\ucfaf\ud36e\ub102::\u946b\uf995\ufe34\u1833\ua61f\uc246, invokevirtual:\u6b0d\uf9c5\ucfaf\ud36e\ub102(\u6b0d\uf9c5\ucfaf\ud36e\ub102::\u8d90\u9255\u3bd6\u5d20\ub83f\u1187, p0:\u760c\u7ce1\u9a18\ub32d\u6d99\ub6ab[expected:\u6b0d\uf9c5\ucfaf\ud36e\ub102], f2d:double(add:float(var_31_11E:float, ldc:float(8.0f))), f2d:double(sub:float(add:float(var_28_FC:float, ldc:float(4.0f)), ldc:float(9.765625E-4f))), f2d:double(add:float(var_32_126:float, ldc:float(0.0f)))), add:float(mul:float(add:float(var_31_11E:float, ldc:float(8.0f)), ldc:float(0.00390625f)), var_14_77:float), add:float(mul:float(add:float(var_32_126:float, ldc:float(0.0f)), ldc:float(0.00390625f)), var_15_83:float)), var_16_8B:float, var_17_93:float, var_18_9B:float, ldc:float(0.8f)), ldc:float(0.0f), ldc:float(1.0f), ldc:float(0.0f)))
                            invokeinterface:void(\u6b0d\uf9c5\ucfaf\ud36e\ub102::\ua61f\u0a06\u3bc9\ufe34\uc9f6\u8258, invokeinterface:\u6b0d\uf9c5\ucfaf\ud36e\ub102(\u6b0d\uf9c5\ucfaf\ud36e\ub102::\u4179\uc7fe\ub8be\u64f2\ua068\u8389, invokeinterface:\u6b0d\uf9c5\ucfaf\ud36e\ub102(\u6b0d\uf9c5\ucfaf\ud36e\ub102::\ub70c\u600f\u93a2\uc910\u9937\u946b, invokeinterface:\u6b0d\uf9c5\ucfaf\ud36e\ub102(\u6b0d\uf9c5\ucfaf\ud36e\ub102::\u946b\uf995\ufe34\u1833\ua61f\uc246, invokevirtual:\u6b0d\uf9c5\ucfaf\ud36e\ub102(\u6b0d\uf9c5\ucfaf\ud36e\ub102::\u8d90\u9255\u3bd6\u5d20\ub83f\u1187, p0:\u760c\u7ce1\u9a18\ub32d\u6d99\ub6ab[expected:\u6b0d\uf9c5\ucfaf\ud36e\ub102], f2d:double(add:float(var_31_11E:float, ldc:float(0.0f))), f2d:double(sub:float(add:float(var_28_FC:float, ldc:float(4.0f)), ldc:float(9.765625E-4f))), f2d:double(add:float(var_32_126:float, ldc:float(0.0f)))), add:float(mul:float(add:float(var_31_11E:float, ldc:float(0.0f)), ldc:float(0.00390625f)), var_14_77:float), add:float(mul:float(add:float(var_32_126:float, ldc:float(0.0f)), ldc:float(0.00390625f)), var_15_83:float)), var_16_8B:float, var_17_93:float, var_18_9B:float, ldc:float(0.8f)), ldc:float(0.0f), ldc:float(1.0f), ldc:float(0.0f)))
                        }
                        
                        if (cmpgt:boolean(var_29_106:int, ldc:int(-1))) {
                            var_33_3C9 = ldc:int(0)
                            
                            while (cmplt:boolean(var_33_3C9:int, ldc:int(8))) {
                                invokeinterface:void(\u6b0d\uf9c5\ucfaf\ud36e\ub102::\ua61f\u0a06\u3bc9\ufe34\uc9f6\u8258, invokeinterface:\u6b0d\uf9c5\ucfaf\ud36e\ub102(\u6b0d\uf9c5\ucfaf\ud36e\ub102::\u4179\uc7fe\ub8be\u64f2\ua068\u8389, invokeinterface:\u6b0d\uf9c5\ucfaf\ud36e\ub102(\u6b0d\uf9c5\ucfaf\ud36e\ub102::\ub70c\u600f\u93a2\uc910\u9937\u946b, invokeinterface:\u6b0d\uf9c5\ucfaf\ud36e\ub102(\u6b0d\uf9c5\ucfaf\ud36e\ub102::\u946b\uf995\ufe34\u1833\ua61f\uc246, invokevirtual:\u6b0d\uf9c5\ucfaf\ud36e\ub102(\u6b0d\uf9c5\ucfaf\ud36e\ub102::\u8d90\u9255\u3bd6\u5d20\ub83f\u1187, p0:\u760c\u7ce1\u9a18\ub32d\u6d99\ub6ab[expected:\u6b0d\uf9c5\ucfaf\ud36e\ub102], f2d:double(add:float(add:float(var_31_11E:float, i2f:float(var_33_3C9:int)), ldc:float(0.0f))), f2d:double(add:float(var_28_FC:float, ldc:float(0.0f))), f2d:double(add:float(var_32_126:float, ldc:float(8.0f)))), add:float(mul:float(add:float(add:float(var_31_11E:float, i2f:float(var_33_3C9:int)), ldc:float(0.5f)), ldc:float(0.00390625f)), var_14_77:float), add:float(mul:float(add:float(var_32_126:float, ldc:float(8.0f)), ldc:float(0.00390625f)), var_15_83:float)), var_19_A3:float, var_20_AB:float, var_21_B3:float, ldc:float(0.8f)), ldc:float(-1.0f), ldc:float(0.0f), ldc:float(0.0f)))
                                invokeinterface:void(\u6b0d\uf9c5\ucfaf\ud36e\ub102::\ua61f\u0a06\u3bc9\ufe34\uc9f6\u8258, invokeinterface:\u6b0d\uf9c5\ucfaf\ud36e\ub102(\u6b0d\uf9c5\ucfaf\ud36e\ub102::\u4179\uc7fe\ub8be\u64f2\ua068\u8389, invokeinterface:\u6b0d\uf9c5\ucfaf\ud36e\ub102(\u6b0d\uf9c5\ucfaf\ud36e\ub102::\ub70c\u600f\u93a2\uc910\u9937\u946b, invokeinterface:\u6b0d\uf9c5\ucfaf\ud36e\ub102(\u6b0d\uf9c5\ucfaf\ud36e\ub102::\u946b\uf995\ufe34\u1833\ua61f\uc246, invokevirtual:\u6b0d\uf9c5\ucfaf\ud36e\ub102(\u6b0d\uf9c5\ucfaf\ud36e\ub102::\u8d90\u9255\u3bd6\u5d20\ub83f\u1187, p0:\u760c\u7ce1\u9a18\ub32d\u6d99\ub6ab[expected:\u6b0d\uf9c5\ucfaf\ud36e\ub102], f2d:double(add:float(add:float(var_31_11E:float, i2f:float(var_33_3C9:int)), ldc:float(0.0f))), f2d:double(add:float(var_28_FC:float, ldc:float(4.0f))), f2d:double(add:float(var_32_126:float, ldc:float(8.0f)))), add:float(mul:float(add:float(add:float(var_31_11E:float, i2f:float(var_33_3C9:int)), ldc:float(0.5f)), ldc:float(0.00390625f)), var_14_77:float), add:float(mul:float(add:float(var_32_126:float, ldc:float(8.0f)), ldc:float(0.00390625f)), var_15_83:float)), var_19_A3:float, var_20_AB:float, var_21_B3:float, ldc:float(0.8f)), ldc:float(-1.0f), ldc:float(0.0f), ldc:float(0.0f)))
                                invokeinterface:void(\u6b0d\uf9c5\ucfaf\ud36e\ub102::\ua61f\u0a06\u3bc9\ufe34\uc9f6\u8258, invokeinterface:\u6b0d\uf9c5\ucfaf\ud36e\ub102(\u6b0d\uf9c5\ucfaf\ud36e\ub102::\u4179\uc7fe\ub8be\u64f2\ua068\u8389, invokeinterface:\u6b0d\uf9c5\ucfaf\ud36e\ub102(\u6b0d\uf9c5\ucfaf\ud36e\ub102::\ub70c\u600f\u93a2\uc910\u9937\u946b, invokeinterface:\u6b0d\uf9c5\ucfaf\ud36e\ub102(\u6b0d\uf9c5\ucfaf\ud36e\ub102::\u946b\uf995\ufe34\u1833\ua61f\uc246, invokevirtual:\u6b0d\uf9c5\ucfaf\ud36e\ub102(\u6b0d\uf9c5\ucfaf\ud36e\ub102::\u8d90\u9255\u3bd6\u5d20\ub83f\u1187, p0:\u760c\u7ce1\u9a18\ub32d\u6d99\ub6ab[expected:\u6b0d\uf9c5\ucfaf\ud36e\ub102], f2d:double(add:float(add:float(var_31_11E:float, i2f:float(var_33_3C9:int)), ldc:float(0.0f))), f2d:double(add:float(var_28_FC:float, ldc:float(4.0f))), f2d:double(add:float(var_32_126:float, ldc:float(0.0f)))), add:float(mul:float(add:float(add:float(var_31_11E:float, i2f:float(var_33_3C9:int)), ldc:float(0.5f)), ldc:float(0.00390625f)), var_14_77:float), add:float(mul:float(add:float(var_32_126:float, ldc:float(0.0f)), ldc:float(0.00390625f)), var_15_83:float)), var_19_A3:float, var_20_AB:float, var_21_B3:float, ldc:float(0.8f)), ldc:float(-1.0f), ldc:float(0.0f), ldc:float(0.0f)))
                                invokeinterface:void(\u6b0d\uf9c5\ucfaf\ud36e\ub102::\ua61f\u0a06\u3bc9\ufe34\uc9f6\u8258, invokeinterface:\u6b0d\uf9c5\ucfaf\ud36e\ub102(\u6b0d\uf9c5\ucfaf\ud36e\ub102::\u4179\uc7fe\ub8be\u64f2\ua068\u8389, invokeinterface:\u6b0d\uf9c5\ucfaf\ud36e\ub102(\u6b0d\uf9c5\ucfaf\ud36e\ub102::\ub70c\u600f\u93a2\uc910\u9937\u946b, invokeinterface:\u6b0d\uf9c5\ucfaf\ud36e\ub102(\u6b0d\uf9c5\ucfaf\ud36e\ub102::\u946b\uf995\ufe34\u1833\ua61f\uc246, invokevirtual:\u6b0d\uf9c5\ucfaf\ud36e\ub102(\u6b0d\uf9c5\ucfaf\ud36e\ub102::\u8d90\u9255\u3bd6\u5d20\ub83f\u1187, p0:\u760c\u7ce1\u9a18\ub32d\u6d99\ub6ab[expected:\u6b0d\uf9c5\ucfaf\ud36e\ub102], f2d:double(add:float(add:float(var_31_11E:float, i2f:float(var_33_3C9:int)), ldc:float(0.0f))), f2d:double(add:float(var_28_FC:float, ldc:float(0.0f))), f2d:double(add:float(var_32_126:float, ldc:float(0.0f)))), add:float(mul:float(add:float(add:float(var_31_11E:float, i2f:float(var_33_3C9:int)), ldc:float(0.5f)), ldc:float(0.00390625f)), var_14_77:float), add:float(mul:float(add:float(var_32_126:float, ldc:float(0.0f)), ldc:float(0.00390625f)), var_15_83:float)), var_19_A3:float, var_20_AB:float, var_21_B3:float, ldc:float(0.8f)), ldc:float(-1.0f), ldc:float(0.0f), ldc:float(0.0f)))
                                inc:int(var_33_3C9, ldc:int(1))
                            }
                        }
                        
                        if (cmple:boolean(var_29_106:int, ldc:int(1))) {
                            var_33_53F = ldc:int(0)
                            
                            while (cmplt:boolean(var_33_53F:int, ldc:int(8))) {
                                invokeinterface:void(\u6b0d\uf9c5\ucfaf\ud36e\ub102::\ua61f\u0a06\u3bc9\ufe34\uc9f6\u8258, invokeinterface:\u6b0d\uf9c5\ucfaf\ud36e\ub102(\u6b0d\uf9c5\ucfaf\ud36e\ub102::\u4179\uc7fe\ub8be\u64f2\ua068\u8389, invokeinterface:\u6b0d\uf9c5\ucfaf\ud36e\ub102(\u6b0d\uf9c5\ucfaf\ud36e\ub102::\ub70c\u600f\u93a2\uc910\u9937\u946b, invokeinterface:\u6b0d\uf9c5\ucfaf\ud36e\ub102(\u6b0d\uf9c5\ucfaf\ud36e\ub102::\u946b\uf995\ufe34\u1833\ua61f\uc246, invokevirtual:\u6b0d\uf9c5\ucfaf\ud36e\ub102(\u6b0d\uf9c5\ucfaf\ud36e\ub102::\u8d90\u9255\u3bd6\u5d20\ub83f\u1187, p0:\u760c\u7ce1\u9a18\ub32d\u6d99\ub6ab[expected:\u6b0d\uf9c5\ucfaf\ud36e\ub102], f2d:double(sub:float(add:float(add:float(var_31_11E:float, i2f:float(var_33_53F:int)), ldc:float(1.0f)), ldc:float(9.765625E-4f))), f2d:double(add:float(var_28_FC:float, ldc:float(0.0f))), f2d:double(add:float(var_32_126:float, ldc:float(8.0f)))), add:float(mul:float(add:float(add:float(var_31_11E:float, i2f:float(var_33_53F:int)), ldc:float(0.5f)), ldc:float(0.00390625f)), var_14_77:float), add:float(mul:float(add:float(var_32_126:float, ldc:float(8.0f)), ldc:float(0.00390625f)), var_15_83:float)), var_19_A3:float, var_20_AB:float, var_21_B3:float, ldc:float(0.8f)), ldc:float(1.0f), ldc:float(0.0f), ldc:float(0.0f)))
                                invokeinterface:void(\u6b0d\uf9c5\ucfaf\ud36e\ub102::\ua61f\u0a06\u3bc9\ufe34\uc9f6\u8258, invokeinterface:\u6b0d\uf9c5\ucfaf\ud36e\ub102(\u6b0d\uf9c5\ucfaf\ud36e\ub102::\u4179\uc7fe\ub8be\u64f2\ua068\u8389, invokeinterface:\u6b0d\uf9c5\ucfaf\ud36e\ub102(\u6b0d\uf9c5\ucfaf\ud36e\ub102::\ub70c\u600f\u93a2\uc910\u9937\u946b, invokeinterface:\u6b0d\uf9c5\ucfaf\ud36e\ub102(\u6b0d\uf9c5\ucfaf\ud36e\ub102::\u946b\uf995\ufe34\u1833\ua61f\uc246, invokevirtual:\u6b0d\uf9c5\ucfaf\ud36e\ub102(\u6b0d\uf9c5\ucfaf\ud36e\ub102::\u8d90\u9255\u3bd6\u5d20\ub83f\u1187, p0:\u760c\u7ce1\u9a18\ub32d\u6d99\ub6ab[expected:\u6b0d\uf9c5\ucfaf\ud36e\ub102], f2d:double(sub:float(add:float(add:float(var_31_11E:float, i2f:float(var_33_53F:int)), ldc:float(1.0f)), ldc:float(9.765625E-4f))), f2d:double(add:float(var_28_FC:float, ldc:float(4.0f))), f2d:double(add:float(var_32_126:float, ldc:float(8.0f)))), add:float(mul:float(add:float(add:float(var_31_11E:float, i2f:float(var_33_53F:int)), ldc:float(0.5f)), ldc:float(0.00390625f)), var_14_77:float), add:float(mul:float(add:float(var_32_126:float, ldc:float(8.0f)), ldc:float(0.00390625f)), var_15_83:float)), var_19_A3:float, var_20_AB:float, var_21_B3:float, ldc:float(0.8f)), ldc:float(1.0f), ldc:float(0.0f), ldc:float(0.0f)))
                                invokeinterface:void(\u6b0d\uf9c5\ucfaf\ud36e\ub102::\ua61f\u0a06\u3bc9\ufe34\uc9f6\u8258, invokeinterface:\u6b0d\uf9c5\ucfaf\ud36e\ub102(\u6b0d\uf9c5\ucfaf\ud36e\ub102::\u4179\uc7fe\ub8be\u64f2\ua068\u8389, invokeinterface:\u6b0d\uf9c5\ucfaf\ud36e\ub102(\u6b0d\uf9c5\ucfaf\ud36e\ub102::\ub70c\u600f\u93a2\uc910\u9937\u946b, invokeinterface:\u6b0d\uf9c5\ucfaf\ud36e\ub102(\u6b0d\uf9c5\ucfaf\ud36e\ub102::\u946b\uf995\ufe34\u1833\ua61f\uc246, invokevirtual:\u6b0d\uf9c5\ucfaf\ud36e\ub102(\u6b0d\uf9c5\ucfaf\ud36e\ub102::\u8d90\u9255\u3bd6\u5d20\ub83f\u1187, p0:\u760c\u7ce1\u9a18\ub32d\u6d99\ub6ab[expected:\u6b0d\uf9c5\ucfaf\ud36e\ub102], f2d:double(sub:float(add:float(add:float(var_31_11E:float, i2f:float(var_33_53F:int)), ldc:float(1.0f)), ldc:float(9.765625E-4f))), f2d:double(add:float(var_28_FC:float, ldc:float(4.0f))), f2d:double(add:float(var_32_126:float, ldc:float(0.0f)))), add:float(mul:float(add:float(add:float(var_31_11E:float, i2f:float(var_33_53F:int)), ldc:float(0.5f)), ldc:float(0.00390625f)), var_14_77:float), add:float(mul:float(add:float(var_32_126:float, ldc:float(0.0f)), ldc:float(0.00390625f)), var_15_83:float)), var_19_A3:float, var_20_AB:float, var_21_B3:float, ldc:float(0.8f)), ldc:float(1.0f), ldc:float(0.0f), ldc:float(0.0f)))
                                invokeinterface:void(\u6b0d\uf9c5\ucfaf\ud36e\ub102::\ua61f\u0a06\u3bc9\ufe34\uc9f6\u8258, invokeinterface:\u6b0d\uf9c5\ucfaf\ud36e\ub102(\u6b0d\uf9c5\ucfaf\ud36e\ub102::\u4179\uc7fe\ub8be\u64f2\ua068\u8389, invokeinterface:\u6b0d\uf9c5\ucfaf\ud36e\ub102(\u6b0d\uf9c5\ucfaf\ud36e\ub102::\ub70c\u600f\u93a2\uc910\u9937\u946b, invokeinterface:\u6b0d\uf9c5\ucfaf\ud36e\ub102(\u6b0d\uf9c5\ucfaf\ud36e\ub102::\u946b\uf995\ufe34\u1833\ua61f\uc246, invokevirtual:\u6b0d\uf9c5\ucfaf\ud36e\ub102(\u6b0d\uf9c5\ucfaf\ud36e\ub102::\u8d90\u9255\u3bd6\u5d20\ub83f\u1187, p0:\u760c\u7ce1\u9a18\ub32d\u6d99\ub6ab[expected:\u6b0d\uf9c5\ucfaf\ud36e\ub102], f2d:double(sub:float(add:float(add:float(var_31_11E:float, i2f:float(var_33_53F:int)), ldc:float(1.0f)), ldc:float(9.765625E-4f))), f2d:double(add:float(var_28_FC:float, ldc:float(0.0f))), f2d:double(add:float(var_32_126:float, ldc:float(0.0f)))), add:float(mul:float(add:float(add:float(var_31_11E:float, i2f:float(var_33_53F:int)), ldc:float(0.5f)), ldc:float(0.00390625f)), var_14_77:float), add:float(mul:float(add:float(var_32_126:float, ldc:float(0.0f)), ldc:float(0.00390625f)), var_15_83:float)), var_19_A3:float, var_20_AB:float, var_21_B3:float, ldc:float(0.8f)), ldc:float(1.0f), ldc:float(0.0f), ldc:float(0.0f)))
                                inc:int(var_33_53F, ldc:int(1))
                            }
                        }
                        
                        if (cmpgt:boolean(var_30_110:int, ldc:int(-1))) {
                            var_33_6BD = ldc:int(0)
                            
                            while (cmplt:boolean(var_33_6BD:int, ldc:int(8))) {
                                invokeinterface:void(\u6b0d\uf9c5\ucfaf\ud36e\ub102::\ua61f\u0a06\u3bc9\ufe34\uc9f6\u8258, invokeinterface:\u6b0d\uf9c5\ucfaf\ud36e\ub102(\u6b0d\uf9c5\ucfaf\ud36e\ub102::\u4179\uc7fe\ub8be\u64f2\ua068\u8389, invokeinterface:\u6b0d\uf9c5\ucfaf\ud36e\ub102(\u6b0d\uf9c5\ucfaf\ud36e\ub102::\ub70c\u600f\u93a2\uc910\u9937\u946b, invokeinterface:\u6b0d\uf9c5\ucfaf\ud36e\ub102(\u6b0d\uf9c5\ucfaf\ud36e\ub102::\u946b\uf995\ufe34\u1833\ua61f\uc246, invokevirtual:\u6b0d\uf9c5\ucfaf\ud36e\ub102(\u6b0d\uf9c5\ucfaf\ud36e\ub102::\u8d90\u9255\u3bd6\u5d20\ub83f\u1187, p0:\u760c\u7ce1\u9a18\ub32d\u6d99\ub6ab[expected:\u6b0d\uf9c5\ucfaf\ud36e\ub102], f2d:double(add:float(var_31_11E:float, ldc:float(0.0f))), f2d:double(add:float(var_28_FC:float, ldc:float(4.0f))), f2d:double(add:float(add:float(var_32_126:float, i2f:float(var_33_6BD:int)), ldc:float(0.0f)))), add:float(mul:float(add:float(var_31_11E:float, ldc:float(0.0f)), ldc:float(0.00390625f)), var_14_77:float), add:float(mul:float(add:float(add:float(var_32_126:float, i2f:float(var_33_6BD:int)), ldc:float(0.5f)), ldc:float(0.00390625f)), var_15_83:float)), var_25_D3:float, var_26_DB:float, var_27_E3:float, ldc:float(0.8f)), ldc:float(0.0f), ldc:float(0.0f), ldc:float(-1.0f)))
                                invokeinterface:void(\u6b0d\uf9c5\ucfaf\ud36e\ub102::\ua61f\u0a06\u3bc9\ufe34\uc9f6\u8258, invokeinterface:\u6b0d\uf9c5\ucfaf\ud36e\ub102(\u6b0d\uf9c5\ucfaf\ud36e\ub102::\u4179\uc7fe\ub8be\u64f2\ua068\u8389, invokeinterface:\u6b0d\uf9c5\ucfaf\ud36e\ub102(\u6b0d\uf9c5\ucfaf\ud36e\ub102::\ub70c\u600f\u93a2\uc910\u9937\u946b, invokeinterface:\u6b0d\uf9c5\ucfaf\ud36e\ub102(\u6b0d\uf9c5\ucfaf\ud36e\ub102::\u946b\uf995\ufe34\u1833\ua61f\uc246, invokevirtual:\u6b0d\uf9c5\ucfaf\ud36e\ub102(\u6b0d\uf9c5\ucfaf\ud36e\ub102::\u8d90\u9255\u3bd6\u5d20\ub83f\u1187, p0:\u760c\u7ce1\u9a18\ub32d\u6d99\ub6ab[expected:\u6b0d\uf9c5\ucfaf\ud36e\ub102], f2d:double(add:float(var_31_11E:float, ldc:float(8.0f))), f2d:double(add:float(var_28_FC:float, ldc:float(4.0f))), f2d:double(add:float(add:float(var_32_126:float, i2f:float(var_33_6BD:int)), ldc:float(0.0f)))), add:float(mul:float(add:float(var_31_11E:float, ldc:float(8.0f)), ldc:float(0.00390625f)), var_14_77:float), add:float(mul:float(add:float(add:float(var_32_126:float, i2f:float(var_33_6BD:int)), ldc:float(0.5f)), ldc:float(0.00390625f)), var_15_83:float)), var_25_D3:float, var_26_DB:float, var_27_E3:float, ldc:float(0.8f)), ldc:float(0.0f), ldc:float(0.0f), ldc:float(-1.0f)))
                                invokeinterface:void(\u6b0d\uf9c5\ucfaf\ud36e\ub102::\ua61f\u0a06\u3bc9\ufe34\uc9f6\u8258, invokeinterface:\u6b0d\uf9c5\ucfaf\ud36e\ub102(\u6b0d\uf9c5\ucfaf\ud36e\ub102::\u4179\uc7fe\ub8be\u64f2\ua068\u8389, invokeinterface:\u6b0d\uf9c5\ucfaf\ud36e\ub102(\u6b0d\uf9c5\ucfaf\ud36e\ub102::\ub70c\u600f\u93a2\uc910\u9937\u946b, invokeinterface:\u6b0d\uf9c5\ucfaf\ud36e\ub102(\u6b0d\uf9c5\ucfaf\ud36e\ub102::\u946b\uf995\ufe34\u1833\ua61f\uc246, invokevirtual:\u6b0d\uf9c5\ucfaf\ud36e\ub102(\u6b0d\uf9c5\ucfaf\ud36e\ub102::\u8d90\u9255\u3bd6\u5d20\ub83f\u1187, p0:\u760c\u7ce1\u9a18\ub32d\u6d99\ub6ab[expected:\u6b0d\uf9c5\ucfaf\ud36e\ub102], f2d:double(add:float(var_31_11E:float, ldc:float(8.0f))), f2d:double(add:float(var_28_FC:float, ldc:float(0.0f))), f2d:double(add:float(add:float(var_32_126:float, i2f:float(var_33_6BD:int)), ldc:float(0.0f)))), add:float(mul:float(add:float(var_31_11E:float, ldc:float(8.0f)), ldc:float(0.00390625f)), var_14_77:float), add:float(mul:float(add:float(add:float(var_32_126:float, i2f:float(var_33_6BD:int)), ldc:float(0.5f)), ldc:float(0.00390625f)), var_15_83:float)), var_25_D3:float, var_26_DB:float, var_27_E3:float, ldc:float(0.8f)), ldc:float(0.0f), ldc:float(0.0f), ldc:float(-1.0f)))
                                invokeinterface:void(\u6b0d\uf9c5\ucfaf\ud36e\ub102::\ua61f\u0a06\u3bc9\ufe34\uc9f6\u8258, invokeinterface:\u6b0d\uf9c5\ucfaf\ud36e\ub102(\u6b0d\uf9c5\ucfaf\ud36e\ub102::\u4179\uc7fe\ub8be\u64f2\ua068\u8389, invokeinterface:\u6b0d\uf9c5\ucfaf\ud36e\ub102(\u6b0d\uf9c5\ucfaf\ud36e\ub102::\ub70c\u600f\u93a2\uc910\u9937\u946b, invokeinterface:\u6b0d\uf9c5\ucfaf\ud36e\ub102(\u6b0d\uf9c5\ucfaf\ud36e\ub102::\u946b\uf995\ufe34\u1833\ua61f\uc246, invokevirtual:\u6b0d\uf9c5\ucfaf\ud36e\ub102(\u6b0d\uf9c5\ucfaf\ud36e\ub102::\u8d90\u9255\u3bd6\u5d20\ub83f\u1187, p0:\u760c\u7ce1\u9a18\ub32d\u6d99\ub6ab[expected:\u6b0d\uf9c5\ucfaf\ud36e\ub102], f2d:double(add:float(var_31_11E:float, ldc:float(0.0f))), f2d:double(add:float(var_28_FC:float, ldc:float(0.0f))), f2d:double(add:float(add:float(var_32_126:float, i2f:float(var_33_6BD:int)), ldc:float(0.0f)))), add:float(mul:float(add:float(var_31_11E:float, ldc:float(0.0f)), ldc:float(0.00390625f)), var_14_77:float), add:float(mul:float(add:float(add:float(var_32_126:float, i2f:float(var_33_6BD:int)), ldc:float(0.5f)), ldc:float(0.00390625f)), var_15_83:float)), var_25_D3:float, var_26_DB:float, var_27_E3:float, ldc:float(0.8f)), ldc:float(0.0f), ldc:float(0.0f), ldc:float(-1.0f)))
                                inc:int(var_33_6BD, ldc:int(1))
                            }
                        }
                        
                        if (cmple:boolean(var_30_110:int, ldc:int(1))) {
                            var_33_833 = ldc:int(0)
                            
                            while (cmplt:boolean(var_33_833:int, ldc:int(8))) {
                                invokeinterface:void(\u6b0d\uf9c5\ucfaf\ud36e\ub102::\ua61f\u0a06\u3bc9\ufe34\uc9f6\u8258, invokeinterface:\u6b0d\uf9c5\ucfaf\ud36e\ub102(\u6b0d\uf9c5\ucfaf\ud36e\ub102::\u4179\uc7fe\ub8be\u64f2\ua068\u8389, invokeinterface:\u6b0d\uf9c5\ucfaf\ud36e\ub102(\u6b0d\uf9c5\ucfaf\ud36e\ub102::\ub70c\u600f\u93a2\uc910\u9937\u946b, invokeinterface:\u6b0d\uf9c5\ucfaf\ud36e\ub102(\u6b0d\uf9c5\ucfaf\ud36e\ub102::\u946b\uf995\ufe34\u1833\ua61f\uc246, invokevirtual:\u6b0d\uf9c5\ucfaf\ud36e\ub102(\u6b0d\uf9c5\ucfaf\ud36e\ub102::\u8d90\u9255\u3bd6\u5d20\ub83f\u1187, p0:\u760c\u7ce1\u9a18\ub32d\u6d99\ub6ab[expected:\u6b0d\uf9c5\ucfaf\ud36e\ub102], f2d:double(add:float(var_31_11E:float, ldc:float(0.0f))), f2d:double(add:float(var_28_FC:float, ldc:float(4.0f))), f2d:double(sub:float(add:float(add:float(var_32_126:float, i2f:float(var_33_833:int)), ldc:float(1.0f)), ldc:float(9.765625E-4f)))), add:float(mul:float(add:float(var_31_11E:float, ldc:float(0.0f)), ldc:float(0.00390625f)), var_14_77:float), add:float(mul:float(add:float(add:float(var_32_126:float, i2f:float(var_33_833:int)), ldc:float(0.5f)), ldc:float(0.00390625f)), var_15_83:float)), var_25_D3:float, var_26_DB:float, var_27_E3:float, ldc:float(0.8f)), ldc:float(0.0f), ldc:float(0.0f), ldc:float(1.0f)))
                                invokeinterface:void(\u6b0d\uf9c5\ucfaf\ud36e\ub102::\ua61f\u0a06\u3bc9\ufe34\uc9f6\u8258, invokeinterface:\u6b0d\uf9c5\ucfaf\ud36e\ub102(\u6b0d\uf9c5\ucfaf\ud36e\ub102::\u4179\uc7fe\ub8be\u64f2\ua068\u8389, invokeinterface:\u6b0d\uf9c5\ucfaf\ud36e\ub102(\u6b0d\uf9c5\ucfaf\ud36e\ub102::\ub70c\u600f\u93a2\uc910\u9937\u946b, invokeinterface:\u6b0d\uf9c5\ucfaf\ud36e\ub102(\u6b0d\uf9c5\ucfaf\ud36e\ub102::\u946b\uf995\ufe34\u1833\ua61f\uc246, invokevirtual:\u6b0d\uf9c5\ucfaf\ud36e\ub102(\u6b0d\uf9c5\ucfaf\ud36e\ub102::\u8d90\u9255\u3bd6\u5d20\ub83f\u1187, p0:\u760c\u7ce1\u9a18\ub32d\u6d99\ub6ab[expected:\u6b0d\uf9c5\ucfaf\ud36e\ub102], f2d:double(add:float(var_31_11E:float, ldc:float(8.0f))), f2d:double(add:float(var_28_FC:float, ldc:float(4.0f))), f2d:double(sub:float(add:float(add:float(var_32_126:float, i2f:float(var_33_833:int)), ldc:float(1.0f)), ldc:float(9.765625E-4f)))), add:float(mul:float(add:float(var_31_11E:float, ldc:float(8.0f)), ldc:float(0.00390625f)), var_14_77:float), add:float(mul:float(add:float(add:float(var_32_126:float, i2f:float(var_33_833:int)), ldc:float(0.5f)), ldc:float(0.00390625f)), var_15_83:float)), var_25_D3:float, var_26_DB:float, var_27_E3:float, ldc:float(0.8f)), ldc:float(0.0f), ldc:float(0.0f), ldc:float(1.0f)))
                                invokeinterface:void(\u6b0d\uf9c5\ucfaf\ud36e\ub102::\ua61f\u0a06\u3bc9\ufe34\uc9f6\u8258, invokeinterface:\u6b0d\uf9c5\ucfaf\ud36e\ub102(\u6b0d\uf9c5\ucfaf\ud36e\ub102::\u4179\uc7fe\ub8be\u64f2\ua068\u8389, invokeinterface:\u6b0d\uf9c5\ucfaf\ud36e\ub102(\u6b0d\uf9c5\ucfaf\ud36e\ub102::\ub70c\u600f\u93a2\uc910\u9937\u946b, invokeinterface:\u6b0d\uf9c5\ucfaf\ud36e\ub102(\u6b0d\uf9c5\ucfaf\ud36e\ub102::\u946b\uf995\ufe34\u1833\ua61f\uc246, invokevirtual:\u6b0d\uf9c5\ucfaf\ud36e\ub102(\u6b0d\uf9c5\ucfaf\ud36e\ub102::\u8d90\u9255\u3bd6\u5d20\ub83f\u1187, p0:\u760c\u7ce1\u9a18\ub32d\u6d99\ub6ab[expected:\u6b0d\uf9c5\ucfaf\ud36e\ub102], f2d:double(add:float(var_31_11E:float, ldc:float(8.0f))), f2d:double(add:float(var_28_FC:float, ldc:float(0.0f))), f2d:double(sub:float(add:float(add:float(var_32_126:float, i2f:float(var_33_833:int)), ldc:float(1.0f)), ldc:float(9.765625E-4f)))), add:float(mul:float(add:float(var_31_11E:float, ldc:float(8.0f)), ldc:float(0.00390625f)), var_14_77:float), add:float(mul:float(add:float(add:float(var_32_126:float, i2f:float(var_33_833:int)), ldc:float(0.5f)), ldc:float(0.00390625f)), var_15_83:float)), var_25_D3:float, var_26_DB:float, var_27_E3:float, ldc:float(0.8f)), ldc:float(0.0f), ldc:float(0.0f), ldc:float(1.0f)))
                                invokeinterface:void(\u6b0d\uf9c5\ucfaf\ud36e\ub102::\ua61f\u0a06\u3bc9\ufe34\uc9f6\u8258, invokeinterface:\u6b0d\uf9c5\ucfaf\ud36e\ub102(\u6b0d\uf9c5\ucfaf\ud36e\ub102::\u4179\uc7fe\ub8be\u64f2\ua068\u8389, invokeinterface:\u6b0d\uf9c5\ucfaf\ud36e\ub102(\u6b0d\uf9c5\ucfaf\ud36e\ub102::\ub70c\u600f\u93a2\uc910\u9937\u946b, invokeinterface:\u6b0d\uf9c5\ucfaf\ud36e\ub102(\u6b0d\uf9c5\ucfaf\ud36e\ub102::\u946b\uf995\ufe34\u1833\ua61f\uc246, invokevirtual:\u6b0d\uf9c5\ucfaf\ud36e\ub102(\u6b0d\uf9c5\ucfaf\ud36e\ub102::\u8d90\u9255\u3bd6\u5d20\ub83f\u1187, p0:\u760c\u7ce1\u9a18\ub32d\u6d99\ub6ab[expected:\u6b0d\uf9c5\ucfaf\ud36e\ub102], f2d:double(add:float(var_31_11E:float, ldc:float(0.0f))), f2d:double(add:float(var_28_FC:float, ldc:float(0.0f))), f2d:double(sub:float(add:float(add:float(var_32_126:float, i2f:float(var_33_833:int)), ldc:float(1.0f)), ldc:float(9.765625E-4f)))), add:float(mul:float(add:float(var_31_11E:float, ldc:float(0.0f)), ldc:float(0.00390625f)), var_14_77:float), add:float(mul:float(add:float(add:float(var_32_126:float, i2f:float(var_33_833:int)), ldc:float(0.5f)), ldc:float(0.00390625f)), var_15_83:float)), var_25_D3:float, var_26_DB:float, var_27_E3:float, ldc:float(0.8f)), ldc:float(0.0f), ldc:float(0.0f), ldc:float(1.0f)))
                                inc:int(var_33_833, ldc:int(1))
                            }
                        }
                        
                        inc:int(var_30_110, ldc:int(1))
                    }
                    
                    inc:int(var_29_106, ldc:int(1))
                }
            }
            else {
                var_31_9C2 = ldc:int(-32)
                
                while (cmplt:boolean(var_31_9C2:int, ldc:int(32))) {
                    var_32_9CD = ldc:int(-32)
                    
                    while (cmplt:boolean(var_32_9CD:int, ldc:int(32))) {
                        invokeinterface:void(\u6b0d\uf9c5\ucfaf\ud36e\ub102::\ua61f\u0a06\u3bc9\ufe34\uc9f6\u8258, invokeinterface:\u6b0d\uf9c5\ucfaf\ud36e\ub102(\u6b0d\uf9c5\ucfaf\ud36e\ub102::\u4179\uc7fe\ub8be\u64f2\ua068\u8389, invokeinterface:\u6b0d\uf9c5\ucfaf\ud36e\ub102(\u6b0d\uf9c5\ucfaf\ud36e\ub102::\ub70c\u600f\u93a2\uc910\u9937\u946b, invokeinterface:\u6b0d\uf9c5\ucfaf\ud36e\ub102(\u6b0d\uf9c5\ucfaf\ud36e\ub102::\u946b\uf995\ufe34\u1833\ua61f\uc246, invokevirtual:\u6b0d\uf9c5\ucfaf\ud36e\ub102(\u6b0d\uf9c5\ucfaf\ud36e\ub102::\u8d90\u9255\u3bd6\u5d20\ub83f\u1187, p0:\u760c\u7ce1\u9a18\ub32d\u6d99\ub6ab[expected:\u6b0d\uf9c5\ucfaf\ud36e\ub102], i2d:double(add:int(var_31_9C2:int, ldc:int(0))), f2d:double(var_28_FC:float), i2d:double(add:int(var_32_9CD:int, ldc:int(32)))), add:float(mul:float(i2f:float(add:int(var_31_9C2:int, ldc:int(0))), ldc:float(0.00390625f)), var_14_77:float), add:float(mul:float(i2f:float(add:int(var_32_9CD:int, ldc:int(32))), ldc:float(0.00390625f)), var_15_83:float)), var_16_8B:float, var_17_93:float, var_18_9B:float, ldc:float(0.8f)), ldc:float(0.0f), ldc:float(-1.0f), ldc:float(0.0f)))
                        invokeinterface:void(\u6b0d\uf9c5\ucfaf\ud36e\ub102::\ua61f\u0a06\u3bc9\ufe34\uc9f6\u8258, invokeinterface:\u6b0d\uf9c5\ucfaf\ud36e\ub102(\u6b0d\uf9c5\ucfaf\ud36e\ub102::\u4179\uc7fe\ub8be\u64f2\ua068\u8389, invokeinterface:\u6b0d\uf9c5\ucfaf\ud36e\ub102(\u6b0d\uf9c5\ucfaf\ud36e\ub102::\ub70c\u600f\u93a2\uc910\u9937\u946b, invokeinterface:\u6b0d\uf9c5\ucfaf\ud36e\ub102(\u6b0d\uf9c5\ucfaf\ud36e\ub102::\u946b\uf995\ufe34\u1833\ua61f\uc246, invokevirtual:\u6b0d\uf9c5\ucfaf\ud36e\ub102(\u6b0d\uf9c5\ucfaf\ud36e\ub102::\u8d90\u9255\u3bd6\u5d20\ub83f\u1187, p0:\u760c\u7ce1\u9a18\ub32d\u6d99\ub6ab[expected:\u6b0d\uf9c5\ucfaf\ud36e\ub102], i2d:double(add:int(var_31_9C2:int, ldc:int(32))), f2d:double(var_28_FC:float), i2d:double(add:int(var_32_9CD:int, ldc:int(32)))), add:float(mul:float(i2f:float(add:int(var_31_9C2:int, ldc:int(32))), ldc:float(0.00390625f)), var_14_77:float), add:float(mul:float(i2f:float(add:int(var_32_9CD:int, ldc:int(32))), ldc:float(0.00390625f)), var_15_83:float)), var_16_8B:float, var_17_93:float, var_18_9B:float, ldc:float(0.8f)), ldc:float(0.0f), ldc:float(-1.0f), ldc:float(0.0f)))
                        invokeinterface:void(\u6b0d\uf9c5\ucfaf\ud36e\ub102::\ua61f\u0a06\u3bc9\ufe34\uc9f6\u8258, invokeinterface:\u6b0d\uf9c5\ucfaf\ud36e\ub102(\u6b0d\uf9c5\ucfaf\ud36e\ub102::\u4179\uc7fe\ub8be\u64f2\ua068\u8389, invokeinterface:\u6b0d\uf9c5\ucfaf\ud36e\ub102(\u6b0d\uf9c5\ucfaf\ud36e\ub102::\ub70c\u600f\u93a2\uc910\u9937\u946b, invokeinterface:\u6b0d\uf9c5\ucfaf\ud36e\ub102(\u6b0d\uf9c5\ucfaf\ud36e\ub102::\u946b\uf995\ufe34\u1833\ua61f\uc246, invokevirtual:\u6b0d\uf9c5\ucfaf\ud36e\ub102(\u6b0d\uf9c5\ucfaf\ud36e\ub102::\u8d90\u9255\u3bd6\u5d20\ub83f\u1187, p0:\u760c\u7ce1\u9a18\ub32d\u6d99\ub6ab[expected:\u6b0d\uf9c5\ucfaf\ud36e\ub102], i2d:double(add:int(var_31_9C2:int, ldc:int(32))), f2d:double(var_28_FC:float), i2d:double(add:int(var_32_9CD:int, ldc:int(0)))), add:float(mul:float(i2f:float(add:int(var_31_9C2:int, ldc:int(32))), ldc:float(0.00390625f)), var_14_77:float), add:float(mul:float(i2f:float(add:int(var_32_9CD:int, ldc:int(0))), ldc:float(0.00390625f)), var_15_83:float)), var_16_8B:float, var_17_93:float, var_18_9B:float, ldc:float(0.8f)), ldc:float(0.0f), ldc:float(-1.0f), ldc:float(0.0f)))
                        invokeinterface:void(\u6b0d\uf9c5\ucfaf\ud36e\ub102::\ua61f\u0a06\u3bc9\ufe34\uc9f6\u8258, invokeinterface:\u6b0d\uf9c5\ucfaf\ud36e\ub102(\u6b0d\uf9c5\ucfaf\ud36e\ub102::\u4179\uc7fe\ub8be\u64f2\ua068\u8389, invokeinterface:\u6b0d\uf9c5\ucfaf\ud36e\ub102(\u6b0d\uf9c5\ucfaf\ud36e\ub102::\ub70c\u600f\u93a2\uc910\u9937\u946b, invokeinterface:\u6b0d\uf9c5\ucfaf\ud36e\ub102(\u6b0d\uf9c5\ucfaf\ud36e\ub102::\u946b\uf995\ufe34\u1833\ua61f\uc246, invokevirtual:\u6b0d\uf9c5\ucfaf\ud36e\ub102(\u6b0d\uf9c5\ucfaf\ud36e\ub102::\u8d90\u9255\u3bd6\u5d20\ub83f\u1187, p0:\u760c\u7ce1\u9a18\ub32d\u6d99\ub6ab[expected:\u6b0d\uf9c5\ucfaf\ud36e\ub102], i2d:double(add:int(var_31_9C2:int, ldc:int(0))), f2d:double(var_28_FC:float), i2d:double(add:int(var_32_9CD:int, ldc:int(0)))), add:float(mul:float(i2f:float(add:int(var_31_9C2:int, ldc:int(0))), ldc:float(0.00390625f)), var_14_77:float), add:float(mul:float(i2f:float(add:int(var_32_9CD:int, ldc:int(0))), ldc:float(0.00390625f)), var_15_83:float)), var_16_8B:float, var_17_93:float, var_18_9B:float, ldc:float(0.8f)), ldc:float(0.0f), ldc:float(-1.0f), ldc:float(0.0f)))
                        inc:int(var_32_9CD, ldc:int(32))
                    }
                    
                    inc:int(var_31_9C2, ldc:int(32))
                }
            }
            
            return:void()
        }
        
        goto(Label_0006)
    }
    
    public void \u527a\u0800\ub19c\uf94d\u67d0\uc910(long p0) {
        var_6_8C : Iterator
        var_7_A2 : \u4ab3\ub1b9\u2dcc\ub8be\ube23\uc910
        var_6_EF : Iterator
        var_6_11B : double
        var_8_120 : int
        var_9_137 : Iterator<\u4ab3\ub1b9\u2dcc\ub8be\ube23\uc910>
        var_10_14D : \u4ab3\ub1b9\u2dcc\ub8be\ube23\uc910
        var_11_154 : boolean
        var_12_16C : boolean
        
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
            p0 = d2l:long(add:double(l2d:double(p0:long), ldc:double(1.0E8)))
            putfield:boolean(\u9937\u7d52\u3e75\u98a4\u8aa5\u7006::\uceb8\u88c5\u51b2\u6fb0\uf995\u7c6b, this:\u9937\u7d52\u3e75\u98a4\u8aa5\u7006, or:boolean(getfield:boolean(\u9937\u7d52\u3e75\u98a4\u8aa5\u7006::\uceb8\u88c5\u51b2\u6fb0\uf995\u7c6b, this:\u9937\u7d52\u3e75\u98a4\u8aa5\u7006), invokevirtual:boolean(\u56bd\u392e\u7873\u7043\ud158\u9255::\u51fa\u8aa5\u9af2\uc9f6\u946b\u6d69, getfield:\u56bd\u392e\u7873\u7043\ud158\u9255(\u9937\u7d52\u3e75\u98a4\u8aa5\u7006::\ud4fe\u34df\u8cae\u97e6\u51b2\u67d0, this:\u9937\u7d52\u3e75\u98a4\u8aa5\u7006))))
            invokestatic:long(\ud217\u3504\u760c\uc29a\u97e6\ube23::\u4f4a\u5140\u6b5f\uc910\u983f\u0b8e)
            
            if (cmpgt:boolean(invokeinterface:int(Set::size, getfield:Set(\u9937\u7d52\u3e75\u98a4\u8aa5\u7006::\u946b\u647c\u4f52\u839e\u40a9\u59ec, this:\u9937\u7d52\u3e75\u98a4\u8aa5\u7006)), ldc:int(0))) {
                var_6_8C = invokeinterface:Iterator(Set::iterator, getfield:Set(\u9937\u7d52\u3e75\u98a4\u8aa5\u7006::\u946b\u647c\u4f52\u839e\u40a9\u59ec, this:\u9937\u7d52\u3e75\u98a4\u8aa5\u7006))
                
                while (invokeinterface:boolean(Iterator<E>::hasNext, var_6_8C:Iterator)) {
                    var_7_A2 = checkcast:\u4ab3\ub1b9\u2dcc\ub8be\ube23\uc910(\ub113\uc4d2\u183a\u527a\u6435.\u4ab3\ub1b9\u2dcc\ub8be\ube23\uc910.class, invokeinterface:\u4ab3\ub1b9\u2dcc\ub8be\ube23\uc910(Iterator<\u4ab3\ub1b9\u2dcc\ub8be\ube23\uc910>::next, var_6_8C:Iterator<\u4ab3\ub1b9\u2dcc\ub8be\ube23\uc910>))
                    
                    if (logicalnot:boolean(invokevirtual:boolean(\u56bd\u392e\u7873\u7043\ud158\u9255::\u516c\u392e\u3bd6\uc2e8\u3a62\ud523, getfield:\u56bd\u392e\u7873\u7043\ud158\u9255(\u9937\u7d52\u3e75\u98a4\u8aa5\u7006::\ud4fe\u34df\u8cae\u97e6\u51b2\u67d0, this:\u9937\u7d52\u3e75\u98a4\u8aa5\u7006), var_7_A2:\u4ab3\ub1b9\u2dcc\ub8be\ube23\uc910))) {
                        looporswitchbreak()
                    }
                    
                    invokevirtual:void(\u4ab3\ub1b9\u2dcc\ub8be\ube23\uc910::\u759a\u3bd6\u51b2\u9a18\u4f4a\u392e, var_7_A2:\u4ab3\ub1b9\u2dcc\ub8be\ube23\uc910)
                    invokeinterface:void(Iterator::remove, var_6_8C:Iterator<\u4ab3\ub1b9\u2dcc\ub8be\ube23\uc910>)
                    invokeinterface:boolean(Set<E>::remove, getfield:Set<\u4ab3\ub1b9\u2dcc\ub8be\ube23\uc910>(\u9937\u7d52\u3e75\u98a4\u8aa5\u7006::\ub70c\ud4fe\u7e3f\ud36e\u59ec\u946b, this:\u9937\u7d52\u3e75\u98a4\u8aa5\u7006), var_7_A2:\u4ab3\ub1b9\u2dcc\ub8be\ube23\uc910[expected:Object])
                    invokeinterface:boolean(Set::remove, getfield:Set(\u9937\u7d52\u3e75\u98a4\u8aa5\u7006::\u7e3f\u59ec\u927d\uc229\u4f4a\u8d98, this:\u9937\u7d52\u3e75\u98a4\u8aa5\u7006), var_7_A2:\u4ab3\ub1b9\u2dcc\ub8be\ube23\uc910[expected:Object])
                }
            }
            
            if (cmpgt:boolean(invokeinterface:int(Set::size, getfield:Set(\u9937\u7d52\u3e75\u98a4\u8aa5\u7006::\u7e3f\u59ec\u927d\uc229\u4f4a\u8d98, this:\u9937\u7d52\u3e75\u98a4\u8aa5\u7006)), ldc:int(0))) {
                var_6_EF = invokeinterface:Iterator(Set::iterator, getfield:Set(\u9937\u7d52\u3e75\u98a4\u8aa5\u7006::\u7e3f\u59ec\u927d\uc229\u4f4a\u8d98, this:\u9937\u7d52\u3e75\u98a4\u8aa5\u7006))
                
                if (logicaland:boolean(invokeinterface:boolean(Iterator<E>::hasNext, var_6_EF:Iterator<\u4ab3\ub1b9\u2dcc\ub8be\ube23\uc910>), invokevirtual:boolean(\u56bd\u392e\u7873\u7043\ud158\u9255::\u0c95\ub19c\u99f7\u760c\u183a\u839e, getfield:\u56bd\u392e\u7873\u7043\ud158\u9255(\u9937\u7d52\u3e75\u98a4\u8aa5\u7006::\ud4fe\u34df\u8cae\u97e6\u51b2\u67d0, this:\u9937\u7d52\u3e75\u98a4\u8aa5\u7006), checkcast:\u4ab3\ub1b9\u2dcc\ub8be\ube23\uc910(\ub113\uc4d2\u183a\u527a\u6435.\u4ab3\ub1b9\u2dcc\ub8be\ube23\uc910.class, invokeinterface:\u4ab3\ub1b9\u2dcc\ub8be\ube23\uc910(Iterator<\u4ab3\ub1b9\u2dcc\ub8be\ube23\uc910>::next, var_6_EF:Iterator<\u4ab3\ub1b9\u2dcc\ub8be\ube23\uc910>))))) {
                    invokeinterface:void(Iterator<E>::remove, var_6_EF:Iterator<\u4ab3\ub1b9\u2dcc\ub8be\ube23\uc910>)
                }
            }
            
            var_6_11B = ldc:double(0.0)
            var_8_120 = invokestatic:int(\u8308\u51fa\u6c56\u5db4\ub18d\u34df::\u16f6\u8aa5\ucef1\ua562\u960f\u1833)
            
            if (logicalnot:boolean(invokeinterface:boolean(Set<E>::isEmpty, getfield:Set<\u4ab3\ub1b9\u2dcc\ub8be\ube23\uc910>(\u9937\u7d52\u3e75\u98a4\u8aa5\u7006::\ub70c\ud4fe\u7e3f\ud36e\u59ec\u946b, this:\u9937\u7d52\u3e75\u98a4\u8aa5\u7006)))) {
                var_9_137 = invokeinterface:Iterator<\u4ab3\ub1b9\u2dcc\ub8be\ube23\uc910>(Set<\u4ab3\ub1b9\u2dcc\ub8be\ube23\uc910>::iterator, getfield:Set<\u4ab3\ub1b9\u2dcc\ub8be\ube23\uc910>(\u9937\u7d52\u3e75\u98a4\u8aa5\u7006::\ub70c\ud4fe\u7e3f\ud36e\u59ec\u946b, this:\u9937\u7d52\u3e75\u98a4\u8aa5\u7006))
                
                while (invokeinterface:boolean(Iterator<E>::hasNext, var_9_137:Iterator<\u4ab3\ub1b9\u2dcc\ub8be\ube23\uc910>)) {
                    var_10_14D = checkcast:\u4ab3\ub1b9\u2dcc\ub8be\ube23\uc910(\ub113\uc4d2\u183a\u527a\u6435.\u4ab3\ub1b9\u2dcc\ub8be\ube23\uc910.class, invokeinterface:\u4ab3\ub1b9\u2dcc\ub8be\ube23\uc910(Iterator<\u4ab3\ub1b9\u2dcc\ub8be\ube23\uc910>::next, var_9_137:Iterator<\u4ab3\ub1b9\u2dcc\ub8be\ube23\uc910>))
                    var_11_154 = invokevirtual:boolean(\u4ab3\ub1b9\u2dcc\ub8be\ube23\uc910::\u61a4\u760c\uc238\uae87\ubff1\uae87, var_10_14D:\u4ab3\ub1b9\u2dcc\ub8be\ube23\uc910)
                    
                    if (logicalnot:boolean(logicalor:boolean(invokevirtual:boolean(\u4ab3\ub1b9\u2dcc\ub8be\ube23\uc910::\u7049\u8df4\u40a9\u6c52\uc910\uc84e, var_10_14D:\u4ab3\ub1b9\u2dcc\ub8be\ube23\uc910), var_11_154:boolean))) {
                        var_12_16C = invokevirtual:boolean(\u56bd\u392e\u7873\u7043\ud158\u9255::\u516c\u392e\u3bd6\uc2e8\u3a62\ud523, getfield:\u56bd\u392e\u7873\u7043\ud158\u9255(\u9937\u7d52\u3e75\u98a4\u8aa5\u7006::\ud4fe\u34df\u8cae\u97e6\u51b2\u67d0, this:\u9937\u7d52\u3e75\u98a4\u8aa5\u7006), var_10_14D:\u4ab3\ub1b9\u2dcc\ub8be\ube23\uc910)
                    }
                    else {
                        var_12_16C = invokevirtual:boolean(\u56bd\u392e\u7873\u7043\ud158\u9255::\u3776\u4d85\u8aa5\u4c2b\u6435\u7af6, getfield:\u56bd\u392e\u7873\u7043\ud158\u9255(\u9937\u7d52\u3e75\u98a4\u8aa5\u7006::\ud4fe\u34df\u8cae\u97e6\u51b2\u67d0, this:\u9937\u7d52\u3e75\u98a4\u8aa5\u7006), var_10_14D:\u4ab3\ub1b9\u2dcc\ub8be\ube23\uc910)
                    }
                    
                    if (logicalnot:boolean(var_12_16C:boolean)) {
                        looporswitchbreak()
                    }
                    
                    invokevirtual:void(\u4ab3\ub1b9\u2dcc\ub8be\ube23\uc910::\u759a\u3bd6\u51b2\u9a18\u4f4a\u392e, var_10_14D:\u4ab3\ub1b9\u2dcc\ub8be\ube23\uc910)
                    invokeinterface:void(Iterator::remove, var_9_137:Iterator<\u4ab3\ub1b9\u2dcc\ub8be\ube23\uc910>)
                    
                    if (var_11_154:boolean) {
                        loopcontinue()
                    }
                    
                    var_6_11B = add:double(var_6_11B:double, mul:double(ldc:double(2.0), invokestatic:double(\uc7fe\uafe7\uafe7\ub32d\uc9f6\u9a18::\u36d3\u7af6\u7ce1\ub8be\u8308\uceb8, var_10_14D:\u4ab3\ub1b9\u2dcc\ub8be\ube23\uc910)))
                    
                    if (cmpgt:boolean(var_6_11B:double, i2d:double(var_8_120:int))) {
                        looporswitchbreak()
                    }
                }
            }
            
            return:void()
        }
        
        goto(Label_0006)
    }
    
    private void \u7ce1\u4179\u93a2\u965f\u983f\u7af6(\u3504\ufe34\u600f\u6b0d\u69d9.\u836c\u8cae\ub18d\u836c\u8753\u59ec p0) {
        var_2_5E : \u760c\u7ce1\u9a18\ub32d\u6d99\ub6ab
        var_3_66 : \u34df\u4492\u71ae\uc238\u7873\uafe7
        var_4_75 : double
        var_6_EF : double
        var_8_F8 : double
        var_10_101 : double
        var_12_10A : double
        var_14_13B : int
        var_18_197 : float
        var_22_1BD : double
        var_24_1CF : double
        var_26_1DF : float
        var_27_1E3 : double
        var_29_1F6 : double
        var_31_1FF : float
        var_26_2A0 : float
        var_27_2A4 : double
        var_29_2B7 : double
        var_31_2C0 : float
        var_22_363 : double
        var_24_375 : double
        var_26_385 : float
        var_27_389 : double
        var_29_39C : double
        var_31_3A5 : float
        var_26_446 : float
        var_27_44A : double
        var_29_45D : double
        var_31_466 : float
        
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
            var_2_5E = invokevirtual:\u760c\u7ce1\u9a18\ub32d\u6d99\ub6ab(\ub6ab\u8cae\u64ab\u5245\ubff1\u3711::\u74b1\u7bad\u6435\uc87f\u6d69\uc238, invokestatic:\ub6ab\u8cae\u64ab\u5245\ubff1\u3711(\ub6ab\u8cae\u64ab\u5245\ubff1\u3711::\u3504\ud523\u99f7\u5140\u5d20\u983f))
            var_3_66 = invokevirtual:\u34df\u4492\u71ae\uc238\u7873\uafe7(\uf9c5\ud158\u4975\uf94d\ud523\uc31c::\u40a9\ubded\u6cfe\ub1b9\u6ec6\u7330, getfield:\u16f6\u61a4\u5db4\u4c04\u64ab\u9255[expected:\uf9c5\ud158\u4975\uf94d\ud523\uc31c](\u9937\u7d52\u3e75\u98a4\u8aa5\u7006::\ud51e\u9033\u8df4\u7043\u5f50\u8aa5, this:\u9937\u7d52\u3e75\u98a4\u8aa5\u7006))
            var_4_75 = i2d:double(mul:int(getfield:int(\u4daf\u8df4\ubb2b\u759a\u7330\u4ab3::\uf995\u59ec\ucef1\u5bc4\ub19c\ud36e, getfield:\u4daf\u8df4\ubb2b\u759a\u7330\u4ab3(\u67e9\u4daf\u760c\ud217\ua6bd\ubff1::\uc84e\u4c04\ubcb0\u0c95\ub8be\u5fe1, getfield:\u67e9\u4daf\u760c\ud217\ua6bd\ubff1(\u9937\u7d52\u3e75\u98a4\u8aa5\u7006::\u8df4\u3776\ud171\u7006\u51b2\uf995, this:\u9937\u7d52\u3e75\u98a4\u8aa5\u7006))), ldc:int(16)))
            
            if (logicalor:boolean(logicalor:boolean(logicalor:boolean(cmpge:boolean(getfield:double(\u3a62\u5d20\u4f52\uc229\u8308\ud7e8::\ubf56\u4c04\u4492\u36d3\u71f1\u12cb, invokevirtual:\u3a62\u5d20\u4f52\uc229\u8308\ud7e8(\u836c\u8cae\ub18d\u836c\u8753\u59ec::\u8308\ub171\u6b5f\u16f6\u4cd9\ua562, p0:\u836c\u8cae\ub18d\u836c\u8753\u59ec)), sub:double(invokevirtual:double(\u34df\u4492\u71ae\uc238\u7873\uafe7::\ub7dc\u59ec\u8753\ud158\ud523\u64ab, var_3_66:\u34df\u4492\u71ae\uc238\u7873\uafe7), var_4_75:double)), cmple:boolean(getfield:double(\u3a62\u5d20\u4f52\uc229\u8308\ud7e8::\ubf56\u4c04\u4492\u36d3\u71f1\u12cb, invokevirtual:\u3a62\u5d20\u4f52\uc229\u8308\ud7e8(\u836c\u8cae\ub18d\u836c\u8753\u59ec::\u8308\ub171\u6b5f\u16f6\u4cd9\ua562, p0:\u836c\u8cae\ub18d\u836c\u8753\u59ec)), add:double(invokevirtual:double(\u34df\u4492\u71ae\uc238\u7873\uafe7::\ub19c\u759a\u071d\u9937\ufe34\u7043, var_3_66:\u34df\u4492\u71ae\uc238\u7873\uafe7), var_4_75:double))), cmpge:boolean(getfield:double(\u3a62\u5d20\u4f52\uc229\u8308\ud7e8::\ub7dc\ubff1\ub19c\u6198\uc2e8\ufe34, invokevirtual:\u3a62\u5d20\u4f52\uc229\u8308\ud7e8(\u836c\u8cae\ub18d\u836c\u8753\u59ec::\u8308\ub171\u6b5f\u16f6\u4cd9\ua562, p0:\u836c\u8cae\ub18d\u836c\u8753\u59ec)), sub:double(invokevirtual:double(\u34df\u4492\u71ae\uc238\u7873\uafe7::\u4f4a\u6435\ud12e\ub6ab\u527a\u16f6, var_3_66:\u34df\u4492\u71ae\uc238\u7873\uafe7), var_4_75:double))), cmple:boolean(getfield:double(\u3a62\u5d20\u4f52\uc229\u8308\ud7e8::\ub7dc\ubff1\ub19c\u6198\uc2e8\ufe34, invokevirtual:\u3a62\u5d20\u4f52\uc229\u8308\ud7e8(\u836c\u8cae\ub18d\u836c\u8753\u59ec::\u8308\ub171\u6b5f\u16f6\u4cd9\ua562, p0:\u836c\u8cae\ub18d\u836c\u8753\u59ec)), add:double(invokevirtual:double(\u34df\u4492\u71ae\uc238\u7873\uafe7::\u4daf\ud51e\u98a4\ud12e\u9255\u9a18, var_3_66:\u34df\u4492\u71ae\uc238\u7873\uafe7), var_4_75:double)))) {
                if (invokestatic:boolean(\u8308\u51fa\u6c56\u5db4\ub18d\u34df::\u61a4\u3e75\u8aa5\ub102\ub7dc\u647c)) {
                    invokestatic:void(\uc238\u69d9\u92ff\ub83f\u5245\uc229::\u3bd6\u965f\u4ab3\u873d\u6bb9\u8bb0)
                    invokestatic:void(\uc238\u69d9\u92ff\ub83f\u5245\uc229::\u74b1\u3e75\u1187\u92ee\uc84e\uc87f, getstatic:\ud4fe\u9033\u6d99\u071d\ub8be\u6b0d(\uc238\u69d9\u92ff\ub83f\u5245\uc229::\u5bc4\u494c\ua3b4\uf995\u3d64\uff55))
                }
                
                var_6_EF = invokestatic:double(Math::pow, sub:double(ldc:double(1.0), div:double(invokevirtual:double(\u34df\u4492\u71ae\uc238\u7873\uafe7::\u6198\ubefe\ud171\uc7fe\u0a06\u6d69, var_3_66:\u34df\u4492\u71ae\uc238\u7873\uafe7, getfield:double(\u3a62\u5d20\u4f52\uc229\u8308\ud7e8::\ubf56\u4c04\u4492\u36d3\u71f1\u12cb, invokevirtual:\u3a62\u5d20\u4f52\uc229\u8308\ud7e8(\u836c\u8cae\ub18d\u836c\u8753\u59ec::\u8308\ub171\u6b5f\u16f6\u4cd9\ua562, p0:\u836c\u8cae\ub18d\u836c\u8753\u59ec)), getfield:double(\u3a62\u5d20\u4f52\uc229\u8308\ud7e8::\ub7dc\ubff1\ub19c\u6198\uc2e8\ufe34, invokevirtual:\u3a62\u5d20\u4f52\uc229\u8308\ud7e8(\u836c\u8cae\ub18d\u836c\u8753\u59ec::\u8308\ub171\u6b5f\u16f6\u4cd9\ua562, p0:\u836c\u8cae\ub18d\u836c\u8753\u59ec))), var_4_75:double)), ldc:double(4.0))
                var_8_F8 = getfield:double(\u3a62\u5d20\u4f52\uc229\u8308\ud7e8::\ubf56\u4c04\u4492\u36d3\u71f1\u12cb, invokevirtual:\u3a62\u5d20\u4f52\uc229\u8308\ud7e8(\u836c\u8cae\ub18d\u836c\u8753\u59ec::\u8308\ub171\u6b5f\u16f6\u4cd9\ua562, p0:\u836c\u8cae\ub18d\u836c\u8753\u59ec))
                var_10_101 = getfield:double(\u3a62\u5d20\u4f52\uc229\u8308\ud7e8::\u6bb9\uc29a\u99f7\u7e3f\u6b5f\u156b, invokevirtual:\u3a62\u5d20\u4f52\uc229\u8308\ud7e8(\u836c\u8cae\ub18d\u836c\u8753\u59ec::\u8308\ub171\u6b5f\u16f6\u4cd9\ua562, p0:\u836c\u8cae\ub18d\u836c\u8753\u59ec))
                var_12_10A = getfield:double(\u3a62\u5d20\u4f52\uc229\u8308\ud7e8::\ub7dc\ubff1\ub19c\u6198\uc2e8\ufe34, invokevirtual:\u3a62\u5d20\u4f52\uc229\u8308\ud7e8(\u836c\u8cae\ub18d\u836c\u8753\u59ec::\u8308\ub171\u6b5f\u16f6\u4cd9\ua562, p0:\u836c\u8cae\ub18d\u836c\u8753\u59ec))
                invokestatic:void(\u9af2\u6ec6\u983f\ua068\u8c8a::\uc9f6\u7049\u92ee\ube23\u3c25\u6d99)
                invokestatic:void(\u9af2\u6ec6\u983f\ua068\u8c8a::\u59ec\u4bc8\u9033\u494c\u8308\ud51e)
                invokestatic:void(\u9af2\u6ec6\u983f\ua068\u8c8a::\ube23\u624e\u2dcc\u3a62\uf9c5\u8389, getstatic:\ud12e\ub70c\u16f6\uc29a\u8bb0(\ud12e\ub70c\u16f6\uc29a\u8bb0::\ua6bd\ubcb0\ub113\u3bd6\u72f1\u9af2), getstatic:\u624e\uc4d2\u98a4\ud12e\u7873(\u624e\uc4d2\u98a4\ud12e\u7873::\uff55\u416d\u4c2b\u527a\ua3b4\u9937), getstatic:\ud12e\ub70c\u16f6\uc29a\u8bb0(\ud12e\ub70c\u16f6\uc29a\u8bb0::\u5f50\u8cae\u0c95\u6cfe\u92ee\u3e2a), getstatic:\u624e\uc4d2\u98a4\ud12e\u7873(\u624e\uc4d2\u98a4\ud12e\u7873::\uc246\ub6ab\u12b2\u7ce1\u71ae\u8258))
                invokevirtual:void(\u4f52\ub7dc\u7bad\ud217\u76bc\u6d99::\u6ec6\u9a18\u92ff\u2dcc\ud12e\u7ce1, getfield:\u4f52\ub7dc\u7bad\ud217\u76bc\u6d99(\u9937\u7d52\u3e75\u98a4\u8aa5\u7006::\u12b2\u7d52\u6435\uc2e8\u69d9\u5654, this:\u9937\u7d52\u3e75\u98a4\u8aa5\u7006), getstatic:\u4179\ubb2b\uc7fe\u51fa\uc910\u8753(\u9937\u7d52\u3e75\u98a4\u8aa5\u7006::\u74b1\uc238\u718f\u7330\u4cd9\ud36e))
                invokestatic:void(\u9af2\u6ec6\u983f\ua068\u8c8a::\u6435\uff55\u8640\ub6ab\u527a\u4179, invokestatic:boolean(\u67e9\u4daf\u760c\ud217\ua6bd\ubff1::\u92ff\u183a\u93a2\uc3e3\u873d\u67e9))
                invokestatic:void(\u9af2\u6ec6\u983f\ua068\u8c8a::\u6c52\u416d\u385b\ud7e8\ufcaf\u9937)
                var_14_13B = invokevirtual:int(\u8413\u5654\u7049\u4daf\u5140\ucef1::\u76bc\u873d\uc238\u0a06\uceb8\u92ee, invokevirtual:\u8413\u5654\u7049\u4daf\u5140\ucef1(\u34df\u4492\u71ae\uc238\u7873\uafe7::\u873d\u3d4b\ub102\u516c\uc31c\ua6bd, var_3_66:\u34df\u4492\u71ae\uc238\u7873\uafe7))
                invokestatic:void(\u9af2\u6ec6\u983f\ua068\u8c8a::\u8d90\u92ff\uc84e\u3dd3\uf9c5\u8308, div:float(i2f:float(and:int(shr:int(var_14_13B:int, ldc:int(16)), ldc:int(255))), ldc:float(255.0f)), div:float(i2f:float(and:int(shr:int(var_14_13B:int, ldc:int(8)), ldc:int(255))), ldc:float(255.0f)), div:float(i2f:float(and:int(var_14_13B:int, ldc:int(255))), ldc:float(255.0f)), d2f:float(var_6_EF:double))
                invokestatic:void(\u9af2\u6ec6\u983f\ua068\u8c8a::\u8d90\u5f50\u6c56\u52d3\ub83f\u1187, ldc:float(-3.0f), ldc:float(-3.0f))
                invokestatic:void(\u9af2\u6ec6\u983f\ua068\u8c8a::\u600f\u416d\uae5d\ud158\u8d90\u7049)
                invokestatic:void(\u9af2\u6ec6\u983f\ua068\u8c8a::\u97e6\u946b\uc7fe\u0b8e\u5fe1\ub113)
                invokestatic:void(\u9af2\u6ec6\u983f\ua068\u8c8a::\u8413\u9033\u3bc9\uceb8\u1833\u97b7)
                invokestatic:void(\u9af2\u6ec6\u983f\ua068\u8c8a::\u836c\uc29a\uceb8\u3e75\ub32d\u4ab3)
                var_18_197 = div:float(l2f:float(rem:long(invokestatic:long(\ud217\u3504\u760c\uc29a\u97e6\ube23::\uc3e3\u99f7\u4c2b\u7af6\u8d90\u7d52), ldc:long(3000L))), ldc:float(3000.0f))
                invokevirtual:void(\u760c\u7ce1\u9a18\ub32d\u6d99\ub6ab::\u12cb\u9937\uc246\u5fe1\ubefe\u494c, var_2_5E:\u760c\u7ce1\u9a18\ub32d\u6d99\ub6ab, ldc:int(7), getstatic:\u74b1\u6d69\ud4fe\u4179\u8c8a\u965f(\u6d69\u4c04\ub113\u92ff\u3e75\u12b2::\u6d69\u527a\ubcb0\u5db4\u120d\u5d20))
                var_22_1BD = invokestatic:double(Math::max, i2d:double(invokestatic:int(\u927d\uc7fe\u92ff\u98a4\uc84e\uf9c5::\ub19c\u0a06\ub32d\u3d64\u67d0\u839e, sub:double(var_12_10A:double, var_4_75:double))), invokevirtual:double(\u34df\u4492\u71ae\uc238\u7873\uafe7::\u4daf\ud51e\u98a4\ud12e\u9255\u9a18, var_3_66:\u34df\u4492\u71ae\uc238\u7873\uafe7))
                var_24_1CF = invokestatic:double(Math::min, i2d:double(invokestatic:int(\u927d\uc7fe\u92ff\u98a4\uc84e\uf9c5::\u3e75\u4bc8\u416d\u92ff\u7c6b\ub6ab, add:double(var_12_10A:double, var_4_75:double))), invokevirtual:double(\u34df\u4492\u71ae\uc238\u7873\uafe7::\u4f4a\u6435\ud12e\ub6ab\u527a\u16f6, var_3_66:\u34df\u4492\u71ae\uc238\u7873\uafe7))
                
                if (cmpgt:boolean(var_8_F8:double, sub:double(invokevirtual:double(\u34df\u4492\u71ae\uc238\u7873\uafe7::\ub7dc\u59ec\u8753\ud158\ud523\u64ab, var_3_66:\u34df\u4492\u71ae\uc238\u7873\uafe7), var_4_75:double))) {
                    var_26_1DF = ldc:float(0.0f)
                    var_27_1E3 = var_22_1BD:double
                    
                    while (cmplt:boolean(var_27_1E3:double, var_24_1CF:double)) {
                        var_29_1F6 = invokestatic:double(Math::min, ldc:double(1.0), sub:double(var_24_1CF:double, var_27_1E3:double))
                        var_31_1FF = mul:float(d2f:float(var_29_1F6:double), ldc:float(0.5f))
                        invokespecial:void(\u9937\u7d52\u3e75\u98a4\u8aa5\u7006::\u7330\ub7dc\u9937\ubefe\u5245\u873d, this:\u9937\u7d52\u3e75\u98a4\u8aa5\u7006, var_2_5E:\u760c\u7ce1\u9a18\ub32d\u6d99\ub6ab, var_8_F8:double, var_10_101:double, var_12_10A:double, invokevirtual:double(\u34df\u4492\u71ae\uc238\u7873\uafe7::\ub7dc\u59ec\u8753\ud158\ud523\u64ab, var_3_66:\u34df\u4492\u71ae\uc238\u7873\uafe7), ldc:int(256), var_27_1E3:double, add:float(var_18_197:float, var_26_1DF:float), add:float(var_18_197:float, ldc:float(0.0f)))
                        invokespecial:void(\u9937\u7d52\u3e75\u98a4\u8aa5\u7006::\u7330\ub7dc\u9937\ubefe\u5245\u873d, this:\u9937\u7d52\u3e75\u98a4\u8aa5\u7006, var_2_5E:\u760c\u7ce1\u9a18\ub32d\u6d99\ub6ab, var_8_F8:double, var_10_101:double, var_12_10A:double, invokevirtual:double(\u34df\u4492\u71ae\uc238\u7873\uafe7::\ub7dc\u59ec\u8753\ud158\ud523\u64ab, var_3_66:\u34df\u4492\u71ae\uc238\u7873\uafe7), ldc:int(256), add:double(var_27_1E3:double, var_29_1F6:double), add:float(add:float(var_18_197:float, var_31_1FF:float), var_26_1DF:float), add:float(var_18_197:float, ldc:float(0.0f)))
                        invokespecial:void(\u9937\u7d52\u3e75\u98a4\u8aa5\u7006::\u7330\ub7dc\u9937\ubefe\u5245\u873d, this:\u9937\u7d52\u3e75\u98a4\u8aa5\u7006, var_2_5E:\u760c\u7ce1\u9a18\ub32d\u6d99\ub6ab, var_8_F8:double, var_10_101:double, var_12_10A:double, invokevirtual:double(\u34df\u4492\u71ae\uc238\u7873\uafe7::\ub7dc\u59ec\u8753\ud158\ud523\u64ab, var_3_66:\u34df\u4492\u71ae\uc238\u7873\uafe7), ldc:int(0), add:double(var_27_1E3:double, var_29_1F6:double), add:float(add:float(var_18_197:float, var_31_1FF:float), var_26_1DF:float), add:float(var_18_197:float, ldc:float(128.0f)))
                        invokespecial:void(\u9937\u7d52\u3e75\u98a4\u8aa5\u7006::\u7330\ub7dc\u9937\ubefe\u5245\u873d, this:\u9937\u7d52\u3e75\u98a4\u8aa5\u7006, var_2_5E:\u760c\u7ce1\u9a18\ub32d\u6d99\ub6ab, var_8_F8:double, var_10_101:double, var_12_10A:double, invokevirtual:double(\u34df\u4492\u71ae\uc238\u7873\uafe7::\ub7dc\u59ec\u8753\ud158\ud523\u64ab, var_3_66:\u34df\u4492\u71ae\uc238\u7873\uafe7), ldc:int(0), var_27_1E3:double, add:float(var_18_197:float, var_26_1DF:float), add:float(var_18_197:float, ldc:float(128.0f)))
                        var_27_1E3 = add:double(var_27_1E3:double, ldc:double(1.0))
                        var_26_1DF = add:float(var_26_1DF:float, ldc:float(0.5f))
                    }
                }
                
                if (cmplt:boolean(var_8_F8:double, add:double(invokevirtual:double(\u34df\u4492\u71ae\uc238\u7873\uafe7::\ub19c\u759a\u071d\u9937\ufe34\u7043, var_3_66:\u34df\u4492\u71ae\uc238\u7873\uafe7), var_4_75:double))) {
                    var_26_2A0 = ldc:float(0.0f)
                    var_27_2A4 = var_22_1BD:double
                    
                    while (cmplt:boolean(var_27_2A4:double, var_24_1CF:double)) {
                        var_29_2B7 = invokestatic:double(Math::min, ldc:double(1.0), sub:double(var_24_1CF:double, var_27_2A4:double))
                        var_31_2C0 = mul:float(d2f:float(var_29_2B7:double), ldc:float(0.5f))
                        invokespecial:void(\u9937\u7d52\u3e75\u98a4\u8aa5\u7006::\u7330\ub7dc\u9937\ubefe\u5245\u873d, this:\u9937\u7d52\u3e75\u98a4\u8aa5\u7006, var_2_5E:\u760c\u7ce1\u9a18\ub32d\u6d99\ub6ab, var_8_F8:double, var_10_101:double, var_12_10A:double, invokevirtual:double(\u34df\u4492\u71ae\uc238\u7873\uafe7::\ub19c\u759a\u071d\u9937\ufe34\u7043, var_3_66:\u34df\u4492\u71ae\uc238\u7873\uafe7), ldc:int(256), var_27_2A4:double, add:float(var_18_197:float, var_26_2A0:float), add:float(var_18_197:float, ldc:float(0.0f)))
                        invokespecial:void(\u9937\u7d52\u3e75\u98a4\u8aa5\u7006::\u7330\ub7dc\u9937\ubefe\u5245\u873d, this:\u9937\u7d52\u3e75\u98a4\u8aa5\u7006, var_2_5E:\u760c\u7ce1\u9a18\ub32d\u6d99\ub6ab, var_8_F8:double, var_10_101:double, var_12_10A:double, invokevirtual:double(\u34df\u4492\u71ae\uc238\u7873\uafe7::\ub19c\u759a\u071d\u9937\ufe34\u7043, var_3_66:\u34df\u4492\u71ae\uc238\u7873\uafe7), ldc:int(256), add:double(var_27_2A4:double, var_29_2B7:double), add:float(add:float(var_18_197:float, var_31_2C0:float), var_26_2A0:float), add:float(var_18_197:float, ldc:float(0.0f)))
                        invokespecial:void(\u9937\u7d52\u3e75\u98a4\u8aa5\u7006::\u7330\ub7dc\u9937\ubefe\u5245\u873d, this:\u9937\u7d52\u3e75\u98a4\u8aa5\u7006, var_2_5E:\u760c\u7ce1\u9a18\ub32d\u6d99\ub6ab, var_8_F8:double, var_10_101:double, var_12_10A:double, invokevirtual:double(\u34df\u4492\u71ae\uc238\u7873\uafe7::\ub19c\u759a\u071d\u9937\ufe34\u7043, var_3_66:\u34df\u4492\u71ae\uc238\u7873\uafe7), ldc:int(0), add:double(var_27_2A4:double, var_29_2B7:double), add:float(add:float(var_18_197:float, var_31_2C0:float), var_26_2A0:float), add:float(var_18_197:float, ldc:float(128.0f)))
                        invokespecial:void(\u9937\u7d52\u3e75\u98a4\u8aa5\u7006::\u7330\ub7dc\u9937\ubefe\u5245\u873d, this:\u9937\u7d52\u3e75\u98a4\u8aa5\u7006, var_2_5E:\u760c\u7ce1\u9a18\ub32d\u6d99\ub6ab, var_8_F8:double, var_10_101:double, var_12_10A:double, invokevirtual:double(\u34df\u4492\u71ae\uc238\u7873\uafe7::\ub19c\u759a\u071d\u9937\ufe34\u7043, var_3_66:\u34df\u4492\u71ae\uc238\u7873\uafe7), ldc:int(0), var_27_2A4:double, add:float(var_18_197:float, var_26_2A0:float), add:float(var_18_197:float, ldc:float(128.0f)))
                        var_27_2A4 = add:double(var_27_2A4:double, ldc:double(1.0))
                        var_26_2A0 = add:float(var_26_2A0:float, ldc:float(0.5f))
                    }
                }
                
                var_22_363 = invokestatic:double(Math::max, i2d:double(invokestatic:int(\u927d\uc7fe\u92ff\u98a4\uc84e\uf9c5::\ub19c\u0a06\ub32d\u3d64\u67d0\u839e, sub:double(var_8_F8:double, var_4_75:double))), invokevirtual:double(\u34df\u4492\u71ae\uc238\u7873\uafe7::\ub19c\u759a\u071d\u9937\ufe34\u7043, var_3_66:\u34df\u4492\u71ae\uc238\u7873\uafe7))
                var_24_375 = invokestatic:double(Math::min, i2d:double(invokestatic:int(\u927d\uc7fe\u92ff\u98a4\uc84e\uf9c5::\u3e75\u4bc8\u416d\u92ff\u7c6b\ub6ab, add:double(var_8_F8:double, var_4_75:double))), invokevirtual:double(\u34df\u4492\u71ae\uc238\u7873\uafe7::\ub7dc\u59ec\u8753\ud158\ud523\u64ab, var_3_66:\u34df\u4492\u71ae\uc238\u7873\uafe7))
                
                if (cmpgt:boolean(var_12_10A:double, sub:double(invokevirtual:double(\u34df\u4492\u71ae\uc238\u7873\uafe7::\u4f4a\u6435\ud12e\ub6ab\u527a\u16f6, var_3_66:\u34df\u4492\u71ae\uc238\u7873\uafe7), var_4_75:double))) {
                    var_26_385 = ldc:float(0.0f)
                    var_27_389 = var_22_363:double
                    
                    while (cmplt:boolean(var_27_389:double, var_24_375:double)) {
                        var_29_39C = invokestatic:double(Math::min, ldc:double(1.0), sub:double(var_24_375:double, var_27_389:double))
                        var_31_3A5 = mul:float(d2f:float(var_29_39C:double), ldc:float(0.5f))
                        invokespecial:void(\u9937\u7d52\u3e75\u98a4\u8aa5\u7006::\u7330\ub7dc\u9937\ubefe\u5245\u873d, this:\u9937\u7d52\u3e75\u98a4\u8aa5\u7006, var_2_5E:\u760c\u7ce1\u9a18\ub32d\u6d99\ub6ab, var_8_F8:double, var_10_101:double, var_12_10A:double, var_27_389:double, ldc:int(256), invokevirtual:double(\u34df\u4492\u71ae\uc238\u7873\uafe7::\u4f4a\u6435\ud12e\ub6ab\u527a\u16f6, var_3_66:\u34df\u4492\u71ae\uc238\u7873\uafe7), add:float(var_18_197:float, var_26_385:float), add:float(var_18_197:float, ldc:float(0.0f)))
                        invokespecial:void(\u9937\u7d52\u3e75\u98a4\u8aa5\u7006::\u7330\ub7dc\u9937\ubefe\u5245\u873d, this:\u9937\u7d52\u3e75\u98a4\u8aa5\u7006, var_2_5E:\u760c\u7ce1\u9a18\ub32d\u6d99\ub6ab, var_8_F8:double, var_10_101:double, var_12_10A:double, add:double(var_27_389:double, var_29_39C:double), ldc:int(256), invokevirtual:double(\u34df\u4492\u71ae\uc238\u7873\uafe7::\u4f4a\u6435\ud12e\ub6ab\u527a\u16f6, var_3_66:\u34df\u4492\u71ae\uc238\u7873\uafe7), add:float(add:float(var_18_197:float, var_31_3A5:float), var_26_385:float), add:float(var_18_197:float, ldc:float(0.0f)))
                        invokespecial:void(\u9937\u7d52\u3e75\u98a4\u8aa5\u7006::\u7330\ub7dc\u9937\ubefe\u5245\u873d, this:\u9937\u7d52\u3e75\u98a4\u8aa5\u7006, var_2_5E:\u760c\u7ce1\u9a18\ub32d\u6d99\ub6ab, var_8_F8:double, var_10_101:double, var_12_10A:double, add:double(var_27_389:double, var_29_39C:double), ldc:int(0), invokevirtual:double(\u34df\u4492\u71ae\uc238\u7873\uafe7::\u4f4a\u6435\ud12e\ub6ab\u527a\u16f6, var_3_66:\u34df\u4492\u71ae\uc238\u7873\uafe7), add:float(add:float(var_18_197:float, var_31_3A5:float), var_26_385:float), add:float(var_18_197:float, ldc:float(128.0f)))
                        invokespecial:void(\u9937\u7d52\u3e75\u98a4\u8aa5\u7006::\u7330\ub7dc\u9937\ubefe\u5245\u873d, this:\u9937\u7d52\u3e75\u98a4\u8aa5\u7006, var_2_5E:\u760c\u7ce1\u9a18\ub32d\u6d99\ub6ab, var_8_F8:double, var_10_101:double, var_12_10A:double, var_27_389:double, ldc:int(0), invokevirtual:double(\u34df\u4492\u71ae\uc238\u7873\uafe7::\u4f4a\u6435\ud12e\ub6ab\u527a\u16f6, var_3_66:\u34df\u4492\u71ae\uc238\u7873\uafe7), add:float(var_18_197:float, var_26_385:float), add:float(var_18_197:float, ldc:float(128.0f)))
                        var_27_389 = add:double(var_27_389:double, ldc:double(1.0))
                        var_26_385 = add:float(var_26_385:float, ldc:float(0.5f))
                    }
                }
                
                if (cmplt:boolean(var_12_10A:double, add:double(invokevirtual:double(\u34df\u4492\u71ae\uc238\u7873\uafe7::\u4daf\ud51e\u98a4\ud12e\u9255\u9a18, var_3_66:\u34df\u4492\u71ae\uc238\u7873\uafe7), var_4_75:double))) {
                    var_26_446 = ldc:float(0.0f)
                    var_27_44A = var_22_363:double
                    
                    while (cmplt:boolean(var_27_44A:double, var_24_375:double)) {
                        var_29_45D = invokestatic:double(Math::min, ldc:double(1.0), sub:double(var_24_375:double, var_27_44A:double))
                        var_31_466 = mul:float(d2f:float(var_29_45D:double), ldc:float(0.5f))
                        invokespecial:void(\u9937\u7d52\u3e75\u98a4\u8aa5\u7006::\u7330\ub7dc\u9937\ubefe\u5245\u873d, this:\u9937\u7d52\u3e75\u98a4\u8aa5\u7006, var_2_5E:\u760c\u7ce1\u9a18\ub32d\u6d99\ub6ab, var_8_F8:double, var_10_101:double, var_12_10A:double, var_27_44A:double, ldc:int(256), invokevirtual:double(\u34df\u4492\u71ae\uc238\u7873\uafe7::\u4daf\ud51e\u98a4\ud12e\u9255\u9a18, var_3_66:\u34df\u4492\u71ae\uc238\u7873\uafe7), add:float(var_18_197:float, var_26_446:float), add:float(var_18_197:float, ldc:float(0.0f)))
                        invokespecial:void(\u9937\u7d52\u3e75\u98a4\u8aa5\u7006::\u7330\ub7dc\u9937\ubefe\u5245\u873d, this:\u9937\u7d52\u3e75\u98a4\u8aa5\u7006, var_2_5E:\u760c\u7ce1\u9a18\ub32d\u6d99\ub6ab, var_8_F8:double, var_10_101:double, var_12_10A:double, add:double(var_27_44A:double, var_29_45D:double), ldc:int(256), invokevirtual:double(\u34df\u4492\u71ae\uc238\u7873\uafe7::\u4daf\ud51e\u98a4\ud12e\u9255\u9a18, var_3_66:\u34df\u4492\u71ae\uc238\u7873\uafe7), add:float(add:float(var_18_197:float, var_31_466:float), var_26_446:float), add:float(var_18_197:float, ldc:float(0.0f)))
                        invokespecial:void(\u9937\u7d52\u3e75\u98a4\u8aa5\u7006::\u7330\ub7dc\u9937\ubefe\u5245\u873d, this:\u9937\u7d52\u3e75\u98a4\u8aa5\u7006, var_2_5E:\u760c\u7ce1\u9a18\ub32d\u6d99\ub6ab, var_8_F8:double, var_10_101:double, var_12_10A:double, add:double(var_27_44A:double, var_29_45D:double), ldc:int(0), invokevirtual:double(\u34df\u4492\u71ae\uc238\u7873\uafe7::\u4daf\ud51e\u98a4\ud12e\u9255\u9a18, var_3_66:\u34df\u4492\u71ae\uc238\u7873\uafe7), add:float(add:float(var_18_197:float, var_31_466:float), var_26_446:float), add:float(var_18_197:float, ldc:float(128.0f)))
                        invokespecial:void(\u9937\u7d52\u3e75\u98a4\u8aa5\u7006::\u7330\ub7dc\u9937\ubefe\u5245\u873d, this:\u9937\u7d52\u3e75\u98a4\u8aa5\u7006, var_2_5E:\u760c\u7ce1\u9a18\ub32d\u6d99\ub6ab, var_8_F8:double, var_10_101:double, var_12_10A:double, var_27_44A:double, ldc:int(0), invokevirtual:double(\u34df\u4492\u71ae\uc238\u7873\uafe7::\u4daf\ud51e\u98a4\ud12e\u9255\u9a18, var_3_66:\u34df\u4492\u71ae\uc238\u7873\uafe7), add:float(var_18_197:float, var_26_446:float), add:float(var_18_197:float, ldc:float(128.0f)))
                        var_27_44A = add:double(var_27_44A:double, ldc:double(1.0))
                        var_26_446 = add:float(var_26_446:float, ldc:float(0.5f))
                    }
                }
                
                invokevirtual:void(\u760c\u7ce1\u9a18\ub32d\u6d99\ub6ab::\ua068\uc31c\u6bb9\u34df\uc3e3\u6d99, var_2_5E:\u760c\u7ce1\u9a18\ub32d\u6d99\ub6ab)
                invokestatic:void(\u446c\u7af6\u5bc4\ub83f\u8413\u600f::\u7c6b\ua562\u5db4\u7006\u1833\u516c, var_2_5E:\u760c\u7ce1\u9a18\ub32d\u6d99\ub6ab)
                invokestatic:void(\u9af2\u6ec6\u983f\ua068\u8c8a::\u5f50\uc29a\u3a62\uceb8\ud171\uc2e8)
                invokestatic:void(\u9af2\u6ec6\u983f\ua068\u8c8a::\u624e\u156b\u6c56\uc910\ub70c\u40a9)
                invokestatic:void(\u9af2\u6ec6\u983f\ua068\u8c8a::\u8d90\u5f50\u6c56\u52d3\ub83f\u1187, ldc:float(0.0f), ldc:float(0.0f))
                invokestatic:void(\u9af2\u6ec6\u983f\ua068\u8c8a::\ucfaf\u6ec6\u36d3\u836c\u600f\uc229)
                invokestatic:void(\u9af2\u6ec6\u983f\ua068\u8c8a::\u8413\u9033\u3bc9\uceb8\u1833\u97b7)
                invokestatic:void(\u9af2\u6ec6\u983f\ua068\u8c8a::\ube23\u624e\u2dcc\u3a62\uf9c5\u8389, getstatic:\ud12e\ub70c\u16f6\uc29a\u8bb0(\ud12e\ub70c\u16f6\uc29a\u8bb0::\ua6bd\ubcb0\ub113\u3bd6\u72f1\u9af2), getstatic:\u624e\uc4d2\u98a4\ud12e\u7873(\u624e\uc4d2\u98a4\ud12e\u7873::\u3e2a\u0a06\u3d4b\u8640\ub19c\u67e9), getstatic:\ud12e\ub70c\u16f6\uc29a\u8bb0(\ud12e\ub70c\u16f6\uc29a\u8bb0::\u5f50\u8cae\u0c95\u6cfe\u92ee\u3e2a), getstatic:\u624e\uc4d2\u98a4\ud12e\u7873(\u624e\uc4d2\u98a4\ud12e\u7873::\uc246\ub6ab\u12b2\u7ce1\u71ae\u8258))
                invokestatic:void(\u9af2\u6ec6\u983f\ua068\u8c8a::\u6b5f\ua3b4\ua61f\ub70c\u5140\u6bb9)
                invokestatic:void(\u9af2\u6ec6\u983f\ua068\u8c8a::\uae87\ua3b4\u88c5\u8413\u7d52\u647c)
                invokestatic:void(\u9af2\u6ec6\u983f\ua068\u8c8a::\u6435\uff55\u8640\ub6ab\u527a\u4179, ldc:boolean(1))
                
                if (invokestatic:boolean(\u8308\u51fa\u6c56\u5db4\ub18d\u34df::\u61a4\u3e75\u8aa5\ub102\ub7dc\u647c)) {
                    invokestatic:void(\uc238\u69d9\u92ff\ub83f\u5245\uc229::\u0c95\uc84e\ub70c\u3e75\u6bb9\u8cae)
                }
            }
            
            return:void()
        }
        
        goto(Label_0006)
    }
    
    private void \u7330\ub7dc\u9937\ubefe\u5245\u873d(\u5d20\u7043\u88c5\u5db4\uf94d.\u760c\u7ce1\u9a18\ub32d\u6d99\ub6ab p0, double p1, double p2, double p3, double p4, int p5, double p6, float p7, float p8) {
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
            invokeinterface:void(\u6b0d\uf9c5\ucfaf\ud36e\ub102::\ua61f\u0a06\u3bc9\ufe34\uc9f6\u8258, invokeinterface:\u6b0d\uf9c5\ucfaf\ud36e\ub102(\u6b0d\uf9c5\ucfaf\ud36e\ub102::\u946b\uf995\ufe34\u1833\ua61f\uc246, invokevirtual:\u6b0d\uf9c5\ucfaf\ud36e\ub102(\u6b0d\uf9c5\ucfaf\ud36e\ub102::\u8d90\u9255\u3bd6\u5d20\ub83f\u1187, p0:\u760c\u7ce1\u9a18\ub32d\u6d99\ub6ab[expected:\u6b0d\uf9c5\ucfaf\ud36e\ub102], sub:double(p4:double, p1:double), sub:double(i2d:double(p5:int), p2:double), sub:double(p6:double, p3:double)), p7:float, p8:float))
            return:void()
        }
        
        goto(Label_0006)
    }
    
    private void \uc87f\u71ae\ud12e\u7ce1\ub19c\u760c(\u51fa\u12cb\u7330\u74b1\u6c52.\u76bc\u4975\ua6bd\u4daf\u8d98.\uafe7\uc7fe\u4c04\u6b5f\u5bc4 p0, \u59ec\u8413\u97e6\uc229\u3776.\u6b0d\uf9c5\ucfaf\ud36e\ub102 p1, \u6ec6\ubb2b\uf94d\u6d99\u4f52.\u4daf\u3504\u4975\u59ec\u183a.\u7d52\u718f\u3776\u6fb0\ub83f p2, double p3, double p4, double p5, \u71f1\uc910\u3bc9\u516c\u93a2.\u6b0d\ud171\uc7fe\u52d3\uafe7\u6c56 p6, \u5245\u8aa5\u61a4\u7049\u4cd9.\u8413\u7e3f\uc910\uf94d\u5654\u6b0d p7) {
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
            invokestatic:void(\u9937\u7d52\u3e75\u98a4\u8aa5\u7006::\u6435\u4c2b\u983f\u960f\ucfaf\u7873, p0:\uafe7\uc7fe\u4c04\u6b5f\u5bc4, p1:\u6b0d\uf9c5\ucfaf\ud36e\ub102, invokevirtual:\u6c52\ubded\u4975\u71ae\u47c2\u7d52(\u7043\u8c8a\u8c8a\u4f4a\ufcaf\u839e::\ubb2b\u839e\u76bc\u5db4\ubf56\ud171, p7:\u8413\u7e3f\uc910\uf94d\u5654\u6b0d[expected:\u7043\u8c8a\u8c8a\u4f4a\ufcaf\u839e], getfield:\u16f6\u61a4\u5db4\u4c04\u64ab\u9255[expected:\u718f\u6435\uc31c\u4ab3\u98a4](\u9937\u7d52\u3e75\u98a4\u8aa5\u7006::\ud51e\u9033\u8df4\u7043\u5f50\u8aa5, this:\u9937\u7d52\u3e75\u98a4\u8aa5\u7006), p6:\u6b0d\ud171\uc7fe\u52d3\uafe7\u6c56, invokestatic:\ucfaf\u9255\u839e\u8258\uc31c\u983f(\ucfaf\u9255\u839e\u8258\uc31c\u983f::\ua562\ua6bd\u718f\u5140\u5db4\u92ff, p2:\u7d52\u718f\u3776\u6fb0\ub83f)), sub:double(i2d:double(invokevirtual:int(\u3a62\uc9f6\u3776\u4f52\ua068\u34df::\u8aa5\u97b7\u4daf\u72f1\u600f\u8cae, p6:\u6b0d\ud171\uc7fe\u52d3\uafe7\u6c56[expected:\u3a62\uc9f6\u3776\u4f52\ua068\u34df])), p3:double), sub:double(i2d:double(invokevirtual:int(\u3a62\uc9f6\u3776\u4f52\ua068\u34df::\u9af2\u8350\u8350\u93a2\u494c\u624e, p6:\u6b0d\ud171\uc7fe\u52d3\uafe7\u6c56[expected:\u3a62\uc9f6\u3776\u4f52\ua068\u34df])), p4:double), sub:double(i2d:double(invokevirtual:int(\u3a62\uc9f6\u3776\u4f52\ua068\u34df::\u3e75\uc29a\u071d\u4d85\ubded\ub70c, p6:\u6b0d\ud171\uc7fe\u52d3\uafe7\u6c56[expected:\u3a62\uc9f6\u3776\u4f52\ua068\u34df])), p5:double), ldc:float(0.0f), ldc:float(0.0f), ldc:float(0.0f), ldc:float(0.4f))
            return:void()
        }
        
        goto(Label_0006)
    }
    
    public static void \u494c\u64ab\u52d3\u839e\u52d3\u6bb9(\u51fa\u12cb\u7330\u74b1\u6c52.\u76bc\u4975\ua6bd\u4daf\u8d98.\uafe7\uc7fe\u4c04\u6b5f\u5bc4 p0, \u59ec\u8413\u97e6\uc229\u3776.\u6b0d\uf9c5\ucfaf\ud36e\ub102 p1, \u7c6b\u7c6b\ubefe\u385b\u3c25.\ud7e8\u0800\uae87\u8d90\u183a.\u34df\u12b2\u16f6\u873d\u7af6.\u6c52\ubded\u4975\u71ae\u47c2\u7d52 p2, double p3, double p4, double p5, float p6, float p7, float p8, float p9) {
        var_13_5C : List<\u7c6b\u965f\ua6bd\u69d9\u56bd\u97b7>
        var_14_6D : int
        var_15_70 : int
        var_16_8A : \u7c6b\u965f\ua6bd\u69d9\u56bd\u97b7
        var_17_99 : float
        var_18_A1 : float
        
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
            var_13_5C = invokevirtual:List<\u7c6b\u965f\ua6bd\u69d9\u56bd\u97b7>(\u6c52\ubded\u4975\u71ae\u47c2\u7d52::\u9033\u4c04\u0b8e\u9255\u6c56\u7330, p2:\u6c52\ubded\u4975\u71ae\u47c2\u7d52)
            var_14_6D = invokestatic:int(\u927d\uc7fe\u92ff\u98a4\uc84e\uf9c5::\u3e75\u4bc8\u416d\u92ff\u7c6b\ub6ab, div:double(i2d:double(invokeinterface:int(List<E>::size, var_13_5C:List<\u7c6b\u965f\ua6bd\u69d9\u56bd\u97b7>)), ldc:double(3.0)))
            var_15_70 = ldc:int(0)
            
            while (cmplt:boolean(var_15_70:int, invokeinterface:int(List<E>::size, var_13_5C:List<\u7c6b\u965f\ua6bd\u69d9\u56bd\u97b7>))) {
                var_16_8A = checkcast:\u7c6b\u965f\ua6bd\u69d9\u56bd\u97b7(\u3504\ufe34\u600f\u6b0d\u69d9.\u7c6b\u965f\ua6bd\u69d9\u56bd\u97b7.class, invokeinterface:\u7c6b\u965f\ua6bd\u69d9\u56bd\u97b7(List<\u7c6b\u965f\ua6bd\u69d9\u56bd\u97b7>::get, var_13_5C:List<\u7c6b\u965f\ua6bd\u69d9\u56bd\u97b7>, var_15_70:int))
                var_17_99 = div:float(add:float(rem:float(i2f:float(var_15_70:int), i2f:float(var_14_6D:int)), ldc:float(1.0f)), i2f:float(var_14_6D:int))
                var_18_A1 = i2f:float(div:int(var_15_70:int, var_14_6D:int))
                invokestatic:void(\u9937\u7d52\u3e75\u98a4\u8aa5\u7006::\u6435\u4c2b\u983f\u960f\ucfaf\u7873, p0:\uafe7\uc7fe\u4c04\u6b5f\u5bc4, p1:\u6b0d\uf9c5\ucfaf\ud36e\ub102, invokestatic:\u6c52\ubded\u4975\u71ae\u47c2\u7d52(\u4c04\uc9f6\u62da\u0c95\u6b0d\ub83f::\ub8be\u7043\ud36e\ud12e\ubded\ud158, invokevirtual:\u7c6b\u965f\ua6bd\u69d9\u56bd\u97b7(\u7c6b\u965f\ua6bd\u69d9\u56bd\u97b7::\u0c95\u88c5\ube23\u3776\u6d99\uff55, var_16_8A:\u7c6b\u965f\ua6bd\u69d9\u56bd\u97b7, ldc:double(0.0), ldc:double(0.0), ldc:double(0.0))), p3:double, p4:double, p5:double, mul:float(var_17_99:float, i2f:float(cmpeq:boolean(var_18_A1:float, ldc:float(0.0f)))), mul:float(var_17_99:float, i2f:float(cmpeq:boolean(var_18_A1:float, ldc:float(1.0f)))), mul:float(var_17_99:float, i2f:float(cmpeq:boolean(var_18_A1:float, ldc:float(2.0f)))), ldc:float(1.0f))
                inc:int(var_15_70, ldc:int(1))
            }
            
            return:void()
        }
        
        goto(Label_0006)
    }
    
    private static void \u6435\u4c2b\u983f\u960f\ucfaf\u7873(\u51fa\u12cb\u7330\u74b1\u6c52.\u76bc\u4975\ua6bd\u4daf\u8d98.\uafe7\uc7fe\u4c04\u6b5f\u5bc4 p0, \u59ec\u8413\u97e6\uc229\u3776.\u6b0d\uf9c5\ucfaf\ud36e\ub102 p1, \u7c6b\u7c6b\ubefe\u385b\u3c25.\ud7e8\u0800\uae87\u8d90\u183a.\u34df\u12b2\u16f6\u873d\u7af6.\u6c52\ubded\u4975\u71ae\u47c2\u7d52 p2, double p3, double p4, double p5, float p6, float p7, float p8, float p9) {
        // java.lang.IllegalStateException: Unsupported node type: com.strobel.decompiler.ast.Lambda
        //     at com.strobel.decompiler.ast.Error.unsupportedNode(Error.java:32)
        //     at com.strobel.decompiler.ast.GotoRemoval.exit(GotoRemoval.java:612)
        //     at com.strobel.decompiler.ast.GotoRemoval.exit(GotoRemoval.java:586)
        //     at com.strobel.decompiler.ast.GotoRemoval.exit(GotoRemoval.java:590)
        //     at com.strobel.decompiler.ast.GotoRemoval.exit(GotoRemoval.java:586)
        //     at com.strobel.decompiler.ast.GotoRemoval.transformLeaveStatements(GotoRemoval.java:625)
        //     at com.strobel.decompiler.ast.GotoRemoval.removeGotosCore(GotoRemoval.java:57)
        //     at com.strobel.decompiler.ast.GotoRemoval.removeGotos(GotoRemoval.java:53)
        //     at com.strobel.decompiler.ast.AstOptimizer.optimize(AstOptimizer.java:276)
        //     at com.strobel.decompiler.languages.BytecodeAstLanguage.decompileMethod(BytecodeAstLanguage.java:139)
        //     at com.strobel.decompiler.languages.BytecodeAstLanguage.decompileType(BytecodeAstLanguage.java:90)
        //     at com.strobel.decompiler.DecompilerDriver.decompileType(DecompilerDriver.java:336)
        //     at com.strobel.decompiler.DecompilerDriver.decompileJar(DecompilerDriver.java:257)
        //     at com.strobel.decompiler.DecompilerDriver.main(DecompilerDriver.java:141)
    }
    
    public static void \u9937\u9255\u4daf\u760c\u4cd9\ub102(\u51fa\u12cb\u7330\u74b1\u6c52.\u76bc\u4975\ua6bd\u4daf\u8d98.\uafe7\uc7fe\u4c04\u6b5f\u5bc4 p0, \u59ec\u8413\u97e6\uc229\u3776.\u6b0d\uf9c5\ucfaf\ud36e\ub102 p1, \u3504\ufe34\u600f\u6b0d\u69d9.\u7c6b\u965f\ua6bd\u69d9\u56bd\u97b7 p2, float p3, float p4, float p5, float p6) {
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
            invokestatic:void(\u9937\u7d52\u3e75\u98a4\u8aa5\u7006::\u9937\u9255\u4daf\u760c\u4cd9\ub102, p0:\uafe7\uc7fe\u4c04\u6b5f\u5bc4, p1:\u6b0d\uf9c5\ucfaf\ud36e\ub102, getfield:double(\u7c6b\u965f\ua6bd\u69d9\u56bd\u97b7::\u7006\uf94d\u6c56\uf94d\u9033\u7bad, p2:\u7c6b\u965f\ua6bd\u69d9\u56bd\u97b7), getfield:double(\u7c6b\u965f\ua6bd\u69d9\u56bd\u97b7::\ube23\u1833\ufe34\u8c8a\ud217\ubb2b, p2:\u7c6b\u965f\ua6bd\u69d9\u56bd\u97b7), getfield:double(\u7c6b\u965f\ua6bd\u69d9\u56bd\u97b7::\u2dcc\u36d3\u6198\u5140\u97e6\u61a4, p2:\u7c6b\u965f\ua6bd\u69d9\u56bd\u97b7), getfield:double(\u7c6b\u965f\ua6bd\u69d9\u56bd\u97b7::\ub6ab\u3c25\uae5d\u9af2\ufe34\u3504, p2:\u7c6b\u965f\ua6bd\u69d9\u56bd\u97b7), getfield:double(\u7c6b\u965f\ua6bd\u69d9\u56bd\u97b7::\u52d3\u647c\ua3b4\u6435\u67e9\u3776, p2:\u7c6b\u965f\ua6bd\u69d9\u56bd\u97b7), getfield:double(\u7c6b\u965f\ua6bd\u69d9\u56bd\u97b7::\u8350\u3504\ub6ab\u3e75\u760c\u4bc8, p2:\u7c6b\u965f\ua6bd\u69d9\u56bd\u97b7), p3:float, p4:float, p5:float, p6:float, p3:float, p4:float, p5:float)
            return:void()
        }
        
        goto(Label_0006)
    }
    
    public static void \u9937\u9255\u4daf\u760c\u4cd9\ub102(\u51fa\u12cb\u7330\u74b1\u6c52.\u76bc\u4975\ua6bd\u4daf\u8d98.\uafe7\uc7fe\u4c04\u6b5f\u5bc4 p0, \u59ec\u8413\u97e6\uc229\u3776.\u6b0d\uf9c5\ucfaf\ud36e\ub102 p1, double p2, double p3, double p4, double p5, double p6, double p7, float p8, float p9, float p10, float p11) {
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
            invokestatic:void(\u9937\u7d52\u3e75\u98a4\u8aa5\u7006::\u9937\u9255\u4daf\u760c\u4cd9\ub102, p0:\uafe7\uc7fe\u4c04\u6b5f\u5bc4, p1:\u6b0d\uf9c5\ucfaf\ud36e\ub102, p2:double, p3:double, p4:double, p5:double, p6:double, p7:double, p8:float, p9:float, p10:float, p11:float, p8:float, p9:float, p10:float)
            return:void()
        }
        
        goto(Label_0006)
    }
    
    public static void \u9937\u9255\u4daf\u760c\u4cd9\ub102(\u51fa\u12cb\u7330\u74b1\u6c52.\u76bc\u4975\ua6bd\u4daf\u8d98.\uafe7\uc7fe\u4c04\u6b5f\u5bc4 p0, \u59ec\u8413\u97e6\uc229\u3776.\u6b0d\uf9c5\ucfaf\ud36e\ub102 p1, double p2, double p3, double p4, double p5, double p6, double p7, float p8, float p9, float p10, float p11, float p12, float p13, float p14) {
        var_21_5F : \uc87f\u5f50\u16f6\ub113\u52d3\u12b2
        var_22_63 : float
        var_23_68 : float
        var_24_6D : float
        var_25_72 : float
        var_26_77 : float
        var_27_7C : float
        
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
            var_21_5F = invokevirtual:\uc87f\u5f50\u16f6\ub113\u52d3\u12b2(\u3711\u6c52\ufcaf\u4bc8\ud158::\u6d99\uae87\u8aa5\u6c52\u4c2b\u88c5, invokevirtual:\u3711\u6c52\ufcaf\u4bc8\ud158(\uafe7\uc7fe\u4c04\u6b5f\u5bc4::\u9033\u12b2\u516c\u97e6\u6d99\ua3b4, p0:\uafe7\uc7fe\u4c04\u6b5f\u5bc4))
            var_22_63 = d2f:float(p2:double)
            var_23_68 = d2f:float(p3:double)
            var_24_6D = d2f:float(p4:double)
            var_25_72 = d2f:float(p5:double)
            var_26_77 = d2f:float(p6:double)
            var_27_7C = d2f:float(p7:double)
            invokeinterface:void(\u6b0d\uf9c5\ucfaf\ud36e\ub102::\ua61f\u0a06\u3bc9\ufe34\uc9f6\u8258, invokeinterface:\u6b0d\uf9c5\ucfaf\ud36e\ub102(\u6b0d\uf9c5\ucfaf\ud36e\ub102::\ub70c\u600f\u93a2\uc910\u9937\u946b, invokeinterface:\u6b0d\uf9c5\ucfaf\ud36e\ub102(\u6b0d\uf9c5\ucfaf\ud36e\ub102::\u8d90\u9255\u3bd6\u5d20\ub83f\u1187, p1:\u6b0d\uf9c5\ucfaf\ud36e\ub102, var_21_5F:\uc87f\u5f50\u16f6\ub113\u52d3\u12b2, var_22_63:float, var_23_68:float, var_24_6D:float), p8:float, p13:float, p14:float, p11:float))
            invokeinterface:void(\u6b0d\uf9c5\ucfaf\ud36e\ub102::\ua61f\u0a06\u3bc9\ufe34\uc9f6\u8258, invokeinterface:\u6b0d\uf9c5\ucfaf\ud36e\ub102(\u6b0d\uf9c5\ucfaf\ud36e\ub102::\ub70c\u600f\u93a2\uc910\u9937\u946b, invokeinterface:\u6b0d\uf9c5\ucfaf\ud36e\ub102(\u6b0d\uf9c5\ucfaf\ud36e\ub102::\u8d90\u9255\u3bd6\u5d20\ub83f\u1187, p1:\u6b0d\uf9c5\ucfaf\ud36e\ub102, var_21_5F:\uc87f\u5f50\u16f6\ub113\u52d3\u12b2, var_25_72:float, var_23_68:float, var_24_6D:float), p8:float, p13:float, p14:float, p11:float))
            invokeinterface:void(\u6b0d\uf9c5\ucfaf\ud36e\ub102::\ua61f\u0a06\u3bc9\ufe34\uc9f6\u8258, invokeinterface:\u6b0d\uf9c5\ucfaf\ud36e\ub102(\u6b0d\uf9c5\ucfaf\ud36e\ub102::\ub70c\u600f\u93a2\uc910\u9937\u946b, invokeinterface:\u6b0d\uf9c5\ucfaf\ud36e\ub102(\u6b0d\uf9c5\ucfaf\ud36e\ub102::\u8d90\u9255\u3bd6\u5d20\ub83f\u1187, p1:\u6b0d\uf9c5\ucfaf\ud36e\ub102, var_21_5F:\uc87f\u5f50\u16f6\ub113\u52d3\u12b2, var_22_63:float, var_23_68:float, var_24_6D:float), p12:float, p9:float, p14:float, p11:float))
            invokeinterface:void(\u6b0d\uf9c5\ucfaf\ud36e\ub102::\ua61f\u0a06\u3bc9\ufe34\uc9f6\u8258, invokeinterface:\u6b0d\uf9c5\ucfaf\ud36e\ub102(\u6b0d\uf9c5\ucfaf\ud36e\ub102::\ub70c\u600f\u93a2\uc910\u9937\u946b, invokeinterface:\u6b0d\uf9c5\ucfaf\ud36e\ub102(\u6b0d\uf9c5\ucfaf\ud36e\ub102::\u8d90\u9255\u3bd6\u5d20\ub83f\u1187, p1:\u6b0d\uf9c5\ucfaf\ud36e\ub102, var_21_5F:\uc87f\u5f50\u16f6\ub113\u52d3\u12b2, var_22_63:float, var_26_77:float, var_24_6D:float), p12:float, p9:float, p14:float, p11:float))
            invokeinterface:void(\u6b0d\uf9c5\ucfaf\ud36e\ub102::\ua61f\u0a06\u3bc9\ufe34\uc9f6\u8258, invokeinterface:\u6b0d\uf9c5\ucfaf\ud36e\ub102(\u6b0d\uf9c5\ucfaf\ud36e\ub102::\ub70c\u600f\u93a2\uc910\u9937\u946b, invokeinterface:\u6b0d\uf9c5\ucfaf\ud36e\ub102(\u6b0d\uf9c5\ucfaf\ud36e\ub102::\u8d90\u9255\u3bd6\u5d20\ub83f\u1187, p1:\u6b0d\uf9c5\ucfaf\ud36e\ub102, var_21_5F:\uc87f\u5f50\u16f6\ub113\u52d3\u12b2, var_22_63:float, var_23_68:float, var_24_6D:float), p12:float, p13:float, p10:float, p11:float))
            invokeinterface:void(\u6b0d\uf9c5\ucfaf\ud36e\ub102::\ua61f\u0a06\u3bc9\ufe34\uc9f6\u8258, invokeinterface:\u6b0d\uf9c5\ucfaf\ud36e\ub102(\u6b0d\uf9c5\ucfaf\ud36e\ub102::\ub70c\u600f\u93a2\uc910\u9937\u946b, invokeinterface:\u6b0d\uf9c5\ucfaf\ud36e\ub102(\u6b0d\uf9c5\ucfaf\ud36e\ub102::\u8d90\u9255\u3bd6\u5d20\ub83f\u1187, p1:\u6b0d\uf9c5\ucfaf\ud36e\ub102, var_21_5F:\uc87f\u5f50\u16f6\ub113\u52d3\u12b2, var_22_63:float, var_23_68:float, var_27_7C:float), p12:float, p13:float, p10:float, p11:float))
            invokeinterface:void(\u6b0d\uf9c5\ucfaf\ud36e\ub102::\ua61f\u0a06\u3bc9\ufe34\uc9f6\u8258, invokeinterface:\u6b0d\uf9c5\ucfaf\ud36e\ub102(\u6b0d\uf9c5\ucfaf\ud36e\ub102::\ub70c\u600f\u93a2\uc910\u9937\u946b, invokeinterface:\u6b0d\uf9c5\ucfaf\ud36e\ub102(\u6b0d\uf9c5\ucfaf\ud36e\ub102::\u8d90\u9255\u3bd6\u5d20\ub83f\u1187, p1:\u6b0d\uf9c5\ucfaf\ud36e\ub102, var_21_5F:\uc87f\u5f50\u16f6\ub113\u52d3\u12b2, var_25_72:float, var_23_68:float, var_24_6D:float), p8:float, p9:float, p10:float, p11:float))
            invokeinterface:void(\u6b0d\uf9c5\ucfaf\ud36e\ub102::\ua61f\u0a06\u3bc9\ufe34\uc9f6\u8258, invokeinterface:\u6b0d\uf9c5\ucfaf\ud36e\ub102(\u6b0d\uf9c5\ucfaf\ud36e\ub102::\ub70c\u600f\u93a2\uc910\u9937\u946b, invokeinterface:\u6b0d\uf9c5\ucfaf\ud36e\ub102(\u6b0d\uf9c5\ucfaf\ud36e\ub102::\u8d90\u9255\u3bd6\u5d20\ub83f\u1187, p1:\u6b0d\uf9c5\ucfaf\ud36e\ub102, var_21_5F:\uc87f\u5f50\u16f6\ub113\u52d3\u12b2, var_25_72:float, var_26_77:float, var_24_6D:float), p8:float, p9:float, p10:float, p11:float))
            invokeinterface:void(\u6b0d\uf9c5\ucfaf\ud36e\ub102::\ua61f\u0a06\u3bc9\ufe34\uc9f6\u8258, invokeinterface:\u6b0d\uf9c5\ucfaf\ud36e\ub102(\u6b0d\uf9c5\ucfaf\ud36e\ub102::\ub70c\u600f\u93a2\uc910\u9937\u946b, invokeinterface:\u6b0d\uf9c5\ucfaf\ud36e\ub102(\u6b0d\uf9c5\ucfaf\ud36e\ub102::\u8d90\u9255\u3bd6\u5d20\ub83f\u1187, p1:\u6b0d\uf9c5\ucfaf\ud36e\ub102, var_21_5F:\uc87f\u5f50\u16f6\ub113\u52d3\u12b2, var_25_72:float, var_26_77:float, var_24_6D:float), p8:float, p9:float, p10:float, p11:float))
            invokeinterface:void(\u6b0d\uf9c5\ucfaf\ud36e\ub102::\ua61f\u0a06\u3bc9\ufe34\uc9f6\u8258, invokeinterface:\u6b0d\uf9c5\ucfaf\ud36e\ub102(\u6b0d\uf9c5\ucfaf\ud36e\ub102::\ub70c\u600f\u93a2\uc910\u9937\u946b, invokeinterface:\u6b0d\uf9c5\ucfaf\ud36e\ub102(\u6b0d\uf9c5\ucfaf\ud36e\ub102::\u8d90\u9255\u3bd6\u5d20\ub83f\u1187, p1:\u6b0d\uf9c5\ucfaf\ud36e\ub102, var_21_5F:\uc87f\u5f50\u16f6\ub113\u52d3\u12b2, var_22_63:float, var_26_77:float, var_24_6D:float), p8:float, p9:float, p10:float, p11:float))
            invokeinterface:void(\u6b0d\uf9c5\ucfaf\ud36e\ub102::\ua61f\u0a06\u3bc9\ufe34\uc9f6\u8258, invokeinterface:\u6b0d\uf9c5\ucfaf\ud36e\ub102(\u6b0d\uf9c5\ucfaf\ud36e\ub102::\ub70c\u600f\u93a2\uc910\u9937\u946b, invokeinterface:\u6b0d\uf9c5\ucfaf\ud36e\ub102(\u6b0d\uf9c5\ucfaf\ud36e\ub102::\u8d90\u9255\u3bd6\u5d20\ub83f\u1187, p1:\u6b0d\uf9c5\ucfaf\ud36e\ub102, var_21_5F:\uc87f\u5f50\u16f6\ub113\u52d3\u12b2, var_22_63:float, var_26_77:float, var_24_6D:float), p8:float, p9:float, p10:float, p11:float))
            invokeinterface:void(\u6b0d\uf9c5\ucfaf\ud36e\ub102::\ua61f\u0a06\u3bc9\ufe34\uc9f6\u8258, invokeinterface:\u6b0d\uf9c5\ucfaf\ud36e\ub102(\u6b0d\uf9c5\ucfaf\ud36e\ub102::\ub70c\u600f\u93a2\uc910\u9937\u946b, invokeinterface:\u6b0d\uf9c5\ucfaf\ud36e\ub102(\u6b0d\uf9c5\ucfaf\ud36e\ub102::\u8d90\u9255\u3bd6\u5d20\ub83f\u1187, p1:\u6b0d\uf9c5\ucfaf\ud36e\ub102, var_21_5F:\uc87f\u5f50\u16f6\ub113\u52d3\u12b2, var_22_63:float, var_26_77:float, var_27_7C:float), p8:float, p9:float, p10:float, p11:float))
            invokeinterface:void(\u6b0d\uf9c5\ucfaf\ud36e\ub102::\ua61f\u0a06\u3bc9\ufe34\uc9f6\u8258, invokeinterface:\u6b0d\uf9c5\ucfaf\ud36e\ub102(\u6b0d\uf9c5\ucfaf\ud36e\ub102::\ub70c\u600f\u93a2\uc910\u9937\u946b, invokeinterface:\u6b0d\uf9c5\ucfaf\ud36e\ub102(\u6b0d\uf9c5\ucfaf\ud36e\ub102::\u8d90\u9255\u3bd6\u5d20\ub83f\u1187, p1:\u6b0d\uf9c5\ucfaf\ud36e\ub102, var_21_5F:\uc87f\u5f50\u16f6\ub113\u52d3\u12b2, var_22_63:float, var_26_77:float, var_27_7C:float), p8:float, p9:float, p10:float, p11:float))
            invokeinterface:void(\u6b0d\uf9c5\ucfaf\ud36e\ub102::\ua61f\u0a06\u3bc9\ufe34\uc9f6\u8258, invokeinterface:\u6b0d\uf9c5\ucfaf\ud36e\ub102(\u6b0d\uf9c5\ucfaf\ud36e\ub102::\ub70c\u600f\u93a2\uc910\u9937\u946b, invokeinterface:\u6b0d\uf9c5\ucfaf\ud36e\ub102(\u6b0d\uf9c5\ucfaf\ud36e\ub102::\u8d90\u9255\u3bd6\u5d20\ub83f\u1187, p1:\u6b0d\uf9c5\ucfaf\ud36e\ub102, var_21_5F:\uc87f\u5f50\u16f6\ub113\u52d3\u12b2, var_22_63:float, var_23_68:float, var_27_7C:float), p8:float, p9:float, p10:float, p11:float))
            invokeinterface:void(\u6b0d\uf9c5\ucfaf\ud36e\ub102::\ua61f\u0a06\u3bc9\ufe34\uc9f6\u8258, invokeinterface:\u6b0d\uf9c5\ucfaf\ud36e\ub102(\u6b0d\uf9c5\ucfaf\ud36e\ub102::\ub70c\u600f\u93a2\uc910\u9937\u946b, invokeinterface:\u6b0d\uf9c5\ucfaf\ud36e\ub102(\u6b0d\uf9c5\ucfaf\ud36e\ub102::\u8d90\u9255\u3bd6\u5d20\ub83f\u1187, p1:\u6b0d\uf9c5\ucfaf\ud36e\ub102, var_21_5F:\uc87f\u5f50\u16f6\ub113\u52d3\u12b2, var_22_63:float, var_23_68:float, var_27_7C:float), p8:float, p9:float, p10:float, p11:float))
            invokeinterface:void(\u6b0d\uf9c5\ucfaf\ud36e\ub102::\ua61f\u0a06\u3bc9\ufe34\uc9f6\u8258, invokeinterface:\u6b0d\uf9c5\ucfaf\ud36e\ub102(\u6b0d\uf9c5\ucfaf\ud36e\ub102::\ub70c\u600f\u93a2\uc910\u9937\u946b, invokeinterface:\u6b0d\uf9c5\ucfaf\ud36e\ub102(\u6b0d\uf9c5\ucfaf\ud36e\ub102::\u8d90\u9255\u3bd6\u5d20\ub83f\u1187, p1:\u6b0d\uf9c5\ucfaf\ud36e\ub102, var_21_5F:\uc87f\u5f50\u16f6\ub113\u52d3\u12b2, var_25_72:float, var_23_68:float, var_27_7C:float), p8:float, p9:float, p10:float, p11:float))
            invokeinterface:void(\u6b0d\uf9c5\ucfaf\ud36e\ub102::\ua61f\u0a06\u3bc9\ufe34\uc9f6\u8258, invokeinterface:\u6b0d\uf9c5\ucfaf\ud36e\ub102(\u6b0d\uf9c5\ucfaf\ud36e\ub102::\ub70c\u600f\u93a2\uc910\u9937\u946b, invokeinterface:\u6b0d\uf9c5\ucfaf\ud36e\ub102(\u6b0d\uf9c5\ucfaf\ud36e\ub102::\u8d90\u9255\u3bd6\u5d20\ub83f\u1187, p1:\u6b0d\uf9c5\ucfaf\ud36e\ub102, var_21_5F:\uc87f\u5f50\u16f6\ub113\u52d3\u12b2, var_25_72:float, var_23_68:float, var_27_7C:float), p8:float, p9:float, p10:float, p11:float))
            invokeinterface:void(\u6b0d\uf9c5\ucfaf\ud36e\ub102::\ua61f\u0a06\u3bc9\ufe34\uc9f6\u8258, invokeinterface:\u6b0d\uf9c5\ucfaf\ud36e\ub102(\u6b0d\uf9c5\ucfaf\ud36e\ub102::\ub70c\u600f\u93a2\uc910\u9937\u946b, invokeinterface:\u6b0d\uf9c5\ucfaf\ud36e\ub102(\u6b0d\uf9c5\ucfaf\ud36e\ub102::\u8d90\u9255\u3bd6\u5d20\ub83f\u1187, p1:\u6b0d\uf9c5\ucfaf\ud36e\ub102, var_21_5F:\uc87f\u5f50\u16f6\ub113\u52d3\u12b2, var_25_72:float, var_23_68:float, var_24_6D:float), p8:float, p9:float, p10:float, p11:float))
            invokeinterface:void(\u6b0d\uf9c5\ucfaf\ud36e\ub102::\ua61f\u0a06\u3bc9\ufe34\uc9f6\u8258, invokeinterface:\u6b0d\uf9c5\ucfaf\ud36e\ub102(\u6b0d\uf9c5\ucfaf\ud36e\ub102::\ub70c\u600f\u93a2\uc910\u9937\u946b, invokeinterface:\u6b0d\uf9c5\ucfaf\ud36e\ub102(\u6b0d\uf9c5\ucfaf\ud36e\ub102::\u8d90\u9255\u3bd6\u5d20\ub83f\u1187, p1:\u6b0d\uf9c5\ucfaf\ud36e\ub102, var_21_5F:\uc87f\u5f50\u16f6\ub113\u52d3\u12b2, var_22_63:float, var_26_77:float, var_27_7C:float), p8:float, p9:float, p10:float, p11:float))
            invokeinterface:void(\u6b0d\uf9c5\ucfaf\ud36e\ub102::\ua61f\u0a06\u3bc9\ufe34\uc9f6\u8258, invokeinterface:\u6b0d\uf9c5\ucfaf\ud36e\ub102(\u6b0d\uf9c5\ucfaf\ud36e\ub102::\ub70c\u600f\u93a2\uc910\u9937\u946b, invokeinterface:\u6b0d\uf9c5\ucfaf\ud36e\ub102(\u6b0d\uf9c5\ucfaf\ud36e\ub102::\u8d90\u9255\u3bd6\u5d20\ub83f\u1187, p1:\u6b0d\uf9c5\ucfaf\ud36e\ub102, var_21_5F:\uc87f\u5f50\u16f6\ub113\u52d3\u12b2, var_25_72:float, var_26_77:float, var_27_7C:float), p8:float, p9:float, p10:float, p11:float))
            invokeinterface:void(\u6b0d\uf9c5\ucfaf\ud36e\ub102::\ua61f\u0a06\u3bc9\ufe34\uc9f6\u8258, invokeinterface:\u6b0d\uf9c5\ucfaf\ud36e\ub102(\u6b0d\uf9c5\ucfaf\ud36e\ub102::\ub70c\u600f\u93a2\uc910\u9937\u946b, invokeinterface:\u6b0d\uf9c5\ucfaf\ud36e\ub102(\u6b0d\uf9c5\ucfaf\ud36e\ub102::\u8d90\u9255\u3bd6\u5d20\ub83f\u1187, p1:\u6b0d\uf9c5\ucfaf\ud36e\ub102, var_21_5F:\uc87f\u5f50\u16f6\ub113\u52d3\u12b2, var_25_72:float, var_23_68:float, var_27_7C:float), p8:float, p9:float, p10:float, p11:float))
            invokeinterface:void(\u6b0d\uf9c5\ucfaf\ud36e\ub102::\ua61f\u0a06\u3bc9\ufe34\uc9f6\u8258, invokeinterface:\u6b0d\uf9c5\ucfaf\ud36e\ub102(\u6b0d\uf9c5\ucfaf\ud36e\ub102::\ub70c\u600f\u93a2\uc910\u9937\u946b, invokeinterface:\u6b0d\uf9c5\ucfaf\ud36e\ub102(\u6b0d\uf9c5\ucfaf\ud36e\ub102::\u8d90\u9255\u3bd6\u5d20\ub83f\u1187, p1:\u6b0d\uf9c5\ucfaf\ud36e\ub102, var_21_5F:\uc87f\u5f50\u16f6\ub113\u52d3\u12b2, var_25_72:float, var_26_77:float, var_27_7C:float), p8:float, p9:float, p10:float, p11:float))
            invokeinterface:void(\u6b0d\uf9c5\ucfaf\ud36e\ub102::\ua61f\u0a06\u3bc9\ufe34\uc9f6\u8258, invokeinterface:\u6b0d\uf9c5\ucfaf\ud36e\ub102(\u6b0d\uf9c5\ucfaf\ud36e\ub102::\ub70c\u600f\u93a2\uc910\u9937\u946b, invokeinterface:\u6b0d\uf9c5\ucfaf\ud36e\ub102(\u6b0d\uf9c5\ucfaf\ud36e\ub102::\u8d90\u9255\u3bd6\u5d20\ub83f\u1187, p1:\u6b0d\uf9c5\ucfaf\ud36e\ub102, var_21_5F:\uc87f\u5f50\u16f6\ub113\u52d3\u12b2, var_25_72:float, var_26_77:float, var_24_6D:float), p8:float, p9:float, p10:float, p11:float))
            invokeinterface:void(\u6b0d\uf9c5\ucfaf\ud36e\ub102::\ua61f\u0a06\u3bc9\ufe34\uc9f6\u8258, invokeinterface:\u6b0d\uf9c5\ucfaf\ud36e\ub102(\u6b0d\uf9c5\ucfaf\ud36e\ub102::\ub70c\u600f\u93a2\uc910\u9937\u946b, invokeinterface:\u6b0d\uf9c5\ucfaf\ud36e\ub102(\u6b0d\uf9c5\ucfaf\ud36e\ub102::\u8d90\u9255\u3bd6\u5d20\ub83f\u1187, p1:\u6b0d\uf9c5\ucfaf\ud36e\ub102, var_21_5F:\uc87f\u5f50\u16f6\ub113\u52d3\u12b2, var_25_72:float, var_26_77:float, var_27_7C:float), p8:float, p9:float, p10:float, p11:float))
            return:void()
        }
        
        goto(Label_0006)
    }
    
    public static void \u5db4\u3d64\u36d3\uae5d\u624e\ube23(\u5d20\u7043\u88c5\u5db4\uf94d.\u760c\u7ce1\u9a18\ub32d\u6d99\ub6ab p0, double p1, double p2, double p3, double p4, double p5, double p6, float p7, float p8, float p9, float p10) {
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
            invokeinterface:void(\u6b0d\uf9c5\ucfaf\ud36e\ub102::\ua61f\u0a06\u3bc9\ufe34\uc9f6\u8258, invokeinterface:\u6b0d\uf9c5\ucfaf\ud36e\ub102(\u6b0d\uf9c5\ucfaf\ud36e\ub102::\ub70c\u600f\u93a2\uc910\u9937\u946b, invokevirtual:\u6b0d\uf9c5\ucfaf\ud36e\ub102(\u6b0d\uf9c5\ucfaf\ud36e\ub102::\u8d90\u9255\u3bd6\u5d20\ub83f\u1187, p0:\u760c\u7ce1\u9a18\ub32d\u6d99\ub6ab[expected:\u6b0d\uf9c5\ucfaf\ud36e\ub102], p1:double, p2:double, p3:double), p7:float, p8:float, p9:float, p10:float))
            invokeinterface:void(\u6b0d\uf9c5\ucfaf\ud36e\ub102::\ua61f\u0a06\u3bc9\ufe34\uc9f6\u8258, invokeinterface:\u6b0d\uf9c5\ucfaf\ud36e\ub102(\u6b0d\uf9c5\ucfaf\ud36e\ub102::\ub70c\u600f\u93a2\uc910\u9937\u946b, invokevirtual:\u6b0d\uf9c5\ucfaf\ud36e\ub102(\u6b0d\uf9c5\ucfaf\ud36e\ub102::\u8d90\u9255\u3bd6\u5d20\ub83f\u1187, p0:\u760c\u7ce1\u9a18\ub32d\u6d99\ub6ab[expected:\u6b0d\uf9c5\ucfaf\ud36e\ub102], p1:double, p2:double, p3:double), p7:float, p8:float, p9:float, p10:float))
            invokeinterface:void(\u6b0d\uf9c5\ucfaf\ud36e\ub102::\ua61f\u0a06\u3bc9\ufe34\uc9f6\u8258, invokeinterface:\u6b0d\uf9c5\ucfaf\ud36e\ub102(\u6b0d\uf9c5\ucfaf\ud36e\ub102::\ub70c\u600f\u93a2\uc910\u9937\u946b, invokevirtual:\u6b0d\uf9c5\ucfaf\ud36e\ub102(\u6b0d\uf9c5\ucfaf\ud36e\ub102::\u8d90\u9255\u3bd6\u5d20\ub83f\u1187, p0:\u760c\u7ce1\u9a18\ub32d\u6d99\ub6ab[expected:\u6b0d\uf9c5\ucfaf\ud36e\ub102], p1:double, p2:double, p3:double), p7:float, p8:float, p9:float, p10:float))
            invokeinterface:void(\u6b0d\uf9c5\ucfaf\ud36e\ub102::\ua61f\u0a06\u3bc9\ufe34\uc9f6\u8258, invokeinterface:\u6b0d\uf9c5\ucfaf\ud36e\ub102(\u6b0d\uf9c5\ucfaf\ud36e\ub102::\ub70c\u600f\u93a2\uc910\u9937\u946b, invokevirtual:\u6b0d\uf9c5\ucfaf\ud36e\ub102(\u6b0d\uf9c5\ucfaf\ud36e\ub102::\u8d90\u9255\u3bd6\u5d20\ub83f\u1187, p0:\u760c\u7ce1\u9a18\ub32d\u6d99\ub6ab[expected:\u6b0d\uf9c5\ucfaf\ud36e\ub102], p1:double, p2:double, p6:double), p7:float, p8:float, p9:float, p10:float))
            invokeinterface:void(\u6b0d\uf9c5\ucfaf\ud36e\ub102::\ua61f\u0a06\u3bc9\ufe34\uc9f6\u8258, invokeinterface:\u6b0d\uf9c5\ucfaf\ud36e\ub102(\u6b0d\uf9c5\ucfaf\ud36e\ub102::\ub70c\u600f\u93a2\uc910\u9937\u946b, invokevirtual:\u6b0d\uf9c5\ucfaf\ud36e\ub102(\u6b0d\uf9c5\ucfaf\ud36e\ub102::\u8d90\u9255\u3bd6\u5d20\ub83f\u1187, p0:\u760c\u7ce1\u9a18\ub32d\u6d99\ub6ab[expected:\u6b0d\uf9c5\ucfaf\ud36e\ub102], p1:double, p5:double, p3:double), p7:float, p8:float, p9:float, p10:float))
            invokeinterface:void(\u6b0d\uf9c5\ucfaf\ud36e\ub102::\ua61f\u0a06\u3bc9\ufe34\uc9f6\u8258, invokeinterface:\u6b0d\uf9c5\ucfaf\ud36e\ub102(\u6b0d\uf9c5\ucfaf\ud36e\ub102::\ub70c\u600f\u93a2\uc910\u9937\u946b, invokevirtual:\u6b0d\uf9c5\ucfaf\ud36e\ub102(\u6b0d\uf9c5\ucfaf\ud36e\ub102::\u8d90\u9255\u3bd6\u5d20\ub83f\u1187, p0:\u760c\u7ce1\u9a18\ub32d\u6d99\ub6ab[expected:\u6b0d\uf9c5\ucfaf\ud36e\ub102], p1:double, p5:double, p6:double), p7:float, p8:float, p9:float, p10:float))
            invokeinterface:void(\u6b0d\uf9c5\ucfaf\ud36e\ub102::\ua61f\u0a06\u3bc9\ufe34\uc9f6\u8258, invokeinterface:\u6b0d\uf9c5\ucfaf\ud36e\ub102(\u6b0d\uf9c5\ucfaf\ud36e\ub102::\ub70c\u600f\u93a2\uc910\u9937\u946b, invokevirtual:\u6b0d\uf9c5\ucfaf\ud36e\ub102(\u6b0d\uf9c5\ucfaf\ud36e\ub102::\u8d90\u9255\u3bd6\u5d20\ub83f\u1187, p0:\u760c\u7ce1\u9a18\ub32d\u6d99\ub6ab[expected:\u6b0d\uf9c5\ucfaf\ud36e\ub102], p1:double, p5:double, p6:double), p7:float, p8:float, p9:float, p10:float))
            invokeinterface:void(\u6b0d\uf9c5\ucfaf\ud36e\ub102::\ua61f\u0a06\u3bc9\ufe34\uc9f6\u8258, invokeinterface:\u6b0d\uf9c5\ucfaf\ud36e\ub102(\u6b0d\uf9c5\ucfaf\ud36e\ub102::\ub70c\u600f\u93a2\uc910\u9937\u946b, invokevirtual:\u6b0d\uf9c5\ucfaf\ud36e\ub102(\u6b0d\uf9c5\ucfaf\ud36e\ub102::\u8d90\u9255\u3bd6\u5d20\ub83f\u1187, p0:\u760c\u7ce1\u9a18\ub32d\u6d99\ub6ab[expected:\u6b0d\uf9c5\ucfaf\ud36e\ub102], p1:double, p2:double, p6:double), p7:float, p8:float, p9:float, p10:float))
            invokeinterface:void(\u6b0d\uf9c5\ucfaf\ud36e\ub102::\ua61f\u0a06\u3bc9\ufe34\uc9f6\u8258, invokeinterface:\u6b0d\uf9c5\ucfaf\ud36e\ub102(\u6b0d\uf9c5\ucfaf\ud36e\ub102::\ub70c\u600f\u93a2\uc910\u9937\u946b, invokevirtual:\u6b0d\uf9c5\ucfaf\ud36e\ub102(\u6b0d\uf9c5\ucfaf\ud36e\ub102::\u8d90\u9255\u3bd6\u5d20\ub83f\u1187, p0:\u760c\u7ce1\u9a18\ub32d\u6d99\ub6ab[expected:\u6b0d\uf9c5\ucfaf\ud36e\ub102], p4:double, p5:double, p6:double), p7:float, p8:float, p9:float, p10:float))
            invokeinterface:void(\u6b0d\uf9c5\ucfaf\ud36e\ub102::\ua61f\u0a06\u3bc9\ufe34\uc9f6\u8258, invokeinterface:\u6b0d\uf9c5\ucfaf\ud36e\ub102(\u6b0d\uf9c5\ucfaf\ud36e\ub102::\ub70c\u600f\u93a2\uc910\u9937\u946b, invokevirtual:\u6b0d\uf9c5\ucfaf\ud36e\ub102(\u6b0d\uf9c5\ucfaf\ud36e\ub102::\u8d90\u9255\u3bd6\u5d20\ub83f\u1187, p0:\u760c\u7ce1\u9a18\ub32d\u6d99\ub6ab[expected:\u6b0d\uf9c5\ucfaf\ud36e\ub102], p4:double, p2:double, p6:double), p7:float, p8:float, p9:float, p10:float))
            invokeinterface:void(\u6b0d\uf9c5\ucfaf\ud36e\ub102::\ua61f\u0a06\u3bc9\ufe34\uc9f6\u8258, invokeinterface:\u6b0d\uf9c5\ucfaf\ud36e\ub102(\u6b0d\uf9c5\ucfaf\ud36e\ub102::\ub70c\u600f\u93a2\uc910\u9937\u946b, invokevirtual:\u6b0d\uf9c5\ucfaf\ud36e\ub102(\u6b0d\uf9c5\ucfaf\ud36e\ub102::\u8d90\u9255\u3bd6\u5d20\ub83f\u1187, p0:\u760c\u7ce1\u9a18\ub32d\u6d99\ub6ab[expected:\u6b0d\uf9c5\ucfaf\ud36e\ub102], p4:double, p2:double, p6:double), p7:float, p8:float, p9:float, p10:float))
            invokeinterface:void(\u6b0d\uf9c5\ucfaf\ud36e\ub102::\ua61f\u0a06\u3bc9\ufe34\uc9f6\u8258, invokeinterface:\u6b0d\uf9c5\ucfaf\ud36e\ub102(\u6b0d\uf9c5\ucfaf\ud36e\ub102::\ub70c\u600f\u93a2\uc910\u9937\u946b, invokevirtual:\u6b0d\uf9c5\ucfaf\ud36e\ub102(\u6b0d\uf9c5\ucfaf\ud36e\ub102::\u8d90\u9255\u3bd6\u5d20\ub83f\u1187, p0:\u760c\u7ce1\u9a18\ub32d\u6d99\ub6ab[expected:\u6b0d\uf9c5\ucfaf\ud36e\ub102], p4:double, p2:double, p3:double), p7:float, p8:float, p9:float, p10:float))
            invokeinterface:void(\u6b0d\uf9c5\ucfaf\ud36e\ub102::\ua61f\u0a06\u3bc9\ufe34\uc9f6\u8258, invokeinterface:\u6b0d\uf9c5\ucfaf\ud36e\ub102(\u6b0d\uf9c5\ucfaf\ud36e\ub102::\ub70c\u600f\u93a2\uc910\u9937\u946b, invokevirtual:\u6b0d\uf9c5\ucfaf\ud36e\ub102(\u6b0d\uf9c5\ucfaf\ud36e\ub102::\u8d90\u9255\u3bd6\u5d20\ub83f\u1187, p0:\u760c\u7ce1\u9a18\ub32d\u6d99\ub6ab[expected:\u6b0d\uf9c5\ucfaf\ud36e\ub102], p4:double, p5:double, p6:double), p7:float, p8:float, p9:float, p10:float))
            invokeinterface:void(\u6b0d\uf9c5\ucfaf\ud36e\ub102::\ua61f\u0a06\u3bc9\ufe34\uc9f6\u8258, invokeinterface:\u6b0d\uf9c5\ucfaf\ud36e\ub102(\u6b0d\uf9c5\ucfaf\ud36e\ub102::\ub70c\u600f\u93a2\uc910\u9937\u946b, invokevirtual:\u6b0d\uf9c5\ucfaf\ud36e\ub102(\u6b0d\uf9c5\ucfaf\ud36e\ub102::\u8d90\u9255\u3bd6\u5d20\ub83f\u1187, p0:\u760c\u7ce1\u9a18\ub32d\u6d99\ub6ab[expected:\u6b0d\uf9c5\ucfaf\ud36e\ub102], p4:double, p5:double, p3:double), p7:float, p8:float, p9:float, p10:float))
            invokeinterface:void(\u6b0d\uf9c5\ucfaf\ud36e\ub102::\ua61f\u0a06\u3bc9\ufe34\uc9f6\u8258, invokeinterface:\u6b0d\uf9c5\ucfaf\ud36e\ub102(\u6b0d\uf9c5\ucfaf\ud36e\ub102::\ub70c\u600f\u93a2\uc910\u9937\u946b, invokevirtual:\u6b0d\uf9c5\ucfaf\ud36e\ub102(\u6b0d\uf9c5\ucfaf\ud36e\ub102::\u8d90\u9255\u3bd6\u5d20\ub83f\u1187, p0:\u760c\u7ce1\u9a18\ub32d\u6d99\ub6ab[expected:\u6b0d\uf9c5\ucfaf\ud36e\ub102], p4:double, p5:double, p3:double), p7:float, p8:float, p9:float, p10:float))
            invokeinterface:void(\u6b0d\uf9c5\ucfaf\ud36e\ub102::\ua61f\u0a06\u3bc9\ufe34\uc9f6\u8258, invokeinterface:\u6b0d\uf9c5\ucfaf\ud36e\ub102(\u6b0d\uf9c5\ucfaf\ud36e\ub102::\ub70c\u600f\u93a2\uc910\u9937\u946b, invokevirtual:\u6b0d\uf9c5\ucfaf\ud36e\ub102(\u6b0d\uf9c5\ucfaf\ud36e\ub102::\u8d90\u9255\u3bd6\u5d20\ub83f\u1187, p0:\u760c\u7ce1\u9a18\ub32d\u6d99\ub6ab[expected:\u6b0d\uf9c5\ucfaf\ud36e\ub102], p4:double, p2:double, p3:double), p7:float, p8:float, p9:float, p10:float))
            invokeinterface:void(\u6b0d\uf9c5\ucfaf\ud36e\ub102::\ua61f\u0a06\u3bc9\ufe34\uc9f6\u8258, invokeinterface:\u6b0d\uf9c5\ucfaf\ud36e\ub102(\u6b0d\uf9c5\ucfaf\ud36e\ub102::\ub70c\u600f\u93a2\uc910\u9937\u946b, invokevirtual:\u6b0d\uf9c5\ucfaf\ud36e\ub102(\u6b0d\uf9c5\ucfaf\ud36e\ub102::\u8d90\u9255\u3bd6\u5d20\ub83f\u1187, p0:\u760c\u7ce1\u9a18\ub32d\u6d99\ub6ab[expected:\u6b0d\uf9c5\ucfaf\ud36e\ub102], p1:double, p5:double, p3:double), p7:float, p8:float, p9:float, p10:float))
            invokeinterface:void(\u6b0d\uf9c5\ucfaf\ud36e\ub102::\ua61f\u0a06\u3bc9\ufe34\uc9f6\u8258, invokeinterface:\u6b0d\uf9c5\ucfaf\ud36e\ub102(\u6b0d\uf9c5\ucfaf\ud36e\ub102::\ub70c\u600f\u93a2\uc910\u9937\u946b, invokevirtual:\u6b0d\uf9c5\ucfaf\ud36e\ub102(\u6b0d\uf9c5\ucfaf\ud36e\ub102::\u8d90\u9255\u3bd6\u5d20\ub83f\u1187, p0:\u760c\u7ce1\u9a18\ub32d\u6d99\ub6ab[expected:\u6b0d\uf9c5\ucfaf\ud36e\ub102], p1:double, p2:double, p3:double), p7:float, p8:float, p9:float, p10:float))
            invokeinterface:void(\u6b0d\uf9c5\ucfaf\ud36e\ub102::\ua61f\u0a06\u3bc9\ufe34\uc9f6\u8258, invokeinterface:\u6b0d\uf9c5\ucfaf\ud36e\ub102(\u6b0d\uf9c5\ucfaf\ud36e\ub102::\ub70c\u600f\u93a2\uc910\u9937\u946b, invokevirtual:\u6b0d\uf9c5\ucfaf\ud36e\ub102(\u6b0d\uf9c5\ucfaf\ud36e\ub102::\u8d90\u9255\u3bd6\u5d20\ub83f\u1187, p0:\u760c\u7ce1\u9a18\ub32d\u6d99\ub6ab[expected:\u6b0d\uf9c5\ucfaf\ud36e\ub102], p1:double, p2:double, p3:double), p7:float, p8:float, p9:float, p10:float))
            invokeinterface:void(\u6b0d\uf9c5\ucfaf\ud36e\ub102::\ua61f\u0a06\u3bc9\ufe34\uc9f6\u8258, invokeinterface:\u6b0d\uf9c5\ucfaf\ud36e\ub102(\u6b0d\uf9c5\ucfaf\ud36e\ub102::\ub70c\u600f\u93a2\uc910\u9937\u946b, invokevirtual:\u6b0d\uf9c5\ucfaf\ud36e\ub102(\u6b0d\uf9c5\ucfaf\ud36e\ub102::\u8d90\u9255\u3bd6\u5d20\ub83f\u1187, p0:\u760c\u7ce1\u9a18\ub32d\u6d99\ub6ab[expected:\u6b0d\uf9c5\ucfaf\ud36e\ub102], p4:double, p2:double, p3:double), p7:float, p8:float, p9:float, p10:float))
            invokeinterface:void(\u6b0d\uf9c5\ucfaf\ud36e\ub102::\ua61f\u0a06\u3bc9\ufe34\uc9f6\u8258, invokeinterface:\u6b0d\uf9c5\ucfaf\ud36e\ub102(\u6b0d\uf9c5\ucfaf\ud36e\ub102::\ub70c\u600f\u93a2\uc910\u9937\u946b, invokevirtual:\u6b0d\uf9c5\ucfaf\ud36e\ub102(\u6b0d\uf9c5\ucfaf\ud36e\ub102::\u8d90\u9255\u3bd6\u5d20\ub83f\u1187, p0:\u760c\u7ce1\u9a18\ub32d\u6d99\ub6ab[expected:\u6b0d\uf9c5\ucfaf\ud36e\ub102], p1:double, p2:double, p6:double), p7:float, p8:float, p9:float, p10:float))
            invokeinterface:void(\u6b0d\uf9c5\ucfaf\ud36e\ub102::\ua61f\u0a06\u3bc9\ufe34\uc9f6\u8258, invokeinterface:\u6b0d\uf9c5\ucfaf\ud36e\ub102(\u6b0d\uf9c5\ucfaf\ud36e\ub102::\ub70c\u600f\u93a2\uc910\u9937\u946b, invokevirtual:\u6b0d\uf9c5\ucfaf\ud36e\ub102(\u6b0d\uf9c5\ucfaf\ud36e\ub102::\u8d90\u9255\u3bd6\u5d20\ub83f\u1187, p0:\u760c\u7ce1\u9a18\ub32d\u6d99\ub6ab[expected:\u6b0d\uf9c5\ucfaf\ud36e\ub102], p4:double, p2:double, p6:double), p7:float, p8:float, p9:float, p10:float))
            invokeinterface:void(\u6b0d\uf9c5\ucfaf\ud36e\ub102::\ua61f\u0a06\u3bc9\ufe34\uc9f6\u8258, invokeinterface:\u6b0d\uf9c5\ucfaf\ud36e\ub102(\u6b0d\uf9c5\ucfaf\ud36e\ub102::\ub70c\u600f\u93a2\uc910\u9937\u946b, invokevirtual:\u6b0d\uf9c5\ucfaf\ud36e\ub102(\u6b0d\uf9c5\ucfaf\ud36e\ub102::\u8d90\u9255\u3bd6\u5d20\ub83f\u1187, p0:\u760c\u7ce1\u9a18\ub32d\u6d99\ub6ab[expected:\u6b0d\uf9c5\ucfaf\ud36e\ub102], p4:double, p2:double, p6:double), p7:float, p8:float, p9:float, p10:float))
            invokeinterface:void(\u6b0d\uf9c5\ucfaf\ud36e\ub102::\ua61f\u0a06\u3bc9\ufe34\uc9f6\u8258, invokeinterface:\u6b0d\uf9c5\ucfaf\ud36e\ub102(\u6b0d\uf9c5\ucfaf\ud36e\ub102::\ub70c\u600f\u93a2\uc910\u9937\u946b, invokevirtual:\u6b0d\uf9c5\ucfaf\ud36e\ub102(\u6b0d\uf9c5\ucfaf\ud36e\ub102::\u8d90\u9255\u3bd6\u5d20\ub83f\u1187, p0:\u760c\u7ce1\u9a18\ub32d\u6d99\ub6ab[expected:\u6b0d\uf9c5\ucfaf\ud36e\ub102], p1:double, p5:double, p3:double), p7:float, p8:float, p9:float, p10:float))
            invokeinterface:void(\u6b0d\uf9c5\ucfaf\ud36e\ub102::\ua61f\u0a06\u3bc9\ufe34\uc9f6\u8258, invokeinterface:\u6b0d\uf9c5\ucfaf\ud36e\ub102(\u6b0d\uf9c5\ucfaf\ud36e\ub102::\ub70c\u600f\u93a2\uc910\u9937\u946b, invokevirtual:\u6b0d\uf9c5\ucfaf\ud36e\ub102(\u6b0d\uf9c5\ucfaf\ud36e\ub102::\u8d90\u9255\u3bd6\u5d20\ub83f\u1187, p0:\u760c\u7ce1\u9a18\ub32d\u6d99\ub6ab[expected:\u6b0d\uf9c5\ucfaf\ud36e\ub102], p1:double, p5:double, p3:double), p7:float, p8:float, p9:float, p10:float))
            invokeinterface:void(\u6b0d\uf9c5\ucfaf\ud36e\ub102::\ua61f\u0a06\u3bc9\ufe34\uc9f6\u8258, invokeinterface:\u6b0d\uf9c5\ucfaf\ud36e\ub102(\u6b0d\uf9c5\ucfaf\ud36e\ub102::\ub70c\u600f\u93a2\uc910\u9937\u946b, invokevirtual:\u6b0d\uf9c5\ucfaf\ud36e\ub102(\u6b0d\uf9c5\ucfaf\ud36e\ub102::\u8d90\u9255\u3bd6\u5d20\ub83f\u1187, p0:\u760c\u7ce1\u9a18\ub32d\u6d99\ub6ab[expected:\u6b0d\uf9c5\ucfaf\ud36e\ub102], p1:double, p5:double, p6:double), p7:float, p8:float, p9:float, p10:float))
            invokeinterface:void(\u6b0d\uf9c5\ucfaf\ud36e\ub102::\ua61f\u0a06\u3bc9\ufe34\uc9f6\u8258, invokeinterface:\u6b0d\uf9c5\ucfaf\ud36e\ub102(\u6b0d\uf9c5\ucfaf\ud36e\ub102::\ub70c\u600f\u93a2\uc910\u9937\u946b, invokevirtual:\u6b0d\uf9c5\ucfaf\ud36e\ub102(\u6b0d\uf9c5\ucfaf\ud36e\ub102::\u8d90\u9255\u3bd6\u5d20\ub83f\u1187, p0:\u760c\u7ce1\u9a18\ub32d\u6d99\ub6ab[expected:\u6b0d\uf9c5\ucfaf\ud36e\ub102], p4:double, p5:double, p3:double), p7:float, p8:float, p9:float, p10:float))
            invokeinterface:void(\u6b0d\uf9c5\ucfaf\ud36e\ub102::\ua61f\u0a06\u3bc9\ufe34\uc9f6\u8258, invokeinterface:\u6b0d\uf9c5\ucfaf\ud36e\ub102(\u6b0d\uf9c5\ucfaf\ud36e\ub102::\ub70c\u600f\u93a2\uc910\u9937\u946b, invokevirtual:\u6b0d\uf9c5\ucfaf\ud36e\ub102(\u6b0d\uf9c5\ucfaf\ud36e\ub102::\u8d90\u9255\u3bd6\u5d20\ub83f\u1187, p0:\u760c\u7ce1\u9a18\ub32d\u6d99\ub6ab[expected:\u6b0d\uf9c5\ucfaf\ud36e\ub102], p4:double, p5:double, p6:double), p7:float, p8:float, p9:float, p10:float))
            invokeinterface:void(\u6b0d\uf9c5\ucfaf\ud36e\ub102::\ua61f\u0a06\u3bc9\ufe34\uc9f6\u8258, invokeinterface:\u6b0d\uf9c5\ucfaf\ud36e\ub102(\u6b0d\uf9c5\ucfaf\ud36e\ub102::\ub70c\u600f\u93a2\uc910\u9937\u946b, invokevirtual:\u6b0d\uf9c5\ucfaf\ud36e\ub102(\u6b0d\uf9c5\ucfaf\ud36e\ub102::\u8d90\u9255\u3bd6\u5d20\ub83f\u1187, p0:\u760c\u7ce1\u9a18\ub32d\u6d99\ub6ab[expected:\u6b0d\uf9c5\ucfaf\ud36e\ub102], p4:double, p5:double, p6:double), p7:float, p8:float, p9:float, p10:float))
            invokeinterface:void(\u6b0d\uf9c5\ucfaf\ud36e\ub102::\ua61f\u0a06\u3bc9\ufe34\uc9f6\u8258, invokeinterface:\u6b0d\uf9c5\ucfaf\ud36e\ub102(\u6b0d\uf9c5\ucfaf\ud36e\ub102::\ub70c\u600f\u93a2\uc910\u9937\u946b, invokevirtual:\u6b0d\uf9c5\ucfaf\ud36e\ub102(\u6b0d\uf9c5\ucfaf\ud36e\ub102::\u8d90\u9255\u3bd6\u5d20\ub83f\u1187, p0:\u760c\u7ce1\u9a18\ub32d\u6d99\ub6ab[expected:\u6b0d\uf9c5\ucfaf\ud36e\ub102], p4:double, p5:double, p6:double), p7:float, p8:float, p9:float, p10:float))
            return:void()
        }
        
        goto(Label_0006)
    }
    
    public void \u927d\u3504\u5bc4\ub70c\u6198\u4daf(\u5d20\u97b7\u8753\u873d\u16f6.\u718f\u6435\uc31c\u4ab3\u98a4 p0, \u71f1\uc910\u3bc9\u516c\u93a2.\u6b0d\ud171\uc7fe\u52d3\uafe7\u6c56 p1, \u5245\u8aa5\u61a4\u7049\u4cd9.\u8413\u7e3f\uc910\uf94d\u5654\u6b0d p2, \u5245\u8aa5\u61a4\u7049\u4cd9.\u8413\u7e3f\uc910\uf94d\u5654\u6b0d p3, int p4) {
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
            invokespecial:void(\u9937\u7d52\u3e75\u98a4\u8aa5\u7006::\u927d\u3504\u5bc4\ub70c\u6198\u4daf, this:\u9937\u7d52\u3e75\u98a4\u8aa5\u7006, p1:\u6b0d\ud171\uc7fe\u52d3\uafe7\u6c56, cmpne:boolean(and:int(p4:int, ldc:int(8)), ldc:int(0)))
            return:void()
        }
        
        goto(Label_0006)
    }
    
    private void \u927d\u3504\u5bc4\ub70c\u6198\u4daf(\u71f1\uc910\u3bc9\u516c\u93a2.\u6b0d\ud171\uc7fe\u52d3\uafe7\u6c56 p0, boolean p1) {
        var_3_5E : int
        var_4_6F : int
        var_5_82 : int
        
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
            var_3_5E = sub:int(invokevirtual:int(\u3a62\uc9f6\u3776\u4f52\ua068\u34df::\u3e75\uc29a\u071d\u4d85\ubded\ub70c, p0:\u6b0d\ud171\uc7fe\u52d3\uafe7\u6c56[expected:\u3a62\uc9f6\u3776\u4f52\ua068\u34df]), ldc:int(1))
            
            while (cmple:boolean(var_3_5E:int, add:int(invokevirtual:int(\u3a62\uc9f6\u3776\u4f52\ua068\u34df::\u3e75\uc29a\u071d\u4d85\ubded\ub70c, p0:\u6b0d\ud171\uc7fe\u52d3\uafe7\u6c56[expected:\u3a62\uc9f6\u3776\u4f52\ua068\u34df]), ldc:int(1)))) {
                var_4_6F = sub:int(invokevirtual:int(\u3a62\uc9f6\u3776\u4f52\ua068\u34df::\u8aa5\u97b7\u4daf\u72f1\u600f\u8cae, p0:\u6b0d\ud171\uc7fe\u52d3\uafe7\u6c56[expected:\u3a62\uc9f6\u3776\u4f52\ua068\u34df]), ldc:int(1))
                
                while (cmple:boolean(var_4_6F:int, add:int(invokevirtual:int(\u3a62\uc9f6\u3776\u4f52\ua068\u34df::\u8aa5\u97b7\u4daf\u72f1\u600f\u8cae, p0:\u6b0d\ud171\uc7fe\u52d3\uafe7\u6c56[expected:\u3a62\uc9f6\u3776\u4f52\ua068\u34df]), ldc:int(1)))) {
                    var_5_82 = sub:int(invokevirtual:int(\u3a62\uc9f6\u3776\u4f52\ua068\u34df::\u9af2\u8350\u8350\u93a2\u494c\u624e, p0:\u6b0d\ud171\uc7fe\u52d3\uafe7\u6c56[expected:\u3a62\uc9f6\u3776\u4f52\ua068\u34df]), ldc:int(1))
                    
                    while (cmple:boolean(var_5_82:int, add:int(invokevirtual:int(\u3a62\uc9f6\u3776\u4f52\ua068\u34df::\u9af2\u8350\u8350\u93a2\u494c\u624e, p0:\u6b0d\ud171\uc7fe\u52d3\uafe7\u6c56[expected:\u3a62\uc9f6\u3776\u4f52\ua068\u34df]), ldc:int(1)))) {
                        invokespecial:void(\u9937\u7d52\u3e75\u98a4\u8aa5\u7006::\u0c95\uf9c5\u836c\u7006\uf9c5\uceb8, this:\u9937\u7d52\u3e75\u98a4\u8aa5\u7006, shr:int(var_4_6F:int, ldc:int(4)), shr:int(var_5_82:int, ldc:int(4)), shr:int(var_3_5E:int, ldc:int(4)), p1:boolean)
                        inc:int(var_5_82, ldc:int(1))
                    }
                    
                    inc:int(var_4_6F, ldc:int(1))
                }
                
                inc:int(var_3_5E, ldc:int(1))
            }
            
            return:void()
        }
        
        goto(Label_0006)
    }
    
    public void \u7d52\u0800\u647c\u7049\uc29a\u8258(int p0, int p1, int p2, int p3, int p4, int p5) {
        var_7_5B : int
        var_8_69 : int
        var_9_77 : int
        
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
            var_7_5B = sub:int(p2:int, ldc:int(1))
            
            while (cmple:boolean(var_7_5B:int, add:int(p5:int, ldc:int(1)))) {
                var_8_69 = sub:int(p0:int, ldc:int(1))
                
                while (cmple:boolean(var_8_69:int, add:int(p3:int, ldc:int(1)))) {
                    var_9_77 = sub:int(p1:int, ldc:int(1))
                    
                    while (cmple:boolean(var_9_77:int, add:int(p4:int, ldc:int(1)))) {
                        invokevirtual:void(\u9937\u7d52\u3e75\u98a4\u8aa5\u7006::\u0c95\uf9c5\u836c\u7006\uf9c5\uceb8, this:\u9937\u7d52\u3e75\u98a4\u8aa5\u7006, shr:int(var_8_69:int, ldc:int(4)), shr:int(var_9_77:int, ldc:int(4)), shr:int(var_7_5B:int, ldc:int(4)))
                        inc:int(var_9_77, ldc:int(1))
                    }
                    
                    inc:int(var_8_69, ldc:int(1))
                }
                
                inc:int(var_7_5B, ldc:int(1))
            }
            
            return:void()
        }
        
        goto(Label_0006)
    }
    
    public void \u7d52\u0800\u647c\u7049\uc29a\u8258(\u71f1\uc910\u3bc9\u516c\u93a2.\u6b0d\ud171\uc7fe\u52d3\uafe7\u6c56 p0, \u5245\u8aa5\u61a4\u7049\u4cd9.\u8413\u7e3f\uc910\uf94d\u5654\u6b0d p1, \u5245\u8aa5\u61a4\u7049\u4cd9.\u8413\u7e3f\uc910\uf94d\u5654\u6b0d p2) {
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
            
            if (invokevirtual:boolean(\u7af6\u67d0\u8753\u71f1\u6198\u494c::\u5d20\uf995\uc2e8\u1833\u8d90\u4e72, invokevirtual:\u7af6\u67d0\u8753\u71f1\u6198\u494c(\u67e9\u4daf\u760c\ud217\ua6bd\ubff1::\u6cfe\u4bc8\u51fa\u7e3f\u40a9\u52d3, getfield:\u67e9\u4daf\u760c\ud217\ua6bd\ubff1(\u9937\u7d52\u3e75\u98a4\u8aa5\u7006::\u8df4\u3776\ud171\u7006\u51b2\uf995, this:\u9937\u7d52\u3e75\u98a4\u8aa5\u7006)), p1:\u8413\u7e3f\uc910\uf94d\u5654\u6b0d, p2:\u8413\u7e3f\uc910\uf94d\u5654\u6b0d)) {
                invokevirtual:void(\u9937\u7d52\u3e75\u98a4\u8aa5\u7006::\u7d52\u0800\u647c\u7049\uc29a\u8258, this:\u9937\u7d52\u3e75\u98a4\u8aa5\u7006, invokevirtual:int(\u3a62\uc9f6\u3776\u4f52\ua068\u34df::\u8aa5\u97b7\u4daf\u72f1\u600f\u8cae, p0:\u6b0d\ud171\uc7fe\u52d3\uafe7\u6c56[expected:\u3a62\uc9f6\u3776\u4f52\ua068\u34df]), invokevirtual:int(\u3a62\uc9f6\u3776\u4f52\ua068\u34df::\u9af2\u8350\u8350\u93a2\u494c\u624e, p0:\u6b0d\ud171\uc7fe\u52d3\uafe7\u6c56[expected:\u3a62\uc9f6\u3776\u4f52\ua068\u34df]), invokevirtual:int(\u3a62\uc9f6\u3776\u4f52\ua068\u34df::\u3e75\uc29a\u071d\u4d85\ubded\ub70c, p0:\u6b0d\ud171\uc7fe\u52d3\uafe7\u6c56[expected:\u3a62\uc9f6\u3776\u4f52\ua068\u34df]), invokevirtual:int(\u3a62\uc9f6\u3776\u4f52\ua068\u34df::\u8aa5\u97b7\u4daf\u72f1\u600f\u8cae, p0:\u6b0d\ud171\uc7fe\u52d3\uafe7\u6c56[expected:\u3a62\uc9f6\u3776\u4f52\ua068\u34df]), invokevirtual:int(\u3a62\uc9f6\u3776\u4f52\ua068\u34df::\u9af2\u8350\u8350\u93a2\u494c\u624e, p0:\u6b0d\ud171\uc7fe\u52d3\uafe7\u6c56[expected:\u3a62\uc9f6\u3776\u4f52\ua068\u34df]), invokevirtual:int(\u3a62\uc9f6\u3776\u4f52\ua068\u34df::\u3e75\uc29a\u071d\u4d85\ubded\ub70c, p0:\u6b0d\ud171\uc7fe\u52d3\uafe7\u6c56[expected:\u3a62\uc9f6\u3776\u4f52\ua068\u34df]))
            }
            
            return:void()
        }
        
        goto(Label_0006)
    }
    
    public void \ud171\u71f1\u4daf\uff55\ubded\u74b1(int p0, int p1, int p2) {
        var_4_5B : int
        var_5_68 : int
        var_6_75 : int
        
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
            var_4_5B = sub:int(p2:int, ldc:int(1))
            
            while (cmple:boolean(var_4_5B:int, add:int(p2:int, ldc:int(1)))) {
                var_5_68 = sub:int(p0:int, ldc:int(1))
                
                while (cmple:boolean(var_5_68:int, add:int(p0:int, ldc:int(1)))) {
                    var_6_75 = sub:int(p1:int, ldc:int(1))
                    
                    while (cmple:boolean(var_6_75:int, add:int(p1:int, ldc:int(1)))) {
                        invokevirtual:void(\u9937\u7d52\u3e75\u98a4\u8aa5\u7006::\u0c95\uf9c5\u836c\u7006\uf9c5\uceb8, this:\u9937\u7d52\u3e75\u98a4\u8aa5\u7006, var_5_68:int, var_6_75:int, var_4_5B:int)
                        inc:int(var_6_75, ldc:int(1))
                    }
                    
                    inc:int(var_5_68, ldc:int(1))
                }
                
                inc:int(var_4_5B, ldc:int(1))
            }
            
            return:void()
        }
        
        goto(Label_0006)
    }
    
    public void \u0c95\uf9c5\u836c\u7006\uf9c5\uceb8(int p0, int p1, int p2) {
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
            invokespecial:void(\u9937\u7d52\u3e75\u98a4\u8aa5\u7006::\u0c95\uf9c5\u836c\u7006\uf9c5\uceb8, this:\u9937\u7d52\u3e75\u98a4\u8aa5\u7006, p0:int, p1:int, p2:int, ldc:boolean(0))
            return:void()
        }
        
        goto(Label_0006)
    }
    
    private void \u0c95\uf9c5\u836c\u7006\uf9c5\uceb8(int p0, int p1, int p2, boolean p3) {
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
            invokevirtual:void(\u61a4\u946b\u4daf\uc2e8\uc4d2\u5140::\ua562\u3e2a\u3776\uae87\u36d3\ua068, getfield:\u61a4\u946b\u4daf\uc2e8\uc4d2\u5140(\u9937\u7d52\u3e75\u98a4\u8aa5\u7006::\u6b5f\u071d\u8640\uc84e\u7bad\u071d, this:\u9937\u7d52\u3e75\u98a4\u8aa5\u7006), p0:int, p1:int, p2:int, p3:boolean)
            return:void()
        }
        
        goto(Label_0006)
    }
    
    public void \u960f\u7043\u8413\ud171\u1833\u8d90(\u927d\u92ff\u71ae\uafe7\u6bb9.\u6b0d\u3d64\u446c\u6cfe\u5f50\u9937 p0, \u71f1\uc910\u3bc9\u516c\u93a2.\u6b0d\ud171\uc7fe\u52d3\uafe7\u6c56 p1) {
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
            invokevirtual:void(\u9937\u7d52\u3e75\u98a4\u8aa5\u7006::\u960f\u7043\u8413\ud171\u1833\u8d90, this:\u9937\u7d52\u3e75\u98a4\u8aa5\u7006, p0:\u6b0d\u3d64\u446c\u6cfe\u5f50\u9937, p1:\u6b0d\ud171\uc7fe\u52d3\uafe7\u6c56, ternaryop:\u0800\u8aa5\u36d3\u67e9\u52d3\u4f4a(cmpeq:boolean(p0:\u6b0d\u3d64\u446c\u6cfe\u5f50\u9937, aconstnull:\u6b0d\u3d64\u446c\u6cfe\u5f50\u9937()), aconstnull:\u0800\u8aa5\u36d3\u67e9\u52d3\u4f4a(), invokestatic:\u0800\u8aa5\u36d3\u67e9\u52d3\u4f4a(\u0800\u8aa5\u36d3\u67e9\u52d3\u4f4a::\u67e9\ubefe\ubcb0\ube23\u52d3\u6198, p0:\u6b0d\u3d64\u446c\u6cfe\u5f50\u9937)))
            return:void()
        }
        
        goto(Label_0006)
    }
    
    public void \u960f\u7043\u8413\ud171\u1833\u8d90(\u927d\u92ff\u71ae\uafe7\u6bb9.\u6b0d\u3d64\u446c\u6cfe\u5f50\u9937 p0, \u71f1\uc910\u3bc9\u516c\u93a2.\u6b0d\ud171\uc7fe\u52d3\uafe7\u6c56 p1, \u6b0d\u12cb\u156b\u4179\u8bb0.\u0800\u8aa5\u36d3\u67e9\u52d3\u4f4a p2) {
        var_4_65 : \u9033\u6b0d\u3d64\uae87\u4c04\u965f
        var_5_8B : \u0800\u8aa5\u36d3\u67e9\u52d3\u4f4a
        var_6_C0 : \u6cfe\u3d64\u8bb0\ub83f\u4f52\ube23
        
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
            var_4_65 = checkcast:\u9033\u6b0d\u3d64\uae87\u4c04\u965f(\u12b2\u7049\u8df4\uc9f6\uae87.\u9033\u6b0d\u3d64\uae87\u4c04\u965f.class, invokeinterface:\u9033\u6b0d\u3d64\uae87\u4c04\u965f(Map<\u6b0d\ud171\uc7fe\u52d3\uafe7\u6c56, \u9033\u6b0d\u3d64\uae87\u4c04\u965f>::get, getfield:Map<\u6b0d\ud171\uc7fe\u52d3\uafe7\u6c56, \u9033\u6b0d\u3d64\uae87\u4c04\u965f>(\u9937\u7d52\u3e75\u98a4\u8aa5\u7006::\ub83f\u64ab\uae5d\u88c5\ud523\u16f6, this:\u9937\u7d52\u3e75\u98a4\u8aa5\u7006), p1:\u6b0d\ud171\uc7fe\u52d3\uafe7\u6c56[expected:Object]))
            
            if (cmpne:boolean(var_4_65:\u9033\u6b0d\u3d64\uae87\u4c04\u965f, aconstnull:\u9033\u6b0d\u3d64\uae87\u4c04\u965f())) {
                invokevirtual:void(\u61a4\ud217\u4e72\u6ec6\uc238\u72f1::\u7af6\u6cfe\u416d\u3e75\u9033\uc910, invokevirtual:\u61a4\ud217\u4e72\u6ec6\uc238\u72f1(\u67e9\u4daf\u760c\ud217\ua6bd\ubff1::\uf94d\u64f2\u3bc9\u67e9\u36d3\u5d20, getfield:\u67e9\u4daf\u760c\ud217\ua6bd\ubff1(\u9937\u7d52\u3e75\u98a4\u8aa5\u7006::\u8df4\u3776\ud171\u7006\u51b2\uf995, this:\u9937\u7d52\u3e75\u98a4\u8aa5\u7006)), var_4_65:\u9033\u6b0d\u3d64\uae87\u4c04\u965f)
                invokeinterface:\u9033\u6b0d\u3d64\uae87\u4c04\u965f(Map<\u6b0d\ud171\uc7fe\u52d3\uafe7\u6c56, \u9033\u6b0d\u3d64\uae87\u4c04\u965f>::remove, getfield:Map<\u6b0d\ud171\uc7fe\u52d3\uafe7\u6c56, \u9033\u6b0d\u3d64\uae87\u4c04\u965f>(\u9937\u7d52\u3e75\u98a4\u8aa5\u7006::\ub83f\u64ab\uae5d\u88c5\ud523\u16f6, this:\u9937\u7d52\u3e75\u98a4\u8aa5\u7006), p1:\u6b0d\ud171\uc7fe\u52d3\uafe7\u6c56[expected:Object])
            }
            
            if (cmpne:boolean(p0:\u6b0d\u3d64\u446c\u6cfe\u5f50\u9937, aconstnull:\u6b0d\u3d64\u446c\u6cfe\u5f50\u9937())) {
                var_5_8B = invokestatic:\u0800\u8aa5\u36d3\u67e9\u52d3\u4f4a(\u0800\u8aa5\u36d3\u67e9\u52d3\u4f4a::\u67e9\ubefe\ubcb0\ube23\u52d3\u6198, p0:\u6b0d\u3d64\u446c\u6cfe\u5f50\u9937)
                
                if (invokevirtual:boolean(\u93a2\u1833\u6cfe\uc4d2\u4ab3\uc84e::\u9255\u8413\ube23\u71ae\u647c\u4f52, getstatic:\u93a2\u1833\u6cfe\uc4d2\u4ab3\uc84e(\u6c52\u873d\uc84e\u7ce1\u4daf\u8308::\ua3b4\u4975\u6bb9\uc2bd\uf9c5\u8413))) {
                    var_5_8B = p2:\u0800\u8aa5\u36d3\u67e9\u52d3\u4f4a
                }
                
                if (cmpne:boolean(var_5_8B:\u0800\u8aa5\u36d3\u67e9\u52d3\u4f4a, aconstnull:\u0800\u8aa5\u36d3\u67e9\u52d3\u4f4a())) {
                    invokevirtual:void(\u120d\u446c\uff55\u3d64\u494c\u69d9::\u3776\u8389\u946b\u527a\u12b2\u4f52, getfield:\u120d\u446c\uff55\u3d64\u494c\u69d9(\u67e9\u4daf\u760c\ud217\ua6bd\ubff1::\u76bc\u873d\uc238\u0a06\uceb8\u92ee, getfield:\u67e9\u4daf\u760c\ud217\ua6bd\ubff1(\u9937\u7d52\u3e75\u98a4\u8aa5\u7006::\u8df4\u3776\ud171\u7006\u51b2\uf995, this:\u9937\u7d52\u3e75\u98a4\u8aa5\u7006)), invokevirtual:IFormattableTextComponent(\u0800\u8aa5\u36d3\u67e9\u52d3\u4f4a::\u9a18\ufcaf\u5d20\u67d0\u647c\u0b8e, var_5_8B:\u0800\u8aa5\u36d3\u67e9\u52d3\u4f4a))
                }
                
                var_6_C0 = invokestatic:\u6cfe\u3d64\u8bb0\ub83f\u4f52\ube23(\u6cfe\u3d64\u8bb0\ub83f\u4f52\ube23::\u3711\u4e72\ua6bd\ufe34\u0800\u51fa, p0:\u6b0d\u3d64\u446c\u6cfe\u5f50\u9937, i2d:double(invokevirtual:int(\u3a62\uc9f6\u3776\u4f52\ua068\u34df::\u8aa5\u97b7\u4daf\u72f1\u600f\u8cae, p1:\u6b0d\ud171\uc7fe\u52d3\uafe7\u6c56[expected:\u3a62\uc9f6\u3776\u4f52\ua068\u34df])), i2d:double(invokevirtual:int(\u3a62\uc9f6\u3776\u4f52\ua068\u34df::\u9af2\u8350\u8350\u93a2\u494c\u624e, p1:\u6b0d\ud171\uc7fe\u52d3\uafe7\u6c56[expected:\u3a62\uc9f6\u3776\u4f52\ua068\u34df])), i2d:double(invokevirtual:int(\u3a62\uc9f6\u3776\u4f52\ua068\u34df::\u3e75\uc29a\u071d\u4d85\ubded\ub70c, p1:\u6b0d\ud171\uc7fe\u52d3\uafe7\u6c56[expected:\u3a62\uc9f6\u3776\u4f52\ua068\u34df])))
                invokeinterface:\u6cfe\u3d64\u8bb0\ub83f\u4f52\ube23(Map<\u6b0d\ud171\uc7fe\u52d3\uafe7\u6c56, \u6cfe\u3d64\u8bb0\ub83f\u4f52\ube23>::put, getfield:Map<\u6b0d\ud171\uc7fe\u52d3\uafe7\u6c56, \u9033\u6b0d\u3d64\uae87\u4c04\u965f>(\u9937\u7d52\u3e75\u98a4\u8aa5\u7006::\ub83f\u64ab\uae5d\u88c5\ud523\u16f6, this:\u9937\u7d52\u3e75\u98a4\u8aa5\u7006), p1:\u6b0d\ud171\uc7fe\u52d3\uafe7\u6c56, var_6_C0:\u6cfe\u3d64\u8bb0\ub83f\u4f52\ube23)
                invokevirtual:void(\u61a4\ud217\u4e72\u6ec6\uc238\u72f1::\ubf56\ua61f\u4975\ua61f\u1187\u6b5f, invokevirtual:\u61a4\ud217\u4e72\u6ec6\uc238\u72f1(\u67e9\u4daf\u760c\ud217\ua6bd\ubff1::\uf94d\u64f2\u3bc9\u67e9\u36d3\u5d20, getfield:\u67e9\u4daf\u760c\ud217\ua6bd\ubff1(\u9937\u7d52\u3e75\u98a4\u8aa5\u7006::\u8df4\u3776\ud171\u7006\u51b2\uf995, this:\u9937\u7d52\u3e75\u98a4\u8aa5\u7006)), var_6_C0:\u6cfe\u3d64\u8bb0\ub83f\u4f52\ube23[expected:\u9033\u6b0d\u3d64\uae87\u4c04\u965f])
            }
            
            invokespecial:void(\u9937\u7d52\u3e75\u98a4\u8aa5\u7006::\uc246\u4ab3\u965f\u120d\u9937\uc2bd, this:\u9937\u7d52\u3e75\u98a4\u8aa5\u7006, getfield:\u16f6\u61a4\u5db4\u4c04\u64ab\u9255[expected:\uf9c5\ud158\u4975\uf94d\ud523\uc31c](\u9937\u7d52\u3e75\u98a4\u8aa5\u7006::\ud51e\u9033\u8df4\u7043\u5f50\u8aa5, this:\u9937\u7d52\u3e75\u98a4\u8aa5\u7006), p1:\u6b0d\ud171\uc7fe\u52d3\uafe7\u6c56, cmpne:boolean(p0:\u6b0d\u3d64\u446c\u6cfe\u5f50\u9937, aconstnull:\u6b0d\u3d64\u446c\u6cfe\u5f50\u9937()))
            return:void()
        }
        
        goto(Label_0006)
    }
    
    private void \uc246\u4ab3\u965f\u120d\u9937\uc2bd(\u56bd\u8413\u647c\u5bc4\ud158.\uf9c5\ud158\u4975\uf94d\ud523\uc31c p0, \u71f1\uc910\u3bc9\u516c\u93a2.\u6b0d\ud171\uc7fe\u52d3\uafe7\u6c56 p1, boolean p2) {
        var_4_72 : Iterator<\ube23\u67d0\u64f2\u839e\u76bc>
        
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
            var_4_72 = invokeinterface:Iterator<\ube23\u67d0\u64f2\u839e\u76bc>(List<\ube23\u67d0\u64f2\u839e\u76bc>::iterator, invokevirtual:List<\ube23\u67d0\u64f2\u839e\u76bc>(\u6cfe\u8bb0\uc3e3\u8aa5\u624e::\u965f\ucef1\u34df\u4daf\u760c\u6d99, p0:\uf9c5\ud158\u4975\uf94d\ud523\uc31c[expected:\u6cfe\u8bb0\uc3e3\u8aa5\u624e], ldc:Class<\ube23\u67d0\u64f2\u839e\u76bc>(\u71f1\uc910\u3bc9\u516c\u93a2.\ube23\u67d0\u64f2\u839e\u76bc.class), invokevirtual:\u7c6b\u965f\ua6bd\u69d9\u56bd\u97b7(\u7c6b\u965f\ua6bd\u69d9\u56bd\u97b7::\ub19c\u946b\u718f\u6cfe\u4bc8\u5654, initobject:\u7c6b\u965f\ua6bd\u69d9\u56bd\u97b7(\u7c6b\u965f\ua6bd\u69d9\u56bd\u97b7::<init>, p1:\u6b0d\ud171\uc7fe\u52d3\uafe7\u6c56), ldc:double(3.0))))
            
            while (invokeinterface:boolean(Iterator<E>::hasNext, var_4_72:Iterator<\ube23\u67d0\u64f2\u839e\u76bc>)) {
                invokevirtual:void(\ube23\u67d0\u64f2\u839e\u76bc::\u927d\ub6ab\u760c\u8640\u3e2a\ua068, checkcast:\ube23\u67d0\u64f2\u839e\u76bc(\u71f1\uc910\u3bc9\u516c\u93a2.\ube23\u67d0\u64f2\u839e\u76bc.class, invokeinterface:\ube23\u67d0\u64f2\u839e\u76bc(Iterator<\ube23\u67d0\u64f2\u839e\u76bc>::next, var_4_72:Iterator<\ube23\u67d0\u64f2\u839e\u76bc>)), p1:\u6b0d\ud171\uc7fe\u52d3\uafe7\u6c56, p2:boolean)
            }
            
            return:void()
        }
        
        goto(Label_0006)
    }
    
    public void \u16f6\u8d98\u6b0d\u836c\u6b0d\u51b2(\u7c6b\u7c6b\ubefe\u385b\u3c25.\ud7e8\u0800\uae87\u8d90\u183a.\u34df\u12b2\u16f6\u873d\u7af6.\u8df4\u97e6\u93a2\u760c\u6fb0\u8c8a p0, boolean p1, double p2, double p3, double p4, double p5, double p6, double p7) {
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
            invokevirtual:void(\u9937\u7d52\u3e75\u98a4\u8aa5\u7006::\u16f6\u8d98\u6b0d\u836c\u6b0d\u51b2, this:\u9937\u7d52\u3e75\u98a4\u8aa5\u7006, p0:\u8df4\u97e6\u93a2\u760c\u6fb0\u8c8a, p1:boolean, ldc:boolean(0), p2:double, p3:double, p4:double, p5:double, p6:double, p7:double)
            return:void()
        }
        
        goto(Label_0006)
    }
    
    public void \u16f6\u8d98\u6b0d\u836c\u6b0d\u51b2(\u7c6b\u7c6b\ubefe\u385b\u3c25.\ud7e8\u0800\uae87\u8d90\u183a.\u34df\u12b2\u16f6\u873d\u7af6.\u8df4\u97e6\u93a2\u760c\u6fb0\u8c8a p0, boolean p1, boolean p2, double p3, double p4, double p5, double p6, double p7, double p8) {
        // java.lang.IllegalStateException: Unsupported node type: com.strobel.decompiler.ast.Lambda
        //     at com.strobel.decompiler.ast.Error.unsupportedNode(Error.java:32)
        //     at com.strobel.decompiler.ast.GotoRemoval.exit(GotoRemoval.java:612)
        //     at com.strobel.decompiler.ast.GotoRemoval.exit(GotoRemoval.java:586)
        //     at com.strobel.decompiler.ast.GotoRemoval.exit(GotoRemoval.java:590)
        //     at com.strobel.decompiler.ast.GotoRemoval.exit(GotoRemoval.java:586)
        //     at com.strobel.decompiler.ast.GotoRemoval.transformLeaveStatements(GotoRemoval.java:625)
        //     at com.strobel.decompiler.ast.GotoRemoval.removeGotosCore(GotoRemoval.java:57)
        //     at com.strobel.decompiler.ast.GotoRemoval.removeGotos(GotoRemoval.java:53)
        //     at com.strobel.decompiler.ast.AstOptimizer.optimize(AstOptimizer.java:276)
        //     at com.strobel.decompiler.languages.BytecodeAstLanguage.decompileMethod(BytecodeAstLanguage.java:139)
        //     at com.strobel.decompiler.languages.BytecodeAstLanguage.decompileType(BytecodeAstLanguage.java:90)
        //     at com.strobel.decompiler.DecompilerDriver.decompileType(DecompilerDriver.java:336)
        //     at com.strobel.decompiler.DecompilerDriver.decompileJar(DecompilerDriver.java:257)
        //     at com.strobel.decompiler.DecompilerDriver.main(DecompilerDriver.java:141)
    }
    
    private void \u9af2\u4d85\u5245\uc2e8\uc9f6\u92ff(T extends \u7c6b\u7c6b\ubefe\u385b\u3c25.\ud7e8\u0800\uae87\u8d90\u183a.\u34df\u12b2\u16f6\u873d\u7af6.\u8df4\u97e6\u93a2\u760c\u6fb0\u8c8a p0, double p1, double p2, double p3, double p4, double p5, double p6) {
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
            invokevirtual:void(\u9937\u7d52\u3e75\u98a4\u8aa5\u7006::\u16f6\u8d98\u6b0d\u836c\u6b0d\u51b2, this:\u9937\u7d52\u3e75\u98a4\u8aa5\u7006, p0:T extends \u8df4\u97e6\u93a2\u760c\u6fb0\u8c8a[expected:\u8df4\u97e6\u93a2\u760c\u6fb0\u8c8a], invokevirtual:boolean(\ubff1\ud171\uceb8\u4492\u67d0\u8aa5<T>::\u4f4a\u836c\ud523\ub32d\u6d99\u9255, invokeinterface:\ubff1\ud171\uceb8\u4492\u67d0\u8aa5<?>(\u8df4\u97e6\u93a2\u760c\u6fb0\u8c8a::\u8389\u516c\u6fb0\u52d3\ubb2b\uae5d, p0:T extends \u8df4\u97e6\u93a2\u760c\u6fb0\u8c8a[expected:\u8df4\u97e6\u93a2\u760c\u6fb0\u8c8a])), p1:double, p2:double, p3:double, p4:double, p5:double, p6:double)
            return:void()
        }
        
        goto(Label_0006)
    }
    
    private \u3504\ufe34\u600f\u6b0d\u69d9.\uff55\u97b7\u6fb0\u8308\u183a\u183a \u9af2\u4d85\u5245\uc2e8\uc9f6\u92ff(\u7c6b\u7c6b\ubefe\u385b\u3c25.\ud7e8\u0800\uae87\u8d90\u183a.\u34df\u12b2\u16f6\u873d\u7af6.\u8df4\u97e6\u93a2\u760c\u6fb0\u8c8a p0, boolean p1, double p2, double p3, double p4, double p5, double p6, double p7) {
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
            return:\uff55\u97b7\u6fb0\u8308\u183a\u183a(invokespecial:\uff55\u97b7\u6fb0\u8308\u183a\u183a(\u9937\u7d52\u3e75\u98a4\u8aa5\u7006::\u9af2\u4d85\u5245\uc2e8\uc9f6\u92ff, this:\u9937\u7d52\u3e75\u98a4\u8aa5\u7006, p0:\u8df4\u97e6\u93a2\u760c\u6fb0\u8c8a, p1:boolean, ldc:boolean(0), p2:double, p3:double, p4:double, p5:double, p6:double, p7:double))
        }
        
        goto(Label_0006)
    }
    
    private \u3504\ufe34\u600f\u6b0d\u69d9.\uff55\u97b7\u6fb0\u8308\u183a\u183a \u9af2\u4d85\u5245\uc2e8\uc9f6\u92ff(\u7c6b\u7c6b\ubefe\u385b\u3c25.\ud7e8\u0800\uae87\u8d90\u183a.\u34df\u12b2\u16f6\u873d\u7af6.\u8df4\u97e6\u93a2\u760c\u6fb0\u8c8a p0, boolean p1, boolean p2, double p3, double p4, double p5, double p6, double p7, double p8) {
        var_16_62 : \u836c\u8cae\ub18d\u836c\u8753\u59ec
        var_17_82 : \u4e72\uafe7\ua068\u71ae\ub19c\u8bb0
        var_18_199 : double
        var_18_1DE : \uff55\u97b7\u6fb0\u8308\u183a\u183a
        
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
        var_16_62 = invokevirtual:\u836c\u8cae\ub18d\u836c\u8753\u59ec(\u67e9\u8413\ub113\u4bc8\u6c52\uceb8::\u6fb0\ud217\u34df\u6b5f\uc31c\ubf56, getfield:\u67e9\u8413\ub113\u4bc8\u6c52\uceb8(\u67e9\u4daf\u760c\ud217\ua6bd\ubff1::\u7af6\u6b0d\ub70c\u76bc\ucfaf\u4cd9, getfield:\u67e9\u4daf\u760c\ud217\ua6bd\ubff1(\u9937\u7d52\u3e75\u98a4\u8aa5\u7006::\u8df4\u3776\ud171\u7006\u51b2\uf995, this:\u9937\u7d52\u3e75\u98a4\u8aa5\u7006)))
        
        if (logicalor:boolean(logicalor:boolean(cmpeq:boolean(getfield:\u67e9\u4daf\u760c\ud217\ua6bd\ubff1(\u9937\u7d52\u3e75\u98a4\u8aa5\u7006::\u8df4\u3776\ud171\u7006\u51b2\uf995, this:\u9937\u7d52\u3e75\u98a4\u8aa5\u7006), aconstnull:\u67e9\u4daf\u760c\ud217\ua6bd\ubff1()), logicalnot:boolean(invokevirtual:boolean(\u836c\u8cae\ub18d\u836c\u8753\u59ec::\u5654\u6cfe\u1833\uc2e8\u7873\u59ec, var_16_62:\u836c\u8cae\ub18d\u836c\u8753\u59ec))), cmpeq:boolean(getfield:\u8df4\u3e75\u52d3\uc9f6\u62da\u9af2(\u67e9\u4daf\u760c\ud217\ua6bd\ubff1::\u4bc8\uc29a\u5245\ub70c\u183a\u12b2, getfield:\u67e9\u4daf\u760c\ud217\ua6bd\ubff1(\u9937\u7d52\u3e75\u98a4\u8aa5\u7006::\u8df4\u3776\ud171\u7006\u51b2\uf995, this:\u9937\u7d52\u3e75\u98a4\u8aa5\u7006)), aconstnull:\u8df4\u3e75\u52d3\uc9f6\u62da\u9af2()))) {
            return:\uff55\u97b7\u6fb0\u8308\u183a\u183a(aconstnull:\uff55\u97b7\u6fb0\u8308\u183a\u183a())
        }
        
        var_17_82 = invokespecial:\u4e72\uafe7\ua068\u71ae\ub19c\u8bb0(\u9937\u7d52\u3e75\u98a4\u8aa5\u7006::\ud171\u960f\ud51e\ube23\ucef1\u5140, this:\u9937\u7d52\u3e75\u98a4\u8aa5\u7006, p2:boolean)
        
        if (logicaland:boolean(cmpeq:boolean(p0:\u8df4\u97e6\u93a2\u760c\u6fb0\u8c8a, getstatic:\uc910\u8d98\u8aa5\u3d4b\u6435\u5140[expected:\u8df4\u97e6\u93a2\u760c\u6fb0\u8c8a](\u34df\u8d98\ua3b4\u873d\ud217\u4c2b::\u0b8e\ua562\u624e\u76bc\ud12e\u3e2a)), logicalnot:boolean(invokestatic:boolean(\u8308\u51fa\u6c56\u5db4\ub18d\u34df::\ubf56\u1187\uc31c\ubcb0\ua068\ub18d)))) {
            return:\uff55\u97b7\u6fb0\u8308\u183a\u183a(aconstnull:\uff55\u97b7\u6fb0\u8308\u183a\u183a())
        }
        
        if (logicaland:boolean(cmpeq:boolean(p0:\u8df4\u97e6\u93a2\u760c\u6fb0\u8c8a, getstatic:\uc910\u8d98\u8aa5\u3d4b\u6435\u5140[expected:\u8df4\u97e6\u93a2\u760c\u6fb0\u8c8a](\u34df\u8d98\ua3b4\u873d\ud217\u4c2b::\u47c2\u6198\u416d\u4c04\u64f2\u5140)), logicalnot:boolean(invokestatic:boolean(\u8308\u51fa\u6c56\u5db4\ub18d\u34df::\ubf56\u1187\uc31c\ubcb0\ua068\ub18d)))) {
            return:\uff55\u97b7\u6fb0\u8308\u183a\u183a(aconstnull:\uff55\u97b7\u6fb0\u8308\u183a\u183a())
        }
        
        if (logicaland:boolean(cmpeq:boolean(p0:\u8df4\u97e6\u93a2\u760c\u6fb0\u8c8a, getstatic:\uc910\u8d98\u8aa5\u3d4b\u6435\u5140[expected:\u8df4\u97e6\u93a2\u760c\u6fb0\u8c8a](\u34df\u8d98\ua3b4\u873d\ud217\u4c2b::\u6fb0\u2dcc\u8640\uc910\u946b\u6fb0)), logicalnot:boolean(invokestatic:boolean(\u8308\u51fa\u6c56\u5db4\ub18d\u34df::\ubf56\u1187\uc31c\ubcb0\ua068\ub18d)))) {
            return:\uff55\u97b7\u6fb0\u8308\u183a\u183a(aconstnull:\uff55\u97b7\u6fb0\u8308\u183a\u183a())
        }
        
        if (logicaland:boolean(cmpeq:boolean(p0:\u8df4\u97e6\u93a2\u760c\u6fb0\u8c8a, getstatic:\uc910\u8d98\u8aa5\u3d4b\u6435\u5140[expected:\u8df4\u97e6\u93a2\u760c\u6fb0\u8c8a](\u34df\u8d98\ua3b4\u873d\ud217\u4c2b::\u9033\u8308\u8d98\u16f6\ubb2b\u965f)), logicalnot:boolean(invokestatic:boolean(\u8308\u51fa\u6c56\u5db4\ub18d\u34df::\u5db4\u98a4\u0a06\u3d4b\ubff1\u7d52)))) {
            return:\uff55\u97b7\u6fb0\u8308\u183a\u183a(aconstnull:\uff55\u97b7\u6fb0\u8308\u183a\u183a())
        }
        
        if (logicaland:boolean(cmpeq:boolean(p0:\u8df4\u97e6\u93a2\u760c\u6fb0\u8c8a, getstatic:\uc910\u8d98\u8aa5\u3d4b\u6435\u5140[expected:\u8df4\u97e6\u93a2\u760c\u6fb0\u8c8a](\u34df\u8d98\ua3b4\u873d\ud217\u4c2b::\u8640\u61a4\u5d20\u6c52\ubcb0\u6b5f)), logicalnot:boolean(invokestatic:boolean(\u8308\u51fa\u6c56\u5db4\ub18d\u34df::\uc84e\ufcaf\u36d3\uc9f6\u183a\u5245)))) {
            return:\uff55\u97b7\u6fb0\u8308\u183a\u183a(aconstnull:\uff55\u97b7\u6fb0\u8308\u183a\u183a())
        }
        
        if (logicaland:boolean(cmpeq:boolean(p0:\u8df4\u97e6\u93a2\u760c\u6fb0\u8c8a, getstatic:\uc910\u8d98\u8aa5\u3d4b\u6435\u5140[expected:\u8df4\u97e6\u93a2\u760c\u6fb0\u8c8a](\u34df\u8d98\ua3b4\u873d\ud217\u4c2b::\u6bb9\uc31c\ud523\uceb8\u8cae\ubf56)), logicalnot:boolean(invokestatic:boolean(\u8308\u51fa\u6c56\u5db4\ub18d\u34df::\uc84e\ufcaf\u36d3\uc9f6\u183a\u5245)))) {
            return:\uff55\u97b7\u6fb0\u8308\u183a\u183a(aconstnull:\uff55\u97b7\u6fb0\u8308\u183a\u183a())
        }
        
        if (logicaland:boolean(cmpeq:boolean(p0:\u8df4\u97e6\u93a2\u760c\u6fb0\u8c8a, getstatic:\uc910\u8d98\u8aa5\u3d4b\u6435\u5140[expected:\u8df4\u97e6\u93a2\u760c\u6fb0\u8c8a](\u34df\u8d98\ua3b4\u873d\ud217\u4c2b::\u6d69\u3bc9\u9a18\u3504\u36d3\u527a)), logicalnot:boolean(invokestatic:boolean(\u8308\u51fa\u6c56\u5db4\ub18d\u34df::\uc2e8\ubf56\ube23\uc2e8\u4e72\u718f)))) {
            return:\uff55\u97b7\u6fb0\u8308\u183a\u183a(aconstnull:\uff55\u97b7\u6fb0\u8308\u183a\u183a())
        }
        
        if (logicaland:boolean(cmpeq:boolean(p0:\u8df4\u97e6\u93a2\u760c\u6fb0\u8c8a, getstatic:\uc910\u8d98\u8aa5\u3d4b\u6435\u5140[expected:\u8df4\u97e6\u93a2\u760c\u6fb0\u8c8a](\u34df\u8d98\ua3b4\u873d\ud217\u4c2b::\u7049\u760c\u7e3f\u4179\u36d3\u759a)), logicalnot:boolean(invokestatic:boolean(\u8308\u51fa\u6c56\u5db4\ub18d\u34df::\uc2e8\ubf56\ube23\uc2e8\u4e72\u718f)))) {
            return:\uff55\u97b7\u6fb0\u8308\u183a\u183a(aconstnull:\uff55\u97b7\u6fb0\u8308\u183a\u183a())
        }
        
        if (logicaland:boolean(cmpeq:boolean(p0:\u8df4\u97e6\u93a2\u760c\u6fb0\u8c8a, getstatic:\uc910\u8d98\u8aa5\u3d4b\u6435\u5140[expected:\u8df4\u97e6\u93a2\u760c\u6fb0\u8c8a](\u34df\u8d98\ua3b4\u873d\ud217\u4c2b::\u99f7\ua61f\u2dcc\u4daf\u983f\u52d3)), logicalnot:boolean(invokestatic:boolean(\u8308\u51fa\u6c56\u5db4\ub18d\u34df::\uc2e8\ubf56\ube23\uc2e8\u4e72\u718f)))) {
            return:\uff55\u97b7\u6fb0\u8308\u183a\u183a(aconstnull:\uff55\u97b7\u6fb0\u8308\u183a\u183a())
        }
        
        if (logicaland:boolean(cmpeq:boolean(p0:\u8df4\u97e6\u93a2\u760c\u6fb0\u8c8a, getstatic:\uc910\u8d98\u8aa5\u3d4b\u6435\u5140[expected:\u8df4\u97e6\u93a2\u760c\u6fb0\u8c8a](\u34df\u8d98\ua3b4\u873d\ud217\u4c2b::\u4492\u9a18\ub7dc\uc2bd\u4bc8\uc246)), logicalnot:boolean(invokestatic:boolean(\u8308\u51fa\u6c56\u5db4\ub18d\u34df::\uc2e8\ubf56\ube23\uc2e8\u4e72\u718f)))) {
            return:\uff55\u97b7\u6fb0\u8308\u183a\u183a(aconstnull:\uff55\u97b7\u6fb0\u8308\u183a\u183a())
        }
        
        if (logicaland:boolean(cmpeq:boolean(p0:\u8df4\u97e6\u93a2\u760c\u6fb0\u8c8a, getstatic:\uc910\u8d98\u8aa5\u3d4b\u6435\u5140[expected:\u8df4\u97e6\u93a2\u760c\u6fb0\u8c8a](\u34df\u8d98\ua3b4\u873d\ud217\u4c2b::\ub18d\ub1b9\u12cb\u67e9\u3bc9\ua61f)), logicalnot:boolean(invokestatic:boolean(\u8308\u51fa\u6c56\u5db4\ub18d\u34df::\uc2e8\ubf56\ube23\uc2e8\u4e72\u718f)))) {
            return:\uff55\u97b7\u6fb0\u8308\u183a\u183a(aconstnull:\uff55\u97b7\u6fb0\u8308\u183a\u183a())
        }
        
        if (logicaland:boolean(cmpeq:boolean(p0:\u8df4\u97e6\u93a2\u760c\u6fb0\u8c8a, getstatic:\uc910\u8d98\u8aa5\u3d4b\u6435\u5140[expected:\u8df4\u97e6\u93a2\u760c\u6fb0\u8c8a](\u34df\u8d98\ua3b4\u873d\ud217\u4c2b::\u5d20\u67d0\u97b7\u4cd9\u3e2a\ud217)), logicalnot:boolean(invokestatic:boolean(\u8308\u51fa\u6c56\u5db4\ub18d\u34df::\u071d\u6bb9\u946b\ud523\uc238\u647c)))) {
            return:\uff55\u97b7\u6fb0\u8308\u183a\u183a(aconstnull:\uff55\u97b7\u6fb0\u8308\u183a\u183a())
        }
        
        if (logicaland:boolean(cmpeq:boolean(p0:\u8df4\u97e6\u93a2\u760c\u6fb0\u8c8a, getstatic:\uc910\u8d98\u8aa5\u3d4b\u6435\u5140[expected:\u8df4\u97e6\u93a2\u760c\u6fb0\u8c8a](\u34df\u8d98\ua3b4\u873d\ud217\u4c2b::\u6d69\u3504\u40a9\u5fe1\ub32d\uc246)), logicalnot:boolean(invokestatic:boolean(\u8308\u51fa\u6c56\u5db4\ub18d\u34df::\uceb8\u6b0d\u3a62\u9af2\u7006\u8bb0)))) {
            return:\uff55\u97b7\u6fb0\u8308\u183a\u183a(aconstnull:\uff55\u97b7\u6fb0\u8308\u183a\u183a())
        }
        
        if (logicaland:boolean(cmpeq:boolean(p0:\u8df4\u97e6\u93a2\u760c\u6fb0\u8c8a, getstatic:\uc910\u8d98\u8aa5\u3d4b\u6435\u5140[expected:\u8df4\u97e6\u93a2\u760c\u6fb0\u8c8a](\u34df\u8d98\ua3b4\u873d\ud217\u4c2b::\u4c2b\ub83f\ud158\u624e\u5d20\u6bb9)), logicalnot:boolean(invokestatic:boolean(\u8308\u51fa\u6c56\u5db4\ub18d\u34df::\uceb8\u6b0d\u3a62\u9af2\u7006\u8bb0)))) {
            return:\uff55\u97b7\u6fb0\u8308\u183a\u183a(aconstnull:\uff55\u97b7\u6fb0\u8308\u183a\u183a())
        }
        
        if (logicaland:boolean(cmpeq:boolean(p0:\u8df4\u97e6\u93a2\u760c\u6fb0\u8c8a[expected:Object], getstatic:\ubff1\ud171\uceb8\u4492\u67d0\u8aa5<\u8350\u4f52\u62da\ub19c\ubf56\u12cb>[expected:Object](\u34df\u8d98\ua3b4\u873d\ud217\u4c2b::\u5bc4\u5d20\u0a06\u5245\u97b7\u8413)), logicalnot:boolean(invokestatic:boolean(\u8308\u51fa\u6c56\u5db4\ub18d\u34df::\u927d\u3504\u8753\ubff1\ua61f\ua3b4)))) {
            return:\uff55\u97b7\u6fb0\u8308\u183a\u183a(aconstnull:\uff55\u97b7\u6fb0\u8308\u183a\u183a())
        }
        
        if (logicaland:boolean(cmpeq:boolean(p0:\u8df4\u97e6\u93a2\u760c\u6fb0\u8c8a, getstatic:\uc910\u8d98\u8aa5\u3d4b\u6435\u5140[expected:\u8df4\u97e6\u93a2\u760c\u6fb0\u8c8a](\u34df\u8d98\ua3b4\u873d\ud217\u4c2b::\ub32d\u3776\ud7e8\u4d85\u52d3\u56bd)), logicalnot:boolean(invokestatic:boolean(\u8308\u51fa\u6c56\u5db4\ub18d\u34df::\uc229\ub8be\u92ee\uae87\uf94d\uff55)))) {
            return:\uff55\u97b7\u6fb0\u8308\u183a\u183a(aconstnull:\uff55\u97b7\u6fb0\u8308\u183a\u183a())
        }
        
        if (logicaland:boolean(cmpeq:boolean(p0:\u8df4\u97e6\u93a2\u760c\u6fb0\u8c8a, getstatic:\uc910\u8d98\u8aa5\u3d4b\u6435\u5140[expected:\u8df4\u97e6\u93a2\u760c\u6fb0\u8c8a](\u34df\u8d98\ua3b4\u873d\ud217\u4c2b::\u12cb\ucfaf\u7c6b\u74b1\u6ec6\u4e72)), logicalnot:boolean(invokestatic:boolean(\u8308\u51fa\u6c56\u5db4\ub18d\u34df::\uc229\ub8be\u92ee\uae87\uf94d\uff55)))) {
            return:\uff55\u97b7\u6fb0\u8308\u183a\u183a(aconstnull:\uff55\u97b7\u6fb0\u8308\u183a\u183a())
        }
        
        if (logicaland:boolean(cmpeq:boolean(p0:\u8df4\u97e6\u93a2\u760c\u6fb0\u8c8a, getstatic:\uc910\u8d98\u8aa5\u3d4b\u6435\u5140[expected:\u8df4\u97e6\u93a2\u760c\u6fb0\u8c8a](\u34df\u8d98\ua3b4\u873d\ud217\u4c2b::\u8c8a\u8aa5\u34df\u36d3\u3504\u4492)), logicalnot:boolean(invokestatic:boolean(\u8308\u51fa\u6c56\u5db4\ub18d\u34df::\u6cfe\uc2bd\u3776\ub7dc\u8df4\uc9f6)))) {
            return:\uff55\u97b7\u6fb0\u8308\u183a\u183a(aconstnull:\uff55\u97b7\u6fb0\u8308\u183a\u183a())
        }
        
        if (logicalnot:boolean(p1:boolean)) {
            var_18_199 = ldc:double(1024.0)
            
            if (cmpeq:boolean(p0:\u8df4\u97e6\u93a2\u760c\u6fb0\u8c8a, getstatic:\uc910\u8d98\u8aa5\u3d4b\u6435\u5140[expected:\u8df4\u97e6\u93a2\u760c\u6fb0\u8c8a](\u34df\u8d98\ua3b4\u873d\ud217\u4c2b::\ud158\u97b7\u8df4\u61a4\u4c2b\u56bd))) {
                var_18_199 = ldc:double(38416.0)
            }
            
            if (cmpgt:boolean(invokevirtual:double(\u3a62\u5d20\u4f52\uc229\u8308\ud7e8::\uc87f\uc2e8\u7af6\u64ab\u718f\u6435, invokevirtual:\u3a62\u5d20\u4f52\uc229\u8308\ud7e8(\u836c\u8cae\ub18d\u836c\u8753\u59ec::\u8308\ub171\u6b5f\u16f6\u4cd9\ua562, var_16_62:\u836c\u8cae\ub18d\u836c\u8753\u59ec), p3:double, p4:double, p5:double), var_18_199:double)) {
                return:\uff55\u97b7\u6fb0\u8308\u183a\u183a(aconstnull:\uff55\u97b7\u6fb0\u8308\u183a\u183a())
            }
            
            if (cmpeq:boolean(var_17_82:\u4e72\uafe7\ua068\u71ae\ub19c\u8bb0, getstatic:\u4e72\uafe7\ua068\u71ae\ub19c\u8bb0(\u4e72\uafe7\ua068\u71ae\ub19c\u8bb0::\u6bb9\u4daf\u88c5\ub1b9\u92ff\u6bb9))) {
                return:\uff55\u97b7\u6fb0\u8308\u183a\u183a(aconstnull:\uff55\u97b7\u6fb0\u8308\u183a\u183a())
            }
        }
        
        var_18_1DE = invokevirtual:\uff55\u97b7\u6fb0\u8308\u183a\u183a(\u8df4\u3e75\u52d3\uc9f6\u62da\u9af2::\uc2bd\ud217\u6198\u6d69\ub171\u760c, getfield:\u8df4\u3e75\u52d3\uc9f6\u62da\u9af2(\u67e9\u4daf\u760c\ud217\ua6bd\ubff1::\u4bc8\uc29a\u5245\ub70c\u183a\u12b2, getfield:\u67e9\u4daf\u760c\ud217\ua6bd\ubff1(\u9937\u7d52\u3e75\u98a4\u8aa5\u7006::\u8df4\u3776\ud171\u7006\u51b2\uf995, this:\u9937\u7d52\u3e75\u98a4\u8aa5\u7006)), p0:\u8df4\u97e6\u93a2\u760c\u6fb0\u8c8a, p3:double, p4:double, p5:double, p6:double, p7:double, p8:double)
        
        if (cmpeq:boolean(p0:\u8df4\u97e6\u93a2\u760c\u6fb0\u8c8a, getstatic:\uc910\u8d98\u8aa5\u3d4b\u6435\u5140[expected:\u8df4\u97e6\u93a2\u760c\u6fb0\u8c8a](\u34df\u8d98\ua3b4\u873d\ud217\u4c2b::\u4daf\u3dd3\u516c\u839e\u5654\u392e))) {
            invokestatic:void(\u6d69\u92ff\u983f\u873d\u8258\u40a9::\u446c\ub18d\ub7dc\u836c\ud12e\ua562, var_18_1DE:\uff55\u97b7\u6fb0\u8308\u183a\u183a, getfield:\u16f6\u61a4\u5db4\u4c04\u64ab\u9255[expected:\u8bb0\u759a\u3bc9\u527a\ube23\u5140](\u9937\u7d52\u3e75\u98a4\u8aa5\u7006::\ud51e\u9033\u8df4\u7043\u5f50\u8aa5, this:\u9937\u7d52\u3e75\u98a4\u8aa5\u7006), p3:double, p4:double, p5:double, getfield:\u47c2\u74b1\u647c\u446c\u4d85\ub32d(\u9937\u7d52\u3e75\u98a4\u8aa5\u7006::\u839e\u9a18\u4492\ubff1\uf94d\u69d9, this:\u9937\u7d52\u3e75\u98a4\u8aa5\u7006))
        }
        
        if (cmpeq:boolean(p0:\u8df4\u97e6\u93a2\u760c\u6fb0\u8c8a, getstatic:\uc910\u8d98\u8aa5\u3d4b\u6435\u5140[expected:\u8df4\u97e6\u93a2\u760c\u6fb0\u8c8a](\u34df\u8d98\ua3b4\u873d\ud217\u4c2b::\uc229\u1833\u5bc4\ub8be\ua562\u71ae))) {
            invokestatic:void(\u6d69\u92ff\u983f\u873d\u8258\u40a9::\u446c\ub18d\ub7dc\u836c\ud12e\ua562, var_18_1DE:\uff55\u97b7\u6fb0\u8308\u183a\u183a, getfield:\u16f6\u61a4\u5db4\u4c04\u64ab\u9255[expected:\u8bb0\u759a\u3bc9\u527a\ube23\u5140](\u9937\u7d52\u3e75\u98a4\u8aa5\u7006::\ud51e\u9033\u8df4\u7043\u5f50\u8aa5, this:\u9937\u7d52\u3e75\u98a4\u8aa5\u7006), p3:double, p4:double, p5:double, getfield:\u47c2\u74b1\u647c\u446c\u4d85\ub32d(\u9937\u7d52\u3e75\u98a4\u8aa5\u7006::\u839e\u9a18\u4492\ubff1\uf94d\u69d9, this:\u9937\u7d52\u3e75\u98a4\u8aa5\u7006))
        }
        
        if (cmpeq:boolean(p0:\u8df4\u97e6\u93a2\u760c\u6fb0\u8c8a, getstatic:\uc910\u8d98\u8aa5\u3d4b\u6435\u5140[expected:\u8df4\u97e6\u93a2\u760c\u6fb0\u8c8a](\u34df\u8d98\ua3b4\u873d\ud217\u4c2b::\u7e3f\u927d\uc7fe\u3bd6\ub32d\u51b2))) {
            invokestatic:void(\u6d69\u92ff\u983f\u873d\u8258\u40a9::\u446c\ub18d\ub7dc\u836c\ud12e\ua562, var_18_1DE:\uff55\u97b7\u6fb0\u8308\u183a\u183a, getfield:\u16f6\u61a4\u5db4\u4c04\u64ab\u9255[expected:\u8bb0\u759a\u3bc9\u527a\ube23\u5140](\u9937\u7d52\u3e75\u98a4\u8aa5\u7006::\ud51e\u9033\u8df4\u7043\u5f50\u8aa5, this:\u9937\u7d52\u3e75\u98a4\u8aa5\u7006), p3:double, p4:double, p5:double, getfield:\u47c2\u74b1\u647c\u446c\u4d85\ub32d(\u9937\u7d52\u3e75\u98a4\u8aa5\u7006::\u839e\u9a18\u4492\ubff1\uf94d\u69d9, this:\u9937\u7d52\u3e75\u98a4\u8aa5\u7006))
        }
        
        if (cmpeq:boolean(p0:\u8df4\u97e6\u93a2\u760c\u6fb0\u8c8a, getstatic:\uc910\u8d98\u8aa5\u3d4b\u6435\u5140[expected:\u8df4\u97e6\u93a2\u760c\u6fb0\u8c8a](\u34df\u8d98\ua3b4\u873d\ud217\u4c2b::\ucef1\u6c52\u61a4\u4f4a\ub6ab\u6b5f))) {
            invokestatic:void(\u6d69\u92ff\u983f\u873d\u8258\u40a9::\u4975\uae5d\uf995\u5f50\u6d69\ud12e, var_18_1DE:\uff55\u97b7\u6fb0\u8308\u183a\u183a)
        }
        
        if (cmpeq:boolean(p0:\u8df4\u97e6\u93a2\u760c\u6fb0\u8c8a, getstatic:\uc910\u8d98\u8aa5\u3d4b\u6435\u5140[expected:\u8df4\u97e6\u93a2\u760c\u6fb0\u8c8a](\u34df\u8d98\ua3b4\u873d\ud217\u4c2b::\u5d20\u67d0\u97b7\u4cd9\u3e2a\ud217))) {
            invokestatic:void(\u6d69\u92ff\u983f\u873d\u8258\u40a9::\u759a\u16f6\uff55\u494c\u8aa5\u392e, var_18_1DE:\uff55\u97b7\u6fb0\u8308\u183a\u183a)
        }
        
        if (cmpeq:boolean(p0:\u8df4\u97e6\u93a2\u760c\u6fb0\u8c8a[expected:Object], getstatic:\ubff1\ud171\uceb8\u4492\u67d0\u8aa5<\u8350\u4f52\u62da\ub19c\ubf56\u12cb>[expected:Object](\u34df\u8d98\ua3b4\u873d\ud217\u4c2b::\u5bc4\u5d20\u0a06\u5245\u97b7\u8413))) {
            invokestatic:void(\u6d69\u92ff\u983f\u873d\u8258\u40a9::\u5d20\uae5d\ub18d\ub6ab\u8389\ubded, var_18_1DE:\uff55\u97b7\u6fb0\u8308\u183a\u183a, getfield:\u16f6\u61a4\u5db4\u4c04\u64ab\u9255[expected:\u8bb0\u759a\u3bc9\u527a\ube23\u5140](\u9937\u7d52\u3e75\u98a4\u8aa5\u7006::\ud51e\u9033\u8df4\u7043\u5f50\u8aa5, this:\u9937\u7d52\u3e75\u98a4\u8aa5\u7006), p3:double, p4:double, p5:double)
        }
        
        return:\uff55\u97b7\u6fb0\u8308\u183a\u183a(var_18_1DE:\uff55\u97b7\u6fb0\u8308\u183a\u183a)
    }
    
    private \u7c6b\u7c6b\ubefe\u385b\u3c25.\ud7e8\u0800\uae87\u8d90\u183a.\u34df\u12b2\u16f6\u873d\u7af6.\u4e72\uafe7\ua068\u71ae\ub19c\u8bb0 \ud171\u960f\ud51e\ube23\ucef1\u5140(boolean p0) {
        var_2_99 : \u4e72\uafe7\ua068\u71ae\ub19c\u8bb0
        
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
            var_2_99 = getfield:\u4e72\uafe7\ua068\u71ae\ub19c\u8bb0(\u4daf\u8df4\ubb2b\u759a\u7330\u4ab3::\u4f52\u64f2\ud12e\ud158\ua6bd\ucb79, getfield:\u4daf\u8df4\ubb2b\u759a\u7330\u4ab3(\u67e9\u4daf\u760c\ud217\ua6bd\ubff1::\uc84e\u4c04\ubcb0\u0c95\ub8be\u5fe1, getfield:\u67e9\u4daf\u760c\ud217\ua6bd\ubff1(\u9937\u7d52\u3e75\u98a4\u8aa5\u7006::\u8df4\u3776\ud171\u7006\u51b2\uf995, this:\u9937\u7d52\u3e75\u98a4\u8aa5\u7006)))
            
            if (logicaland:boolean(logicaland:boolean(p0:boolean, cmpeq:boolean(var_2_99:\u4e72\uafe7\ua068\u71ae\ub19c\u8bb0, getstatic:\u4e72\uafe7\ua068\u71ae\ub19c\u8bb0(\u4e72\uafe7\ua068\u71ae\ub19c\u8bb0::\u6bb9\u4daf\u88c5\ub1b9\u92ff\u6bb9))), cmpeq:boolean(invokevirtual:int(Random::nextInt, getfield:Random(\u16f6\u61a4\u5db4\u4c04\u64ab\u9255::\u3776\ub113\u8c8a\u8709\ub18d\uc2bd, getfield:\u16f6\u61a4\u5db4\u4c04\u64ab\u9255(\u9937\u7d52\u3e75\u98a4\u8aa5\u7006::\ud51e\u9033\u8df4\u7043\u5f50\u8aa5, this:\u9937\u7d52\u3e75\u98a4\u8aa5\u7006)), ldc:int(10)), ldc:int(0)))) {
                var_2_99 = getstatic:\u4e72\uafe7\ua068\u71ae\ub19c\u8bb0(\u4e72\uafe7\ua068\u71ae\ub19c\u8bb0::\uc229\u4c04\u9255\u385b\u624e\u4975)
            }
            
            if (logicaland:boolean(cmpeq:boolean(var_2_99:\u4e72\uafe7\ua068\u71ae\ub19c\u8bb0, getstatic:\u4e72\uafe7\ua068\u71ae\ub19c\u8bb0(\u4e72\uafe7\ua068\u71ae\ub19c\u8bb0::\uc229\u4c04\u9255\u385b\u624e\u4975)), cmpeq:boolean(invokevirtual:int(Random::nextInt, getfield:Random(\u16f6\u61a4\u5db4\u4c04\u64ab\u9255::\u3776\ub113\u8c8a\u8709\ub18d\uc2bd, getfield:\u16f6\u61a4\u5db4\u4c04\u64ab\u9255(\u9937\u7d52\u3e75\u98a4\u8aa5\u7006::\ud51e\u9033\u8df4\u7043\u5f50\u8aa5, this:\u9937\u7d52\u3e75\u98a4\u8aa5\u7006)), ldc:int(3)), ldc:int(0)))) {
                var_2_99 = getstatic:\u4e72\uafe7\ua068\u71ae\ub19c\u8bb0(\u4e72\uafe7\ua068\u71ae\ub19c\u8bb0::\u6bb9\u4daf\u88c5\ub1b9\u92ff\u6bb9)
            }
            
            return:\u4e72\uafe7\ua068\u71ae\ub19c\u8bb0(var_2_99:\u4e72\uafe7\ua068\u71ae\ub19c\u8bb0)
        }
        
        goto(Label_0006)
    }
    
    public void \uc87f\uc229\u6bb9\u71ae\u3d64\u5245() {
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
    
    public void \u120d\u965f\ud171\u3a62\u1833\u71f1(int p0, \u71f1\uc910\u3bc9\u516c\u93a2.\u6b0d\ud171\uc7fe\u52d3\uafe7\u6c56 p1, int p2) {
        var_4_86 : \u836c\u8cae\ub18d\u836c\u8753\u59ec
        var_5_9E : double
        var_7_AE : double
        var_9_BE : double
        var_11_D4 : double
        var_13_DE : double
        var_15_E8 : double
        var_17_F2 : double
        
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
            
            switch (p0:int) {
                case 1023:
                case 1028:
                case 1038:
                    var_4_86 = invokevirtual:\u836c\u8cae\ub18d\u836c\u8753\u59ec(\u67e9\u8413\ub113\u4bc8\u6c52\uceb8::\u6fb0\ud217\u34df\u6b5f\uc31c\ubf56, getfield:\u67e9\u8413\ub113\u4bc8\u6c52\uceb8(\u67e9\u4daf\u760c\ud217\ua6bd\ubff1::\u7af6\u6b0d\ub70c\u76bc\ucfaf\u4cd9, getfield:\u67e9\u4daf\u760c\ud217\ua6bd\ubff1(\u9937\u7d52\u3e75\u98a4\u8aa5\u7006::\u8df4\u3776\ud171\u7006\u51b2\uf995, this:\u9937\u7d52\u3e75\u98a4\u8aa5\u7006)))
                    
                    if (logicalnot:boolean(invokevirtual:boolean(\u836c\u8cae\ub18d\u836c\u8753\u59ec::\u5654\u6cfe\u1833\uc2e8\u7873\u59ec, var_4_86:\u836c\u8cae\ub18d\u836c\u8753\u59ec))) {
                        looporswitchbreak()
                    }
                    
                    var_5_9E = sub:double(i2d:double(invokevirtual:int(\u3a62\uc9f6\u3776\u4f52\ua068\u34df::\u8aa5\u97b7\u4daf\u72f1\u600f\u8cae, p1:\u6b0d\ud171\uc7fe\u52d3\uafe7\u6c56[expected:\u3a62\uc9f6\u3776\u4f52\ua068\u34df])), getfield:double(\u3a62\u5d20\u4f52\uc229\u8308\ud7e8::\ubf56\u4c04\u4492\u36d3\u71f1\u12cb, invokevirtual:\u3a62\u5d20\u4f52\uc229\u8308\ud7e8(\u836c\u8cae\ub18d\u836c\u8753\u59ec::\u8308\ub171\u6b5f\u16f6\u4cd9\ua562, var_4_86:\u836c\u8cae\ub18d\u836c\u8753\u59ec)))
                    var_7_AE = sub:double(i2d:double(invokevirtual:int(\u3a62\uc9f6\u3776\u4f52\ua068\u34df::\u9af2\u8350\u8350\u93a2\u494c\u624e, p1:\u6b0d\ud171\uc7fe\u52d3\uafe7\u6c56[expected:\u3a62\uc9f6\u3776\u4f52\ua068\u34df])), getfield:double(\u3a62\u5d20\u4f52\uc229\u8308\ud7e8::\u6bb9\uc29a\u99f7\u7e3f\u6b5f\u156b, invokevirtual:\u3a62\u5d20\u4f52\uc229\u8308\ud7e8(\u836c\u8cae\ub18d\u836c\u8753\u59ec::\u8308\ub171\u6b5f\u16f6\u4cd9\ua562, var_4_86:\u836c\u8cae\ub18d\u836c\u8753\u59ec)))
                    var_9_BE = sub:double(i2d:double(invokevirtual:int(\u3a62\uc9f6\u3776\u4f52\ua068\u34df::\u3e75\uc29a\u071d\u4d85\ubded\ub70c, p1:\u6b0d\ud171\uc7fe\u52d3\uafe7\u6c56[expected:\u3a62\uc9f6\u3776\u4f52\ua068\u34df])), getfield:double(\u3a62\u5d20\u4f52\uc229\u8308\ud7e8::\ub7dc\ubff1\ub19c\u6198\uc2e8\ufe34, invokevirtual:\u3a62\u5d20\u4f52\uc229\u8308\ud7e8(\u836c\u8cae\ub18d\u836c\u8753\u59ec::\u8308\ub171\u6b5f\u16f6\u4cd9\ua562, var_4_86:\u836c\u8cae\ub18d\u836c\u8753\u59ec)))
                    var_11_D4 = invokestatic:double(Math::sqrt, add:double(add:double(mul:double(var_5_9E:double, var_5_9E:double), mul:double(var_7_AE:double, var_7_AE:double)), mul:double(var_9_BE:double, var_9_BE:double)))
                    var_13_DE = getfield:double(\u3a62\u5d20\u4f52\uc229\u8308\ud7e8::\ubf56\u4c04\u4492\u36d3\u71f1\u12cb, invokevirtual:\u3a62\u5d20\u4f52\uc229\u8308\ud7e8(\u836c\u8cae\ub18d\u836c\u8753\u59ec::\u8308\ub171\u6b5f\u16f6\u4cd9\ua562, var_4_86:\u836c\u8cae\ub18d\u836c\u8753\u59ec))
                    var_15_E8 = getfield:double(\u3a62\u5d20\u4f52\uc229\u8308\ud7e8::\u6bb9\uc29a\u99f7\u7e3f\u6b5f\u156b, invokevirtual:\u3a62\u5d20\u4f52\uc229\u8308\ud7e8(\u836c\u8cae\ub18d\u836c\u8753\u59ec::\u8308\ub171\u6b5f\u16f6\u4cd9\ua562, var_4_86:\u836c\u8cae\ub18d\u836c\u8753\u59ec))
                    var_17_F2 = getfield:double(\u3a62\u5d20\u4f52\uc229\u8308\ud7e8::\ub7dc\ubff1\ub19c\u6198\uc2e8\ufe34, invokevirtual:\u3a62\u5d20\u4f52\uc229\u8308\ud7e8(\u836c\u8cae\ub18d\u836c\u8753\u59ec::\u8308\ub171\u6b5f\u16f6\u4cd9\ua562, var_4_86:\u836c\u8cae\ub18d\u836c\u8753\u59ec))
                    
                    if (cmpgt:boolean(var_11_D4:double, ldc:double(0.0))) {
                        var_13_DE = add:double(var_13_DE:double, mul:double(div:double(var_5_9E:double, var_11_D4:double), ldc:double(2.0)))
                        var_15_E8 = add:double(var_15_E8:double, mul:double(div:double(var_7_AE:double, var_11_D4:double), ldc:double(2.0)))
                        var_17_F2 = add:double(var_17_F2:double, mul:double(div:double(var_9_BE:double, var_11_D4:double), ldc:double(2.0)))
                    }
                    
                    if (cmpeq:boolean(p0:int, ldc:int(1023))) {
                        invokevirtual:void(\u16f6\u61a4\u5db4\u4c04\u64ab\u9255::\u34df\u0c95\u8c8a\u3d64\ufcaf\ud36e, getfield:\u16f6\u61a4\u5db4\u4c04\u64ab\u9255(\u9937\u7d52\u3e75\u98a4\u8aa5\u7006::\ud51e\u9033\u8df4\u7043\u5f50\u8aa5, this:\u9937\u7d52\u3e75\u98a4\u8aa5\u7006), var_13_DE:double, var_15_E8:double, var_17_F2:double, getstatic:\u6b0d\u3d64\u446c\u6cfe\u5f50\u9937(\ua068\uf995\u3711\u4bc8\u8c8a\u0c95::\ub70c\u8df4\u839e\u8640\u97e6\uae87), getstatic:\u88c5\ub83f\uc246\u8c8a\u960f\ud7e8(\u88c5\ub83f\uc246\u8c8a\u960f\ud7e8::\u3711\u2dcc\u8350\uc229\u9a18\u7873), ldc:float(1.0f), ldc:float(1.0f), ldc:boolean(0))
                        looporswitchbreak()
                    }
                    
                    if (cmpeq:boolean(p0:int, ldc:int(1038))) {
                        invokevirtual:void(\u16f6\u61a4\u5db4\u4c04\u64ab\u9255::\u34df\u0c95\u8c8a\u3d64\ufcaf\ud36e, getfield:\u16f6\u61a4\u5db4\u4c04\u64ab\u9255(\u9937\u7d52\u3e75\u98a4\u8aa5\u7006::\ud51e\u9033\u8df4\u7043\u5f50\u8aa5, this:\u9937\u7d52\u3e75\u98a4\u8aa5\u7006), var_13_DE:double, var_15_E8:double, var_17_F2:double, getstatic:\u6b0d\u3d64\u446c\u6cfe\u5f50\u9937(\ua068\uf995\u3711\u4bc8\u8c8a\u0c95::\u927d\u5db4\u2dcc\u7bad\ua3b4\u93a2), getstatic:\u88c5\ub83f\uc246\u8c8a\u960f\ud7e8(\u88c5\ub83f\uc246\u8c8a\u960f\ud7e8::\u3711\u2dcc\u8350\uc229\u9a18\u7873), ldc:float(1.0f), ldc:float(1.0f), ldc:boolean(0))
                        looporswitchbreak()
                    }
                    
                    invokevirtual:void(\u16f6\u61a4\u5db4\u4c04\u64ab\u9255::\u34df\u0c95\u8c8a\u3d64\ufcaf\ud36e, getfield:\u16f6\u61a4\u5db4\u4c04\u64ab\u9255(\u9937\u7d52\u3e75\u98a4\u8aa5\u7006::\ud51e\u9033\u8df4\u7043\u5f50\u8aa5, this:\u9937\u7d52\u3e75\u98a4\u8aa5\u7006), var_13_DE:double, var_15_E8:double, var_17_F2:double, getstatic:\u6b0d\u3d64\u446c\u6cfe\u5f50\u9937(\ua068\uf995\u3711\u4bc8\u8c8a\u0c95::\u99f7\u7d52\ua61f\ua3b4\ub8be\u6435), getstatic:\u88c5\ub83f\uc246\u8c8a\u960f\ud7e8(\u88c5\ub83f\uc246\u8c8a\u960f\ud7e8::\u3711\u2dcc\u8350\uc229\u9a18\u7873), ldc:float(5.0f), ldc:float(1.0f), ldc:boolean(0))
                    looporswitchbreak()
            }
            
            return:void()
        }
        
        goto(Label_0006)
    }
    
    public void \ub83f\u5140\uf94d\u16f6\ubefe\uf9c5(\u7c6b\u7c6b\ubefe\u385b\u3c25.\ud7e8\u0800\uae87\u8d90\u183a.\u7c6b\ubded\u0b8e\u2dcc\u8c8a.\ud12e\u16f6\u8d98\u4c04\u16f6.\ua3b4\u8aa5\ub113\ubf56\u873d p0, int p1, \u71f1\uc910\u3bc9\u516c\u93a2.\u6b0d\ud171\uc7fe\u52d3\uafe7\u6c56 p2, int p3) {
        var_5_5F : Random
        var_6_7F5 : int
        var_6_859 : int
        var_6_8CE : int
        var_6_935 : \u760c\u4975\u4179\uc246\u8640\u64f2
        var_7_93C : int
        var_8_943 : int
        var_9_94A : int
        var_10_95D : double
        var_12_970 : double
        var_14_983 : double
        var_16_986 : int
        var_17_99C : double
        var_16_A4F : \u8413\u7e3f\uc910\uf94d\u5654\u6b0d
        var_17_A63 : \u74b1\u8bb0\ub32d\u8709\uc4d2\uc246
        var_17_AC5 : \u3a62\u5d20\u4f52\uc229\u8308\ud7e8
        var_18_AC8 : int
        var_18_B27 : float
        var_19_B37 : float
        var_20_B46 : float
        var_21_B58 : \uc910\u8d98\u8aa5\u3d4b\u6435\u5140
        var_22_B5B : int
        var_23_B6D : double
        var_25_B7C : double
        var_27_B86 : double
        var_29_B95 : double
        var_31_B9F : double
        var_33_BD8 : \uff55\u97b7\u6fb0\u8308\u183a\u183a
        var_34_BEC : float
        var_22_C3A : double
        var_24_C41 : double
        var_26_C4C : double
        var_28_C4F : int
        var_28_C98 : double
        var_28_D22 : int
        var_29_D42 : double
        var_31_D5B : double
        var_33_D74 : double
        var_28_DB3 : int
        var_29_DC6 : float
        var_30_DD1 : float
        var_31_DDC : double
        var_33_DEB : double
        var_35_DF6 : double
        var_37_E27 : \uff55\u97b7\u6fb0\u8308\u183a\u183a
        var_28_E8E : int
        
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
            var_5_5F = getfield:Random(\u16f6\u61a4\u5db4\u4c04\u64ab\u9255::\u3776\ub113\u8c8a\u8709\ub18d\uc2bd, getfield:\u16f6\u61a4\u5db4\u4c04\u64ab\u9255(\u9937\u7d52\u3e75\u98a4\u8aa5\u7006::\ud51e\u9033\u8df4\u7043\u5f50\u8aa5, this:\u9937\u7d52\u3e75\u98a4\u8aa5\u7006))
            
            switch (p1:int) {
                case 1000:
                    invokevirtual:void(\u16f6\u61a4\u5db4\u4c04\u64ab\u9255::\u34df\u0c95\u8c8a\u3d64\ufcaf\ud36e, getfield:\u16f6\u61a4\u5db4\u4c04\u64ab\u9255(\u9937\u7d52\u3e75\u98a4\u8aa5\u7006::\ud51e\u9033\u8df4\u7043\u5f50\u8aa5, this:\u9937\u7d52\u3e75\u98a4\u8aa5\u7006), p2:\u6b0d\ud171\uc7fe\u52d3\uafe7\u6c56, getstatic:\u6b0d\u3d64\u446c\u6cfe\u5f50\u9937(\ua068\uf995\u3711\u4bc8\u8c8a\u0c95::\u7049\u759a\ud12e\u0800\u5d20\u6198), getstatic:\u88c5\ub83f\uc246\u8c8a\u960f\ud7e8(\u88c5\ub83f\uc246\u8c8a\u960f\ud7e8::\uae5d\u6b0d\uf9c5\u5245\ub8be\u156b), ldc:float(1.0f), ldc:float(1.0f), ldc:boolean(0))
                    looporswitchbreak()
                
                case 1001:
                    invokevirtual:void(\u16f6\u61a4\u5db4\u4c04\u64ab\u9255::\u34df\u0c95\u8c8a\u3d64\ufcaf\ud36e, getfield:\u16f6\u61a4\u5db4\u4c04\u64ab\u9255(\u9937\u7d52\u3e75\u98a4\u8aa5\u7006::\ud51e\u9033\u8df4\u7043\u5f50\u8aa5, this:\u9937\u7d52\u3e75\u98a4\u8aa5\u7006), p2:\u6b0d\ud171\uc7fe\u52d3\uafe7\u6c56, getstatic:\u6b0d\u3d64\u446c\u6cfe\u5f50\u9937(\ua068\uf995\u3711\u4bc8\u8c8a\u0c95::\u624e\u6cfe\u927d\u6fb0\u759a\ub83f), getstatic:\u88c5\ub83f\uc246\u8c8a\u960f\ud7e8(\u88c5\ub83f\uc246\u8c8a\u960f\ud7e8::\uae5d\u6b0d\uf9c5\u5245\ub8be\u156b), ldc:float(1.0f), ldc:float(1.2f), ldc:boolean(0))
                    looporswitchbreak()
                
                case 1002:
                    invokevirtual:void(\u16f6\u61a4\u5db4\u4c04\u64ab\u9255::\u34df\u0c95\u8c8a\u3d64\ufcaf\ud36e, getfield:\u16f6\u61a4\u5db4\u4c04\u64ab\u9255(\u9937\u7d52\u3e75\u98a4\u8aa5\u7006::\ud51e\u9033\u8df4\u7043\u5f50\u8aa5, this:\u9937\u7d52\u3e75\u98a4\u8aa5\u7006), p2:\u6b0d\ud171\uc7fe\u52d3\uafe7\u6c56, getstatic:\u6b0d\u3d64\u446c\u6cfe\u5f50\u9937(\ua068\uf995\u3711\u4bc8\u8c8a\u0c95::\uc3e3\u6b0d\u839e\u873d\u0800\uc246), getstatic:\u88c5\ub83f\uc246\u8c8a\u960f\ud7e8(\u88c5\ub83f\uc246\u8c8a\u960f\ud7e8::\uae5d\u6b0d\uf9c5\u5245\ub8be\u156b), ldc:float(1.0f), ldc:float(1.2f), ldc:boolean(0))
                    looporswitchbreak()
                
                case 1003:
                    invokevirtual:void(\u16f6\u61a4\u5db4\u4c04\u64ab\u9255::\u34df\u0c95\u8c8a\u3d64\ufcaf\ud36e, getfield:\u16f6\u61a4\u5db4\u4c04\u64ab\u9255(\u9937\u7d52\u3e75\u98a4\u8aa5\u7006::\ud51e\u9033\u8df4\u7043\u5f50\u8aa5, this:\u9937\u7d52\u3e75\u98a4\u8aa5\u7006), p2:\u6b0d\ud171\uc7fe\u52d3\uafe7\u6c56, getstatic:\u6b0d\u3d64\u446c\u6cfe\u5f50\u9937(\ua068\uf995\u3711\u4bc8\u8c8a\u0c95::\u4d85\u4daf\u72f1\u4e72\u8640\uc2e8), getstatic:\u88c5\ub83f\uc246\u8c8a\u960f\ud7e8(\u88c5\ub83f\uc246\u8c8a\u960f\ud7e8::\uc87f\u6bb9\u4975\u760c\u71f1\u3bd6), ldc:float(1.0f), ldc:float(1.2f), ldc:boolean(0))
                    looporswitchbreak()
                
                case 1004:
                    invokevirtual:void(\u16f6\u61a4\u5db4\u4c04\u64ab\u9255::\u34df\u0c95\u8c8a\u3d64\ufcaf\ud36e, getfield:\u16f6\u61a4\u5db4\u4c04\u64ab\u9255(\u9937\u7d52\u3e75\u98a4\u8aa5\u7006::\ud51e\u9033\u8df4\u7043\u5f50\u8aa5, this:\u9937\u7d52\u3e75\u98a4\u8aa5\u7006), p2:\u6b0d\ud171\uc7fe\u52d3\uafe7\u6c56, getstatic:\u6b0d\u3d64\u446c\u6cfe\u5f50\u9937(\ua068\uf995\u3711\u4bc8\u8c8a\u0c95::\u6ec6\u8d98\u120d\u4179\uc2bd\u7bad), getstatic:\u88c5\ub83f\uc246\u8c8a\u960f\ud7e8(\u88c5\ub83f\uc246\u8c8a\u960f\ud7e8::\uc87f\u6bb9\u4975\u760c\u71f1\u3bd6), ldc:float(1.0f), ldc:float(1.2f), ldc:boolean(0))
                    looporswitchbreak()
                
                case 1005:
                    invokevirtual:void(\u16f6\u61a4\u5db4\u4c04\u64ab\u9255::\u34df\u0c95\u8c8a\u3d64\ufcaf\ud36e, getfield:\u16f6\u61a4\u5db4\u4c04\u64ab\u9255(\u9937\u7d52\u3e75\u98a4\u8aa5\u7006::\ud51e\u9033\u8df4\u7043\u5f50\u8aa5, this:\u9937\u7d52\u3e75\u98a4\u8aa5\u7006), p2:\u6b0d\ud171\uc7fe\u52d3\uafe7\u6c56, getstatic:\u6b0d\u3d64\u446c\u6cfe\u5f50\u9937(\ua068\uf995\u3711\u4bc8\u8c8a\u0c95::\u8753\ua6bd\u92ee\u624e\u624e\u98a4), getstatic:\u88c5\ub83f\uc246\u8c8a\u960f\ud7e8(\u88c5\ub83f\uc246\u8c8a\u960f\ud7e8::\uae5d\u6b0d\uf9c5\u5245\ub8be\u156b), ldc:float(1.0f), add:float(mul:float(invokevirtual:float(Random::nextFloat, var_5_5F:Random), ldc:float(0.1f)), ldc:float(0.9f)), ldc:boolean(0))
                    looporswitchbreak()
                
                case 1006:
                    invokevirtual:void(\u16f6\u61a4\u5db4\u4c04\u64ab\u9255::\u34df\u0c95\u8c8a\u3d64\ufcaf\ud36e, getfield:\u16f6\u61a4\u5db4\u4c04\u64ab\u9255(\u9937\u7d52\u3e75\u98a4\u8aa5\u7006::\ud51e\u9033\u8df4\u7043\u5f50\u8aa5, this:\u9937\u7d52\u3e75\u98a4\u8aa5\u7006), p2:\u6b0d\ud171\uc7fe\u52d3\uafe7\u6c56, getstatic:\u6b0d\u3d64\u446c\u6cfe\u5f50\u9937(\ua068\uf995\u3711\u4bc8\u8c8a\u0c95::\u960f\ubded\ucfaf\u927d\u8389\ubf56), getstatic:\u88c5\ub83f\uc246\u8c8a\u960f\ud7e8(\u88c5\ub83f\uc246\u8c8a\u960f\ud7e8::\uae5d\u6b0d\uf9c5\u5245\ub8be\u156b), ldc:float(1.0f), add:float(mul:float(invokevirtual:float(Random::nextFloat, var_5_5F:Random), ldc:float(0.1f)), ldc:float(0.9f)), ldc:boolean(0))
                    looporswitchbreak()
                
                case 1007:
                    invokevirtual:void(\u16f6\u61a4\u5db4\u4c04\u64ab\u9255::\u34df\u0c95\u8c8a\u3d64\ufcaf\ud36e, getfield:\u16f6\u61a4\u5db4\u4c04\u64ab\u9255(\u9937\u7d52\u3e75\u98a4\u8aa5\u7006::\ud51e\u9033\u8df4\u7043\u5f50\u8aa5, this:\u9937\u7d52\u3e75\u98a4\u8aa5\u7006), p2:\u6b0d\ud171\uc7fe\u52d3\uafe7\u6c56, getstatic:\u6b0d\u3d64\u446c\u6cfe\u5f50\u9937(\ua068\uf995\u3711\u4bc8\u8c8a\u0c95::\u7af6\ud158\u385b\u446c\u6435\u7873), getstatic:\u88c5\ub83f\uc246\u8c8a\u960f\ud7e8(\u88c5\ub83f\uc246\u8c8a\u960f\ud7e8::\uae5d\u6b0d\uf9c5\u5245\ub8be\u156b), ldc:float(1.0f), add:float(mul:float(invokevirtual:float(Random::nextFloat, var_5_5F:Random), ldc:float(0.1f)), ldc:float(0.9f)), ldc:boolean(0))
                    looporswitchbreak()
                
                case 1008:
                    invokevirtual:void(\u16f6\u61a4\u5db4\u4c04\u64ab\u9255::\u34df\u0c95\u8c8a\u3d64\ufcaf\ud36e, getfield:\u16f6\u61a4\u5db4\u4c04\u64ab\u9255(\u9937\u7d52\u3e75\u98a4\u8aa5\u7006::\ud51e\u9033\u8df4\u7043\u5f50\u8aa5, this:\u9937\u7d52\u3e75\u98a4\u8aa5\u7006), p2:\u6b0d\ud171\uc7fe\u52d3\uafe7\u6c56, getstatic:\u6b0d\u3d64\u446c\u6cfe\u5f50\u9937(\ua068\uf995\u3711\u4bc8\u8c8a\u0c95::\ubefe\u3c25\u92ee\u8aa5\u62da\ub18d), getstatic:\u88c5\ub83f\uc246\u8c8a\u960f\ud7e8(\u88c5\ub83f\uc246\u8c8a\u960f\ud7e8::\uae5d\u6b0d\uf9c5\u5245\ub8be\u156b), ldc:float(1.0f), add:float(mul:float(invokevirtual:float(Random::nextFloat, var_5_5F:Random), ldc:float(0.1f)), ldc:float(0.9f)), ldc:boolean(0))
                    looporswitchbreak()
                
                case 1009:
                    invokevirtual:void(\u16f6\u61a4\u5db4\u4c04\u64ab\u9255::\u34df\u0c95\u8c8a\u3d64\ufcaf\ud36e, getfield:\u16f6\u61a4\u5db4\u4c04\u64ab\u9255(\u9937\u7d52\u3e75\u98a4\u8aa5\u7006::\ud51e\u9033\u8df4\u7043\u5f50\u8aa5, this:\u9937\u7d52\u3e75\u98a4\u8aa5\u7006), p2:\u6b0d\ud171\uc7fe\u52d3\uafe7\u6c56, getstatic:\u6b0d\u3d64\u446c\u6cfe\u5f50\u9937(\ua068\uf995\u3711\u4bc8\u8c8a\u0c95::\ub102\u624e\uc87f\u4ab3\u67d0\u3bc9), getstatic:\u88c5\ub83f\uc246\u8c8a\u960f\ud7e8(\u88c5\ub83f\uc246\u8c8a\u960f\ud7e8::\uae5d\u6b0d\uf9c5\u5245\ub8be\u156b), ldc:float(0.5f), add:float(ldc:float(2.6f), mul:float(sub:float(invokevirtual:float(Random::nextFloat, var_5_5F:Random), invokevirtual:float(Random::nextFloat, var_5_5F:Random)), ldc:float(0.8f))), ldc:boolean(0))
                    looporswitchbreak()
                
                case 1010:
                    if (logicalnot:boolean(instanceof:boolean(\u6b0d\u12cb\u156b\u4179\u8bb0.\u0800\u8aa5\u36d3\u67e9\u52d3\u4f4a.class, invokestatic:\u9af2\u1833\u156b\u12cb\u7d52\u6c52(\u9af2\u1833\u156b\u12cb\u7d52\u6c52::\u5654\ua068\u5654\u2dcc\u64ab\u6d69, p3:int)))) {
                        invokevirtual:void(\u9937\u7d52\u3e75\u98a4\u8aa5\u7006::\u960f\u7043\u8413\ud171\u1833\u8d90, this:\u9937\u7d52\u3e75\u98a4\u8aa5\u7006, checkcast:\u6b0d\u3d64\u446c\u6cfe\u5f50\u9937(\u927d\u92ff\u71ae\uafe7\u6bb9.\u6b0d\u3d64\u446c\u6cfe\u5f50\u9937.class, aconstnull:\u6b0d\u3d64\u446c\u6cfe\u5f50\u9937()), p2:\u6b0d\ud171\uc7fe\u52d3\uafe7\u6c56)
                        looporswitchbreak()
                    }
                    
                    if (invokevirtual:boolean(\u93a2\u1833\u6cfe\uc4d2\u4ab3\uc84e::\u9255\u8413\ube23\u71ae\u647c\u4f52, getstatic:\u93a2\u1833\u6cfe\uc4d2\u4ab3\uc84e(\u6c52\u873d\uc84e\u7ce1\u4daf\u8308::\ua3b4\u4975\u6bb9\uc2bd\uf9c5\u8413))) {
                        invokevirtual:void(\u9937\u7d52\u3e75\u98a4\u8aa5\u7006::\u960f\u7043\u8413\ud171\u1833\u8d90, this:\u9937\u7d52\u3e75\u98a4\u8aa5\u7006, invokevirtual:\u6b0d\u3d64\u446c\u6cfe\u5f50\u9937(\u0800\u8aa5\u36d3\u67e9\u52d3\u4f4a::\ubff1\u4cd9\u2dcc\uc2bd\ua6bd\ud217, checkcast:\u0800\u8aa5\u36d3\u67e9\u52d3\u4f4a(\u6b0d\u12cb\u156b\u4179\u8bb0.\u0800\u8aa5\u36d3\u67e9\u52d3\u4f4a.class, invokestatic:\u9af2\u1833\u156b\u12cb\u7d52\u6c52[expected:\u0800\u8aa5\u36d3\u67e9\u52d3\u4f4a](\u9af2\u1833\u156b\u12cb\u7d52\u6c52::\u5654\ua068\u5654\u2dcc\u64ab\u6d69, p3:int))), p2:\u6b0d\ud171\uc7fe\u52d3\uafe7\u6c56, checkcast:\u0800\u8aa5\u36d3\u67e9\u52d3\u4f4a(\u6b0d\u12cb\u156b\u4179\u8bb0.\u0800\u8aa5\u36d3\u67e9\u52d3\u4f4a.class, invokestatic:\u9af2\u1833\u156b\u12cb\u7d52\u6c52[expected:\u0800\u8aa5\u36d3\u67e9\u52d3\u4f4a](\u9af2\u1833\u156b\u12cb\u7d52\u6c52::\u5654\ua068\u5654\u2dcc\u64ab\u6d69, p3:int)))
                        looporswitchbreak()
                    }
                    
                    invokevirtual:void(\u9937\u7d52\u3e75\u98a4\u8aa5\u7006::\u960f\u7043\u8413\ud171\u1833\u8d90, this:\u9937\u7d52\u3e75\u98a4\u8aa5\u7006, invokevirtual:\u6b0d\u3d64\u446c\u6cfe\u5f50\u9937(\u0800\u8aa5\u36d3\u67e9\u52d3\u4f4a::\ubff1\u4cd9\u2dcc\uc2bd\ua6bd\ud217, checkcast:\u0800\u8aa5\u36d3\u67e9\u52d3\u4f4a(\u6b0d\u12cb\u156b\u4179\u8bb0.\u0800\u8aa5\u36d3\u67e9\u52d3\u4f4a.class, invokestatic:\u9af2\u1833\u156b\u12cb\u7d52\u6c52[expected:\u0800\u8aa5\u36d3\u67e9\u52d3\u4f4a](\u9af2\u1833\u156b\u12cb\u7d52\u6c52::\u5654\ua068\u5654\u2dcc\u64ab\u6d69, p3:int))), p2:\u6b0d\ud171\uc7fe\u52d3\uafe7\u6c56)
                    looporswitchbreak()
                
                case 1011:
                    invokevirtual:void(\u16f6\u61a4\u5db4\u4c04\u64ab\u9255::\u34df\u0c95\u8c8a\u3d64\ufcaf\ud36e, getfield:\u16f6\u61a4\u5db4\u4c04\u64ab\u9255(\u9937\u7d52\u3e75\u98a4\u8aa5\u7006::\ud51e\u9033\u8df4\u7043\u5f50\u8aa5, this:\u9937\u7d52\u3e75\u98a4\u8aa5\u7006), p2:\u6b0d\ud171\uc7fe\u52d3\uafe7\u6c56, getstatic:\u6b0d\u3d64\u446c\u6cfe\u5f50\u9937(\ua068\uf995\u3711\u4bc8\u8c8a\u0c95::\u4f4a\u92ee\u0c95\u5f50\u960f\ufcaf), getstatic:\u88c5\ub83f\uc246\u8c8a\u960f\ud7e8(\u88c5\ub83f\uc246\u8c8a\u960f\ud7e8::\uae5d\u6b0d\uf9c5\u5245\ub8be\u156b), ldc:float(1.0f), add:float(mul:float(invokevirtual:float(Random::nextFloat, var_5_5F:Random), ldc:float(0.1f)), ldc:float(0.9f)), ldc:boolean(0))
                    looporswitchbreak()
                
                case 1012:
                    invokevirtual:void(\u16f6\u61a4\u5db4\u4c04\u64ab\u9255::\u34df\u0c95\u8c8a\u3d64\ufcaf\ud36e, getfield:\u16f6\u61a4\u5db4\u4c04\u64ab\u9255(\u9937\u7d52\u3e75\u98a4\u8aa5\u7006::\ud51e\u9033\u8df4\u7043\u5f50\u8aa5, this:\u9937\u7d52\u3e75\u98a4\u8aa5\u7006), p2:\u6b0d\ud171\uc7fe\u52d3\uafe7\u6c56, getstatic:\u6b0d\u3d64\u446c\u6cfe\u5f50\u9937(\ua068\uf995\u3711\u4bc8\u8c8a\u0c95::\uc3e3\u8389\u7049\ub7dc\u8709\u4ab3), getstatic:\u88c5\ub83f\uc246\u8c8a\u960f\ud7e8(\u88c5\ub83f\uc246\u8c8a\u960f\ud7e8::\uae5d\u6b0d\uf9c5\u5245\ub8be\u156b), ldc:float(1.0f), add:float(mul:float(invokevirtual:float(Random::nextFloat, var_5_5F:Random), ldc:float(0.1f)), ldc:float(0.9f)), ldc:boolean(0))
                    looporswitchbreak()
                
                case 1013:
                    invokevirtual:void(\u16f6\u61a4\u5db4\u4c04\u64ab\u9255::\u34df\u0c95\u8c8a\u3d64\ufcaf\ud36e, getfield:\u16f6\u61a4\u5db4\u4c04\u64ab\u9255(\u9937\u7d52\u3e75\u98a4\u8aa5\u7006::\ud51e\u9033\u8df4\u7043\u5f50\u8aa5, this:\u9937\u7d52\u3e75\u98a4\u8aa5\u7006), p2:\u6b0d\ud171\uc7fe\u52d3\uafe7\u6c56, getstatic:\u6b0d\u3d64\u446c\u6cfe\u5f50\u9937(\ua068\uf995\u3711\u4bc8\u8c8a\u0c95::\u6198\u5654\u759a\ub70c\u69d9\uc229), getstatic:\u88c5\ub83f\uc246\u8c8a\u960f\ud7e8(\u88c5\ub83f\uc246\u8c8a\u960f\ud7e8::\uae5d\u6b0d\uf9c5\u5245\ub8be\u156b), ldc:float(1.0f), add:float(mul:float(invokevirtual:float(Random::nextFloat, var_5_5F:Random), ldc:float(0.1f)), ldc:float(0.9f)), ldc:boolean(0))
                    looporswitchbreak()
                
                case 1014:
                    invokevirtual:void(\u16f6\u61a4\u5db4\u4c04\u64ab\u9255::\u34df\u0c95\u8c8a\u3d64\ufcaf\ud36e, getfield:\u16f6\u61a4\u5db4\u4c04\u64ab\u9255(\u9937\u7d52\u3e75\u98a4\u8aa5\u7006::\ud51e\u9033\u8df4\u7043\u5f50\u8aa5, this:\u9937\u7d52\u3e75\u98a4\u8aa5\u7006), p2:\u6b0d\ud171\uc7fe\u52d3\uafe7\u6c56, getstatic:\u6b0d\u3d64\u446c\u6cfe\u5f50\u9937(\ua068\uf995\u3711\u4bc8\u8c8a\u0c95::\u7006\u0a06\ub1b9\uae87\uc31c\u3e75), getstatic:\u88c5\ub83f\uc246\u8c8a\u960f\ud7e8(\u88c5\ub83f\uc246\u8c8a\u960f\ud7e8::\uae5d\u6b0d\uf9c5\u5245\ub8be\u156b), ldc:float(1.0f), add:float(mul:float(invokevirtual:float(Random::nextFloat, var_5_5F:Random), ldc:float(0.1f)), ldc:float(0.9f)), ldc:boolean(0))
                    looporswitchbreak()
                
                case 1015:
                    invokevirtual:void(\u16f6\u61a4\u5db4\u4c04\u64ab\u9255::\u34df\u0c95\u8c8a\u3d64\ufcaf\ud36e, getfield:\u16f6\u61a4\u5db4\u4c04\u64ab\u9255(\u9937\u7d52\u3e75\u98a4\u8aa5\u7006::\ud51e\u9033\u8df4\u7043\u5f50\u8aa5, this:\u9937\u7d52\u3e75\u98a4\u8aa5\u7006), p2:\u6b0d\ud171\uc7fe\u52d3\uafe7\u6c56, getstatic:\u6b0d\u3d64\u446c\u6cfe\u5f50\u9937(\ua068\uf995\u3711\u4bc8\u8c8a\u0c95::\uc229\u3e75\u97b7\u760c\u71ae\u446c), getstatic:\u88c5\ub83f\uc246\u8c8a\u960f\ud7e8(\u88c5\ub83f\uc246\u8c8a\u960f\ud7e8::\u3711\u2dcc\u8350\uc229\u9a18\u7873), ldc:float(10.0f), add:float(mul:float(sub:float(invokevirtual:float(Random::nextFloat, var_5_5F:Random), invokevirtual:float(Random::nextFloat, var_5_5F:Random)), ldc:float(0.2f)), ldc:float(1.0f)), ldc:boolean(0))
                    looporswitchbreak()
                
                case 1016:
                    invokevirtual:void(\u16f6\u61a4\u5db4\u4c04\u64ab\u9255::\u34df\u0c95\u8c8a\u3d64\ufcaf\ud36e, getfield:\u16f6\u61a4\u5db4\u4c04\u64ab\u9255(\u9937\u7d52\u3e75\u98a4\u8aa5\u7006::\ud51e\u9033\u8df4\u7043\u5f50\u8aa5, this:\u9937\u7d52\u3e75\u98a4\u8aa5\u7006), p2:\u6b0d\ud171\uc7fe\u52d3\uafe7\u6c56, getstatic:\u6b0d\u3d64\u446c\u6cfe\u5f50\u9937(\ua068\uf995\u3711\u4bc8\u8c8a\u0c95::\u6b0d\u3bc9\ud4fe\ubded\u946b\ud158), getstatic:\u88c5\ub83f\uc246\u8c8a\u960f\ud7e8(\u88c5\ub83f\uc246\u8c8a\u960f\ud7e8::\u3711\u2dcc\u8350\uc229\u9a18\u7873), ldc:float(10.0f), add:float(mul:float(sub:float(invokevirtual:float(Random::nextFloat, var_5_5F:Random), invokevirtual:float(Random::nextFloat, var_5_5F:Random)), ldc:float(0.2f)), ldc:float(1.0f)), ldc:boolean(0))
                    looporswitchbreak()
                
                case 1017:
                    invokevirtual:void(\u16f6\u61a4\u5db4\u4c04\u64ab\u9255::\u34df\u0c95\u8c8a\u3d64\ufcaf\ud36e, getfield:\u16f6\u61a4\u5db4\u4c04\u64ab\u9255(\u9937\u7d52\u3e75\u98a4\u8aa5\u7006::\ud51e\u9033\u8df4\u7043\u5f50\u8aa5, this:\u9937\u7d52\u3e75\u98a4\u8aa5\u7006), p2:\u6b0d\ud171\uc7fe\u52d3\uafe7\u6c56, getstatic:\u6b0d\u3d64\u446c\u6cfe\u5f50\u9937(\ua068\uf995\u3711\u4bc8\u8c8a\u0c95::\u3504\ub171\u5db4\u92ff\u392e\uceb8), getstatic:\u88c5\ub83f\uc246\u8c8a\u960f\ud7e8(\u88c5\ub83f\uc246\u8c8a\u960f\ud7e8::\u3711\u2dcc\u8350\uc229\u9a18\u7873), ldc:float(10.0f), add:float(mul:float(sub:float(invokevirtual:float(Random::nextFloat, var_5_5F:Random), invokevirtual:float(Random::nextFloat, var_5_5F:Random)), ldc:float(0.2f)), ldc:float(1.0f)), ldc:boolean(0))
                    looporswitchbreak()
                
                case 1018:
                    invokevirtual:void(\u16f6\u61a4\u5db4\u4c04\u64ab\u9255::\u34df\u0c95\u8c8a\u3d64\ufcaf\ud36e, getfield:\u16f6\u61a4\u5db4\u4c04\u64ab\u9255(\u9937\u7d52\u3e75\u98a4\u8aa5\u7006::\ud51e\u9033\u8df4\u7043\u5f50\u8aa5, this:\u9937\u7d52\u3e75\u98a4\u8aa5\u7006), p2:\u6b0d\ud171\uc7fe\u52d3\uafe7\u6c56, getstatic:\u6b0d\u3d64\u446c\u6cfe\u5f50\u9937(\ua068\uf995\u3711\u4bc8\u8c8a\u0c95::\ube23\u7049\uc84e\u61a4\u527a\u7043), getstatic:\u88c5\ub83f\uc246\u8c8a\u960f\ud7e8(\u88c5\ub83f\uc246\u8c8a\u960f\ud7e8::\u3711\u2dcc\u8350\uc229\u9a18\u7873), ldc:float(2.0f), add:float(mul:float(sub:float(invokevirtual:float(Random::nextFloat, var_5_5F:Random), invokevirtual:float(Random::nextFloat, var_5_5F:Random)), ldc:float(0.2f)), ldc:float(1.0f)), ldc:boolean(0))
                    looporswitchbreak()
                
                case 1019:
                    invokevirtual:void(\u16f6\u61a4\u5db4\u4c04\u64ab\u9255::\u34df\u0c95\u8c8a\u3d64\ufcaf\ud36e, getfield:\u16f6\u61a4\u5db4\u4c04\u64ab\u9255(\u9937\u7d52\u3e75\u98a4\u8aa5\u7006::\ud51e\u9033\u8df4\u7043\u5f50\u8aa5, this:\u9937\u7d52\u3e75\u98a4\u8aa5\u7006), p2:\u6b0d\ud171\uc7fe\u52d3\uafe7\u6c56, getstatic:\u6b0d\u3d64\u446c\u6cfe\u5f50\u9937(\ua068\uf995\u3711\u4bc8\u8c8a\u0c95::\u6bb9\u52d3\u52d3\u494c\uc2e8\u3e2a), getstatic:\u88c5\ub83f\uc246\u8c8a\u960f\ud7e8(\u88c5\ub83f\uc246\u8c8a\u960f\ud7e8::\u3711\u2dcc\u8350\uc229\u9a18\u7873), ldc:float(2.0f), add:float(mul:float(sub:float(invokevirtual:float(Random::nextFloat, var_5_5F:Random), invokevirtual:float(Random::nextFloat, var_5_5F:Random)), ldc:float(0.2f)), ldc:float(1.0f)), ldc:boolean(0))
                    looporswitchbreak()
                
                case 1020:
                    invokevirtual:void(\u16f6\u61a4\u5db4\u4c04\u64ab\u9255::\u34df\u0c95\u8c8a\u3d64\ufcaf\ud36e, getfield:\u16f6\u61a4\u5db4\u4c04\u64ab\u9255(\u9937\u7d52\u3e75\u98a4\u8aa5\u7006::\ud51e\u9033\u8df4\u7043\u5f50\u8aa5, this:\u9937\u7d52\u3e75\u98a4\u8aa5\u7006), p2:\u6b0d\ud171\uc7fe\u52d3\uafe7\u6c56, getstatic:\u6b0d\u3d64\u446c\u6cfe\u5f50\u9937(\ua068\uf995\u3711\u4bc8\u8c8a\u0c95::\u0c95\u4bc8\u5140\u9af2\u4492\u59ec), getstatic:\u88c5\ub83f\uc246\u8c8a\u960f\ud7e8(\u88c5\ub83f\uc246\u8c8a\u960f\ud7e8::\u3711\u2dcc\u8350\uc229\u9a18\u7873), ldc:float(2.0f), add:float(mul:float(sub:float(invokevirtual:float(Random::nextFloat, var_5_5F:Random), invokevirtual:float(Random::nextFloat, var_5_5F:Random)), ldc:float(0.2f)), ldc:float(1.0f)), ldc:boolean(0))
                    looporswitchbreak()
                
                case 1021:
                    invokevirtual:void(\u16f6\u61a4\u5db4\u4c04\u64ab\u9255::\u34df\u0c95\u8c8a\u3d64\ufcaf\ud36e, getfield:\u16f6\u61a4\u5db4\u4c04\u64ab\u9255(\u9937\u7d52\u3e75\u98a4\u8aa5\u7006::\ud51e\u9033\u8df4\u7043\u5f50\u8aa5, this:\u9937\u7d52\u3e75\u98a4\u8aa5\u7006), p2:\u6b0d\ud171\uc7fe\u52d3\uafe7\u6c56, getstatic:\u6b0d\u3d64\u446c\u6cfe\u5f50\u9937(\ua068\uf995\u3711\u4bc8\u8c8a\u0c95::\u8308\u6d69\u5db4\u8753\u7873\u8c8a), getstatic:\u88c5\ub83f\uc246\u8c8a\u960f\ud7e8(\u88c5\ub83f\uc246\u8c8a\u960f\ud7e8::\u3711\u2dcc\u8350\uc229\u9a18\u7873), ldc:float(2.0f), add:float(mul:float(sub:float(invokevirtual:float(Random::nextFloat, var_5_5F:Random), invokevirtual:float(Random::nextFloat, var_5_5F:Random)), ldc:float(0.2f)), ldc:float(1.0f)), ldc:boolean(0))
                    looporswitchbreak()
                
                case 1022:
                    invokevirtual:void(\u16f6\u61a4\u5db4\u4c04\u64ab\u9255::\u34df\u0c95\u8c8a\u3d64\ufcaf\ud36e, getfield:\u16f6\u61a4\u5db4\u4c04\u64ab\u9255(\u9937\u7d52\u3e75\u98a4\u8aa5\u7006::\ud51e\u9033\u8df4\u7043\u5f50\u8aa5, this:\u9937\u7d52\u3e75\u98a4\u8aa5\u7006), p2:\u6b0d\ud171\uc7fe\u52d3\uafe7\u6c56, getstatic:\u6b0d\u3d64\u446c\u6cfe\u5f50\u9937(\ua068\uf995\u3711\u4bc8\u8c8a\u0c95::\u4bc8\uae5d\ub32d\ufe34\u7af6\uc2e8), getstatic:\u88c5\ub83f\uc246\u8c8a\u960f\ud7e8(\u88c5\ub83f\uc246\u8c8a\u960f\ud7e8::\u3711\u2dcc\u8350\uc229\u9a18\u7873), ldc:float(2.0f), add:float(mul:float(sub:float(invokevirtual:float(Random::nextFloat, var_5_5F:Random), invokevirtual:float(Random::nextFloat, var_5_5F:Random)), ldc:float(0.2f)), ldc:float(1.0f)), ldc:boolean(0))
                    looporswitchbreak()
                
                case 1024:
                    invokevirtual:void(\u16f6\u61a4\u5db4\u4c04\u64ab\u9255::\u34df\u0c95\u8c8a\u3d64\ufcaf\ud36e, getfield:\u16f6\u61a4\u5db4\u4c04\u64ab\u9255(\u9937\u7d52\u3e75\u98a4\u8aa5\u7006::\ud51e\u9033\u8df4\u7043\u5f50\u8aa5, this:\u9937\u7d52\u3e75\u98a4\u8aa5\u7006), p2:\u6b0d\ud171\uc7fe\u52d3\uafe7\u6c56, getstatic:\u6b0d\u3d64\u446c\u6cfe\u5f50\u9937(\ua068\uf995\u3711\u4bc8\u8c8a\u0c95::\u416d\u392e\u8709\ubf56\ua562\u446c), getstatic:\u88c5\ub83f\uc246\u8c8a\u960f\ud7e8(\u88c5\ub83f\uc246\u8c8a\u960f\ud7e8::\u3711\u2dcc\u8350\uc229\u9a18\u7873), ldc:float(2.0f), add:float(mul:float(sub:float(invokevirtual:float(Random::nextFloat, var_5_5F:Random), invokevirtual:float(Random::nextFloat, var_5_5F:Random)), ldc:float(0.2f)), ldc:float(1.0f)), ldc:boolean(0))
                    looporswitchbreak()
                
                case 1025:
                    invokevirtual:void(\u16f6\u61a4\u5db4\u4c04\u64ab\u9255::\u34df\u0c95\u8c8a\u3d64\ufcaf\ud36e, getfield:\u16f6\u61a4\u5db4\u4c04\u64ab\u9255(\u9937\u7d52\u3e75\u98a4\u8aa5\u7006::\ud51e\u9033\u8df4\u7043\u5f50\u8aa5, this:\u9937\u7d52\u3e75\u98a4\u8aa5\u7006), p2:\u6b0d\ud171\uc7fe\u52d3\uafe7\u6c56, getstatic:\u6b0d\u3d64\u446c\u6cfe\u5f50\u9937(\ua068\uf995\u3711\u4bc8\u8c8a\u0c95::\u0c95\u40a9\u9a18\ube23\u6b5f\uc3e3), getstatic:\u88c5\ub83f\uc246\u8c8a\u960f\ud7e8(\u88c5\ub83f\uc246\u8c8a\u960f\ud7e8::\uc87f\u6bb9\u4975\u760c\u71f1\u3bd6), ldc:float(0.05f), add:float(mul:float(sub:float(invokevirtual:float(Random::nextFloat, var_5_5F:Random), invokevirtual:float(Random::nextFloat, var_5_5F:Random)), ldc:float(0.2f)), ldc:float(1.0f)), ldc:boolean(0))
                    looporswitchbreak()
                
                case 1026:
                    invokevirtual:void(\u16f6\u61a4\u5db4\u4c04\u64ab\u9255::\u34df\u0c95\u8c8a\u3d64\ufcaf\ud36e, getfield:\u16f6\u61a4\u5db4\u4c04\u64ab\u9255(\u9937\u7d52\u3e75\u98a4\u8aa5\u7006::\ud51e\u9033\u8df4\u7043\u5f50\u8aa5, this:\u9937\u7d52\u3e75\u98a4\u8aa5\u7006), p2:\u6b0d\ud171\uc7fe\u52d3\uafe7\u6c56, getstatic:\u6b0d\u3d64\u446c\u6cfe\u5f50\u9937(\ua068\uf995\u3711\u4bc8\u8c8a\u0c95::\ucfaf\uc87f\u5fe1\uc229\u1833\ua3b4), getstatic:\u88c5\ub83f\uc246\u8c8a\u960f\ud7e8(\u88c5\ub83f\uc246\u8c8a\u960f\ud7e8::\u3711\u2dcc\u8350\uc229\u9a18\u7873), ldc:float(2.0f), add:float(mul:float(sub:float(invokevirtual:float(Random::nextFloat, var_5_5F:Random), invokevirtual:float(Random::nextFloat, var_5_5F:Random)), ldc:float(0.2f)), ldc:float(1.0f)), ldc:boolean(0))
                    looporswitchbreak()
                
                case 1027:
                    invokevirtual:void(\u16f6\u61a4\u5db4\u4c04\u64ab\u9255::\u34df\u0c95\u8c8a\u3d64\ufcaf\ud36e, getfield:\u16f6\u61a4\u5db4\u4c04\u64ab\u9255(\u9937\u7d52\u3e75\u98a4\u8aa5\u7006::\ud51e\u9033\u8df4\u7043\u5f50\u8aa5, this:\u9937\u7d52\u3e75\u98a4\u8aa5\u7006), p2:\u6b0d\ud171\uc7fe\u52d3\uafe7\u6c56, getstatic:\u6b0d\u3d64\u446c\u6cfe\u5f50\u9937(\ua068\uf995\u3711\u4bc8\u8c8a\u0c95::\u6cfe\ub83f\uf995\u3bd6\u6d99\u527a), getstatic:\u88c5\ub83f\uc246\u8c8a\u960f\ud7e8(\u88c5\ub83f\uc246\u8c8a\u960f\ud7e8::\uc87f\u6bb9\u4975\u760c\u71f1\u3bd6), ldc:float(2.0f), add:float(mul:float(sub:float(invokevirtual:float(Random::nextFloat, var_5_5F:Random), invokevirtual:float(Random::nextFloat, var_5_5F:Random)), ldc:float(0.2f)), ldc:float(1.0f)), ldc:boolean(0))
                    looporswitchbreak()
                
                case 1029:
                    invokevirtual:void(\u16f6\u61a4\u5db4\u4c04\u64ab\u9255::\u34df\u0c95\u8c8a\u3d64\ufcaf\ud36e, getfield:\u16f6\u61a4\u5db4\u4c04\u64ab\u9255(\u9937\u7d52\u3e75\u98a4\u8aa5\u7006::\ud51e\u9033\u8df4\u7043\u5f50\u8aa5, this:\u9937\u7d52\u3e75\u98a4\u8aa5\u7006), p2:\u6b0d\ud171\uc7fe\u52d3\uafe7\u6c56, getstatic:\u6b0d\u3d64\u446c\u6cfe\u5f50\u9937(\ua068\uf995\u3711\u4bc8\u8c8a\u0c95::\u3e75\ub171\u7330\u6b0d\u759a\u965f), getstatic:\u88c5\ub83f\uc246\u8c8a\u960f\ud7e8(\u88c5\ub83f\uc246\u8c8a\u960f\ud7e8::\uae5d\u6b0d\uf9c5\u5245\ub8be\u156b), ldc:float(1.0f), add:float(mul:float(invokevirtual:float(Random::nextFloat, var_5_5F:Random), ldc:float(0.1f)), ldc:float(0.9f)), ldc:boolean(0))
                    looporswitchbreak()
                
                case 1030:
                    invokevirtual:void(\u16f6\u61a4\u5db4\u4c04\u64ab\u9255::\u34df\u0c95\u8c8a\u3d64\ufcaf\ud36e, getfield:\u16f6\u61a4\u5db4\u4c04\u64ab\u9255(\u9937\u7d52\u3e75\u98a4\u8aa5\u7006::\ud51e\u9033\u8df4\u7043\u5f50\u8aa5, this:\u9937\u7d52\u3e75\u98a4\u8aa5\u7006), p2:\u6b0d\ud171\uc7fe\u52d3\uafe7\u6c56, getstatic:\u6b0d\u3d64\u446c\u6cfe\u5f50\u9937(\ua068\uf995\u3711\u4bc8\u8c8a\u0c95::\u385b\u8308\u5140\u4ab3\uc2bd\u59ec), getstatic:\u88c5\ub83f\uc246\u8c8a\u960f\ud7e8(\u88c5\ub83f\uc246\u8c8a\u960f\ud7e8::\uae5d\u6b0d\uf9c5\u5245\ub8be\u156b), ldc:float(1.0f), add:float(mul:float(invokevirtual:float(Random::nextFloat, var_5_5F:Random), ldc:float(0.1f)), ldc:float(0.9f)), ldc:boolean(0))
                    looporswitchbreak()
                
                case 1031:
                    invokevirtual:void(\u16f6\u61a4\u5db4\u4c04\u64ab\u9255::\u34df\u0c95\u8c8a\u3d64\ufcaf\ud36e, getfield:\u16f6\u61a4\u5db4\u4c04\u64ab\u9255(\u9937\u7d52\u3e75\u98a4\u8aa5\u7006::\ud51e\u9033\u8df4\u7043\u5f50\u8aa5, this:\u9937\u7d52\u3e75\u98a4\u8aa5\u7006), p2:\u6b0d\ud171\uc7fe\u52d3\uafe7\u6c56, getstatic:\u6b0d\u3d64\u446c\u6cfe\u5f50\u9937(\ua068\uf995\u3711\u4bc8\u8c8a\u0c95::\u4d85\u624e\uae87\u4179\u6198\u0c95), getstatic:\u88c5\ub83f\uc246\u8c8a\u960f\ud7e8(\u88c5\ub83f\uc246\u8c8a\u960f\ud7e8::\uae5d\u6b0d\uf9c5\u5245\ub8be\u156b), ldc:float(0.3f), add:float(mul:float(invokevirtual:float(Random::nextFloat, getfield:Random(\u16f6\u61a4\u5db4\u4c04\u64ab\u9255::\u3776\ub113\u8c8a\u8709\ub18d\uc2bd, getfield:\u16f6\u61a4\u5db4\u4c04\u64ab\u9255(\u9937\u7d52\u3e75\u98a4\u8aa5\u7006::\ud51e\u9033\u8df4\u7043\u5f50\u8aa5, this:\u9937\u7d52\u3e75\u98a4\u8aa5\u7006))), ldc:float(0.1f)), ldc:float(0.9f)), ldc:boolean(0))
                    looporswitchbreak()
                
                case 1032:
                    invokevirtual:void(\u61a4\ud217\u4e72\u6ec6\uc238\u72f1::\ubf56\ua61f\u4975\ua61f\u1187\u6b5f, invokevirtual:\u61a4\ud217\u4e72\u6ec6\uc238\u72f1(\u67e9\u4daf\u760c\ud217\ua6bd\ubff1::\uf94d\u64f2\u3bc9\u67e9\u36d3\u5d20, getfield:\u67e9\u4daf\u760c\ud217\ua6bd\ubff1(\u9937\u7d52\u3e75\u98a4\u8aa5\u7006::\u8df4\u3776\ud171\u7006\u51b2\uf995, this:\u9937\u7d52\u3e75\u98a4\u8aa5\u7006)), invokestatic:\u6cfe\u3d64\u8bb0\ub83f\u4f52\ube23(\u6cfe\u3d64\u8bb0\ub83f\u4f52\ube23::\u446c\u3bc9\u7d52\u51fa\u8258\u92ee, getstatic:\u6b0d\u3d64\u446c\u6cfe\u5f50\u9937(\ua068\uf995\u3711\u4bc8\u8c8a\u0c95::\uc29a\u494c\u4975\uae5d\u6b5f\u6198), add:float(mul:float(invokevirtual:float(Random::nextFloat, var_5_5F:Random), ldc:float(0.4f)), ldc:float(0.8f)), ldc:float(0.25f)))
                    looporswitchbreak()
                
                case 1033:
                    invokevirtual:void(\u16f6\u61a4\u5db4\u4c04\u64ab\u9255::\u34df\u0c95\u8c8a\u3d64\ufcaf\ud36e, getfield:\u16f6\u61a4\u5db4\u4c04\u64ab\u9255(\u9937\u7d52\u3e75\u98a4\u8aa5\u7006::\ud51e\u9033\u8df4\u7043\u5f50\u8aa5, this:\u9937\u7d52\u3e75\u98a4\u8aa5\u7006), p2:\u6b0d\ud171\uc7fe\u52d3\uafe7\u6c56, getstatic:\u6b0d\u3d64\u446c\u6cfe\u5f50\u9937(\ua068\uf995\u3711\u4bc8\u8c8a\u0c95::\u6cfe\u97b7\uf94d\u8308\u183a\ufcaf), getstatic:\u88c5\ub83f\uc246\u8c8a\u960f\ud7e8(\u88c5\ub83f\uc246\u8c8a\u960f\ud7e8::\uae5d\u6b0d\uf9c5\u5245\ub8be\u156b), ldc:float(1.0f), ldc:float(1.0f), ldc:boolean(0))
                    looporswitchbreak()
                
                case 1034:
                    invokevirtual:void(\u16f6\u61a4\u5db4\u4c04\u64ab\u9255::\u34df\u0c95\u8c8a\u3d64\ufcaf\ud36e, getfield:\u16f6\u61a4\u5db4\u4c04\u64ab\u9255(\u9937\u7d52\u3e75\u98a4\u8aa5\u7006::\ud51e\u9033\u8df4\u7043\u5f50\u8aa5, this:\u9937\u7d52\u3e75\u98a4\u8aa5\u7006), p2:\u6b0d\ud171\uc7fe\u52d3\uafe7\u6c56, getstatic:\u6b0d\u3d64\u446c\u6cfe\u5f50\u9937(\ua068\uf995\u3711\u4bc8\u8c8a\u0c95::\uc246\u7049\u7e3f\uff55\u8df4\u0800), getstatic:\u88c5\ub83f\uc246\u8c8a\u960f\ud7e8(\u88c5\ub83f\uc246\u8c8a\u960f\ud7e8::\uae5d\u6b0d\uf9c5\u5245\ub8be\u156b), ldc:float(1.0f), ldc:float(1.0f), ldc:boolean(0))
                    looporswitchbreak()
                
                case 1035:
                    invokevirtual:void(\u16f6\u61a4\u5db4\u4c04\u64ab\u9255::\u34df\u0c95\u8c8a\u3d64\ufcaf\ud36e, getfield:\u16f6\u61a4\u5db4\u4c04\u64ab\u9255(\u9937\u7d52\u3e75\u98a4\u8aa5\u7006::\ud51e\u9033\u8df4\u7043\u5f50\u8aa5, this:\u9937\u7d52\u3e75\u98a4\u8aa5\u7006), p2:\u6b0d\ud171\uc7fe\u52d3\uafe7\u6c56, getstatic:\u6b0d\u3d64\u446c\u6cfe\u5f50\u9937(\ua068\uf995\u3711\u4bc8\u8c8a\u0c95::\ubf56\u93a2\u5fe1\u8640\u7873\u965f), getstatic:\u88c5\ub83f\uc246\u8c8a\u960f\ud7e8(\u88c5\ub83f\uc246\u8c8a\u960f\ud7e8::\uae5d\u6b0d\uf9c5\u5245\ub8be\u156b), ldc:float(1.0f), ldc:float(1.0f), ldc:boolean(0))
                    looporswitchbreak()
                
                case 1036:
                    invokevirtual:void(\u16f6\u61a4\u5db4\u4c04\u64ab\u9255::\u34df\u0c95\u8c8a\u3d64\ufcaf\ud36e, getfield:\u16f6\u61a4\u5db4\u4c04\u64ab\u9255(\u9937\u7d52\u3e75\u98a4\u8aa5\u7006::\ud51e\u9033\u8df4\u7043\u5f50\u8aa5, this:\u9937\u7d52\u3e75\u98a4\u8aa5\u7006), p2:\u6b0d\ud171\uc7fe\u52d3\uafe7\u6c56, getstatic:\u6b0d\u3d64\u446c\u6cfe\u5f50\u9937(\ua068\uf995\u3711\u4bc8\u8c8a\u0c95::\u6d99\uc3e3\u8753\ua6bd\ud51e\uc2e8), getstatic:\u88c5\ub83f\uc246\u8c8a\u960f\ud7e8(\u88c5\ub83f\uc246\u8c8a\u960f\ud7e8::\uae5d\u6b0d\uf9c5\u5245\ub8be\u156b), ldc:float(1.0f), add:float(mul:float(invokevirtual:float(Random::nextFloat, var_5_5F:Random), ldc:float(0.1f)), ldc:float(0.9f)), ldc:boolean(0))
                    looporswitchbreak()
                
                case 1037:
                    invokevirtual:void(\u16f6\u61a4\u5db4\u4c04\u64ab\u9255::\u34df\u0c95\u8c8a\u3d64\ufcaf\ud36e, getfield:\u16f6\u61a4\u5db4\u4c04\u64ab\u9255(\u9937\u7d52\u3e75\u98a4\u8aa5\u7006::\ud51e\u9033\u8df4\u7043\u5f50\u8aa5, this:\u9937\u7d52\u3e75\u98a4\u8aa5\u7006), p2:\u6b0d\ud171\uc7fe\u52d3\uafe7\u6c56, getstatic:\u6b0d\u3d64\u446c\u6cfe\u5f50\u9937(\ua068\uf995\u3711\u4bc8\u8c8a\u0c95::\uc4d2\u69d9\u72f1\u12cb\u839e\u3a62), getstatic:\u88c5\ub83f\uc246\u8c8a\u960f\ud7e8(\u88c5\ub83f\uc246\u8c8a\u960f\ud7e8::\uae5d\u6b0d\uf9c5\u5245\ub8be\u156b), ldc:float(1.0f), add:float(mul:float(invokevirtual:float(Random::nextFloat, var_5_5F:Random), ldc:float(0.1f)), ldc:float(0.9f)), ldc:boolean(0))
                    looporswitchbreak()
                
                case 1039:
                    invokevirtual:void(\u16f6\u61a4\u5db4\u4c04\u64ab\u9255::\u34df\u0c95\u8c8a\u3d64\ufcaf\ud36e, getfield:\u16f6\u61a4\u5db4\u4c04\u64ab\u9255(\u9937\u7d52\u3e75\u98a4\u8aa5\u7006::\ud51e\u9033\u8df4\u7043\u5f50\u8aa5, this:\u9937\u7d52\u3e75\u98a4\u8aa5\u7006), p2:\u6b0d\ud171\uc7fe\u52d3\uafe7\u6c56, getstatic:\u6b0d\u3d64\u446c\u6cfe\u5f50\u9937(\ua068\uf995\u3711\u4bc8\u8c8a\u0c95::\u3e75\u16f6\ubff1\u385b\uafe7\u7873), getstatic:\u88c5\ub83f\uc246\u8c8a\u960f\ud7e8(\u88c5\ub83f\uc246\u8c8a\u960f\ud7e8::\u3711\u2dcc\u8350\uc229\u9a18\u7873), ldc:float(0.3f), add:float(mul:float(invokevirtual:float(Random::nextFloat, getfield:Random(\u16f6\u61a4\u5db4\u4c04\u64ab\u9255::\u3776\ub113\u8c8a\u8709\ub18d\uc2bd, getfield:\u16f6\u61a4\u5db4\u4c04\u64ab\u9255(\u9937\u7d52\u3e75\u98a4\u8aa5\u7006::\ud51e\u9033\u8df4\u7043\u5f50\u8aa5, this:\u9937\u7d52\u3e75\u98a4\u8aa5\u7006))), ldc:float(0.1f)), ldc:float(0.9f)), ldc:boolean(0))
                    looporswitchbreak()
                
                case 1040:
                    invokevirtual:void(\u16f6\u61a4\u5db4\u4c04\u64ab\u9255::\u34df\u0c95\u8c8a\u3d64\ufcaf\ud36e, getfield:\u16f6\u61a4\u5db4\u4c04\u64ab\u9255(\u9937\u7d52\u3e75\u98a4\u8aa5\u7006::\ud51e\u9033\u8df4\u7043\u5f50\u8aa5, this:\u9937\u7d52\u3e75\u98a4\u8aa5\u7006), p2:\u6b0d\ud171\uc7fe\u52d3\uafe7\u6c56, getstatic:\u6b0d\u3d64\u446c\u6cfe\u5f50\u9937(\ua068\uf995\u3711\u4bc8\u8c8a\u0c95::\u3bc9\ub102\ub171\u624e\ub18d\u92ee), getstatic:\u88c5\ub83f\uc246\u8c8a\u960f\ud7e8(\u88c5\ub83f\uc246\u8c8a\u960f\ud7e8::\uc87f\u6bb9\u4975\u760c\u71f1\u3bd6), ldc:float(2.0f), add:float(mul:float(sub:float(invokevirtual:float(Random::nextFloat, var_5_5F:Random), invokevirtual:float(Random::nextFloat, var_5_5F:Random)), ldc:float(0.2f)), ldc:float(1.0f)), ldc:boolean(0))
                    looporswitchbreak()
                
                case 1041:
                    invokevirtual:void(\u16f6\u61a4\u5db4\u4c04\u64ab\u9255::\u34df\u0c95\u8c8a\u3d64\ufcaf\ud36e, getfield:\u16f6\u61a4\u5db4\u4c04\u64ab\u9255(\u9937\u7d52\u3e75\u98a4\u8aa5\u7006::\ud51e\u9033\u8df4\u7043\u5f50\u8aa5, this:\u9937\u7d52\u3e75\u98a4\u8aa5\u7006), p2:\u6b0d\ud171\uc7fe\u52d3\uafe7\u6c56, getstatic:\u6b0d\u3d64\u446c\u6cfe\u5f50\u9937(\ua068\uf995\u3711\u4bc8\u8c8a\u0c95::\uc29a\ud523\ube23\u74b1\ub19c\u839e), getstatic:\u88c5\ub83f\uc246\u8c8a\u960f\ud7e8(\u88c5\ub83f\uc246\u8c8a\u960f\ud7e8::\uc87f\u6bb9\u4975\u760c\u71f1\u3bd6), ldc:float(2.0f), add:float(mul:float(sub:float(invokevirtual:float(Random::nextFloat, var_5_5F:Random), invokevirtual:float(Random::nextFloat, var_5_5F:Random)), ldc:float(0.2f)), ldc:float(1.0f)), ldc:boolean(0))
                    looporswitchbreak()
                
                case 1042:
                    invokevirtual:void(\u16f6\u61a4\u5db4\u4c04\u64ab\u9255::\u34df\u0c95\u8c8a\u3d64\ufcaf\ud36e, getfield:\u16f6\u61a4\u5db4\u4c04\u64ab\u9255(\u9937\u7d52\u3e75\u98a4\u8aa5\u7006::\ud51e\u9033\u8df4\u7043\u5f50\u8aa5, this:\u9937\u7d52\u3e75\u98a4\u8aa5\u7006), p2:\u6b0d\ud171\uc7fe\u52d3\uafe7\u6c56, getstatic:\u6b0d\u3d64\u446c\u6cfe\u5f50\u9937(\ua068\uf995\u3711\u4bc8\u8c8a\u0c95::\u6bb9\ud523\u88c5\uff55\u927d\u3bc9), getstatic:\u88c5\ub83f\uc246\u8c8a\u960f\ud7e8(\u88c5\ub83f\uc246\u8c8a\u960f\ud7e8::\uae5d\u6b0d\uf9c5\u5245\ub8be\u156b), ldc:float(1.0f), add:float(mul:float(invokevirtual:float(Random::nextFloat, getfield:Random(\u16f6\u61a4\u5db4\u4c04\u64ab\u9255::\u3776\ub113\u8c8a\u8709\ub18d\uc2bd, getfield:\u16f6\u61a4\u5db4\u4c04\u64ab\u9255(\u9937\u7d52\u3e75\u98a4\u8aa5\u7006::\ud51e\u9033\u8df4\u7043\u5f50\u8aa5, this:\u9937\u7d52\u3e75\u98a4\u8aa5\u7006))), ldc:float(0.1f)), ldc:float(0.9f)), ldc:boolean(0))
                    looporswitchbreak()
                
                case 1043:
                    invokevirtual:void(\u16f6\u61a4\u5db4\u4c04\u64ab\u9255::\u34df\u0c95\u8c8a\u3d64\ufcaf\ud36e, getfield:\u16f6\u61a4\u5db4\u4c04\u64ab\u9255(\u9937\u7d52\u3e75\u98a4\u8aa5\u7006::\ud51e\u9033\u8df4\u7043\u5f50\u8aa5, this:\u9937\u7d52\u3e75\u98a4\u8aa5\u7006), p2:\u6b0d\ud171\uc7fe\u52d3\uafe7\u6c56, getstatic:\u6b0d\u3d64\u446c\u6cfe\u5f50\u9937(\ua068\uf995\u3711\u4bc8\u8c8a\u0c95::\uff55\u76bc\u3bc9\u6b0d\ua6bd\u8640), getstatic:\u88c5\ub83f\uc246\u8c8a\u960f\ud7e8(\u88c5\ub83f\uc246\u8c8a\u960f\ud7e8::\uae5d\u6b0d\uf9c5\u5245\ub8be\u156b), ldc:float(1.0f), add:float(mul:float(invokevirtual:float(Random::nextFloat, getfield:Random(\u16f6\u61a4\u5db4\u4c04\u64ab\u9255::\u3776\ub113\u8c8a\u8709\ub18d\uc2bd, getfield:\u16f6\u61a4\u5db4\u4c04\u64ab\u9255(\u9937\u7d52\u3e75\u98a4\u8aa5\u7006::\ud51e\u9033\u8df4\u7043\u5f50\u8aa5, this:\u9937\u7d52\u3e75\u98a4\u8aa5\u7006))), ldc:float(0.1f)), ldc:float(0.9f)), ldc:boolean(0))
                    looporswitchbreak()
                
                case 1044:
                    invokevirtual:void(\u16f6\u61a4\u5db4\u4c04\u64ab\u9255::\u34df\u0c95\u8c8a\u3d64\ufcaf\ud36e, getfield:\u16f6\u61a4\u5db4\u4c04\u64ab\u9255(\u9937\u7d52\u3e75\u98a4\u8aa5\u7006::\ud51e\u9033\u8df4\u7043\u5f50\u8aa5, this:\u9937\u7d52\u3e75\u98a4\u8aa5\u7006), p2:\u6b0d\ud171\uc7fe\u52d3\uafe7\u6c56, getstatic:\u6b0d\u3d64\u446c\u6cfe\u5f50\u9937(\ua068\uf995\u3711\u4bc8\u8c8a\u0c95::\u52d3\ub70c\u3dd3\u5654\ua3b4\u0a06), getstatic:\u88c5\ub83f\uc246\u8c8a\u960f\ud7e8(\u88c5\ub83f\uc246\u8c8a\u960f\ud7e8::\uae5d\u6b0d\uf9c5\u5245\ub8be\u156b), ldc:float(1.0f), add:float(mul:float(invokevirtual:float(Random::nextFloat, getfield:Random(\u16f6\u61a4\u5db4\u4c04\u64ab\u9255::\u3776\ub113\u8c8a\u8709\ub18d\uc2bd, getfield:\u16f6\u61a4\u5db4\u4c04\u64ab\u9255(\u9937\u7d52\u3e75\u98a4\u8aa5\u7006::\ud51e\u9033\u8df4\u7043\u5f50\u8aa5, this:\u9937\u7d52\u3e75\u98a4\u8aa5\u7006))), ldc:float(0.1f)), ldc:float(0.9f)), ldc:boolean(0))
                    looporswitchbreak()
                
                case 1500:
                    invokestatic:void(\u5fe1\u64f2\u5654\u6b0d\u3dd3\u6b5f::\u494c\ufe34\ud12e\u5db4\uc229\u16f6, getfield:\u16f6\u61a4\u5db4\u4c04\u64ab\u9255[expected:\uf9c5\ud158\u4975\uf94d\ud523\uc31c](\u9937\u7d52\u3e75\u98a4\u8aa5\u7006::\ud51e\u9033\u8df4\u7043\u5f50\u8aa5, this:\u9937\u7d52\u3e75\u98a4\u8aa5\u7006), p2:\u6b0d\ud171\uc7fe\u52d3\uafe7\u6c56, cmpgt:boolean(p3:int, ldc:int(0)))
                    looporswitchbreak()
                
                case 1501:
                    invokevirtual:void(\u16f6\u61a4\u5db4\u4c04\u64ab\u9255::\u34df\u0c95\u8c8a\u3d64\ufcaf\ud36e, getfield:\u16f6\u61a4\u5db4\u4c04\u64ab\u9255(\u9937\u7d52\u3e75\u98a4\u8aa5\u7006::\ud51e\u9033\u8df4\u7043\u5f50\u8aa5, this:\u9937\u7d52\u3e75\u98a4\u8aa5\u7006), p2:\u6b0d\ud171\uc7fe\u52d3\uafe7\u6c56, getstatic:\u6b0d\u3d64\u446c\u6cfe\u5f50\u9937(\ua068\uf995\u3711\u4bc8\u8c8a\u0c95::\ucfaf\u6cfe\u8308\ucef1\uceb8\uc229), getstatic:\u88c5\ub83f\uc246\u8c8a\u960f\ud7e8(\u88c5\ub83f\uc246\u8c8a\u960f\ud7e8::\uae5d\u6b0d\uf9c5\u5245\ub8be\u156b), ldc:float(0.5f), add:float(ldc:float(2.6f), mul:float(sub:float(invokevirtual:float(Random::nextFloat, var_5_5F:Random), invokevirtual:float(Random::nextFloat, var_5_5F:Random)), ldc:float(0.8f))), ldc:boolean(0))
                    var_6_7F5 = ldc:int(0)
                    
                    while (cmplt:boolean(var_6_7F5:int, ldc:int(8))) {
                        invokevirtual:void(\u16f6\u61a4\u5db4\u4c04\u64ab\u9255::\u385b\u8c8a\uf9c5\u6ec6\ufcaf\u5fe1, getfield:\u16f6\u61a4\u5db4\u4c04\u64ab\u9255(\u9937\u7d52\u3e75\u98a4\u8aa5\u7006::\ud51e\u9033\u8df4\u7043\u5f50\u8aa5, this:\u9937\u7d52\u3e75\u98a4\u8aa5\u7006), getstatic:\uc910\u8d98\u8aa5\u3d4b\u6435\u5140[expected:\u8df4\u97e6\u93a2\u760c\u6fb0\u8c8a](\u34df\u8d98\ua3b4\u873d\ud217\u4c2b::\u6bb9\uc31c\ud523\uceb8\u8cae\ubf56), add:double(i2d:double(invokevirtual:int(\u3a62\uc9f6\u3776\u4f52\ua068\u34df::\u8aa5\u97b7\u4daf\u72f1\u600f\u8cae, p2:\u6b0d\ud171\uc7fe\u52d3\uafe7\u6c56[expected:\u3a62\uc9f6\u3776\u4f52\ua068\u34df])), invokevirtual:double(Random::nextDouble, var_5_5F:Random)), add:double(i2d:double(invokevirtual:int(\u3a62\uc9f6\u3776\u4f52\ua068\u34df::\u9af2\u8350\u8350\u93a2\u494c\u624e, p2:\u6b0d\ud171\uc7fe\u52d3\uafe7\u6c56[expected:\u3a62\uc9f6\u3776\u4f52\ua068\u34df])), ldc:double(1.2)), add:double(i2d:double(invokevirtual:int(\u3a62\uc9f6\u3776\u4f52\ua068\u34df::\u3e75\uc29a\u071d\u4d85\ubded\ub70c, p2:\u6b0d\ud171\uc7fe\u52d3\uafe7\u6c56[expected:\u3a62\uc9f6\u3776\u4f52\ua068\u34df])), invokevirtual:double(Random::nextDouble, var_5_5F:Random)), ldc:double(0.0), ldc:double(0.0), ldc:double(0.0))
                        inc:int(var_6_7F5, ldc:int(1))
                    }
                    
                    looporswitchbreak()
                
                case 1502:
                    invokevirtual:void(\u16f6\u61a4\u5db4\u4c04\u64ab\u9255::\u34df\u0c95\u8c8a\u3d64\ufcaf\ud36e, getfield:\u16f6\u61a4\u5db4\u4c04\u64ab\u9255(\u9937\u7d52\u3e75\u98a4\u8aa5\u7006::\ud51e\u9033\u8df4\u7043\u5f50\u8aa5, this:\u9937\u7d52\u3e75\u98a4\u8aa5\u7006), p2:\u6b0d\ud171\uc7fe\u52d3\uafe7\u6c56, getstatic:\u6b0d\u3d64\u446c\u6cfe\u5f50\u9937(\ua068\uf995\u3711\u4bc8\u8c8a\u0c95::\uc2bd\u16f6\u3504\u8350\u5bc4\u8709), getstatic:\u88c5\ub83f\uc246\u8c8a\u960f\ud7e8(\u88c5\ub83f\uc246\u8c8a\u960f\ud7e8::\uae5d\u6b0d\uf9c5\u5245\ub8be\u156b), ldc:float(0.5f), add:float(ldc:float(2.6f), mul:float(sub:float(invokevirtual:float(Random::nextFloat, var_5_5F:Random), invokevirtual:float(Random::nextFloat, var_5_5F:Random)), ldc:float(0.8f))), ldc:boolean(0))
                    var_6_859 = ldc:int(0)
                    
                    while (cmplt:boolean(var_6_859:int, ldc:int(5))) {
                        invokevirtual:void(\u16f6\u61a4\u5db4\u4c04\u64ab\u9255::\u385b\u8c8a\uf9c5\u6ec6\ufcaf\u5fe1, getfield:\u16f6\u61a4\u5db4\u4c04\u64ab\u9255(\u9937\u7d52\u3e75\u98a4\u8aa5\u7006::\ud51e\u9033\u8df4\u7043\u5f50\u8aa5, this:\u9937\u7d52\u3e75\u98a4\u8aa5\u7006), getstatic:\uc910\u8d98\u8aa5\u3d4b\u6435\u5140[expected:\u8df4\u97e6\u93a2\u760c\u6fb0\u8c8a](\u34df\u8d98\ua3b4\u873d\ud217\u4c2b::\u8640\u61a4\u5d20\u6c52\ubcb0\u6b5f), add:double(add:double(i2d:double(invokevirtual:int(\u3a62\uc9f6\u3776\u4f52\ua068\u34df::\u8aa5\u97b7\u4daf\u72f1\u600f\u8cae, p2:\u6b0d\ud171\uc7fe\u52d3\uafe7\u6c56[expected:\u3a62\uc9f6\u3776\u4f52\ua068\u34df])), mul:double(invokevirtual:double(Random::nextDouble, var_5_5F:Random), ldc:double(0.6))), ldc:double(0.2)), add:double(add:double(i2d:double(invokevirtual:int(\u3a62\uc9f6\u3776\u4f52\ua068\u34df::\u9af2\u8350\u8350\u93a2\u494c\u624e, p2:\u6b0d\ud171\uc7fe\u52d3\uafe7\u6c56[expected:\u3a62\uc9f6\u3776\u4f52\ua068\u34df])), mul:double(invokevirtual:double(Random::nextDouble, var_5_5F:Random), ldc:double(0.6))), ldc:double(0.2)), add:double(add:double(i2d:double(invokevirtual:int(\u3a62\uc9f6\u3776\u4f52\ua068\u34df::\u3e75\uc29a\u071d\u4d85\ubded\ub70c, p2:\u6b0d\ud171\uc7fe\u52d3\uafe7\u6c56[expected:\u3a62\uc9f6\u3776\u4f52\ua068\u34df])), mul:double(invokevirtual:double(Random::nextDouble, var_5_5F:Random), ldc:double(0.6))), ldc:double(0.2)), ldc:double(0.0), ldc:double(0.0), ldc:double(0.0))
                        inc:int(var_6_859, ldc:int(1))
                    }
                    
                    looporswitchbreak()
                
                case 1503:
                    invokevirtual:void(\u16f6\u61a4\u5db4\u4c04\u64ab\u9255::\u34df\u0c95\u8c8a\u3d64\ufcaf\ud36e, getfield:\u16f6\u61a4\u5db4\u4c04\u64ab\u9255(\u9937\u7d52\u3e75\u98a4\u8aa5\u7006::\ud51e\u9033\u8df4\u7043\u5f50\u8aa5, this:\u9937\u7d52\u3e75\u98a4\u8aa5\u7006), p2:\u6b0d\ud171\uc7fe\u52d3\uafe7\u6c56, getstatic:\u6b0d\u3d64\u446c\u6cfe\u5f50\u9937(\ua068\uf995\u3711\u4bc8\u8c8a\u0c95::\u5d20\u6c52\u40a9\uceb8\u8aa5\u7049), getstatic:\u88c5\ub83f\uc246\u8c8a\u960f\ud7e8(\u88c5\ub83f\uc246\u8c8a\u960f\ud7e8::\uae5d\u6b0d\uf9c5\u5245\ub8be\u156b), ldc:float(1.0f), ldc:float(1.0f), ldc:boolean(0))
                    var_6_8CE = ldc:int(0)
                    
                    while (cmplt:boolean(var_6_8CE:int, ldc:int(16))) {
                        invokevirtual:void(\u16f6\u61a4\u5db4\u4c04\u64ab\u9255::\u385b\u8c8a\uf9c5\u6ec6\ufcaf\u5fe1, getfield:\u16f6\u61a4\u5db4\u4c04\u64ab\u9255(\u9937\u7d52\u3e75\u98a4\u8aa5\u7006::\ud51e\u9033\u8df4\u7043\u5f50\u8aa5, this:\u9937\u7d52\u3e75\u98a4\u8aa5\u7006), getstatic:\uc910\u8d98\u8aa5\u3d4b\u6435\u5140[expected:\u8df4\u97e6\u93a2\u760c\u6fb0\u8c8a](\u34df\u8d98\ua3b4\u873d\ud217\u4c2b::\u8640\u61a4\u5d20\u6c52\ubcb0\u6b5f), add:double(i2d:double(invokevirtual:int(\u3a62\uc9f6\u3776\u4f52\ua068\u34df::\u8aa5\u97b7\u4daf\u72f1\u600f\u8cae, p2:\u6b0d\ud171\uc7fe\u52d3\uafe7\u6c56[expected:\u3a62\uc9f6\u3776\u4f52\ua068\u34df])), div:double(add:double(ldc:double(5.0), mul:double(invokevirtual:double(Random::nextDouble, var_5_5F:Random), ldc:double(6.0))), ldc:double(16.0))), add:double(i2d:double(invokevirtual:int(\u3a62\uc9f6\u3776\u4f52\ua068\u34df::\u9af2\u8350\u8350\u93a2\u494c\u624e, p2:\u6b0d\ud171\uc7fe\u52d3\uafe7\u6c56[expected:\u3a62\uc9f6\u3776\u4f52\ua068\u34df])), ldc:double(0.8125)), add:double(i2d:double(invokevirtual:int(\u3a62\uc9f6\u3776\u4f52\ua068\u34df::\u3e75\uc29a\u071d\u4d85\ubded\ub70c, p2:\u6b0d\ud171\uc7fe\u52d3\uafe7\u6c56[expected:\u3a62\uc9f6\u3776\u4f52\ua068\u34df])), div:double(add:double(ldc:double(5.0), mul:double(invokevirtual:double(Random::nextDouble, var_5_5F:Random), ldc:double(6.0))), ldc:double(16.0))), ldc:double(0.0), ldc:double(0.0), ldc:double(0.0))
                        inc:int(var_6_8CE, ldc:int(1))
                    }
                    
                    looporswitchbreak()
                
                case 2000:
                    var_6_935 = invokestatic:\u760c\u4975\u4179\uc246\u8640\u64f2(\u760c\u4975\u4179\uc246\u8640\u64f2::\u6435\ufe34\u3c25\u4f4a\u72f1\uc7fe, p3:int)
                    var_7_93C = invokevirtual:int(\u760c\u4975\u4179\uc246\u8640\u64f2::\u4bc8\u9255\ub19c\u5f50\u12cb\u392e, var_6_935:\u760c\u4975\u4179\uc246\u8640\u64f2)
                    var_8_943 = invokevirtual:int(\u760c\u4975\u4179\uc246\u8640\u64f2::\u64f2\u0c95\u3d64\u2dcc\uc84e\uc4d2, var_6_935:\u760c\u4975\u4179\uc246\u8640\u64f2)
                    var_9_94A = invokevirtual:int(\u760c\u4975\u4179\uc246\u8640\u64f2::\u88c5\u3e2a\u600f\u99f7\u8308\ufe34, var_6_935:\u760c\u4975\u4179\uc246\u8640\u64f2)
                    var_10_95D = add:double(add:double(i2d:double(invokevirtual:int(\u3a62\uc9f6\u3776\u4f52\ua068\u34df::\u8aa5\u97b7\u4daf\u72f1\u600f\u8cae, p2:\u6b0d\ud171\uc7fe\u52d3\uafe7\u6c56[expected:\u3a62\uc9f6\u3776\u4f52\ua068\u34df])), mul:double(i2d:double(var_7_93C:int), ldc:double(0.6))), ldc:double(0.5))
                    var_12_970 = add:double(add:double(i2d:double(invokevirtual:int(\u3a62\uc9f6\u3776\u4f52\ua068\u34df::\u9af2\u8350\u8350\u93a2\u494c\u624e, p2:\u6b0d\ud171\uc7fe\u52d3\uafe7\u6c56[expected:\u3a62\uc9f6\u3776\u4f52\ua068\u34df])), mul:double(i2d:double(var_8_943:int), ldc:double(0.6))), ldc:double(0.5))
                    var_14_983 = add:double(add:double(i2d:double(invokevirtual:int(\u3a62\uc9f6\u3776\u4f52\ua068\u34df::\u3e75\uc29a\u071d\u4d85\ubded\ub70c, p2:\u6b0d\ud171\uc7fe\u52d3\uafe7\u6c56[expected:\u3a62\uc9f6\u3776\u4f52\ua068\u34df])), mul:double(i2d:double(var_9_94A:int), ldc:double(0.6))), ldc:double(0.5))
                    var_16_986 = ldc:int(0)
                    
                    while (cmplt:boolean(var_16_986:int, ldc:int(10))) {
                        var_17_99C = add:double(mul:double(invokevirtual:double(Random::nextDouble, var_5_5F:Random), ldc:double(0.2)), ldc:double(0.01))
                        invokespecial:void(\u9937\u7d52\u3e75\u98a4\u8aa5\u7006::\u9af2\u4d85\u5245\uc2e8\uc9f6\u92ff, this:\u9937\u7d52\u3e75\u98a4\u8aa5\u7006, getstatic:\uc910\u8d98\u8aa5\u3d4b\u6435\u5140(\u34df\u8d98\ua3b4\u873d\ud217\u4c2b::\u8640\u61a4\u5d20\u6c52\ubcb0\u6b5f), add:double(add:double(var_10_95D:double, mul:double(i2d:double(var_7_93C:int), ldc:double(0.01))), mul:double(mul:double(sub:double(invokevirtual:double(Random::nextDouble, var_5_5F:Random), ldc:double(0.5)), i2d:double(var_9_94A:int)), ldc:double(0.5))), add:double(add:double(var_12_970:double, mul:double(i2d:double(var_8_943:int), ldc:double(0.01))), mul:double(mul:double(sub:double(invokevirtual:double(Random::nextDouble, var_5_5F:Random), ldc:double(0.5)), i2d:double(var_8_943:int)), ldc:double(0.5))), add:double(add:double(var_14_983:double, mul:double(i2d:double(var_9_94A:int), ldc:double(0.01))), mul:double(mul:double(sub:double(invokevirtual:double(Random::nextDouble, var_5_5F:Random), ldc:double(0.5)), i2d:double(var_7_93C:int)), ldc:double(0.5))), add:double(mul:double(i2d:double(var_7_93C:int), var_17_99C:double), mul:double(invokevirtual:double(Random::nextGaussian, var_5_5F:Random), ldc:double(0.01))), add:double(mul:double(i2d:double(var_8_943:int), var_17_99C:double), mul:double(invokevirtual:double(Random::nextGaussian, var_5_5F:Random), ldc:double(0.01))), add:double(mul:double(i2d:double(var_9_94A:int), var_17_99C:double), mul:double(invokevirtual:double(Random::nextGaussian, var_5_5F:Random), ldc:double(0.01))))
                        inc:int(var_16_986, ldc:int(1))
                    }
                    
                    looporswitchbreak()
                
                case 2001:
                    var_16_A4F = invokestatic:\u8413\u7e3f\uc910\uf94d\u5654\u6b0d(\ub1b9\u8cae\u7d52\u759a\u3e2a\u527a::\u6d69\u67d0\u7e3f\u56bd\u8bb0\ucb79, p3:int)
                    
                    if (logicalnot:boolean(invokestatic:boolean(\ub1b9\u4c04\u8cae\u8cae\u647c\u51b2::\u5654\u983f\u8c8a\u5f50\u1833\u2dcc, var_16_A4F:\u8413\u7e3f\uc910\uf94d\u5654\u6b0d, getfield:\u16f6\u61a4\u5db4\u4c04\u64ab\u9255[expected:\u718f\u6435\uc31c\u4ab3\u98a4](\u9937\u7d52\u3e75\u98a4\u8aa5\u7006::\ud51e\u9033\u8df4\u7043\u5f50\u8aa5, this:\u9937\u7d52\u3e75\u98a4\u8aa5\u7006), p2:\u6b0d\ud171\uc7fe\u52d3\uafe7\u6c56))) {
                        var_17_A63 = invokevirtual:\u74b1\u8bb0\ub32d\u8709\uc4d2\uc246(\u7043\u8c8a\u8c8a\u4f4a\ufcaf\u839e::\u7049\uafe7\u8413\u7049\uc910\u873d, var_16_A4F:\u8413\u7e3f\uc910\uf94d\u5654\u6b0d[expected:\u7043\u8c8a\u8c8a\u4f4a\ufcaf\u839e])
                        
                        if (invokevirtual:boolean(\u71ae\u5fe1\u0b8e\u5140\uf995\u927d::\uc87f\u7af6\u7043\ub19c\uc84e\u4c04, getstatic:\u71ae\u5fe1\u0b8e\u5140\uf995\u927d(\u6c52\u873d\uc84e\u7ce1\u4daf\u8308::\u7af6\u183a\u97e6\uc4d2\u4d85\uc9f6))) {
                            var_17_A63 = checkcast:\u74b1\u8bb0\ub32d\u8709\uc4d2\uc246(\u7c6b\u7c6b\ubefe\u385b\u3c25.\u74b1\u8bb0\ub32d\u8709\uc4d2\uc246.class, invokestatic:Object[expected:\u74b1\u8bb0\ub32d\u8709\uc4d2\uc246](\u6c52\u873d\uc84e\u7ce1\u4daf\u8308::\u7af6\u97e6\u51fa\u8df4\ub6ab\ud523, var_16_A4F:\u8413\u7e3f\uc910\uf94d\u5654\u6b0d[expected:Object], getstatic:\u71ae\u5fe1\u0b8e\u5140\uf995\u927d(\u6c52\u873d\uc84e\u7ce1\u4daf\u8308::\u7af6\u183a\u97e6\uc4d2\u4d85\uc9f6), initarray:Object[](java.lang.Object[].class, getfield:\u16f6\u61a4\u5db4\u4c04\u64ab\u9255[expected:Object](\u9937\u7d52\u3e75\u98a4\u8aa5\u7006::\ud51e\u9033\u8df4\u7043\u5f50\u8aa5, this:\u9937\u7d52\u3e75\u98a4\u8aa5\u7006), p2:\u6b0d\ud171\uc7fe\u52d3\uafe7\u6c56[expected:Object], aconstnull:Object())))
                        }
                        
                        invokevirtual:void(\u16f6\u61a4\u5db4\u4c04\u64ab\u9255::\u34df\u0c95\u8c8a\u3d64\ufcaf\ud36e, getfield:\u16f6\u61a4\u5db4\u4c04\u64ab\u9255(\u9937\u7d52\u3e75\u98a4\u8aa5\u7006::\ud51e\u9033\u8df4\u7043\u5f50\u8aa5, this:\u9937\u7d52\u3e75\u98a4\u8aa5\u7006), p2:\u6b0d\ud171\uc7fe\u52d3\uafe7\u6c56, invokevirtual:\u6b0d\u3d64\u446c\u6cfe\u5f50\u9937(\u74b1\u8bb0\ub32d\u8709\uc4d2\uc246::\ub171\ucfaf\u51b2\u8c8a\u392e\u6bb9, var_17_A63:\u74b1\u8bb0\ub32d\u8709\uc4d2\uc246), getstatic:\u88c5\ub83f\uc246\u8c8a\u960f\ud7e8(\u88c5\ub83f\uc246\u8c8a\u960f\ud7e8::\uae5d\u6b0d\uf9c5\u5245\ub8be\u156b), div:float(add:float(invokevirtual:float(\u74b1\u8bb0\ub32d\u8709\uc4d2\uc246::\u34df\u5654\u62da\u9af2\u8709\ua61f, var_17_A63:\u74b1\u8bb0\ub32d\u8709\uc4d2\uc246), ldc:float(1.0f)), ldc:float(2.0f)), mul:float(invokevirtual:float(\u74b1\u8bb0\ub32d\u8709\uc4d2\uc246::\u8258\u6c52\u93a2\u6bb9\u4492\u8389, var_17_A63:\u74b1\u8bb0\ub32d\u8709\uc4d2\uc246), ldc:float(0.8f)), ldc:boolean(0))
                    }
                    
                    invokevirtual:void(\u8df4\u3e75\u52d3\uc9f6\u62da\u9af2::\uc29a\u72f1\ub7dc\u9a18\u3d64\u5140, getfield:\u8df4\u3e75\u52d3\uc9f6\u62da\u9af2(\u67e9\u4daf\u760c\ud217\ua6bd\ubff1::\u4bc8\uc29a\u5245\ub70c\u183a\u12b2, getfield:\u67e9\u4daf\u760c\ud217\ua6bd\ubff1(\u9937\u7d52\u3e75\u98a4\u8aa5\u7006::\u8df4\u3776\ud171\u7006\u51b2\uf995, this:\u9937\u7d52\u3e75\u98a4\u8aa5\u7006)), p2:\u6b0d\ud171\uc7fe\u52d3\uafe7\u6c56, var_16_A4F:\u8413\u7e3f\uc910\uf94d\u5654\u6b0d)
                    looporswitchbreak()
                
                case 2002:
                case 2007:
                    var_17_AC5 = invokestatic:\u3a62\u5d20\u4f52\uc229\u8308\ud7e8(\u3a62\u5d20\u4f52\uc229\u8308\ud7e8::\u494c\u47c2\u9255\u69d9\u8c8a\u624e, p2:\u6b0d\ud171\uc7fe\u52d3\uafe7\u6c56[expected:\u3a62\uc9f6\u3776\u4f52\ua068\u34df])
                    var_18_AC8 = ldc:int(0)
                    
                    while (cmplt:boolean(var_18_AC8:int, ldc:int(8))) {
                        invokespecial:void(\u9937\u7d52\u3e75\u98a4\u8aa5\u7006::\u9af2\u4d85\u5245\uc2e8\uc9f6\u92ff, this:\u9937\u7d52\u3e75\u98a4\u8aa5\u7006, initobject:\u3504\u8df4\ua3b4\u759a\u3711\uc229(\u3504\u8df4\ua3b4\u759a\u3711\uc229::<init>, getstatic:\ubff1\ud171\uceb8\u4492\u67d0\u8aa5<\u3504\u8df4\ua3b4\u759a\u3711\uc229>(\u34df\u8d98\ua3b4\u873d\ud217\u4c2b::\ua3b4\ucb79\u8640\uc9f6\u9033\u7af6), initobject:\u5fe1\u34df\u7d52\ubefe\uc7fe\ubf56(\u5fe1\u34df\u7d52\ubefe\uc7fe\ubf56::<init>, getstatic:\u9af2\u1833\u156b\u12cb\u7d52\u6c52[expected:\u92ff\u600f\u4f4a\u8aa5\u1187\ub6ab](\u4492\ua562\ud158\u4492\u6bb9\ub70c::\ucef1\u3711\u0b8e\u6d69\u6b0d\u7e3f))), getfield:double(\u3a62\u5d20\u4f52\uc229\u8308\ud7e8::\ubf56\u4c04\u4492\u36d3\u71f1\u12cb, var_17_AC5:\u3a62\u5d20\u4f52\uc229\u8308\ud7e8), getfield:double(\u3a62\u5d20\u4f52\uc229\u8308\ud7e8::\u6bb9\uc29a\u99f7\u7e3f\u6b5f\u156b, var_17_AC5:\u3a62\u5d20\u4f52\uc229\u8308\ud7e8), getfield:double(\u3a62\u5d20\u4f52\uc229\u8308\ud7e8::\ub7dc\ubff1\ub19c\u6198\uc2e8\ufe34, var_17_AC5:\u3a62\u5d20\u4f52\uc229\u8308\ud7e8), mul:double(invokevirtual:double(Random::nextGaussian, var_5_5F:Random), ldc:double(0.15)), mul:double(invokevirtual:double(Random::nextDouble, var_5_5F:Random), ldc:double(0.2)), mul:double(invokevirtual:double(Random::nextGaussian, var_5_5F:Random), ldc:double(0.15)))
                        inc:int(var_18_AC8, ldc:int(1))
                    }
                    
                    var_18_B27 = div:float(i2f:float(and:int(shr:int(p3:int, ldc:int(16)), ldc:int(255))), ldc:float(255.0f))
                    var_19_B37 = div:float(i2f:float(and:int(shr:int(p3:int, ldc:int(8)), ldc:int(255))), ldc:float(255.0f))
                    var_20_B46 = div:float(i2f:float(and:int(shr:int(p3:int, ldc:int(0)), ldc:int(255))), ldc:float(255.0f))
                    var_21_B58 = ternaryop:\uc910\u8d98\u8aa5\u3d4b\u6435\u5140(cmpeq:boolean(p1:int, ldc:int(2007)), getstatic:\uc910\u8d98\u8aa5\u3d4b\u6435\u5140(\u34df\u8d98\ua3b4\u873d\ud217\u4c2b::\u4492\u9a18\ub7dc\uc2bd\u4bc8\uc246), getstatic:\uc910\u8d98\u8aa5\u3d4b\u6435\u5140(\u34df\u8d98\ua3b4\u873d\ud217\u4c2b::\u99f7\ua61f\u2dcc\u4daf\u983f\u52d3))
                    var_22_B5B = ldc:int(0)
                    
                    while (cmplt:boolean(var_22_B5B:int, ldc:int(100))) {
                        var_23_B6D = mul:double(invokevirtual:double(Random::nextDouble, var_5_5F:Random), ldc:double(4.0))
                        var_25_B7C = mul:double(mul:double(invokevirtual:double(Random::nextDouble, var_5_5F:Random), ldc:double(3.141592653589793)), ldc:double(2.0))
                        var_27_B86 = mul:double(invokestatic:double(Math::cos, var_25_B7C:double), var_23_B6D:double)
                        var_29_B95 = add:double(ldc:double(0.01), mul:double(invokevirtual:double(Random::nextDouble, var_5_5F:Random), ldc:double(0.5)))
                        var_31_B9F = mul:double(invokestatic:double(Math::sin, var_25_B7C:double), var_23_B6D:double)
                        var_33_BD8 = invokespecial:\uff55\u97b7\u6fb0\u8308\u183a\u183a(\u9937\u7d52\u3e75\u98a4\u8aa5\u7006::\u9af2\u4d85\u5245\uc2e8\uc9f6\u92ff, this:\u9937\u7d52\u3e75\u98a4\u8aa5\u7006, var_21_B58:\uc910\u8d98\u8aa5\u3d4b\u6435\u5140[expected:\u8df4\u97e6\u93a2\u760c\u6fb0\u8c8a], invokevirtual:boolean(\ubff1\ud171\uceb8\u4492\u67d0\u8aa5<T>::\u4f4a\u836c\ud523\ub32d\u6d99\u9255, invokeinterface:\ubff1\ud171\uceb8\u4492\u67d0\u8aa5<?>(\u8df4\u97e6\u93a2\u760c\u6fb0\u8c8a::\u8389\u516c\u6fb0\u52d3\ubb2b\uae5d, var_21_B58:\uc910\u8d98\u8aa5\u3d4b\u6435\u5140[expected:\u8df4\u97e6\u93a2\u760c\u6fb0\u8c8a])), add:double(getfield:double(\u3a62\u5d20\u4f52\uc229\u8308\ud7e8::\ubf56\u4c04\u4492\u36d3\u71f1\u12cb, var_17_AC5:\u3a62\u5d20\u4f52\uc229\u8308\ud7e8), mul:double(var_27_B86:double, ldc:double(0.1))), add:double(getfield:double(\u3a62\u5d20\u4f52\uc229\u8308\ud7e8::\u6bb9\uc29a\u99f7\u7e3f\u6b5f\u156b, var_17_AC5:\u3a62\u5d20\u4f52\uc229\u8308\ud7e8), ldc:double(0.3)), add:double(getfield:double(\u3a62\u5d20\u4f52\uc229\u8308\ud7e8::\ub7dc\ubff1\ub19c\u6198\uc2e8\ufe34, var_17_AC5:\u3a62\u5d20\u4f52\uc229\u8308\ud7e8), mul:double(var_31_B9F:double, ldc:double(0.1))), var_27_B86:double, var_29_B95:double, var_31_B9F:double)
                        
                        if (cmpne:boolean(var_33_BD8:\uff55\u97b7\u6fb0\u8308\u183a\u183a, aconstnull:\uff55\u97b7\u6fb0\u8308\u183a\u183a())) {
                            var_34_BEC = add:float(ldc:float(0.75f), mul:float(invokevirtual:float(Random::nextFloat, var_5_5F:Random), ldc:float(0.25f)))
                            invokevirtual:void(\uff55\u97b7\u6fb0\u8308\u183a\u183a::\ud51e\ud4fe\ua6bd\u4179\u965f\u7e3f, var_33_BD8:\uff55\u97b7\u6fb0\u8308\u183a\u183a, mul:float(var_18_B27:float, var_34_BEC:float), mul:float(var_19_B37:float, var_34_BEC:float), mul:float(var_20_B46:float, var_34_BEC:float))
                            invokevirtual:\uff55\u97b7\u6fb0\u8308\u183a\u183a(\uff55\u97b7\u6fb0\u8308\u183a\u183a::\ubff1\u8d90\u8aa5\u3776\uc4d2\ubded, var_33_BD8:\uff55\u97b7\u6fb0\u8308\u183a\u183a, d2f:float(var_23_B6D:double))
                        }
                        
                        inc:int(var_22_B5B, ldc:int(1))
                    }
                    
                    invokevirtual:void(\u16f6\u61a4\u5db4\u4c04\u64ab\u9255::\u34df\u0c95\u8c8a\u3d64\ufcaf\ud36e, getfield:\u16f6\u61a4\u5db4\u4c04\u64ab\u9255(\u9937\u7d52\u3e75\u98a4\u8aa5\u7006::\ud51e\u9033\u8df4\u7043\u5f50\u8aa5, this:\u9937\u7d52\u3e75\u98a4\u8aa5\u7006), p2:\u6b0d\ud171\uc7fe\u52d3\uafe7\u6c56, getstatic:\u6b0d\u3d64\u446c\u6cfe\u5f50\u9937(\ua068\uf995\u3711\u4bc8\u8c8a\u0c95::\u2dcc\u92ff\u8308\u0c95\ucfaf\uc2e8), getstatic:\u88c5\ub83f\uc246\u8c8a\u960f\ud7e8(\u88c5\ub83f\uc246\u8c8a\u960f\ud7e8::\uc87f\u6bb9\u4975\u760c\u71f1\u3bd6), ldc:float(1.0f), add:float(mul:float(invokevirtual:float(Random::nextFloat, var_5_5F:Random), ldc:float(0.1f)), ldc:float(0.9f)), ldc:boolean(0))
                    looporswitchbreak()
                
                case 2003:
                    var_22_C3A = add:double(i2d:double(invokevirtual:int(\u3a62\uc9f6\u3776\u4f52\ua068\u34df::\u8aa5\u97b7\u4daf\u72f1\u600f\u8cae, p2:\u6b0d\ud171\uc7fe\u52d3\uafe7\u6c56[expected:\u3a62\uc9f6\u3776\u4f52\ua068\u34df])), ldc:double(0.5))
                    var_24_C41 = i2d:double(invokevirtual:int(\u3a62\uc9f6\u3776\u4f52\ua068\u34df::\u9af2\u8350\u8350\u93a2\u494c\u624e, p2:\u6b0d\ud171\uc7fe\u52d3\uafe7\u6c56[expected:\u3a62\uc9f6\u3776\u4f52\ua068\u34df]))
                    var_26_C4C = add:double(i2d:double(invokevirtual:int(\u3a62\uc9f6\u3776\u4f52\ua068\u34df::\u3e75\uc29a\u071d\u4d85\ubded\ub70c, p2:\u6b0d\ud171\uc7fe\u52d3\uafe7\u6c56[expected:\u3a62\uc9f6\u3776\u4f52\ua068\u34df])), ldc:double(0.5))
                    var_28_C4F = ldc:int(0)
                    
                    while (cmplt:boolean(var_28_C4F:int, ldc:int(8))) {
                        invokespecial:void(\u9937\u7d52\u3e75\u98a4\u8aa5\u7006::\u9af2\u4d85\u5245\uc2e8\uc9f6\u92ff, this:\u9937\u7d52\u3e75\u98a4\u8aa5\u7006, initobject:\u3504\u8df4\ua3b4\u759a\u3711\uc229(\u3504\u8df4\ua3b4\u759a\u3711\uc229::<init>, getstatic:\ubff1\ud171\uceb8\u4492\u67d0\u8aa5<\u3504\u8df4\ua3b4\u759a\u3711\uc229>(\u34df\u8d98\ua3b4\u873d\ud217\u4c2b::\ua3b4\ucb79\u8640\uc9f6\u9033\u7af6), initobject:\u5fe1\u34df\u7d52\ubefe\uc7fe\ubf56(\u5fe1\u34df\u7d52\ubefe\uc7fe\ubf56::<init>, getstatic:\u9af2\u1833\u156b\u12cb\u7d52\u6c52[expected:\u92ff\u600f\u4f4a\u8aa5\u1187\ub6ab](\u4492\ua562\ud158\u4492\u6bb9\ub70c::\ubefe\ub32d\u8308\uc84e\u92ee\ud51e))), var_22_C3A:double, var_24_C41:double, var_26_C4C:double, mul:double(invokevirtual:double(Random::nextGaussian, var_5_5F:Random), ldc:double(0.15)), mul:double(invokevirtual:double(Random::nextDouble, var_5_5F:Random), ldc:double(0.2)), mul:double(invokevirtual:double(Random::nextGaussian, var_5_5F:Random), ldc:double(0.15)))
                        inc:int(var_28_C4F, ldc:int(1))
                    }
                    
                    var_28_C98 = ldc:double(0.0)
                    
                    while (cmplt:boolean(var_28_C98:double, ldc:double(6.283185307179586))) {
                        invokespecial:void(\u9937\u7d52\u3e75\u98a4\u8aa5\u7006::\u9af2\u4d85\u5245\uc2e8\uc9f6\u92ff, this:\u9937\u7d52\u3e75\u98a4\u8aa5\u7006, getstatic:\uc910\u8d98\u8aa5\u3d4b\u6435\u5140(\u34df\u8d98\ua3b4\u873d\ud217\u4c2b::\u5d20\u67d0\u97b7\u4cd9\u3e2a\ud217), add:double(var_22_C3A:double, mul:double(invokestatic:double(Math::cos, var_28_C98:double), ldc:double(5.0))), sub:double(var_24_C41:double, ldc:double(0.4)), add:double(var_26_C4C:double, mul:double(invokestatic:double(Math::sin, var_28_C98:double), ldc:double(5.0))), mul:double(invokestatic:double(Math::cos, var_28_C98:double), ldc:double(-5.0)), ldc:double(0.0), mul:double(invokestatic:double(Math::sin, var_28_C98:double), ldc:double(-5.0)))
                        invokespecial:void(\u9937\u7d52\u3e75\u98a4\u8aa5\u7006::\u9af2\u4d85\u5245\uc2e8\uc9f6\u92ff, this:\u9937\u7d52\u3e75\u98a4\u8aa5\u7006, getstatic:\uc910\u8d98\u8aa5\u3d4b\u6435\u5140(\u34df\u8d98\ua3b4\u873d\ud217\u4c2b::\u5d20\u67d0\u97b7\u4cd9\u3e2a\ud217), add:double(var_22_C3A:double, mul:double(invokestatic:double(Math::cos, var_28_C98:double), ldc:double(5.0))), sub:double(var_24_C41:double, ldc:double(0.4)), add:double(var_26_C4C:double, mul:double(invokestatic:double(Math::sin, var_28_C98:double), ldc:double(5.0))), mul:double(invokestatic:double(Math::cos, var_28_C98:double), ldc:double(-7.0)), ldc:double(0.0), mul:double(invokestatic:double(Math::sin, var_28_C98:double), ldc:double(-7.0)))
                        var_28_C98 = add:double(var_28_C98:double, ldc:double(0.15707963267948966))
                    }
                    
                    looporswitchbreak()
                
                case 2004:
                    var_28_D22 = ldc:int(0)
                    
                    while (cmplt:boolean(var_28_D22:int, ldc:int(20))) {
                        var_29_D42 = add:double(add:double(i2d:double(invokevirtual:int(\u3a62\uc9f6\u3776\u4f52\ua068\u34df::\u8aa5\u97b7\u4daf\u72f1\u600f\u8cae, p2:\u6b0d\ud171\uc7fe\u52d3\uafe7\u6c56[expected:\u3a62\uc9f6\u3776\u4f52\ua068\u34df])), ldc:double(0.5)), mul:double(sub:double(invokevirtual:double(Random::nextDouble, var_5_5F:Random), ldc:double(0.5)), ldc:double(2.0)))
                        var_31_D5B = add:double(add:double(i2d:double(invokevirtual:int(\u3a62\uc9f6\u3776\u4f52\ua068\u34df::\u9af2\u8350\u8350\u93a2\u494c\u624e, p2:\u6b0d\ud171\uc7fe\u52d3\uafe7\u6c56[expected:\u3a62\uc9f6\u3776\u4f52\ua068\u34df])), ldc:double(0.5)), mul:double(sub:double(invokevirtual:double(Random::nextDouble, var_5_5F:Random), ldc:double(0.5)), ldc:double(2.0)))
                        var_33_D74 = add:double(add:double(i2d:double(invokevirtual:int(\u3a62\uc9f6\u3776\u4f52\ua068\u34df::\u3e75\uc29a\u071d\u4d85\ubded\ub70c, p2:\u6b0d\ud171\uc7fe\u52d3\uafe7\u6c56[expected:\u3a62\uc9f6\u3776\u4f52\ua068\u34df])), ldc:double(0.5)), mul:double(sub:double(invokevirtual:double(Random::nextDouble, var_5_5F:Random), ldc:double(0.5)), ldc:double(2.0)))
                        invokevirtual:void(\u16f6\u61a4\u5db4\u4c04\u64ab\u9255::\u385b\u8c8a\uf9c5\u6ec6\ufcaf\u5fe1, getfield:\u16f6\u61a4\u5db4\u4c04\u64ab\u9255(\u9937\u7d52\u3e75\u98a4\u8aa5\u7006::\ud51e\u9033\u8df4\u7043\u5f50\u8aa5, this:\u9937\u7d52\u3e75\u98a4\u8aa5\u7006), getstatic:\uc910\u8d98\u8aa5\u3d4b\u6435\u5140[expected:\u8df4\u97e6\u93a2\u760c\u6fb0\u8c8a](\u34df\u8d98\ua3b4\u873d\ud217\u4c2b::\u8640\u61a4\u5d20\u6c52\ubcb0\u6b5f), var_29_D42:double, var_31_D5B:double, var_33_D74:double, ldc:double(0.0), ldc:double(0.0), ldc:double(0.0))
                        invokevirtual:void(\u16f6\u61a4\u5db4\u4c04\u64ab\u9255::\u385b\u8c8a\uf9c5\u6ec6\ufcaf\u5fe1, getfield:\u16f6\u61a4\u5db4\u4c04\u64ab\u9255(\u9937\u7d52\u3e75\u98a4\u8aa5\u7006::\ud51e\u9033\u8df4\u7043\u5f50\u8aa5, this:\u9937\u7d52\u3e75\u98a4\u8aa5\u7006), getstatic:\uc910\u8d98\u8aa5\u3d4b\u6435\u5140[expected:\u8df4\u97e6\u93a2\u760c\u6fb0\u8c8a](\u34df\u8d98\ua3b4\u873d\ud217\u4c2b::\u6d69\u3504\u40a9\u5fe1\ub32d\uc246), var_29_D42:double, var_31_D5B:double, var_33_D74:double, ldc:double(0.0), ldc:double(0.0), ldc:double(0.0))
                        inc:int(var_28_D22, ldc:int(1))
                    }
                    
                    looporswitchbreak()
                
                case 2005:
                    invokestatic:void(\u4cd9\u8aa5\u3a62\uc7fe\u5fe1\u8c8a::\ua61f\u120d\u6ec6\ufe34\u6cfe\u4bc8, getfield:\u16f6\u61a4\u5db4\u4c04\u64ab\u9255[expected:\uc4d2\ubefe\ube23\ubded\uc9f6\uc2bd](\u9937\u7d52\u3e75\u98a4\u8aa5\u7006::\ud51e\u9033\u8df4\u7043\u5f50\u8aa5, this:\u9937\u7d52\u3e75\u98a4\u8aa5\u7006), p2:\u6b0d\ud171\uc7fe\u52d3\uafe7\u6c56, p3:int)
                    looporswitchbreak()
                
                case 2006:
                    var_28_DB3 = ldc:int(0)
                    
                    while (cmplt:boolean(var_28_DB3:int, ldc:int(200))) {
                        var_29_DC6 = mul:float(invokevirtual:float(Random::nextFloat, var_5_5F:Random), ldc:float(4.0f))
                        var_30_DD1 = mul:float(invokevirtual:float(Random::nextFloat, var_5_5F:Random), ldc:float(6.2831855f))
                        var_31_DDC = f2d:double(mul:float(invokestatic:float(\u927d\uc7fe\u92ff\u98a4\uc84e\uf9c5::\u88c5\u7ce1\u4ab3\u8350\uae87\u62da, var_30_DD1:float), var_29_DC6:float))
                        var_33_DEB = add:double(ldc:double(0.01), mul:double(invokevirtual:double(Random::nextDouble, var_5_5F:Random), ldc:double(0.5)))
                        var_35_DF6 = f2d:double(mul:float(invokestatic:float(\u927d\uc7fe\u92ff\u98a4\uc84e\uf9c5::\u67d0\u5654\ud158\u72f1\u7bad\ua562, var_30_DD1:float), var_29_DC6:float))
                        var_37_E27 = invokespecial:\uff55\u97b7\u6fb0\u8308\u183a\u183a(\u9937\u7d52\u3e75\u98a4\u8aa5\u7006::\u9af2\u4d85\u5245\uc2e8\uc9f6\u92ff, this:\u9937\u7d52\u3e75\u98a4\u8aa5\u7006, getstatic:\uc910\u8d98\u8aa5\u3d4b\u6435\u5140[expected:\u8df4\u97e6\u93a2\u760c\u6fb0\u8c8a](\u34df\u8d98\ua3b4\u873d\ud217\u4c2b::\u8cae\ua61f\u8413\u385b\ub19c\u4179), ldc:boolean(0), add:double(i2d:double(invokevirtual:int(\u3a62\uc9f6\u3776\u4f52\ua068\u34df::\u8aa5\u97b7\u4daf\u72f1\u600f\u8cae, p2:\u6b0d\ud171\uc7fe\u52d3\uafe7\u6c56[expected:\u3a62\uc9f6\u3776\u4f52\ua068\u34df])), mul:double(var_31_DDC:double, ldc:double(0.1))), add:double(i2d:double(invokevirtual:int(\u3a62\uc9f6\u3776\u4f52\ua068\u34df::\u9af2\u8350\u8350\u93a2\u494c\u624e, p2:\u6b0d\ud171\uc7fe\u52d3\uafe7\u6c56[expected:\u3a62\uc9f6\u3776\u4f52\ua068\u34df])), ldc:double(0.3)), add:double(i2d:double(invokevirtual:int(\u3a62\uc9f6\u3776\u4f52\ua068\u34df::\u3e75\uc29a\u071d\u4d85\ubded\ub70c, p2:\u6b0d\ud171\uc7fe\u52d3\uafe7\u6c56[expected:\u3a62\uc9f6\u3776\u4f52\ua068\u34df])), mul:double(var_35_DF6:double, ldc:double(0.1))), var_31_DDC:double, var_33_DEB:double, var_35_DF6:double)
                        
                        if (cmpne:boolean(var_37_E27:\uff55\u97b7\u6fb0\u8308\u183a\u183a, aconstnull:\uff55\u97b7\u6fb0\u8308\u183a\u183a())) {
                            invokevirtual:\uff55\u97b7\u6fb0\u8308\u183a\u183a(\uff55\u97b7\u6fb0\u8308\u183a\u183a::\ubff1\u8d90\u8aa5\u3776\uc4d2\ubded, var_37_E27:\uff55\u97b7\u6fb0\u8308\u183a\u183a, var_29_DC6:float)
                        }
                        
                        inc:int(var_28_DB3, ldc:int(1))
                    }
                    
                    if (cmpeq:boolean(p3:int, ldc:int(1))) {
                        invokevirtual:void(\u16f6\u61a4\u5db4\u4c04\u64ab\u9255::\u34df\u0c95\u8c8a\u3d64\ufcaf\ud36e, getfield:\u16f6\u61a4\u5db4\u4c04\u64ab\u9255(\u9937\u7d52\u3e75\u98a4\u8aa5\u7006::\ud51e\u9033\u8df4\u7043\u5f50\u8aa5, this:\u9937\u7d52\u3e75\u98a4\u8aa5\u7006), p2:\u6b0d\ud171\uc7fe\u52d3\uafe7\u6c56, getstatic:\u6b0d\u3d64\u446c\u6cfe\u5f50\u9937(\ua068\uf995\u3711\u4bc8\u8c8a\u0c95::\u67e9\u92ff\uc246\u6198\u8709\u4cd9), getstatic:\u88c5\ub83f\uc246\u8c8a\u960f\ud7e8(\u88c5\ub83f\uc246\u8c8a\u960f\ud7e8::\u3711\u2dcc\u8350\uc229\u9a18\u7873), ldc:float(1.0f), add:float(mul:float(invokevirtual:float(Random::nextFloat, var_5_5F:Random), ldc:float(0.1f)), ldc:float(0.9f)), ldc:boolean(0))
                        looporswitchbreak()
                    }
                    
                    looporswitchbreak()
                
                case 2008:
                    invokevirtual:void(\u16f6\u61a4\u5db4\u4c04\u64ab\u9255::\u385b\u8c8a\uf9c5\u6ec6\ufcaf\u5fe1, getfield:\u16f6\u61a4\u5db4\u4c04\u64ab\u9255(\u9937\u7d52\u3e75\u98a4\u8aa5\u7006::\ud51e\u9033\u8df4\u7043\u5f50\u8aa5, this:\u9937\u7d52\u3e75\u98a4\u8aa5\u7006), getstatic:\uc910\u8d98\u8aa5\u3d4b\u6435\u5140[expected:\u8df4\u97e6\u93a2\u760c\u6fb0\u8c8a](\u34df\u8d98\ua3b4\u873d\ud217\u4c2b::\u47c2\u6198\u416d\u4c04\u64f2\u5140), add:double(i2d:double(invokevirtual:int(\u3a62\uc9f6\u3776\u4f52\ua068\u34df::\u8aa5\u97b7\u4daf\u72f1\u600f\u8cae, p2:\u6b0d\ud171\uc7fe\u52d3\uafe7\u6c56[expected:\u3a62\uc9f6\u3776\u4f52\ua068\u34df])), ldc:double(0.5)), add:double(i2d:double(invokevirtual:int(\u3a62\uc9f6\u3776\u4f52\ua068\u34df::\u9af2\u8350\u8350\u93a2\u494c\u624e, p2:\u6b0d\ud171\uc7fe\u52d3\uafe7\u6c56[expected:\u3a62\uc9f6\u3776\u4f52\ua068\u34df])), ldc:double(0.5)), add:double(i2d:double(invokevirtual:int(\u3a62\uc9f6\u3776\u4f52\ua068\u34df::\u3e75\uc29a\u071d\u4d85\ubded\ub70c, p2:\u6b0d\ud171\uc7fe\u52d3\uafe7\u6c56[expected:\u3a62\uc9f6\u3776\u4f52\ua068\u34df])), ldc:double(0.5)), ldc:double(0.0), ldc:double(0.0), ldc:double(0.0))
                    looporswitchbreak()
                
                case 2009:
                    var_28_E8E = ldc:int(0)
                    
                    while (cmplt:boolean(var_28_E8E:int, ldc:int(8))) {
                        invokevirtual:void(\u16f6\u61a4\u5db4\u4c04\u64ab\u9255::\u385b\u8c8a\uf9c5\u6ec6\ufcaf\u5fe1, getfield:\u16f6\u61a4\u5db4\u4c04\u64ab\u9255(\u9937\u7d52\u3e75\u98a4\u8aa5\u7006::\ud51e\u9033\u8df4\u7043\u5f50\u8aa5, this:\u9937\u7d52\u3e75\u98a4\u8aa5\u7006), getstatic:\uc910\u8d98\u8aa5\u3d4b\u6435\u5140[expected:\u8df4\u97e6\u93a2\u760c\u6fb0\u8c8a](\u34df\u8d98\ua3b4\u873d\ud217\u4c2b::\ubff1\u8c8a\u8df4\u12cb\u7c6b\u7873), add:double(i2d:double(invokevirtual:int(\u3a62\uc9f6\u3776\u4f52\ua068\u34df::\u8aa5\u97b7\u4daf\u72f1\u600f\u8cae, p2:\u6b0d\ud171\uc7fe\u52d3\uafe7\u6c56[expected:\u3a62\uc9f6\u3776\u4f52\ua068\u34df])), invokevirtual:double(Random::nextDouble, var_5_5F:Random)), add:double(i2d:double(invokevirtual:int(\u3a62\uc9f6\u3776\u4f52\ua068\u34df::\u9af2\u8350\u8350\u93a2\u494c\u624e, p2:\u6b0d\ud171\uc7fe\u52d3\uafe7\u6c56[expected:\u3a62\uc9f6\u3776\u4f52\ua068\u34df])), ldc:double(1.2)), add:double(i2d:double(invokevirtual:int(\u3a62\uc9f6\u3776\u4f52\ua068\u34df::\u3e75\uc29a\u071d\u4d85\ubded\ub70c, p2:\u6b0d\ud171\uc7fe\u52d3\uafe7\u6c56[expected:\u3a62\uc9f6\u3776\u4f52\ua068\u34df])), invokevirtual:double(Random::nextDouble, var_5_5F:Random)), ldc:double(0.0), ldc:double(0.0), ldc:double(0.0))
                        inc:int(var_28_E8E, ldc:int(1))
                    }
                    
                    looporswitchbreak()
                
                case 3000:
                    invokevirtual:void(\u16f6\u61a4\u5db4\u4c04\u64ab\u9255::\u385b\u8c8a\uf9c5\u6ec6\ufcaf\u5fe1, getfield:\u16f6\u61a4\u5db4\u4c04\u64ab\u9255(\u9937\u7d52\u3e75\u98a4\u8aa5\u7006::\ud51e\u9033\u8df4\u7043\u5f50\u8aa5, this:\u9937\u7d52\u3e75\u98a4\u8aa5\u7006), getstatic:\uc910\u8d98\u8aa5\u3d4b\u6435\u5140[expected:\u8df4\u97e6\u93a2\u760c\u6fb0\u8c8a](\u34df\u8d98\ua3b4\u873d\ud217\u4c2b::\u0b8e\ua562\u624e\u76bc\ud12e\u3e2a), ldc:boolean(1), add:double(i2d:double(invokevirtual:int(\u3a62\uc9f6\u3776\u4f52\ua068\u34df::\u8aa5\u97b7\u4daf\u72f1\u600f\u8cae, p2:\u6b0d\ud171\uc7fe\u52d3\uafe7\u6c56[expected:\u3a62\uc9f6\u3776\u4f52\ua068\u34df])), ldc:double(0.5)), add:double(i2d:double(invokevirtual:int(\u3a62\uc9f6\u3776\u4f52\ua068\u34df::\u9af2\u8350\u8350\u93a2\u494c\u624e, p2:\u6b0d\ud171\uc7fe\u52d3\uafe7\u6c56[expected:\u3a62\uc9f6\u3776\u4f52\ua068\u34df])), ldc:double(0.5)), add:double(i2d:double(invokevirtual:int(\u3a62\uc9f6\u3776\u4f52\ua068\u34df::\u3e75\uc29a\u071d\u4d85\ubded\ub70c, p2:\u6b0d\ud171\uc7fe\u52d3\uafe7\u6c56[expected:\u3a62\uc9f6\u3776\u4f52\ua068\u34df])), ldc:double(0.5)), ldc:double(0.0), ldc:double(0.0), ldc:double(0.0))
                    invokevirtual:void(\u16f6\u61a4\u5db4\u4c04\u64ab\u9255::\u34df\u0c95\u8c8a\u3d64\ufcaf\ud36e, getfield:\u16f6\u61a4\u5db4\u4c04\u64ab\u9255(\u9937\u7d52\u3e75\u98a4\u8aa5\u7006::\ud51e\u9033\u8df4\u7043\u5f50\u8aa5, this:\u9937\u7d52\u3e75\u98a4\u8aa5\u7006), p2:\u6b0d\ud171\uc7fe\u52d3\uafe7\u6c56, getstatic:\u6b0d\u3d64\u446c\u6cfe\u5f50\u9937(\ua068\uf995\u3711\u4bc8\u8c8a\u0c95::\u5140\u71f1\u12cb\u7d52\u960f\u97b7), getstatic:\u88c5\ub83f\uc246\u8c8a\u960f\ud7e8(\u88c5\ub83f\uc246\u8c8a\u960f\ud7e8::\uae5d\u6b0d\uf9c5\u5245\ub8be\u156b), ldc:float(10.0f), mul:float(add:float(ldc:float(1.0f), mul:float(sub:float(invokevirtual:float(Random::nextFloat, getfield:Random(\u16f6\u61a4\u5db4\u4c04\u64ab\u9255::\u3776\ub113\u8c8a\u8709\ub18d\uc2bd, getfield:\u16f6\u61a4\u5db4\u4c04\u64ab\u9255(\u9937\u7d52\u3e75\u98a4\u8aa5\u7006::\ud51e\u9033\u8df4\u7043\u5f50\u8aa5, this:\u9937\u7d52\u3e75\u98a4\u8aa5\u7006))), invokevirtual:float(Random::nextFloat, getfield:Random(\u16f6\u61a4\u5db4\u4c04\u64ab\u9255::\u3776\ub113\u8c8a\u8709\ub18d\uc2bd, getfield:\u16f6\u61a4\u5db4\u4c04\u64ab\u9255(\u9937\u7d52\u3e75\u98a4\u8aa5\u7006::\ud51e\u9033\u8df4\u7043\u5f50\u8aa5, this:\u9937\u7d52\u3e75\u98a4\u8aa5\u7006)))), ldc:float(0.2f))), ldc:float(0.7f)), ldc:boolean(0))
                    looporswitchbreak()
                
                case 3001:
                    invokevirtual:void(\u16f6\u61a4\u5db4\u4c04\u64ab\u9255::\u34df\u0c95\u8c8a\u3d64\ufcaf\ud36e, getfield:\u16f6\u61a4\u5db4\u4c04\u64ab\u9255(\u9937\u7d52\u3e75\u98a4\u8aa5\u7006::\ud51e\u9033\u8df4\u7043\u5f50\u8aa5, this:\u9937\u7d52\u3e75\u98a4\u8aa5\u7006), p2:\u6b0d\ud171\uc7fe\u52d3\uafe7\u6c56, getstatic:\u6b0d\u3d64\u446c\u6cfe\u5f50\u9937(\ua068\uf995\u3711\u4bc8\u8c8a\u0c95::\u72f1\ud217\ubf56\uc2bd\u97e6\u416d), getstatic:\u88c5\ub83f\uc246\u8c8a\u960f\ud7e8(\u88c5\ub83f\uc246\u8c8a\u960f\ud7e8::\u3711\u2dcc\u8350\uc229\u9a18\u7873), ldc:float(64.0f), add:float(ldc:float(0.8f), mul:float(invokevirtual:float(Random::nextFloat, getfield:Random(\u16f6\u61a4\u5db4\u4c04\u64ab\u9255::\u3776\ub113\u8c8a\u8709\ub18d\uc2bd, getfield:\u16f6\u61a4\u5db4\u4c04\u64ab\u9255(\u9937\u7d52\u3e75\u98a4\u8aa5\u7006::\ud51e\u9033\u8df4\u7043\u5f50\u8aa5, this:\u9937\u7d52\u3e75\u98a4\u8aa5\u7006))), ldc:float(0.3f))), ldc:boolean(0))
                    looporswitchbreak()
            }
            
            return:void()
        }
        
        goto(Label_0006)
    }
    
    public void \u759a\ubcb0\u4179\u7e3f\u836c\u5f50(int p0, \u71f1\uc910\u3bc9\u516c\u93a2.\u6b0d\ud171\uc7fe\u52d3\uafe7\u6c56 p1, int p2) {
        // java.lang.IllegalStateException: Unsupported node type: com.strobel.decompiler.ast.Lambda
        //     at com.strobel.decompiler.ast.Error.unsupportedNode(Error.java:32)
        //     at com.strobel.decompiler.ast.GotoRemoval.exit(GotoRemoval.java:612)
        //     at com.strobel.decompiler.ast.GotoRemoval.exit(GotoRemoval.java:586)
        //     at com.strobel.decompiler.ast.GotoRemoval.exit(GotoRemoval.java:590)
        //     at com.strobel.decompiler.ast.GotoRemoval.exit(GotoRemoval.java:586)
        //     at com.strobel.decompiler.ast.GotoRemoval.transformLeaveStatements(GotoRemoval.java:625)
        //     at com.strobel.decompiler.ast.GotoRemoval.removeGotosCore(GotoRemoval.java:57)
        //     at com.strobel.decompiler.ast.GotoRemoval.removeGotos(GotoRemoval.java:53)
        //     at com.strobel.decompiler.ast.AstOptimizer.optimize(AstOptimizer.java:276)
        //     at com.strobel.decompiler.languages.BytecodeAstLanguage.decompileMethod(BytecodeAstLanguage.java:139)
        //     at com.strobel.decompiler.languages.BytecodeAstLanguage.decompileType(BytecodeAstLanguage.java:90)
        //     at com.strobel.decompiler.DecompilerDriver.decompileType(DecompilerDriver.java:336)
        //     at com.strobel.decompiler.DecompilerDriver.decompileJar(DecompilerDriver.java:257)
        //     at com.strobel.decompiler.DecompilerDriver.main(DecompilerDriver.java:141)
    }
    
    public boolean \uc910\u9a18\u3504\u873d\u4cd9\u4c2b() {
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
            return:boolean(logicaland:boolean(invokeinterface:boolean(Set<E>::isEmpty, getfield:Set<\u4ab3\ub1b9\u2dcc\ub8be\ube23\uc910>(\u9937\u7d52\u3e75\u98a4\u8aa5\u7006::\ub70c\ud4fe\u7e3f\ud36e\u59ec\u946b, this:\u9937\u7d52\u3e75\u98a4\u8aa5\u7006)), invokevirtual:boolean(\u56bd\u392e\u7873\u7043\ud158\u9255::\u4f52\uae5d\ucb79\u88c5\ub83f\u7e3f, getfield:\u56bd\u392e\u7873\u7043\ud158\u9255(\u9937\u7d52\u3e75\u98a4\u8aa5\u7006::\ud4fe\u34df\u8cae\u97e6\u51b2\u67d0, this:\u9937\u7d52\u3e75\u98a4\u8aa5\u7006))))
        }
        
        goto(Label_0006)
    }
    
    public void \ud36e\u385b\ub8be\u718f\u6c52\ub8be() {
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
            putfield:boolean(\u9937\u7d52\u3e75\u98a4\u8aa5\u7006::\uceb8\u88c5\u51b2\u6fb0\uf995\u7c6b, this:\u9937\u7d52\u3e75\u98a4\u8aa5\u7006, ldc:boolean(1))
            putfield:boolean(\u9937\u7d52\u3e75\u98a4\u8aa5\u7006::\u392e\u4cd9\u8df4\u624e\u51b2\u69d9, this:\u9937\u7d52\u3e75\u98a4\u8aa5\u7006, ldc:boolean(1))
            return:void()
        }
        
        goto(Label_0006)
    }
    
    public int \ud217\ucef1\u6198\u873d\u8d90\u8cae() {
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
            return:int(arraylength:int(getfield:\u4ab3\ub1b9\u2dcc\ub8be\ube23\uc910[](\u61a4\u946b\u4daf\uc2e8\uc4d2\u5140::\uf9c5\u62da\ub19c\u8753\u92ee\u8c8a, getfield:\u61a4\u946b\u4daf\uc2e8\uc4d2\u5140(\u9937\u7d52\u3e75\u98a4\u8aa5\u7006::\u6b5f\u071d\u8640\uc84e\u7bad\u071d, this:\u9937\u7d52\u3e75\u98a4\u8aa5\u7006))))
        }
        
        goto(Label_0006)
    }
    
    public int \u416d\uae5d\u3dd3\ud171\u9255\u40a9() {
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
            return:int(invokeinterface:int(ObjectList::size, getfield:ObjectList<\u61a4\u7873\u12b2\u760c\u67e9\u4492>(\u9937\u7d52\u3e75\u98a4\u8aa5\u7006::\u92ee\u3dd3\ud7e8\u9a18\u8350\uafe7, this:\u9937\u7d52\u3e75\u98a4\u8aa5\u7006)))
        }
        
        goto(Label_0006)
    }
    
    public int \u98a4\u8640\u7330\u6bb9\uc31c\ua61f() {
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
            return:int(getfield:int(\u9937\u7d52\u3e75\u98a4\u8aa5\u7006::\u3e75\u516c\u3bc9\u36d3\uc29a\u8258, this:\u9937\u7d52\u3e75\u98a4\u8aa5\u7006))
        }
        
        goto(Label_0006)
    }
    
    public int \u4f52\u62da\ud4fe\u8aa5\ua3b4\u647c() {
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
            return:int(getfield:int(\u9937\u7d52\u3e75\u98a4\u8aa5\u7006::\u4daf\uc2e8\ud51e\uc87f\u8308\u5bc4, this:\u9937\u7d52\u3e75\u98a4\u8aa5\u7006))
        }
        
        goto(Label_0006)
    }
    
    public int \ua6bd\u6cfe\ubded\u67e9\ucfaf\u8350() {
        var_1_68 : \ua562\u7330\ub113\u64ab\u6d69\u5fe1
        
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
        
        if (cmpeq:boolean(getfield:\u16f6\u61a4\u5db4\u4c04\u64ab\u9255(\u9937\u7d52\u3e75\u98a4\u8aa5\u7006::\ud51e\u9033\u8df4\u7043\u5f50\u8aa5, this:\u9937\u7d52\u3e75\u98a4\u8aa5\u7006), aconstnull:\u16f6\u61a4\u5db4\u4c04\u64ab\u9255())) {
            return:int(ldc:int(0))
        }
        
        var_1_68 = invokevirtual:\ua562\u7330\ub113\u64ab\u6d69\u5fe1(\u16f6\u61a4\u5db4\u4c04\u64ab\u9255::\u97e6\u7043\ub8be\u72f1\ud7e8\u5fe1, getfield:\u16f6\u61a4\u5db4\u4c04\u64ab\u9255(\u9937\u7d52\u3e75\u98a4\u8aa5\u7006::\ud51e\u9033\u8df4\u7043\u5f50\u8aa5, this:\u9937\u7d52\u3e75\u98a4\u8aa5\u7006))
        return:int(ternaryop:int(cmpeq:boolean(var_1_68:\ua562\u7330\ub113\u64ab\u6d69\u5fe1, aconstnull:\ua562\u7330\ub113\u64ab\u6d69\u5fe1()), ldc:int(0), invokevirtual:int(\ua562\u7330\ub113\u64ab\u6d69\u5fe1::\ube23\u6fb0\u1187\u69d9\u960f\u8709, var_1_68:\ua562\u7330\ub113\u64ab\u6d69\u5fe1)))
    }
    
    public int \u64f2\u3a62\ub1b9\u51b2\ubded\u3a62() {
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
            return:int(invokeinterface:int(Set<E>::size, getfield:Set<\u4ab3\ub1b9\u2dcc\ub8be\ube23\uc910>(\u9937\u7d52\u3e75\u98a4\u8aa5\u7006::\ub70c\ud4fe\u7e3f\ud36e\u59ec\u946b, this:\u9937\u7d52\u3e75\u98a4\u8aa5\u7006)))
        }
        
        goto(Label_0006)
    }
    
    public \ub113\uc4d2\u183a\u527a\u6435.\u4ab3\ub1b9\u2dcc\ub8be\ube23\uc910 \ua6bd\uc229\u52d3\ub1b9\uc87f\u8aa5(\u71f1\uc910\u3bc9\u516c\u93a2.\u6b0d\ud171\uc7fe\u52d3\uafe7\u6c56 p0) {
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
            return:\u4ab3\ub1b9\u2dcc\ub8be\ube23\uc910(invokevirtual:\u4ab3\ub1b9\u2dcc\ub8be\ube23\uc910(\u61a4\u946b\u4daf\uc2e8\uc4d2\u5140::\ucb79\u99f7\u4975\ud7e8\u64ab\u12b2, getfield:\u61a4\u946b\u4daf\uc2e8\uc4d2\u5140(\u9937\u7d52\u3e75\u98a4\u8aa5\u7006::\u6b5f\u071d\u8640\uc84e\u7bad\u071d, this:\u9937\u7d52\u3e75\u98a4\u8aa5\u7006), p0:\u6b0d\ud171\uc7fe\u52d3\uafe7\u6c56))
        }
        
        goto(Label_0006)
    }
    
    public \u927d\u92ff\u71ae\uafe7\u6bb9.\u16f6\u61a4\u5db4\u4c04\u64ab\u9255 \ubded\ubff1\u36d3\u3c25\u93a2\u6c52() {
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
            return:\u16f6\u61a4\u5db4\u4c04\u64ab\u9255(getfield:\u16f6\u61a4\u5db4\u4c04\u64ab\u9255(\u9937\u7d52\u3e75\u98a4\u8aa5\u7006::\ud51e\u9033\u8df4\u7043\u5f50\u8aa5, this:\u9937\u7d52\u3e75\u98a4\u8aa5\u7006))
        }
        
        goto(Label_0006)
    }
    
    private void \u7ce1\u4975\u385b\uc84e\u8640\u416d() {
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
            
            if (cmpgt:boolean(getstatic:int(\u9937\u7d52\u3e75\u98a4\u8aa5\u7006::\u76bc\u4cd9\uc4d2\u97b7\uc84e\ub32d), ldc:int(0))) {
                putfield:ObjectList<\u61a4\u7873\u12b2\u760c\u67e9\u4492>(\u9937\u7d52\u3e75\u98a4\u8aa5\u7006::\u92ee\u3dd3\ud7e8\u9a18\u8350\uafe7, this:\u9937\u7d52\u3e75\u98a4\u8aa5\u7006, initobject:ObjectArrayList[expected:ObjectList<\u61a4\u7873\u12b2\u760c\u67e9\u4492>](ObjectArrayList::<init>, add:int(invokeinterface:int(ObjectList::size, getfield:ObjectList<\u61a4\u7873\u12b2\u760c\u67e9\u4492>(\u9937\u7d52\u3e75\u98a4\u8aa5\u7006::\u92ee\u3dd3\ud7e8\u9a18\u8350\uafe7, this:\u9937\u7d52\u3e75\u98a4\u8aa5\u7006)), ldc:int(16))))
                putfield:List<\u61a4\u7873\u12b2\u760c\u67e9\u4492>(\u9937\u7d52\u3e75\u98a4\u8aa5\u7006::\u34df\uc84e\uc229\u47c2\u6c52\u97e6, this:\u9937\u7d52\u3e75\u98a4\u8aa5\u7006, initobject:ArrayList<\u61a4\u7873\u12b2\u760c\u67e9\u4492>[expected:List<\u61a4\u7873\u12b2\u760c\u67e9\u4492>](ArrayList<E>::<init>, add:int(invokeinterface:int(List<E>::size, getfield:List<\u61a4\u7873\u12b2\u760c\u67e9\u4492>(\u9937\u7d52\u3e75\u98a4\u8aa5\u7006::\u34df\uc84e\uc229\u47c2\u6c52\u97e6, this:\u9937\u7d52\u3e75\u98a4\u8aa5\u7006)), ldc:int(16))))
                putfield:List<\u61a4\u7873\u12b2\u760c\u67e9\u4492>(\u9937\u7d52\u3e75\u98a4\u8aa5\u7006::\uc29a\u4ab3\u0c95\u6d69\u3d4b\u3504, this:\u9937\u7d52\u3e75\u98a4\u8aa5\u7006, initobject:ArrayList<\u61a4\u7873\u12b2\u760c\u67e9\u4492>[expected:List<\u61a4\u7873\u12b2\u760c\u67e9\u4492>](ArrayList<E>::<init>, add:int(invokeinterface:int(List<E>::size, getfield:List<\u61a4\u7873\u12b2\u760c\u67e9\u4492>(\u9937\u7d52\u3e75\u98a4\u8aa5\u7006::\uc29a\u4ab3\u0c95\u6d69\u3d4b\u3504, this:\u9937\u7d52\u3e75\u98a4\u8aa5\u7006)), ldc:int(16))))
            }
            else {
                invokeinterface:void(ObjectList::clear, getfield:ObjectList<\u61a4\u7873\u12b2\u760c\u67e9\u4492>(\u9937\u7d52\u3e75\u98a4\u8aa5\u7006::\u92ee\u3dd3\ud7e8\u9a18\u8350\uafe7, this:\u9937\u7d52\u3e75\u98a4\u8aa5\u7006))
                invokeinterface:void(List<E>::clear, getfield:List<\u61a4\u7873\u12b2\u760c\u67e9\u4492>(\u9937\u7d52\u3e75\u98a4\u8aa5\u7006::\u34df\uc84e\uc229\u47c2\u6c52\u97e6, this:\u9937\u7d52\u3e75\u98a4\u8aa5\u7006))
                invokeinterface:void(List<E>::clear, getfield:List<\u61a4\u7873\u12b2\u760c\u67e9\u4492>(\u9937\u7d52\u3e75\u98a4\u8aa5\u7006::\uc29a\u4ab3\u0c95\u6d69\u3d4b\u3504, this:\u9937\u7d52\u3e75\u98a4\u8aa5\u7006))
            }
            
            return:void()
        }
        
        goto(Label_0006)
    }
    
    public void \ubf56\u392e\u0800\u5f50\u97e6\u3dd3() {
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
            
            if (getfield:boolean(\u9937\u7d52\u3e75\u98a4\u8aa5\u7006::\ub171\u385b\u8258\u16f6\u836c\u7ce1, this:\u9937\u7d52\u3e75\u98a4\u8aa5\u7006)) {
                invokevirtual:void(\u9937\u7d52\u3e75\u98a4\u8aa5\u7006::\u76bc\ub83f\u8bb0\u69d9\u7049\u97e6, this:\u9937\u7d52\u3e75\u98a4\u8aa5\u7006)
                putfield:boolean(\u9937\u7d52\u3e75\u98a4\u8aa5\u7006::\ub171\u385b\u8258\u16f6\u836c\u7ce1, this:\u9937\u7d52\u3e75\u98a4\u8aa5\u7006, ldc:boolean(0))
            }
            
            return:void()
        }
        
        goto(Label_0006)
    }
    
    public void \u74b1\u9a18\ucfaf\ub113\uc229\uc84e() {
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
            
            if (cmpne:boolean(getfield:\u56bd\u392e\u7873\u7043\ud158\u9255(\u9937\u7d52\u3e75\u98a4\u8aa5\u7006::\ud4fe\u34df\u8cae\u97e6\u51b2\u67d0, this:\u9937\u7d52\u3e75\u98a4\u8aa5\u7006), aconstnull:\u56bd\u392e\u7873\u7043\ud158\u9255())) {
                invokevirtual:void(\u56bd\u392e\u7873\u7043\ud158\u9255::\u61a4\u965f\ub18d\u76bc\u527a\uc7fe, getfield:\u56bd\u392e\u7873\u7043\ud158\u9255(\u9937\u7d52\u3e75\u98a4\u8aa5\u7006::\ud4fe\u34df\u8cae\u97e6\u51b2\u67d0, this:\u9937\u7d52\u3e75\u98a4\u8aa5\u7006))
            }
            
            return:void()
        }
        
        goto(Label_0006)
    }
    
    public void \uf9c5\u1187\u5db4\u61a4\u4975\u7ce1() {
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
            
            if (cmpne:boolean(getfield:\u56bd\u392e\u7873\u7043\ud158\u9255(\u9937\u7d52\u3e75\u98a4\u8aa5\u7006::\ud4fe\u34df\u8cae\u97e6\u51b2\u67d0, this:\u9937\u7d52\u3e75\u98a4\u8aa5\u7006), aconstnull:\u56bd\u392e\u7873\u7043\ud158\u9255())) {
                invokevirtual:void(\u56bd\u392e\u7873\u7043\ud158\u9255::\u88c5\u9255\ucb79\u946b\u67d0\ub70c, getfield:\u56bd\u392e\u7873\u7043\ud158\u9255(\u9937\u7d52\u3e75\u98a4\u8aa5\u7006::\ud4fe\u34df\u8cae\u97e6\u51b2\u67d0, this:\u9937\u7d52\u3e75\u98a4\u8aa5\u7006))
            }
            
            return:void()
        }
        
        goto(Label_0006)
    }
    
    public int \u392e\u494c\u56bd\u51b2\u6fb0\u5f50() {
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
            return:int(getfield:int(\u9937\u7d52\u3e75\u98a4\u8aa5\u7006::\u7e3f\ud158\uc4d2\u1833\u51b2\u965f, this:\u9937\u7d52\u3e75\u98a4\u8aa5\u7006))
        }
        
        goto(Label_0006)
    }
    
    public int \u67e9\uc7fe\ua068\u4f4a\u3776\ufe34() {
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
            return:int(preincrement:int(1, getfield:int(\u9937\u7d52\u3e75\u98a4\u8aa5\u7006::\u7e3f\ud158\uc4d2\u1833\u51b2\u965f, this:\u9937\u7d52\u3e75\u98a4\u8aa5\u7006)))
        }
        
        goto(Label_0006)
    }
    
    public \ubcb0\ud12e\u51fa\u8aa5\u0c95.\uafe7\uc2e8\u8389\ufcaf\ub19c\u51b2 \u960f\u120d\u873d\u718f\u3bc9\u8258() {
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
            return:\uafe7\uc2e8\u8389\ufcaf\ub19c\u51b2(getfield:\uafe7\uc2e8\u8389\ufcaf\ub19c\u51b2(\u9937\u7d52\u3e75\u98a4\u8aa5\u7006::\u3776\u8308\u12b2\uf9c5\ucfaf\ua3b4, this:\u9937\u7d52\u3e75\u98a4\u8aa5\u7006))
        }
        
        goto(Label_0006)
    }
    
    public java.util.List<\u59ec\u8413\u97e6\uc229\u3776.\u61a4\u7873\u12b2\u760c\u67e9\u4492> \u2dcc\u9af2\uf995\u0a06\u59ec\u494c() {
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
            return:List<\u61a4\u7873\u12b2\u760c\u67e9\u4492>(getfield:List<\u61a4\u7873\u12b2\u760c\u67e9\u4492>(\u9937\u7d52\u3e75\u98a4\u8aa5\u7006::\u34df\uc84e\uc229\u47c2\u6c52\u97e6, this:\u9937\u7d52\u3e75\u98a4\u8aa5\u7006))
        }
        
        goto(Label_0006)
    }
    
    public java.util.List<\u59ec\u8413\u97e6\uc229\u3776.\u61a4\u7873\u12b2\u760c\u67e9\u4492> \uc2bd\u51b2\u1833\u0c95\u9255\u960f() {
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
            return:List<\u61a4\u7873\u12b2\u760c\u67e9\u4492>(getfield:List<\u61a4\u7873\u12b2\u760c\u67e9\u4492>(\u9937\u7d52\u3e75\u98a4\u8aa5\u7006::\uc29a\u4ab3\u0c95\u6d69\u3d4b\u3504, this:\u9937\u7d52\u3e75\u98a4\u8aa5\u7006))
        }
        
        goto(Label_0006)
    }
    
    private void \u3d4b\u9255\ucb79\ufe34\ub171\u4492(\u3504\ufe34\u600f\u6b0d\u69d9.\u836c\u8cae\ub18d\u836c\u8753\u59ec p0, \u59ec\u8413\u97e6\uc229\u3776.\ub102\u5654\u8413\u3e75\u416d\u8640 p1, boolean p2) {
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
            
            if (cmpeq:boolean(getfield:int(\u9937\u7d52\u3e75\u98a4\u8aa5\u7006::\ub83f\u40a9\u5245\u67e9\u071d\u92ff, this:\u9937\u7d52\u3e75\u98a4\u8aa5\u7006), ldc:int(0))) {
                invokespecial:void(\u9937\u7d52\u3e75\u98a4\u8aa5\u7006::\u4492\u7330\ub8be\u5d20\u6c56\u516c, this:\u9937\u7d52\u3e75\u98a4\u8aa5\u7006, p0:\u836c\u8cae\ub18d\u836c\u8753\u59ec, p1:\ub102\u5654\u8413\u3e75\u416d\u8640, p2:boolean)
                invokevirtual:void(\u4d85\u3e2a\u5654\u7d52\u718f\u7e3f::\ua068\u983f\u3a62\uc229\uc7fe\u67e9, invokevirtual:\u4d85\u3e2a\u5654\u7d52\u718f\u7e3f(\u120d\u446c\uff55\u3d64\u494c\u69d9::\ub8be\u6c56\u494c\ud51e\u7330\u3bc9, getfield:\u120d\u446c\uff55\u3d64\u494c\u69d9(\u67e9\u4daf\u760c\ud217\ua6bd\ubff1::\u76bc\u873d\uc238\u0a06\uceb8\u92ee, getfield:\u67e9\u4daf\u760c\ud217\ua6bd\ubff1(\u9937\u7d52\u3e75\u98a4\u8aa5\u7006::\u8df4\u3776\ud171\u7006\u51b2\uf995, this:\u9937\u7d52\u3e75\u98a4\u8aa5\u7006))), ldc:int(201435902))
            }
            
            if (cmpgt:boolean(getfield:int(\u9937\u7d52\u3e75\u98a4\u8aa5\u7006::\ub83f\u40a9\u5245\u67e9\u071d\u92ff, this:\u9937\u7d52\u3e75\u98a4\u8aa5\u7006), ldc:int(-1))) {
                putfield:int(\u9937\u7d52\u3e75\u98a4\u8aa5\u7006::\ub83f\u40a9\u5245\u67e9\u071d\u92ff, this:\u9937\u7d52\u3e75\u98a4\u8aa5\u7006, sub:int(getfield:int(\u9937\u7d52\u3e75\u98a4\u8aa5\u7006::\ub83f\u40a9\u5245\u67e9\u071d\u92ff, this:\u9937\u7d52\u3e75\u98a4\u8aa5\u7006), ldc:int(1)))
            }
            
            return:void()
        }
        
        goto(Label_0006)
    }
    
    private void \u4492\u7330\ub8be\u5d20\u6c56\u516c(\u3504\ufe34\u600f\u6b0d\u69d9.\u836c\u8cae\ub18d\u836c\u8753\u59ec p0, \u59ec\u8413\u97e6\uc229\u3776.\ub102\u5654\u8413\u3e75\u416d\u8640 p1, boolean p2) {
        var_4_62 : int
        var_5_6E : boolean
        var_6_8B : \u9937\u7d52\u3e75\u98a4\u8aa5\u7006
        var_7_92 : int
        var_10_AA : long
        var_12_AD : int
        var_13_127 : int
        var_14_B6 : int
        var_12_EB : int
        
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
            var_4_62 = getfield:int(\u4daf\u8df4\ubb2b\u759a\u7330\u4ab3::\ub171\uc29a\u71ae\uff55\u7873\u67e9, getfield:\u4daf\u8df4\ubb2b\u759a\u7330\u4ab3(\u67e9\u4daf\u760c\ud217\ua6bd\ubff1::\uc84e\u4c04\ubcb0\u0c95\ub8be\u5fe1, getfield:\u67e9\u4daf\u760c\ud217\ua6bd\ubff1(\u9937\u7d52\u3e75\u98a4\u8aa5\u7006::\u8df4\u3776\ud171\u7006\u51b2\uf995, this:\u9937\u7d52\u3e75\u98a4\u8aa5\u7006)))
            var_5_6E = getfield:boolean(\u4daf\u8df4\ubb2b\u759a\u7330\u4ab3::\u0b8e\u983f\uc238\ub6ab\u7049\ud4fe, getfield:\u4daf\u8df4\ubb2b\u759a\u7330\u4ab3(\u67e9\u4daf\u760c\ud217\ua6bd\ubff1::\uc84e\u4c04\ubcb0\u0c95\ub8be\u5fe1, getfield:\u67e9\u4daf\u760c\ud217\ua6bd\ubff1(\u9937\u7d52\u3e75\u98a4\u8aa5\u7006::\u8df4\u3776\ud171\u7006\u51b2\uf995, this:\u9937\u7d52\u3e75\u98a4\u8aa5\u7006)))
            
            try {
                putfield:int(\u4daf\u8df4\ubb2b\u759a\u7330\u4ab3::\ub171\uc29a\u71ae\uff55\u7873\u67e9, getfield:\u4daf\u8df4\ubb2b\u759a\u7330\u4ab3(\u67e9\u4daf\u760c\ud217\ua6bd\ubff1::\uc84e\u4c04\ubcb0\u0c95\ub8be\u5fe1, getfield:\u67e9\u4daf\u760c\ud217\ua6bd\ubff1(\u9937\u7d52\u3e75\u98a4\u8aa5\u7006::\u8df4\u3776\ud171\u7006\u51b2\uf995, this:\u9937\u7d52\u3e75\u98a4\u8aa5\u7006)), ldc:int(1000))
                putfield:boolean(\u4daf\u8df4\ubb2b\u759a\u7330\u4ab3::\u0b8e\u983f\uc238\ub6ab\u7049\ud4fe, getfield:\u4daf\u8df4\ubb2b\u759a\u7330\u4ab3(\u67e9\u4daf\u760c\ud217\ua6bd\ubff1::\uc84e\u4c04\ubcb0\u0c95\ub8be\u5fe1, getfield:\u67e9\u4daf\u760c\ud217\ua6bd\ubff1(\u9937\u7d52\u3e75\u98a4\u8aa5\u7006::\u8df4\u3776\ud171\u7006\u51b2\uf995, this:\u9937\u7d52\u3e75\u98a4\u8aa5\u7006)), ldc:boolean(0))
                var_6_8B = invokestatic:\u9937\u7d52\u3e75\u98a4\u8aa5\u7006(\u8308\u51fa\u6c56\u5db4\ub18d\u34df::\u97e6\uf995\u0b8e\ucfaf\u071d\u527a)
                var_7_92 = invokevirtual:int(\u9937\u7d52\u3e75\u98a4\u8aa5\u7006::\ua6bd\u6cfe\ubded\u67e9\ucfaf\u8350, var_6_8B:\u9937\u7d52\u3e75\u98a4\u8aa5\u7006)
                invokestatic:long(System::currentTimeMillis)
                invokestatic:void(\u8308\u51fa\u6c56\u5db4\ub18d\u34df::\ud217\u8aa5\u7006\u927d\u67e9\u3bd6, loadelement:String(getstatic:String[](\u9937\u7d52\u3e75\u98a4\u8aa5\u7006::\ub8be\ud171\u8c8a\ub1b9\u76bc\u5bc4), ldc:int(51)))
                var_10_AA = add:long(invokestatic:long(System::currentTimeMillis), ldc:long(5000L))
                var_12_AD = ldc:int(0)
                
                do {
                    var_13_127 = ldc:int(0)
                    var_14_B6 = ldc:int(0)
                    
                    while (cmplt:boolean(var_14_B6:int, ldc:int(100))) {
                        invokevirtual:void(\u9937\u7d52\u3e75\u98a4\u8aa5\u7006::\ud36e\u385b\ub8be\u718f\u6c52\ub8be, var_6_8B:\u9937\u7d52\u3e75\u98a4\u8aa5\u7006)
                        invokevirtual:void(\u9937\u7d52\u3e75\u98a4\u8aa5\u7006::\u873d\uc31c\u8bb0\u446c\uc87f\u759a, var_6_8B:\u9937\u7d52\u3e75\u98a4\u8aa5\u7006, p0:\u836c\u8cae\ub18d\u836c\u8753\u59ec, p1:\ub102\u5654\u8413\u3e75\u416d\u8640, ldc:boolean(0), postincrement:int(1, getfield:int(\u9937\u7d52\u3e75\u98a4\u8aa5\u7006::\u7e3f\ud158\uc4d2\u1833\u51b2\u965f, this)), p2:boolean)
                        
                        if (logicalnot:boolean(invokevirtual:boolean(\u9937\u7d52\u3e75\u98a4\u8aa5\u7006::\uc910\u9a18\u3504\u873d\u4cd9\u4c2b, var_6_8B:\u9937\u7d52\u3e75\u98a4\u8aa5\u7006))) {
                            var_13_127 = ldc:int(1)
                        }
                        
                        var_12_EB = add:int(var_12_AD:int, invokevirtual:int(\u9937\u7d52\u3e75\u98a4\u8aa5\u7006::\u64f2\u3a62\ub1b9\u51b2\ubded\u3a62, var_6_8B:\u9937\u7d52\u3e75\u98a4\u8aa5\u7006))
                        
                        while (logicalnot:boolean(invokevirtual:boolean(\u9937\u7d52\u3e75\u98a4\u8aa5\u7006::\uc910\u9a18\u3504\u873d\u4cd9\u4c2b, var_6_8B:\u9937\u7d52\u3e75\u98a4\u8aa5\u7006))) {
                            invokevirtual:void(\u9937\u7d52\u3e75\u98a4\u8aa5\u7006::\u527a\u0800\ub19c\uf94d\u67d0\uc910, var_6_8B:\u9937\u7d52\u3e75\u98a4\u8aa5\u7006, add:long(invokestatic:long(System::nanoTime), ldc:long(1000000000L)))
                        }
                        
                        var_12_AD = sub:int(var_12_EB:int, invokevirtual:int(\u9937\u7d52\u3e75\u98a4\u8aa5\u7006::\u64f2\u3a62\ub1b9\u51b2\ubded\u3a62, var_6_8B:\u9937\u7d52\u3e75\u98a4\u8aa5\u7006))
                        
                        if (cmpeq:boolean(var_13_127:int, ldc:int(0))) {
                            looporswitchbreak()
                        }
                        
                        inc:int(var_14_B6, ldc:int(1))
                    }
                    
                    if (cmpne:boolean(invokevirtual:int(\u9937\u7d52\u3e75\u98a4\u8aa5\u7006::\ua6bd\u6cfe\ubded\u67e9\ucfaf\u8350, var_6_8B:\u9937\u7d52\u3e75\u98a4\u8aa5\u7006), var_7_92:int)) {
                        var_13_127 = ldc:int(1)
                        var_7_92 = invokevirtual:int(\u9937\u7d52\u3e75\u98a4\u8aa5\u7006::\ua6bd\u6cfe\ubded\u67e9\ucfaf\u8350, var_6_8B:\u9937\u7d52\u3e75\u98a4\u8aa5\u7006)
                    }
                    
                    if (cmpgt:boolean(invokestatic:long(System::currentTimeMillis), var_10_AA:long)) {
                        invokestatic:void(\u8308\u51fa\u6c56\u5db4\ub18d\u34df::\u6cfe\ub7dc\u3e2a\u7ce1\u3c25\ub1b9, invokevirtual:String(StringBuilder::toString, invokevirtual:StringBuilder(StringBuilder::append, invokevirtual:StringBuilder(StringBuilder::append, initobject:StringBuilder(StringBuilder::<init>), loadelement:String(getstatic:String[](\u9937\u7d52\u3e75\u98a4\u8aa5\u7006::\ub8be\ud171\u8c8a\ub1b9\u76bc\u5bc4), ldc:int(52))), var_12_AD:int)))
                        var_10_AA = add:long(invokestatic:long(System::currentTimeMillis), ldc:long(5000L))
                    }
                } while (cmpne:boolean(var_13_127:int, ldc:int(0)))
                
                invokestatic:void(\u8308\u51fa\u6c56\u5db4\ub18d\u34df::\u6cfe\ub7dc\u3e2a\u7ce1\u3c25\ub1b9, invokevirtual:String(StringBuilder::toString, invokevirtual:StringBuilder(StringBuilder::append, invokevirtual:StringBuilder(StringBuilder::append, initobject:StringBuilder(StringBuilder::<init>), loadelement:String(getstatic:String[](\u9937\u7d52\u3e75\u98a4\u8aa5\u7006::\ub8be\ud171\u8c8a\ub1b9\u76bc\u5bc4), ldc:int(52))), var_12_AD:int)))
                invokestatic:void(\u8308\u51fa\u6c56\u5db4\ub18d\u34df::\u6cfe\ub7dc\u3e2a\u7ce1\u3c25\ub1b9, loadelement:String(getstatic:String[](\u9937\u7d52\u3e75\u98a4\u8aa5\u7006::\ub8be\ud171\u8c8a\ub1b9\u76bc\u5bc4), ldc:int(53)))
                putstatic:int(\u56bd\u392e\u7873\u7043\ud158\u9255::\u64ab\ub70c\u47c2\ube23\u1187\ud158, ldc:int(0))
            }
            finally {
                putfield:int(\u4daf\u8df4\ubb2b\u759a\u7330\u4ab3::\ub171\uc29a\u71ae\uff55\u7873\u67e9, getfield:\u4daf\u8df4\ubb2b\u759a\u7330\u4ab3(\u67e9\u4daf\u760c\ud217\ua6bd\ubff1::\uc84e\u4c04\ubcb0\u0c95\ub8be\u5fe1, getfield:\u67e9\u4daf\u760c\ud217\ua6bd\ubff1(\u9937\u7d52\u3e75\u98a4\u8aa5\u7006::\u8df4\u3776\ud171\u7006\u51b2\uf995, this:\u9937\u7d52\u3e75\u98a4\u8aa5\u7006)), var_4_62:int)
                putfield:boolean(\u4daf\u8df4\ubb2b\u759a\u7330\u4ab3::\u0b8e\u983f\uc238\ub6ab\u7049\ud4fe, getfield:\u4daf\u8df4\ubb2b\u759a\u7330\u4ab3(\u67e9\u4daf\u760c\ud217\ua6bd\ubff1::\uc84e\u4c04\ubcb0\u0c95\ub8be\u5fe1, getfield:\u67e9\u4daf\u760c\ud217\ua6bd\ubff1(\u9937\u7d52\u3e75\u98a4\u8aa5\u7006::\u8df4\u3776\ud171\u7006\u51b2\uf995, this:\u9937\u7d52\u3e75\u98a4\u8aa5\u7006)), var_5_6E:boolean)
            }
            
            return:void()
        }
        
        goto(Label_0006)
    }
    
    public \ub113\ufcaf\u3c25\u071d\u97b7.\u7043\uf995\u718f\ub19c\u4c2b\u4d85 \u4179\u51b2\u51b2\u8cae\u6198\ub6ab() {
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
            return:\u7043\uf995\u718f\ub19c\u4c2b\u4d85(getstatic:\u3a62\u9255\ua3b4\ud12e\u3504\u16f6[expected:\u7043\uf995\u718f\ub19c\u4c2b\u4d85](\u3a62\u9255\ua3b4\ud12e\u3504\u16f6::\u9937\u3bd6\uf94d\u9a18\u7873\u156b))
        }
        
        goto(Label_0006)
    }
    
    public void \u839e\u71ae\u5bc4\uae5d\u0b8e\u7043(java.util.Collection<\u3bc9\u67e9\uc87f\u47c2\u5f50.\u16f6\u40a9\u5f50\ub113\ud51e.\u836c\u67e9\u5d20\u5fe1\u7e3f.\ub83f\uc9f6\u47c2\u67d0\u7ce1> p0, java.util.Collection<\u3bc9\u67e9\uc87f\u47c2\u5f50.\u16f6\u40a9\u5f50\ub113\ud51e.\u836c\u67e9\u5d20\u5fe1\u7e3f.\ub83f\uc9f6\u47c2\u67d0\u7ce1> p1) {
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
            monitorenter(getfield:Set<\ub83f\uc9f6\u47c2\u67d0\u7ce1>(\u9937\u7d52\u3e75\u98a4\u8aa5\u7006::\uc4d2\u8df4\ub83f\u946b\u34df\u6198, this:\u9937\u7d52\u3e75\u98a4\u8aa5\u7006))
            
            try {
                invokeinterface:boolean(Set<E>::removeAll, getfield:Set<\ub83f\uc9f6\u47c2\u67d0\u7ce1>(\u9937\u7d52\u3e75\u98a4\u8aa5\u7006::\uc4d2\u8df4\ub83f\u946b\u34df\u6198, this:\u9937\u7d52\u3e75\u98a4\u8aa5\u7006), p0:Collection<\ub83f\uc9f6\u47c2\u67d0\u7ce1>)
                invokeinterface:boolean(Set<\ub83f\uc9f6\u47c2\u67d0\u7ce1>::addAll, getfield:Set<\ub83f\uc9f6\u47c2\u67d0\u7ce1>(\u9937\u7d52\u3e75\u98a4\u8aa5\u7006::\uc4d2\u8df4\ub83f\u946b\u34df\u6198, this:\u9937\u7d52\u3e75\u98a4\u8aa5\u7006), p1:Collection<\ub83f\uc9f6\u47c2\u67d0\u7ce1>)
            }
            finally {
                monitorexit(getfield:Set<\ub83f\uc9f6\u47c2\u67d0\u7ce1>(\u9937\u7d52\u3e75\u98a4\u8aa5\u7006::\uc4d2\u8df4\ub83f\u946b\u34df\u6198, this:\u9937\u7d52\u3e75\u98a4\u8aa5\u7006))
            }
            
            return:void()
        }
        
        goto(Label_0006)
    }
    
    public static int \ud158\u6fb0\u2dcc\u52d3\ubcb0\u7af6(\u12b2\u7049\u8df4\uc9f6\uae87.\u8bb0\u759a\u3bc9\u527a\ube23\u5140 p0, \u71f1\uc910\u3bc9\u516c\u93a2.\u6b0d\ud171\uc7fe\u52d3\uafe7\u6c56 p1) {
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
            return:int(invokestatic:int(\u9937\u7d52\u3e75\u98a4\u8aa5\u7006::\ud7e8\u6cfe\ud171\ub18d\ub102\u6198, p0:\u8bb0\u759a\u3bc9\u527a\ube23\u5140, invokeinterface:\u8413\u7e3f\uc910\uf94d\u5654\u6b0d(\u718f\u6435\uc31c\u4ab3\u98a4::\uc238\uc31c\ua61f\u92ee\u51b2\u527a, p0:\u8bb0\u759a\u3bc9\u527a\ube23\u5140[expected:\u718f\u6435\uc31c\u4ab3\u98a4], p1:\u6b0d\ud171\uc7fe\u52d3\uafe7\u6c56), p1:\u6b0d\ud171\uc7fe\u52d3\uafe7\u6c56))
        }
        
        goto(Label_0006)
    }
    
    public static int \ud7e8\u6cfe\ud171\ub18d\ub102\u6198(\u12b2\u7049\u8df4\uc9f6\uae87.\u8bb0\u759a\u3bc9\u527a\ube23\u5140 p0, \u5245\u8aa5\u61a4\u7049\u4cd9.\u8413\u7e3f\uc910\uf94d\u5654\u6b0d p1, \u71f1\uc910\u3bc9\u516c\u93a2.\u6b0d\ud171\uc7fe\u52d3\uafe7\u6c56 p2) {
        var_3_6F : int
        var_4_7A : int
        var_5_82 : int
        var_6_98 : int
        
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
        
        if (invokevirtual:boolean(\u7043\u8c8a\u8c8a\u4f4a\ufcaf\u839e::\u718f\u8d98\u88c5\uc229\uc229\u8bb0, p1:\u8413\u7e3f\uc910\uf94d\u5654\u6b0d[expected:\u7043\u8c8a\u8c8a\u4f4a\ufcaf\u839e], p0:\u8bb0\u759a\u3bc9\u527a\ube23\u5140[expected:\u718f\u6435\uc31c\u4ab3\u98a4], p2:\u6b0d\ud171\uc7fe\u52d3\uafe7\u6c56)) {
            return:int(ldc:int(15728880))
        }
        
        var_3_6F = invokeinterface:int(\u8bb0\u759a\u3bc9\u527a\ube23\u5140::\ub19c\ub171\u7ce1\u99f7\ud51e\ub18d, p0:\u8bb0\u759a\u3bc9\u527a\ube23\u5140, getstatic:\u3a62\u7330\uafe7\u5db4\u12cb(\u3a62\u7330\uafe7\u5db4\u12cb::\u836c\ud4fe\uc2e8\u3504\u6d69\u3504), p2:\u6b0d\ud171\uc7fe\u52d3\uafe7\u6c56)
        var_4_7A = invokeinterface:int(\u8bb0\u759a\u3bc9\u527a\ube23\u5140::\ub19c\ub171\u7ce1\u99f7\ud51e\ub18d, p0:\u8bb0\u759a\u3bc9\u527a\ube23\u5140, getstatic:\u3a62\u7330\uafe7\u5db4\u12cb(\u3a62\u7330\uafe7\u5db4\u12cb::\u3a62\u5f50\ufcaf\u47c2\u6198\uc7fe), p2:\u6b0d\ud171\uc7fe\u52d3\uafe7\u6c56)
        var_5_82 = invokevirtual:int(\u8413\u7e3f\uc910\uf94d\u5654\u6b0d::\u93a2\u16f6\u93a2\u4daf\u8389\u6ec6, p1:\u8413\u7e3f\uc910\uf94d\u5654\u6b0d, p0:\u8bb0\u759a\u3bc9\u527a\ube23\u5140[expected:\u718f\u6435\uc31c\u4ab3\u98a4], p2:\u6b0d\ud171\uc7fe\u52d3\uafe7\u6c56)
        
        if (cmplt:boolean(var_4_7A:int, var_5_82:int)) {
            var_4_7A = var_5_82:int
        }
        
        var_6_98 = or:int(shl:int(var_3_6F:int, ldc:int(20)), shl:int(var_4_7A:int, ldc:int(4)))
        
        if (logicaland:boolean(logicaland:boolean(invokestatic:boolean(\u8308\u51fa\u6c56\u5db4\ub18d\u34df::\u446c\u4975\u88c5\u3711\u9033\u3e2a), instanceof:boolean(\u5d20\u97b7\u8753\u873d\u16f6.\u718f\u6435\uc31c\u4ab3\u98a4.class, p0:\u8bb0\u759a\u3bc9\u527a\ube23\u5140)), logicalnot:boolean(logicaland:boolean(getstatic:boolean(\u9937\u7d52\u3e75\u98a4\u8aa5\u7006::\u16f6\u446c\u4bc8\u6cfe\u4bc8\u9af2), invokevirtual:boolean(\u7043\u8c8a\u8c8a\u4f4a\ufcaf\u839e::\ud523\u88c5\ua6bd\ud7e8\ua61f\u56bd, p1:\u8413\u7e3f\uc910\uf94d\u5654\u6b0d[expected:\u7043\u8c8a\u8c8a\u4f4a\ufcaf\u839e], p0:\u8bb0\u759a\u3bc9\u527a\ube23\u5140[expected:\u718f\u6435\uc31c\u4ab3\u98a4], p2:\u6b0d\ud171\uc7fe\u52d3\uafe7\u6c56))))) {
            var_6_98 = invokestatic:int(\u3711\uff55\u385b\u8aa5\u51fa\u99f7::\u9255\u385b\u61a4\ud36e\u3504\u4c04, p2:\u6b0d\ud171\uc7fe\u52d3\uafe7\u6c56, var_6_98:int)
        }
        
        return:int(var_6_98:int)
    }
    
    public \u59ec\u8413\u97e6\uc229\u3776.\uc84e\uc2bd\u74b1\u88c5\u4cd9\u56bd \u47c2\ubded\ucfaf\u61a4\u8cae\u5f50() {
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
            return:\uc84e\uc2bd\u74b1\u88c5\u4cd9\u56bd(getfield:\uc84e\uc2bd\u74b1\u88c5\u4cd9\u56bd(\u9937\u7d52\u3e75\u98a4\u8aa5\u7006::\u67e9\u8258\u385b\u5140\ub113\uc229, this:\u9937\u7d52\u3e75\u98a4\u8aa5\u7006))
        }
        
        goto(Label_0006)
    }
    
    public \u59ec\u8413\u97e6\uc229\u3776.\uc84e\uc2bd\u74b1\u88c5\u4cd9\u56bd \ud51e\uf995\ud217\ubefe\ud51e\u71f1() {
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
            return:\uc84e\uc2bd\u74b1\u88c5\u4cd9\u56bd(getfield:\uc84e\uc2bd\u74b1\u88c5\u4cd9\u56bd(\u9937\u7d52\u3e75\u98a4\u8aa5\u7006::\u5d20\u51b2\u4bc8\u183a\u516c\u76bc, this:\u9937\u7d52\u3e75\u98a4\u8aa5\u7006))
        }
        
        goto(Label_0006)
    }
    
    public \u59ec\u8413\u97e6\uc229\u3776.\uc84e\uc2bd\u74b1\u88c5\u4cd9\u56bd \ubcb0\uc2e8\u76bc\u4d85\u4c04\u6cfe() {
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
            return:\uc84e\uc2bd\u74b1\u88c5\u4cd9\u56bd(getfield:\uc84e\uc2bd\u74b1\u88c5\u4cd9\u56bd(\u9937\u7d52\u3e75\u98a4\u8aa5\u7006::\ufe34\u7006\ubcb0\u527a\uc84e\u8413, this:\u9937\u7d52\u3e75\u98a4\u8aa5\u7006))
        }
        
        goto(Label_0006)
    }
    
    public \u59ec\u8413\u97e6\uc229\u3776.\uc84e\uc2bd\u74b1\u88c5\u4cd9\u56bd \u647c\u71ae\uc229\u6d69\u4bc8\ud158() {
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
            return:\uc84e\uc2bd\u74b1\u88c5\u4cd9\u56bd(getfield:\uc84e\uc2bd\u74b1\u88c5\u4cd9\u56bd(\u9937\u7d52\u3e75\u98a4\u8aa5\u7006::\u718f\u92ff\u7330\u385b\u7e3f\u4f52, this:\u9937\u7d52\u3e75\u98a4\u8aa5\u7006))
        }
        
        goto(Label_0006)
    }
    
    public \u59ec\u8413\u97e6\uc229\u3776.\uc84e\uc2bd\u74b1\u88c5\u4cd9\u56bd \u183a\u983f\u8640\u5db4\ub18d\u8bb0() {
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
            return:\uc84e\uc2bd\u74b1\u88c5\u4cd9\u56bd(getfield:\uc84e\uc2bd\u74b1\u88c5\u4cd9\u56bd(\u9937\u7d52\u3e75\u98a4\u8aa5\u7006::\u97e6\ud158\u9033\ub7dc\u8389\ua562, this:\u9937\u7d52\u3e75\u98a4\u8aa5\u7006))
        }
        
        goto(Label_0006)
    }
    
    public \u59ec\u8413\u97e6\uc229\u3776.\uc84e\uc2bd\u74b1\u88c5\u4cd9\u56bd \ub19c\u3504\u1833\ub102\u7c6b\u6bb9() {
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
            return:\uc84e\uc2bd\u74b1\u88c5\u4cd9\u56bd(getfield:\uc84e\uc2bd\u74b1\u88c5\u4cd9\u56bd(\u9937\u7d52\u3e75\u98a4\u8aa5\u7006::\u7006\u6d99\u8aa5\u92ff\u494c\u3d4b, this:\u9937\u7d52\u3e75\u98a4\u8aa5\u7006))
        }
        
        goto(Label_0006)
    }
    
    private static java.util.SortedSet lambda$\u16f6\u839e\u7873\u3e2a\u0800\u8bb0$8(long p0) {
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
            return:SortedSet(invokestatic:TreeSet[expected:SortedSet](Sets::newTreeSet))
        }
        
        goto(Label_0006)
    }
    
    private static java.lang.String lambda$\u88c5\ud171\u3bc9\u071d\ub8be\u3776$7(double p0, double p1, double p2) {
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
            return:String(invokestatic:String(\u446c\u67d0\ua562\u97b7\u6c56\u59ec::\u927d\u16f6\u3bd6\u8aa5\u6b0d\u7e3f, p0:double, p1:double, p2:double))
        }
        
        goto(Label_0006)
    }
    
    private static void lambda$\ud36e\uc229\u6198\u3e2a\u6ec6\u99f7$6(\u59ec\u8413\u97e6\uc229\u3776.\u6b0d\uf9c5\ucfaf\ud36e\ub102 p0, \u51fa\u12cb\u7330\u74b1\u6c52.\u76bc\u4975\ua6bd\u4daf\u8d98.\uc87f\u5f50\u16f6\ub113\u52d3\u12b2 p1, double p2, double p3, double p4, float p5, float p6, float p7, float p8, double p9, double p10, double p11, double p12, double p13, double p14) {
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
            invokeinterface:void(\u6b0d\uf9c5\ucfaf\ud36e\ub102::\ua61f\u0a06\u3bc9\ufe34\uc9f6\u8258, invokeinterface:\u6b0d\uf9c5\ucfaf\ud36e\ub102(\u6b0d\uf9c5\ucfaf\ud36e\ub102::\ub70c\u600f\u93a2\uc910\u9937\u946b, invokeinterface:\u6b0d\uf9c5\ucfaf\ud36e\ub102(\u6b0d\uf9c5\ucfaf\ud36e\ub102::\u8d90\u9255\u3bd6\u5d20\ub83f\u1187, p0:\u6b0d\uf9c5\ucfaf\ud36e\ub102, p1:\uc87f\u5f50\u16f6\ub113\u52d3\u12b2, d2f:float(add:double(p9:double, p2:double)), d2f:float(add:double(p10:double, p3:double)), d2f:float(add:double(p11:double, p4:double))), p5:float, p6:float, p7:float, p8:float))
            invokeinterface:void(\u6b0d\uf9c5\ucfaf\ud36e\ub102::\ua61f\u0a06\u3bc9\ufe34\uc9f6\u8258, invokeinterface:\u6b0d\uf9c5\ucfaf\ud36e\ub102(\u6b0d\uf9c5\ucfaf\ud36e\ub102::\ub70c\u600f\u93a2\uc910\u9937\u946b, invokeinterface:\u6b0d\uf9c5\ucfaf\ud36e\ub102(\u6b0d\uf9c5\ucfaf\ud36e\ub102::\u8d90\u9255\u3bd6\u5d20\ub83f\u1187, p0:\u6b0d\uf9c5\ucfaf\ud36e\ub102, p1:\uc87f\u5f50\u16f6\ub113\u52d3\u12b2, d2f:float(add:double(p12:double, p2:double)), d2f:float(add:double(p13:double, p3:double)), d2f:float(add:double(p14:double, p4:double))), p5:float, p6:float, p7:float, p8:float))
            return:void()
        }
        
        goto(Label_0006)
    }
    
    private static java.util.List lambda$\u983f\u983f\u3e2a\u8350\u4f52\u16f6$5(\u4492\u8aa5\ud171\uc3e3\u4c2b.\u3e75\u59ec\u5245\uc4d2\u8cae\u4f4a p0) {
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
            return:List(initobject:ArrayList[expected:List](ArrayList::<init>))
        }
        
        goto(Label_0006)
    }
    
    private static java.util.Map lambda$\ua6bd\u93a2\uc4d2\u61a4\uf995\u600f$4(\u4492\u8aa5\ud171\uc3e3\u4c2b.\u4c04\ua068\u3d64\ua6bd\u8389.\u960f\ubefe\ud4fe\u7c6b\u5db4.\u6fb0\u12cb\u5db4\uc7fe\u0800.\ub19c\u416d\uc84e\u8389\u12cb.\uae5d\ubf56\u4daf\u3c25\u7049\u16f6 p0) {
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
            return:Map(initobject:LinkedHashMap[expected:Map](LinkedHashMap::<init>, ldc:int(8)))
        }
        
        goto(Label_0006)
    }
    
    private static java.util.Map lambda$\ua562\u4179\ua3b4\u5245\uc9f6\u8c8a$3(\u4492\u8aa5\ud171\uc3e3\u4c2b.\u4c04\ua068\u3d64\ua6bd\u8389.\u960f\ubefe\ud4fe\u7c6b\u5db4.\u6fb0\u12cb\u5db4\uc7fe\u0800.\ub19c\u416d\uc84e\u8389\u12cb.\uf995\u4975\u1187\ubff1\u839e\u8389 p0) {
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
            return:Map(initobject:LinkedHashMap[expected:Map](LinkedHashMap::<init>, ldc:int(16)))
        }
        
        goto(Label_0006)
    }
    
    private static java.lang.String lambda$\u69d9\ud158\u3d4b\ubcb0\u12b2\ud217$2(\u4492\u8aa5\ud171\uc3e3\u4c2b.\u4c04\ua068\u3d64\ua6bd\u8389.\u960f\ubefe\ud4fe\u7c6b\u5db4.\u6fb0\u12cb\u5db4\uc7fe\u0800.\ub19c\u416d\uc84e\u8389\u12cb.\uf995\u4975\u1187\ubff1\u839e\u8389 p0) {
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
            return:String(invokevirtual:String(StringBuilder::toString, invokevirtual:StringBuilder(StringBuilder::append, invokevirtual:StringBuilder(StringBuilder::append, initobject:StringBuilder(StringBuilder::<init>), loadelement:String(getstatic:String[](\u9937\u7d52\u3e75\u98a4\u8aa5\u7006::\ub8be\ud171\u8c8a\ub1b9\u76bc\u5bc4), ldc:int(54))), p0:\uf995\u4975\u1187\ubff1\u839e\u8389[expected:Object])))
        }
        
        goto(Label_0006)
    }
    
    private static \u59ec\u8413\u97e6\uc229\u3776.\u6b0d\uf9c5\ucfaf\ud36e\ub102 lambda$\u6198\u6c56\u8d90\ubff1\uf9c5\u2dcc$1(\u5d20\u97b7\u8753\u873d\u16f6.\u61a4\u76bc\u0c95\u1833\u7043\u3711 p0, \u59ec\u8413\u97e6\uc229\u3776.\u6b0d\uf9c5\ucfaf\ud36e\ub102 p1, \u4492\u8aa5\ud171\uc3e3\u4c2b.\u4c04\ua068\u3d64\ua6bd\u8389.\u960f\ubefe\ud4fe\u7c6b\u5db4.\u6fb0\u12cb\u5db4\uc7fe\u0800.\ub19c\u416d\uc84e\u8389\u12cb.\uf995\u4975\u1187\ubff1\u839e\u8389 p2) {
        var_3_5D : \u6b0d\uf9c5\ucfaf\ud36e\ub102
        
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
            var_3_5D = invokevirtual:\u6b0d\uf9c5\ucfaf\ud36e\ub102(\u61a4\u76bc\u0c95\u1833\u7043\u3711::\ub18d\u8d90\u8308\u9a18\u071d\u16f6, p0:\u61a4\u76bc\u0c95\u1833\u7043\u3711, p2:\uf995\u4975\u1187\ubff1\u839e\u8389)
            return:\u6b0d\uf9c5\ucfaf\ud36e\ub102(ternaryop:\u6b0d\uf9c5\ucfaf\ud36e\ub102(invokevirtual:boolean(\uf995\u4975\u1187\ubff1\u839e\u8389::\u446c\ud171\u8709\u760c\ud51e\uc87f, p2:\uf995\u4975\u1187\ubff1\u839e\u8389), invokestatic:\u6b0d\uf9c5\ucfaf\ud36e\ub102(\u3e2a\u3d64\u74b1\uc84e\u5140::\u7af6\u836c\u759a\ud51e\ub18d\u7043, p1:\u6b0d\uf9c5\ucfaf\ud36e\ub102, var_3_5D:\u6b0d\uf9c5\ucfaf\ud36e\ub102), var_3_5D:\u6b0d\uf9c5\ucfaf\ud36e\ub102))
        }
        
        goto(Label_0006)
    }
    
    private static double lambda$\u72f1\u071d\u5fe1\u7330\u7d52\u8753$0(\u71f1\uc910\u3bc9\u516c\u93a2.\u6b0d\ud171\uc7fe\u52d3\uafe7\u6c56 p0, \u59ec\u8413\u97e6\uc229\u3776.\u61a4\u7873\u12b2\u760c\u67e9\u4492 p1) {
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
            return:double(invokevirtual:double(\u3a62\uc9f6\u3776\u4f52\ua068\u34df::\u8d98\u64f2\u97b7\ua6bd\uc229\u51fa, p0:\u6b0d\ud171\uc7fe\u52d3\uafe7\u6c56[expected:\u3a62\uc9f6\u3776\u4f52\ua068\u34df], invokevirtual:\u6b0d\ud171\uc7fe\u52d3\uafe7\u6c56[expected:\u3a62\uc9f6\u3776\u4f52\ua068\u34df](\u6b0d\ud171\uc7fe\u52d3\uafe7\u6c56::\uc84e\u5f50\u92ff\u92ff\u2dcc\u7330, invokevirtual:\u6b0d\ud171\uc7fe\u52d3\uafe7\u6c56(\u4ab3\ub1b9\u2dcc\ub8be\ube23\uc910::\u7d52\ub32d\u7e3f\ubefe\u40a9\u67d0, getfield:\u4ab3\ub1b9\u2dcc\ub8be\ube23\uc910(\u61a4\u7873\u12b2\u760c\u67e9\u4492::\u40a9\u9255\ua6bd\u0800\u6b5f\u7043, p1:\u61a4\u7873\u12b2\u760c\u67e9\u4492)), ldc:int(8), ldc:int(8), ldc:int(8))))
        }
        
        goto(Label_0006)
    }
    
    static {
        expr_5E : byte[] [generated]
        stack_9D_0 : byte[] [generated]
        stack_A0_0 : byte[] [generated]
        stack_B2_0 : byte[] [generated]
        stack_D4_0 : byte[] [generated]
        stack_D7_0 : byte[] [generated]
        stack_E9_0 : byte[] [generated]
        stack_108_0 : byte[] [generated]
        expr_65 : int [generated]
        var_3_6B : int
        var_1_6F : byte[]
        var_2_70 : int
        expr_77 : byte [generated]
        expr_A0 : int [generated]
        var_1_AA : byte[]
        var_2_AB : int
        expr_B2 : byte [generated]
        var_4_D4 : byte[]
        expr_D9 : int [generated]
        var_1_E1 : byte[]
        var_2_E2 : int
        var_1_114 : String
        expr_118 : String[] [generated]
        expr_11E : String[] [generated]
        var_1_4D4 : String[]
        
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
            expr_5E = stack_9D_0 = stack_A0_0 = stack_B2_0 = stack_D4_0 = stack_D7_0 = stack_E9_0 = stack_108_0 = invokevirtual(Decoder::decode, invokestatic(Base64::getDecoder), ldc("I8AIMBA5zbg3BL0sBAAAMGiI6HwUhMwjIAnbzAU7hCVU0CMg1eA7VOjrKLj43QxLtNwsADHdUFRYVFNP2Dw85Nw0vRwbsCgQsdAvMPQcGLkI+/x45IQ0NFnYb0QU4NFET5VhA2tEFODRRE+VAEu03P0UI8AIMBA5zfeLTXRvRBTg0URPlfD7/Ej4tQwnwAgwEDnN94tNlJ8A8Pz0CNEkT7TcHCAYuTgjzPzANDSl0CdwKLj4fWkrozTcHCAYuTgjzPzANDSl0CdwKLj4nLx4CBAkIATQGIi4eHjkhDQ0qdA7HBQcucgnMAT8kCSE5LkMd8CIJAksUySpvEsMJCRM8IjUKPzgNLwESKzUMChE1PQAwBzYPBjUFLUgN6wEDMhEKPDcwPxAbDTMyHEQy/T8NNiMCDSoDAwYSCDczNg0SNy0JEzc1PwY6PgIRATkJGTcnPTsBPgM+AhE1PQAwBwI7BhI5MwIEAQkJLzIIOAAKNwcAPD89DQEzDgM4H0Ay9T0QLAMFNDYMBjgNAzM1ARE7AQsvMQ8MNAkFLDcTEz82AQkHNy0/BjwyABI+PTMAHjkhDQ06BT8uEAg1BSECCwETPwEAOQE6AgMvAgwEBgZ/PsAJA3A+0TU9ECg9GgY3LT8GAHw+ywM9NC4CDAQGBn8+wAkDQDvlAxA+Lj4OBDQGEXE+ywM9NAcGBAEtAwQKPjIGMzURFzkxBjM1ET8+BwoPNAA9OxAFMzIAB3490TcxDAYANj0TAWMA0wg3MwpCPvwJPjoQBTMyAAd+PdE3MQwGADY9EwFvPsExAwUICnkA/Ak+OhAFMzIAB3490TcxDAYANj0TAXc+wAIxPAIvBw0ACEM+/Ak+OhAFMzIAB3490TcxDAYANj0TAXMt9hEPfz38CT46EAUzMgAHfj3RNzEMBgA2PRMBcwDFCD91PvwJPjoQBTMyAAd+PdE3MQwGADY9EwFzCMI5fz38CT46EAUzMgAHRjH6OgZMAMQsPAk9AAkBAUY//AkCJQMQAgoqMRQRCTImAxACCioxFBExMxEACQsxMDEPDAADMTEPDCQ9HQouPhM8Ig4JMQcVvux"))
            expr_65 = arraylength:int(expr_5E:byte[])
            
            if (cmpne:boolean(expr_65:int, ldc:int(0))) {
                var_3_6B = expr_65:int
                var_1_6F = newarray:byte[](byte.class, expr_65:int)
                var_2_70 = expr_65:int
                
                do {
                    var_2_70 = add:int(var_2_70:int, ldc:int(-1))
                    expr_77 = loadelement:byte(expr_5E:byte[], var_2_70:int)
                    storeelement:byte(var_1_6F:byte[], var_2_70:int, ternaryop:byte(cmplt:boolean(add:int(add:int(var_2_70:int, ldc:int(2)), neg:int(var_3_6B:int)), ldc:int(0)), add:byte(expr_77:byte, loadelement:byte(var_1_6F:byte[], add:int(var_2_70:int, ldc:int(2)))), add:byte(expr_77:byte, ldc:byte(2))))
                } while (cmpne:boolean(var_2_70:int, ldc:int(0)))
                
                stack_A0_0 = stack_9D_0 = stack_B2_0 = stack_D4_0 = stack_D7_0 = stack_E9_0 = stack_108_0 = var_1_6F:byte[]
            }
            
            expr_A0 = arraylength:int(stack_A0_0:byte[])
            
            if (cmpne:boolean(expr_A0:int, ldc:int(0))) {
                var_1_AA = newarray:byte[](byte.class, expr_A0:int)
                var_2_AB = expr_A0:int
                
                do {
                    var_2_AB = add:int(var_2_AB:int, ldc:int(-1))
                    expr_B2 = loadelement:byte(stack_B2_0:byte[], var_2_AB:int)
                    storeelement:byte(var_1_AA:byte[], var_2_AB:int, add:int(xor:int(or:int(and:int(shl:int(expr_B2:byte, ldc:int(4)), ldc:int(-16)), and:int(shr:int(expr_B2:byte[expected:int], ldc:int(4)), ldc:int(15))), ldc:int(38)), ldc:int(99)))
                } while (cmpne:boolean(var_2_AB:int, ldc:int(0)))
                
                stack_D7_0 = stack_D4_0 = stack_E9_0 = stack_108_0 = var_1_AA:byte[]
            }
            
            var_4_D4 = stack_D4_0:byte[]
            expr_D9 = add:int(arraylength:int(stack_D7_0:byte[]), ldc:int(-1))
            
            if (cmpne:boolean(expr_D9:int, ldc:int(0))) {
                var_1_E1 = newarray:byte[](byte.class, expr_D9:int)
                var_2_E2 = expr_D9:int
                
                do {
                    var_2_E2 = add:int(var_2_E2:int, ldc:int(-1))
                    storeelement:byte(var_1_E1:byte[], var_2_E2:int, add:int(shl:int(loadelement:byte(stack_E9_0:byte[], var_2_E2:int), ldc:int(2)), and:int(shr:int(loadelement:byte(var_4_D4:byte[], add:int(var_2_E2:int, ldc:int(1))), ldc:int(6)), ldc:int(3))))
                } while (cmpne:boolean(var_2_E2:int, ldc:int(0)))
                
                stack_108_0 = var_1_E1:byte[]
            }
            
            var_1_114 = initobject:String(String::<init>, stack_108_0:byte[], getstatic:Charset(StandardCharsets::UTF_8))
            expr_118 = newarray:String[](Ljava.lang.String.class, ldc:int(62))
            expr_11E = newarray:String[](Ljava.lang.String.class, ldc:int(62))
            storeelement:String(expr_11E:String[], ldc:int(16), invokevirtual:String[expected:String](String::substring, var_1_114:String, ldc:int(0), ldc:int(0)))
            storeelement:String(expr_11E:String[], ldc:int(13), invokevirtual:String[expected:String](String::substring, var_1_114:String, ldc:int(0), ldc:int(9)))
            storeelement:String(expr_11E:String[], ldc:int(15), invokevirtual:String[expected:String](String::substring, var_1_114:String, ldc:int(9), ldc:int(13)))
            storeelement:String(expr_11E:String[], ldc:int(21), invokevirtual:String[expected:String](String::substring, var_1_114:String, ldc:int(13), ldc:int(15)))
            storeelement:String(expr_11E:String[], ldc:int(20), invokevirtual:String[expected:String](String::substring, var_1_114:String, ldc:int(15), ldc:int(20)))
            storeelement:String(expr_11E:String[], ldc:int(19), invokevirtual:String[expected:String](String::substring, var_1_114:String, ldc:int(20), ldc:int(21)))
            storeelement:String(expr_11E:String[], ldc:int(14), invokevirtual:String[expected:String](String::substring, var_1_114:String, ldc:int(21), ldc:int(41)))
            storeelement:String(expr_11E:String[], ldc:int(52), invokevirtual:String[expected:String](String::substring, var_1_114:String, ldc:int(41), ldc:int(56)))
            storeelement:String(expr_11E:String[], ldc:int(18), invokevirtual:String[expected:String](String::substring, var_1_114:String, ldc:int(56), ldc:int(59)))
            storeelement:String(expr_11E:String[], ldc:int(46), invokevirtual:String[expected:String](String::substring, var_1_114:String, ldc:int(59), ldc:int(90)))
            storeelement:String(expr_11E:String[], ldc:int(12), invokevirtual:String[expected:String](String::substring, var_1_114:String, ldc:int(90), ldc:int(100)))
            storeelement:String(expr_11E:String[], ldc:int(2), invokevirtual:String[expected:String](String::substring, var_1_114:String, ldc:int(100), ldc:int(125)))
            storeelement:String(expr_11E:String[], ldc:int(3), invokevirtual:String[expected:String](String::substring, var_1_114:String, ldc:int(125), ldc:int(151)))
            storeelement:String(expr_11E:String[], ldc:int(53), invokevirtual:String[expected:String](String::substring, var_1_114:String, ldc:int(151), ldc:int(182)))
            storeelement:String(expr_11E:String[], ldc:int(48), invokevirtual:String[expected:String](String::substring, var_1_114:String, ldc:int(182), ldc:int(184)))
            storeelement:String(expr_11E:String[], ldc:int(51), invokevirtual:String[expected:String](String::substring, var_1_114:String, ldc:int(184), ldc:int(206)))
            storeelement:String(expr_11E:String[], ldc:int(49), invokevirtual:String[expected:String](String::substring, var_1_114:String, ldc:int(206), ldc:int(216)))
            storeelement:String(expr_11E:String[], ldc:int(47), invokevirtual:String[expected:String](String::substring, var_1_114:String, ldc:int(216), ldc:int(236)))
            storeelement:String(expr_11E:String[], ldc:int(43), invokevirtual:String[expected:String](String::substring, var_1_114:String, ldc:int(236), ldc:int(256)))
            storeelement:String(expr_11E:String[], ldc:int(50), invokevirtual:String[expected:String](String::substring, var_1_114:String, ldc:int(256), ldc:int(264)))
            storeelement:String(expr_11E:String[], ldc:int(39), invokevirtual:String[expected:String](String::substring, var_1_114:String, ldc:int(264), ldc:int(277)))
            storeelement:String(expr_11E:String[], ldc:int(28), invokevirtual:String[expected:String](String::substring, var_1_114:String, ldc:int(277), ldc:int(287)))
            storeelement:String(expr_11E:String[], ldc:int(22), invokevirtual:String[expected:String](String::substring, var_1_114:String, ldc:int(287), ldc:int(293)))
            storeelement:String(expr_11E:String[], ldc:int(30), invokevirtual:String[expected:String](String::substring, var_1_114:String, ldc:int(293), ldc:int(307)))
            storeelement:String(expr_11E:String[], ldc:int(31), invokevirtual:String[expected:String](String::substring, var_1_114:String, ldc:int(307), ldc:int(312)))
            storeelement:String(expr_11E:String[], ldc:int(9), invokevirtual:String[expected:String](String::substring, var_1_114:String, ldc:int(312), ldc:int(318)))
            storeelement:String(expr_11E:String[], ldc:int(23), invokevirtual:String[expected:String](String::substring, var_1_114:String, ldc:int(318), ldc:int(322)))
            storeelement:String(expr_11E:String[], ldc:int(24), invokevirtual:String[expected:String](String::substring, var_1_114:String, ldc:int(322), ldc:int(329)))
            storeelement:String(expr_11E:String[], ldc:int(40), invokevirtual:String[expected:String](String::substring, var_1_114:String, ldc:int(329), ldc:int(344)))
            storeelement:String(expr_11E:String[], ldc:int(38), invokevirtual:String[expected:String](String::substring, var_1_114:String, ldc:int(344), ldc:int(352)))
            storeelement:String(expr_11E:String[], ldc:int(45), invokevirtual:String[expected:String](String::substring, var_1_114:String, ldc:int(352), ldc:int(363)))
            storeelement:String(expr_11E:String[], ldc:int(1), invokevirtual:String[expected:String](String::substring, var_1_114:String, ldc:int(363), ldc:int(368)))
            storeelement:String(expr_11E:String[], ldc:int(37), invokevirtual:String[expected:String](String::substring, var_1_114:String, ldc:int(368), ldc:int(374)))
            storeelement:String(expr_11E:String[], ldc:int(33), invokevirtual:String[expected:String](String::substring, var_1_114:String, ldc:int(374), ldc:int(377)))
            storeelement:String(expr_11E:String[], ldc:int(6), invokevirtual:String[expected:String](String::substring, var_1_114:String, ldc:int(377), ldc:int(387)))
            storeelement:String(expr_11E:String[], ldc:int(26), invokevirtual:String[expected:String](String::substring, var_1_114:String, ldc:int(387), ldc:int(396)))
            storeelement:String(expr_11E:String[], ldc:int(29), invokevirtual:String[expected:String](String::substring, var_1_114:String, ldc:int(396), ldc:int(409)))
            storeelement:String(expr_11E:String[], ldc:int(11), invokevirtual:String[expected:String](String::substring, var_1_114:String, ldc:int(409), ldc:int(413)))
            storeelement:String(expr_11E:String[], ldc:int(17), invokevirtual:String[expected:String](String::substring, var_1_114:String, ldc:int(413), ldc:int(417)))
            storeelement:String(expr_11E:String[], ldc:int(41), invokevirtual:String[expected:String](String::substring, var_1_114:String, ldc:int(417), ldc:int(424)))
            storeelement:String(expr_11E:String[], ldc:int(10), invokevirtual:String[expected:String](String::substring, var_1_114:String, ldc:int(424), ldc:int(429)))
            storeelement:String(expr_11E:String[], ldc:int(7), invokevirtual:String[expected:String](String::substring, var_1_114:String, ldc:int(429), ldc:int(438)))
            storeelement:String(expr_11E:String[], ldc:int(27), invokevirtual:String[expected:String](String::substring, var_1_114:String, ldc:int(438), ldc:int(449)))
            storeelement:String(expr_11E:String[], ldc:int(54), invokevirtual:String[expected:String](String::substring, var_1_114:String, ldc:int(449), ldc:int(456)))
            storeelement:String(expr_11E:String[], ldc:int(0), invokevirtual:String[expected:String](String::substring, var_1_114:String, ldc:int(456), ldc:int(488)))
            storeelement:String(expr_11E:String[], ldc:int(4), invokevirtual:String[expected:String](String::substring, var_1_114:String, ldc:int(488), ldc:int(518)))
            storeelement:String(expr_11E:String[], ldc:int(32), invokevirtual:String[expected:String](String::substring, var_1_114:String, ldc:int(518), ldc:int(521)))
            storeelement:String(expr_11E:String[], ldc:int(42), invokevirtual:String[expected:String](String::substring, var_1_114:String, ldc:int(521), ldc:int(527)))
            storeelement:String(expr_11E:String[], ldc:int(36), invokevirtual:String[expected:String](String::substring, var_1_114:String, ldc:int(527), ldc:int(534)))
            storeelement:String(expr_11E:String[], ldc:int(34), invokevirtual:String[expected:String](String::substring, var_1_114:String, ldc:int(534), ldc:int(547)))
            storeelement:String(expr_118:String[], ldc:int(57), invokevirtual:String[expected:String](String::substring, var_1_114:String, ldc:int(547), ldc:int(578)))
            storeelement:String(expr_118:String[], ldc:int(58), invokevirtual:String[expected:String](String::substring, var_1_114:String, ldc:int(578), ldc:int(610)))
            storeelement:String(expr_118:String[], ldc:int(55), invokevirtual:String[expected:String](String::substring, var_1_114:String, ldc:int(610), ldc:int(646)))
            storeelement:String(expr_118:String[], ldc:int(60), invokevirtual:String[expected:String](String::substring, var_1_114:String, ldc:int(646), ldc:int(675)))
            storeelement:String(expr_118:String[], ldc:int(61), invokevirtual:String[expected:String](String::substring, var_1_114:String, ldc:int(675), ldc:int(704)))
            storeelement:String(expr_118:String[], ldc:int(56), invokevirtual:String[expected:String](String::substring, var_1_114:String, ldc:int(704), ldc:int(732)))
            storeelement:String(expr_118:String[], ldc:int(59), invokevirtual:String[expected:String](String::substring, var_1_114:String, ldc:int(732), ldc:int(760)))
            storeelement:String(expr_11E:String[], ldc:int(5), invokevirtual:String[expected:String](String::substring, var_1_114:String, ldc:int(760), ldc:int(771)))
            storeelement:String(expr_11E:String[], ldc:int(44), invokevirtual:String[expected:String](String::substring, var_1_114:String, ldc:int(771), ldc:int(787)))
            storeelement:String(expr_11E:String[], ldc:int(25), invokevirtual:String[expected:String](String::substring, var_1_114:String, ldc:int(787), ldc:int(793)))
            storeelement:String(expr_11E:String[], ldc:int(35), invokevirtual:String[expected:String](String::substring, var_1_114:String, ldc:int(793), ldc:int(805)))
            storeelement:String(expr_11E:String[], ldc:int(8), invokevirtual:String[expected:String](String::substring, var_1_114:String, ldc:int(805), ldc:int(812)))
            putstatic:String[](\u9937\u7d52\u3e75\u98a4\u8aa5\u7006::\ub8be\ud171\u8c8a\ub1b9\u76bc\u5bc4, expr_11E:String[])
            var_1_4D4 = expr_118:String[]
            putstatic:Logger(\u9937\u7d52\u3e75\u98a4\u8aa5\u7006::\ubff1\u624e\u5f50\u76bc\u76bc\u2dcc, invokestatic:Logger(LogManager::getLogger))
            putstatic:\u4179\ubb2b\uc7fe\u51fa\uc910\u8753(\u9937\u7d52\u3e75\u98a4\u8aa5\u7006::\uc3e3\u9af2\uae87\u8753\uae5d\u34df, initobject:\u4179\ubb2b\uc7fe\u51fa\uc910\u8753(\u4179\ubb2b\uc7fe\u51fa\uc910\u8753::<init>, loadelement:String(var_1_4D4:String[], ldc:int(55))))
            putstatic:\u4179\ubb2b\uc7fe\u51fa\uc910\u8753(\u9937\u7d52\u3e75\u98a4\u8aa5\u7006::\ubff1\u64f2\uff55\uc229\u36d3\uc2bd, initobject:\u4179\ubb2b\uc7fe\u51fa\uc910\u8753(\u4179\ubb2b\uc7fe\u51fa\uc910\u8753::<init>, loadelement:String(var_1_4D4:String[], ldc:int(56))))
            putstatic:\u4179\ubb2b\uc7fe\u51fa\uc910\u8753(\u9937\u7d52\u3e75\u98a4\u8aa5\u7006::\u4ab3\u4975\ua61f\u446c\ub18d\u4ab3, initobject:\u4179\ubb2b\uc7fe\u51fa\uc910\u8753(\u4179\ubb2b\uc7fe\u51fa\uc910\u8753::<init>, loadelement:String(var_1_4D4:String[], ldc:int(57))))
            putstatic:\u4179\ubb2b\uc7fe\u51fa\uc910\u8753(\u9937\u7d52\u3e75\u98a4\u8aa5\u7006::\u52d3\ub32d\u47c2\u92ff\u3a62\uc4d2, initobject:\u4179\ubb2b\uc7fe\u51fa\uc910\u8753(\u4179\ubb2b\uc7fe\u51fa\uc910\u8753::<init>, loadelement:String(var_1_4D4:String[], ldc:int(58))))
            putstatic:\u4179\ubb2b\uc7fe\u51fa\uc910\u8753(\u9937\u7d52\u3e75\u98a4\u8aa5\u7006::\u74b1\uc238\u718f\u7330\u4cd9\ud36e, initobject:\u4179\ubb2b\uc7fe\u51fa\uc910\u8753(\u4179\ubb2b\uc7fe\u51fa\uc910\u8753::<init>, loadelement:String(var_1_4D4:String[], ldc:int(59))))
            putstatic:\u4179\ubb2b\uc7fe\u51fa\uc910\u8753(\u9937\u7d52\u3e75\u98a4\u8aa5\u7006::\u16f6\ubefe\ub113\ub18d\u836c\u4e72, initobject:\u4179\ubb2b\uc7fe\u51fa\uc910\u8753(\u4179\ubb2b\uc7fe\u51fa\uc910\u8753::<init>, loadelement:String(var_1_4D4:String[], ldc:int(60))))
            putstatic:\u4179\ubb2b\uc7fe\u51fa\uc910\u8753(\u9937\u7d52\u3e75\u98a4\u8aa5\u7006::\ub70c\uff55\u156b\u7006\u8d98\uf94d, initobject:\u4179\ubb2b\uc7fe\u51fa\uc910\u8753(\u4179\ubb2b\uc7fe\u51fa\uc910\u8753::<init>, loadelement:String(var_1_4D4:String[], ldc:int(61))))
            putstatic:\u760c\u4975\u4179\uc246\u8640\u64f2[](\u9937\u7d52\u3e75\u98a4\u8aa5\u7006::\ub113\u92ff\ubb2b\u4d85\u5140\u4f4a, invokestatic:\u760c\u4975\u4179\uc246\u8640\u64f2[](\u760c\u4975\u4179\uc246\u8640\u64f2::values))
            putstatic:Set(\u9937\u7d52\u3e75\u98a4\u8aa5\u7006::\u6ec6\uc229\u516c\u7bad\uc3e3\uf94d, invokestatic:Set<Object>(Collections::unmodifiableSet, initobject:HashSet<Object>[expected:Set<?>](HashSet<?>::<init>, invokestatic:List<\u760c\u4975\u4179\uc246\u8640\u64f2>[expected:Collection<?>](Arrays::asList, getstatic:\u760c\u4975\u4179\uc246\u8640\u64f2[](\u760c\u4975\u4179\uc246\u8640\u64f2::\u3711\u0800\u59ec\ucfaf\uc31c\u97b7)))))
            putstatic:int(\u9937\u7d52\u3e75\u98a4\u8aa5\u7006::\u76bc\u4cd9\uc4d2\u97b7\uc84e\ub32d, ldc:int(0))
            putstatic:boolean(\u9937\u7d52\u3e75\u98a4\u8aa5\u7006::\u16f6\u446c\u4bc8\u6cfe\u4bc8\u9af2, ldc:boolean(0))
            return:void()
        }
        
        goto(Label_0006)
    }
    
    public void \u1833\u3c25\u97e6\u516c\u12b2\u51b2(\u6ec6\ubb2b\uf94d\u6d99\u4f52.\uae87\u3bc9\u3bc9\u7049\uc246\u3e75 p0, \u7c6b\u7c6b\ubefe\u385b\u3c25.\u4ab3\ub83f\u718f\ucb79\u120d.\u6b5f\u5f50\ubefe\ucfaf\u4f52\ub18d p1) {
        var_3_6B : int
        var_4_71 : int
        var_5_7A : double
        var_7_81 : double
        var_9_9A : int
        var_10_A3 : double
        var_12_A7 : double
        var_14_AB : int
        var_9_143 : int
        var_9_197 : int
        var_15_118 : int
        
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
            
            if (cmpeq:boolean(getstatic:double(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u6c56\u8cae\uc31c\u446c\uc9f6\u873d), ldc:double(0.0))) {
                invokestatic:void(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u0800\u2dcc\uc4d2\u8aa5\u4cd9\u51b2, this:\u9937\u7d52\u3e75\u98a4\u8aa5\u7006[expected:Object], p0:\uae87\u3bc9\u3bc9\u7049\uc246\u3e75[expected:Object])
            }
            else {
                var_3_6B = ldc:int(0)
                var_4_71 = invokestatic:int(\uae87\u3bc9\u3bc9\u7049\uc246\u3e75::\u8389\u3bd6\u3bc9\uc2bd\u8640\u52d3)
                var_5_7A = loadelement:double(getstatic:double[](\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), ldc:int(0))
                invokestatic:int(m::a)
                
                loop {
                    var_7_81 = ldc:double(0.0)
                    
                    if (cmpeq:boolean(getstatic:ap(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::a), getstatic:ap(ap::a))) {
                        var_9_9A = sub:int(add:int(invokestatic:int(d::a, getstatic:double(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u6c56\u8cae\uc31c\u446c\uc9f6\u873d)), var_3_6B:int), ldc:int(1))
                        var_10_A3 = var_12_A7 = loadelement(getstatic(\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), var_3_6B)
                        
                        if (cmplt:boolean(var_14_AB = var_9_9A:int, var_4_71:int)) {
                            var_7_81 = loadelement:double(getstatic:double[](\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), var_9_9A:int)
                            var_14_AB = var_9_9A:int
                            var_12_A7 = var_10_A3:double
                        }
                    }
                    else {
                        var_7_81 = sub:double(var_5_7A:double, mul:double(getstatic:double(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u6c56\u8cae\uc31c\u446c\uc9f6\u873d), ldc:double(0.001)))
                        var_9_143 = var_3_6B:int
                        
                        while (logicaland:boolean(cmplt:boolean(var_9_143:int, sub:int(var_4_71:int, ldc:int(1))), cmplt:boolean(loadelement:double(getstatic:double[](\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), add:int(var_9_143:int, ldc:int(1))), var_5_7A:double))) {
                            inc:int(var_9_143, ldc:int(1))
                        }
                        
                        var_12_A7 = var_5_7A:double
                        var_14_AB = var_9_143:int
                    }
                    
                    if (cmplt:boolean(var_14_AB:int, var_4_71:int)) {
                        if (cmpne:boolean(getstatic:ao(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::i), getstatic:ao(ao::a))) {
                            if (cmpeq:boolean(getstatic:ao(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::i), getstatic:ao(ao::c))) {
                                var_12_A7 = var_7_81:double
                            }
                            else {
                                var_12_A7 = mul:double(ldc:double(0.5), add:double(var_7_81:double, var_12_A7:double))
                            }
                        }
                        
                        if (logicaland:boolean(cmpeq:boolean(getstatic:ap(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::a), getstatic:ap(ap::b)), cmplt:boolean(loadelement:double(getstatic:double[](\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), var_3_6B:int), var_5_7A:double))) {
                            var_9_197 = ldc:int(1)
                        }
                        else {
                            var_9_197 = ldc:int(0)
                        }
                        
                        if (logicalor:boolean(cmpeq:boolean(getstatic:ap(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::a), getstatic:ap(ap::a)), cmpne:boolean(var_9_197:int, ldc:int(0)))) {
                            invokestatic:void(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u0800\u2dcc\uc4d2\u8aa5\u4cd9\u51b2, p0:\uae87\u3bc9\u3bc9\u7049\uc246\u3e75, var_12_A7:double, var_3_6B:int, var_14_AB:int)
                        }
                        else {
                            invokestatic:void(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u0800\u2dcc\uc4d2\u8aa5\u4cd9\u51b2, invokestatic:boolean(\uae87\u3bc9\u3bc9\u7049\uc246\u3e75::\u0a06\u59ec\u93a2\u9937\ub83f\ub171), var_12_A7:double, ldc:double(0.0))
                        }
                    }
                    else {
                        var_9_197 = ldc:int(0)
                    }
                    
                    if (cmpne:boolean(getstatic:ap(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::a), getstatic:ap(ap::a))) {
                        var_15_118 = var_3_6B:int
                        
                        if (cmpeq:boolean(var_9_197:int, ldc:int(0))) {
                            goto(Label_0293)
                        }
                    }
                    
                    var_15_118 = add:int(var_14_AB:int, ldc:int(1))
                    Label_0293:
                    
                    if (cmpgt:boolean(var_3_6B = var_15_118:int, sub:int(var_4_71:int, ldc:int(1)))) {
                        looporswitchbreak()
                    }
                }
            }
            
            return:void()
        }
        
        goto(Label_0006)
    }
}
