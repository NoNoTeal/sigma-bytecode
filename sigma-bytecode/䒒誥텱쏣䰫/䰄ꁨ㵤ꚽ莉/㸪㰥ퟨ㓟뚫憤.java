public class \u4492\u8aa5\ud171\uc3e3\u4c2b.\u4c04\ua068\u3d64\ua6bd\u8389.\u3e2a\u3c25\ud7e8\u34df\ub6ab\u61a4 {
    public void \u3e2a\u3c25\ud7e8\u34df\ub6ab\u61a4() {
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
            invokespecial:Object(Object::<init>, this:\u3e2a\u3c25\ud7e8\u34df\ub6ab\u61a4)
            return:void()
        }
        
        goto(Label_0006)
    }
    
    public static boolean \u51b2\u8709\u8308\u5245\u61a4\u6c52(\u51fa\u12cb\u7330\u74b1\u6c52.\uae87\ub19c\u9937\u836c\u34df\ub8be p0, \u4f52\u6cfe\u9a18\uc29a\u3bd6.\u8389\u8413\u3a62\u8cae\uc31c\u6d69 p1) {
        var_2_C4 : int
        var_4_70 : ArrayList
        var_5_75 : ArrayList
        var_6_7A : ArrayList
        var_7_83 : File
        var_8_8C : File
        var_9_95 : File
        var_2_E0 : int
        var_10_F8 : int
        var_11_115 : \u7d52\u51fa\u56bd\u76bc\u4975\ub113
        var_13_12D : \u960f\u76bc\u8c8a\u5654\u4c2b\u59ec
        stack_16C_0 : long [generated]
        var_14_16C : long
        var_16_176 : \u97e6\u3a62\uc29a\u16f6\u647c\u5db4<Object>
        var_17_19B : \u56bd\uc4d2\u61a4\u4ab3\u1187
        
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
            var_2_C4 = and:int(ldc:int(1654469887), ldc:int(647970007))
            invokeinterface:void(\u8389\u8413\u3a62\u8cae\uc31c\u6d69::\u3dd3\ua3b4\u93a2\ucb79\u8389\ud7e8, p1:\u8389\u8413\u3a62\u8cae\uc31c\u6d69, and:int(ldc:int(-9731), ldc:int(9730)))
            var_4_70 = invokestatic:ArrayList(Lists::newArrayList)
            var_5_75 = invokestatic:ArrayList(Lists::newArrayList)
            var_6_7A = invokestatic:ArrayList(Lists::newArrayList)
            var_7_83 = invokevirtual:File(\uae87\ub19c\u9937\u836c\u34df\ub8be::\u120d\u8308\u8308\u965f\u5d20\uf9c5, p0:\uae87\ub19c\u9937\u836c\u34df\ub8be, getstatic:\u64f2\ub8be\u760c\u5245\u6c52\u7af6<\uf9c5\ud158\u4975\uf94d\ud523\uc31c>(\uf9c5\ud158\u4975\uf94d\ud523\uc31c::\u071d\u5140\u600f\u4975\ufcaf\u624e))
            var_8_8C = invokevirtual:File(\uae87\ub19c\u9937\u836c\u34df\ub8be::\u120d\u8308\u8308\u965f\u5d20\uf9c5, p0:\uae87\ub19c\u9937\u836c\u34df\ub8be, getstatic:\u64f2\ub8be\u760c\u5245\u6c52\u7af6<\uf9c5\ud158\u4975\uf94d\ud523\uc31c>(\uf9c5\ud158\u4975\uf94d\ud523\uc31c::\ubded\ub18d\u76bc\u8d98\u69d9\ucb79))
            var_9_95 = invokevirtual:File(\uae87\ub19c\u9937\u836c\u34df\ub8be::\u120d\u8308\u8308\u965f\u5d20\uf9c5, p0:\uae87\ub19c\u9937\u836c\u34df\ub8be, getstatic:\u64f2\ub8be\u760c\u5245\u6c52\u7af6<\uf9c5\ud158\u4975\uf94d\ud523\uc31c>(\uf9c5\ud158\u4975\uf94d\ud523\uc31c::\u4d85\u120d\u5654\u9033\u446c\u4c2b))
            invokeinterface:void(Logger::info, getstatic:Logger(\u3e2a\u3c25\ud7e8\u34df\ub6ab\u61a4::\ub83f\u5fe1\u0c95\u7043\u2dcc\ud171), loadelement:String(getstatic:String[](\u3e2a\u3c25\ud7e8\u34df\ub6ab\u61a4::\u5140\u8640\u3e75\u92ee\u6bb9\u839e), and:int(ldc:int(15472), ldc:int(-15473))))
            invokestatic:void(\u3e2a\u3c25\ud7e8\u34df\ub6ab\u61a4::\u156b\u4f52\u40a9\u8413\u8389\ud217, var_7_83:File, var_4_70:ArrayList<File>[expected:Collection<File>])
            
            if (invokevirtual:boolean(File::exists, var_8_8C:File)) {
                invokestatic:void(\u3e2a\u3c25\ud7e8\u34df\ub6ab\u61a4::\u156b\u4f52\u40a9\u8413\u8389\ud217, var_8_8C:File, var_5_75:ArrayList<File>[expected:Collection<File>])
            }
            
            loop {
                if (cmpeq:boolean(and:int(var_2_C4:int, ldc:int(2097152)), ldc:int(0))) {
                    var_2_C4 = and:int(var_2_C4:int, ldc:int(881409339))
                    
                    if (invokevirtual:boolean(File::exists, var_9_95:File)) {
                        invokestatic:void(\u3e2a\u3c25\ud7e8\u34df\ub6ab\u61a4::\u156b\u4f52\u40a9\u8413\u8389\ud217, var_9_95:File, var_6_7A:ArrayList<File>[expected:Collection<File>])
                    }
                }
                
                if (cmpeq:boolean(and:int(var_2_C4:int, ldc:int(512)), ldc:int(0))) {
                    looporswitchbreak()
                }
                
                var_2_C4 = and:int(var_2_C4:int, ldc:int(1279352268))
            }
            
            var_2_E0 = and:int(var_2_C4:int, ldc:int(1774876567))
            var_10_F8 = add:int(add:int(invokeinterface:int(List<E>::size, var_4_70:ArrayList<File>[expected:List<File>]), invokeinterface:int(List<E>::size, var_5_75:ArrayList<File>[expected:List<File>])), invokeinterface:int(List<E>::size, var_6_7A:ArrayList<File>[expected:List<File>]))
            invokeinterface:void(Logger::info, getstatic:Logger(\u3e2a\u3c25\ud7e8\u34df\ub6ab\u61a4::\ub83f\u5fe1\u0c95\u7043\u2dcc\ud171), loadelement:String(getstatic:String[](\u3e2a\u3c25\ud7e8\u34df\ub6ab\u61a4::\u5140\u8640\u3e75\u92ee\u6bb9\u839e), xor:int(ldc:int(16400), ldc:int(16401))), invokestatic:Integer(Integer::valueOf, var_10_F8:int))
            var_11_115 = invokestatic:\u7d52\u51fa\u56bd\u76bc\u4975\ub113(\u3bd6\u527a\uc2bd\u8cae\u7330\ua61f::\u4bc8\ub6ab\u97b7\u3e2a\uc9f6\u76bc)
            var_13_12D = invokevirtual:\u960f\u76bc\u8c8a\u5654\u4c2b\u59ec(\uae87\ub19c\u9937\u836c\u34df\ub8be::\ua6bd\ubcb0\u0800\u7330\ucef1\u76bc, p0:\uae87\ub19c\u9937\u836c\u34df\ub8be, invokestatic:\ud171\ub171\u4c2b\uae5d\u4c04\u494c<Object>[expected:DynamicOps<\u93a2\u97b7\u647c\ud36e\u64ab>](\ud171\ub171\u4c2b\uae5d\u4c04\u494c<T>::\u8753\u3a62\u12cb\u9a18\u67d0\u47c2, getstatic:\u760c\uf995\uae5d\u446c\uceb8[expected:DynamicOps](\u760c\uf995\uae5d\u446c\uceb8::\u6d99\u8350\u9255\u8640\uf9c5\ud36e), getstatic:\u839e\ucef1\ub1b9\u67d0\u97e6[expected:\u6c52\u52d3\u516c\uae87\uae5d](\u839e\ucef1\ub1b9\u67d0\u97e6::\u5bc4\u47c2\u6b5f\u3bd6\u5bc4\ub6ab), var_11_115:\u7d52\u51fa\u56bd\u76bc\u4975\ub113), getstatic:\u51b2\ubb2b\ud171\u960f\u3d4b\ufcaf(\u51b2\ubb2b\ud171\u960f\u3d4b\ufcaf::\u8308\u4e72\u5f50\u9937\u3c25\u7bad))
            
            if (cmpeq:boolean(var_13_12D:\u960f\u76bc\u8c8a\u5654\u4c2b\u59ec, aconstnull:\u960f\u76bc\u8c8a\u5654\u4c2b\u59ec())) {
                var_2_E0 = and:int(var_2_E0:int, ldc:int(881425879))
                stack_16C_0 = ldc:long(0L)
            }
            else {
                stack_16C_0 = invokevirtual:long(\u7043\u40a9\u4975\u0800\u385b::\ubf56\u071d\u873d\u4c04\u0800\uc29a, invokeinterface:\u7043\u40a9\u4975\u0800\u385b(\u960f\u76bc\u8c8a\u5654\u4c2b\u59ec::\ub32d\u446c\uf9c5\u3504\u4c04\u7ce1, var_13_12D:\u960f\u76bc\u8c8a\u5654\u4c2b\u59ec))
            }
            
            var_14_16C = stack_16C_0:long
            var_16_176 = invokevirtual:\u97e6\u3a62\uc29a\u16f6\u647c\u5db4<Object>(\u3bd6\u527a\uc2bd\u8cae\u7330\ua61f::\ucb79\ud36e\uc4d2\uc2e8\u3776\ub171, var_11_115:\u7d52\u51fa\u56bd\u76bc\u4975\ub113[expected:\u3bd6\u527a\uc2bd\u8cae\u7330\ua61f], getstatic:\u64f2\ub8be\u760c\u5245\u6c52\u7af6<\ud12e\ub8be\u69d9\uc246\uc84e\u9255<\uc2e8\u9255\u647c\ud171\ubf56>>(\ud12e\ub8be\u69d9\uc246\uc84e\u9255::\u4d85\u071d\u4c2b\ua6bd\uc238\u718f))
            
            if (logicaland:boolean(cmpne:boolean(var_13_12D:\u960f\u76bc\u8c8a\u5654\u4c2b\u59ec, aconstnull:\u960f\u76bc\u8c8a\u5654\u4c2b\u59ec()), invokevirtual:boolean(\u7043\u40a9\u4975\u0800\u385b::\u4f52\u927d\u61a4\ub1b9\u3e2a\ud51e, invokeinterface:\u7043\u40a9\u4975\u0800\u385b(\u960f\u76bc\u8c8a\u5654\u4c2b\u59ec::\ub32d\u446c\uf9c5\u3504\u4c04\u7ce1, var_13_12D:\u960f\u76bc\u8c8a\u5654\u4c2b\u59ec)))) {
                var_17_19B = initobject:\u494c\ucfaf\u5bc4\u4c2b\u3bd6[expected:\u56bd\uc4d2\u61a4\u4ab3\u1187](\u494c\ucfaf\u5bc4\u4c2b\u3bd6::<init>, checkcast:\uc2e8\u9255\u647c\ud171\ubf56(\u51fa\u12cb\u7330\u74b1\u6c52.\uc2e8\u9255\u647c\ud171\ubf56.class, invokevirtual:\uc2e8\u9255\u647c\ud171\ubf56(\ud12e\ub8be\u69d9\uc246\uc84e\u9255<\uc2e8\u9255\u647c\ud171\ubf56>::\u624e\u62da\u9937\uafe7\u8389\u98a4, var_16_176:\ud12e\ub8be\u69d9\uc246\uc84e\u9255<\uc2e8\u9255\u647c\ud171\ubf56>, getstatic:\u64f2\ub8be\u760c\u5245\u6c52\u7af6<\uc2e8\u9255\u647c\ud171\ubf56>(\ud523\u7330\u7049\u9033\ub32d::\u3d4b\u7d52\u6bb9\uf995\u416d\u5140))))
            }
            else {
                var_17_19B = initobject:\uc84e\u52d3\u983f\uc9f6\u3dd3[expected:\u56bd\uc4d2\u61a4\u4ab3\u1187](\uc84e\u52d3\u983f\uc9f6\u3dd3::<init>, var_14_16C:long, and:int[expected:boolean](ldc:int(-8359), ldc:int(8358)), and:int[expected:boolean](ldc:int(-15212), ldc:int(14635)), var_16_176:\ud12e\ub8be\u69d9\uc246\uc84e\u9255<\uc2e8\u9255\u647c\ud171\ubf56>)
            }
            
            invokestatic:void(\u3e2a\u3c25\ud7e8\u34df\ub6ab\u61a4::\u34df\u8389\ub7dc\u8413\ub8be\ubf56, var_11_115:\u7d52\u51fa\u56bd\u76bc\u4975\ub113, initobject:File(File::<init>, var_7_83:File, loadelement:String(getstatic:String[](\u3e2a\u3c25\ud7e8\u34df\ub6ab\u61a4::\u5140\u8640\u3e75\u92ee\u6bb9\u839e), and:int(ldc:int(11266), ldc:int(338)))), var_4_70:ArrayList<File>[expected:Iterable<File>], var_17_19B:\u56bd\uc4d2\u61a4\u4ab3\u1187, and:int(ldc:int(-17374), ldc:int(17225)), var_10_F8:int, p1:\u8389\u8413\u3a62\u8cae\uc31c\u6d69)
            invokestatic:void(\u3e2a\u3c25\ud7e8\u34df\ub6ab\u61a4::\u34df\u8389\ub7dc\u8413\ub8be\ubf56, var_11_115:\u7d52\u51fa\u56bd\u76bc\u4975\ub113, initobject:File(File::<init>, var_8_8C:File, loadelement:String(getstatic:String[](\u3e2a\u3c25\ud7e8\u34df\ub6ab\u61a4::\u5140\u8640\u3e75\u92ee\u6bb9\u839e), xor:int(ldc:int(7), ldc:int(5)))), var_5_75:ArrayList<File>[expected:Iterable<File>], initobject:\u494c\ucfaf\u5bc4\u4c2b\u3bd6(\u494c\ucfaf\u5bc4\u4c2b\u3bd6::<init>, checkcast:\uc2e8\u9255\u647c\ud171\ubf56(\u51fa\u12cb\u7330\u74b1\u6c52.\uc2e8\u9255\u647c\ud171\ubf56.class, invokevirtual:\uc2e8\u9255\u647c\ud171\ubf56(\ud12e\ub8be\u69d9\uc246\uc84e\u9255<\uc2e8\u9255\u647c\ud171\ubf56>::\u624e\u62da\u9937\uafe7\u8389\u98a4, var_16_176:\ud12e\ub8be\u69d9\uc246\uc84e\u9255<\uc2e8\u9255\u647c\ud171\ubf56>, getstatic:\u64f2\ub8be\u760c\u5245\u6c52\u7af6<\uc2e8\u9255\u647c\ud171\ubf56>(\ud523\u7330\u7049\u9033\ub32d::\u836c\uc246\uc910\uf9c5\u0800\u40a9)))), invokeinterface:int(List<E>::size, var_4_70:ArrayList<File>[expected:List<File>]), var_10_F8:int, p1:\u8389\u8413\u3a62\u8cae\uc31c\u6d69)
            invokestatic:void(\u3e2a\u3c25\ud7e8\u34df\ub6ab\u61a4::\u34df\u8389\ub7dc\u8413\ub8be\ubf56, var_11_115:\u7d52\u51fa\u56bd\u76bc\u4975\ub113, initobject:File(File::<init>, var_9_95:File, loadelement:String(getstatic:String[](\u3e2a\u3c25\ud7e8\u34df\ub6ab\u61a4::\u5140\u8640\u3e75\u92ee\u6bb9\u839e), and:int(ldc:int(9282), ldc:int(21046)))), var_6_7A:ArrayList<File>[expected:Iterable<File>], initobject:\u494c\ucfaf\u5bc4\u4c2b\u3bd6(\u494c\ucfaf\u5bc4\u4c2b\u3bd6::<init>, checkcast:\uc2e8\u9255\u647c\ud171\ubf56(\u51fa\u12cb\u7330\u74b1\u6c52.\uc2e8\u9255\u647c\ud171\ubf56.class, invokevirtual:\uc2e8\u9255\u647c\ud171\ubf56(\ud12e\ub8be\u69d9\uc246\uc84e\u9255<\uc2e8\u9255\u647c\ud171\ubf56>::\u624e\u62da\u9937\uafe7\u8389\u98a4, var_16_176:\ud12e\ub8be\u69d9\uc246\uc84e\u9255<\uc2e8\u9255\u647c\ud171\ubf56>, getstatic:\u64f2\ub8be\u760c\u5245\u6c52\u7af6<\uc2e8\u9255\u647c\ud171\ubf56>(\ud523\u7330\u7049\u9033\ub32d::\u8308\u9255\u3dd3\ud158\u6bb9\u1833)))), add:int(invokeinterface:int(List<E>::size, var_4_70:ArrayList<File>[expected:List<File>]), invokeinterface:int(List<E>::size, var_5_75:ArrayList<File>[expected:List<File>])), var_10_F8:int, p1:\u8389\u8413\u3a62\u8cae\uc31c\u6d69)
            invokestatic:void(\u3e2a\u3c25\ud7e8\u34df\ub6ab\u61a4::\u5db4\ube23\uc87f\u4f52\u4cd9\ub6ab, p0:\uae87\ub19c\u9937\u836c\u34df\ub8be)
            invokevirtual:void(\uae87\ub19c\u9937\u836c\u34df\ub8be::\u6435\u8bb0\ud217\u47c2\u12cb\ub70c, p0:\uae87\ub19c\u9937\u836c\u34df\ub8be, var_11_115:\u7d52\u51fa\u56bd\u76bc\u4975\ub113[expected:\u3bd6\u527a\uc2bd\u8cae\u7330\ua61f], var_13_12D:\u960f\u76bc\u8c8a\u5654\u4c2b\u59ec)
            return:boolean(and:int[expected:boolean](ldc:int(4105), ldc:int(289)))
        }
        
        goto(Label_0006)
    }
    
    private static void \u5db4\ube23\uc87f\u4f52\u4cd9\ub6ab(\u51fa\u12cb\u7330\u74b1\u6c52.\uae87\ub19c\u9937\u836c\u34df\ub8be p0) {
        var_1_5F : int
        var_3_6C : File
        
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
            var_1_5F = and:int(ldc:int(-1993680149), ldc:int(230410723))
            var_3_6C = invokeinterface:File(Path::toFile, invokevirtual:Path(\uae87\ub19c\u9937\u836c\u34df\ub8be::\u759a\u7bad\u59ec\u3d64\u7043\u3bc9, p0:\uae87\ub19c\u9937\u836c\u34df\ub8be, getstatic:\u51b2\ub6ab\u5654\u647c\ub102\u8d90(\u51b2\ub6ab\u5654\u647c\ub102\u8d90::\ub32d\u873d\uf995\ud217\u8709\u51b2)))
            
            if (invokevirtual:boolean(File::exists, var_3_6C:File)) {
                var_1_5F = and:int(var_1_5F:int, ldc:int(1777158887))
                
                if (logicalnot:boolean(invokevirtual:boolean(File::renameTo, var_3_6C:File, initobject:File(File::<init>, invokevirtual:String(File::getParent, var_3_6C:File), loadelement:String(getstatic:String[](\u3e2a\u3c25\ud7e8\u34df\ub6ab\u61a4::\u5140\u8640\u3e75\u92ee\u6bb9\u839e), xor:int(ldc:int(8496), ldc:int(8500))))))) {
                    invokeinterface:void(Logger::warn, getstatic:Logger(\u3e2a\u3c25\ud7e8\u34df\ub6ab\u61a4::\ub83f\u5fe1\u0c95\u7043\u2dcc\ud171), loadelement:String(getstatic:String[](\u3e2a\u3c25\ud7e8\u34df\ub6ab\u61a4::\u5140\u8640\u3e75\u92ee\u6bb9\u839e), and:int(ldc:int(803), ldc:int(20571))))
                }
            }
            else {
                invokeinterface:void(Logger::warn, getstatic:Logger(\u3e2a\u3c25\ud7e8\u34df\ub6ab\u61a4::\ub83f\u5fe1\u0c95\u7043\u2dcc\ud171), loadelement:String(getstatic:String[](\u3e2a\u3c25\ud7e8\u34df\ub6ab\u61a4::\u5140\u8640\u3e75\u92ee\u6bb9\u839e), xor:int(ldc:int(-26592), ldc:int(-26589))))
            }
            
            return:void()
        }
        
        goto(Label_0006)
    }
    
    private static void \u34df\u8389\ub7dc\u8413\ub8be\ubf56(\u5d20\u7043\u88c5\u5db4\uf94d.\u7d52\u51fa\u56bd\u76bc\u4975\ub113 p0, java.io.File p1, java.lang.Iterable<java.io.File> p2, \u5245\u8aa5\u61a4\u7049\u4cd9.\u56bd\uc4d2\u61a4\u4ab3\u1187 p3, int p4, int p5, \u4f52\u6cfe\u9a18\uc29a\u3bd6.\u8389\u8413\u3a62\u8cae\uc31c\u6d69 p6) {
        var_7_63 : int
        var_9_6B : Iterator<File>
        
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
            var_7_63 = and:int(ldc:int(1672171431), ldc:int(-1082166105))
            var_9_6B = invokeinterface:Iterator<File>(Iterable<File>::iterator, p2:Iterable<File>)
            
            loop {
                var_7_63 = and:int(var_7_63:int, ldc:int(1732986879))
                
                if (logicalnot:boolean(invokeinterface:boolean(Iterator::hasNext, var_9_6B:Iterator<File>))) {
                    looporswitchbreak()
                }
                
                invokestatic:void(\u3e2a\u3c25\ud7e8\u34df\ub6ab\u61a4::\u624e\ub7dc\u8258\u873d\u527a\u8d90, p0:\u7d52\u51fa\u56bd\u76bc\u4975\ub113, p1:File, checkcast:File(java.io.File.class, invokeinterface:File(Iterator<File>::next, var_9_6B:Iterator<File>)), p3:\u56bd\uc4d2\u61a4\u4ab3\u1187, p4:int, p5:int, p6:\u8389\u8413\u3a62\u8cae\uc31c\u6d69)
                inc:int(p4, ldc:int(1))
                invokeinterface:void(\u8389\u8413\u3a62\u8cae\uc31c\u6d69::\u3dd3\ua3b4\u93a2\ucb79\u8389\ud7e8, p6:\u8389\u8413\u3a62\u8cae\uc31c\u6d69, l2i:int(invokestatic:long(Math::round, div:double(mul:double(ldc:double(100.0), i2d:double(p4:int)), i2d:double(p5:int)))))
            }
            
            return:void()
        }
        
        goto(Label_0006)
    }
    
    private static void \u624e\ub7dc\u8258\u873d\u527a\u8d90(\u5d20\u7043\u88c5\u5db4\uf94d.\u7d52\u51fa\u56bd\u76bc\u4975\ub113 p0, java.io.File p1, java.io.File p2, \u5245\u8aa5\u61a4\u7049\u4cd9.\u56bd\uc4d2\u61a4\u4ab3\u1187 p3, int p4, int p5, \u4f52\u6cfe\u9a18\uc29a\u3bd6.\u8389\u8413\u3a62\u8cae\uc31c\u6d69 p6) {
        var_7_6B : int
        var_9_71 : String
        var_10_8B : \u52d3\u36d3\u4e72\uf94d\ucfaf
        var_11_96 : Throwable
        var_12_EA : \u52d3\u36d3\u4e72\uf94d\ucfaf
        var_13_ED : Throwable
        var_14_F6 : int
        var_15_106 : int
        var_16_11A : \u120d\u2dcc\ubff1\uceb8\ube23\u647c
        var_17_137 : DataInputStream
        var_18_13A : Throwable
        var_20_18D : \uc31c\uc87f\uc246\u3776\ub7dc
        var_19_1C1 : Throwable
        var_22_1E6 : Throwable
        var_17_209 : IOException
        var_18_240 : \u59ec\u74b1\u4d85\u3504\u4492
        var_19_249 : \uc31c\uc87f\uc246\u3776\ub7dc
        var_21_252 : \uc31c\uc87f\uc246\u3776\ub7dc
        var_22_277 : DataOutputStream
        var_23_27A : Throwable
        var_24_2B5 : Throwable
        var_26_2DA : Throwable
        var_15_31F : int
        var_16_34E : int
        var_14_39C : Throwable
        var_28_3C1 : Throwable
        var_12_40F : Throwable
        var_30_434 : Throwable
        var_10_457 : IOException
        
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
            var_7_6B = and:int(and:int(ldc:int(-104073431), ldc:int(-402917476)), ldc:int(1945089821))
            var_9_71 = invokevirtual:String(File::getName, p2:File)
            
            try {
                var_7_6B = and:int(var_7_6B:int, ldc:int(1375188863))
                var_10_8B = initobject:\u52d3\u36d3\u4e72\uf94d\ucfaf(\u52d3\u36d3\u4e72\uf94d\ucfaf::<init>, p2:File, p1:File, xor:int[expected:boolean](ldc:int(10), ldc:int(11)))
                var_7_6B = and:int(var_7_6B:int, ldc:int(-1779433575))
                var_11_96 = aconstnull:Throwable()
                
                try {
                    var_12_EA = initobject:\u52d3\u36d3\u4e72\uf94d\ucfaf(\u52d3\u36d3\u4e72\uf94d\ucfaf::<init>, initobject:File(File::<init>, p1:File, invokevirtual:String(StringBuilder::toString, invokevirtual:StringBuilder(StringBuilder::append, invokevirtual:StringBuilder(StringBuilder::append, initobject:StringBuilder(StringBuilder::<init>), invokevirtual:String(String::substring, var_9_71:String, and:int(ldc:int(11084), ldc:int(-11101)), sub:int(invokevirtual:int(String::length, var_9_71:String), invokevirtual:int(String::length, loadelement:String(getstatic:String[](\u3e2a\u3c25\ud7e8\u34df\ub6ab\u61a4::\u5140\u8640\u3e75\u92ee\u6bb9\u839e), and:int(ldc:int(18797), ldc:int(1045))))))), loadelement:String(getstatic:String[](\u3e2a\u3c25\ud7e8\u34df\ub6ab\u61a4::\u5140\u8640\u3e75\u92ee\u6bb9\u839e), and:int(ldc:int(167), ldc:int(518)))))), p1:File, and:int[expected:boolean](ldc:int(9221), ldc:int(153)))
                    var_13_ED = aconstnull:Throwable()
                    
                    try {
                        var_14_F6 = and:int(ldc:int(6251), ldc:int(-6252))
                        
                        while (cmplt:boolean(var_14_F6:int, ldc:int(32))) {
                            var_15_106 = and:int(ldc:int(-25000), ldc:int(24871))
                            
                            while (cmplt:boolean(var_15_106:int, ldc:int(32))) {
                                var_16_11A = initobject:\u120d\u2dcc\ubff1\uceb8\ube23\u647c(\u120d\u2dcc\ubff1\uceb8\ube23\u647c::<init>, var_14_F6:int, var_15_106:int)
                                
                                if (logicaland:boolean(invokevirtual:boolean(\u52d3\u36d3\u4e72\uf94d\ucfaf::\u98a4\u5f50\ub7dc\u6c56\ub7dc\uf94d, var_10_8B:\u52d3\u36d3\u4e72\uf94d\ucfaf, var_16_11A:\u120d\u2dcc\ubff1\uceb8\ube23\u647c), logicalnot:boolean(invokevirtual:boolean(\u52d3\u36d3\u4e72\uf94d\ucfaf::\u98a4\u5f50\ub7dc\u6c56\ub7dc\uf94d, var_12_EA:\u52d3\u36d3\u4e72\uf94d\ucfaf, var_16_11A:\u120d\u2dcc\ubff1\uceb8\ube23\u647c)))) {
                                    try {
                                        var_17_137 = invokevirtual:DataInputStream(\u52d3\u36d3\u4e72\uf94d\ucfaf::\u8d98\ub113\ubcb0\u7d52\u392e\ufcaf, var_10_8B:\u52d3\u36d3\u4e72\uf94d\ucfaf, var_16_11A:\u120d\u2dcc\ubff1\uceb8\ube23\u647c)
                                        var_18_13A = aconstnull:Throwable()
                                        
                                        try {
                                            if (cmpeq:boolean(var_17_137:DataInputStream, aconstnull:DataInputStream())) {
                                                invokeinterface:void(Logger::warn, getstatic:Logger(\u3e2a\u3c25\ud7e8\u34df\ub6ab\u61a4::\ub83f\u5fe1\u0c95\u7043\u2dcc\ud171), loadelement:String(getstatic:String[](\u3e2a\u3c25\ud7e8\u34df\ub6ab\u61a4::\u5140\u8640\u3e75\u92ee\u6bb9\u839e), and:int(ldc:int(19623), ldc:int(8199))), var_16_11A:\u120d\u2dcc\ubff1\uceb8\ube23\u647c[expected:Object])
                                                goto(Label_0758)
                                            }
                                            
                                            var_20_18D = invokestatic:\uc31c\uc87f\uc246\u3776\ub7dc(\u965f\u0a06\u7bad\uc7fe\u92ee::\ubff1\ua6bd\u4c04\u7049\ua3b4\u12cb, var_17_137:DataInputStream[expected:DataInput])
                                        }
                                        catch (java.lang.Throwable var_19_1C1) {
                                            var_18_13A = var_19_1C1:Throwable
                                            athrow(var_19_1C1:Throwable)
                                        }
                                        finally {
                                            if (cmpne:boolean(var_17_137:DataInputStream, aconstnull:DataInputStream())) {
                                                if (cmpne:boolean(var_18_13A:Throwable, aconstnull:Throwable())) {
                                                    try {
                                                        invokevirtual:void(FilterInputStream::close, var_17_137:DataInputStream[expected:FilterInputStream])
                                                    }
                                                    catch (java.lang.Throwable var_22_1E6) {
                                                        invokevirtual:void(Throwable::addSuppressed, var_18_13A:Throwable, var_22_1E6:Throwable)
                                                    }
                                                }
                                                else {
                                                    invokevirtual:void(FilterInputStream::close, var_17_137:DataInputStream[expected:FilterInputStream])
                                                }
                                            }
                                        }
                                    }
                                    catch (java.io.IOException var_17_209) {
                                        invokeinterface:void(Logger::warn, getstatic:Logger(\u3e2a\u3c25\ud7e8\u34df\ub6ab\u61a4::\ub83f\u5fe1\u0c95\u7043\u2dcc\ud171), loadelement:String(getstatic:String[](\u3e2a\u3c25\ud7e8\u34df\ub6ab\u61a4::\u5140\u8640\u3e75\u92ee\u6bb9\u839e), xor:int(ldc:int(4242), ldc:int(4250))), var_16_11A:\u120d\u2dcc\ubff1\uceb8\ube23\u647c[expected:Object], var_17_209:IOException[expected:Object])
                                        goto(Label_0758)
                                    }
                                    
                                    var_18_240 = invokestatic:\u59ec\u74b1\u4d85\u3504\u4492(\u7bad\u92ee\u4f52\u4c2b\ub19c::\u8aa5\uc238\u3a62\u8c8a\u6b5f\u5f50, invokevirtual:\uc31c\uc87f\uc246\u3776\ub7dc(\uc31c\uc87f\uc246\u3776\ub7dc::\u8753\uc9f6\ud171\ub83f\u8c8a\u72f1, var_20_18D:\uc31c\uc87f\uc246\u3776\ub7dc, loadelement:String(getstatic:String[](\u3e2a\u3c25\ud7e8\u34df\ub6ab\u61a4::\u5140\u8640\u3e75\u92ee\u6bb9\u839e), and:int(ldc:int(459), ldc:int(8713)))))
                                    var_19_249 = initobject:\uc31c\uc87f\uc246\u3776\ub7dc(\uc31c\uc87f\uc246\u3776\ub7dc::<init>)
                                    var_21_252 = initobject:\uc31c\uc87f\uc246\u3776\ub7dc(\uc31c\uc87f\uc246\u3776\ub7dc::<init>)
                                    invokevirtual:\u93a2\u97b7\u647c\ud36e\u64ab(\uc31c\uc87f\uc246\u3776\ub7dc::\u0800\u4179\ub8be\u5654\uc229\u5fe1, var_19_249:\uc31c\uc87f\uc246\u3776\ub7dc, loadelement:String(getstatic:String[](\u3e2a\u3c25\ud7e8\u34df\ub6ab\u61a4::\u5140\u8640\u3e75\u92ee\u6bb9\u839e), and:int(ldc:int(17417), ldc:int(12367))), var_21_252:\uc31c\uc87f\uc246\u3776\ub7dc[expected:\u93a2\u97b7\u647c\ud36e\u64ab])
                                    invokestatic:void(\u7bad\u92ee\u4f52\u4c2b\ub19c::\u4f52\u3e75\u600f\u99f7\u392e\ubf56, p0:\u7d52\u51fa\u56bd\u76bc\u4975\ub113, var_18_240:\u59ec\u74b1\u4d85\u3504\u4492, var_21_252:\uc31c\uc87f\uc246\u3776\ub7dc, p3:\u56bd\uc4d2\u61a4\u4ab3\u1187)
                                    var_22_277 = invokevirtual:DataOutputStream(\u52d3\u36d3\u4e72\uf94d\ucfaf::\u6cfe\u7d52\ub32d\u64f2\u72f1\ud217, var_12_EA:\u52d3\u36d3\u4e72\uf94d\ucfaf, var_16_11A:\u120d\u2dcc\ubff1\uceb8\ube23\u647c)
                                    var_23_27A = aconstnull:Throwable()
                                    
                                    try {
                                        invokestatic:void(\u965f\u0a06\u7bad\uc7fe\u92ee::\u8753\ufcaf\u120d\u3c25\u4492\u64ab, var_19_249:\uc31c\uc87f\uc246\u3776\ub7dc, var_22_277:DataOutputStream[expected:DataOutput])
                                    }
                                    catch (java.lang.Throwable var_24_2B5) {
                                        var_23_27A = var_24_2B5:Throwable
                                        athrow(var_24_2B5:Throwable)
                                    }
                                    finally {
                                        if (cmpne:boolean(var_22_277:DataOutputStream, aconstnull:DataOutputStream())) {
                                            if (cmpne:boolean(var_23_27A:Throwable, aconstnull:Throwable())) {
                                                try {
                                                    invokevirtual:void(FilterOutputStream::close, var_22_277:DataOutputStream[expected:FilterOutputStream])
                                                }
                                                catch (java.lang.Throwable var_26_2DA) {
                                                    invokevirtual:void(Throwable::addSuppressed, var_23_27A:Throwable, var_26_2DA:Throwable)
                                                }
                                            }
                                            else {
                                                invokevirtual:void(FilterOutputStream::close, var_22_277:DataOutputStream[expected:FilterOutputStream])
                                            }
                                        }
                                    }
                                }
                                
                                Label_0758:
                                inc:int(var_15_106, ldc:int(1))
                            }
                            
                            var_15_31F = l2i:int(invokestatic:long(Math::round, div:double(mul:double(ldc:double(100.0), i2d:double(mul:int(p4:int, and:int(ldc:int(11352), ldc:int(18049))))), i2d:double(mul:int(p5:int, xor:int(ldc:int(-31733), ldc:int(-32757)))))))
                            var_16_34E = l2i:int(invokestatic:long(Math::round, div:double(mul:double(ldc:double(100.0), i2d:double(add:int(mul:int(add:int(var_14_F6:int, xor:int(ldc:int(-32766), ldc:int(-32765))), ldc:int(32)), mul:int(p4:int, and:int(ldc:int(1537), ldc:int(19578)))))), i2d:double(mul:int(p5:int, xor:int(ldc:int(633), ldc:int(1657)))))))
                            
                            if (cmpgt:boolean(var_16_34E:int, var_15_31F:int)) {
                                invokeinterface:void(\u8389\u8413\u3a62\u8cae\uc31c\u6d69::\u3dd3\ua3b4\u93a2\ucb79\u8389\ud7e8, p6:\u8389\u8413\u3a62\u8cae\uc31c\u6d69, var_16_34E:int)
                            }
                            
                            inc:int(var_14_F6, ldc:int(1))
                        }
                    }
                    catch (java.lang.Throwable var_14_39C) {
                        var_13_ED = var_14_39C:Throwable
                        athrow(var_14_39C:Throwable)
                    }
                    finally {
                        if (cmpne:boolean(var_12_EA:\u52d3\u36d3\u4e72\uf94d\ucfaf, aconstnull:\u52d3\u36d3\u4e72\uf94d\ucfaf())) {
                            if (cmpne:boolean(var_13_ED:Throwable, aconstnull:Throwable())) {
                                try {
                                    invokevirtual:void(\u52d3\u36d3\u4e72\uf94d\ucfaf::close, var_12_EA:\u52d3\u36d3\u4e72\uf94d\ucfaf)
                                }
                                catch (java.lang.Throwable var_28_3C1) {
                                    invokevirtual:void(Throwable::addSuppressed, var_13_ED:Throwable, var_28_3C1:Throwable)
                                }
                            }
                            else {
                                invokevirtual:void(\u52d3\u36d3\u4e72\uf94d\ucfaf::close, var_12_EA:\u52d3\u36d3\u4e72\uf94d\ucfaf)
                            }
                        }
                    }
                }
                catch (java.lang.Throwable var_12_40F) {
                    var_11_96 = var_12_40F:Throwable
                    athrow(var_12_40F:Throwable)
                }
                finally {
                    if (cmpne:boolean(var_10_8B:\u52d3\u36d3\u4e72\uf94d\ucfaf, aconstnull:\u52d3\u36d3\u4e72\uf94d\ucfaf())) {
                        if (cmpne:boolean(var_11_96:Throwable, aconstnull:Throwable())) {
                            try {
                                invokevirtual:void(\u52d3\u36d3\u4e72\uf94d\ucfaf::close, var_10_8B:\u52d3\u36d3\u4e72\uf94d\ucfaf)
                            }
                            catch (java.lang.Throwable var_30_434) {
                                invokevirtual:void(Throwable::addSuppressed, var_11_96:Throwable, var_30_434:Throwable)
                            }
                        }
                        else {
                            invokevirtual:void(\u52d3\u36d3\u4e72\uf94d\ucfaf::close, var_10_8B:\u52d3\u36d3\u4e72\uf94d\ucfaf)
                        }
                    }
                }
            }
            catch (java.io.IOException var_10_457) {
                invokeinterface:void(Logger::error, getstatic:Logger(\u3e2a\u3c25\ud7e8\u34df\ub6ab\u61a4::\ub83f\u5fe1\u0c95\u7043\u2dcc\ud171), loadelement:String(getstatic:String[](\u3e2a\u3c25\ud7e8\u34df\ub6ab\u61a4::\u5140\u8640\u3e75\u92ee\u6bb9\u839e), xor:int(ldc:int(6404), ldc:int(6414))), p2:File[expected:Object], var_10_457:IOException[expected:Object])
            }
            
            return:void()
        }
        
        goto(Label_0006)
    }
    
    private static void \u156b\u4f52\u40a9\u8413\u8389\ud217(java.io.File p0, java.util.Collection<java.io.File> p1) {
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
    
    private static boolean lambda$\u6198\u40a9\ub7dc\u92ff\u6cfe\u8df4$0(java.io.File p0, java.lang.String p1) {
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
            return:boolean(invokevirtual:boolean(String::endsWith, p1:String, loadelement:String(getstatic:String[](\u3e2a\u3c25\ud7e8\u34df\ub6ab\u61a4::\u5140\u8640\u3e75\u92ee\u6bb9\u839e), and:int(ldc:int(11685), ldc:int(79)))))
        }
        
        goto(Label_0006)
    }
    
    static {
        var_0_24B : int
        expr_6E : int [generated]
        stack_94_0 : byte[] [generated]
        stack_96_0 : byte[] [generated]
        stack_BE_0 : byte[] [generated]
        stack_C0_0 : byte[] [generated]
        stack_DC_0 : byte[] [generated]
        stack_25E_0 : byte[] [generated]
        stack_2B5_0 : byte[] [generated]
        stack_31B_0 : byte[] [generated]
        var_4_236 : int
        var_3_23B : byte[]
        var_5_23C : int
        expr_25E : byte [generated]
        var_0_311 : int
        expr_31B : byte [generated]
        stack_34B_2 : byte [generated]
        var_2_94 : byte[]
        expr_98 : int [generated]
        var_3_2A3 : byte[]
        var_5_2A4 : int
        expr_C0 : int [generated]
        var_3_E8 : String
        stack_229_0 : String[] [generated]
        expr_FA : String[] [generated]
        
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
        var_0_24B = and:int(ldc:int(-1876739806), ldc:int(-1776041094))
        expr_6E = arraylength:int(stack_94_0 = stack_96_0 = stack_BE_0 = stack_C0_0 = stack_DC_0 = stack_25E_0 = stack_2B5_0 = stack_31B_0 = invokevirtual(Decoder::decode, invokestatic(Base64::getDecoder), ldc("XV1dBBz8o01Uexebwz+hDat5iz8lu5siuwdzVWWh5E3mg+ujVW1Fe+mTH6PTNonk3Fx7F5vDPwINBXHuXVXTgTejNQxVbUV76ZMfo9M2ieTcXHsXm8M/IjUdArz8be4Ei4vBZctHZUVtoUcEBJSpNZRU7Ow1gzSr40UHbYureV17m8XNN4yJqfIcD9TrgyKDc6v0yz3uRV2T6QQH9KO2MvuM4aysHBVXDHM3eWUtgQz0N7sFDKlVzeQ9kwPLi22NJWUNufvby0WDJVXN5D2TA8uLbfMVcx1ly2g4KChd")))
        
        if (cmpeq:boolean(expr_6E:int, ldc:int(0))) {
            goto(Label_0115)
        }
        
        var_4_236 = expr_6E:int
        var_3_23B = newarray:byte[](byte.class, expr_6E:int)
        var_5_23C = expr_6E:int
        Label_0574:
        
        while (cmpne:boolean(and:int(var_0_24B:int, ldc:int(256)), ldc:int(0))) {
            var_0_24B = and:int(var_0_24B:int, ldc:int(-1674971701))
            var_5_23C = add:int(var_5_23C:int, ldc:int(-1))
            expr_25E = loadelement:byte(stack_25E_0:byte[], var_5_23C:int)
            storeelement:byte(var_3_23B:byte[], var_5_23C:int, xor:int(add:int(or:int(and:int(shl:int(expr_25E:byte, xor:int(ldc:int(20741), ldc:int(20737))), ldc:int(-16)), and:int(shr:int(expr_25E:byte[expected:int], xor:int(ldc:int(4115), ldc:int(4119))), ldc:int(15))), ldc:int(57)), ldc:int(14)))
            
            if (cmpne:boolean(var_5_23C:int, ldc:int(0))) {
                loopcontinue()
            }
            
            stack_96_0 = stack_94_0 = stack_BE_0 = stack_C0_0 = stack_DC_0 = stack_25E_0 = stack_2B5_0 = stack_31B_0 = var_3_23B:byte[]
            goto(Label_0115)
        }
        
        var_0_24B = and:int(var_0_24B:int, ldc:int(-1120619842))
        Label_0764:
        
        while (cmpne:boolean(and:int(var_0_24B:int, ldc:int(2097152)), ldc:int(0))) {
            var_0_311 = and:int(var_0_24B:int, ldc:int(-1859875546))
            var_5_23C = add:int(var_5_23C:int, ldc:int(-1))
            expr_31B = loadelement:byte(stack_31B_0:byte[], var_5_23C:int)
            
            if (cmpge:boolean(add:int(add:int(var_5_23C:int, ldc:int(4)), neg:int(var_4_236:int)), ldc:int(0))) {
                var_0_311 = and:int(var_0_311:int, ldc:int(-673076786))
                stack_34B_2 = add:byte(expr_31B:byte, ldc:byte(4))
            }
            else {
                stack_34B_2 = add:byte(expr_31B:byte, loadelement:byte(var_3_23B:byte[], add:int(var_5_23C:int, ldc:int(4))))
            }
            
            var_0_24B = and:int(var_0_311:int, ldc:int(-1262680630))
            storeelement:byte(var_3_23B:byte[], var_5_23C:int, stack_34B_2:byte)
            
            if (cmpne:boolean(var_5_23C:int, ldc:int(0))) {
                loopcontinue()
            }
            
            stack_96_0 = stack_94_0 = stack_BE_0 = stack_C0_0 = stack_DC_0 = stack_25E_0 = stack_2B5_0 = stack_31B_0 = var_3_23B:byte[]
            goto(Label_0197)
        }
        
        var_0_24B = and:int(var_0_24B:int, ldc:int(2038636178))
        goto(Label_0574)
        Label_0115:
        
        if (cmpne:boolean(and:int(var_0_24B:int, ldc:int(1)), ldc:int(0))) {
            var_0_24B = and:int(var_0_24B:int, ldc:int(18898870))
            goto(Label_0197)
        }
        
        if (cmpeq:boolean(and:int(var_0_24B:int, ldc:int(4)), ldc:int(0))) {
            var_0_24B = and:int(var_0_24B:int, ldc:int(-718717489))
            var_2_94 = stack_94_0:byte[]
            expr_98 = add:int(arraylength:int(stack_96_0:byte[]), ldc:int(-1))
            
            if (cmpne:boolean(expr_98:int, ldc:int(0))) {
                var_3_2A3 = newarray:byte[](byte.class, expr_98:int)
                var_5_2A4 = expr_98:int
                
                loop {
                    var_0_24B = and:int(var_0_24B:int, ldc:int(-80399998))
                    var_5_2A4 = add:int(var_5_2A4:int, ldc:int(-1))
                    storeelement:byte(var_3_2A3:byte[], var_5_2A4:int, add:int(shl:int(loadelement:byte(stack_2B5_0:byte[], var_5_2A4:int), ldc:int(1)), and:int(shr:int(loadelement:byte(var_2_94:byte[], add:int(var_5_2A4:int, and:int(ldc:int(20617), ldc:int(9489)))), ldc:int(7)), and:int(ldc:int(257), ldc:int(3225)))))
                    
                    if (cmpne:boolean(var_5_2A4:int, ldc:int(0))) {
                        loopcontinue()
                    }
                    
                    looporswitchbreak()
                }
                
                stack_96_0 = stack_94_0 = stack_BE_0 = stack_C0_0 = stack_DC_0 = stack_25E_0 = stack_2B5_0 = stack_31B_0 = var_3_2A3:byte[]
            }
        }
        
        Label_0157:
        
        if (cmpeq:boolean(and:int(var_0_24B:int, ldc:int(16777216)), ldc:int(0))) {
            if (cmpne:boolean(and:int(var_0_24B:int, ldc:int(4)), ldc:int(0))) {
                var_0_24B = and:int(var_0_24B:int, ldc:int(310505505))
                goto(Label_0115)
            }
            
            var_0_24B = and:int(var_0_24B:int, ldc:int(-1662479490))
            expr_C0 = arraylength:int(stack_C0_0:byte[])
            
            if (cmpne:boolean(expr_C0:int, ldc:int(0))) {
                var_4_236 = expr_C0:int
                var_3_23B = newarray:byte[](byte.class, expr_C0:int)
                var_5_23C = expr_C0:int
                goto(Label_0764)
            }
        }
        
        Label_0197:
        
        if (cmpne:boolean(and:int(var_0_24B:int, ldc:int(67108864)), ldc:int(0))) {
            goto(Label_0157)
        }
        
        if (cmpeq:boolean(and:int(var_0_24B:int, ldc:int(4)), ldc:int(0))) {
            var_3_E8 = initobject:String(String::<init>, stack_DC_0:byte[], getstatic:Charset(StandardCharsets::UTF_8))
            stack_229_0 = newarray:String[](Ljava.lang.String.class, and:int(ldc:int(11023), ldc:int(123)))
            expr_FA = newarray:String[](Ljava.lang.String.class, and:int(ldc:int(26127), ldc:int(4507)))
            storeelement:String(expr_FA:String[], xor:int(ldc:int(3715), ldc:int(3717)), invokevirtual:String[expected:String](String::substring, var_3_E8:String, and:int(ldc:int(-18711), ldc:int(16662)), and:int(ldc:int(20836), ldc:int(1044))))
            storeelement:String(expr_FA:String[], xor:int(ldc:int(24714), ldc:int(24719)), invokevirtual:String[expected:String](String::substring, var_3_E8:String, xor:int(ldc:int(6290), ldc:int(6294)), xor:int(ldc:int(16460), ldc:int(16452))))
            storeelement:String(expr_FA:String[], xor:int(ldc:int(82), ldc:int(85)), invokevirtual:String[expected:String](String::substring, var_3_E8:String, xor:int(ldc:int(2582), ldc:int(2590)), and:int(ldc:int(4727), ldc:int(16697))))
            storeelement:String(expr_FA:String[], xor:int(ldc:int(16451), ldc:int(16459)), invokevirtual:String[expected:String](String::substring, var_3_E8:String, xor:int(ldc:int(2649), ldc:int(2664)), xor:int(ldc:int(-26590), ldc:int(-26509))))
            storeelement:String(expr_FA:String[], xor:int(ldc:int(288), ldc:int(298)), invokevirtual:String[expected:String](String::substring, var_3_E8:String, and:int(ldc:int(3281), ldc:int(24657)), xor:int(ldc:int(-31728), ldc:int(-31647))))
            storeelement:String(expr_FA:String[], xor:int(ldc:int(32), ldc:int(41)), invokevirtual:String[expected:String](String::substring, var_3_E8:String, xor:int(ldc:int(170), ldc:int(219)), and:int(ldc:int(4606), ldc:int(16502))))
            storeelement:String(expr_FA:String[], and:int(ldc:int(18837), ldc:int(-18838)), invokevirtual:String[expected:String](String::substring, var_3_E8:String, and:int(ldc:int(254), ldc:int(11382)), and:int(ldc:int(20617), ldc:int(761))))
            storeelement:String(expr_FA:String[], and:int(ldc:int(2113), ldc:int(16385)), invokevirtual:String[expected:String](String::substring, var_3_E8:String, and:int(ldc:int(22221), ldc:int(2201)), xor:int(ldc:int(5270), ldc:int(5171))))
            storeelement:String(expr_FA:String[], and:int(ldc:int(6243), ldc:int(24595)), invokevirtual:String[expected:String](String::substring, var_3_E8:String, xor:int(ldc:int(-32193), ldc:int(-32102)), xor:int(ldc:int(10117), ldc:int(10063))))
            storeelement:String(expr_FA:String[], and:int(ldc:int(20550), ldc:int(148)), invokevirtual:String[expected:String](String::substring, var_3_E8:String, and:int(ldc:int(5870), ldc:int(202)), and:int(ldc:int(223), ldc:int(5591))))
            storeelement:String(expr_FA:String[], xor:int(ldc:int(4353), ldc:int(4355)), invokevirtual:String[expected:String](String::substring, var_3_E8:String, xor:int(ldc:int(-32754), ldc:int(-32551)), xor:int(ldc:int(387), ldc:int(350))))
            putstatic:String[](\u3e2a\u3c25\ud7e8\u34df\ub6ab\u61a4::\u5140\u8640\u3e75\u92ee\u6bb9\u839e, expr_FA:String[])
            putstatic:Logger(\u3e2a\u3c25\ud7e8\u34df\ub6ab\u61a4::\ub83f\u5fe1\u0c95\u7043\u2dcc\ud171, invokestatic:Logger(LogManager::getLogger))
            return:void()
        }
        
        goto(Label_0115)
    }
    
    public void \ud217\uc84e\ua6bd\u6c52\u5f50\u9033(\u6ec6\ubb2b\uf94d\u6d99\u4f52.\uae87\u3bc9\u3bc9\u7049\uc246\u3e75 p0, \u7c6b\u7c6b\ubefe\u385b\u3c25.\u4ab3\ub83f\u718f\ucb79\u120d.\u6b5f\u5f50\ubefe\ucfaf\u4f52\ub18d p1) {
        var_3_6F0 : int
        var_5_81 : int
        var_6_88 : int
        var_7_97 : double
        var_9_C8 : double
        var_3_DA : int
        var_11_EB : int
        var_14_115 : double
        var_16_119 : int
        var_12_111 : double
        var_17_6FB : int
        
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
        var_3_6F0 = and:int(ldc:int(-1574588729), ldc:int(1222879654))
        
        if (cmpeq:boolean(getstatic:double(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u6c56\u8cae\uc31c\u446c\uc9f6\u873d), ldc:double(0.0))) {
            invokestatic:void(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u0800\u2dcc\uc4d2\u8aa5\u4cd9\u51b2, this:\u3e2a\u3c25\ud7e8\u34df\ub6ab\u61a4[expected:Object], p0:\uae87\u3bc9\u3bc9\u7049\uc246\u3e75[expected:Object])
            goto(Label_0171)
        }
        
        Label_0108:
        
        if (cmpeq:boolean(and:int(var_3_6F0:int, ldc:int(4194304)), ldc:int(0))) {
            var_3_6F0 = and:int(var_3_6F0:int, ldc:int(1445455543))
            var_5_81 = and:int(ldc:int(-11269), ldc:int(11268))
            var_6_88 = invokestatic:int(\uae87\u3bc9\u3bc9\u7049\uc246\u3e75::\u8389\u3bd6\u3bc9\uc2bd\u8640\u52d3)
            var_7_97 = loadelement:double(getstatic:double[](\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), and:int(ldc:int(13388), ldc:int(-13389)))
            invokestatic:int(m::a)
            
            loop {
                var_9_C8 = ldc:double(0.0)
                
                if (cmpne:boolean(getstatic:ap(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::a), getstatic:ap(ap::a))) {
                    var_3_DA = and:int(var_3_6F0:int, ldc:int(-2054050298))
                    var_9_C8 = sub:double(var_7_97:double, mul:double(getstatic:double(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u6c56\u8cae\uc31c\u446c\uc9f6\u873d), ldc:double(0.001)))
                    var_11_EB = var_5_81:int
                    
                    while (logicaland:boolean(cmplt:boolean(var_11_EB:int, sub:int(var_6_88:int, xor:int(ldc:int(2560), ldc:int(2561)))), cmplt:boolean(loadelement:double(getstatic:double[](\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), add:int(var_11_EB:int, xor:int(ldc:int(2560), ldc:int(2561)))), var_7_97:double))) {
                        inc:int(var_11_EB, ldc:int(1))
                    }
                    
                    var_3_6F0 = and:int(var_3_DA:int, ldc:int(-1848513026))
                    var_14_115 = var_7_97:double
                    var_16_119 = var_11_EB:int
                }
                else {
                    var_11_EB = sub:int(add:int(invokestatic:int(d::a, getstatic:double(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u6c56\u8cae\uc31c\u446c\uc9f6\u873d)), var_5_81:int), and:int(ldc:int(1), ldc:int(2257)))
                    var_12_111 = var_14_115 = loadelement(getstatic(\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), var_5_81)
                    
                    if (cmplt:boolean(var_16_119 = var_11_EB:int, var_6_88:int)) {
                        var_9_C8 = loadelement:double(getstatic:double[](\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), var_11_EB:int)
                        var_16_119 = var_11_EB:int
                        var_14_115 = var_12_111:double
                    }
                }
                
                loop {
                    if (cmpne:boolean(and:int(var_3_6F0:int, ldc:int(1073741824)), ldc:int(0))) {
                        goto(Label_1645)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_6F0:int, ldc:int(32768)), ldc:int(0))) {
                        var_3_6F0 = and:int(var_3_6F0:int, ldc:int(-355992461))
                        goto(Label_1479)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_6F0:int, ldc:int(8192)), ldc:int(0))) {
                        var_3_6F0 = and:int(var_3_6F0:int, ldc:int(370673486))
                        goto(Label_1334)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_6F0:int, ldc:int(1048576)), ldc:int(0))) {
                        var_3_6F0 = and:int(var_3_6F0:int, ldc:int(-1721754792))
                        goto(Label_1191)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_6F0:int, ldc:int(32768)), ldc:int(0))) {
                        goto(Label_1022)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_6F0:int, ldc:int(16777216)), ldc:int(0))) {
                        goto(Label_0888)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_6F0:int, ldc:int(131072)), ldc:int(0))) {
                        goto(Label_0747)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_6F0:int, ldc:int(8192)), ldc:int(0))) {
                        var_3_6F0 = and:int(var_3_6F0:int, ldc:int(-504264658))
                        goto(Label_0595)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_6F0:int, ldc:int(8)), ldc:int(0))) {
                        var_3_6F0 = and:int(var_3_6F0:int, ldc:int(-844469292))
                    }
                    else {
                        var_3_6F0 = and:int(var_3_6F0:int, ldc:int(-270010926))
                        
                        if (cmplt:boolean(var_16_119:int, var_6_88:int)) {
                            if (cmpne:boolean(getstatic:ao(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::i), getstatic:ao(ao::a))) {
                                goto(Label_0595)
                            }
                            
                            goto(Label_0888)
                        }
                    }
                    
                    Label_0420:
                    
                    if (cmpne:boolean(and:int(var_3_6F0:int, ldc:int(1073741824)), ldc:int(0))) {
                        goto(Label_1645)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_6F0:int, ldc:int(4194304)), ldc:int(0))) {
                        goto(Label_1479)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_6F0:int, ldc:int(131072)), ldc:int(0))) {
                        goto(Label_1334)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_6F0:int, ldc:int(8192)), ldc:int(0))) {
                        var_3_6F0 = and:int(var_3_6F0:int, ldc:int(1417557669))
                        goto(Label_1191)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_6F0:int, ldc:int(131072)), ldc:int(0))) {
                        var_3_6F0 = and:int(var_3_6F0:int, ldc:int(-1551338215))
                        goto(Label_1022)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_6F0:int, ldc:int(256)), ldc:int(0))) {
                        var_3_6F0 = and:int(var_3_6F0:int, ldc:int(2128897776))
                        goto(Label_0888)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_6F0:int, ldc:int(4194304)), ldc:int(0))) {
                        var_3_6F0 = and:int(var_3_6F0:int, ldc:int(7904776))
                        goto(Label_0747)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_6F0:int, ldc:int(1073741824)), ldc:int(0))) {
                        if (cmpne:boolean(and:int(var_3_6F0:int, ldc:int(131072)), ldc:int(0))) {
                            var_3_6F0 = and:int(var_3_6F0:int, ldc:int(1394417488))
                            loopcontinue()
                        }
                        
                        var_3_6F0 = and:int(var_3_6F0:int, ldc:int(-297419138))
                        var_11_EB = and:int(ldc:int(10765), ldc:int(-31246))
                        goto(Label_1634)
                    }
                    
                    Label_0595:
                    
                    if (cmpeq:boolean(and:int(var_3_6F0:int, ldc:int(32768)), ldc:int(0))) {
                        var_3_6F0 = and:int(var_3_6F0:int, ldc:int(927281757))
                        goto(Label_1645)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_6F0:int, ldc:int(4194304)), ldc:int(0))) {
                        var_3_6F0 = and:int(var_3_6F0:int, ldc:int(-1222658130))
                        goto(Label_1479)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_6F0:int, ldc:int(4194304)), ldc:int(0))) {
                        var_3_6F0 = and:int(var_3_6F0:int, ldc:int(1788342805))
                        goto(Label_1334)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_6F0:int, ldc:int(4096)), ldc:int(0))) {
                        goto(Label_1191)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_6F0:int, ldc:int(2147483647)), ldc:int(0))) {
                        var_3_6F0 = and:int(var_3_6F0:int, ldc:int(2122393661))
                        goto(Label_1022)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_6F0:int, ldc:int(4194304)), ldc:int(0))) {
                        var_3_6F0 = and:int(var_3_6F0:int, ldc:int(-732957020))
                        goto(Label_0888)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_6F0:int, ldc:int(8192)), ldc:int(0))) {
                        if (cmpeq:boolean(and:int(var_3_6F0:int, ldc:int(8192)), ldc:int(0))) {
                            var_3_6F0 = and:int(var_3_6F0:int, ldc:int(821290047))
                            goto(Label_0420)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_6F0:int, ldc:int(65536)), ldc:int(0))) {
                            var_3_6F0 = and:int(var_3_6F0:int, ldc:int(1505011806))
                            loopcontinue()
                        }
                        
                        var_3_6F0 = and:int(var_3_6F0:int, ldc:int(1760801170))
                        
                        if (cmpeq:boolean(getstatic:ao(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::i), getstatic:ao(ao::c))) {
                            var_14_115 = var_9_C8:double
                            goto(Label_0888)
                        }
                    }
                    
                    Label_0747:
                    
                    if (cmpeq:boolean(and:int(var_3_6F0:int, ldc:int(2147483647)), ldc:int(0))) {
                        goto(Label_1645)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_6F0:int, ldc:int(2)), ldc:int(0))) {
                        var_3_6F0 = and:int(var_3_6F0:int, ldc:int(300827939))
                        goto(Label_1479)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_6F0:int, ldc:int(4194304)), ldc:int(0))) {
                        goto(Label_1334)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_6F0:int, ldc:int(1048576)), ldc:int(0))) {
                        var_3_6F0 = and:int(var_3_6F0:int, ldc:int(-1775748783))
                        goto(Label_1191)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_6F0:int, ldc:int(32768)), ldc:int(0))) {
                        goto(Label_1022)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_6F0:int, ldc:int(32768)), ldc:int(0))) {
                        var_3_6F0 = and:int(var_3_6F0:int, ldc:int(-645713608))
                    }
                    else {
                        if (cmpeq:boolean(and:int(var_3_6F0:int, ldc:int(32768)), ldc:int(0))) {
                            var_3_6F0 = and:int(var_3_6F0:int, ldc:int(-2100604062))
                            goto(Label_0595)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_6F0:int, ldc:int(256)), ldc:int(0))) {
                            var_3_6F0 = and:int(var_3_6F0:int, ldc:int(-2012066935))
                            goto(Label_0420)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_6F0:int, ldc:int(2147483647)), ldc:int(0))) {
                            loopcontinue()
                        }
                        
                        var_3_6F0 = and:int(var_3_6F0:int, ldc:int(-413682370))
                        var_14_115 = mul:double(ldc:double(0.5), add:double(var_9_C8:double, var_14_115:double))
                    }
                    
                    Label_0888:
                    
                    if (cmpne:boolean(and:int(var_3_6F0:int, ldc:int(256)), ldc:int(0))) {
                        goto(Label_1645)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_6F0:int, ldc:int(2147483647)), ldc:int(0))) {
                        var_3_6F0 = and:int(var_3_6F0:int, ldc:int(256938450))
                        goto(Label_1479)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_6F0:int, ldc:int(2)), ldc:int(0))) {
                        var_3_6F0 = and:int(var_3_6F0:int, ldc:int(-198139392))
                        goto(Label_1334)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_6F0:int, ldc:int(2147483647)), ldc:int(0))) {
                        goto(Label_1191)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_6F0:int, ldc:int(8192)), ldc:int(0))) {
                        var_3_6F0 = and:int(var_3_6F0:int, ldc:int(423773583))
                    }
                    else {
                        if (cmpne:boolean(and:int(var_3_6F0:int, ldc:int(4194304)), ldc:int(0))) {
                            var_3_6F0 = and:int(var_3_6F0:int, ldc:int(275676311))
                            goto(Label_0747)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_6F0:int, ldc:int(16384)), ldc:int(0))) {
                            goto(Label_0595)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_6F0:int, ldc:int(2)), ldc:int(0))) {
                            goto(Label_0420)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_6F0:int, ldc:int(2147483647)), ldc:int(0))) {
                            var_3_6F0 = and:int(var_3_6F0:int, ldc:int(-1018009082))
                            loopcontinue()
                        }
                        
                        var_3_6F0 = and:int(var_3_6F0:int, ldc:int(-564941798))
                        
                        if (cmpeq:boolean(getstatic:ap(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::a), getstatic:ap(ap::b))) {
                            if (cmplt:boolean(loadelement:double(getstatic:double[](\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), var_5_81:int), var_7_97:double)) {
                                var_11_EB = xor:int(ldc:int(-32736), ldc:int(-32735))
                                goto(Label_1191)
                            }
                        }
                    }
                    
                    Label_1022:
                    
                    if (cmpeq:boolean(and:int(var_3_6F0:int, ldc:int(32768)), ldc:int(0))) {
                        goto(Label_1645)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_6F0:int, ldc:int(16384)), ldc:int(0))) {
                        var_3_6F0 = and:int(var_3_6F0:int, ldc:int(1319784617))
                        goto(Label_1479)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_6F0:int, ldc:int(1073741824)), ldc:int(0))) {
                        var_3_6F0 = and:int(var_3_6F0:int, ldc:int(1548636374))
                        goto(Label_1334)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_6F0:int, ldc:int(8192)), ldc:int(0))) {
                        if (cmpeq:boolean(and:int(var_3_6F0:int, ldc:int(2)), ldc:int(0))) {
                            var_3_6F0 = and:int(var_3_6F0:int, ldc:int(1196071780))
                            goto(Label_0888)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_6F0:int, ldc:int(256)), ldc:int(0))) {
                            var_3_6F0 = and:int(var_3_6F0:int, ldc:int(1027140741))
                            goto(Label_0747)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_6F0:int, ldc:int(65536)), ldc:int(0))) {
                            goto(Label_0595)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_6F0:int, ldc:int(16384)), ldc:int(0))) {
                            goto(Label_0420)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_6F0:int, ldc:int(2)), ldc:int(0))) {
                            var_3_6F0 = and:int(var_3_6F0:int, ldc:int(-1106121960))
                            loopcontinue()
                        }
                        
                        var_3_6F0 = and:int(var_3_6F0:int, ldc:int(1319741822))
                        var_11_EB = and:int(ldc:int(25724), ldc:int(-25725))
                    }
                    
                    Label_1191:
                    
                    if (cmpeq:boolean(and:int(var_3_6F0:int, ldc:int(65536)), ldc:int(0))) {
                        goto(Label_1645)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_6F0:int, ldc:int(2147483647)), ldc:int(0))) {
                        goto(Label_1479)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_6F0:int, ldc:int(2147483647)), ldc:int(0))) {
                        var_3_6F0 = and:int(var_3_6F0:int, ldc:int(1487413425))
                    }
                    else {
                        if (cmpne:boolean(and:int(var_3_6F0:int, ldc:int(131072)), ldc:int(0))) {
                            var_3_6F0 = and:int(var_3_6F0:int, ldc:int(1502181969))
                            goto(Label_1022)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_6F0:int, ldc:int(16777216)), ldc:int(0))) {
                            var_3_6F0 = and:int(var_3_6F0:int, ldc:int(-146887942))
                            goto(Label_0888)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_6F0:int, ldc:int(1073741824)), ldc:int(0))) {
                            var_3_6F0 = and:int(var_3_6F0:int, ldc:int(367394405))
                            goto(Label_0747)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_6F0:int, ldc:int(8192)), ldc:int(0))) {
                            var_3_6F0 = and:int(var_3_6F0:int, ldc:int(-1166460301))
                            goto(Label_0595)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_6F0:int, ldc:int(16384)), ldc:int(0))) {
                            var_3_6F0 = and:int(var_3_6F0:int, ldc:int(-1841399654))
                            goto(Label_0420)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_6F0:int, ldc:int(4096)), ldc:int(0))) {
                            loopcontinue()
                        }
                        
                        var_3_6F0 = and:int(var_3_6F0:int, ldc:int(-1722567133))
                        
                        if (cmpne:boolean(getstatic:ap(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::a), getstatic:ap(ap::a))) {
                            if (cmpeq:boolean(var_11_EB:int, ldc:int(0))) {
                                goto(Label_1479)
                            }
                        }
                    }
                    
                    Label_1334:
                    
                    if (cmpne:boolean(and:int(var_3_6F0:int, ldc:int(8)), ldc:int(0))) {
                        var_3_6F0 = and:int(var_3_6F0:int, ldc:int(-823985138))
                        goto(Label_1645)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_6F0:int, ldc:int(8192)), ldc:int(0))) {
                        var_3_6F0 = and:int(var_3_6F0:int, ldc:int(529910409))
                    }
                    else {
                        if (cmpne:boolean(and:int(var_3_6F0:int, ldc:int(16384)), ldc:int(0))) {
                            var_3_6F0 = and:int(var_3_6F0:int, ldc:int(2141986408))
                            goto(Label_1191)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_6F0:int, ldc:int(16777216)), ldc:int(0))) {
                            goto(Label_1022)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_6F0:int, ldc:int(1073741824)), ldc:int(0))) {
                            goto(Label_0888)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_6F0:int, ldc:int(4096)), ldc:int(0))) {
                            var_3_6F0 = and:int(var_3_6F0:int, ldc:int(1264556212))
                            goto(Label_0747)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_6F0:int, ldc:int(4096)), ldc:int(0))) {
                            var_3_6F0 = and:int(var_3_6F0:int, ldc:int(39944173))
                            goto(Label_0595)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_6F0:int, ldc:int(2147483647)), ldc:int(0))) {
                            goto(Label_0420)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_6F0:int, ldc:int(8192)), ldc:int(0))) {
                            var_3_6F0 = and:int(var_3_6F0:int, ldc:int(784054482))
                            invokestatic:void(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u0800\u2dcc\uc4d2\u8aa5\u4cd9\u51b2, p0:\uae87\u3bc9\u3bc9\u7049\uc246\u3e75, var_14_115:double, var_5_81:int, var_16_119:int)
                            goto(Label_1634)
                        }
                        
                        loopcontinue()
                    }
                    
                    Label_1479:
                    
                    if (cmpne:boolean(and:int(var_3_6F0:int, ldc:int(16384)), ldc:int(0))) {
                        goto(Label_1645)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_6F0:int, ldc:int(32768)), ldc:int(0))) {
                        goto(Label_1334)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_6F0:int, ldc:int(16777216)), ldc:int(0))) {
                        goto(Label_1191)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_6F0:int, ldc:int(16777216)), ldc:int(0))) {
                        var_3_6F0 = and:int(var_3_6F0:int, ldc:int(-1771063867))
                        goto(Label_1022)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_6F0:int, ldc:int(4096)), ldc:int(0))) {
                        var_3_6F0 = and:int(var_3_6F0:int, ldc:int(1694742676))
                        goto(Label_0888)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_6F0:int, ldc:int(16777216)), ldc:int(0))) {
                        var_3_6F0 = and:int(var_3_6F0:int, ldc:int(1034160292))
                        goto(Label_0747)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_6F0:int, ldc:int(2147483647)), ldc:int(0))) {
                        var_3_6F0 = and:int(var_3_6F0:int, ldc:int(-1365410476))
                        goto(Label_0595)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_6F0:int, ldc:int(1073741824)), ldc:int(0))) {
                        var_3_6F0 = and:int(var_3_6F0:int, ldc:int(1736416381))
                        goto(Label_0420)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_6F0:int, ldc:int(16384)), ldc:int(0))) {
                        var_3_6F0 = and:int(var_3_6F0:int, ldc:int(1439961709))
                        loopcontinue()
                    }
                    
                    var_3_6F0 = and:int(var_3_6F0:int, ldc:int(-91754017))
                    invokestatic:void(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u0800\u2dcc\uc4d2\u8aa5\u4cd9\u51b2, invokestatic:boolean(\uae87\u3bc9\u3bc9\u7049\uc246\u3e75::\u0a06\u59ec\u93a2\u9937\ub83f\ub171), var_14_115:double, ldc:double(0.0))
                    Label_1634:
                    
                    if (cmpne:boolean(getstatic:ap(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::a), getstatic:ap(ap::a))) {
                        var_17_6FB = var_5_81:int
                        
                        if (cmpeq:boolean(var_11_EB:int, ldc:int(0))) {
                            looporswitchbreak()
                        }
                    }
                    
                    Label_1645:
                    
                    if (cmpne:boolean(and:int(var_3_6F0:int, ldc:int(4096)), ldc:int(0))) {
                        var_3_6F0 = and:int(var_3_6F0:int, ldc:int(655921654))
                        goto(Label_1479)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_6F0:int, ldc:int(2)), ldc:int(0))) {
                        goto(Label_1334)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_6F0:int, ldc:int(2)), ldc:int(0))) {
                        var_3_6F0 = and:int(var_3_6F0:int, ldc:int(1978667103))
                        goto(Label_1191)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_6F0:int, ldc:int(1048576)), ldc:int(0))) {
                        var_3_6F0 = and:int(var_3_6F0:int, ldc:int(-2119731219))
                        goto(Label_1022)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_6F0:int, ldc:int(32768)), ldc:int(0))) {
                        goto(Label_0888)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_6F0:int, ldc:int(32768)), ldc:int(0))) {
                        var_3_6F0 = and:int(var_3_6F0:int, ldc:int(-95996501))
                        goto(Label_0747)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_6F0:int, ldc:int(16777216)), ldc:int(0))) {
                        goto(Label_0595)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_6F0:int, ldc:int(32768)), ldc:int(0))) {
                        var_3_6F0 = and:int(var_3_6F0:int, ldc:int(-803067075))
                        goto(Label_0420)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_6F0:int, ldc:int(2147483647)), ldc:int(0))) {
                        var_3_6F0 = and:int(var_3_6F0:int, ldc:int(1224337915))
                        var_17_6FB = add:int(var_16_119:int, xor:int(ldc:int(-32190), ldc:int(-32189)))
                        looporswitchbreak()
                    }
                    
                    var_3_6F0 = and:int(var_3_6F0:int, ldc:int(663288938))
                }
                
                var_3_6F0 = and:int(var_3_6F0:int, ldc:int(838329330))
                
                if (cmple:boolean(var_5_81 = var_17_6FB:int, sub:int(var_6_88:int, xor:int(ldc:int(12328), ldc:int(12329))))) {
                    loopcontinue()
                }
                
                looporswitchbreak()
            }
        }
        
        Label_0171:
        
        if (cmpne:boolean(and:int(var_3_6F0:int, ldc:int(256)), ldc:int(0))) {
            var_3_6F0 = and:int(var_3_6F0:int, ldc:int(-1254112668))
            goto(Label_0108)
        }
    }
}
